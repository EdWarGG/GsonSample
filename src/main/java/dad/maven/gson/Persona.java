package dad.maven.gson;

import java.util.Scanner;


public class Persona {
	
	String nombre;
	String apellidos;
	int edad;
	
	public Persona() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca sus apellidos: ");
		apellidos = sc.nextLine();
		
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		
		System.out.println("Muchas gracias por introducir sus datos.");
		sc.close();
	}

}