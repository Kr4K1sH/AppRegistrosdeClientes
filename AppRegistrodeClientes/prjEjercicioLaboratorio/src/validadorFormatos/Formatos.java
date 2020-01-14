package validadorFormatos;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * Clase que expone un conjunto de m�todos para aplicar formatos n�mericos a
 * hileras de caracteres y valores n�mericos. Dichas hileras formateadas
 * pueden se utilizados en objeto gr�ficos de entradas de usuario
 * @author Ing. Alexander Ag�ero Castillo
 * @version 1.3
 * @since Enero 2015
 */
public class Formatos {

    /**
     * Aplicar formato num�rico tipo entero a una hilera con separadores
     * Formato ###,###,###,##0
     * @param pHilera Hilera a aplicar formato 
     * @return Hilera con formato
     */
    public static String conFormatoEntero(String pHilera){
        String vResultado = "";

        //Crear instancia que permite definir los caracteres de separaci�n decimal y de
        //miles a valores n�mericos en el objeto DecimalFormat
        DecimalFormatSymbols caracteresSeparadoresDecimal = new DecimalFormatSymbols();
        caracteresSeparadoresDecimal.setDecimalSeparator('.');
        caracteresSeparadoresDecimal.setGroupingSeparator(',');
        
        DecimalFormat formatoNumero = new DecimalFormat("###,###,###,##0", caracteresSeparadoresDecimal);
        
        //Validar que el contenido sea de tipo Entero
        if (ValidadorFormatos.validarEntero(pHilera)){
            vResultado = formatoNumero.format(Integer.parseInt(pHilera));
        }else{
            //Si el contenido no es n�merico debe limpiar
            vResultado = "";
        }
        
        return vResultado;
    }

    /**
     * Aplicar formato num�rico tipo entero a una hilera con separadores
     * Formato ###,###,###,##0
     * @param pValor Valor Integer a aplicar formato 
     * @return Hilera con formato
     */
    public static String conFormatoEntero(Integer pValor){
        String vResultado = "";

        //Crear instancia que permite definir los caracteres de separaci�n decimal y de
        //miles a valores n�mericos en el objeto DecimalFormat
        DecimalFormatSymbols caracteresSeparadoresDecimal = new DecimalFormatSymbols();
        caracteresSeparadoresDecimal.setDecimalSeparator('.');
        caracteresSeparadoresDecimal.setGroupingSeparator(',');
        
        DecimalFormat formatoNumero = new DecimalFormat("###,###,###,##0", caracteresSeparadoresDecimal);
        
        vResultado = formatoNumero.format(pValor);
        
        return vResultado;
    }
    
    /**
     * Aplicar formato num�rico tipo entero a una hilera sin separadores
     * Formato ###########0
     * @param pHilera Hilera a aplicar formato 
     * @return Hilera con formato
     */
    public static String sinFormatoEntero(String pHilera){
        String vResultado = "";

        //Crear instancia que permite definir los caracteres de separaci�n decimal y de
        //miles a valores n�mericos en el objeto DecimalFormat
        DecimalFormatSymbols caracteresSeparadoresDecimal = new DecimalFormatSymbols();
        caracteresSeparadoresDecimal.setDecimalSeparator('.');
        caracteresSeparadoresDecimal.setGroupingSeparator(',');
        
        DecimalFormat formatoNumero = new DecimalFormat("###########0", caracteresSeparadoresDecimal);
        
        //Quitar el separador num�rico de la hilera antes de hacer la 
        //Conversi�n del tipo del dato
        vResultado = quitarSeparadorNumerico(pHilera);

        //Validar que el contenido sea de tipo Entero
        if (ValidadorFormatos.validarEntero(vResultado)){
            vResultado = formatoNumero.format(Integer.parseInt(vResultado));
        }else{
            //Si el contenido no es n�merico debe limpiar
            vResultado = "";
        }
        
        return vResultado;
    }

    /**
     * Aplicar formato num�rico tipo entero a una hilera sin separadores
     * Formato ###########0
     * @param pValor Valor Integer a aplicar formato 
     * @return Hilera con formato
     */
    public static String sinFormatoEntero(Integer pValor){
        String vResultado = "";

        //Crear instancia que permite definir los caracteres de separaci�n decimal y de
        //miles a valores n�mericos en el objeto DecimalFormat
        DecimalFormatSymbols caracteresSeparadoresDecimal = new DecimalFormatSymbols();
        caracteresSeparadoresDecimal.setDecimalSeparator('.');
        caracteresSeparadoresDecimal.setGroupingSeparator(',');
        
        DecimalFormat formatoNumero = new DecimalFormat("###########0", caracteresSeparadoresDecimal);
        
        vResultado = formatoNumero.format(pValor);
        
        return vResultado;
    }

