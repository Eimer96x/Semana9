package com.example;

public class Main {
    public static void main(String[] args) {
        Corredor C1 = new Corredor("Santi");
        C1.mostrarInformacion();

        Nadador N1 = new Nadador("Jef", 1.83);
        N1.realizarCompetencia();
        N1.mostrarInformacion();

        Saltador S1 = new Saltador("Albert", "Blanca");
        S1.realizarCompetencia();
        S1.mostrarInformacion();

    }
}