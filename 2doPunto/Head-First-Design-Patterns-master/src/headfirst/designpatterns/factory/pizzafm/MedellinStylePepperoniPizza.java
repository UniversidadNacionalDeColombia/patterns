package headfirst.designpatterns.factory.pizzafm;

public class MedellinStylePepperoniPizza extends Pizza{
	public MedellinStylePepperoniPizza() {
		name = "Medellin Style Pepperony Pizza";
		dough = "Thin Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Pepperoni pieces");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Sliced pepperoni");
	}
	
	void bake() {
		System.out.println("Bake for 40 minutes at 300");
	}
	
	void box() {
		System.out.println("Place pizza in official Colombian PizzaStore box");
	}
	
}
