package lecturaArchivos2;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import java.util.ArrayList;

public class PruebaLeerArchivoTexto {

    public static void main(String args[]) {
        
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        LeerArchivoTexto2 aplicacion2 = new LeerArchivoTexto2(); //Se implementa un nuevo objeto aplicacion2 para leer los datos del archivo2
        OperacionData operacion = new OperacionData(); //obtejo operacion tipo Operacion Data
        
        aplicacion.abrirArchivo(); //se dispone abrir el archivo y leer los registros
        ArrayList<Profesor> lista = aplicacion.leerRegistros();
        
        
        aplicacion2.abrirArchivo();
        ArrayList<Profesor> lista2 = aplicacion2.leerRegistros();
        
        //ciclo repetitivo para concatenar las dos listas en una sola
        for (int i = 0; i < lista2.size(); i++) {
            lista.add(lista2.get(i));
        }
        
        operacion.agregarInformacion(lista);
        // operacion.lecturaData();

        operacion.ordenarPorNombres(); //metodo para realizar el ordenamiento por nombre
        operacion.ordenarPorCanton(); //metodo para realizar el ordenamiento por canton
        operacion.contar_rasgo(); //conteo de personalidad
        operacion.contar_rasgo2(); //conteo de dictamen Idoneidad
        aplicacion.cerrarArchivo(); //se cierra el primer archivo
        aplicacion2.cerrarArchivo(); //se cierra el segundo archivo
        
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

