package laGranChef.actividades;
import java.util.Set;

import laGranChef.actividades.borradores.BorradorClaseGimnasia;
import laGranChef.socios.Socio;

public class ClaseGimnasia extends Actividad{
	
	public ClaseGimnasia(BorradorClaseGimnasia claseGimnasia) {
		super(claseGimnasia.idiomas);		
	}
	
	public Set<String> idiomas() {
		idiomas.clear()       ;
		idiomas.add("Espa�ol");
		return this.idiomas   ;
	}
	
	public Boolean implicaEsfuerzo() {
		return true;
	}
	
	public Boolean sirveParaBroncear() {
		return false;
	}
	
	public Integer diasDuracion() {
		return 1;
	}
	
	public Boolean esRecomendaddaSocio(Socio soc) {
		return soc.edad() > 20 && soc.edad() < 30;
	}
}
