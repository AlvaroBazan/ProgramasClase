import java.util.Scanner;



public class practicaProgramacionAlvaro {




	public static void main(String[] args) {
		
		
		int operacion=1;//le doy valor 1 a la variable para que entre al while

		while (operacion !=0) {// mientras que lo que introduzcas por teclado (un número) en la variable operacion sea distinto de 0 el programa seguirá funcionando.

			imprimirMenu();
			System.out.println("Introduzca el número de la operacion que desea realizar: ");

			operacion=leerEntrada();

			switch (operacion) {
			case 0:
				System.out.println("Saliendo.");
				break;
			case 1:
				calculadora();
				esperaPulsacion();
				break;
			case 2:
				fibonacci();
				esperaPulsacion();
				break;
			case 3:
				numeroPrimo();
				esperaPulsacion();
				break;
			case 4:
				cambioMonedas();
				esperaPulsacion();
				break;
			case 5:
				ecuacion();
				esperaPulsacion();
				break;
			case 6:
				fraseSinEspacios();
				esperaPulsacion();
				break;
			case 7:
				invertir();
				esperaPulsacion();
				break;
			case 8:
				contarVocalesYConsonantes();
				esperaPulsacion();
				break;
			case 9:
				cambioMayusculasAMinusculas();
				esperaPulsacion();
				break;
			case 10:
				calculaLasVacaciones();
				esperaPulsacion();
				break;
			case 11:
				extractorDeVocales();
				esperaPulsacion();
				break;
			case 12:
				factorial();
				esperaPulsacion();
				break;
				
			case 13:
				esPalindromo();
				esperaPulsacion();
				break;
				
			case 14:
				encriptador();
				esperaPulsacion();
				break;
			case 15:
				diamanteDeAsteriscos();
				esperaPulsacion();
				break;
				
				
			default:
				System.out.println("Ese número no existe en dominó.");
				System.out.println();
				System.out.println("Pulse una tecla para continuar.");
				esperaPulsacion();


			}
		}


	}


	public static void diamanteDeAsteriscos() {
		System.out.println("Introduzca un número y el programa dibujará un diamante.");
		int vertical=leerEntrada();
		int largo=0;
		int alto=0;
		
		for (int i=0;i<vertical;i++) {
			if(vertical%2==0) {
			System.out.println("*");
			}else {
				largo=largo +vertical;
				System.out.println("0");
			}
			}
	}
	
	public static void encriptador() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una frase para que sea encripatada.");
		String cadena=leerPalabra();
		String cadenaNueva="";
		cadena=cadena.toLowerCase();
		System.out.println("Ahora introduzca la letra E si desea que las vocales se desplacen a la derecha, o la D si desea que se desplacen a la izquierda.");
		String letra=leerPalabra();
		letra=letra.toLowerCase();
		
