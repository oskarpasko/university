import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class cw extends JFrame{
    private JPanel panel1;
    private JTree tree1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton exitButton;
    private JButton opłaćKursButton;

    public static void main(String[] args) {
        cw setPanel = new cw();
        setPanel.setVisible(true);
    }

    public cw() {
        super("Wbór kursów!");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
    }

    private void createUIComponents() {
        // dodanie kursów w tree
        //root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy");
        //poziom1
        DefaultMutableTreeNode KProgramowanie = new DefaultMutableTreeNode("Programowanie");
        DefaultMutableTreeNode PK1 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode PK2 = new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode PK3 = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode PK4 = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode PK5 = new DefaultMutableTreeNode("ASP.NET");
        KProgramowanie.add(PK1);
        KProgramowanie.add(PK2);
        KProgramowanie.add(PK3);
        KProgramowanie.add(PK4);
        KProgramowanie.add(PK5);

        //poziom 2
        DefaultMutableTreeNode PGrafika = new DefaultMutableTreeNode("Grafika Komputerowa");
        DefaultMutableTreeNode PP1 = new DefaultMutableTreeNode("Adobe Photoshop");
        DefaultMutableTreeNode PP2 = new DefaultMutableTreeNode("Paint");
        DefaultMutableTreeNode PP3 = new DefaultMutableTreeNode("Krita");
        DefaultMutableTreeNode PP4 = new DefaultMutableTreeNode("AutoCAD");
        PGrafika.add(PP1);
        PGrafika.add(PP2);
        PGrafika.add(PP3);
        PGrafika.add(PP4);

        //dodanie do root
        root.add(KProgramowanie);
        root.add(PGrafika);

        //utworzenie tree i wstawienie swojego tree
        DefaultTreeModel treeModel = new DefaultTreeModel(root);

        tree1 = new JTree(treeModel);
    }
}
