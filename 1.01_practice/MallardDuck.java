import javax.swing.plaf.metal.MetalLabelUI;

public class MallardDuck extends Duck{
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display() {
        System.out.println("I am MallardDuck.. ");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
