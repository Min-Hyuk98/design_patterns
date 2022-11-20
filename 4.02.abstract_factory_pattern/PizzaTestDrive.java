public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nystore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


    }   
}