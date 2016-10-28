/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.dcce.sic.arqapp.racional.controllers;

import ec.edu.utpl.dcce.sic.arqapp.racional.Racional;

/**
 *
 * @author jorgaf
 */
public class TestRacional {

    public static void main(String[] args) {
        Racional r = new Racional(2, 4);
        Racional r2 = new Racional(2, 4);
        
        System.out.println(r);
        System.out.println(r2);
        
        System.out.println(r.sumar(r2));
        System.out.println(r.restar(r2));
        
        System.out.println(r.obtenerMayor(r2));
        System.out.println(r.esMenorQue(r2));
    }

}
