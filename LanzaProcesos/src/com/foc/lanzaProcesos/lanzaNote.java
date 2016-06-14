/**
 * 
 */
package com.foc.lanzaProcesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fasby
 *
 */
public class lanzaNote {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //Declaro metodos de entrada.
        BufferedReader teclado=new BufferedReader (new InputStreamReader(System.in)); //metodo bufferedreader para capturar path y nombre de archivo
       
        //declaro variables
        String sPath;
        String sBarra = "/";
        String sNameFile;
		
        try {
        
        System.out.println("****Ha elejido abrir notepad****");
        System.out.print("Ingrese la ruta donde esta el archivo que desea abrir (por ejemplo c:)" );//imprime pro pantalla
        sPath = teclado.readLine(); //captura path
        System.out.print("Ingrese el nombre del archivo con su extension");//imprime pro pantalla
        sNameFile = teclado.readLine(); // captura el nombre del archivo
        File f=new File(sPath+sBarra+sNameFile); //carga el path + la barra + el nombre del archivo
        System.out.println("Archivo abierto" + f);//imprime por pantalla
       
        //Try para excepcion en el proceso de abrir notepad
        

        try {
            Runtime.getRuntime().exec("notepad.exe " + f); //ejecuta notepad
      
            }

            catch (Exception e)
            {
                System.out.println("Error al abrir notepad"+ e.getMessage());
            }
        }
        //Bloques qeu capturan excepcion del TRY principal
        catch( IOException e ){
         System.out.println( "Se ha producido el siguiente Error del tipo IO" + e );
         }
         catch( Exception ex ){
         System.out.println( "Se ha producido el siguiente Error del tipo Exception" + ex );
         }
	}

}
