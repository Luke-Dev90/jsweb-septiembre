package ar.com.educacionit.domain.polimorfismo2;

import ar.com.educacionit.domain.herencia.Articulo;
import ar.com.educacionit.domain.herencia.Libro;
import ar.com.educacionit.domain.herencia.Musica;
import ar.com.educacionit.domain.herencia.PasaTiempo;
import ar.com.educacionit.domain.herencia.Pelicula;

public abstract class BuscadorBase {
		protected String claveBusqueda;
	
		public BuscadorBase(String clave) {
			this.claveBusqueda = clave;
		}
		
		public Articulo[] buscar() {
			//SELECT * FROM tabla_hija where
			
			String sqlPadre = "SELECT * FROM ";
			
			String sqlhijo = this.getSQL();
			
			String sqlFinal = sqlPadre + sqlhijo;
			
			System.out.println("Ejecutando: " + sqlFinal) ;
			
			Libro libro = new Libro(this.claveBusqueda,"Varios Autores",3333f);
			libro.setEditorial("Montoto");
			Musica musica = new Musica(this.claveBusqueda,"Lady Gaga", 1045F, "Universal");
			Pelicula pelicula = new Pelicula(this.claveBusqueda,"Stan Lee", 3333f);
			pelicula.setFormato("HD");
			
			PasaTiempo pasatiempo = new PasaTiempo(this.claveBusqueda,"Varios",399f);
			
			Articulo[] articulos = new Articulo[4];
			articulos[0] = libro;
			articulos[1] = musica;
			articulos[2] = pelicula;
			articulos[3] = pasatiempo;
			
			return articulos;
		}
		
		protected abstract String getSQL();
		
}