    /**
     * Aplicar formato num�rico tipo punto flotante a una hilera con separadores
     * Formato ###,###,###,##0.00
     * @param pHilera Hilera a aplicar formato 
     * @return Hilera con formato
     */
    public static String conFormatoPuntoFlotante(String pHilera){
        String vResultado = "";
        
        //Crear instancia que permite definir los caracteres de separaci�n decimal y de
        //miles a valores n�mericos en el objeto DecimalFormat
        DecimalFormatSymbols caracteresSeparadoresDecimal = new DecimalFormatSymbols();
        caracteresSeparadoresDecimal.setDecimalSeparator('.');
        caracteresSeparadoresDecimal.setGroupingSeparator(',');
        
        DecimalFormat formatoNumero = new DecimalFormat("###,###,###,##0.00", caracteresSeparadoresDecimal);
        
        //Validar que el contenido sea de tipo Double
        if (ValidadorFormatos.validarDouble(pHilera)){
            vResultado = formatoNumero.format( Double.parseDouble(pHilera) );
        }else{
            //Si el contenido no es n�merico debe limpiar
            vResultado = "";
        }
        
        return vResultado;
    }

    /**
     * Aplicar formato num�rico tipo punto flotante a una hilera con separadores
     * Formato ###,###,###,##0.00
     * @param pValor Valor Double a aplicar formato 
     * @return Hilera con formato
     */
    public static String conFormatoPuntoFlotante(Double pValor){
        String vResultado = "";
        
        //Crear instancia que permite definir los caracteres de separaci�n decimal y de
        //miles a valores n�mericos en el objeto DecimalFormat
        DecimalFormatSymbols caracteresSeparadoresDecimal = new DecimalFormatSymbols();
        caracteresSeparadoresDecimal.setDecimalSeparator('.');
        caracteresSeparadoresDecimal.setGroupingSeparator(',');
        
        DecimalFormat formatoNumero = new DecimalFormat("###,###,###,##0.00", caracteresSeparadoresDecimal);
        
        vResultado = formatoNumero.format( pValor );
        
        return vResultado;
    }
    
    /**
     * Aplicar formato num�rico tipo punto flotante a una hilera sin separadores
     * Formato ###########0.00
     * @param pHilera Hilera a aplicar formato 
     * @return Hilera con formato
     */
    public static String sinFormatoPuntoFlotante(String pHilera){
        String vResultado = "";

        //Crear instancia que permite definir los caracteres de separaci�n decimal y de
        //miles a valores n�mericos en el objeto DecimalFormat
        DecimalFormatSymbols caracteresSeparadoresDecimal = new DecimalFormatSymbols();
        caracteresSeparadoresDecimal.setDecimalSeparator('.');
        caracteresSeparadoresDecimal.setGroupingSeparator(',');
        
        DecimalFormat formatoNumero = new DecimalFormat("###########0.00", caracteresSeparadoresDecimal);

        //Quitar el separador num�rico de la hilera antes de hacer la 
        //Conversi�n del tipo del dato
        vResultado = quitarSeparadorNumerico(pHilera);

        //Validar que el contenido sea de tipo Double
        if (ValidadorFormatos.validarDouble(vResultado)){
            vResultado = formatoNumero.format( Double.parseDouble(vResultado) );
        }else{
            //Si el contenido no es n�merico debe limpiar
            vResultado = "";
        }
        
        return vResultado;
    }

    /**
     * Aplicar formato num�rico tipo punto flotante a una hilera sin separadores
     * Formato ###########0.00
     * @param pValor Valor Double a aplicar formato 
     * @return Hilera con formato
     */
    public static String sinFormatoPuntoFlotante(Double pValor){
        String vResultado = "";

        //Crear instancia que permite definir los caracteres de separaci�n decimal y de
        //miles a valores n�mericos en el objeto DecimalFormat
        DecimalFormatSymbols caracteresSeparadoresDecimal = new DecimalFormatSymbols();
        caracteresSeparadoresDecimal.setDecimalSeparator('.');
        caracteresSeparadoresDecimal.setGroupingSeparator(',');
        
        DecimalFormat formatoNumero = new DecimalFormat("###########0.00", caracteresSeparadoresDecimal);

        vResultado = formatoNumero.format( pValor );

        return vResultado;
    }
    
