package ar.com.educacionit.domain.polimorfismo;

public class PolimorfismoMain2 {
	
	public static void main(String[]args) {
		String tipoInformeSeleccionado = "sda";
		String nombreInformeSeleccionado = "listadoXYZ";
		// seleccion de la clase a instanciar en base al tipo
		InformeBase informe = null;
		
		if("pdf".equalsIgnoreCase(tipoInformeSeleccionado)) {
			informe = new InformePDF(nombreInformeSeleccionado);
		}else if("csv".equalsIgnoreCase(tipoInformeSeleccionado)){
			informe = new InformeCSV(nombreInformeSeleccionado);
		}else {
			informe = new InformeTXT(nombreInformeSeleccionado);
		}
		
		System.out.println("Ejecuntando informe...");
		informe.convertir();
		System.out.println("Informe General");
	}
}
