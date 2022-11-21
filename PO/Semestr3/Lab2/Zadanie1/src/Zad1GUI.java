import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad1GUI extends JFrame{
    private JTextField enterPassTextField;
    private JPanel panel1;
    private JButton OKButton;
    private JTextField confirmPassTextField;

    public static void main(String[] args) {
        Zad1GUI setPanel = new Zad1GUI();
        setPanel.setVisible(true);
    }

    public Zad1GUI(){
        super("Confirm Password");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterPassword = String.format(enterPassTextField.getText()).strip();
                String confirmPassword = String.format(confirmPassTextField.getText()).strip();
                String password = "codejava";
                password = password.strip();


                if((enterPassword.equals(password)) && (confirmPassword.equals(password)))
                    JOptionPane.showMessageDialog(Zad1GUI.this, "Congratulations! You entered correct password.");
                if(!enterPassword.equals(confirmPassword))
                    JOptionPane.showMessageDialog(Zad1GUI.this, "Passwords are not matched!");
                if((enterPassword.equals(confirmPassword)) && (!enterPassword.equals(password) && !confirmPassword.equals(password)))
                    JOptionPane.showMessageDialog(Zad1GUI.this, "Wrong Password!");
            }
        });
    }

}
