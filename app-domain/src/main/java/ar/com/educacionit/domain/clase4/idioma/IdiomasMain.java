package ar.com.educacionit.domain.clase4.idioma;

public class IdiomasMain 
{
	
	public static void main(String[]args) 
	{
		
		Persona persona1 = new Persona("carlos");
		
		System.out.println(persona1.getNombre() + " No sabe ningun idioma ");
		
		for(IIdioma idioma : persona1.getIdiomas()) {
			idioma.hablar();
		}
		
		//carlos aprende ingles
		
		IIdioma idiomaNuevo = new IdiomaIngles();
		persona1.aprenderIdioma(idiomaNuevo);
		
		System.out.println("Ahora " + persona1.getNombre() + " habla:");
		
		for(IIdioma idioma : persona1.getIdiomas()) {
			String texto = idioma.hablar();
			System.out.println(texto);
		}
		
		idiomaNuevo = new IdiomaEspanol();
		persona1.aprenderIdioma(idiomaNuevo);
		
		System.out.println("Ahora "  +persona1.getNombre() + " habla:");
		for(IIdioma idioma : persona1.getIdiomas()) {
			String texto = idioma.hablar();
			System.out.println(texto);
		}
	}
}
