import javax.swing.*;

public class Cwiczenia extends JFrame{
    private JPanel panel1;

    public static void main(String[] args) {
        Cwiczenia panel = new Cwiczenia();
        panel.setVisible(true);
    }

    public Cwiczenia(){
        super("Confirm Password");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
    }
}
