package Paquete1;

import java.util.Objects;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private String apellido;
	private String dni;
	
	public Persona()
	{
		
	}
	
	public Persona(String dni)
	{
		
		this.dni=dni;
	}
	
	public Persona(String nombre,String apellido,String dni)
	{
		this.dni=dni;	
		this.nombre=nombre;
		this.apellido=apellido;
			
	}

	
	public static boolean validarDni(String dni)
	{
		try {
			verificarDniValido(dni);
			return true;
		} catch (DniInvalido e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false;
		}
		
	}
	
	public static void verificarDniValido(String dni) throws DniInvalido
	{
	
			if(!dni.matches("[0-9]*"))
			{
				throw new DniInvalido();
			}	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		if(o.getDni()==this.dni)
		{
			return 0;
		}
		else {
			return this.getApellido().compareTo(o.apellido);
		}

		
	}
	
	public void separaFrase(String frase)
	{
		String palabra[]=frase.split("-");
		
		this.nombre=palabra[0];
		this.apellido=palabra[1];
		this.dni=palabra[2];
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}
	

}
