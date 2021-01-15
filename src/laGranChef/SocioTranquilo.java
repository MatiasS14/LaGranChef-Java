package laGranChef;

import java.util.Set;

public class SocioTranquilo extends Socio{
	public SocioTranquilo(Integer limite, Integer edad, Set<String> idiomas) {
		super(limite, edad, idiomas);
	}
	
	public Boolean leAtrae(Actividad act) {
		return act.diasDuracion() >= 4;
	}
}
