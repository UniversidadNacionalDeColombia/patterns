package headfirst.designpatterns.factory.pizzafm;

public class MedellinStyleRancheraPizza extends Pizza {
	public MedellinStyleRancheraPizza() {
		name = "Medellin Style Ranchera Pizza";
		dough = "Thin Crust Doug";
		sauce = "Cherry Tomato Sauce";
		
		toppings.add("Beef sausages");
		toppings.add("Pork sausages from Santander Colombia");
		toppings.add("Extre fresh Cheese from Tolima Colombia");
	}
	
	void cut() {
		System.out.println("Cut the pizza into square slices");
	}
	
}
