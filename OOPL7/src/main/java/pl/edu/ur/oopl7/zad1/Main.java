/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad1;

/**
 *
 * @author rafineria123
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student stud = new Student(3, "Zaoczne", "Informatyka", 2013, "Rafal", "Sudol", "13 Marzec", "Mezczyzna");
        Wykladowca wykl = new Wykladowca("Analiza", "973322123", "Doktor", "Rafal", "Sudol","13 Marzec", "Mezczyzna");
        System.out.println(stud);
        System.out.println(wykl);
    }

}
