package singleinheritance.smarthomedevices;

// Subclass Thermostat
class Thermostat extends Device {
    double temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
