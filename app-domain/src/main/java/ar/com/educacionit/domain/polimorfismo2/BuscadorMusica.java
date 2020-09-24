package ar.com.educacionit.domain.polimorfismo2;

public class BuscadorMusica extends BuscadorBase {

	public BuscadorMusica(String clave) {
		super(clave);
		
	}

	@Override
	protected String getSQL() {
	
		return "MUSICA WHERE ARTISTA LIKE'%" + super.claveBusqueda + "%'";
	}

}
