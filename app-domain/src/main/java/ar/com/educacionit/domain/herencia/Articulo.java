package ar.com.educacionit.domain.herencia;

import ar.com.educacionit.domain.Persona;

public class Articulo
{
	protected String titulo;
	protected Integer categoria;
	protected String autor;
	protected Float precio;
	
	// definimos constructor
	
	public Articulo(String titulo, String autor, Float precio) {
		this.autor = autor;
		this.precio = precio;
		this.titulo = titulo;
	}

	//metodos getters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}
	
	//metodos setters

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	
		
	@Override
	public String toString() {
		String estado = "titulo: " + this.getTitulo() ;
		estado = estado + " Autor: " + this.getAutor();
		estado = estado + " Precio: "+ this.getPrecio();
		estado = estado + " categoria: " + this.getCategoria();
		return estado;
	}
	
	
}
