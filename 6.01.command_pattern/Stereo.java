public class Stereo {
    public Stereo() {}

    public void on() {
        System.out.println("turn on the stereo");
    }

    public void off() {
        System.out.println("turn off the stereo");
    }

    public void setCD() {
        System.out.println("set CD");
    }

    public void setVolume(int vol) {
        System.out.println("set volume to "+ Integer.toString(vol));
    }

}



//     public void execute() {
//         stereo.on();
//         stereo.setCD();
//         stereo.setVolume(11);
//     }
// }