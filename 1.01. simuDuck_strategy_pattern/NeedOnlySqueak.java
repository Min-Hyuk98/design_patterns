public class NeedOnlySqueak extends NeedOnlyQuackBehavior{
    public NeedOnlySqueak() {
        quackBehavior = new Squeak();
    }
    public void display() {
        System.out.println("오리 소리 '삑' 만 낼거야");
    }
}
