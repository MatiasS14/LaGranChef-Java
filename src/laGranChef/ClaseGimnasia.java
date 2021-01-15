package laGranChef;
import java.util.Set;

public class ClaseGimnasia extends Actividad{
	
	public ClaseGimnasia(Set<String> idiomas) {
		super(idiomas);		
	}
	
	public Set<String> idiomas() {
		idiomas.clear()       ;
		idiomas.add("Español");
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
