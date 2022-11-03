public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();

        NeedOnlyQuack quack = new NeedOnlyQuack();
        quack.display();

        NeedOnlySqueak squeak = new NeedOnlySqueak();
        squeak.display();

    }
}
