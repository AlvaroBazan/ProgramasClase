import java.util.Scanner;

public class copiarcadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String cadena="El perro es guapo.";
		String cadenaNueva="";
		
		for (int i=0;i<cadena.length();i++) {//paso por valor
			cadenaNueva = cadenaNueva + cadena.charAt(i);
			
		}
		System.out.println(cadenaNueva);
	
		String cadenaAsignada= cadena;//paso por referencia
		System.out.println(cadenaAsignada);
		
		
		if (cadena==cadenaNueva) {
			System.out.println("cadena y cadena nueva son iguales");
			
		}else {
			System.out.println("cadena y cadena asignada No son iguales.");
		if (cadena==cadenaAsignada) {
			System.out.println("cadena y cadena nueva son iguales");
				
		}else {
			System.out.println("cadena y cadena asignada No son iguales.");
		}
		if (cadena.equals(cadenaAsignada)) {
			System.out.println("cadena y cadena asignada tienen el mismo contenido");
		}
		System.out.println(cadena.toUpperCase());//poner la cadena en mayusculas
		System.out.println(cadena.toLowerCase());//poner la cadena en minusculas
		cadena=cadena.toLowerCase();//esto destruye la cadena.
		System.out.println(cadenaAsignada);//cadena asignada sigue en el mismo lugar almacenado
		
	}

}
}
