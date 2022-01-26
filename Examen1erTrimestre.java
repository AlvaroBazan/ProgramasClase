import java.util.Scanner;

public class Examen1erTrimestre {
	
	/************** FUNCIONES INCLUIDAS - NO TOCAR *******************/
	
	public static void main(String[] args) {
		int opcion = 6;
		while (opcion!=13) {
			imprimirMenu();
			opcion = leerNumero();
			switch (opcion) {
			case 1:
				limpiarPantalla();
				System.out.println("********* 1.- Leer Cadena ************************");
				System.out.println("Introduce dos o mas palabras: ");
				String cadena=leerPalabra();
				System.out.println("RESULTADO: "+cadena);
				System.out.println("Si solo ves la primera palabra ES CORRECTO.");
				pressEnter();
				limpiarPantalla();
				break;
			case 2:
				limpiarPantalla();
				System.out.println("********* 2.- Pasar a Mayusculas *****************");
				System.out.println("Introduce dos o mas palabras: ");
				cadena=leerPalabra();
				cadena=aMayusculas(cadena);
				System.out.println("RESULTADO: "+cadena);
				System.out.println("Si solo ves la primera palabra y EN MAYUSCULAS ES CORRECTO.");
				pressEnter();
				limpiarPantalla();
				break;
			case 3:
				limpiarPantalla();
				System.out.println("********* 3.- Comparar Cadenas *******************");
				System.out.println("Introduce una cadena cualquiera:");
				String cadena1=aMayusculas(leerPalabra());
				System.out.println("Cadena 1: "+cadena1);
				System.out.println("Introduce otra cadena cualquiera:");
				String cadena2=aMayusculas(leerPalabra());
				System.out.println("Cadena 2: "+cadena2);

				if (comparar(cadena1,cadena2)) {
					System.out.println("Tu comparador dice que son iguales.");
				}else {
					System.out.println("Tu comparador dice que NO son iguales");
				}
				pressEnter();
				limpiarPantalla();
				break;
			case 4:
				limpiarPantalla();
				System.out.println("Si solo ves esta linea y la de abajo, ES CORRECTO.");
				pressEnter();
				limpiarPantalla();
				break;
			case 5:
				limpiarPantalla();
				System.out.println("********* 5.- Buscar letra en Palabra*************");
				System.out.println("Introduce una cadena cualquiera:");
				cadena=aMayusculas(leerPalabra());
				System.out.print("Introduce una letra que SI ESTE en la cadena:");
				char letraBuena=leerLetraMayuscula();
				System.out.println("Has introducido la: "+letraBuena);
				System.out.print("Introduce una letra que NO ESTÃ‰ en la cadena:");
				char letraMala=leerLetraMayuscula();
				System.out.println("Has introducido la: "+letraMala);
				if (estaEnPalabra(letraBuena,cadena)) {
					System.out.println("La "+letraBuena+" estÃ¡ en la palabra. CORRECTO");
					if(!estaEnPalabra(letraMala,cadena)) {
						System.out.println("La "+letraMala+" NO estÃ¡ en la palabra. CORRECTO");
					}else {
						System.out.println("La "+letraMala+" SI estÃ¡ en la palabra. RevÃ­salo");
					}
				}else {
					System.out.println("La "+letraBuena+" NO estÃ¡ en la palabra. RevÃ­salo");
				}
				pressEnter();
				limpiarPantalla();
				break;
			case 6:
				limpiarPantalla();
				System.out.println("********* 6.- Crear Lista de Palabras ************");
				System.out.print("Escribe el número de palabras que vas a introducir: ");
				int numero = leerNumero();
				String[] listaPalabras = crearListaPalabras(numero);
				System.out.println("Palabras Introducidas: ");
				for (String palabra : listaPalabras) {
					System.out.println(palabra);
				}
				System.out.println("Comprueba que están en mayusculas, que están todas y");
				System.out.println("que la última esta justo encima de estas lineas.");
				pressEnter();
				limpiarPantalla();
				break;
			case 7:
				limpiarPantalla();
				System.out.println("********* 7.- Crear Lista de Palabras Ocultas*****");
				String[] listaLimpia = {"ANTONIO","JUAN","LUISA","PEPITA"};
				String[] listaOculta = crearListaPalabrasOcultas(listaLimpia);
				System.out.println("Comparando las originales con sus dobles ocultas.");
				for (int i=0;i<listaLimpia.length;i++) {
					cadena= "Palabra " + (i+1) +": "+ listaLimpia[i]+" "+listaOculta[i]+" ";
					if (listaLimpia[i].length()==listaOculta[i].length() && listaOculta[i].charAt(0)=='-') {
						cadena+="PARECE OK.";
					}else {
						cadena+="NO SON IGUALES o NO SON ----";
					}
					System.out.println(cadena);
				}
				System.out.println("Revisa por si hay algun otro error.");
				pressEnter();
				limpiarPantalla();
				break;
			case 8:
				limpiarPantalla();
				System.out.println("********* 8.- Aciertos en la Lista ***************");
				String[] palabras = {"ANTONIO","JUAN","LUISA","PEPITA"};
				char letra= 'U';
				boolean[] aciertos = aciertosLista(letra,palabras);
				System.out.println("Observa si la salida de tu programa es correcta.");
				for (int i=0; i<aciertos.length; i++) {
					cadena="Palabra " + (i+1) +": "+palabras[i]+" "+"letra "+letra;
					if (aciertos[i]) {
						cadena+=" estÃ¡ en la palabra.";
					}else {
						cadena+=" NO ESTÃ� en la palabra.";
					}
					System.out.println(cadena);
				}
				System.out.println("Revisa por si hay algun otro error.");
				pressEnter();
				limpiarPantalla();
				break;
			case 9:
				limpiarPantalla();
				System.out.println("********* 9.- Inicializar Estados ***************");
				System.out.println("Probando con 4 estados y palabras random.");
				int numeroEstados = 4;
				int[] estados = inicializarEstados(numeroEstados);
				String[] ocultas = {"-------","----","-----","------"};
				imprimirEstados(ocultas,estados);
				System.out.println();
				System.out.println("Comprueba que todo esta a 0 y que no esta ni la horca.");
				pressEnter();
				limpiarPantalla();
				break;
			case 10:
				limpiarPantalla();
				System.out.println("********* 10.- Actualizar Estados ****************");
				int [] estadosCaso10 = {1,2,2,3};
				String[] limpiasCaso10 = {"ANTONIO","JUAN","LUISA","PEPITA"};
				String[] semiocultas = {"ANTON-O","--AN","---SA","----TA"};
				System.out.println("Estado actual: ");
				imprimirEstados(semiocultas,estadosCaso10);
				System.out.println("Metemos la U como letra.");
				letra ='U';
				boolean[] pasadaAciertos = aciertosLista (letra,limpiasCaso10);
				System.out.println("Resultado de aciertosLista: ");
				for (boolean acierto :pasadaAciertos) System.out.print(acierto+" ");
				System.out.println();
				System.out.println("Actualizamos estados (y cadenas a mano aun): ");
				String[] semiocultas2 = {"ANTON-O","-UAN","-U-SA","----TA"};
				estadosCaso10 = actualizarEstados(pasadaAciertos,estadosCaso10);
				System.out.println("Nuevo Estado:  ");
				imprimirEstados(semiocultas2,estadosCaso10);
				pressEnter();
				limpiarPantalla();
				break;
			case 11:
				limpiarPantalla();
				System.out.println("********* 11.- Sustituir letras en Lista**********");
				int [] estadosCaso11 = {1,2,2,3};
				String[] limpiasCaso11 = {"ANTONIO","JUAN","LUISA","PEPITA"};
				String[] semiocultasCaso11 = {"ANTON-O","--AN","---SA","----TA"};
				System.out.println("Estado actual: ");
				for (String semi: semiocultasCaso11) System.out.println(semi);
				System.out.println("Metemos la U como letra.");
				letra ='U';
				semiocultasCaso11 = sustituirLetras(letra,limpiasCaso11,semiocultasCaso11);
				System.out.println("Estado nuevo: ");
				for (String semi: semiocultasCaso11) System.out.println(semi);
				pressEnter();
				limpiarPantalla();
				break;
			case 12:
				limpiarPantalla();
				System.out.println("********* 12.- Jugar al ahorcado express *********");
				System.out.print("Escribe el nÃºmero de palabras que vas a introducir: ");
				numero = leerNumero();
				listaPalabras = crearListaPalabras(numero);
				ahorcadoExpress(listaPalabras);
				pressEnter();
				limpiarPantalla();
				break;
			case 13:
				System.out.println("Fin del Programa");
				break;
			default:
				System.out.println("Opcion Incorrecta");
				pressEnter();                                     }
		}
	}
	public static void imprimirMenu() {
		System.out.println("**************************************************");
		System.out.println("********* AHORCADO EXPRESS ***********************");
		System.out.println("**************************************************");
		System.out.println("********* 1.- Leer Cadena ************************");
		System.out.println("********* 2.- Pasar a Mayusculas *****************");
		System.out.println("********* 3.- Comparar Cadenas *******************");
		System.out.println("********* 4.- Limpiar Pantalla *******************");
		System.out.println("********* 5.- Buscar letra en Palabra*************");
		System.out.println("********* 6.- Crear Lista de Palabras ************");
		System.out.println("********* 7.- Crear Lista de Palabras Ocultas ****");
		System.out.println("********* 8.- Aciertos en la Lista ***************");
		System.out.println("********* 9.- Inicializar Estados ***************");
		System.out.println("********* 10.- Actualizar Estados ****************");
		System.out.println("********* 11.- Sustituir letras en Lista**********");
		System.out.println("********* 12.- Jugar al ahorcado express *********");
		System.out.println("********* 13.- Salir *****************************");
		System.out.println("**************************************************");
		System.out.print("Introduce una opción: ");
	}
	public static int leerNumero() {
		Scanner sc = new Scanner(System.in);
		int numero=sc.nextInt();
		String garbage=sc.nextLine();
		return numero; 
	}
	public static void imprimirEstados(String[] palabrasOcultas, int[] estados) {
		String[][] matrizDibujo = {
				{"             ","             ","             ","             ","             ","             ","____________ "},
				{"             "," |           "," |           "," |           "," |           "," |           ","_|__________ "},
				{" __________  "," |           "," |           "," |           "," |           "," |           ","_|__________ "},
				{" __________  "," |       |   "," |           "," |           "," |           "," |           ","_|__________ "},
				{" __________  "," |       |   "," |       O   "," |           "," |           "," |           ","_|__________ "},
				{" __________  "," |       |   "," |       O   "," |       |   "," |       |   "," |           ","_|__________ "},
				{" __________  "," |       |   "," |       O   "," |      /|\\  "," |       |   "," |           ","_|__________ "},
				{" __________  "," |       |   "," |       O   "," |      /|\\  "," |       |   "," |      / \\  ","_|__________ "}
		};

		System.out.println();
		for (int i=0;i<7;i++) {
			for (int j=0;j<estados.length;j++) {
				System.out.print(matrizDibujo[estados[j]][i]+"   ");
			}
			System.out.println();

		}
		System.out.println();
		for (int i=0;i<palabrasOcultas.length;i++) {
			int contador=0;
			while (contador<15) {
				if (contador<palabrasOcultas[i].length()) {
					System.out.print(palabrasOcultas[i].charAt(contador));
				}else {
					System.out.print(" ");
				}
				contador++;
			}
			System.out.print(" ");
		}     
		System.out.println();
	}
	public static boolean derrota (int[] estados) {
		for (int i=0;i<estados.length;i++) {
			if (estados[i]>=7) {
				return true;
			}
		}
		return false;
	}
	public static boolean victoria (String[] palabrasOcultas, String[] listaPalabras) {
		for (int i=0;i<palabrasOcultas.length;i++) {
			if (palabrasOcultas[i].equals(listaPalabras[i])) {
				return true;
			}
		}
		return false;
	}
	public static char leerLetraMayuscula() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().toUpperCase().charAt(0);
	}
	public static void ahorcadoExpress(String[] listaPalabras) {
		limpiarPantalla();
		int numeroPalabras=listaPalabras.length;
		int[] estados =  inicializarEstados(numeroPalabras);
		String [] listaOcultas = crearListaPalabrasOcultas (listaPalabras);
		while (!victoria(listaOcultas,listaPalabras) && !derrota(estados)) {
			imprimirEstados(listaOcultas,estados);
			System.out.println("Introduce una letra: ");
			char letra =leerLetraMayuscula();
			boolean[] aciertos = aciertosLista(letra,listaPalabras);
			listaOcultas=sustituirLetras(letra,listaPalabras,listaOcultas);
			estados = actualizarEstados(aciertos, estados);
			limpiarPantalla();


		}
		System.out.println("Estado Final: ");
		imprimirEstados(listaOcultas,estados);
		if (derrota(estados)) {
			System.out.println("Has Perdido. Intentalo de Nuevo.");
		}else {
			System.out.println("Has Ganado. Intenta Subir la dificultad.");
		}



	}
	public static void pressEnter()
	{ 
		System.out.println("Presiona Enter para continuar.");
		try
		{
			System.in.read();
		}  
		catch(Exception e)
		{}  
	}

	/************************ FUNCIONES PROPIAS ************************/


	/************** FUNCIONES A DESARROLLAR ****************************/
	// Solo podeis tocar el interior de la funciÃ³n. NO PODEIS CAMBIAR la cabecera, ni los parametros ni el tipo a retornar.
	public static String leerPalabra() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	public static String aMayusculas(String cadena) {
		
		return cadena.toUpperCase();
	}
	public static boolean comparar (String cadena1, String cadena2) {
		//El cÃ³digo que sigue no es funcional. Solo esta puesto aquÃ­ para que el programa compile.
		return cadena1.equals(cadena2);
	}
	public static void limpiarPantalla() {
		for (int i=0;i<30;i++) {
			System.out.println("");
		}
	}
	public static boolean estaEnPalabra(char letra, String palabra) {
		//Rellena el contenido. No modifiques la cabecera.
		//Voy a recorrer una cadena para comprobar si la letra está o no está, en este caso de palabra
		//Me creo mi variable estaLetra de tipo char y le digo que toda la palabra es ahora mi estaLetra en cada posicion
		//si letra esta en mi cadena true. uno menos :)
		for(int i=0;i<palabra.length();i++) {
	      if (letra==palabra.charAt(i)) {
	       return true;
	      }
		}
		return false;
	}
	public static String[] crearListaPalabras(int numeroPalabras) {
	    //El código que sigue no es funcional. Solo esta puesto aquí para que el programa compile.
		//Voy a hacer un array en base al tamaño numero de palabras (numeroPalabra) .
		//Voy a recorer ese número, para que el bucle me recoja cada una de las palabras que introduces en una variable (palabraScanner) 
			
	    String[] palabrasArray = new String[numeroPalabras];
	    for (int i = 0; i < numeroPalabras; i++) {
	        System.out.println("Introduce la palabra número "+"(i+1): "); 
	        palabrasArray[i]=aMayusculas(leerPalabra());
	    }
	    return palabrasArray;
	}
	public static String[] crearListaPalabrasOcultas(String[] listaPalabras) {
		//El cÃ³digo que sigue no es funcional. Solo esta puesto aquÃ­ para que el programa compile.
		//Aqui menos mal que me has hechado un cable con los corchetes y me has dicho lo del doble for mama mia con los arrays:(
		
		String [] ocultas= new String[listaPalabras.length];
		String cadenaNueva="";
		
		for (int i = 0; i < listaPalabras.length; i++) {
			cadenaNueva=listaPalabras[i];
			String guion="";
			for (int j=0;j<cadenaNueva.length();j++)	
				guion = guion+ "-";
				ocultas[i] = guion;
        }
        
    
    return ocultas;
	}
	public static boolean[] aciertosLista(char letra, String[] listaPalabras) {
		//El cÃ³digo que sigue no es funcional. Solo esta puesto aquÃ­ para que el programa compile.
		
		
		boolean[] arrayPalabras = new boolean[listaPalabras.length];
	    for (int i = 0; i < listaPalabras.length; i++) {
	    	arrayPalabras[i]=estaEnPalabra(letra,listaPalabras[i]);
	    }
		return arrayPalabras;
	}
	public static int[] inicializarEstados (int longitud) {
		//El cÃ³digo que sigue no es funcional. Solo esta puesto aquÃ­ para que el programa compile.
		//gracias por la ayuda de array[i] =0 :)) 
		int [] array = new int [longitud];
		for(int i=0;i<longitud;i++) {
			array[i]=0;
		}
		return array;
	}
	public static int[] actualizarEstados (boolean[] aciertos, int[] estados) {
		//El cÃ³digo que sigue no es funcional. Solo esta puesto aquÃ­ para que el programa compile.
		//no me da tiempo falta plantear mi condicion y seguro llevará if else
		
		
		for (int i=0;i<aciertos.length;i++) {
			if (!aciertos[i]) {
				estados[i]++;
			}
		}
			

		return estados;
	}
	public static String[] sustituirLetras(char letra, String[] limpias, String[] ocultas) {
		//El cÃ³digo que sigue no es funcional. Solo esta puesto aquÃ­ para que el programa compile.
		String[] listafinal =new String [limpias.length];
		for(int i=0;i<limpias.length;i++){
			listafinal[i]="";
			for(int j=0;j<limpias[i].length();j++) {
				if(letra==limpias[i].charAt(j)) {
					
				}else {
					listafinal[i]+=ocultas[i].charAt(j);
				}
			}
		}
		return listafinal;

	}

}
