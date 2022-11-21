import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cw3GUI extends JFrame{
    private JPanel panel1;
    private JButton OKButton;
    private JCheckBox JavaCheckBox;
    private JCheckBox CSharpCheckBox;
    private JCheckBox CPlusPlusCheckBox;
    private JCheckBox PythonCheckBox;

    public static void main(String[] args) {
        Cw3GUI setPanel = new Cw3GUI();
        setPanel.setVisible(true);
    }

    public Cw3GUI(){
        super("Wbór kursów!");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.pack();

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double value = 0;
                String message = "---------------- \n Razem: ";

                if(PythonCheckBox.isSelected()){
                    value += 5000;
                    message = "Python #price 5000PLN\n" + message;
                }

                if(CPlusPlusCheckBox.isSelected()){
                    value += 4000;
                    message = "C++ #price 4000PLN\n" + message;
                }

                if(CSharpCheckBox.isSelected()){
                    value += 3000;
                    message = "C# #price 3000PN\n" + message;
                }

                if(JavaCheckBox.isSelected()){
                    value += 3500;
                    message = "Java #price 3500PLN\n" + message;
                }

                JOptionPane.showMessageDialog(Cw3GUI.this, message + value + "PLN");
            }
        });
    }
}
