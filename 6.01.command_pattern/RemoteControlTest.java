public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);

        CeilingFan ceilingFan  = new CeilingFan("living room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        Command[] macroOns = {lightOn, stereoOn, ceilingFanHigh};
        Command[] macroOffs = {lightOff, stereoOff, ceilingFanOff};
        MacroCommand macroOn = new MacroCommand(macroOns);
        MacroCommand macroOff = new MacroCommand(macroOffs); 

        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, stereoOn, stereoOff);
        remote.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remote.setCommand(3, ceilingFanLow, ceilingFanOff);
        remote.setCommand(4, macroOn, macroOff);

        // remote.onButtonWasPressed(0);
        // remote.offButtonWasPressed(0);

        // remote.onButtonWasPressed(1);
        // remote.offButtonWasPressed(1);
        // remote.undoButtonWasPressed();
        // remote.offButtonWasPressed(1);

        // remote.onButtonWasPressed(2);
        // remote.onButtonWasPressed(3);
        // remote.undoButtonWasPressed();
        // remote.offButtonWasPressed(1);

        remote.onButtonWasPressed(4);
        remote.offButtonWasPressed(4);
        remote.undoButtonWasPressed();
        remote.offButtonWasPressed(4);
    }
}
