package Paquete1;

import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 ManejoDeArchivo ar=new ManejoDeArchivo();
	
	TreeSet<Persona>lista=new TreeSet<Persona>();
	ar.recepcionarContenido(lista,"Personas.txt");
	
	for (Persona persona : lista) {
		System.out.println(persona.toString());
	}
		
	}

}
