package SwingLog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class Logowanie extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;

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
                        MainPage mp = new MainPage();

                        File file = new File("zalogowany.txt");

                        // Zapis do pliku
                        try {
                            BufferedWriter myWriter = new BufferedWriter(new FileWriter("zalogowany.txt", true));
                            myWriter.write(rs.getString("login"));
                            myWriter.newLine();
                            myWriter.write(rs.getString("password"));
                            myWriter.close();
                        } catch (IOException f) {
                            System.out.println("An error occurred.");
                            f.printStackTrace();
                        }
                        mp.setVisible(true);
                        dispose();
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
