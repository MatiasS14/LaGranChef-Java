package laGranChef.socios;

import laGranChef.actividades.Actividad;
import laGranChef.actividades.borradores.BorradorSocio;
import laGranChef.actividades.errores.ErrorSocio;

public class SocioRelajado extends Socio{

	public SocioRelajado(BorradorSocio socio) throws ErrorSocio{
		super(socio);
	}
	
	public Boolean leAtrae(Actividad act) {
		return this.hablaIdiomaAct(act);
	}
	
	protected Boolean hablaIdiomaAct(Actividad act) {
		Integer cantIdiomas = 0;
		for(String idiom : this.idiomas()) {
			if(act.idiomas().contains(idiom)) {
				cantIdiomas++;
			}
		}
	 return cantIdiomas > 0;
	}
}
