public class CeilingFan {
    public static final int HIGH = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("ceiling fan speed HIGH");
    }

    public void low() {
        speed = LOW;
        System.out.println("ceiling fan speed LOW");
    }

    public void off() {
        speed = OFF;
        System.out.println("ceiling fan OFF");
    }

    public int getSpeed() {
        return speed;
    }
}
