package Uebung2;

import javax.swing.*;
import java.util.Random;

public class Aufgabe5_1810653115
{
    public static void main(String[] args)
    {

        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min +1) + min;

        int versuche = 2;
        int zahl = 0;
        do
        {
            int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl zwischen 1 und 10 eingeben"));
            if (zufallszahl == eingabe)
            {
                JOptionPane.showMessageDialog(null, "Die Eingabe ist korrekt");
                break;
            }
            //Alternative: (zufallszahl - eingabe) >= -2 && (zufallszahl - eingabe) <= 2
            else if (eingabe <= zufallszahl-2 && eingabe >= zufallszahl+2)
            {
                JOptionPane.showMessageDialog(null, "Knapp dran!");
            }
            else if (eingabe < 1 || eingabe > 10)
            {
                JOptionPane.showMessageDialog(null, "Die Zahl befindet sich außerhalb des Bereichs!");
            }
            else if (zahl == 3)
            {
                JOptionPane.showMessageDialog(null, "Die Zufallszahl lautet: " + zufallszahl);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Die Eingabe ist nicht korrekt! Verbleinde Versuche: " + versuche);
            }
            zahl++;
            versuche--;
        } while (zahl <= 3);

        /*
        FOR: kopfgesteuerte Schleife - zum durchlaufen von Zählern
        WHILE: kopfgesteuerte Schleife - hinterfragen den Status einer Bedingung
        DO-WHILE: Fußgesteuerte Schleife - einmal durchlaufen und dann Bedingung überprüfen

         */
    }
}