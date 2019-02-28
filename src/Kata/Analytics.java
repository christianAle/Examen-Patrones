package Kata;

import java.util.Arrays;

public class Analytics {
  
	public static String [] masLarga(String palabra) 
	{
		
		String[] palabras;
		
		String plarga = null ;
        palabras = palabra.split(",");   	
		

        	
        if(palabras[0].length() < palabras[1].length()) {
    		plarga = palabras[1];         		
    	}else {
    		plarga =palabras[0]; 
    	}
        
     
       
		
        String [] larga  = new String [] {plarga};

	    
        Arrays.sort(larga);
	    
		return larga ;
	}
	
	
	
	public static String [] masCorta(String palabra) 
	{
		
		String[] palabras;
		
		String plarga = null ;
        palabras = palabra.split(",");	
		
        if(palabras[0].length() < palabras[1].length()) 
    	{
    		plarga = palabras[0];         		
    	}else {
    		plarga=palabras[1]; 
    	}
        
        
		
        String [] larga  = new String [] {plarga};
	  
		return larga ;
	}
	
	
	public static String [] ordenar(String []palabras) 
	
	{      
		  String newPalabras = null;
		  String orderWords  [];
	     
	     orderWords= newPalabras.split(",");
	     
	     Arrays.sort(orderWords);
	     
	    return orderWords;
	}
	public static String [] primeraMasLarga(String palabra)
	{
	String[] palabras;
		
		String plarga = null ;
        palabras = palabra.split(",");   	
		        	      
        if (palabras[0].length() == palabras[1].length()) 
        {
        	
    		plarga = palabras[0];         		

        }
     		
        String [] larga  = new String [] {plarga};

	    
        Arrays.sort(larga);
	    
		return larga ;
		
	}
 
}
