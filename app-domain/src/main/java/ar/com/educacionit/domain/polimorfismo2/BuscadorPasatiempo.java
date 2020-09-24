package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorPasatiempo extends BuscadorBase {

	public BuscadorPasatiempo(String clave) {
		super(clave);
		
	}

	@Override
	protected String getSQL() {
	
		return "PASATIEMPO WHERE MARCA LIKE'%" + super.claveBusqueda + "%'";
	}

}
