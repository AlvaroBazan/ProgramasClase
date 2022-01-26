import java.util.Scanner;

public class HundirLaFlota {
	public static final char VACIO='·'; //ES TO ES UN VALOR ESTATICO
	public static final char BARCO='#';
	public static final char AGUA='O';
	public static final char TOCADO='X';
	public static final int SIZE=10;


	public static void main(String[] args) {
		char[][]tablero= {{VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO,}, 
				{VACIO, VACIO, BARCO, BARCO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO,},
				{VACIO, VACIO, VACIO, VACIO, VACIO, BARCO, BARCO, BARCO, VACIO, VACIO,},
				{VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO,},
				{VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO,},
				{VACIO, VACIO, BARCO, BARCO, BARCO, BARCO, VACIO, VACIO, VACIO, VACIO,},
				{VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO,},
				{VACIO, VACIO, VACIO, VACIO, VACIO, BARCO, BARCO, BARCO, VACIO, VACIO,},
				{VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO,},
				{VACIO, VACIO, VACIO, BARCO, BARCO, BARCO, VACIO, VACIO, VACIO, VACIO,},
		};
		System.out.println("************************************");
		System.out.println("BIENVENIDO AL JUEGO DE HUNDIR BARCOS");
		System.out.println("************************************");
		char[][] tableroPropio=pintarFlota(tableroVacio());//
		char[][]tableroEnemigo=tableroVacio();
		if(vasPrimero()) {
			tableroEnemigo=disparoPropio(tableroEnemigo);
		}
		while(!hasPerdido(tableroPropio)){
			pintarTablero(tableroEnemigo);
			pintarTablero(tableroPropio);
			tableroPropio=disparoEnemigo(tableroPropio);
			tableroEnemigo=disparoPropio(tableroEnemigo);
		}
		
		System.out.println("¡Has Perdio!");
		
		tablero=tableroVacio();
		tablero=pintarFlota(tablero);
		pintarTablero(tablero);
		//	pintarFlota(tablero);
		
	}
	public static boolean vasPrimero() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Si vas primero pulsa 1: ");
		int primero=sc.nextInt();
		if(primero==1) { 
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean hasPerdido(char[][]tablero) {
		for(char[] fila:tablero) {
			for(char casilla:fila) {
				if(casilla==BARCO) {
					return false;
				}
			}
		}
		return true;
	}
	public static char[][] disparoPropio(char[][] tablero) {
		System.out.println("Indica tu disparo.");
		Scanner sc=new Scanner(System.in);
		String posicion=sc.next().toUpperCase();
		int fila=posicion.charAt(0)-65;
		int columna=posicion.charAt(1)-48;
		System.out.println("Indica el resultado: ");
		System.out.println("1.-Agua");
		System.out.println("2.-Tocado");
		int resultado=sc.nextInt();
		if(resultado==1) {
			return pintarAgua(tablero,fila,columna);
		}else {
			return pintarTocado(tablero,fila,columna);
		}
		
				
		
		
	}
	public static char[][] disparoEnemigo(char[][] tablero){//este es el que dispara sobre nuestro tablero
		System.out.println("Introduzca coordenadas de disparo: ");
		Scanner sc=new Scanner (System.in);
		pintarTablero(tablero);
		System.out.println("Posicion inicial: ");
		String posicion=sc.next().toUpperCase();
		int fila=posicion.charAt(0)-65;
		int columna=posicion.charAt(1)-48;
		if (tablero[fila][columna]==VACIO) {
			System.out.println("disparo fallido. AGUA!");
			
		}else if (tablero[fila][columna]==BARCO) {
			if(hundido(tablero,fila,columna)) {
			System.out.println("disparo acertado. Hundido!");
				
			}
			System.out.println("disparo acertado. TOCADO!");
			tablero[fila][columna]=TOCADO;
			
		}else {
			System.out.println("Disparo repetido. Torpe!");
		}
		
		return tablero;
	}
	public static boolean hundido(char[][] tablero, int fila, int columna) {
		int nuevaFila=fila;
		int nuevaColumna=columna;
		nuevaFila=fila-1;//Comprueba ARRIBA	
		if (tablero[nuevaFila][nuevaColumna]==BARCO) {
			return false;
	   }else if(tablero[nuevaFila][nuevaColumna]==TOCADO){//HAY MAS BARCO ROTO QUE SEGUIR
		   
		   while(true) {
			   if  (nuevaFila==0) {//me salgo del mapa
				   return true;
			   }else if (nuevaFila==SIZE) {//me salgo del mapa
				return true;
			
			   }else if(tablero[nuevaFila][nuevaColumna]==AGUA) {//LLEGO AL FINAL Y HAY AGUA
				   return true;
			   }else if(tablero[nuevaFila][nuevaColumna]==VACIO) {// llego al final y hay vacio
				   return true;
			   }  else if (tablero[nuevaFila][nuevaColumna]==BARCO) {//llego al final y hay un cacho de barco.
				   return false;
			   }
			   fila--;
			   }
		   } 
		   
		   
	   
		return false;
		   }
	public static char[][] pintarFlota(char[][] tablero) {
		int factor=SIZE/2;//ESTE ES EL FACTOR QUE HEMOS DETERMINADO EN NUESTRA FORMULA
		for(int i=factor-1;i>=1;i--) {//tamaño del barco
			for(int j=1; j<=factor-i;j++) {//numero de barcos
				System.out.println("Pon Barco de Tamaño "+i+" numero: "+j+"/"+(factor-i));
				tablero=ponerBarco(tablero,i);
			}

		}
		return tablero;
	}
	public static char[][]pintarAgua(char[][]tablero,int fila,int columna){
		tablero[fila][columna]=AGUA;
		return tablero;
	}
	public static char[][]pintarTocado(char[][]tablero,int fila,int columna){
		tablero[fila][columna]=TOCADO;
		return tablero;
	}
	public static char[][] tableroVacio(){
		char[][]tablero = new char[SIZE][SIZE];
		for (int i=0;i<SIZE;i++) {
			for (int j=0;j<SIZE;j++) {
				tablero[i][j]=VACIO;
			}
		}
		return tablero;

	}
	public static void pintarTablero(char[][] tablero) {
		System.out.println("   0  1  2  3  4  5  6  7  8  9");
		int contador=0;
		for (char[] fila:tablero) {
			System.out.print((char)(65+contador)+"  ");
			contador++;
			for(char casilla:fila) {
				System.out.print(casilla+"  ");
			}
			System.out.println();
		}

	}
	public static char [][]ponerBarco(char[][] tablero,int barco){
		Scanner sc=new Scanner (System.in);
		pintarTablero(tablero);
		System.out.println("Posicion inicial: ");
		String posicion=sc.next().toUpperCase();
		int fila=posicion.charAt(0)-65;
		int columna=posicion.charAt(1)-48;

		boolean posicionado=false;
		while (!posicionado) {
			System.out.println("Introduzca una dirección: ");
			System.out.println("1.-Arriba");
			System.out.println("2.-Abajo");
			System.out.println("3.-Izquierda");
			System.out.println("4.-Derecha");
			System.out.println("otro.-Cancelar");
			int direccion=sc.nextInt();
			if (direccion<1||direccion>4) {
				return tablero;
			}else {
				//comprobar si es posicionable
				posicionado= esPosicionable(tablero,barco,fila,columna,direccion);
				if(posicionado) {
					tablero=pintarBarco(tablero,barco,fila,columna,direccion);
				}else {
					System.out.println("Error al posicionar el barco de tamaño. "+barco+
							" en la posicion "+(char)(fila+65)+" "+columna+".");
				}
			}
		}


		return tablero;

	}
	public static char[][] pintarBarco(char[][] tablero, int barco, int fila, int columna, int direccion) {
		switch(direccion) {//usamos el swith porque hay varios casos
		case 1://arriba

			for(int i=fila;i>fila-barco;i--) {
				tablero[i][columna]=BARCO;



			}
			return tablero;



		case 2://abajo	

			for(int i=fila;i<fila+barco;i++) {
				tablero[i][columna]=BARCO;


			}	
			return tablero;



		case 3://izquierda

			for(int i=columna;i>columna-barco;i--) {
				tablero[fila][i]=BARCO;

			}
			return tablero;


		default://derecha	
			for(int i=columna;i<columna+barco;i++) {
				tablero[fila][i]=BARCO;

			}
			return tablero;

		}
	}
	private static boolean esPosicionable(char[][] tablero, int barco, int fila, int columna, int direccion) {
		if (tablero[fila][columna]==BARCO) {
			System.out.println("La posicion esta ocupada. Cancelar Operación.");
			return false;
		}else {
			switch(direccion) {//usamos el swith porque hay varios casos
			case 1://arriba
				if (barco-fila<=1) {
					for(int i=fila;i>fila-barco;i--) {
						if(tablero[i][columna]==BARCO) {
							System.out.println("Barco en posicion "+(char)(i+65)+" "+columna+".");
							return false;

						}

					}
					return true;

				}else{
					System.out.println("Barco se sale del tablero por arriba.");
					return false;
				}

			case 2://abajo	
				if (barco+fila<=SIZE) {
					for(int i=fila;i<fila+barco;i++) {
						if(tablero[i][columna]==BARCO) {
							System.out.println("Barco en posicion "+i+" "+columna+".");
							return false;

						}

					}
					return true;

				}else{
					System.out.println("Barco se sale del tablero por abajo.");
					return false;
				}
			case 3://izquierda
				if (barco-columna<=1) {
					for(int i=columna;i>columna-barco;i--) {
						if(tablero[fila][i]==BARCO) {
							System.out.println("Barco en posicion "+fila+" "+(char)(i+65)+".");
							return false;

						}

					}
					return true;

				}else{
					System.out.println("Barco se sale del tablero por ala izquierda.");
					return false;
				}

			default://derecha	
				if (barco+columna<=SIZE) {
					for(int i=columna;i<columna+barco;i++) {
						if(tablero[fila][i]==BARCO) {
							System.out.println("Barco en posicion "+fila+" "+(char)(i+65)+".");//el +(char)(i+65)+ lo que haces es transformar el numero en letra
							return false;

						}

					}
					return true;

				}else{
					System.out.println("Barco se sale del tablero por la derecha.");
					return false;
				}	
			}
		}

	}

}


