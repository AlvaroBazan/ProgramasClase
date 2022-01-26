import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);//Linea para crear escaner de teclado.
		//Es siempre igual
		
		System.out.print("Introduzca el número de notas: ");
		int maxNotas =sc.nextInt();
		//int contador =0;
		int acumulador = 0;
		// ponemos la variable que queramos dentro de for "i" en vez de i la que quiera
		for (int i=0 ;i<maxNotas;i++) {
		//while (contador<maxNotas) { el while es una condición sin limite, el for si acaba
			System.out.print("Introduzca la nota del alumno: "+(i+1)+":");
			int nota = sc.nextInt();
			acumulador += nota;
			//contador++;
		}	
		int media = acumulador/maxNotas;
		System.out.print("La media de la clase es: "+media+".");
		
	
	}
}

