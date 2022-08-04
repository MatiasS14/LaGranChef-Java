package laGranChef.socios;
import java.util.HashSet;
import java.util.Set;

import laGranChef.actividades.Actividad;
import laGranChef.actividades.borradores.BorradorSocio;
import laGranChef.actividades.errores.ErrorSocio;

public class Socio {
	private Set<Actividad> actividadesRealizadas = new HashSet<Actividad>();
	private Integer limiteActividades;
	private Integer edad;
	private Set<String> idiomas= new HashSet<String>();
	
	public Socio(BorradorSocio socio) throws ErrorSocio{
		verificarSocio(socio);
		this.limiteActividades = socio.limiteActividades ;
		this.edad              = socio.edad   ;
		this.idiomas 		   = socio.idiomas;
	}
	
	private void verificarSocio(BorradorSocio socio) throws ErrorSocio{
		if(socio.edad == 0 ) {throw new ErrorSocio("El socio debe tener al menos 1 año");}
		if(socio.limiteActividades < 1 ) {
			throw new ErrorSocio("El socio debe tener limitie minimo de 1 actividad");
		}
		if(socio.idiomas.isEmpty()) {throw new ErrorSocio("El socio debe saber al menos 1 idioma");}
	}
	
	public Set<String> idiomas(){
		return this.idiomas;
	}
	
	public Boolean esAdoradorDelSol() {
		Set<Boolean> ret = new HashSet<Boolean>();
		
		for(Actividad activ : this.actividadesRealizadas){
			ret.add(activ.sirveParaBroncear());
		}
		
	 return ret.size() == 1;
	}
	
	public Set<Actividad> actividadesForzosas(){
		Set<Actividad> ret = new HashSet<Actividad>();
		
		for(Actividad activ : this.actividadesRealizadas){
			if(activ.implicaEsfuerzo()) {
				ret.add(activ);
			}
 
		}
		
	 return ret;		
	}
	
	public Set<Actividad> actividadesRealizadas(){
		return this.actividadesRealizadas;
	}
	
	public Boolean leAtrae(Actividad act) {
		return true;
	}
	
	public void registrarActividad(Actividad act) throws ErrorSocio{
		if(this.limiteActividades > this.actividadesRealizadas.size()) {
			this.actividadesRealizadas.add(act);
		}else {
			throw new ErrorSocio("Exede el limite de actividades posibles");
		}
	}
	
	public Integer edad() {
		return this.edad;
	}
}
