
public class arrayBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definiendo un arraid
		//definiendo explicitamente
		int[] arrayNumeros = {10,-2,9,-215};
		String[] coches = {"Mercedes","Opel","Volkswagen","Audi","BMW"};
		
		
		//accediedo al contenido
		System.out.println(coches[0]);
		for(int i=0;i<coches.length;i++) {
			System.out.println(coches[i]);
		}
		System.out.println();
		
		//modificar el contenido
		coches[2]="Dacia";
		//para cada coche que hay en coches imprimeme el coche
		for(String coche:coches) {//ESTRUCTURA FOR EACH
			coche=coche.toUpperCase();
			System.out.println(coche);
		}
		System.out.println();
		
		int[] misNumeritos = {1,2,3,4,5,6,7,8};
		
		for(int numero:misNumeritos) {
			System.out.println(numero);
			
		}
		for(int i=0;i<misNumeritos.length;i++) {
			misNumeritos[i]=misNumeritos[i]+1;
	
		}
		System.out.println();
		for (int numero:misNumeritos) {
			System.out.println(numero);
		}
		int[][]miMatriz = {{1,2,3,4},{5,6,7},{9,10,11,12},{13,14,15,16}};
		for (int []fila:miMatriz) {
			for (int numero:fila) {
				System.out.print(numero+" ");
			}
			System.out.println();
		}
		}
	}

