/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

/**
 *
 * @author Miguel
 */
public class Animal {
    private String nombre;
    private String imagenMiniatura;
    private String imagenGrande;

    public Animal(String nombre, String imagenMiniatura, String imagenGrande) {
        this.nombre = nombre;
        this.imagenMiniatura = imagenMiniatura;
        this.imagenGrande = imagenGrande;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagenMiniatura() {
        return imagenMiniatura;
    }

    public void setImagenMiniatura(String imagenMiniatura) {
        this.imagenMiniatura = imagenMiniatura;
    }

    public String getImagenGrande() {
        return imagenGrande;
    }

    public void setImagenGrande(String imagenGrande) {
        this.imagenGrande = imagenGrande;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    
}