import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComBox extends JFrame{
    private JPanel panel1;
    private JComboBox comboBox1;
    private JLabel label1;

    public static void main(String[] args) {
        ComBox panel = new ComBox();
        panel.setVisible(true);
    }

    public ComBox(){
        super("ComBox");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);

        //II Sposób
        createItemComboBox();

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String day = "Wybrano: " + comboBox1.getItemAt(comboBox1.getSelectedIndex());

                label1.setText(day);
            }
        });
    }

    private void createItemComboBox(){
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"", "Poniedziałek", "Wtorek"}));
    }
}
