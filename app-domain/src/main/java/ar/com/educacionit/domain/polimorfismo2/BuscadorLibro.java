package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorLibro extends BuscadorBase {

	public BuscadorLibro(String clave) {
		super(clave);
		
	}

	@Override
	protected String getSQL() {
	
		return "LIBRO WHERE TITULO LIKE'%" + super.claveBusqueda + "%'";
	}

}
