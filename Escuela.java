import java.util.ArrayList;

public class Escuela {
	private int estudiantes;
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	public int getEstudiantes() {
		return this.estudiantes;
	}

	public void setEstudiantes(int estudiantes) {
		this.estudiantes = estudiantes;
	}
}