import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cw1GUI extends JFrame{
    private JPanel panel1;
    private JTextField TextFieldUserName;
    private JPasswordField TextFieldPassword;
    private JLabel UserNameResult;
    private JLabel PasswordResult;
    private JButton LoginButton;

    public static void main(String[] args) {
        cw1GUI setpanel = new cw1GUI();
        setpanel.setVisible(true);
    }

    public cw1GUI(){
        super("Username and Password");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = String.format(TextFieldUserName.getText());
                String password = String.format(TextFieldPassword.getText());
                UserNameResult.setText(String.valueOf(username));
                PasswordResult.setText(String.valueOf(password));
            }
        });
    }
}
