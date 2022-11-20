import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("preparing" + name);
        System.out.println("tossing dough");
        System.out.println("adding sauce" );
        System.out.println("adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("now baking");
    }
    
    void cut() {
        System.out.println("now cutting");
    }
    
    void box() {
        System.out.println("now boxing");
    }

    public String getName() {
        return name;
    }

}
