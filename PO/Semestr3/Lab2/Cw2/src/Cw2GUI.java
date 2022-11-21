import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cw2GUI extends JFrame{
    private JPanel panel1;
    private JRadioButton linuxRadioButton;
    private JButton OKButton;
    private JRadioButton macintoshRadioButton;
    private JRadioButton windowsRadioButton;
    private JLabel ResultOS;
    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("linux.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("windows.png"));
    private ImageIcon iconMacintosh = new ImageIcon(getClass().getResource("apple.png"));

    public static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

    public static void main(String[] args) {
        Cw2GUI setPanel = new Cw2GUI();
        setPanel.setVisible(true);
    }

    public Cw2GUI(){
        super("Choose Operating System");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = "";
                if(linuxRadioButton.isSelected()) selectedOption = "Linux";
                if(windowsRadioButton.isSelected()) selectedOption = "Windows";
                if(macintoshRadioButton.isSelected()) selectedOption = "Macintosh";

                JOptionPane.showMessageDialog(Cw2GUI.this, "Wybrano: "+selectedOption);
            }
        });

        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()){
                    ResultOS.setIcon(resize(iconLinux, 120, 120));
                }
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected()) {
                    ResultOS.setIcon(resize(iconWindows, 120, 120));
                }
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macintoshRadioButton.isSelected()){
                    ResultOS.setIcon(resize(iconMacintosh, 120, 120));
                }
            }
        });
    }
}
