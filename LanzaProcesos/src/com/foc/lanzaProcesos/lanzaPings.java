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
public class lanzaPings {

	/**
	 * @param args
	 * @throws MiExcepcion 
	 */
	public void main(String[] args) throws MiExcepcion {
		// TODO Auto-generated method stub
		try {
        //Declaro metodos de entrada.
        BufferedReader teclado=new BufferedReader (new InputStreamReader(System.in)); //metodo bufferedreader para capturar path y nombre de archivo
       
        //declaro variables
        String sIp;
        int iNp;
        int iTp;
        
    	//Inicio Bloque Try para el lanzador de Pings
    	try{
        System.out.println("****Va a lanzar un Ping****");
        System.out.println("Introduzca direccion IP");
        sIp = teclado.readLine(); // captura la ip
        System.out.println("Introduzca numero de pings ");
        iNp = Integer.parseInt(teclado.readLine()); // captura el numero de pings
        if (iNp > 1000)
            throw new MiExcepcion("Superado numero pings");
        System.out.println("Introduzca tamaño de los pings ");
        iTp = Integer.parseInt(teclado.readLine());// captura el tamaño de los pings
        if (iTp > 1400)
            throw new MiExcepcion("Superado tamaño");
        Runtime.getRuntime().exec("cmd /c start ping " + sIp + " -n " + iNp + " -l " + iTp);//Lanza el pingo con la ip, numero de ping y tamaño de lso pings 
        }
    	//Fin del bloque try para el lanzador de pings, capturamso el error y mostramos un mensaje personalizado para mejor comprension del usuario.
    	catch (MiExcepcion nombre)//captura excepción personalizada
        {
            System.out.println("El numero de Pings no puede superar los 1000, ni su tamaño los 1400");
        	System.out.println("Pulse cualquier tecla para continuar...");
        	teclado.readLine();
        }
    	catch(Exception e){
            	System.out.println("Error!!");
            	System.out.println("El Numero de Pings y el Tamaño de los Pings solo admiten valores numericos");
            	System.out.println("Pulse cualquier tecla para continuar...");
            	teclado.readLine();
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
