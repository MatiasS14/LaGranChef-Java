package laGranChef;

import java.util.HashSet;
import java.util.Set;

public class TallerLiterario extends Actividad{
	Set<Libro> libros;
	
	public TallerLiterario(Set<String> idiomas, Set<Libro> libros) {
		super(idiomas);
		this.libros = libros;
	}
	
	public void agragarLibro(Libro libro) {
		this.libros.add(libro);
	}
	
	public Set<Libro> libros(){
		return this.libros;
	}
	
	public Set<String> idiomas(){
		Set<String> ret= new HashSet<String>();
		for(Libro lib : this.libros) {
			ret.add(lib.idioma);
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
	
	public Boolean tieneLibro500Paginas(Set<Libro> libros) {
		//prop: determina si el taller literario contiene
		//almenos un libro con mas de 500 paginas.
		Boolean ret = false;
		for(Libro lib : libros) {
			ret = ret || lib.cantPaginas() > 500;
		}
		
	 return ret;
	}
	
	public Boolean todosDelMismoAutor(Set<Libro> libros) {
		//prop: determina si todos los libros 
		//del taller literario son del mismo autor.
		Set<String> ret = new HashSet<String>();
		for(Libro lib : libros) {
			ret.add(lib.autor);
		}
	 return ret.size() == 1;
	}
	
}