package com.example;

public class Saltador implements Atleta {
    private String nombre;
    private String colorDePiel;

    public Saltador(String nombre,String colorDePiel) {
        this.nombre = nombre;
        this.colorDePiel = colorDePiel;
    }

    @Override
    public int realizarCompetencia() {

        return 100;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color de piel: " + colorDePiel);
        System.out.println("Realizó un salto de " + realizarCompetencia() + " metros");

    }

}
