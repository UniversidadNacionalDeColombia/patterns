import java.security.Principal;

public class TheBlop {
	public static void main(String[] args) {
		MainControllerClass controller =  new MainControllerClass();
		
		controller.setData(0, "pepe", 10, 3);
		controller.setData(1, "pedro", 3, 13);
		controller.setData(2, "catalina", 2, 33);
		controller.setData(3, "daniela", 23, 11);
		controller.setData(4, "claudia", 5, 7);
		
		controller.showData();
		System.out.println("\nCambiando data");
		controller.changeData(1, "daniel", 4, 2.2f);
		System.out.println();
		controller.showData();
		
		System.out.println("\nLas persona que se encuetran en data son:");
		for (int i = 0; i < controller.data_list.length; i++) {
			System.out.println("      "+controller.getNameData(i));
		}
		
		System.out.println("\nCreando imagen");
		controller.createImage(0, "casa", ".jpg", "11/15/2019");
		controller.printImage(0);
		System.out.println("\nCambiando el formato de la imagen");
		controller.cambiarFormatoImages(0, ".png");
		System.out.println("Su Imagen con el nuevo formato es: ");
		controller.printImage(0);
		
		
		
	}
}
