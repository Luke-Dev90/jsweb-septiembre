package ar.com.educacionit.domain;

public class Persona {
	//atributos
	private String nombre, apellido, pensamiento;
	private float altura;
	private long dni;
	private Integer cantidadOjos;
	public static Integer CANT_OJOS = 2;
	
	//constructor
	public Persona() {
		System.out.println("Creando una persona");
	}
	public Persona(String nombre, String apellido,long dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cantidadOjos = 2;
		
	}
	// metodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPensamiento() {
		return pensamiento;
	}
	public void setPensamiento(String pensamiento) {
		this.pensamiento = pensamiento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public Integer getCantidadOjos() {
		return cantidadOjos;
	}
	public void setCantidadOjos(Integer cantidadOjos) {
		this.cantidadOjos = cantidadOjos;
	}
	
	
}
