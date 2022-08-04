package laGranChef.actividades.viajes;
import java.util.Set;

import laGranChef.actividades.Actividad;
import laGranChef.actividades.borradores.BorradorViajeCiudad;
import laGranChef.actividades.errores.ErrorViaje;

public class ViajeACiudad extends Actividad{
	protected Integer cantAtracciones;
	
	public ViajeACiudad(BorradorViajeCiudad viaje) throws ErrorViaje{
		super(viaje.idiomas);
		verificarViaje(viaje);
		this.cantAtracciones= viaje.cantAtracciones;
	}
	
	private void verificarViaje(BorradorViajeCiudad viaje) throws ErrorViaje{
		if(viaje.idiomas.isEmpty()) {throw new ErrorViaje("El viaje debe tener al menos un idioma");}
		if(viaje.cantAtracciones < 1) {throw new ErrorViaje("El viaje debe tener al menos una atraccion");}
	}
	
	public Boolean implicaEsfuerzo() {
		return this.cantAtracciones >= 5;
	}
	
	public Boolean sirveParaBroncear() {
		return false;
	}
	
	public Integer diasDuracion() {
		return this.cantAtracciones / 2 ;
	}
	public Boolean esInteresante() {
		return super.esInteresante() || this.cantAtracciones == 5;
	}
}	