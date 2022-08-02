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
public class Movimiento {
    private int numero;
    private Date fecha;
    private List<DetalleMovimiento> detalles = new ArrayList<>();
    private Accion accion;

    public Movimiento(int numero, Date fecha, Accion accion) {
        this.numero = numero;
        this.fecha = fecha;
        this.accion = accion;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
}
