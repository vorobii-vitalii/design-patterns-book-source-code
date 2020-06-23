package book.command_pattern;

public class RemoteControl {
    private Command prevCommand;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.prevCommand = command;
    }

    public void buttonWasPressed() {
        this.prevCommand.execute();
    }

    public void resetRecentCommand() {
        this.prevCommand = null;
    }

}
