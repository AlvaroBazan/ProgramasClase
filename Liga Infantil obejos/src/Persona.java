// usamos este objeto para jerarquizar todos los atributos comunes
// ponemos abstract para prohibe crear un objeto por si solo
public abstract class Persona {
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
		
	}
	@Override
	public String toString() {
		return "Nombre: "+ this.nombre+ " "+this.apellidos+"\n"+
				"Edad: "+this.edad;
	}
}

