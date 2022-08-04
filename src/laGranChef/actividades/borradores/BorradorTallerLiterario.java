package laGranChef.actividades.borradores;
import java.util.Set;
import laGranChef.actividades.tallerLiterario.Libro;

public class BorradorTallerLiterario {
	public Set<String> idiomas;
	public Set<Libro> libros;
	
	public BorradorTallerLiterario(Set<String> idiomas, Set<Libro> libros) {
		this.idiomas = idiomas;
		this.libros = libros;
	}
}
