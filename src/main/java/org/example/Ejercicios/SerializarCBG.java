package org.example.Ejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static java.lang.System.out;

public class SerializarCBG {

    public static void main(String[] args) {
        serializar();
    }

    public static void serializar(){
        CrashBandicoot_Games CB1 = new CrashBandicoot_Games("Crash Bandicoot", "Naughty Dog", 1996, "PlayStation");
        CrashBandicoot_Games CB2 = new CrashBandicoot_Games("Crash Bandicoot 2: Cortex Strikes Back", "Naughty Dog", 1997, "PlayStation");
        CrashBandicoot_Games CB3 = new CrashBandicoot_Games("Crash Bandicoot 3: Warped", "Naughty Dog", 1998, "PlayStation");
        CrashBandicoot_Games CB4 = new CrashBandicoot_Games("Crash Team Racing", "Naughty Dog", 1999, "PlayStation");
        CrashBandicoot_Games CB5 = new CrashBandicoot_Games("Crash Bash", "Eurocom", 2000, "PlayStation");
        CrashBandicoot_Games CB6 = new CrashBandicoot_Games("Crash Bandicoot: The Wrath of Cortex", "Traveller's Tales", 2001, "PlayStation 2");
        CrashBandicoot_Games CB7 = new CrashBandicoot_Games("Crash Bandicoot: The Huge Adventure", "Vicarious Visions", 2002, "Game Boy Advance");
        ArrayList<CrashBandicoot_Games> CBG = new ArrayList<>();

        CBG.add(CB1);
        CBG.add(CB2);
        CBG.add(CB3);
        CBG.add(CB4);
        CBG.add(CB5);
        CBG.add(CB6);
        CBG.add(CB7);

        SerializarCBG serializarCBG = new SerializarCBG();
        serializarCBG.serializar(CBG);

    }

    private void serializar(ArrayList<CrashBandicoot_Games> cbg) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/CBG.ser"));
            out.writeObject(cbg);
            out.close();
            System.out.println("Objeto serializado en CBG.ser");

        } catch (IOException e) {
            out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
