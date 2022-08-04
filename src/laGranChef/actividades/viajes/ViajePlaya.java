package laGranChef.actividades.viajes;

import laGranChef.actividades.Actividad;
import laGranChef.actividades.borradores.BorradorViajePlaya;
import laGranChef.actividades.errores.ErrorViaje;

public class ViajePlaya extends Actividad{
	private Integer largoPlaya;
	
	public ViajePlaya(BorradorViajePlaya viaje) throws ErrorViaje{
		super(viaje.idiomas);
		verificarViaje(viaje);
		this.largoPlaya = viaje.largo;
	}
	
	private void verificarViaje(BorradorViajePlaya viaje) throws ErrorViaje{
		if(viaje.idiomas.isEmpty()) {throw new ErrorViaje("El viaje debe poseer al menos un idioma");}
		if(viaje.largo < 1) {throw new ErrorViaje("La playa debe tener un valor de largo mas grande que 0");}
	}
	public Boolean implicaEsfuerzo() {
		return this.largoPlaya > 1200;
	}
	
	public Boolean sirveParaBroncear() {
		return true;
	}
	
	public Integer diasDuracion() {
		return this.largoPlaya / 500;
	}
}