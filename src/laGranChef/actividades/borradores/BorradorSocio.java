package laGranChef.actividades.borradores;

import java.util.Set;

public class BorradorSocio {
	public Integer limiteActividades;
	public Integer edad;
	public Set<String> idiomas;
	
	public BorradorSocio(Integer limite, Integer edad, Set<String> idiomas) {
		this.limiteActividades = limite;
		this.edad = edad;
		this.idiomas = idiomas;
	}
}
