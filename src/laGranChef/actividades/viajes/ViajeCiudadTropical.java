package laGranChef.actividades.viajes;

import laGranChef.actividades.borradores.BorradorViajeCiudad;
import laGranChef.actividades.errores.ErrorViaje;

public class ViajeCiudadTropical extends ViajeACiudad{
	public ViajeCiudadTropical (BorradorViajeCiudad viaje) throws ErrorViaje{
		super(viaje);
	}

	public Boolean sirveParaBroncear() {
		return true;
	}
	
	public Integer diasDuracion() {
		return super.diasDuracion() +1;
	}

}
