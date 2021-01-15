# Actividades y socios de una mutual 
El objetivo del programa es modelar distintas actividades que ofrece la mutual de cocineros "Le grand Chef", y c�mo se manejan los socios respecto de estas actividades.


## 1. Viajes 
En este punto se nos pide modelar los **viajes** que la mutual ofrece a sus socios.

De cada viaje se tienen que poder preguntar cuatro cosas:
- _idiomas_ que se usan durante el viaje.
- si hacer el viaje _implica esfuerzo_ o no.
- si el viaje _sirve para broncearse_ o no.
- _cu�ntos d�as_ lleva la actividad.

Los _idiomas_ se informan expl�citamente para cada viaje. Cada idioma se puede representar como un String, p.ej. "espa�ol" o "italiano".

El resto de la informaci�n requerida depende del _tipo de viaje_, de acuerdo a lo siguiente:

### Viajes de playa.
De cada **viaje de playa** se informa el largo de la playa, medido en metros. 
Para calcular _cu�ntos d�as_ lleva un viaje de playa, se hace esta cuenta: `largo / 500`. Un viaje de playa _implica esfuerzo_ si el largo de la playa supera los 1200 metros. Tdoos los viajes de playa _sirven para broncearse_.

### Excursi�n a ciudad
De cada **excursi�n a ciudad** se informa cu�ntas atracciones se van a visitar. 
Los _d�as_ que lleva un viaje de este tipo se calculan como `cantidad de atracciones / 2`. Una excursi�n _implica esfuerzo_ si se visitan entre al menos 5 atracciones, y nunca _sirve para broncearse_. 

Un caso especial son las **excursiones a ciudad tropical**. Son como las excursiones a ciudad, con las siguientes variantes: dura un d�a m�s que una excursi�n a ciudad de las mismas caracter�sticas, y s� sirve para broncearse, siempre.

P.ej.:
- una excursi�n a ciudad normal (no tropical) en la que se visitan 4 atracciones, lleva 2 d�as, no implica esfuerzo, y no sirve para broncearse. 
- una excursi�n a ciudad tropical en la que se visitan 4 atracciones, lleva 3 d�as, no implica esfuerzo, y s� sirve para broncearse.
- una excursi�n a ciudad normal (no tropical) en la que se visitan 8 atracciones, lleva 4 d�as, implica esfuerzo, y no sirve para broncearse. 
- una excursi�n a ciudad tropical en la que se visitan 8 atracciones, lleva 5 d�as, implica esfuerzo, y sirve para broncearse. 
- una excursi�n a ciudad tropical en la que se visitan 10 atracciones, lleva 6 d�as, no implica esfuerzo, y s� sirve para broncearse. 


### Salida de trekking
De cada una **salida de trekking** se conoce, cu�ntos kil�metros de senderos se van a recorrer caminando, y cu�ntos d�as de sol por a�o tiene el lugar donde se va a hacer.  
Los _d�as_ que lleva una salida se calculan como `kilometros de senderos / 50`. 
Una salida _implica esfuerzo_ si se recorren m�s de 80 kil�metros, y _sirve para broncearse_ si en el lugar hay m�s de 200 d�as de sol por a�o, o hay entre 100 y 200, y se recorren m�s de 120 kil�metros.
 
P.ej. 
* una salida de 100 kil�metros a un lugar con 130 d�as de sol por a�o: lleva 2 d�as, implica esfuerzo, y no sirve para broncearse. 
* una salida de 50 kil�metros a un lugar con 240 d�as de sol por a�o: lleva 1 d�a, no implica esfuerzo, y s� sirve para broncearse.
* una salida de 250 kil�metros a un lugar con 130 d�as de sol por a�o: lleva 5 d�as, implica esfuerzo, y sirve para broncearse. 


## 2. Viajes interesantes
Agregar al modelo la capacidad de preguntar si un viaje _es interesante_. 
Por lo general, la condici�n es que se use m�s de un idioma, p.ej. quechua y aymara, o franc�s, alem�n y h�ngaro. Hay que contemplar estas variantes:
* las _excursiones a ciudad_ (tropical o no) se consideran interesantes si se cumple la condici�n general, **o bien**, se recorren exactamente 5 atracciones (ni m�s ni menos, exactamente 5).
* las _salidas de trekking_ se consideran interesantes si se cumple la condici�n general, **y adem�s** en el lugar hay m�s de 140 d�as de sol por a�o.



