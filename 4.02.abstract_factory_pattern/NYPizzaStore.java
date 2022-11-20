public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngradientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY style cheese pizza");
        } 
        else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY style veggie pizza");
        } 
        // else if (item.equals("clam")) {
        //     pizza = new ClamPizza(ingredientFactory);
        //     pizza.setName("NY style clam pizza");
        // } 
        // else if (item.equals("pepperoni")) {
        //     pizza = new PepperoniPizza(ingredientFactory);
        //     pizza.setName("NY style pepperoni pizza");
        // } 
        return pizza;
    }
}
