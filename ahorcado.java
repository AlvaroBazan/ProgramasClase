import java.util.Scanner;

public class ahorcado {

	public static void main(String[] args) {
		System.out.println("Introduzca la palabra a descrubir: ");
		String palabra=leerPalabra();
		
		if (juego(palabra)>=7) {
			System.out.println("Has perdido.");

		}else {
			System.out.println("Has ganado.");
		}		
	}
	public static void pintaAhorcado(int estado) {
		switch(estado) {
		case 0:
			System.out.println("");		
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(""); 		
			System.out.println("|___________");
			break;
		case 1:
			System.out.println("");		
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|"); 		
			System.out.println("|___________");
			break;
		case 2:
			System.out.println("__________");		
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|"); 		
			System.out.println("|___________");
			break;
		case 3:
			System.out.println("__________");		
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|"); 		
			System.out.println("|___________");
			break;
		case 4:
			System.out.println("__________");		
			System.out.println("|        |");
			System.out.println("|        O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|"); 		
			System.out.println("|___________");
			break;
		case 5:
			System.out.println("__________");		
			System.out.println("|        |");
			System.out.println("|        O");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|"); 		
			System.out.println("|___________");
			break;
		case 6:
			System.out.println("__________");		
			System.out.println("|        |");
			System.out.println("|        O");
			System.out.println("|       /|\\");
			System.out.println("|        |");
			System.out.println("|"); 		
			System.out.println("|___________");
			break;
		default:
			System.out.println("__________");		
			System.out.println("|        |");
			System.out.println("|        O");
			System.out.println("|       /|\\");
			System.out.println("|        |");
			System.out.println("|       / \\"); 		
			System.out.println("|___________");
			break;
		}
	}

	public static String leerPalabra() {
		Scanner sc=new Scanner (System.in);

		return sc.next().toUpperCase();// esto es para retornar directamente una cadena en mayusculas, nos comemos el next line agregamos parentesis y . tuppercase para las mayusculas

	}

	
	public static char leerLetra() {// para meter una letra solo usamos char.
		Scanner sc=new Scanner(System.in);

		return Character.toUpperCase(sc.next().charAt(0));// queremos que la devuelva directamente sin crear una variable siendo la primera letra el 0 charAt (0)
		//ademas hacemos que sea una palabra en mayusculas con Character.toUpperCase.

	}

	public static String pasarAGuiones(String cadena) {
		String objetivo="";
		for (int i=0;i<cadena.length();i++) {
			objetivo=objetivo+"-";//esto lo hacemos para saber las rayitas de la palabra que vamos a pedir
		}	
		return objetivo;
	}

	public static void limpiaPantalla() {//esto limpia el terminal
		for(int i=0;i<200;i++) {
			System.out.println();
		}

	}
	
	public static int juego(String palabra) {
		int estado =0;
		limpiaPantalla();
		pintaAhorcado(estado);
		String resultado=pasarAGuiones(palabra);
		System.out.println(resultado);


		while(estado<7 && !palabra.equals(resultado)) {// mientras que estado sea mayor que 7 y palabra sea igual al resultado
			// se usa el metodo equals porque son cadenas de caracteres distintos.
			System.out.println("introduzca una letra: ");
			char letra =leerLetra();
			boolean acierto=false;
			String temporal="";
			for (int i=0;i<palabra.length();i++) {
				if (resultado.charAt(i)!='-') {//esta letra ya la tenia
					temporal=temporal+resultado.charAt(i);
				}else {// si hay un guion en resultado tengo que mirar en palabra
					if (letra==palabra.charAt(i)) {//la letra coincide con la que hay en palabra
						acierto=true;
						temporal=temporal+letra;
					}else {//la letra no coincide con la que hay en palabra
						temporal=temporal+'-';
					}
				}
				resultado=temporal;
				if(!acierto) {
					estado++;
				}limpiaPantalla();
				pintaAhorcado(estado);
				System.out.println(resultado);
			}
		}
		return estado;
	}
}
