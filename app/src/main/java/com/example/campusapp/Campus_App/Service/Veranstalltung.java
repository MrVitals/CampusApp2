package com.example.campusapp.Campus_App.Service;

public class Veranstalltung {

    String name;
    String form;
    int von;
    int bis;
    String rhythm;
    String datumVon;
    String datumBis;
    String raum;

    public Veranstalltung(String name, String form, int von, int bis, String rhythm, String datumVon, String datumBis, String raum) {
        this.name = name;
        this.form = form;
        this.von = von;
        this.bis = bis;
        this.rhythm = rhythm;
        this.datumVon = datumVon;
        this.datumBis = datumBis;
        this.raum = raum;
    }



    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getVon() {
        return von;
    }

    public void setVon(int von) {
        this.von = von;
    }

    public int getBis() {
        return bis;
    }

    public void setBis(int bis) {
        this.bis = bis;
    }

    public String getRhythm() {
        return rhythm;
    }

    public void setRhythm(String rhythm) {
        this.rhythm = rhythm;
    }

    public String getDatumVon() {
        return datumVon;
    }

    public void setDatumVon(String datumVon) {
        this.datumVon = datumVon;
    }

    public String getDatumBis() {
        return datumBis;
    }

    public void setDatumBis(String datumBis) {
        this.datumBis = datumBis;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }


}
