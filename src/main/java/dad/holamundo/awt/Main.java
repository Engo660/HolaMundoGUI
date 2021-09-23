package dad.holamundo.awt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiClase clase = new MiClase();
		clase.saludar("Manolete");

//		MiInterfaz implementacion = new MiInterfaz() {
//			public void saludar(String nombre) {
//				System.out.println("Buenos dias "+nombre);
//			}
//		};
		MiInterfaz implementacion = nombre -> System.out.println("Buenos dias " + nombre);
		implementacion.saludar("Manolete");

	}

}
