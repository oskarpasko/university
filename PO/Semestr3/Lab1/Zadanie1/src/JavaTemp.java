import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaTemp extends JFrame{
    private JPanel panel1;
    private JTextField CelsjuszTextField;
    private JButton obliczButton;
    private JLabel temp;
    private JLabel resultLabel;

    public static void main(String[] args) {
        JavaTemp javatemppanel = new JavaTemp();
        javatemppanel.setVisible(true);
    }

    public JavaTemp(){
        super("Celsjusze na Farenheity");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();

        obliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double celsjusz = Double.parseDouble(CelsjuszTextField.getText());
                    double farenheit = (celsjusz * 1.8) + 32;
                    resultLabel.setText(String.valueOf(farenheit));
            }
        });
    }

}
