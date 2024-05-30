package com.example.ArraysDemo;

/**
 * Hello world!
 *
 */
public class App 
{
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
    	}
    	
        /* COMO SE DECLARA UN ARRAYS- 
          int [] numeros; con los corchetes avisamos de que es un cojunto de valores enteros, 
          NO SOLO UNO, sino mas de uno. UN ARRAYS
          
         */
    
    
    	
    	/* para acceder a los valores comienzan por 0.*/
    	/* se añaden valores, primeramente reservando memoria para los elementos en RAM*/
    	
    	/* CON EL CONSTRUCTOR NEW*/
    	    // int [] numeros;	
    //	numeros = new int [10];
    	//numeros [0] = 1; /* el elemento 0 es el valor, el 1 es el indice que le doy*/
    //	numeros [1] = 2;
    	
    	/* y asi hasta el indice 9*/
    	
    	
    	
    	//-------- segunda manera de declarar arrays-------
    	
    	
    		int [] numeros = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    		
    		String [] nombres = {"Tamara", "Adrian", "Carlos", "Luis", "Ivan", "Maria Jose", "Rosa"};
    	
    	/* Para motrar por consola los valores*/
    		/*Utlizando una funcion pintln mostrar cada elemento del arrays*/
    		
    		/*VARIANTE 1*/
    		
    		
    		System.out.println(nombres [0]);
    		System.out.println(nombres[1]);
    		
    		
    		/* VARIANTE 2*, con sistema de control de flujo que recorra el arrays- 
    		 * lo vemo en la rama "sentenciasDeControlDeFlujos"*/
    		
    	    		
    		/*Con una sentencia FOR de toda la vida. y tambien con un FOR mejorado - for each- */
    		
    		
    		for(int index =0; index<nombres.length;index++) 
    			if (nombres [index].length()>4) {
    				 System.out.println(nombres[index]);
    			}	
    		/* que diferencia hay entre utilizar 
    		 * i++ autoincremento o ++i autodecremento- 
    		 * si van solo en una sentencia entonces el resultado es el mismo, 
    		 * pero si van con otras variables */
    		
    		/* si quiero mostrar solo los elementos con indice par*/
    		for(int index=0; index <numeros.length; index++)
    		{if (index % 2 == 0)
    			System.out.println("el elemento de indice" +index +", es par");}
    		
    }
}
