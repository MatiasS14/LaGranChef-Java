package laGranChef.actividades.viajes;

import java.util.Set;

import laGranChef.actividades.Actividad;

public class ViajePlaya extends Actividad{
	private Integer largoPlaya;
	
	public ViajePlaya(Set<String> idiomas, Integer largo) {
		super(idiomas);
		this.largoPlaya = largo;
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