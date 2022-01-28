package ejercicio8_12y8_13;

import java.util.Scanner;

public class Caja {
	private int ancho;
	private int alto;
	private int fondo;
	private Unidad unidad;
	private double volumen;
	private String etiqueta = "P00345";
	
	public Caja(int ancho, int alto, int fondo, Unidad unidad) {
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
		}

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
	
	public double getVolumen() {
		return volumen = alto * ancho * fondo;
	}
	
	public void setEtiqueta(String etiqueta) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pon la etiqueta a la caja");
		this.etiqueta = sc.next();
		
	}
	
	public String toString() {
		
		return "La caja con el ancho: " + ancho + ", el alto: " + alto + ", y fondo: " + fondo + " de " + unidad.tostring();
	}
	
}
