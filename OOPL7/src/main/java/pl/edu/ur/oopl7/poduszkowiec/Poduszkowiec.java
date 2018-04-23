/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.poduszkowiec;

/**
 *
 * @author rafineria123
 */
public class Poduszkowiec implements Wodne, Naziemne{

    @Override
    public void plywanie() {
        System.out.println("Plyne");
        
    }

    @Override
    public void jezdzenie() {
        System.out.println("Jade");
    }


    
}
