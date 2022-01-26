import java.util.Scanner;

public class quitaespacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String nuevaCadena2 = "";
	
	String nuevaCadena = "";
	//(CODIOG ACCIS)
    //char letra='a'; elemento de un caracter
	//String cadena="El patio de mi casa"; esto se hace para enlazar una cadena de caracteres 
	char letra = '$';
	String cadena = "El patio de mi casa es particular.";
	System.out.println("La letra es la: "+letra); 
	System.out.println("La cadena es:"+cadena);
	int longitud = cadena.length();//calcular la longitud de la cadena
	System.out.println("La cadena es: "+cadena+"tiene la longitud de "+longitud+" caracteres.");
	System.out.println("la cadena y la letra sumadas; "+cadena+letra);
	char letra2 = cadena.charAt(2);//funcion para saber que caracter tienes en la posicion que pongas entre parentesis
	System.out.println("La letra 4 de la cadena "+cadena+" es "+letra2);
	
	for (int i=0;i<cadena.length(); i++) {// esto es un bucle para ir desde la posicion 0 a la 33
		System.out.print(cadena.charAt(i));
	}
	System.out.println();
    for (int i=cadena.length()-1;i>=0;i--) {// esto es un bucle para ir desde la posicion 33 a la 0
			System.out.print(cadena.charAt(i));
	}
    System.out.println();
    for (int i=0;i<cadena.length();i=i+2) {// esto es un bucle para ir desde la posicion 33 a la 0 de dos en dos
		System.out.print(cadena.charAt(i));
    }
    System.out.println();
    for (int i=cadena.length()-1;i>=0;i=i-2) {// esto es un bucle para ir desde la posicion 33 a la 0 de dos en dos
		System.out.print(cadena.charAt(i));
    }

    
    //SIN ESPACIOS
	for (int i = 0; i < cadena.length(); i++) {// esto es un bucle para ir desde la posicion 0 a la 33
		
		if(cadena.charAt(i) != ' ') {
			nuevaCadena = nuevaCadena + cadena.charAt(i);
			
		}
	}
	System.out.println(nuevaCadena);
	//sin espacios invertido
	
	for (int i=(cadena.length()-1);i >= 0; i--) {
		if(cadena.charAt(i)!= ' ') {
			nuevaCadena2= nuevaCadena2 + cadena.charAt(i);
		}
	}
	System.out.println(nuevaCadena2);
}
}
