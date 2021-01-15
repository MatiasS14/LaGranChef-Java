package laGranChef;

import java.util.Set;

public class SocioCoherente extends Socio{
	public SocioCoherente(Integer limite, Integer edad, Set<String> idiomas) {
		super(limite, edad, idiomas);
	}
	
	public Boolean leAtrae(Actividad act) {
     return (this.esAdoradorDelSol() && act.sirveParaBroncear()) || act.implicaEsfuerzo();
	}
}
