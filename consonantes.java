
public class consonantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//en la posición de la cadena donde aparezca una vocal se sustituya por una "?"

		String cadena ="PACO FUE A LA CASA.";

		String cadena2 = "";
		int contadorConsonantes=0;

		for (int i=0; i<cadena.length();i++) {
			if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u' && cadena.charAt(i) !=' ' &&
					cadena.charAt(i) != 'A' && cadena.charAt(i) != 'E' && cadena.charAt(i) != 'I' && cadena.charAt(i) != 'O' && cadena.charAt(i) != 'U' && (cadena.charAt(i)>='b') || (cadena.charAt(i)<='z')|| (cadena.charAt(i)>='A') || (cadena.charAt(i)<='Z')) {
				contadorConsonantes++;
				cadena2 = cadena2 + cadena.charAt(i);

			}
		}
		System.out.println(cadena2);
		System.out.println(contadorConsonantes);
	}
}


