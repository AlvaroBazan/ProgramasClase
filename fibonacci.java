import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Scanner sc = new Scanner(System.in);//Linea para crear escaner de teclado.
	
		System.out.print("�Qu� n�mero de la serie de Fibonacci quieres?: ");
		int numero = sc.nextInt();
		
		if (numero<3) {
			System.out.print("El numero en la posici�n "+numero+" es el 1.");
		}else {
			int fib1 = 1;
			int fib2 = 1;
			System.out.print("1 1");
			for(int i=3;i<=numero;i++) {
				int fib3 =fib1+fib2;
				System.out.print(" "+fib3);
				fib1 =fib2;
				fib2 = fib3;
			}
		}
	}
}