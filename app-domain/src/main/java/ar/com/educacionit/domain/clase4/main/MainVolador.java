package ar.com.educacionit.domain.clase4.main;

import ar.com.educacionit.domain.clase4.dtos.Resultado;
import ar.com.educacionit.domain.clase4.interfaces.Aterrizable;
import ar.com.educacionit.domain.clase4.utils.VoladorUtil;
import ar.com.educacionit.domain.clase4.voladores.Maquina;
import ar.com.educacionit.domain.clase4.voladores.Volador;

public class MainVolador {

	public static void main(String[] args) {
		
		Volador[] voladores = VoladorUtil.construirVoladores();
		
		// simulo Objetos volando
		for(Volador volador: voladores) {
			// cumple el contrato?
			
			if(volador instanceof Aterrizable) {
				Resultado resultado = ((Aterrizable)volador).aterrizar();
				
				if(resultado.isError()) {
					System.err.println(volador.getNombre() + ", con problemas " + resultado.getMensaje());
					if(volador instanceof Maquina) {
						System.err.println("Enviando ayuda para la maquina a la pista 1");
					}else {
						System.err.println("No hace falta ayuda, " + volador.getNombre() + ", aterrizado solo");
					}
				}else {
					System.out.println("Aterrizaje de " + volador.getNombre() + " Normal");
				}
			}else {
				if(volador instanceof Maquina) {
					System.out.println("la maquina " + volador.getNombre() + " no puede aterrizar");
				}else {
					System.err.println("el super heroe " + volador.getNombre() + " Normal");
				}
			}
		}
	}

}
