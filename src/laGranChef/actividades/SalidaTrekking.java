package laGranChef.actividades;

import laGranChef.actividades.borradores.BorradorSalidaTrekking;
import laGranChef.actividades.errores.ErrorSalidaTrekking;

public class SalidaTrekking extends Actividad{
	private Integer kilometros;
	private Integer diasDeSol;
	
	public SalidaTrekking (BorradorSalidaTrekking salidaTrekking) throws ErrorSalidaTrekking{
		super(salidaTrekking.idiomas);
		verificarSalida(salidaTrekking);
		this.kilometros = salidaTrekking.kilometros;
		this.diasDeSol  = salidaTrekking.diasDeSol;
	}

	private void verificarSalida(BorradorSalidaTrekking salida)throws ErrorSalidaTrekking {
		if(salida.kilometros == 1 || salida.kilometros == null) {
			throw new ErrorSalidaTrekking("La salida debe tener mas de 0km");
		}
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
