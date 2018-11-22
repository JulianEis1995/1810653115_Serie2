package Uebung2;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten
{
    public static void main(String[] args)
    {
        // Festlegen von Variablen
        int min = 1;
        int max = 10;

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

        if (zufallszahl % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist ungerade!");
        }

    }
}
