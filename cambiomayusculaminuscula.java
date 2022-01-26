import java.util.Scanner;
public class cambiomayusculaminuscula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		// TODO Auto-generated method stub
	// TODO Programa que recibe una cadena de caracteres por teclado y 
	//cambia las mayusculas por minusculas y viceversa.
	//Posteriormente imprime la nueva cadena por pantalla.
		System.out.println("Bienvenido al programa que cambia letras.");
		System.out.println("Introduzca una cadena por favor: ");
	
	String cadena = sc.nextLine();
	String cadenaNueva ="";
//procesar la entrada usando funciones preconstruidas en java (recomendado)//	for (int i=0;i<cadena.length();i++) {//si es mayuscula paso a la letra a minuscula
//		char letra = cadena.charAt(i);
//		if (Character.isUpperCase(letra)){
//			cadenaNueva =cadenaNueva + Character.toLowerCase(letra);
//		}else {//si no es mayuscula paso a la letra a mayuscula
//			cadenaNueva = cadenaNueva + Character.toUpperCase(letra);
		
//		}
//	}
	for(int i=0;i<cadena.length();i++) {
		char letra = cadena.charAt(i);
		if(letra>='a' && letra <='z') {
			cadenaNueva =cadenaNueva + Character.toUpperCase(letra);
		}else if (letra >='A' && letra<'Z'){
			cadenaNueva =cadenaNueva + Character.toLowerCase(letra);
			
		}else {
			cadenaNueva = cadenaNueva +letra;
		}
		
	    }
	     
	     System.out.println("la nueva cadena es: "+cadenaNueva);
	}
	}




