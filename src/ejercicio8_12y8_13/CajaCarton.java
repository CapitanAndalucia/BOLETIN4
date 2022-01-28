package ejercicio8_12y8_13;

public class CajaCarton extends Caja{
	private double volumenCarton;
	private int ancho;
	private int alto;
	private int fondo;
	private Unidad unidad;
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getFondo() {
		return fondo;
	}

	public void setFondo(int fondo) {
		this.fondo = fondo;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
		super(ancho, alto, fondo, unidad);
		// TODO Auto-generated constructor stub
	}

	public double getVolumenCarton() {
		return volumenCarton = (getVolumen() * 80) / 100;
	}

	public void setVolumenCarton(double volumenCarton) {
		this.volumenCarton = volumenCarton;
	}

	public String toString() {
		
		return "El volumen de carton usado es: " + getVolumenCarton() + " cm";
	}
	
	
	
	

}
