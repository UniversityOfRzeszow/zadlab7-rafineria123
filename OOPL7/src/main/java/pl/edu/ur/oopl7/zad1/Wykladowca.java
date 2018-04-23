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
public class Wykladowca extends Osoba {

    private String Couczy;
    private String nrtelefon;
    private String stopien;

    public Wykladowca(String Couczy, String nrtelefon, String stopien, String imie, String nazwisko, String data_urodzenia, String plec) {
        super(imie, nazwisko, data_urodzenia, plec);
        this.Couczy = Couczy;
        this.nrtelefon = nrtelefon;
        this.stopien = stopien;
    }
    public String toString(){
        return "!Wykladowca!" + super.toString() + "\nCo Uczy: " + Couczy + "\nStopien: " + stopien + "\nTelefon: " + nrtelefon;
    }

    public String getCouczy() {
        return Couczy;
    }

    public void setCouczy(String Couczy) {
        this.Couczy = Couczy;
    }

    public String getNrtelefon() {
        return nrtelefon;
    }

    public void setNrtelefon(String nrtelefon) {
        this.nrtelefon = nrtelefon;
    }

    public String getStopien() {
        return stopien;
    }

    public void setStopien(String stopien) {
        this.stopien = stopien;
    }
    
}
