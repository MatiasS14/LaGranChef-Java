package laGranChef.socios;

import java.util.Set;

import laGranChef.actividades.Actividad;

public class SocioCoherente extends Socio{
	public SocioCoherente(Integer limite, Integer edad, Set<String> idiomas) {
		super(limite, edad, idiomas);
	}
	
	public Boolean leAtrae(Actividad act) {
     return (this.esAdoradorDelSol() && act.sirveParaBroncear()) || act.implicaEsfuerzo();
	}
}
