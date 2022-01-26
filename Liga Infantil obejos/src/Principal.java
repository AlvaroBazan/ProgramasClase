

public class Principal {

	public static void main(String[] args) {
	//creamos un equipo
	/*Equipo newTeam=new Equipo();
	newTeam.setNombre("newTeam");
	newTeam.setClub("newTeam Club S.A.J");
	
	//Creamos al entrenador del equipo
	Entrenador entrenador= new Entrenador();
	entrenador.setNombre("Roberto");
	entrenador.setApellidos("El Brasileño");
	entrenador.setEdad(40);
	entrenador.setNumeroLicencia(12341);
	entrenador.setEquipo(newTeam);
	
	//Metemos jugadores
	int numeroJugadores=22;
	//Generacion de la edad aqui para que todos los niños sean de la misma edad
	int edad= (int)Math.floor(Math.random()*15)+4;// el +4 desplaza cuatro posiciones de 4 al 18
	Jugador[] jugadores=crearJugadores(numeroJugadores,edad,newTeam);
	newTeam.setEntrenador(entrenador);
	newTeam.setJugadores(jugadores);
	System.out.println(newTeam);*/

	  int edad = (int) Math.floor(Math.random()*15)+4; // de 4 a 18
	    Equipo[] listaEquipos = crearEquipo(20, edad);
	  for (Equipo e: listaEquipos) {
	        System.out.println(e);
	  }
	}
	private static Equipo[] crearEquipo(int numeroEquipos, int edad){
		    String[] nombreBarrios = {
		            "El candado", "Huelin", "El Tiro Pichon", "El Rincon de la Victoria",
		    "La Rosaleda", "Torremolinos", "Velez Málaga", "Cerrado de Calderon", "Puerto de la Torre",
		    "Bresca", "Mezquitilla", "Teatinos", "Motril", "Centro", "Santa Paula", "El Palo"};

		    String[] mascotas = {"Los Pollos", "Los Araclanes", "Los Limones", "Los Delfines","Los Chaquetes",
		    "Los Gatitos", "Los Boquerones", "Los Toros", "Los Perritos", "Los Halcones", "Los Ornitorrincos",
		    "Los Palomos Cojos", "Los Heterosaurios", "Las Tortugas Ninjas", "Los Pintarrojas"
		    };

		    Equipo[] listaEquipos = new Equipo[numeroEquipos];

		    for (int i = 0; i < numeroEquipos; i++) {
		        Equipo equipo = new Equipo();

		        int numero = (int) Math.floor(Math.random()*nombreBarrios.length);
		        String barrio = nombreBarrios[numero];

		        equipo.setClub(barrio);

		        numero = (int) Math.floor(Math.random()*mascotas.length);
		        String mascota = mascotas[numero];

		        String nombre = "";
		        if (barrio.startsWith("El ")){
		            barrio = barrio.substring(3);
		            nombre = mascota + " del " + barrio;
		        } else {
		            nombre = mascota + " de " + barrio;
		        }

		        equipo.setNombre(nombre + " F. C.");

		        equipo.setEntrenador(crearEntrenador(equipo));

		        int numeroJugadores = (int) Math.floor(Math.random()*8)+15;
		        Jugador[] jugadores = crearJugadores(numeroJugadores,edad,equipo);
		        equipo.setJugadores(jugadores);

		        listaEquipos[i] = equipo;
		    }

		    return listaEquipos;
		}
	private static Jugador[] crearJugadores(int numeroJugadores, int edad,Equipo equipo) {

		String [] nombres = {"Antonio", "Pepito", "Alejandro", "Ismael","Hugo",
				 "Oliver", "Kalesi", "Ingrid","Astrid","Indira","Jenny",
				 "Jessi", "Vane","Joel","Bruno","Sasha","Billie","Pingu"};
		String[] apellidos= {"Messi","Vinicius","Cristiano","Ronaldo","Pique",
				"Bale (lesionado)", "Amunike", "Butragueño", "N'Kono",
				"Butragueño","Sanchis","Neymar", "Bautista", "Pelé","Beckenbauer"};
		String [] posiciones= {"Portero/a","Defensa","Centrocampista","Delantero/a"};	
		
		//Estructura de array de jugador
		Jugador [] jugadores =new Jugador[numeroJugadores];
		
		for(int i=0;i<numeroJugadores;i++) {
			// crear un jugador
			Jugador jug =new Jugador();
				
			//Nombre	
			int numero=(int)Math.floor(Math.random()*nombres.length);
			String nombre= nombres[numero];
			jug.setNombre(nombre);
			
			
			//Apellidos
			numero=(int)Math.floor(Math.random()*apellidos.length);
			String apellido1= apellidos[numero];
			numero=(int)Math.floor(Math.random()*apellidos.length);
			String apellido2= apellidos[numero];
			jug.setApellidos(apellido1+" "+apellido2);
			
			//Posicion
			numero=(int)Math.floor(Math.random()*posiciones.length);
			String posicion=posiciones[numero];
			jug.setPosicion(posicion);
			
			//Edad
			jug.setEdad(edad);
			
			//Dorsal
			jug.setDorsal(i+1);
			
			//Equipo
			jug.setEquipo(equipo);
			
			//Meter el jugador jug dentro del array jugadores
			//es un puntero de anclaje digamos
			jugadores[i]=jug;
			
	
	}
		return jugadores;
	}
	private static Entrenador crearEntrenador(Equipo equipo) {
		String [] nombres = {"Antonio", "Pepito", "Alejandro", "Ismael","Hugo",
				 "Oliver", "Kalesi", "Ingrid","Astrid","Indira","Jenny",
				 "Jessi", "Vane","Joel","Bruno","Sasha","Billie","Pingu"};
		String[] apellidos= {"Messi","Vinicius","Cristiano","Ronaldo","Pique",
				"Bale (lesionado)", "Amunike", "Butragueño", "N'Kono",
				"Butragueño","Sanchis","Neymar", "Bautista", "Pelé","Beckenbauer"};
		String [] posiciones= {"Portero/a","Defensa","Centrocampista","Delantero/a"};	
		
		Entrenador entrenador = new Entrenador();

		int numero = (int) Math.floor(Math.random()*nombres.length);
		String nombre = nombres[numero];

		numero = (int) Math.floor(Math.random()*apellidos.length);
		String apellido1 = apellidos[numero];
		numero = (int) Math.floor(Math.random()*apellidos.length);
		String apellido2 = apellidos[numero];

		entrenador.setNombre(nombre);
		entrenador.setApellidos(apellido1 + " " + apellido2);
		entrenador.setEquipo(equipo);

		int edad = (int) Math.floor(Math.random()*47)+18; // 18-65
		entrenador.setEdad(edad);
		int numeroLicencia = (int) Math.floor(Math.random() * 100000);
		entrenador.setNumeroLicencia(numeroLicencia);

		return entrenador;


	}
}
