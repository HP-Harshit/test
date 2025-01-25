package SingleInheritance;

// Defining the superclass Device
class Device {
    // Class Attributes
    public String deviceId;
    public String status;

    // Defining Constructor
    public Device(String deviceId, String status) {
        // Initializing the attributes
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Defining the subclass Thermostat
class Thermostat extends Device {
    // Class Attribute
    double temperatureSetting;

    // Defining Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        // Calling the superclass constructor
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayStatus method
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "C");
    }
}

// Main class
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Creating an instance of Thermostat
        Thermostat thermostat = new Thermostat("T123", "Online", 22.5);

        // Calling the displayStatus method on the instance
        thermostat.displayStatus();
    }
}
