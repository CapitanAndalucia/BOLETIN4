package ejercicio8_12y8_13;

public class Unidad {

	private String nombre;
	private String direccion;
	private long movil;
	public Unidad(String nombre, String direccion, long movil) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.movil = movil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getMovil() {
		return movil;
	}
	public void setMovil(long movil) {
		this.movil = movil;
	}
	
	
	public String tostring() {
		
		return "Nombre: [" + nombre + "], direecion: [" + direccion + "] , movil: [" + movil + "]";
	}
}
