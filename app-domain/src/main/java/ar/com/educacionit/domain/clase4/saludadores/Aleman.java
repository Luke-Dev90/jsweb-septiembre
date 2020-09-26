package ar.com.educacionit.domain.clase4.saludadores;

public class Aleman extends Persona implements ISaludable {

	
	
	public Aleman(String nombre) {
		super(nombre);
	}

	@Override
	public void saludar() {
		System.out.println("Hallo");
	}

}
