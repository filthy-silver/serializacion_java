package org.example.Ejercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializarCBG {
    public static void main(String[] args) {
       deserializarCBG();
    }

    public static void deserializarCBG() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/CBG.ser"));
            ArrayList<CrashBandicoot_Games> games = (ArrayList<CrashBandicoot_Games>) in.readObject();
            in.close();
            System.out.println("Objetos Crash Bandicoot Games leídos:");
            for (CrashBandicoot_Games game : games) {
                System.out.println(game);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
            SerializarCBG.serializar();
            deserializarCBG();
        } catch (IOException e) {
            System.out.println("Clase no encontrada.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error inesperado.");
            e.printStackTrace();
        }
    }
}
