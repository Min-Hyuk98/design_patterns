public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.low();
    }

    public void undo() {
        int speed = ceilingFan.getSpeed();
        if (speed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (speed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}