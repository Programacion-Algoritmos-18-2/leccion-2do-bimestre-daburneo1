/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author reroes
 */
public class OperacionData {

    ArrayList<Profesor> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Profesor> info) {
        //informacion = new ArrayList<Profesor>(info.subList(1, 4));
        informacion = info;
    }

    public ArrayList<Profesor> obtenerInformacion() {
        return informacion;
    }
    
    /*
    public double obtenerPromedioCapacidad() {
        double suma = 0;
        return suma;
    }
    */
    
    // proceso de ordenar, a través del uso de Collections
    
    public void ordenarPorCanton(){
        ArrayList<Profesor> dataPorCantones = new ArrayList<>();
        dataPorCantones.addAll(informacion);
        Collections.sort(dataPorCantones, 
                        (o1, o2) -> o1.canton.compareTo(o2.canton));
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.println(dataPorCantones.get(i));
        }
    }
    
    public void ordenarPorNombres(){
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();
        dataPorNombres.addAll(informacion);
        Collections.sort(dataPorNombres, 
                        (o1, o2) -> o1.nombres.compareTo(o2.nombres));
        
        CrearArchivoTexto cat = new CrearArchivoTexto();//se crea un objeto para llamar al CrearArchivoTexto
        cat.abrirArchivoTexto(); //se llama al metodo abrir archivo
        cat.EscribirArchivoTexto(dataPorNombres); //se envia al metodo Escribir la lista ordenada
        cat.cerrarArchivo(); //finalmente se cierra el archivo
    }
    /*
    public void lecturaData() {
        for (int i = 0; i<obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));
            
        }
        
    }
    */
    //metodo para contar rasgo de personalidad 
    public void contar_rasgo(){
        //se implementan dos contadores para que realicen las sumas respectivas
        int i = 0;
        int j = 0;
        ArrayList<Profesor> datos = new ArrayList<>(); //se crea un arraylist
        datos.addAll(informacion);//se le dota de la informacion requerida
        
        for(int x = 0; x<datos.size(); x++){//se implementa un for para recorrer la lista
            //segun la condicion que cumpla se aumentaran los contadores respectivos
            if(datos.get(x).obtener_personalidad().equals("ADECUADO")){
                i = i + 1;
            }
            
            if(datos.get(x).obtener_personalidad().equals("POR CONVOCAR")){
                j = j + 1;
            }
        }
        //Se presenta en pantalla el resultado luego de terminar el for
        System.out.println("El numero de participantes con rasgo ADECUADO son: "+i);
        System.out.println("El numero de participantes con rasgo POR CONVOCAR son: "+j);
        
    }
    //metodo para contar dictamen Idoneidad
    public void contar_rasgo2(){
        //se implementan dos contadores para que realicen las sumas respectivas
        int i = 0;
        int j = 0;
        ArrayList<Profesor> datos = new ArrayList<>();//se crea un arraylist
        datos.addAll(informacion);//se le dota de la informacion requerida
        
        for(int x = 0; x < datos.size(); x++){//se implementa un for para recorrer la lista
            //segun la condicion que cumpla se aumentaran los contadores respectivos
            if (datos.get(x).obtener_dictamenIdoniedad().equals("IDONEO")){
                i = i + 1;
            }
            
            if (datos.get(x).obtener_dictamenIdoniedad().equals("NO IDONEO")){
                j = j + 1;
            }
        }
        //Se presenta en pantalla el resultado luego de terminar el for
        System.out.println("El numero de participantes con rasgo IDONEO son: "+i);
        System.out.println("El numero de participantes con rasgo NO IDONEO son: "+j);
    }
    
}
