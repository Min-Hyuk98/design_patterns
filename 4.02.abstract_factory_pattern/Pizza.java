// import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    // Pepperoni Pepperoni;
    // Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("now baking");
    }

    void cut() {
        System.out.println("now cutting");
    }

    void box() {
        System.out.println("now boxing");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

}
