package org.example.Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;

public class SerializarTHPSG {

    public static void main(String[] args) {
        serializar();
    }

    public static void serializar() {
        TonyHawksProSk8r_Games THPSG1 = new TonyHawksProSk8r_Games("Tony Hawk's Pro Skater 1", "Neversoft", 1999, "PlayStation");
        TonyHawksProSk8r_Games THPSG2 = new TonyHawksProSk8r_Games("Tony Hawk's Pro Skater 2", "Neversoft", 2000, "PlayStation");
        TonyHawksProSk8r_Games THPSG3 = new TonyHawksProSk8r_Games("Tony Hawk's Pro Skater 3", "Neversoft", 2001, "PlayStation 2");
        TonyHawksProSk8r_Games THPSG4 = new TonyHawksProSk8r_Games("Tony Hawk's Pro Skater 4", "Neversoft", 2002, "PlayStation 2");
        TonyHawksProSk8r_Games THPSG5 = new TonyHawksProSk8r_Games("Tony Hawk's Pro Skater 5", "Robomodo", 2015, "PlayStation 3");
        TonyHawksProSk8r_Games THPSG6 = new TonyHawksProSk8r_Games("Tony Hawk's Pro Skater 1 + 2", "Activision", 2023, "PlayStation 5");

        HashMap<String, TonyHawksProSk8r_Games> THPSG = new HashMap<>();

        THPSG.put("92", THPSG1);
        THPSG.put("91", THPSG2);
        THPSG.put("97", THPSG3);
        THPSG.put("94", THPSG4);
        THPSG.put("32", THPSG5);
        THPSG.put("89", THPSG6);

        serializar(THPSG);
    }

    private static void serializar(HashMap<String, TonyHawksProSk8r_Games> thpsg) {
        try{
            java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(new java.io.FileOutputStream("src/main/resources/THPSG.ser"));
            out.writeObject(thpsg);
            out.close();
            System.out.println("Objeto serializado en THPSG.ser");
        } catch (java.io.IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
