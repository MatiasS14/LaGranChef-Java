package testLaGranChef;
import java.util.Set;
import java.util.HashSet;
import laGranChef.actividades.Actividad;
import laGranChef.actividades.ClaseGimnasia;
import laGranChef.actividades.SalidaTrekking;
import laGranChef.actividades.borradores.BorradorClaseGimnasia;
import laGranChef.actividades.borradores.BorradorLibro;
import laGranChef.actividades.borradores.BorradorSalidaTrekking;
import laGranChef.actividades.borradores.BorradorTallerLiterario;
import laGranChef.actividades.borradores.BorradorViajeCiudad;
import laGranChef.actividades.borradores.BorradorViajePlaya;
import laGranChef.actividades.errores.ErrorLibro;
import laGranChef.actividades.errores.ErrorSalidaTrekking;
import laGranChef.actividades.errores.ErrorViaje;
import laGranChef.actividades.tallerLiterario.Libro;
import laGranChef.actividades.tallerLiterario.TallerLiterario;
import laGranChef.actividades.viajes.ViajeACiudad;
import laGranChef.actividades.viajes.ViajeCiudadTropical;
import laGranChef.actividades.viajes.ViajePlaya;
import laGranChef.socios.Socio;
import laGranChef.socios.SocioCoherente;
import laGranChef.socios.SocioRelajado;
import laGranChef.socios.SocioTranquilo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class TestActividades {
	//colecciones de idiomas sin inicializar
	public Set<String> idiomas1    ;
	public Set<String> idiomas2    ;
	public Set<String> idiomas3    ;
	public Set<String> idiomas4    ;
				//Borrador viaje a ciudad
	BorradorViajeCiudad borradorViajeACiudad1;
	BorradorViajeCiudad borradorViajeACiudad2;
				//Viaje a ciudad	
	Actividad viajeACiudad1;
	Actividad viajeACiudad2;
				//Borrador viaje a ciudad tropical
	BorradorViajeCiudad borradorViajeACiudadTropical1;
	BorradorViajeCiudad borradorViajeACiudadTropical2;
				//Viaje a ciudad tropical
	Actividad viajeCiudadTropical1;
	Actividad viajeCiudadTropical2;
				//Borrador viaje playa
	BorradorViajePlaya borradorViajePlaya1;
	BorradorViajePlaya borradorViajePlaya2;
				//Viaje a la playa
	Actividad viajePlaya1; 
	Actividad viajePlaya2;
				//borrador salida trekking
	BorradorSalidaTrekking borradorSalidaTrekking1;
	BorradorSalidaTrekking borradorSalidaTrekking2;
				//Salida de trekking
	Actividad salidaTrekking1;
	Actividad salidaTrekking2;
				//borrador clase gimnasia
	BorradorClaseGimnasia borradorClaseGym1;
	BorradorClaseGimnasia borradorClaseGym2;
				//clase de gimnasia
	Actividad claseGym1;
	Actividad claseGym2;
				//Borrador taller literario
	BorradorTallerLiterario borradorTallerLiterario1;
	BorradorTallerLiterario borradorTallerLiterario2;
	BorradorTallerLiterario borradorTallerLiterario3;
				//taller literario
	Actividad tallerLiterario1;
	Actividad tallerLiterario2;
	Actividad tallerLiterario3;
	
	//Borrador libro
	BorradorLibro borradorLibro1;
	BorradorLibro borradorLibro2;
	BorradorLibro borradorLibro3;
	BorradorLibro borradorLibro4;
	BorradorLibro borradorLibro5;
	BorradorLibro borradorLibro6;
	BorradorLibro borradorLibro7;
	BorradorLibro borradorLibro8;
	BorradorLibro borradorLibro9;
	
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
	void setUp() throws ErrorSalidaTrekking, ErrorLibro, ErrorViaje{
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
		
		//Borradores de libros
		borradorLibro1 = new BorradorLibro(400, "Español", "Borges");
		borradorLibro2 = new BorradorLibro(400, "Ingles", "Bradbury");
		borradorLibro3 = new BorradorLibro(300, "Frances", "Pepe");
		borradorLibro4 = new BorradorLibro(150, "Español", "Borges");
		borradorLibro5 = new BorradorLibro(200, "Español", "Borges");
		borradorLibro6 = new BorradorLibro(1000, "Portugues", "Ronaldiño");
		borradorLibro7 = new BorradorLibro(400, "Español", "San Martin");
		borradorLibro8 = new BorradorLibro(300, "Ingles", "Obama");
		borradorLibro9 = new BorradorLibro(200, "Ingles", "Spilberg");

		//Inicializacion de instancias de libros
		libro1 = new Libro(borradorLibro1);
		libro2 = new Libro(borradorLibro2);
		libro3 = new Libro(borradorLibro3);
		libro4 = new Libro(borradorLibro4);
		libro5 = new Libro(borradorLibro5);
		libro6 = new Libro(borradorLibro6);
		libro7 = new Libro(borradorLibro7);
		libro8 = new Libro(borradorLibro8);
		libro9 = new Libro(borradorLibro9);
		
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
					//Borrador viaje a ciudad
		borradorViajeACiudad1 = new BorradorViajeCiudad(idiomas1,4);
		borradorViajeACiudad2 = new BorradorViajeCiudad(idiomas4, 10);
					//Viaje a ciudad
		viajeACiudad1 = new ViajeACiudad(borradorViajeACiudad1) ;
		viajeACiudad2 = new ViajeACiudad(borradorViajeACiudad2) ;
					//Borrador viaje a ciudad tropical
		borradorViajeACiudadTropical1 = new BorradorViajeCiudad(idiomas1, 3);
		borradorViajeACiudadTropical2 = new BorradorViajeCiudad(idiomas4, 5);
					//Viaje a ciudad tropical
		viajeCiudadTropical1 = new ViajeCiudadTropical(borradorViajeACiudadTropical1);
		viajeCiudadTropical2 = new ViajeCiudadTropical(borradorViajeACiudadTropical2);
					//Borrador viaje playa
		borradorViajePlaya1 = new BorradorViajePlaya(idiomas1, 1200);
		borradorViajePlaya2 = new BorradorViajePlaya(idiomas2, 5000);
					//Viaje a la playa
		viajePlaya1= new ViajePlaya(borradorViajePlaya1); 
		viajePlaya2= new ViajePlaya(borradorViajePlaya2);
					//Borrador salida trekking
		borradorSalidaTrekking1 = new BorradorSalidaTrekking(idiomas1, 60, 120);
		borradorSalidaTrekking2 = new BorradorSalidaTrekking(idiomas3, 200, 260);
					//Salida de trekking
		salidaTrekking1= new SalidaTrekking(borradorSalidaTrekking1);
		salidaTrekking2= new SalidaTrekking(borradorSalidaTrekking2);
					//Borrador clase de gimnasia
		borradorClaseGym1 = new BorradorClaseGimnasia(idiomas1);
		borradorClaseGym2 = new BorradorClaseGimnasia(idiomas2);
					//clase de gimnasia
		claseGym1= new ClaseGimnasia(borradorClaseGym1);
		claseGym2= new ClaseGimnasia(borradorClaseGym2);
					//borrador taller literario
		borradorTallerLiterario1 = new BorradorTallerLiterario(idiomas1, libros1);
		borradorTallerLiterario2 = new BorradorTallerLiterario(idiomas2,libros2);
		borradorTallerLiterario3 = new BorradorTallerLiterario(idiomas4,libros3);
					//taller literario
		tallerLiterario1 = new TallerLiterario(borradorTallerLiterario1);
		tallerLiterario2 = new TallerLiterario(borradorTallerLiterario2);
		tallerLiterario3 = new TallerLiterario(borradorTallerLiterario3);
		
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
