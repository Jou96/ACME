package manejoarchivos;

import java.io.*;
import java.util.Arrays;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado informacion al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();

            String[] vectorSeparador = lectura.split("\\,");

            String posicionInicial = vectorSeparador[0];

            String[] separadorPrimerVector = posicionInicial.split("=");
            System.out.println("posicion 0 del primer vector: " + separadorPrimerVector[1]);
            for (int i = 1; i < vectorSeparador.length; i++) {
                System.out.println(vectorSeparador[i]);
            }

            while (lectura != null) {
                System.out.println("lectura " + lectura);
                lectura = entrada.readLine();
                if (lectura == null) {
                    System.out.println("Sin mas registros");
                } else {
                    String[] vectorSeparador_segundoRegistro = lectura.split("\\,");

                    String posicionInicial_segundoRegistro = vectorSeparador_segundoRegistro[0];

                    String[] separadorSegundoVector = posicionInicial_segundoRegistro.split("=");
                    System.out.println("posicion 0 del segundo vector: " + separadorSegundoVector[1]);
                    for (int i = 1; i < vectorSeparador_segundoRegistro.length; i++) {
                        System.out.println(vectorSeparador_segundoRegistro[i]);
                    }
                    int contador = 0;
                    for (int i = 0; i <= 4; i++) {

                        for (int j = 0; j <= 2; j++) {

                            if (vectorSeparador[i].equals(vectorSeparador_segundoRegistro[j]) && separadorPrimerVector[1].equals(separadorSegundoVector[1])) {
                                contador++;
                                System.out.println("ASTRID-RENE tienen el mismo horario en  " + vectorSeparador[i] + " y " + separadorPrimerVector[1] + "contador: " + (contador + 1));

                            }
                            if (vectorSeparador[i].equals(vectorSeparador_segundoRegistro[j])) {
                                contador++;
                                System.out.println("ASTRID-RENE tienen el mismo horario en  " + vectorSeparador[i] + "contador : " + (contador));

                            }

                        }

                    }

                }

            }

            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
