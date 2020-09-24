package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorGeneral extends BuscadorBase {

	public BuscadorGeneral(String clave) {
		super(clave);
		
	}

	@Override
	protected String getSQL() {
	
		return "LIBRO WHERE ARTICULOS LIKE'%" + super.claveBusqueda + "%'";
	}

}
