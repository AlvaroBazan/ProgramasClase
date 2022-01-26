import java.util.Scanner;
import java.math.*;

public class practicaformula {
	//x=ax2+bx+c=0 resolver este problema

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a,b,c; // numeros REALES
		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		c = sc.nextDouble();
		
		double interiorRaiz = Math.pow(b, 2)-4*a*c;//igual que float pero otro tipo de nombre pero son NUMEROS REALES y el math.pow como hacer una potencia podria ser (b*b) porque es b2 
		//digamos que en este punto hemos sacado la raiz b2-4ac
		if (interiorRaiz <0) {// si el interior de la raiz es menor que cero sera negativo y no tiene solucion
				System.out.println("La ecuación no tiene solución.");
		}else {
			double solucion;
			if (interiorRaiz ==0) {// si el interior de la raiz es 0 hay solucion -b/(2*a)
				solucion =-b/(2*a);
				System.out.println("La ecuación dada tiene una solucion : x="+solucion);
						
			}else {
				double solucion2;// si el interior de la raiz es > 0 habria esta solucion 2
				solucion=(-b+Math.sqrt(interiorRaiz))/(2*a);// el +- es una solucion que es mas y otra que es menos
				solucion2=(-b-Math.sqrt(interiorRaiz))/(2*a);
				System.out.println("La ecuación dada tiene las soluciones:");
				System.out.println("x1="+solucion);
				System.out.println("x2="+solucion2);
			
		//TAMBIEN SE PODRIA HACER;
				//double interiorRaiz = Math.pow(b, 2)-4*a*c;
				//if (interiorRaiz <0) {
				//		System.out.println("La ecuación no tiene solución.");
				//}else if( interiorRaiz==0)
				//	double solucion;
				//	solucion =-b/(2*a);
				//	System.out.println("La ecuación dada tiene una solucion : x="+solucion);
				//		
				//	}else {
				//      double solucion1;
				//		double solucion2;
				//		solucion=(-b+Math.sqrt(interiorRaiz))/(2*a);
			
				//		solucion2=(-b-Math.sqrt(interiorRaiz))/(2*a);
				//		System.out.println("La ecuación dada tiene las soluciones:");
				//		System.out.println("x1="+solucion);
				//		System.out.println("x2="+solucion2);
			}
		}
		
		}
}
