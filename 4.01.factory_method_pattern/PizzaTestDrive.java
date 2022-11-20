public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        PizzaStore chicagostore = new ChicagoPizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagostore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }   
}