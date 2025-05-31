package org.example.Ejercicios;

import java.io.Serializable;

public class TonyHawksProSk8r_Games implements Serializable {
    private String name;
    private transient String developer;
    private int releaseYear;
    private transient String platform;

    public TonyHawksProSk8r_Games(String name, String developer, int releaseYear, String platform) {
        this.name = name;
        this.developer = developer;
        this.releaseYear = releaseYear;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Game: " + name + ", Developer: " + developer + ", Release Year: " + releaseYear + ", Platform: " + platform;
    }
}
