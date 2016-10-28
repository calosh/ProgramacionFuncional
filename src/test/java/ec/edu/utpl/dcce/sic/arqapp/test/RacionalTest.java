/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.dcce.sic.arqapp.test;

import ec.edu.utpl.dcce.sic.arqapp.racional.Racional;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorgaf
 */
public class RacionalTest {
    
    public RacionalTest() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void constructorTest(){
        Racional r = new Racional(3, 0);
    }
    
    @Test
    public void toStringTest() {
        Racional r = new Racional(1, 2);
        
        assertEquals("1/2 es el racional", r.toString(), "1/2"); 
    }
    
    @Test
    public void sumarTest() {
        Racional r = new Racional(1, 4);
        Racional r2 = new Racional(3, 4);
        
        assertEquals("1/4 + 3/4 debería tener numerador 1", r.sumar(r2).getNumerador(), 1);
        assertEquals("1/4 + 3/4 debería tener denominador 1", r.sumar(r2).getDenominador(), 1);        
    }
}

