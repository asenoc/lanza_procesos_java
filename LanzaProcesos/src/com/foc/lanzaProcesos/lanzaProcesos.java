/**
 *
 */
package com.foc.lanzaProcesos;

import java.io.*;

/**
 * @author Guille
 *
 */
public class lanzaProcesos {
  

    /**
     * @param args
     */
    public static void main(String[] args) throws MiExcepcion{
        // TODO Auto-generated method stub

        //Declaro metodos de entrada.
        BufferedReader teclado=new BufferedReader (new InputStreamReader(System.in)); //metodo bufferedreader para capturar path y nombre de archivo          
       
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        
        
        char op = 0;

                                  
        try{//comienza bloque try /catch
            do
            {
            //Menu de seleccion
        System.out.println("*************************************************");
        System.out.println("*      Bienvenido al LANZADOR DE PROCESOS       ");
        System.out.println("*                                                ");
        System.out.println("* Elije la opcion que deses lanzar              ");
        System.out.println("*                                                ");
        System.out.println("* 1.- Notepad                                    ");
        System.out.println("* 2.- PING                                        ");
        System.out.println("* 3.- Lanza Explorer              ");
        System.out.println("* 4.- Lanza conexion FTP                                               ");
        System.out.println("* Pulse s para salir                       ");
        System.out.println("*                                                ");
        System.out.println("*************************************************");
        //metodo para capturar opcion del switch
        String n = teclado.readLine();
        op = n.charAt(0);
        
        switch (op)
        
        {
        //menu para lanzar notepad
        case '1':
        	
        	lanzaNote ln = new lanzaNote();
        	ln.main(args);
        	System.out.println("Proceso lanzado, pulse cualquier tecla para regresar al menu...");
        	teclado.readLine();
        	contador++;
        	break;
                                
                //menu para lanzar ping
        case '2':
        	lanzaPings lp = new lanzaPings();
        	lp.main(args);
        	System.out.println("Proceso lanzado, pulse cualquier tecla para regresar al menu...");
        	teclado.readLine();
        	contador2++;
            break;
            
            
            //menu para lanzar Internet Explorer
        case '3':
        	lanzaE e = new lanzaE();
        	e.main(args);
        	System.out.println("Proceso lanzado, pulse cualquier tecla para regresar al menu...");
        	teclado.readLine();
        	contador3++;
        	break;
       
        //menu para lanzar FTP
        case '4':
        	lanzaFTP ftp= new lanzaFTP();
        	ftp.main(args);
        	System.out.println("Proceso lanzado, pulse cualquier tecla para regresar al menu...");
        	teclado.readLine();
        	contador4++;
        break;          
        }
 
        }
            //Finaliza bucle do
            while (op != 's' );
            System.out.println(" Has ejecutado la opcion 1: " + contador + " veces.");
            System.out.println(" Has ejecutado la opcion 2: " + contador2 + " veces.");
            System.out.println(" Has ejecutado la opcion 3: " + contador3 + " veces.");
            System.out.println(" Has ejecutado la opcion 4: " + contador4 + " veces.");
            System.out.println(" Hasta la proxima!! ");
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