## 3. Clases de gimnasia
Agregar al modelo las **clases de gimnasia**, que son otro tipo de actividad que la mutual ofrece a sus socios.

Se deben resolver las mismas cuatro preguntas que para los viajes, que se responden as�:
* _idiomas_: en las clases de gimnasia se usa �nicamente espa�ol.  
**OJO** hay que devolver una _colecci�n_ con un �nico elemento.
* Llevan _1 d�a_.
* Siempre _implican esfuerzo_, y nunca _sirven para broncearse_.


## 4. Socios, agregar actividad
Agregar al modelo los **socios**. De cada socio se debe registrar _qu� actividades realiz�_, que pueden ser viajes o clases de gimnasia. Para cada socio se establece tambi�n un _m�ximo de actividades_ que puede hacer.

Para un socio, se pide:
* poder consultar si es, o no, _adorador del sol_. La condici�n es que todas actividades que realiz� sirven para broncearse.
* poder consultar la colecci�n de _actividades esforzadas_, o sea, las actividades que realiz� que implican esfuerzo.
* registrar que realiza una actividad. Si ya lleg� al m�ximo de actividades que puede hacer, hay que lanzar error.

P.ej. tomemos a Roque, un socio que hizo 2 viajes a la playa, con longitudes de 1000 y 2000 metros respectivamente, y que tiene un m�ximo de 2 actividades. En este caso:
* `roque.esAdoradorDelSol()` devuelve `true`.
* `roque.actividadesEsforzadas()` devuelve una colecci�n que tiene solamente el viaje de 2000 metros de playa.
* si registramos que Roque realiza una clase de gimnasia, se debe generar un error.

Si Ana es una socia que hizo dos viajes iguales a los que hizo Roque, pero tiene un m�ximo de 3 actividades, entonces s� le podemos registrar una clase de gimnasia. Despu�s de registrarla, obtenemos que Ana ya no es adoradora del sol, y su colecci�n de actividades esforzadas incluye al viaje de 2000 metros de playa y a la clase. 


## 5. Actividades que le atraen a cada socio
Se debe agregar al modelo la pregunta de si una actividad _le atrae_ a un socio o no.  
Para ello, se debe agregar para cada socio, la edad, y la colecci�n de idiomas que habla (en realidad, la edad se usa reci�n en el punto siguiente, pero cuesta poco agregarla ahora).  
La condici�n depende del _tipo_ de socio, de acuerdo a lo siguiente:

* si es un **socio tranquilo**, entonces la condici�n es que la actividad lleve 4 d�as o m�s.
* si es un **socio coherente**, entonces: si es adorador del sol, entonces la actividad debe servir para broncearse, si no, debe implicar esfuerzo.
* si es un **socio relajado**, la condici�n es hablar al menos uno de los idiomas que se usan en la actividad. P.ej. si un socio relajado habla espa�ol y quechua, entonces una actividad en espa�ol le va a atraer, una en quechua y aymar� tambi�n, una en franc�s e italiano no. 


## 6. Actividades recomendadas para socios
Agregar la posibilidad de preguntar, para una actividad, si es recomendada para un socio o no.

Para los **viajes**, se deben cumplir tres condiciones: que la actividad sea interesante, que le atraiga al socio, y que el socio no haya realizado ya la misma actividad.

Para las **clases de gimnasia**, la condici�n es que el socio tenga entre 20 y 30 a�os. 


## Bonus: taller literario
Agregar un nuevo tipo de actividad: el **taller literario**. De cada taller se registra sobre qu� libros se trabaja (cada taller trabaja con varios libros). De cada libro se conoce: el idioma, la cantidad de p�ginas, y el nombre del autor.

Para un taller literario tenemos:
* idiomas usados: los de los libros que se trabajan.
* d�as que lleva: la cantidad de libros m�s uno.
* implica esfuerzo: si incluye al menos un libro de m�s de 500 p�ginas, o bien todos los libros son del mismo autor, y hay m�s de uno.
* sirve para broncearse: nunca.
* es recomendado para un socio: la condici�n es que el socio hable m�s de un idioma.