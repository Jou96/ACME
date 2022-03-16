package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //      crearArchivo(nombreArchivo);
        //anexarArchivo(nombreArchivo, "ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00");
        leerArchivo(nombreArchivo);

    }
}
