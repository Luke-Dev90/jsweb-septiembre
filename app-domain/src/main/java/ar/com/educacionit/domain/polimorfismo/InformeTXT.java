package ar.com.educacionit.domain.polimorfismo;

public class InformeTXT extends InformeBase {

	public InformeTXT(String nombre) {
		super(nombre);
	}

	@Override
	public String convertir() {
		return "TXT";
		
	}

	//no cambia el comportamiento del padre!!!
	
	
}
