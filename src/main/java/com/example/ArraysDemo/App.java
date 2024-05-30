package com.example.ArraysDemo;

import java.sql.Array;

/**
 * Hello world!
 *
 */
public class App 
{
    private static int ARRAY_SIZE;
   
	public static void main( String[] args )
    {
    	
    	/* MANEJO DE LOS ARGUMENTOS - que recibe el metodo main cuando se ejecuta, 
    	 * porque la app cuando se ejecuta recibe como parametro una arrays de agumentos 
    	 * de tipo string.
    	 * Primero hay que comprobar que la app esta recibiendo los argumentos esperados.
    	 * 
    	 * */
    	
    	if (args.length == 0)
    		{System.out.println("no se han recibido los argumentos esperados");}
    	else if (args.length !=3)
    		{System.out.println("no se han recibido 3 argumentos");}
    	else {
    		System.out.println("se han recibido los siguientes argumentos");
    	for (String argumento:args)
    		System.out.println(argumento);
    	
    	ARRAY_SIZE = Integer.parseInt (args[1]);
    	System.out.println("el tamaño del array es : " + ARRAY_SIZE);
    	}
    	
        
    }
}
