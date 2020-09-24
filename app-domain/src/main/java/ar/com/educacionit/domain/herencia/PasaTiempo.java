package ar.com.educacionit.domain.herencia;

public class PasaTiempo extends Articulo{
	private String marca;
	public PasaTiempo(String titulo, String auto, Float precio) {
		super(titulo,auto,precio);
		this.categoria = 4;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		String toStringPadre = super.toString();
		String toStringHijo = ", marca: " + this.marca;
		return toStringPadre + toStringHijo;
	}
	
	
	
}
