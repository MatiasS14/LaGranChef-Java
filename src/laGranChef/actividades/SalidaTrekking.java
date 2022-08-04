package laGranChef.actividades;
import java.util.Set;

public class SalidaTrekking extends Actividad{
	private Integer kilometros;
	private Integer diasDeSol;
	
	public SalidaTrekking (Set<String> idiomas, Integer kilometros, Integer diasDeSol) {
		super(idiomas);
		this.kilometros = kilometros;
		this.diasDeSol  = diasDeSol;
	}
	
	public Boolean implicaEsfuerzo() {
		return this.kilometros > 80;
	}
	
	public Boolean sirveParaBroncear() {
		return this.diasDeSol >200 || 
			   (this.diasDeSol <100 && this.diasDeSol > 200 && this.kilometros > 120);
	}
	
	public Integer diasDuracion() {
		return this.kilometros / 50;
	}
	
	public Boolean esInteresante() {
		return super.esInteresante() || this.diasDeSol > 140;
	}
	
}
