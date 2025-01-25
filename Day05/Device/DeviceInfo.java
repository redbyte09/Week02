package Device;

class Device {
    int deviceId;
    String status;

    public Device(int deviceId,String status)
    {
        this.deviceId=deviceId;
        this.status=status;
    }

    public void displayStatus()
    {
        System.out.println("Device id is "+deviceId);
        System.out.println("Status of device  "+status);
    }
}

class Thermostat extends Device
{
    String temperatureSetting;
    public Thermostat(int deviceId,String status,String  temperatureSetting)
    {
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }
    public void displayStatus()
    {
        super.displayStatus();
        System.out.println("Temperature Setting "+temperatureSetting);
    }
}

public class DeviceInfo 
{
    public static void main(String[] args) {
        Device device=new Thermostat(120, "Availibility", "Low");
        device.displayStatus();
    }
}