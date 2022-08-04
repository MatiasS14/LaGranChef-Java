package laGranChef.socios;

import laGranChef.actividades.Actividad;
import laGranChef.actividades.borradores.BorradorSocio;
import laGranChef.actividades.errores.ErrorSocio;

public class SocioCoherente extends Socio{
	public SocioCoherente(BorradorSocio socio) throws ErrorSocio{
		super(socio);
	}
	
	public Boolean leAtrae(Actividad act) {
     return (this.esAdoradorDelSol() && act.sirveParaBroncear()) || act.implicaEsfuerzo();
	}
}
