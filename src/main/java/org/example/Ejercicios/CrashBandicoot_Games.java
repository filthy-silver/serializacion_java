package org.example.Ejercicios;

public class CrashBandicoot_Games implements java.io.Serializable {
    private String name;
    private String developer;
    private int releaseYear;
    private String platform;

    public CrashBandicoot_Games(String name, String developer, int releaseYear, String platform) {
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
