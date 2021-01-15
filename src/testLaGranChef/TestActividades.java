package testLaGranChef;
import java.util.Set;
import java.util.HashSet;
import laGranChef.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class TestActividades {
	//colecciones de idiomas sin inicializar
	public Set<String> idiomas1    ;
	public Set<String> idiomas2    ;
	public Set<String> idiomas3    ;
	public Set<String> idiomas4    ;
				//Viaje a ciudad	
	Actividad viajeACiudad1;
	Actividad viajeACiudad2;
				//Viaje a ciudad tropical
	Actividad viajeCiudadTropical1;
	Actividad viajeCiudadTropical2;
				//Viaje a la playa
	Actividad viajePlaya1; 
	Actividad viajePlaya2;
				//Salida de trekking
	Actividad salidaTrekking1;
	Actividad salidaTrekking2;
				//clase de gimnasia
	Actividad claseGym1;
	Actividad claseGym2;
				//taller literario
	Actividad tallerLiterario1;
	Actividad tallerLiterario2;
	Actividad tallerLiterario3;
	
	//Libros
	public Libro libro1;
	public Libro libro2;
	public Libro libro3;
	public Libro libro4;
	public Libro libro5;
	public Libro libro6;
	public Libro libro7;
	public Libro libro8;
	public Libro libro9;
	
	//colecciones de libros
	public Set<Libro> libros1;
	public Set<Libro> libros2;
	public Set<Libro> libros3;
	
	//Socios
	public Socio soc1;
	public Socio soc2;
	public Socio soc3;
	public Socio soc4;
	@BeforeEach
	void setUp(){
		//coleccion de idiomas con solo un idioma
		idiomas1= new HashSet<String>();
		idiomas1.add("Español")        ;
		//coleccion de idiomas con 2 idiomas
		idiomas2= new HashSet<String>();
		idiomas2.add("Español")        ;
		idiomas2.add("Ingles")         ;
		//coleccion de idiomas con 2 idiomas
		idiomas3= new HashSet<String>();
		idiomas3.add("Hebreo")         ;
		idiomas3.add("Coreano")        ;
		//coleccion de idiomas con 4 idiomas
		idiomas4= new HashSet<String>();
		idiomas4.add("Español")        ;
		idiomas4.add("Ingles")         ;
		idiomas4.add("Frances")        ;
		idiomas4.add("Portugues")      ;
		
		//Inicializacion de instancias de libros
		libro1 = new Libro(400, "Español", "Borges");
		libro2 = new Libro(400, "Ingles", "Bradbury");
		libro3 = new Libro(300, "Frances", "Pepe");
		libro4 = new Libro(150, "Español", "Borges");
		libro5 = new Libro(200, "Español", "Borges");
		libro6 = new Libro(1000, "Portugues", "Ronaldiño");
		libro7 = new Libro(400, "Español", "San Martin");
		libro8 = new Libro(300, "Ingles", "Obama");
		libro9 = new Libro(200, "Ingles", "Spilberg");
		
		//colecciones de libros
		libros1 = new HashSet<Libro>();
		libros2 = new HashSet<Libro>();
		libros3 = new HashSet<Libro>();
		//libros1
		libros1.add(libro1);
		libros1.add(libro4);
		libros1.add(libro5);
		//libros2
		libros2.add(libro2);
		libros2.add(libro4);
		libros2.add(libro8);
		//libros3
		libros3.add(libro1);
		libros3.add(libro2);
		libros3.add(libro3);
		libros3.add(libro4);
		libros3.add(libro5);
		libros3.add(libro6);
		libros3.add(libro7);
		libros3.add(libro8);
		libros3.add(libro9);
		
		
		//Actividades de diferentes tipos y caracteristicas
					//Viaje a ciudad
		viajeACiudad1 = new ViajeACiudad(idiomas1,4) ;
		viajeACiudad2 = new ViajeACiudad(idiomas4, 10);
					//Viaje a ciudad tropical
		viajeCiudadTropical1 = new ViajeCiudadTropical(idiomas1, 3);
		viajeCiudadTropical2 = new ViajeCiudadTropical(idiomas4, 5);
					//Viaje a la playa
		viajePlaya1= new ViajePlaya(idiomas1, 1200); 
		viajePlaya2= new ViajePlaya(idiomas2, 5000);
					//Salida de trekking
		salidaTrekking1= new SalidaTrekking(idiomas1, 60, 120) ;
		salidaTrekking2= new SalidaTrekking(idiomas3, 200, 260);
					//clase de gimnasia
		claseGym1= new ClaseGimnasia(idiomas1);
		claseGym2= new ClaseGimnasia(idiomas2);
					//taller literario
		tallerLiterario1 = new TallerLiterario(idiomas1, libros1);
		tallerLiterario2 = new TallerLiterario(idiomas2,libros2);
		tallerLiterario3 = new TallerLiterario(idiomas4,libros3);
		
		//Inicializacion de socios
		soc1 = new SocioTranquilo(4, 40, idiomas2);
		soc2 = new SocioCoherente(6, 25, idiomas4);
		soc3= new SocioRelajado(8, 30, idiomas3)  ;
		soc4 = new SocioTranquilo(3, 20, idiomas1);
	}
	@Test
	void testViajesPlaya() {
		//Implican esfuerzo
		assertTrue(viajePlaya2.implicaEsfuerzo()) ;
		assertFalse(viajePlaya1.implicaEsfuerzo());
		//Sirven para broncearse
		assertTrue(viajePlaya1.sirveParaBroncear());
		assertTrue(viajePlaya2.sirveParaBroncear());
		//Dias de duracion
		assertEquals(2, viajePlaya1.diasDuracion()) ;
		assertEquals(10, viajePlaya2.diasDuracion());
		//Es interesante
		assertFalse(viajePlaya1.esInteresante());
		assertTrue(viajePlaya2.esInteresante()) ;		
	}
	@Test
	void testViajesCiudadYCiudadTropical() {
				//Viajes ciudad normal
		//Implica esfuerzo
		assertTrue(viajeACiudad2.implicaEsfuerzo()) ;
		assertFalse(viajeACiudad1.implicaEsfuerzo());
		//Sirven para broncearse
		assertFalse(viajeACiudad1.sirveParaBroncear());
		assertFalse(viajeACiudad2.sirveParaBroncear());
		//Dias de duracion
		assertEquals(2, viajeACiudad1.diasDuracion());
		assertEquals(5, viajeACiudad2.diasDuracion());
		//Es interesante
		assertFalse(viajeACiudad1.esInteresante());
		assertTrue(viajeACiudad2.esInteresante()) ;

				//Viajes ciudad tropical
		//Implica esfuerzo
		assertTrue(viajeCiudadTropical2.implicaEsfuerzo()) ;
		assertFalse(viajeCiudadTropical1.implicaEsfuerzo());
		//Sirven para broncearse
		assertTrue(viajeCiudadTropical1.sirveParaBroncear());
		assertTrue(viajeCiudadTropical2.sirveParaBroncear());
		//Dias de duracion
		assertEquals(2, viajeCiudadTropical1.diasDuracion());
		assertEquals(3, viajeCiudadTropical2.diasDuracion());
		//Es interesante
		assertFalse(viajeCiudadTropical1.esInteresante());
		assertTrue(viajeCiudadTropical2.esInteresante()) ;
		
	}
	@Test
		public void testSalidaTrekking() {
		//Implica esfuerzo
		assertTrue(salidaTrekking2.implicaEsfuerzo()) ;
		assertFalse(salidaTrekking1.implicaEsfuerzo());
				//Sirven para broncearse
		assertFalse(salidaTrekking1.sirveParaBroncear());
		assertTrue(salidaTrekking2.sirveParaBroncear());
				//Dias de duracion
		assertEquals(1, salidaTrekking1.diasDuracion());
		assertEquals(4, salidaTrekking2.diasDuracion());
				//Es interesante
		assertFalse(salidaTrekking1.esInteresante());
		assertTrue(salidaTrekking2.esInteresante()) ;
	}
	
	@Test
		public void testClaseGimnasia() {
		//Implica esfuerzo
		assertTrue(claseGym2.implicaEsfuerzo()) ;
				//Sirven para broncearse
		assertFalse(claseGym1.sirveParaBroncear());
				//Dias de duracion
		assertEquals(1, claseGym1.diasDuracion());
				//Es interesante
		assertFalse(claseGym1.esInteresante());

	}

	@Test
	void testTallerLiterario() {
		//Implican esfuerzo
		assertTrue(tallerLiterario1.implicaEsfuerzo()) ;
		assertFalse(tallerLiterario2.implicaEsfuerzo()) ;
		assertTrue(tallerLiterario3.implicaEsfuerzo()) ;
		//Sirven para broncearse
		assertFalse(tallerLiterario1.sirveParaBroncear());
		assertFalse(tallerLiterario2.sirveParaBroncear());
		assertFalse(tallerLiterario3.sirveParaBroncear());
		//Dias de duracion
		assertEquals(4, tallerLiterario1.diasDuracion()) ;
		assertEquals(4, tallerLiterario2.diasDuracion()) ;
		assertEquals(10, tallerLiterario3.diasDuracion()) ;
		//Es interesante
		assertFalse(tallerLiterario1.esInteresante());
		assertTrue(tallerLiterario2.esInteresante());
		assertTrue(tallerLiterario3.esInteresante());
				
	}

	@Test
	void testSocio() {
		//Verifica si se lanza el aviso de exceso de actividades
		try{
			soc4.registrarActividad(viajeACiudad1);
			soc4.registrarActividad(viajeCiudadTropical1);
			soc4.registrarActividad(claseGym1);
			soc4.registrarActividad(salidaTrekking2);
			soc4.registrarActividad(viajePlaya1);
		}catch(RuntimeException e) {
			System.out.print("El socio soc4"+" " +e);			
		}
		//verifica que el socio soc1 es adorador del sol
		soc1.registrarActividad(viajePlaya1);
		soc1.registrarActividad(viajePlaya2);
		soc1.registrarActividad(viajeCiudadTropical2);
		assertTrue(soc1.esAdoradorDelSol());
		soc1.registrarActividad(claseGym2);//luego de agregar clase de gimnasia
		assertFalse(soc1.esAdoradorDelSol());//soc1 deja de ser adorador del sol
		assertFalse(soc2.esAdoradorDelSol()); //este socio no tiene actividades
											  //por lo tanto no es adorador del sol
		
		//verifica las actividades forzosas que hizo el socio soc2
		soc2.registrarActividad(viajeACiudad1);
		assertEquals(1, soc2.actividadesRealizadas().size());//verifica que agregue la actividad
		assertTrue(soc2.actividadesRealizadas().contains(viajeACiudad1)); //verifica que el registro esta almacenado
		//registra 2 actividades en soc2
		soc2.registrarActividad(viajeCiudadTropical1);
		soc2.registrarActividad(claseGym1);
		soc2.registrarActividad(salidaTrekking2);
		//Verifica que soc2 tiene 2 actividades
		//realizadas y las mismas son las registradas
		assertEquals(4, soc2.actividadesRealizadas().size());
		assertTrue(soc2.actividadesForzosas().contains(claseGym1));
		assertTrue(soc2.actividadesForzosas().contains(salidaTrekking2));
		
		//Actividades atractivas para socio
			//socio tranquilo
		assertTrue(soc4.leAtrae(tallerLiterario2)) ;//socio tranquilo
		assertFalse(soc4.leAtrae(claseGym2)) ;//socio tranquilo
		assertFalse(soc2.leAtrae(tallerLiterario2));//socio coherente
		assertTrue(soc2.leAtrae(tallerLiterario3)) ;//socio coherente
		assertFalse(soc3.leAtrae(tallerLiterario3));//socio relajado
		assertTrue(soc3.leAtrae(salidaTrekking2));//socio relajado
		
		//Actividades recomendadas para socio
		assertTrue(tallerLiterario2.esRecomendaddaSocio(soc4));
		assertFalse(viajeACiudad1.esRecomendaddaSocio(soc4));
		assertFalse(tallerLiterario1.esRecomendaddaSocio(soc4));
		assertFalse(claseGym1.esRecomendaddaSocio(soc4));
		assertFalse(claseGym1.esRecomendaddaSocio(soc3));
		assertTrue(claseGym1.esRecomendaddaSocio(soc2));
		

	}
}
