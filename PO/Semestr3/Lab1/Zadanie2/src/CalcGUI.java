import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JButton ilorazButton;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JButton iloczynButton;
    private JLabel resultLabel;

    public static void main(String[] args) {
        CalcGUI calculator = new CalcGUI();
        calculator.setVisible(true);
    }

    public CalcGUI(){
        super("Kalkulator");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(firstNumber.getText());
                double b = Double.parseDouble((secondNumber.getText()));
                double wynik = a + b;
                resultLabel.setText("Wynik = " + wynik);
            }
        });

        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(firstNumber.getText());
                double b = Double.parseDouble((secondNumber.getText()));
                double wynik = a - b;
                resultLabel.setText("Wynik = " + wynik);

            }
        });

        iloczynButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(firstNumber.getText());
                double b = Double.parseDouble((secondNumber.getText()));
                double wynik = a * b;
                resultLabel.setText("Wynik = " + wynik);

            }
        });

        ilorazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(firstNumber.getText());
                double b = Double.parseDouble((secondNumber.getText()));
                if(b == 0)
                {
                    JOptionPane.showMessageDialog(CalcGUI.this, "Nie dzielimy przez 0!");
                }else{
                    double wynik = a / b;
                    resultLabel.setText("Wynik = " + wynik);
                }

            }
        });
    }


}
