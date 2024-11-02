/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recursos;

import java.util.List;

/**
 *
 * @author User
 */
public class Programa_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Recursos recursos = new Recursos();

       

        
        String POO = recursos.mensajeObjetos();
        System.out.println("Mensaje: " + POO);

       
        int edadEstudiante = 18; 
        String mensajeEdad = recursos.Edad(edadEstudiante);
        System.out.println("Edad: " + mensajeEdad);

        
        int respuesta = recursos.multiplicacion(8, 7); 
        System.out.println("Resultado Multiplicación: " + respuesta);

        
        int x = 5; 
        List<Integer> listaNumeros = recursos.lista(x);
        System.out.print("Lista de Números: " + listaNumeros);
    }
    
}
