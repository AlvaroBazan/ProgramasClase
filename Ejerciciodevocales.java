
public class Ejerciciodevocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//guarda en una variable las consonantes de una cadena
		//guardar las vocales 
		
	String cadena ="Paco fue a comprar pan a tarifa y se callo el barco.";
	String cadena2 ="";
	
	for (int i=0; i<cadena.length();i++) {
		if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u'){
			cadena2 = cadena2 + cadena.charAt(i);
			
			
		}	
		
	}
    System.out.println(cadena2);
	}
}