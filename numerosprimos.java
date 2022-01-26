import java.util.Scanner;

public class numerosprimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//Linea para crear escaner de teclado.

		System.out.print("introduzca el número a probar: ");
		//para que el numero lo coja el programa y lo meta dentro de la variable usamos int variable que quereamos llamar = sc.nextInt (para numeros enteros) nextfloat (para numeros flotantes)
		int numero = sc.nextInt();

		//Concepto de booleano verdadero o falso // valor de la variable que nos sirva para levantar una banderita y que finalice el programa por ejemplo// o shich
		boolean esPrimo = true;
		int divisor = numero/2;

		while (esPrimo && divisor>1) {
			int resto=numero%divisor;
			System.out.println("Numero: "+numero+", Divisor: "+divisor+", Resto: "+resto);
			if (resto==0)
				esPrimo = false;

			divisor --;//bajar a un numero siguiente para poder seguir dividiendo
		
		}
		if (esPrimo) {
			System.out.println("El número "+numero+" es primo.");
		}else {
			System.out.println("El número "+numero+" no es primo.");
		}

	}

}
