public class RemoteController {
    private Command onCommand;
    private Command offCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChanelCommand;
    private Command prevChanelCommand;

    void setOnCommand(Command command) {
        this.onCommand = command;
    }

    void setOffCommand(Command command) {
        this.offCommand = command;
    }

    void setVolumeUpCommand(Command command) {
        this.volumeUpCommand = command;
    }

    void setVolumeDownCommand(Command command) {
        this.volumeDownCommand = command;
    }

    void setNextChanelCommand(Command command) {
        this.nextChanelCommand = command;
    }

    void setPrevChanelCommand(Command command) {
        this.prevChanelCommand = command;
    }

    void deviceOn() {
        if (onCommand != null) {
            onCommand.execute();
        }
    }

    void deviceOff() {
        if (offCommand != null) {
            offCommand.execute();
        }
    }

    void deviceVolumeUp() {
        if (volumeUpCommand != null) {
            volumeUpCommand.execute();
        }
    }

    void deviceVolumeDown() {
        if (volumeDownCommand != null) {
            volumeDownCommand.execute();
        }
    }

    void deviceNextChanel() {
        if (nextChanelCommand != null) {
            nextChanelCommand.execute();
        }
    }

    void devicePrevChanel() {
        if (prevChanelCommand != null) {
            prevChanelCommand.execute();
        }
    }
}