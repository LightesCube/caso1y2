public class Persona {
	private String nombre;
	private int edad;
	public Mascotas mascotas;
	public Accion accion;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}