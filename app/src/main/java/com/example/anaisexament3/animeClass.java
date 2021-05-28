package com.example.anaisexament3;

import android.graphics.drawable.Drawable;

public class animeClass {

    String nombre,descrip;
    Boolean state;

    public animeClass(String nombre, String descrip,  Boolean state) {
        this.nombre = nombre;
        this.descrip = descrip;
        this.state = state;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }


    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
