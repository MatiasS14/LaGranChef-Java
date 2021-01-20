package laGranChef;
import java.util.HashSet;
import java.util.Set;

public class Socio {
	private Set<Actividad> actividadesRealizadas = new HashSet<Actividad>();
	private Integer limiteActividades;
	private Integer edad;
	private Set<String> idiomas= new HashSet<String>();
	
	public Socio(Integer limite, Integer edad, Set<String> idiomas) {
		this.limiteActividades = limite ;
		this.edad              = edad   ;
		this.idiomas 		   = idiomas;
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
	
	public void registrarActividad(Actividad act) {
		if(this.limiteActividades > this.actividadesRealizadas.size()) {
			this.actividadesRealizadas.add(act);
		}else {
			throw new RuntimeException("Exede el limite de actividades posibles");
		}
	}
	
	public Integer edad() {
		return this.edad;
	}
}
