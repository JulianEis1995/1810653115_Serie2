import javax.swing.*;

public class Aufgabe1_1810653115
{
    public static void main(String[] args)
    {
        /* zwei Variablen werden mithilfe von JOptionPane eingegeben
           für int muss String in int gewandelt werden -> Integer.parseInt */
        String name = JOptionPane.showInputDialog("Name eingeben");
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben"));

        // Schleife, die überprüft ob Alter über oder unter 18 ist
        if (alter >= 18)
        {
            /* parentComponent: Legt fest auf welcher Ebene, das Dialogfeld angezeigt wird
               Null = ganz vorne; -1 ganz unten
               messsage: Zeigt die Nachricht an
             */
            JOptionPane.showMessageDialog( null,"Die Person ist volljährig!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Die Person ist nicht volljährig!");
        }
    }
}
