package laGranChef;
import java.util.Set;

public class ViajeCiudadTropical extends ViajeACiudad{
	public ViajeCiudadTropical (Set<String> idiomas, Integer cantAtrac) {
		super(idiomas, cantAtrac);
	}

	public Boolean sirveParaBroncear() {
		return true;
	}
	
	public Integer diasDuracion() {
		return super.diasDuracion() +1;
	}

}
