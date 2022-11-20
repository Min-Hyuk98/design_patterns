public class NYPizzaIngradientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion() };
        return veggies;
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    // public Pepperoni createPepperoni() {
    //     return new SlicedPepperoni();
    // }
    // public Clams createClam() {
    //     return new FreshClams();
    // }
    
}
