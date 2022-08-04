package laGranChef.socios;

import java.util.Set;

import laGranChef.actividades.Actividad;

public class SocioRelajado extends Socio{

	public SocioRelajado(Integer limite, Integer edad, Set<String> idiomas) {
		super(limite, edad, idiomas);
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
