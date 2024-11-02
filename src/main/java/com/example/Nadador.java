package com.example;

public class Nadador implements Atleta {
    private String nombre;
    private double estatura;

    public Nadador(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    @Override
    public int realizarCompetencia() {
        int resultado = (int) (Math.random() * 100) + 1;
        System.out.println("El nadador ha realizado una competencia con un resultado de: " + resultado + "%");
        return resultado;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Información del nadador:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Estatura: " + estatura + " m");


    }

}
