package Command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(int slotCount) {
        this.onCommands = new Command[slotCount];
        this.offCommands = new Command[slotCount];
    }

    public void setOnCommand(int slot, Command command) {
        onCommands[slot] = command;
    }

    public void setOffCommand(int slot, Command command) {
        offCommands[slot] = command;
    }

    public void buttonOnWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void buttonOffWasPushed(int slot) {
        offCommands[slot].execute();
    }


}
