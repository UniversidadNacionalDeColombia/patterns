package headfirst.designpatterns.factory.pizzafm;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore medellinStore = new MedellinPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
		//Ejemplo del laboratorio 3
		System.out.println("--------------------------------------------------------------------");
		System.out.println("EJEMPLO LABORATORIO 3");
		System.out.println("--------------------------------------------------------------------");
		
		pizza = medellinStore.orderPizza("hawaiana");	
		System.out.println("Jaime ordered a "+pizza.getName()+"\n");
		
		pizza = medellinStore.orderPizza("pepperoni");	
		System.out.println("Juan Pablo ordered a "+pizza.getName()+"\n");
		
		pizza = medellinStore.orderPizza("ranchera");	
		System.out.println("Tom  ordered a "+pizza.getName()+"\n");
	}
}
