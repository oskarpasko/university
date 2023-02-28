import javax.swing.*;

public class JList extends JFrame{
    private JPanel panel1;
    private javax.swing.JList list1;
    private JButton button1;
    private JButton button2;

    public static void main(String[] args) {
        JList panel = new JList();
        panel.setVisible(true);
    }

    public JList(){
        super("Confirm Password");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
    }

    //JListe wrzucic do JScrollPane aby lista była scrollowana
}
