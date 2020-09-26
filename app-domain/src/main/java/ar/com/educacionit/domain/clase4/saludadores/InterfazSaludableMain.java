package ar.com.educacionit.domain.clase4.saludadores;

public class InterfazSaludableMain {

	public static void main(String[] args) {
	
		Espanol espanol = new Espanol();
		Ingles ingles = new Ingles();
		Aleman aleman = new Aleman("Pachu");
		Chino chino = new Chino();
		/*
		espanol.saludar();
		ingles.saludar();
		aleman.saludar();
		chino.saludar();
		*/
		
		ISaludable[] saludadores = new ISaludable[4];
		
		saludadores[0] = espanol;
		saludadores[1] = ingles;
		saludadores[2] = aleman;
		saludadores[3] = chino;
		
		for(ISaludable saludador : saludadores) {
			saludador.saludar();
			
			if(saludador instanceof Persona) {
				Persona persona = (Persona) saludador;
				System.out.println(persona.getNombre());
			}
				saludador.saludar();
		}
	}

}
