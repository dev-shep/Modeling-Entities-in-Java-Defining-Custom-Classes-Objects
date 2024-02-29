package Modeling;

import java.util.*;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String someString = new String("Hello world");
		System.out.println("someString "+ someString);
		
		String anotherString = new String("Another object of type string");
		System.out.println("Another string"+ anotherString);
		
		System.out.println();
		
		Date someDate = new Date();
		System.out.println("Prueba de fecha "+ someDate);
		
		Date anotherDate = new Date();
		System.out.println("Prueba de fecha 2 "+ anotherDate);
		
		System.out.println();
		
		Random random = new Random();
		System.out.println("Random 1:" +random);
		
		Random anotherRandom = new Random();
		System.out.println("Random 1:" +anotherRandom);
		
		System.out.println();
		
		Object object = new Object();
		System.out.println("object 1:" + object);
		
		Object anotherObject = new Object();
		System.out.println("object :" + anotherObject);
		
		System.out.println();
		
	}

}
