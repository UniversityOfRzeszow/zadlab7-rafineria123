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
public class Student extends Osoba {

    private int nr_indeks;
    private String typ_studiow;
    private String kierunek;
    private int rok_studiow;

    public Student(int nr_indeks, String typ_studiow, String kierunek, int rok_studiow, String imie, String nazwisko, String data_urodzenia, String plec) {
        super(imie, nazwisko, data_urodzenia, plec);
        this.nr_indeks = nr_indeks;
        this.typ_studiow = typ_studiow;
        this.kierunek = kierunek;
        this.rok_studiow = rok_studiow;
    }

    @Override
    public String toString() {
        return "!Student!" + super.toString() + "\nNumer indeksu: " + nr_indeks + "\nTyp studiow: " + typ_studiow + "\nKierunek: " + kierunek + "\nRok studiow: " + rok_studiow + "\n\n";
    }

    public int getNr_indeks() {
        return nr_indeks;
    }

    public void setNr_indeks(int nr_indeks) {
        this.nr_indeks = nr_indeks;
    }

    public String getTyp_studiow() {
        return typ_studiow;
    }

    public void setTyp_studiow(String typ_studiow) {
        this.typ_studiow = typ_studiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }

}
