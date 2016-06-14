/**
 * 
 */
package com.foc.lanzaProcesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fasby
 *
 */
public class lanzaFTP {

	/**
	 * @param args
	 */
	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
	        //Declaro metodos de entrada.
	        BufferedReader teclado=new BufferedReader (new InputStreamReader(System.in)); //metodo bufferedreader para capturar path y nombre de archivo
	       
	        //declaro variables
	        String sWeb;
	        
        System.out.println("****Va a lanzar el FTP****");
        System.out.println("*** Introduzca direccion de FTP");
        sWeb = teclado.readLine(); // captura el host
        
        //Try para excepcion al ejecutar el comando
        try {
        
        Runtime.getRuntime().exec("cmd /c start ftp " + sWeb ); //ejecuta la url capturada por teclado
            }

        catch (Exception e)
            {
        	System.out.println("Error al abrir FTP" + e.getMessage());
            }

	}
        //Bloques que capturan excepcion del TRY principal
        catch( IOException e ){
         System.out.println( "Se ha producido el siguiente Error del tipo IO" + e );
         }
         catch( Exception ex ){
         System.out.println( "Se ha producido el siguiente Error del tipo Exception" + ex );
         }	
}
}
