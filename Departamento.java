import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private String gruposProyecto;
	public ArrayList<GrupoProyecto> unnamed_GrupoProyecto_ = new ArrayList<GrupoProyecto>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGruposProyecto() {
		return this.gruposProyecto;
	}

	public void setGruposProyecto(String gruposProyecto) {
		this.gruposProyecto = gruposProyecto;
	}
}