package Uebung2;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Zahlenraten
{
    public static void main(String[] args)
    {
        // Festlegen von Variablen
        int min = 1;
        int max = 10;
        // Vergleich zwischen int und String nicht möglich


        /*
          Erzeugung eines neuen Objekts rnd der Klasse Random
          rnd = Name der neu erzeugten Klasse
          new -> generiert eine neue Instanz der Klasse Random und weist sie der Variable rnd zu
        */
        Random rnd = new Random();
        /*
          Erstellung der Variable zufallszahl und Aufruf der Methode nextInt
          Gibt eine Zahl aus zwischen 1 und 10 aus
          nextInt: zwischen 0 und 9
          + min im Nachhinein -> für Zahl zwischen 1 und 10
        */
        int zufallszahl = rnd.nextInt(max - min +1) + min;

        /*
        if (zufallszahl % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist ungerade!");
        }
        */
        int zahl;
        for (zahl=0; zahl <4; zahl ++)
        {
            int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl zwischen 1 und 10 eingeben"));
            if (zufallszahl == eingabe)
            {
                JOptionPane.showMessageDialog(null, "Die Eingabe ist korrekt");
                break;
            }
            else if (eingabe == zufallszahl + 2 || eingabe == zufallszahl + 1 || eingabe == zufallszahl - 1 || eingabe == zufallszahl - 2)
            {
                JOptionPane.showMessageDialog(null, "Knapp dran");
            }
            else
                {
                JOptionPane.showMessageDialog(null, "Die Eingabe ist nicht korrekt");
            }
        }
        if (zahl == 3)
        {
            JOptionPane.showMessageDialog(null, "Du hast die Zahl nicht erraten!");
        }

    }
}
