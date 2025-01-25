package singleinheritance.smarthomedevices;

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("HM123", "Active", 20.5);

        thermostat.displayStatus();
    }
}
