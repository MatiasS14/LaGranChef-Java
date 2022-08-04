package laGranChef.actividades.viajes;
import java.util.Set;

import laGranChef.actividades.Actividad;

public class ViajeACiudad extends Actividad{
	protected Integer cantAtracciones;
	
	public ViajeACiudad(Set<String> idiomas, Integer cantAtrac) {
		super(idiomas);
		this.cantAtracciones= cantAtrac;
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