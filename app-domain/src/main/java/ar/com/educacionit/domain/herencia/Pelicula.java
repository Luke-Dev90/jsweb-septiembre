package ar.com.educacionit.domain.herencia;

import java.util.Date;

public class Pelicula extends Articulo {
	private String formato;
	private Date fechaPublicacion;
	
	public Pelicula(String titulo, String autor, Float precio) {
		super(titulo, autor, precio);
		this.categoria = 3;
	}
	
	
	
	@Override
	public String toString() {
		String toStringPadre = super.toString();
		String toStringHijo = ",Formato: " + this.formato + " Fecha publicación: " + this.fechaPublicacion;
		return toStringPadre + toStringHijo;
	}



	public Pelicula(String titulo, String autor, Float precio, String formato, Date fechaPublicacion) {
		super(titulo, autor, precio);
		this.formato = formato;
		this.fechaPublicacion = fechaPublicacion;
	}



	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	
}
