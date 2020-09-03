package com.livecron.modelo;

public class Perro {

    private boolean macho;
    private int edad;
    private char inicial;
    private EstaturaDelPerro tamanio;
    private String nombre;
    private float precio;
    private double precioPorPaquete;
    private String descripcion;
    private boolean estaDurmiendo;

    // modificador de accesso / El mismo nombre de la clase
    public Perro(String nombre, int edad, float precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.precio = precio;
    }
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMacho() {
        return macho;
    }

    public void setMacho(boolean macho1) {
        this.macho = macho1;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public EstaturaDelPerro getTamanio() {
        return tamanio;
    }

    public void setTamanio(EstaturaDelPerro tamanio) {
        if (!(tamanio == EstaturaDelPerro.LARGO
                && this.tamanio == EstaturaDelPerro.PEQUENIO)) {
            this.tamanio = tamanio;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getPrecioPorPaquete() {
        return precioPorPaquete;
    }

    public void setPrecioPorPaquete(double precioPorPaquete) {
        this.precioPorPaquete = precioPorPaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstaDurmiendo() {
        return estaDurmiendo;
    }

    public void setEstaDurmiendo(boolean estaDurmiendo) {
        this.estaDurmiendo = estaDurmiendo;
    }

    // public, protected, private,
    // modificador de accesso / tipo de retorno / el nombre del metodo / los parametros de entrada
    public boolean comer (Comida comida) {
        return false;
    }

    public String obtenerInformacionDeDormido() {
        // estaDumiendo = true y el tamanio es pequenio = false o la edad es mayor a 8 = true
        if ( estaDurmiendo && tamanio == EstaturaDelPerro.PEQUENIO
                || edad > 8 ) {
            return "El perro actualmente esta durmiendo";
        } else {
            return "El perro no esta durmiendo";
        }
    }

    // modificador de accesso / tipo de retorno / el nombre del metodo / los parametros de entrada
    public void correr () {
        System.out.println("Correr");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "macho=" + macho +
                ", edad=" + edad +
                ", inicial=" + inicial +
                ", tamanio=" + tamanio +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", precioPorPaquete=" + precioPorPaquete +
                ", descripcion='" + descripcion + '\'' +
                ", estaDurmiendo=" + estaDurmiendo +
                '}';
    }
}
