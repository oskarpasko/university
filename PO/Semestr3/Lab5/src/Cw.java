import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cw extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JList list2;
    private JList list3;
    private JButton button1;
    private JTextField infoTextField;
    private JButton button2;
    private JButton button3;

    public static void main(String[] args) {
        Cw setPanel = new Cw();
        setPanel.setVisible(true);
    }


    public Cw() {
        super("Wbór kursów!");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                add okno = new add();
                okno.setVisible(true);
            }
        });
    }
}
