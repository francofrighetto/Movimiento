/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movimientos;

/**
 *
 * @author Franco
 */
public class Seccion {
    private int id;
    private String nombre;
    
    public Seccion(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
}
