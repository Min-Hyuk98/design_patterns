public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }

    public void undo() {
        int speed = ceilingFan.getSpeed();
        if (speed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        else if (speed == CeilingFan.LOW) {
            ceilingFan.low();
        }
    }
}
