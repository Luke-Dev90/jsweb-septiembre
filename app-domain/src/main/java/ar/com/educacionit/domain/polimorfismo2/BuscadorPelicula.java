package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorPelicula extends BuscadorBase {

	public BuscadorPelicula(String clave) {
		super(clave);
		
	}

	@Override
	protected String getSQL() {
	
		return "PELICULA WHERE NOMBRE_PELICULA LIKE'%" + super.claveBusqueda + "%'";
	}

}