    /**
     * Aplicar formato tipo Date dd/MM/yyyy
     * @param pFechaOrigen Hilera a convertir en Fecha al formato indicado
     * @return Fecha en formato dd/MM/yyyy
     */
    public static String conFormatoFecha(String pFechaOrigen) {
        SimpleDateFormat vFechaFormato = new SimpleDateFormat("dd/MM/yyyy");
        String vResultado = "";
        Date vFecha;

        try {           
            //Tomar el valor del jTxtValor y asignarlo a la variable tipo fecha con la mascara indicada
            vFecha = vFechaFormato.parse( pFechaOrigen );
            
            //Hacer una comparaci�n del tipo de dato almacenado en la variable Date vFecha
            //Ya que si la misma es incorrecta va almacenar otra fecha.
            //Por ejemplo 30/02/2017 el vFechaFormato.parse(pValor) = 02/03/2017
            //Siendo una fecha invalida. 
            //Si la fecha la convierte y es correcta, al obtener el format de la fecha almacenada en vFecha
            //por medio del "parse" deber�an ser iguala en la siguiente comparaci�n
            if ( vFechaFormato.format(vFecha).equals(pFechaOrigen) ){
                vResultado = vFechaFormato.format(vFecha);  
            }
        } catch (Exception e) {        
            vResultado = e.toString();
        }
        return vResultado;
    }

    /**
     * Aplicar formato tipo Date dd/MM/yyyy hh:mm:ss aaa
     * aaa --> Formato AM/PM
     * @param pFechaOrigen Hilera a convertir en Fecha al formato indicado
     * @return Fecha en formato dd/MM/yyyy
     */
    public static String conFormatoFechaHoraMinutosSegundos(String pFechaOrigen) {
        SimpleDateFormat vFechaFormato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
        String vResultado = "";
        Date vFecha;

        try {           
            //Tomar el valor del jTxtValor y asignarlo a la variable tipo fecha con la mascara indicada
            vFecha = vFechaFormato.parse( pFechaOrigen );
            
            //Hacer una comparaci�n del tipo de dato almacenado en la variable Date vFecha
            //Ya que si la misma es incorrecta va almacenar otra fecha.
            //Por ejemplo 30/02/2017 el vFechaFormato.parse(pValor) = 02/03/2017
            //Siendo una fecha invalida. 
            //Si la fecha la convierte y es correcta, al obtener el format de la fecha almacenada en vFecha
            //por medio del "parse" deber�an ser iguala en la siguiente comparaci�n
            if ( vFechaFormato.format(vFecha).equals(pFechaOrigen) ){
                vResultado = vFechaFormato.format(vFecha);  
            }
        } catch (Exception e) {        
            vResultado = e.toString();
        }
        return vResultado;
    }

    /**
     * Aplicar formato tipo Date dd/MM/yyyy
     * @param pFechaOrigen Date a convertir en Fecha al formato indicado
     * @return Fecha en formato dd/MM/yyyy
     */
    public static String conFormatoFecha(Date pFechaOrigen) {
        SimpleDateFormat vFechaFormato = new SimpleDateFormat("dd/MM/yyyy");
        String vResultado = "";

        vResultado = vFechaFormato.format(pFechaOrigen);  

        return vResultado;
    }
        
    /**
     * Aplicar formato tipo Date dd/MM/yyyy  aaa
     * aaa --> Formato AM/PM
     * @param pFechaOrigen Date a convertir en Fecha al formato indicado
     * @return Fecha en formato dd/MM/yyyy
     */
    public static String conFormatoFechaHoraMinutosSegundos(Date pFechaOrigen) {
        SimpleDateFormat vFechaFormato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
        String vResultado = "";

        vResultado = vFechaFormato.format(pFechaOrigen);  

        return vResultado;
    }

    /**
     * Quitar el caracter de separador num�rico en una hilera
     * @param pHilera Hilera a quitar el separador num�rico
     * @return Hilera sin el separador num�rico
     */
    public static String quitarSeparadorNumerico(String pHilera){
        String vHilera = "";
        
        vHilera = pHilera.replace(",", "");
        
        return vHilera;
    }
}
