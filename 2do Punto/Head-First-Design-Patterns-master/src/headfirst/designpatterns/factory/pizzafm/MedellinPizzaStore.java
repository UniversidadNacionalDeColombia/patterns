package headfirst.designpatterns.factory.pizzafm;

public class MedellinPizzaStore extends PizzaStore {
	Pizza createPizza(String item) {
		if(item.equals("hawaiana")) {
			return new MedellinStyleHawaianaPizza();
		}else if(item.equals("pepperoni")){
			return new MedellinStylePepperoniPizza();
		}else if(item.equals("ranchera")){
			return new MedellinStyleRancheraPizza();
		}else return null;
	}
}
