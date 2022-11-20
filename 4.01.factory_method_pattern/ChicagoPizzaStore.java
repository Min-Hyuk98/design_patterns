public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else
            return null;
    }
}
