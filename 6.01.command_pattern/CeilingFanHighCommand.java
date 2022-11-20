public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();
    }
    public void undo() {
        int speed = ceilingFan.getSpeed();
        if (speed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        else if (speed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}