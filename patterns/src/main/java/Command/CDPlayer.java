package Command;

public class CDPlayer {
    public void on() {
        System.out.println("CD is turning on...");
        setCompactDisc();
        playCD();
    }

    public void off() {
        System.out.println("CD is stopping...");
    }

    private void setCompactDisc () {
        System.out.println("Setting compact disc...");
    }
    private void playCD () {
        System.out.println("music...");
    }

}
