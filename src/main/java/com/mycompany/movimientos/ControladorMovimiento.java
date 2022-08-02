/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movimientos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Franco
 */
public class ControladorMovimiento {
    private List<Accion> acciones = new ArrayList<>();
    private List<Seccion> secciones = new ArrayList<>();
    private List<Movimiento> movimientos = new ArrayList<>();
    
    public ControladorMovimiento(){
        this.baseDatos();
    };
    public void baseDatos(){
        acciones.add(new Accion(1,"Ingreso"));
        acciones.add(new Accion(2,"Egreso"));
        
        secciones.add(new Seccion(1,"Agua"));
        secciones.add(new Seccion(2,"Gas"));
        
        movimientos.add(new Movimiento(1,new Date(2022,8,2),acciones.get(0)));
        movimientos.add(new Movimiento(2,new Date(2022,8,2),acciones.get(1)));
        
    };
    
    
    public String mostrarAccion(String numero){
        try {
            int numeroInt = Integer.parseInt(numero);
            for (Accion a:acciones){
                if (numeroInt == a.getID()){
                    return a.getNombre();
                }
            }   
        }
        catch (NumberFormatException ex){
            return "Ingreso un caracter no valido";
        }
        // ver si saco este return o el de arriba
        return "No se encontro esa accion";
    };
    
    public String mostrarSeccion(String numero){
        try {
            int numeroInt = Integer.parseInt(numero);
            for (Seccion s : secciones){
                if (numeroInt == s.getID()){
                    return s.getNombre();
                }
            }   
        }
        catch (NumberFormatException ex){
            return "Ingreso un caracter no valido";
        }
        // ver si saco este return o el de arriba
        return "No se encontro esa seccion";
    }
    
    public String buscarUltimoNumero(){
        int num=0;
        for (Movimiento m : movimientos){
            num = m.getNumero();
        }
        num +=1;
        return ""+num;
    }
    
}
