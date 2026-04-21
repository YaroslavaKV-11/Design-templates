public class TVSimulator {
    public static void main(String[] args) {
        Device tv = new Television();
        Device radio = new Radio();

        RemoteController tvController = new RemoteController();
        tvController.setOnCommand(new DeviceOnCommand(tv));
        tvController.setOffCommand(new DeviceOffCommand(tv));
        tvController.setVolumeUpCommand(new VolumeUpCommand(tv));
        tvController.setVolumeDownCommand(new VolumeDownCommand(tv));
        tvController.setNextChanelCommand(new NextChanelCommand(tv));
        tvController.setPrevChanelCommand(new PrevChanelCommand(tv));

        RemoteController radioController = new RemoteController();
        radioController.setOnCommand(new DeviceOnCommand(radio));
        radioController.setOffCommand(new DeviceOffCommand(radio));
        radioController.setVolumeUpCommand(new VolumeUpCommand(radio));
        radioController.setVolumeDownCommand(new VolumeDownCommand(radio));
        radioController.setNextChanelCommand(new NextChanelCommand(radio));
        radioController.setPrevChanelCommand(new PrevChanelCommand(radio));

        RemoteController universalController = new RemoteController();
        universalController.setOffCommand(new UniversalOffCommand(new Device[]{tv, radio}));

        tvController.deviceOn();
        for (int i = 0; i < 5; i++) {
            tvController.deviceNextChanel();
        }
        tvController.deviceVolumeUp();
        tvController.deviceVolumeUp();

        radioController.deviceOn();
        radioController.deviceNextChanel();
        radioController.deviceVolumeUp();

        universalController.deviceOff();
    }
}