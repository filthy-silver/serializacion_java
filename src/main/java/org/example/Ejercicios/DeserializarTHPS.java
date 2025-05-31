package org.example.Ejercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DeserializarTHPS {
    public static void main(String[] args) {
        deserializarTHPS();
    }

    private static void deserializarTHPS() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/THPSG.ser"));
            HashMap<String, TonyHawksProSk8r_Games> thps = (HashMap<String, TonyHawksProSk8r_Games>) in.readObject();
            in.close();
            System.out.println("Objetos Tony Hawk's Pro Skater leídos:");
            java.util.TreeMap<String, TonyHawksProSk8r_Games> sorted = new java.util.TreeMap<>(thps);
            for (String key : sorted.descendingKeySet()) {
                System.out.println(key + ": " + sorted.get(key));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo. Creando archivo con datos por defecto...");
            SerializarTHPSG.serializar();
            deserializarTHPS();
        } catch (IOException e) {
            System.out.println("Archivo vacío o dañado. Creando archivo con datos por defecto...");
            SerializarTHPSG.serializar();
            deserializarTHPS();
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error inesperado.");
            e.printStackTrace();
        }
    }
}