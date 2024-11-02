package com.example;

public class Corredor implements Atleta {

    private String nombre;

    public Corredor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int realizarCompetencia() {
        return 5; 

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Resultado de la competencia: " + realizarCompetencia());

    }

}
