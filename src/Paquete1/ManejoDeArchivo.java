package Paquete1;

import java.io. *;
import java.util.TreeSet;

public class ManejoDeArchivo {

	
	private File archivo;
	private FileReader fr;
	private BufferedReader leer;
	

	public ManejoDeArchivo()
	{
		
	}

	public File getArchivo() {
		return archivo;
	}


	public void setArchivo(String ruta) {
		this.archivo = new File(ruta);
	}
	
	public void leerArchivo(String ruta)
	{
		setArchivo(ruta);
		
		if(archivo.exists())
		{
			try {
				fr=new FileReader(ruta);
				leer=new BufferedReader(fr);
				
				while(leer.ready())
				{
					System.out.println(leer.readLine());
				}
				
				leer.close();
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("No existe");
		}
	}
	
	public void recepcionarContenido(TreeSet<Persona> listaPersonas,String ruta)
	{
			
		setArchivo(ruta);
		String linea;
		String[] palabra;
		if(archivo.exists())
		{
			try {
				fr=new FileReader(ruta);
				leer=new BufferedReader(fr);
				
				linea=leer.readLine();
				
				while(!linea.isEmpty())
				{
			        palabra=linea.split("-");
			        if(Persona.validarDni(palabra[2]))
			        {
						listaPersonas.add(new Persona(palabra[0], palabra[1],palabra[2]));
			        }
					linea=leer.readLine();
				}
				
				leer.close();
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("El archivo no se encontro");
		}
		
	
	
	}
	
	
	
}
