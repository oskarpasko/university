import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabela extends JFrame{
    private JPanel panel1;
    private JTable table1;

    public static void main(String[] args) {
        Tabela panel = new Tabela();
        panel.setVisible(true);
    }

    public Tabela(){
        super("Tabela");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);

        createTable();
    }

    private void createTable(){
        Object[][] data = {
                {"Gra 1", "Developer", "RPG", 5.0},
                {"Gra 2", "Developer3", "JRPG", 4.0},
                {"Gra 3", "Developer4", "MOBA", 3.0},
                {"Gra 4", "Developer", "FPS", 2.5},
                {"Gra 5", "Developer5", "FPS", 2.5}
        };

        String[] naglowek = {"Tytul", "Developer", "Genre", "Ocena"};

        table1.setModel(new DefaultTableModel(data, naglowek));

        //Pamiętać aby wrzucić Tabele w JScrollPane XDXDXDX
    }
}
