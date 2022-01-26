import java.util.ArrayList;

public class abecedario {

	public static void main(String[] args) {
		//String[] listaPalabras = {"a"};
		//String[] cadena = new String[10];
			
		Character[] array = new Character[26];
		String cadena="hola";
		
		for(int i = 0; i < 26; i++) {
			array[i] = (char) (i + 97);
			System.out.print(array[i]);
			
		}
		System.out.println();
		
		for (int x=0; x<cadena.length();x++) {
			for (int k=0;k<array.length;k++) {
				if(cadena.charAt(x)==array[k]) {
					System.out.println("En la cadena "+ cadena +" la posicion "+ cadena.charAt(x)+ " es " + k + " en el array");
				}
			}
			
		}

	}
	}
