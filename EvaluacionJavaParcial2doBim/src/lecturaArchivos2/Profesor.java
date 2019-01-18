/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

/**
 *
 * @author reroes
 */
/*
{"cedula":"1803742806","nombres":"MULLO ROMERO ESTHER DEL CARMEN", 
"zona":"ZONA 3","provincia":"TUNGURAHUA", 
"canton":"AMBATO", "personalidad": "POR CONVOCAR", 
"razonamiento":"POR CONVOCAR", 
"dictamenIdoniedad":"NO IDONEO"}
*/

public class Profesor {
    String cedula;
    String nombres;
    String zona;
    String provincia;
    String canton;
    String personalidad;
    String razonamiento;
    String dictamenIdoniedad;
    
    //se añaden los metodos agregar y obtener
    public void agregar_cedula(String c){
        cedula = c;
    }
    
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_zona(String z){
        zona = z;
    }
    
    public void agregar_provincia(String p){
        provincia = p;
    }
    
    public void agregar_canton(String can){
        canton = can;
    }
    
    public void agregar_personalidad(String pers){
        personalidad = pers;
    }
    
    public void agregar_razonamiento(String raz){
        razonamiento = raz;
    }
    
    public void agregar_dictamenIdoniedad(String dct){
        dictamenIdoniedad = dct;
    }
    
    public String obtener_cedula(){
        return cedula;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_zona(){
        return zona;
    }
    
    public String obtener_provincia(){
        return provincia;
    }
    
    public String obtener_canton(){
        return canton;
    }
    
    public String obtener_personalidad(){
        return personalidad;
    }
    
    public String obtener_razonamiento(){
        return razonamiento;
    }
    
    public String obtener_dictamenIdoniedad(){
        return dictamenIdoniedad;
    }
    
    //Se implementa el toString para presentar
    public String toString(){
        return String.format("Cedula: %s - Nombre: %s - Zona: %s - Provincia: %s - Canton: %s - Personalidad: %s - Razonamiento: %s - Dictamen Idoneidad: %s \n", obtener_cedula(), obtener_nombres(), obtener_zona(), obtener_provincia(), obtener_canton(), obtener_personalidad(), obtener_razonamiento(), obtener_dictamenIdoniedad());
    }

    
}







