package com.rdc.recyclerviewfragmentnavigationcomponent;

public class Museo { // Clase para crear un objeto de cada museo con sus atributos
                     // para meterlo luego en el ArrayList<Museo>

    private int image;
    private CharSequence ubicacion;
    private CharSequence nombre;

    public Museo(CharSequence ubicacion, CharSequence nombre, int image) {

        this.image = image;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public CharSequence getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(CharSequence ubicacion) {
        this.ubicacion = ubicacion;
    }

    public CharSequence getNombre() {
        return nombre;
    }

    public void setNombre(CharSequence nombre) {
        this.nombre = nombre;
    }
}