		if (letra.equals("e")) {
			for (int x=0;x<cadena.length();x++) {//He llamado x a la variable que calcula la cadena como podia haberla llamado i.
		
				if (cadena.charAt(x)=='a') {
					cadenaNueva=cadenaNueva+'e';
				} else if(cadena.charAt(x)=='e') {
					cadenaNueva=cadenaNueva+'i';
				} else if(cadena.charAt(x)=='i') {
					cadenaNueva=cadenaNueva+'o';
				} else if(cadena.charAt(x)=='o') {
					cadenaNueva=cadenaNueva+'u';
				} else if(cadena.charAt(x)=='u') {
					cadenaNueva=cadenaNueva+'a';
				}else {
					cadenaNueva=cadenaNueva+cadena.charAt(x);
				}
			}
			System.out.println(cadenaNueva);
		}else if (letra.equals("d")) {
			for (int x=0;x<cadena.length();x++) {
				
				if (cadena.charAt(x)=='a') {
					cadenaNueva=cadenaNueva+'u';
				} else if(cadena.charAt(x)=='e') {
					cadenaNueva=cadenaNueva+'a';
				} else if(cadena.charAt(x)=='i') {
					cadenaNueva=cadenaNueva+'e';
				} else if(cadena.charAt(x)=='o') {
					cadenaNueva=cadenaNueva+'i';
				} else if(cadena.charAt(x)=='u') {
					cadenaNueva=cadenaNueva+'o';
				}else {
					cadenaNueva=cadenaNueva+cadena.charAt(x);
				}
		}
			System.out.println(cadenaNueva);
			
		}else {
			System.out.println("La letra que ha introducido no es correcta.");
		}
	}
	
	public static void esPalindromo() {
		//Dabale arroz a la zorra el abad		
		System.out.println("Escribe la frase: ");
		String cadena=leerPalabra();
		String cadena2="";
		String invertida="";
		cadena += cadena.toLowerCase();//quitamos las mayusculas para que la cadena compruebe exactamente los mismos caracteres
		for(int x=0;x<cadena.length();x++) {
			if (cadena.charAt(x)==' ')   {//quitamos los espacios para que la cadena compruebe exactamente los mismos caracteres.
				cadena2 += cadena.charAt(x);	
			}
		}
		for (int i=cadena.length()-1;i>=0;i--) {
			if (cadena.charAt(i)==' ')  {//quitamos los espacios y las mayusculas para que la cadena compruebe exactamente los mismos caracteres.
				invertida += cadena.charAt(i);	
			}
		}

		if(cadena2.equals(invertida)) {// creamos el boolean .equals con al condicion if para que SI se cumple nos diga que son iguales y si no imprima que no.
			System.out.println("Las cadenas son iguales.");
		}else {
			System.out.println("Las cadenas son distintas.");
		}
	}
	
	public static void factorial() {
		System.out.println("Introduzca un número que desee factorizar: ");
		int numero=leerEntrada();
		int factorial = 1;



		if(numero == 0) {
			System.out.println("El factorial de "+numero+"! es = 1.");
		}else if(numero<0){
			System.out.println("El "+numero+" no se puede factorizar.");
		}
		else if(numero>0){

			for (int i = numero; i >0; i--) {
				factorial = factorial*i;
			}
			System.out.println("Factorial de "+numero+"! es = "+factorial);
		}
		
	}
		
	public static void extractorDeVocales() {
		System.out.println("Introduzca una frase o palabra: ");
		String cadena=leerPalabra();
		cadena=cadena.toLowerCase();
		String cadenaNueva="";
		for (int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i) =='a' || cadena.charAt(i) =='e' || cadena.charAt(i) =='i' || cadena.charAt(i) =='o' || cadena.charAt(i) =='u') {
				cadenaNueva=cadenaNueva+cadena.charAt(i);
			}
		}
		System.out.println("Las vocales de: "+cadena+ " es "+cadenaNueva);//NO pongo "son" que sería los mas correcto porque es una función.
	}

	public static void calculaLasVacaciones() {
		
		String nombre="";
		System.out.println("****Este programa va a determinar cuales son las vacaciones que le corresponden.****");	


		int clave=0,antiguedad=0;
		System.out.println("Introduzca su nombre: ");
		nombre=leerPalabra();
		System.out.println("En la empresa existen 3 claves, en base al departamento al que usted pertenezca: 1),2) o 3)");
		System.out.println("Vale "+nombre+" ahora introduzca su clave de trabajador: ");
		clave=leerEntrada();
		
		System.out.println("Introduzca su antigüedad en la empresa, siendo como mínimo 1 año el tiempo de servicio para disfrutar de sus vacaciones: ");
		antiguedad=leerEntrada();
		
		if (clave==1) {
		if (antiguedad==1) {
		
		System.out.println("Hola "+nombre+" tus vacaciones seran de 6 dias de vacaciones");
		}else if (antiguedad >=2 && antiguedad <=6) {
		System.out.println("Hola "+nombre+" tus vacaciones seran de 14 dias de vacaciones");			
		}else if (antiguedad >=7) {
		System.out.println("Hola "+nombre+" tus vacaciones seran de 20 dias de vacaciones");	
		}

		}else if(clave==2) {
		if (antiguedad==1) {
					
		System.out.println("Hola "+nombre+" tus vacaciones seran de 7 dias de vacaciones");
		}else if (antiguedad >=2 && antiguedad <=6) {
		System.out.println("Hola "+nombre+" tus vacaciones seran de 15 dias de vacaciones");			
		}else if (antiguedad >=7) {
		System.out.println("Hola "+nombre+" tus vacaciones seran de 22 dias de vacaciones");	
		}
			
		}else if(clave==3) {
		if (antiguedad==1) {
					
		System.out.println("Hola "+nombre+" tus vacaciones seran de 10 dias de vacaciones");
		}else if (antiguedad >=2 && antiguedad <=6) {
		System.out.println("Hola "+nombre+" tus vacaciones seran de 20 dias de vacaciones");			
		}else if (antiguedad >=7) {
		System.out.println("Hola "+nombre+" tus vacaciones seran de 30 dias de vacaciones");	
		}
				
		}else {
				System.out.println("la clave que has introducido es incorrecta.");
			}
			}

	public static void cambioMayusculasAMinusculas() {
		System.out.println("Introduzca una frase, las consonantes pasarán a mayusculas y las vocales a minúsculas;");
		String cadena=leerPalabra();
		String cadenaNueva="";
		
		
		cadena= cadena.toLowerCase();
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' ||
					cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
					cadenaNueva = cadenaNueva+Character.toUpperCase(cadena.charAt(i));
			}else if(cadena.charAt(i)>='a' && cadena.charAt(i)<='z'){
				    cadenaNueva = cadenaNueva+cadena.charAt(i);
			}else { 
				cadenaNueva=cadenaNueva+cadena.charAt(i);
			}
		}
	
		
			System.out.println(cadenaNueva);

	}
	
	public static void contarVocalesYConsonantes() {
		int cuentaVocales=0;
		int cuentaConsonantes=0;

		System.out.println("Introduzca una frase, el programa contará las vocales y las consonantes");
		String cadena=leerPalabra();
		cadena=cadena.toLowerCase();
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)>='a' && cadena.charAt(i)<='z'){
				if(cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u'){
					cuentaConsonantes++;
				}
			}
		}
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' ||
					cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){ 
				cuentaVocales++;

			}	
		}	

		System.out.println("La frase tiene: "+cadena+" tiene "+cuentaVocales+" vocales."); 
		System.out.println("La frase tiene: "+cadena+" tiene "+cuentaConsonantes+" consonantes."); 

	}	

	public static String leerPalabra() {

		Scanner sc= new Scanner(System.in);
		
		return sc.nextLine();
		
	}
	
	public static int leerEntrada() {

		Scanner sc= new Scanner(System.in);
		
		return sc.nextInt();
	}

	public static void imprimirMenu() {	



		System.out.println("*****************************************************");
		System.out.println("*****Esto es un programa de Alvaro Martin Bazan******");
		System.out.println("*****************************************************");	
		System.out.println("Menu de operaciones:");
		System.out.println("0.Salir del programa.");
		System.out.println("1.Operacion Matemáticas.");
		System.out.println("2.Serie Fibonacci.");
		System.out.println("3.Número primo.");
		System.out.println("4.Cambio de monedas.");
		System.out.println("5.Ecuación de segundo grado.");
		System.out.println("6.Frase sin espacios.");
		System.out.println("7.Invertir una cadena");
		System.out.println("8.Cuenta vocales y consonantes");
		System.out.println("9.Cambia vocales a mayusculas y consonantes a minúsculas.");
		System.out.println("10.Calcula las vacaciones de un empleado");
		System.out.println("11.Extractor de vocales");
		System.out.println("12.Factorial.");
		System.out.println("13.Palindromo.");
		System.out.println("14.Encriptador");
		System.out.println("15.Diamante de asteriscos.");
		System.out.println("*****************************************************");
		System.out.println();	






	}

	public static void calculadora() {
		Scanner sc= new Scanner(System.in);
		int primerNumero=0,segundoNumero=0,clave=0,resultado=0,resto=0;
		System.out.println("**********************************");
		System.out.println("*****Esto es una calculadora******");
		System.out.println("**********************************");


		System.out.println("Menu de operaciones:");
		System.out.println("clave 1 sumar.");
		System.out.println("clave 2 restar.");
		System.out.println("clave 3 multiplicar.");
		System.out.println("clave 4 dividir.");

		System.out.println("Introduce la clave con la que deseas realizar la operación: ");

		clave=sc.nextInt();




		if (clave ==1) {
			System.out.println("Ahora, introduce el primer número: ");		
			primerNumero=sc.nextInt();
			System.out.println("Ahora, introduce el segundo número: ");		
			segundoNumero=sc.nextInt();		
			resultado=primerNumero+segundoNumero;
			System.out.println("El resultado es: "+resultado);
		}else if (clave==2) {
			System.out.println("Ahora, introduce el primer número: ");		
			primerNumero=sc.nextInt();
			System.out.println("Ahora, introduce el segundo número: ");		
			segundoNumero=sc.nextInt();
			resultado=primerNumero-segundoNumero;
			System.out.println("El resultado es: "+resultado);
		}else if (clave ==3) {
			System.out.println("Ahora, introduce el primer número: ");		
			primerNumero=sc.nextInt();
			System.out.println("Ahora, introduce el segundo número: ");		
			segundoNumero=sc.nextInt();
			resultado=primerNumero*segundoNumero;
			System.out.println("El resultado es: "+resultado);
		}else if (clave ==4) {
			System.out.println("Ahora, introduce el primer número: ");		
			primerNumero=sc.nextInt();
			System.out.println("Ahora, introduce el segundo número: ");		
			segundoNumero=sc.nextInt();
			resultado=primerNumero/segundoNumero;
			resto=primerNumero%segundoNumero;
			System.out.println("El resultado es: "+resultado+" y su resto es: "+resto);
		}else {
			System.out.println("La clave que ha introducido no existe, por favor, vuelva a elegir una de las 4 opciones que se le ofrecen.");




		}		
	}
	
	public static void fibonacci() {
		Scanner sc = new Scanner(System.in);

		System.out.print("¿Qué número de la serie de Fibonacci quieres?: ");
		int numero = sc.nextInt();

		if (numero<3) {
			System.out.print("El numero en la posición "+numero+" es el 1.");
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
	
	public static void numeroPrimo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el número que quiera comprobar si es primo: ");
		int numero=sc.nextInt();
		int divisor=numero/2;

		Boolean esPrimo =true;

		while (esPrimo && divisor >1) {
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
	
	public static void cambioMonedas() {
		Scanner sc= new Scanner (System.in);
		double precio,pago,falta,cambio;
		
		System.out.println("Introduzca el precio del articulo: ");
		precio =sc.nextDouble();
		System.out.println("Introduzca el pago que usted realiza para pagar el articulo.");
		pago=sc.nextDouble();

		cambio=pago-precio;
		falta=precio-pago;

		if(cambio<0) {
			System.out.println("Falta dinero en el pago. El dinero que falta es "+ falta+"€");
		}else if (cambio==0) {
			System.out.println("Se ha pagado la cantidad exacta. No hay cambio que devolver");
		}else if (cambio>0) {
			System.out.println("El cambio que va a recibir es de :"+cambio+"€ En:");
		}
		int c500=0;
		int c200=0;
		int c100=0;
		int c50=0;
		int c20=0;
		int c10=0;
		int c5=0;
		int c2=0;
		int c1=0;
		int c050=0;
		int c020=0;
		int c010=0;
		int c05=0;
		int c02=0;
		int c01=0;
		double resto=0;


			while (cambio >= 500) {
				cambio= cambio-500;
				c500++;	
				resto+=500;
			}
			while (cambio >=200) {
				cambio=cambio-200;
				c200++;
				resto+=200;
			}
			while (cambio >=100) {
				cambio=cambio-100;
				c100++;
				resto+=100;
			}
			while (cambio >=50) {
				cambio=cambio-50;
				c50++;
				resto+=50;
			}
			while (cambio >=20) {
				cambio=cambio-20;
				c20++;
				resto+=20;
			}
			while (cambio >=10) {
				cambio=cambio-10;
				c10++;
				resto+=10;
			}
			while (cambio >=5) {
				cambio=cambio-5;
				c5++;
				resto+=5;
			}
			while (cambio >=2) {
				cambio=cambio-2;
				c2++;
				resto+=2;
			}
			while (cambio >=1) {
				cambio=cambio-1;
				c1++;
				resto+=1;
			}
			while (cambio >=0.50) {
				cambio=cambio-0.5;
				c050++;
				resto+=0.5;
			}
			while (cambio >=0.20) {
				cambio=cambio-0.2;
				c020++;
				resto+=0.2;
			}
			while (cambio >=0.10) {
				cambio=cambio-0.10;
				c010++;
				resto+=0.10;
			}
			while (cambio >=0.05) {
				cambio=cambio-0.05;
				c05++;
				resto+=0.05;
			}
			while (cambio >=0.02) {
				cambio=cambio-0.02;
				c02++;
				resto+=0.02;
			}
			while (cambio >=0.01) {
				cambio=cambio-0.01;
				c01++;
				resto+=0.01;
				

			}

		if (c500>=1)
			System.out.println(c500+" Billetes de 500€.");
		if (c200>=1)
			System.out.println(c200+" Billetes de 200€.");
		if (c100>=1)
			System.out.println(c100+ " Billetes de 100€.");
		if (c50>=1)
			System.out.println(c50+ " Billetes de 50€.");
		if (c20>=1)
			System.out.println(c20+ " Billetes de 20€.");
		if (c10>=1)
			System.out.println(c10+ " Billetes de 10€.");
		if (c5>=1)
			System.out.println(c5+ " Billetes de 5€.");
		if (c2>=1)
			System.out.println(c2+ " Monedas de 2€.");
		if (c1>=1)
			System.out.println(c1+ " Monedas de 1€.");
		if (c050>=1)
			System.out.println(c050+ " Monedas de 0.50€.");
		if (c020>=1)
			System.out.println(c020+ " Monedas de 0.20€.");
		if (c010>=1)
			System.out.println(c010+ " Monedas de 0.10€.");
		if (c05>=1)
			System.out.println(c05+ " Monedas de 0.05€.");
		if (c02>=1)
			System.out.println(c02+ " Monedas de 0.02€.");
		if(resto+precio<pago) {//Esto lo introduzco para añadir el centimo que falta, declarando una variable que vaya sumando el sobrante en cada resta.
			c01+=1;// += es lo mimso que decir que c01= c01+1; pero mas corto :)
		}
		if (c01>=1)
			System.out.println(c01+ " Monedas de 0.01€.");


	}

	public static void ecuacion() {
		
		//ax2 + bx + c = 0

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
				
				}
			}
			
		}
	
	private static void fraseSinEspacios() {
		System.out.println("Introduzca una frase, esta será devuelta sin espacios");
		String frase =leerPalabra();
		String fraseSin="";
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)!=' ') {
				fraseSin = fraseSin + frase.charAt(i);
			}
		}
		System.out.print(fraseSin);
		
	}
		
	public static void invertir() {
		System.out.println("Vamos a invertir una frase, por favor introduzca la frase. ");
		String cadena=leerPalabra();
		
		String inversa="";
	
		for (int i=cadena.length()-1;i>=0;i--){
			inversa=inversa+cadena.charAt(i);
			
		}
		System.out.println(inversa);
		
	}

	public static void esperaPulsacion() {
		Scanner sc= new Scanner(System.in);
		sc.nextLine();	



	}

}

