/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author David
 */

public class LeerArchivoTexto2 {
    
    private Scanner entrada;
    
    //se procede a abrir el archivo csv
    public void abrirArchivo(){
        try{
            entrada = new Scanner(new File("data/data1.csv")); //metodo para abrir el archivo colocando la direccion
        }catch(FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }
    }
    
    //lee los registros del archivo
    public ArrayList<Profesor> leerRegistros(){
        ArrayList<Profesor> lista2 = new ArrayList<>();
        
        try // lee registros del archivo, usando el objeto Scanner
        {
            //se realiza mientras no llegue a un salto de linea
            entrada.nextLine();
            while (entrada.hasNext()) {
                Profesor p = new Profesor(); //se crea un objeto tipo Profesor cada vez que ingrese al while
                String linea = entrada.nextLine();
                ArrayList<String> participantes = new ArrayList<String>(Arrays.asList(linea.split(","))); //se crea un objeto participantes tipo ArrayList
                //Se define que posicion del array debe ir a cada metodo de agregar...
                p.agregar_cedula(participantes.get(0));
                p.agregar_nombres(participantes.get(1));
                p.agregar_zona(participantes.get(2));
                p.agregar_provincia(participantes.get(3));
                p.agregar_canton(participantes.get(4));
                p.agregar_personalidad(participantes.get(5));
                p.agregar_razonamiento(participantes.get(6));
                p.agregar_dictamenIdoniedad(participantes.get(7));
                //con los datos tipo profesor, se añaden a la lista
                lista2.add(p);
                
            } // fin de while

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        
        //verificado
     
        return lista2;
    }
    //metodo para cerrar el archivo 2
    public void cerrarArchivo(){
        if(entrada != null){
            entrada.close();
        }
    }

   
    
    
}
