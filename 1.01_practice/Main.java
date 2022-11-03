public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.display();
        mallardDuck.performFLy();
    }
}