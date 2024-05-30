package com.example.ArraysDemo;

import java.sql.Array;
/* Actividad del Jueves 30 de Mayo
Ejercicio # 1.
Modificar el proyecto ArraysDemo para que reciba 4 argumentos y el cuarto sea un valor de tipo double para
asignarlo a una variable static de tipo double en la clase que contiene el metodo main.
Mostrar el valor de la variable que a la cual le hemos asignado el argumento.*/
/**
 * Hello world!
 *
 */
public class App 
{
    private static int ARRAY_SIZE;
    private static double CUARTO_ARGUMENTO;
    private static String nombre;
    
	public static void main( String[] args )
	
    {
    	
		if (args.length == 0)
    		{System.out.println("no se han recibido los argumentos esperados");}
    	else if (args.length !=4)
    		{System.out.println("no se han recibido 3 argumentos");}
    	else {
    		System.out.println("se han recibido los siguientes argumentos");
    	for (String argumento:args)
    		System.out.println(argumento);
    	
    	System.out.println("....");
    	ARRAY_SIZE = Integer.parseInt (args[1]);
    	System.out.println("mostrar el valor de la variable args[1]:");
    	System.out.println(ARRAY_SIZE);
    	System.out.println("....");
    	CUARTO_ARGUMENTO = Double.parseDouble(args[3]);
    	System.out.println(CUARTO_ARGUMENTO);
    	}
    	
        
    }
}
