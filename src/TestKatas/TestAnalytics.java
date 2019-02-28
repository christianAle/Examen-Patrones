package TestKatas;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Kata.Analytics;

public class TestAnalytics {
 
	@Test
	public void TestMaslarga() 
	{
		String palabra1 ="Hello,Christian";
		String palabra2 ="Hello,Christian,world";

		String solucion  [];
		String solucion2 [];

		String[] esperado= new String[]{"Christian"}; ;
		String[] esperado2= new String[]{"Hello,world"}; ;

		
		solucion = Analytics.masLarga(palabra1);

	    assertArrayEquals(esperado, solucion);

	}
	
	
	@Test
	public void TestMasCorta() 
	{
		String palabra1 ="Hello,Christian";
		
		String palabra2 ="Hello,Christian,world";
		String solucion  [];
		
		String solucion2 [];
		
		String[] esperado= new String[]{"Hello"}; 
		String[] esperado2= new String[]{"Hello,world"}; ;
		
		solucion = Analytics.masCorta(palabra1);
		//solucion2 = Analytics.masCorta(palabra2);
		
	    assertArrayEquals(esperado, solucion);
	   // assertArrayEquals(esperado2, solucion2);
	    
	}
	
	@Test
	public void TestPrimeraMasLarga() 
	{
		
		String palabra ="Hello,world";
		
		
		String solucion [];
		
		String[] esperado= new String[]{"Hello"}; ;
		
		solucion = Analytics.primeraMasLarga(palabra);
		
	    assertArrayEquals(esperado, solucion);
	    
	}

}
