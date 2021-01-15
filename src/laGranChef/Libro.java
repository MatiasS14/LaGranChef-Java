package laGranChef;

public class Libro {
	Integer cantPag;
	String idioma  ; 
	String autor   ;
	
	public Libro(Integer cantPag, String idioma, String autor) {
		this.cantPag = cantPag;
		this.idioma  = idioma ;
		this.autor   = autor  ;
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
