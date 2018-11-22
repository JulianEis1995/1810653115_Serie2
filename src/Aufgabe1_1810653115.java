import javax.swing.*;

public class Aufgabe1_1810653115
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Name eingeben");
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben"));

        if (alter > 18)
        {
            JOptionPane.showMessageDialog( null,"Die Person ist volljährig!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Die Person ist nicht volljährig!");
        }
    }
}
