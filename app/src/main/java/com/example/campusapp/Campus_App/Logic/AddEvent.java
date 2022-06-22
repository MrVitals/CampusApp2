package com.example.campusapp.Campus_App.Logic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.campusapp.R;
import com.google.type.Date;

public class AddEvent extends AppCompatActivity {

    String name;
    String form;
    String von;
    String bis;
    String Rythm;
    Date DatumVon;
    Date DatumBis;

    public AddEvent(){

    }


    public void addEventsMethod(){



    }

    public AddEvent(String name, String form, String von, String bis, String rythm, Date datumVon, Date datumBis) {
        this.name = name;
        this.form = form;
        this.von = von;
        this.bis = bis;
        Rythm = rythm;
        DatumVon = datumVon;
        DatumBis = datumBis;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getVon() {
        return von;
    }

    public void setVon(String von) {
        this.von = von;
    }

    public String getBis() {
        return bis;
    }

    public void setBis(String bis) {
        this.bis = bis;
    }

    public String getRythm() {
        return Rythm;
    }

    public void setRythm(String rythm) {
        Rythm = rythm;
    }

    public Date getDatumVon() {
        return DatumVon;
    }

    public void setDatumVon(Date datumVon) {
        DatumVon = datumVon;
    }

    public Date getDatumBis() {
        return DatumBis;
    }

    public void setDatumBis(Date datumBis) {
        DatumBis = datumBis;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
        Button submitButton = (Button) findViewById(R.id.submit_ID);

                submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



            }
        });

    }


}

