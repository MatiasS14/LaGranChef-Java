package laGranChef;
import java.util.Set;

public abstract class Actividad {
	protected Set<String> idiomas;
	
	public Actividad(Set<String> idiomas){
		this.idiomas = idiomas;
	}
	
	public Set<String> idiomas() {
		return this.idiomas;
	}
	
	abstract public Boolean implicaEsfuerzo();
	
	abstract public Boolean sirveParaBroncear();
	
	abstract public Integer diasDuracion() ;
	
	public Boolean esInteresante() {
		return this.idiomas.size() > 1;
	}
	
	public Boolean esRecomendaddaSocio(Socio soc) {
		return this.esInteresante() && soc.leAtrae(this) && !soc.actividadesRealizadas().contains(this);
	}
}
