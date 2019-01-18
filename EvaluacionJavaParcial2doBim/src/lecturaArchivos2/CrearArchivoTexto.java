/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter; //uso de la clase formatter para escribir datos en un archivo de texto
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class CrearArchivoTexto {
    
    private Formatter salida; //objeto para enviar texto al archivo
    
    //metodo para abrir el archivo
    public void abrirArchivoTexto(){
        
        try{
            salida = new Formatter("data/data3.csv"); //se crea el archivo en la carpeta data con el nombre de data3.csv
        }catch ( SecurityException securityException ){
            System.err.println("No tiene acceso de escritura a este archivo." );
            System.exit( 1 );
        }catch ( FileNotFoundException filesNotFoundException ){
            System.err.println( "Error al crear el archivo." );
            System.exit( 1 );
      }
   }
    
    //metodo que servira para añadir datos al archivo
    public void EscribirArchivoTexto(ArrayList<Profesor> data){
       
       for (int i = 0; i < data.size(); i++) {//for para recorrer cada posicion

            //se escriben los nuevos datos llamado a cada metodo correspondiente
            salida.format("Cedula: %s - Nombre: %s - Zona: %s - Provincia: %s - Canton: %s - Personalidad: %s - Razonamiento: %s - Dictamen Idoniedad: %s \n", data.get(i).obtener_cedula(), data.get(i).obtener_nombres(), data.get(i).obtener_zona(), data.get(i).obtener_provincia(), data.get(i).obtener_canton(), data.get(i).obtener_personalidad(), data.get(i).obtener_razonamiento(), data.get(i).obtener_dictamenIdoniedad());
       }
   }
   
    //se cierra el archivo
   public void cerrarArchivo() {
        if (salida != null) {
            salida.close(); // cierra el archivo
        }
    }
}
