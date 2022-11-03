public class NeedOnlyQuack extends NeedOnlyQuackBehavior{
    public NeedOnlyQuack() {
        quackBehavior = new Quack();
    }
    
    public void display() {
        System.out.println("오리 소리 '꽥' 만 낼거야");
    }
}


