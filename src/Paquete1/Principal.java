package Paquete1;

import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	ManejoDeArchivo ar=new ManejoDeArchivo();
	
	TreeSet<Persona>lista=new TreeSet<Persona>();
	ar.recepcionarContenido(lista,"Personas.txt");
	
	
	ar.escribirArchivo("Resultado.txt", lista);
	
	
	ManejoDeArchivo er=new ManejoDeArchivo("Resultadwo.txt");
	
	System.out.println(ar.getArchivo().renameTo(er.getArchivo()));
	}
}

