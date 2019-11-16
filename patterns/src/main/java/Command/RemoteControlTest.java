package Command;

public class RemoteControlTest {
    public static void main(String[] strings) {
        RemoteControl remoteControl = new RemoteControl(2);
        final Light light = new Light();
        CDPlayer cdPlayer = new CDPlayer();
        remoteControl.setOnCommand(0, () -> {light.on();});
        remoteControl.setOffCommand(0, () -> {light.off();});
        remoteControl.setOnCommand(1, () -> {cdPlayer.on();});
        remoteControl.setOffCommand(1, () -> {cdPlayer.off();});

        remoteControl.buttonOnWasPushed(0);
        remoteControl.buttonOnWasPushed(1);
        remoteControl.buttonOffWasPushed(1);
        remoteControl.buttonOffWasPushed(0);
    }
}
