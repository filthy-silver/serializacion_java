package org.example.Ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializarCBG {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/CBG.ser"));
            ArrayList<CrashBandicoot_Games> games = (ArrayList<CrashBandicoot_Games>) in.readObject();
            in.close();
            System.out.println("Objetos Crash Bandicoot Games leídos:");
            for (CrashBandicoot_Games game : games) {
                System.out.println(game);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
