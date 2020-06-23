package book.command_pattern;

public class CommandPatternDriver {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.buttonWasPressed();
    }

}
