package command._2022;

public class TurnOnCommand implements Command {
    ElectronicDevice theDevice;

    public TurnOnCommand(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.on();
    }

    public void undo() {
        theDevice.off();
    }

}