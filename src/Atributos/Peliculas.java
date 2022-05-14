/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class Peliculas {
    private Scanner leer;
    private String Titulos;
    private String Director;
    private Integer Duracion;
    
    public Peliculas() {
        this.leer = new Scanner(System.in);
    }
    public Peliculas(String Titulos, String Director, Integer Duracion) {
        this.Titulos = Titulos;
        this.Director = Director;
        this.Duracion = Duracion;
    }
    public void setTitulos(String Titulos) {
        this.Titulos = Titulos;
    }
    public void setDirector(String Director) {
        this.Director = Director;
    }
    public void setDuracion(Integer Duracion) {
        this.Duracion = Duracion;
    }
    public String getTitulos() {
        return Titulos;
    }
    public String getDirector() {
        return Director;
    }
    public Integer getDuracion() {
        return Duracion;
    }
    public Peliculas Crear() {
        System.out.println("<<<<< CARGAR PELICULAS >>>>>");
        System.out.print("Titulo: ");
        Titulos = leer.next();
        System.out.print("Director: ");
        Director = leer.next();
        System.out.print("Duracion: ");
        Duracion = leer.nextInt();
        double D = (double) Duracion;
        return new Peliculas (Titulos, Director, Duracion);
    }
    @Override
    public String toString() {
        return "Pelicula{"+"Titulo= "+Titulos+",Director= "+Director+",Duracion= "+Duracion+'}';
    }
}
