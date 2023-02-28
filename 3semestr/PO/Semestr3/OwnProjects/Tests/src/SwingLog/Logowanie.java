package SwingLog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Logowanie extends JFrame{
    private JPanel panel1;
    public JTextField textField1;
    private JButton button1;
    public JTextField textField2;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";


    public static void main(String[] args) {
        Logowanie panel = new Logowanie();
        panel.setVisible(true);
    }

    public Logowanie(){
        super("Logowanie");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass = textField1.getText();
                String login = textField2.getText();

                try {
                    Connection connection = (Connection) DriverManager.getConnection(DB_URL,
                            "root", "rootroot");

                    PreparedStatement st = (PreparedStatement) connection
                            .prepareStatement("Select * from test.test where login=? and password=?");

                    st.setString(1, login);
                    st.setString(2, pass);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        // Działania po odnalezieniu usera z podanym loginem i hasłem
                        MainPage mp = new MainPage(rs.getString("id"));
                        dispose();
                        mp.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(Logowanie.this, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
    }
}
