package laGranChef.actividades.tallerLiterario;
import org.junit.platform.commons.util.StringUtils;
import laGranChef.actividades.borradores.BorradorLibro;
import laGranChef.actividades.errores.ErrorLibro;

public class Libro {
	private Integer cantPag;
	private String idioma  ; 
	private String autor   ;
	
	public Libro(BorradorLibro libro) throws ErrorLibro{
		verificarLibro(libro);
		this.cantPag = libro.cantPag;
		this.idioma  = libro.idioma ;
		this.autor   = libro.autor  ;
	}
	
	private void verificarLibro(BorradorLibro libro) throws ErrorLibro{
		if(libro.cantPag <1) {throw new ErrorLibro("El libro debe poseer mas de una pagina");}
		if(StringUtils.isBlank(libro.idioma)) {throw new ErrorLibro("El libro debe poseer un idioma");}
		if(StringUtils.isBlank(libro.autor)) {throw new ErrorLibro("El libro debe poseer autor");}
		
	}
	
	public Integer cantPaginas() {
		return this.cantPag;
	}
	
	public String idioma() {
		return this.idioma;
	}
	
	public String autor() {
		return this.autor;
	}
}
