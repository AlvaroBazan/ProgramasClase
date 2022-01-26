
import java.util.Scanner;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Timer;
public class MEDUSA {
	public static void main(String[] args) throws IOException {

		int opcion=0;

		while (opcion !=4) {

			imprimirMenu();
			opcion=leerNumero();

			switch (opcion) {
			case 1:
				cifrador();
				esperaPulsacion();
				limpiaPantalla();
				break;
			case 2:
				desCifrador();
				esperaPulsacion();
				limpiaPantalla();
				break;
			case 3:
				medusa();
				esperaPulsacion();
				limpiaPantalla();
				break;
			case 4:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Ese número no existe en el menú.");
				System.out.println();
				System.out.println("Pulse una tecla para continuar.");
				esperaPulsacion();
				limpiaPantalla();


			}
		}


	}
	private static void desCifrador() {
		System.out.println();
		System.out.println("Opción 2.- Descifrador.");
		System.out.print("introduzca el mensaje cifrado: ");
		String mensaje=leerMensaje();
		System.out.print("Ahora dame una posición del cuarto rotor: ");
		int posicion4=leerNumero();
		System.out.print("Ahora dame una posición del tercer rotor: ");
		int posicion3=leerNumero();
		System.out.print("Ahora dame una posición del segundo rotor: ");
		int posicion2=leerNumero();
		System.out.print("Ahora dame una posición del primer rotor: ");
		int posicion1=leerNumero();

		String cuatro=CuartoRotorDescifrado(mensaje, posicion4);
		String tercero=TercerRotorDescifrado(cuatro, posicion3);
		String segundo=SegundoRotorDescifrado(tercero, posicion2);
		String primero=PrimerRotorDescifrado(segundo, posicion1);

		System.out.println();
		System.out.println("El mensaje descifrado es el siguiente: " + primero);
	}
	private static void cifrador() {
		System.out.println();
		System.out.println("Opción 1.- Cifrador");
		System.out.print("Introduzca un mensaje: ");
		String mensaje=leerMensaje();
		System.out.print("Ahora dame una posición del primer rotor: ");
		int posicion1=leerNumero();
		System.out.print("Ahora dame una posición del segundo rotor: ");
		int posicion2=leerNumero();
		System.out.print("Ahora dame una posición del tercer rotor: ");
		int posicion3=leerNumero();
		System.out.print("Ahora dame una posición del cuarto rotor: ");
		int posicion4=leerNumero();

		String uno = PrimerRotorCifrado(mensaje, posicion1);
		String dos = SegundoRotorCifrado(uno, posicion2);
		String tres = TercerRotorCifrado(dos, posicion3);
		String cuatro = CuartoRotorCifrado(tres, posicion4);

		System.out.println();
		System.out.println("El mensaje cifrado es el siguiente: " + cuatro);
	}
	private static String leerMensaje() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();

	}
	private static void limpiaPantalla() {
		for (int i=0;i<50;i++) {
			System.out.println("");
		}	
	}
	private static int leerNumero() {
		Scanner sc= new Scanner(System.in);
		return sc.nextInt();
	}
	private static void esperaPulsacion() {
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("Pulse una tecla para continuar...");
		sc.nextLine();	

	}
	private static void imprimirMenu() {
		System.out.println("***Este es un programa creado por Adolfo, Álvaro y Juan Antonio.***");
		System.out.println();
		System.out.println("********Opciones del Menú**********");
		System.out.println("1.- Cifrador.");
		System.out.println("2.- Descifrador.");
		System.out.println("3.- Romper codigo cifrado con medusa.");
		System.out.println("4.- Salir del programa");
		System.out.println("***********************************");
		System.out.println();
		System.out.print("Por favor, seleccione una de las siguientes opciones: ");

	}
	public static void medusa() throws IOException {
		System.out.println();
		System.out.println("Opción 3.- Medusa");
		System.out.print("Introduzca el mensaje cifrado: ");
		String mensaje=leerMensaje();
		MedusaF(mensaje);
	}
	public static void MedusaF(String cifrado) throws IOException {
		// Palabras que he quitado porque aparecen demasiado: "sur"(aparece un monton),,"norte","oeste","zona""del","sur","Eva""URSS""EEUU",,"mayo","Nube","Mayo""Luna",,"orden","Orden"
		String[] listaPalabras = {"Hitler","muerte","Brown","suicidio", "tanque", "muerte", "ataque", "canal", "barco", "tiempo", "temperatura", "posicion","objetivo", "ingleses","britanicos","localizacion",
				"coordenada","coordenadas","lugar","misil","hundido","donde","cuando","objetivo","marcado","comunicado","comunicacion","contacto","colision","choque","divisar","avistar","avistamiento",
				"ataque","fuego","hundir","inmersion", "tiburon","tiburones","rumor","rumores","bulos","alemanes","propiedad","Buque", "viento", "tierra","latitud","altitud","eninga","robar","robado",
				"medusa", "pistola", "refugio","bombardeo","canciller","cancilleria","búnker","Reich","Adolf","noticia","Reichsmarschall", "Berlin","berlin","Estalingrado",
				"estalingrado","sovietica","union","unión","Joseph","veneno","Stalin","stalin","submarino","u-boat","argentina","Argentina","rodeados","rodear","asedio","defensa",
				"enero","Enero","Febrero","Febrero","marzo","Marzo","Abril","abril","junio","Junio","Agosto","Septiembre","Octubre","Noviembre","Diciembre","agosto","septiembre","octubre","noviembre","diciembre",
				"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo","lunes","martes","miercoles","jueves","viernes","sabado","domingo",
				"Victoria","Derrota","Empezar","Terminar","victoria","derrota",
				"cambiar","mejorar","construir","puente","desembarcar",
				"bosque","desierto","arena","montaña","llanura","planicie",
				"Francia","Ingraterra","Tokio","Kioto",
				"Primavera","Verano","Otoñó","Invierno"," Eva Brown ",
				"radio","comunicaciones","morse","television","prensa","comunicacion","imagenes","transmision","transmitir",
				"Estrellas","Orizonte","Cielo","Despejado","Lluvia","Tormenta","Temporal","Marea","Marejada",
				"Aviones","aviones","Avion","avion","pacífico","pacifico","Pacifico","Pacífico","Oceano","Japón","Hawai","Hawai","Panzer","Tanque","tanque","Aliados","Estrategia",
				"Segunda","Division","Primera","recluta","reclutar",
				"Wistom","Churchill","Artilleria","artilleria","torpedo","Torpedo","Pajaro","Aguila","pajaro","aguila","águila","tortuga","combate","coronel","teneiente","oficial","soldado","general","capital","marine",
				"america","mayor","uniforme","prisionero","exiliado","compatriota","patria","desertar","desertor","incursion","rango","traidor","fusilamiento","fusilar","peloton",
				"vivir","morir","sobrevivir","muerte",
				"Reichsleiter Bormann","Reichsleiter","Bormann",
				"primero","segundo","tercero","cuarto","quinto","sexto","septiemo","octavo","noveno","decimo","undecimo","Panzer", "Dision","Motorizada",
				"Informe","Tiempo","MENSAJE","examen","ejercicio","entre","clases","objetos","estudiar","plantilla","Ejercicio","preparado", "Pregunta","ejemplo","objeto","práctica",
				"superar","navidad","donde"
		};

		File file = new File("C:\\resultado.txt");


		// Si el archivo no existe es creado
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i <= 99; i++) {
			String primerDescifrado = CuartoRotorDescifrado(cifrado, i);

			for (int j = 0; j <= 99; j++) {
				String segundoDescifrado = TercerRotorDescifrado(primerDescifrado,j);

				for (int k = 0; k <= 99; k++) {
					String tercerDescrifrado = SegundoRotorDescifrado(segundoDescifrado,k);

					for (int l = 0; l <= 99; l++) {
						String cuartoDescifrador = PrimerRotorDescifrado(tercerDescrifrado, l);

						for (int t = 0; t <= listaPalabras.length-1; t++) {
							if (cuartoDescifrador.contains(listaPalabras[t])){
								int index = cuartoDescifrador.indexOf(listaPalabras[t]);
								//System.out.println("Posicion: "+ index +  " Palabra: "+listaPalabras[t]);

								String solucion = "";
								for (int z = 0; z < cuartoDescifrador.length(); z++) {
									if (z!=index){
										solucion = solucion + " ";
									} else {
										solucion = solucion + listaPalabras[t];
									}
								}

								try{
									bw.write("\nPosicion Rotores: "+i +" " +j+ " " +k+ " " +l+ " " +"\n"+solucion+"\n"+cuartoDescifrador+"\n");
								} catch (IOException e) {
									e.printStackTrace();
								}

								System.out.println("\nPosicion Rotores: "+i +" " +j+ " " +k+ " " +l+ " " +"\n"+"Solucion: "+solucion + "\n "+cuartoDescifrador);
								//System.out.println("Posicion Rotores: "+i+j+k+l + " Palabra -> " + listaPalabras[t] + " Mensaje -> "+cuartoDescifrador);


							}
						}
					}
				}
			}
			System.out.println(i+"%");
		}
		System.out.println("Fin del Todo");
		bw.close();
		fw.close();
	}
	public static String PrimerRotorDescifrado(String cifrado,int posicion) {
		int contador = 0;
		String descifrada = "";
		int dimension = 3;

		for( int i = 0; i < cifrado.length() ; i++) {
			Character letra = cifrado.charAt(i);
			int rango = letra;
			//r ASCII nº 32 (el espacio) hasta el valor 126 (El símbolo ~),

			if(contador < dimension && rango>=32 && rango<=126 ) {
				descifrada = descifrada + Descifrar(letra, posicion);
				contador++;
			} else if(contador < dimension * 2){
				descifrada = descifrada + letra;
				contador++;
			}else {
				descifrada = descifrada + Descifrar(letra, posicion);
				contador = 1;

			}
		}
		return descifrada;
	}
	public static String SegundoRotorDescifrado(String cadena, int posicion) {
		String cifrado = "";

		for(int i = 0; i < cadena.length(); i++) {
			Character letra = cadena.charAt(i);
			int rango = letra;

			if(i % 2 == 0 && rango>=32 && rango<=126) {
				cifrado = cifrado + Descifrar(letra, posicion);
				posicion += 11;
			}else {
				cifrado = cifrado + letra;
			}
		}
		return cifrado;
	}
	public static String TercerRotorDescifrado(String cadena, int posicion) {
		String cifrando = "";
		String salida = "";

		// Si la longitud de la cadena es PAR
		if (cadena.length()%2 == 0){
			for (int l = 0; l < cadena.length(); l++) {
				Character letra = cadena.charAt(l);
				int rango = letra;
				if(l % 2 == 0 && rango>=32 && rango<=126) {
					cifrando = cifrando + Descifrar(letra, posicion);
					posicion += 23;
				}else {
					cifrando = cifrando + letra;
				}
			}

			for(int k = cifrando.length()-1; k >= 0; k--) {
				Character letra = cifrando.charAt(k);
				salida = salida + letra;
			}

			// Si la cadena es IMPAR
		} else {
			for (int i = 0; i < cadena.length(); i++) {
				Character letra = cadena.charAt(i);
				int rango = letra;
				if(i % 2 != 0 && rango>=32 && rango<=126) {
					cifrando = cifrando + Descifrar(letra, posicion);
					posicion += 23;
				}else {
					cifrando = cifrando + letra;
				}
			}

			for(int j = cifrando.length() - 1; j >= 0; j--) {
				Character letra = cifrando.charAt(j);
				salida = salida + letra;
			}

		}

		return salida;
	}
	public static String CuartoRotorDescifrado(String cadena, int posicion) {
		String convertida = "";
		String salida = "";
		int salto = 5;
		int contador = 0;

		for( int i = 0; i < cadena.length(); i++) {
			Character letra = cadena.charAt(i);
			int rango  = letra;

			if(contador < salto && rango>=32 && rango<=126) {
				convertida = convertida + Descifrar(letra, posicion);
				contador++;
			} else if(contador < salto * 2){
				convertida = convertida + letra;
				contador++;
			}else {
				convertida = convertida + Descifrar(letra, posicion);
				contador = 1;
			}
		}

		for(int j = convertida.length() - 1; j >= 0; j--) {
			salida = salida + convertida.charAt(j);
		}
		return salida;
	}
	public static char Descifrar (char letra, int valor) {
		int codigo=(int)letra;
		int desplazamiento = codigo-valor%95;
		int resultado;
		if (desplazamiento<32) resultado=desplazamiento+95;
		else resultado=desplazamiento;
		return (char)resultado;
	}
	public static String PrimerRotorCifrado(String mensaje,int posicion) {
		int contador = 0;
		String transformada = "";
		int dimension = 3;

		for( int i = 0; i < mensaje.length(); i++) {
			Character letra = mensaje.charAt(i);

			if(contador < dimension) {
				transformada = transformada + Cifrar(letra, posicion);
				contador++;
			} else if(contador < dimension * 2){
				transformada = transformada + letra;
				contador++;
			}else {
				transformada = transformada + Cifrar(letra, posicion);
				contador = 1;
			}
		}
		return transformada;

	}
	public static String SegundoRotorCifrado(String cadena, int posicion) {
		String cifrado = "";

		for(int i = 0; i < cadena.length(); i++) {
			Character letra = cadena.charAt(i);

			if(i % 2 == 0) {
				cifrado = cifrado + Cifrar(letra, posicion);
				posicion += 11;
			}else {
				cifrado = cifrado + letra;
			}
		}
		return cifrado;
	}
	public static String TercerRotorCifrado(String cadena, int posicion) { //BIEN HECHO
		String cifrado = "";

		for(int i = cadena.length() - 1; i >= 0; i--) {
			Character letra = cadena.charAt(i);
			if(i % 2 != 0) {
				cifrado = cifrado + Cifrar(letra, posicion);
				posicion += 23;
			}else {
				cifrado = cifrado + letra;
			}
		}
		return cifrado;
	}
	public static String CuartoRotorCifrado(String cadena, int posicion) {
		String convertida = "";
		String invertida = "";
		int dimension = 5;
		int contador = 0;



		for( int i = cadena.length() - 1; i >= 0; i--) {
			Character letra = cadena.charAt(i);

			if(contador < dimension) {
				convertida = convertida + Cifrar(letra, posicion);
				contador++;
			} else if(contador < dimension * 2){
				convertida = convertida + letra;
				contador++;
			}else {
				convertida = convertida + Cifrar(letra, posicion);
				contador = 1;
			}
		}
		return convertida;
	}
	public static char Cifrar (char letra, int valor) {
		int codigo=(int)letra;
		int desplazamiento = codigo+valor%95;
		int resultado;
		if (desplazamiento>126) resultado=desplazamiento-95;
		else resultado=desplazamiento;
		return (char)resultado;
	}

}
