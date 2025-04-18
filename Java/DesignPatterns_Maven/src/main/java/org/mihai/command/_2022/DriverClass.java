package command._2022;

public class DriverClass {

    public static void main(String[] args) {

        // Gets the ElectronicDevice to use

        ElectronicDevice newDevice = new Television();

        // TurnTVOn contains the command to turn on the tv
        // When execute() is called on this command object
        // it will execute the method on() in Television

        TurnOnCommand onCommand = new TurnOnCommand(newDevice);

        // Calling the execute() causes on() to execute in Television

        Invoker invoker = new Invoker(onCommand);

        // When press() is called theCommand.execute(); executes

        invoker.press();

        //----------------------------------------------------------

        // Now when execute() is called off() of Television executes

        TurnOffCommand offCommand = new TurnOffCommand(newDevice);

        // Calling the execute() causes off() to execute in Television

        invoker = new Invoker(offCommand);

        // When press() is called theCommand.execute(); executes

        invoker.press();
    }

}