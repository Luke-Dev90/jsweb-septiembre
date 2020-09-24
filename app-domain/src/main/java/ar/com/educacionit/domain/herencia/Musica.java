package ar.com.educacionit.domain.herencia;

public class Musica extends Articulo {
	private String selloDiscografico;
	public Musica(String titulo, String auto, Float precio, String selloD) {
		super(titulo,auto,precio);
		
		
		this.categoria = 2;
		this.selloDiscografico = selloD;
	}
	@Override
	public String toString() {
		String toStringPadre = super.toString();
		String toStringHijo = ",Sello Discografico " + this.selloDiscografico;
		return toStringPadre + toStringHijo;
	}
	
	
	
}
