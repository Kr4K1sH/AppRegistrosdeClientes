package validadorFormatos;

import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * Clase que expone un conjunto de m�todos para validar el
 * contenido de hileras de caracteres y determinar si dichos
 * valores son estrictamente el tipo especific� seg�n el que
 * evalu� el m�todo.
 * @author Ing. Alexander Ag�ero Castillo
 * @version 1.2
 * @since Enero 2015
 */
public class ValidadorFormatos {
    //Atributos a nivel de la clase
    private static String mensajeError;

    /**
     * Validar si un hilera es formato n�merica entera
     * @param pValor Hilera a evaluar
     * @return True si el contenido de la hilera es tipo entera
     */
    public static boolean validarEntero(String pValor) {
        boolean vResultado = false;
        int vValor = 0;

        try {
            mensajeError = "";
            vValor = Integer.parseInt(pValor);
            vResultado = true;
        } catch (Exception e) {
            mensajeError = e.toString();
        }
        return vResultado;
    }

    /**
     * Validar si un hilera es formato n�merica double
     * @param pValor Hilera a evaluar
     * @return True si el contenido de la hilera es tipo double
     */
    public static boolean validarDouble(String pValor) {
        boolean vResultado = false;
        double vValor = 0d;

        try {
            mensajeError = "";
            vValor = Double.parseDouble(pValor);
            vResultado = true;
        } catch (Exception e) {
            mensajeError = e.toString();
        }
        return vResultado;
    }

    /**
     * Validar si un hilera es formato n�merica float
     * @param pValor Hilera a evaluar
     * @return True si el contenido de la hilera es tipo float
     */
    public static boolean validarFloat(String pValor) {
        boolean vResultado = false;
        double vValor = 0f;

        try {
            mensajeError = "";
            vValor = Float.parseFloat(pValor);
            vResultado = true;
        } catch (Exception e) {
            mensajeError = e.toString();
        }
        return vResultado;
    }

    /**
     * Validar si un hilera es formato fecha --> dd/MM/yyyy
     * @param pValor Hilera a evaluar
     * @return True si el contenido de la hilera es tipo fecha
     */
    public static boolean validarFecha(String pValor) {
        SimpleDateFormat vFechaFormato = new SimpleDateFormat("dd/MM/yyyy");
        boolean vResultado = false;
        Date vFecha;

        try {
            mensajeError = "";
            
            //Tomar el valor del jTxtValor y asignarlo a la variable tipo fecha con la mascara indicada
            vFecha = vFechaFormato.parse( pValor );
            
            //Hacer una comparaci�n del tipo de dato almacenado en la variable Date vFecha
            //Ya que si la misma es incorrecta va almacenar otra fecha.
            //Por ejemplo 30/02/2017 el vFechaFormato.parse(pValor) = 02/03/2017
            //Siendo una fecha invalida. 
            //Si la fecha la convierte y es correcta, al obtener el format de la fecha almacenada en vFecha
            //por medio del "parse" deber�an ser iguala en la siguiente comparaci�n
            if ( vFechaFormato.format(vFecha).equals(pValor) ){
                vResultado = true;  
            }
        } catch (Exception e) {
            mensajeError = e.toString();
        }
        return vResultado;
    }

    /**
     * Validar si un hilera es formato fecha + hora --> dd/MM/yyyy HH:mm
     * @param pValor Hilera a evaluar
     * @return True si el contenido de la hilera es tipo fecha + hora
     */
    public static boolean validarFechaHora(String pValor) {
        SimpleDateFormat vFechaFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        boolean vResultado = false;
        Date vFecha;

        try {
            mensajeError = "";            
            //Tomar el valor del jTxtValor y asignarlo a la variable tipo fecha con la mascara indicada
            vFecha = vFechaFormato.parse( pValor );
            
            //Hacer una comparaci�n del tipo de dato almacenado en la variable Date vFecha
            //Ya que si la misma es incorrecta va almacenar otra fecha.
            //Por ejemplo 30/02/2017 el vFechaFormato.parse(pValor) = 02/03/2017
            //Siendo una fecha invalida. 
            //Si la fecha la convierte y es correcta, al obtener el format de la fecha almacenada en vFecha
            //por medio del "parse" deber�an ser iguala en la siguiente comparaci�n
            if ( vFechaFormato.format(vFecha).equals(pValor) ){
                vResultado = true;  
            }
        } catch (Exception e) {
            mensajeError = e.toString();
        }
        return vResultado;
    }

    /**
     * Validar si un hilera es formato fecha + hora:segundos --> dd/MM/yyyy HH:mm:ss
     * @param pValor Hilera a evaluar
     * @return True si el contenido de la hilera es tipo fecha + hora:segundos
     */
    public static boolean validarFechaHoraSegundos(String pValor) {
        SimpleDateFormat vFechaFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        boolean vResultado = false;
        Date vFecha;

        try {
            mensajeError = "";            
            //Tomar el valor del jTxtValor y asignarlo a la variable tipo fecha con la mascara indicada
            vFecha = vFechaFormato.parse( pValor );
            
            //Hacer una comparaci�n del tipo de dato almacenado en la variable Date vFecha
            //Ya que si la misma es incorrecta va almacenar otra fecha.
            //Por ejemplo 30/02/2017 el vFechaFormato.parse(pValor) = 02/03/2017
            //Siendo una fecha invalida. 
            //Si la fecha la convierte y es correcta, al obtener el format de la fecha almacenada en vFecha
            //por medio del "parse" deber�an ser iguala en la siguiente comparaci�n
            if ( vFechaFormato.format(vFecha).equals(pValor) ){
                vResultado = true;  
            }
        } catch (Exception e) {
            mensajeError = e.toString();
        }
        return vResultado;
    }
    
    /**
     * Validar si un hilera est� vac�a
     * @param pValor Hilera a evaluar
     * @return True si el contenido de la hilera est� vaci�
     */    
    public static boolean validarVacio(String pValor){
        boolean vResultado = false;
        
        if (pValor.trim().length()<=0){
            vResultado = true;
        }
                
        return vResultado;
    }
    
    /**
     * Retornar el �ltimo mensaje de error ocurrido en la clase
     * @return Mensaje del error
     */
    public static String getMensajeError(){
        return mensajeError;
    }    
}
