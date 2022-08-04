package laGranChef.socios;

import laGranChef.actividades.Actividad;
import laGranChef.actividades.borradores.BorradorSocio;
import laGranChef.actividades.errores.ErrorSocio;

public class SocioTranquilo extends Socio{
	public SocioTranquilo(BorradorSocio socio) throws ErrorSocio{
		super(socio);
	}
	
	public Boolean leAtrae(Actividad act) {
		return act.diasDuracion() >= 4;
	}
}
