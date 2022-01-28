package ejercicio8_12y8_13;

public class Porgrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unidad unidad = new Unidad("Federico Guillermo Torres", "Avda de la Paz", 67890932);
		
		Caja caja = new Caja(17, 43, 55, unidad);
		
		System.out.println(caja.toString());
		
		Caja cajacarton = new CajaCarton(34, 55, 88, unidad);
		
		System.out.println(cajacarton.toString());

	}

}
