package laGranChef.actividades.tallerLiterario;

import java.util.HashSet;
import java.util.Set;

import laGranChef.actividades.Actividad;
import laGranChef.actividades.borradores.BorradorTallerLiterario;
import laGranChef.socios.Socio;

public class TallerLiterario extends Actividad{
	private Set<Libro> libros;
	
	public TallerLiterario(BorradorTallerLiterario taller) {
		super(taller.idiomas);
		this.libros = taller.libros;
	}
	
	public void agragarLibro(Libro libro) {
		this.libros.add(libro);
	}

	public void eliminarLibro(Libro libro) {
		this.libros.remove(libro);
	}
	
	public Set<Libro> libros(){
		return this.libros;
	}
	
	public Set<String> idiomas(){
		Set<String> ret= new HashSet<String>();
		for(Libro lib : this.libros) {
			ret.add(lib.idioma());
		}
	 return ret;
	}
	
	public Integer diasDuracion() {
		return this.libros.size() + 1;
	}
	
	public Boolean sirveParaBroncear() {
		return false;
	}
	
	
	public Boolean implicaEsfuerzo() {
		return tieneLibro500Paginas(this.libros) || 
				this.libros.size() > 1  && todosDelMismoAutor(this.libros);
	}
	
	public Boolean esRecomendadaSocio(Socio soc) {
		return soc.idiomas().size() > 1;
	}
	
	private Boolean tieneLibro500Paginas(Set<Libro> libros) {
		//prop: determina si el taller literario contiene
		//almenos un libro con mas de 500 paginas.
		Boolean ret = false;
		for(Libro lib : libros) {
			ret = ret || lib.cantPaginas() > 500;
		}
		
	 return ret;
	}
	
	private Boolean todosDelMismoAutor(Set<Libro> libros) {
		//prop: determina si todos los libros 
		//del taller literario son del mismo autor.
		Set<String> ret = new HashSet<String>();
		for(Libro lib : libros) {
			ret.add(lib.autor());
		}
	 return ret.size() == 1;
	}
	
}