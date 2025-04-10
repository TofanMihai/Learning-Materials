package command._2024;

public class DriverClass {

    public static void main(String[] args) {
        Room room = new Room();

        room.setCommand(new SwitchLightsCommand(new Light()));

        room.executeCommand();
        
    }
}
