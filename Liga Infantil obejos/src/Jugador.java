//para que no tenga hijos la clase se pone final.
public final class Jugador extends Persona {

	private String categoria;
	private String posicion;
	private int dorsal;
	private Equipo equipo;
	
	
	//Para generar todos los geters y seters, boton derecho raton, source y
	//y le das a generate getters and setters, selecionas todos, y generar.

	@Override
	//se pone eso del @ siempre que hagamos una sobrecarga de la informacion
	public void setEdad(int edad) {
		//el super se usa para coger el set de mi padre Persona
		super.setEdad(edad);
		categoria=setCategoria(edad);
		
	}
	public String getCategoria() {
		return categoria;
	}
	//cambiamos este set para que solo pueda leerlo y no lo pueda cambiar desde fuera.
	// y queremos que devuelva algo por lo tanto le ponemos String
	// cambiamos por int edad para que lo seleccione en funcion de la edad
	private String setCategoria(int edad) {
		switch(edad) {
		case 4:
		case 5:
			return "Chupetin";
			//despues de un return tambien se sale del switch
			// si pusiera un break daria un error.
		case 6:
		case 7:
			return "Prebenjamín";
		case 8:
		case 9:
			return "Benjamin";
		case 10:
		case 11:
			return "Alevín";
		case 12:
		case 13:
			return "Infantil";
		case 14:
		case 15:
			return "Cadete";
		case 16:
		case 17:
		case 18:
			return "Juvenil";
		default:
			return "N/A";
		
		}
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public String toString() {
	return super.toString()+categoria+"\n"+
	"Equipo: "+equipo.getNombre()+"\n"+
	"Dorsal: "+dorsal+" "+"\n"
	+posicion+"\n"+"\n";
	}
	
}
