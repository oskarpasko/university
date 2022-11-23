import javax.swing.*;

public class cw extends JFrame{
    private JPanel panel1;
    private JTree tree1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton exitButton;
    private JButton opłaćKursButton;

    public static void main(String[] args) {
        cw setPanel = new cw();
        setPanel.setVisible(true);
    }

    public cw() {
        super("Wbór kursów!");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
    }
}
