package ar.com.educacionit.domain.herencia;

public class MainHerencia {
	public static void main(String[]args) {
		
		Libro libro = new Libro("Harry Potter","Varios Autores",3333f);
		Musica musica = new Musica("CHROMATICA","Lady Gaga", 1045F, "Universal");
		Pelicula pelicula = new Pelicula("ADVENGER","Stan Lee", 3333f);
		PasaTiempo pasatiempo = new PasaTiempo("Advenger","Varios",399f);
		
		Articulo[] articulos = new Articulo[4];
		
		
		articulos[0] = libro;
		articulos[1] = musica;
		articulos[2] = pelicula;
		articulos[3] = pasatiempo;
		
		for(Articulo articulo : articulos) {
			System.out.println("titulo: " + articulo.getTitulo()) ;
			System.out.println(" Autor: " + articulo.getAutor());
			System.out.println(" Precio: "+ articulo.getPrecio());
			System.out.println(" categoria: " + articulo.getCategoria());
		}
		
		
	}
}
