public class ElectricalCar extends Vehicle {
    private int batteryCapacity;
    private int batteryLevel;
    private boolean isBatteryEmpty;
    private boolean isBatteryFull;
    private boolean isBatteryCharged;
    private boolean isBatteryCharging;

    //constructor
    public ElectricalCar(String name, String model, String color,
                         String vendor, int year, int speed, int maxSpeed,
                         int currentSpeed, boolean isMoving,
                         boolean isAccelerating, boolean isEngineOn,
                         int batteryCapacity, int batteryLevel,
                         boolean isBatteryEmpty, boolean isBatteryFull,
                         boolean isBatteryCharged, boolean isBatteryCharging) {
        super(name, model, color, vendor, year, speed, maxSpeed,
                currentSpeed, isMoving, isAccelerating, isEngineOn);
        this.batteryCapacity = batteryCapacity;
        this.batteryLevel = batteryLevel;
        this.isBatteryEmpty = isBatteryEmpty;
        this.isBatteryFull = isBatteryFull;
        this.isBatteryCharged = isBatteryCharged;
        this.isBatteryCharging = isBatteryCharging;
    }

    //getters and setters
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isBatteryEmpty() {
        return isBatteryEmpty;
    }

    public void setBatteryEmpty(boolean isBatteryEmpty) {
        this.isBatteryEmpty = isBatteryEmpty;
    }

    public boolean isBatteryFull() {
        return isBatteryFull;
    }

    public void setBatteryFull(boolean isBatteryFull) {
        this.isBatteryFull = isBatteryFull;
    }

    public boolean isBatteryCharged() {
        return isBatteryCharged;
    }

    public void setBatteryCharged(boolean isBatteryCharged) {
        this.isBatteryCharged = isBatteryCharged;
    }

    public boolean isBatteryCharging() {
        return isBatteryCharging;
    }

    public void setBatteryCharging(boolean isBatteryCharging) {
        this.isBatteryCharging = isBatteryCharging;
    }

    //methods
    public void chargeBattery() {
        if (isBatteryEmpty()) {
            System.out.println("Battery charging...");
            setBatteryCharging(true);
            //charge battery %1 every second
            if (getBatteryLevel() < getBatteryCapacity()) {
                for (int i = 0; i < 100; i++) {
                    try {
                        setBatteryLevel(i);
                        System.out.println("Battery level: " + getBatteryLevel() + "%");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        } else if (isBatteryFull()) {
            setBatteryFull(true);
            setBatteryEmpty(false);
            setBatteryCharging(false);
            System.out.println("Battery is full, no need to charge it");
        } else if (isBatteryCharged()) {
            System.out.println("Battery is charged, no need to charge it");
            setBatteryCharging(false);
            setBatteryCharged(true);
        } else if (isBatteryCharging()) {
            setBatteryCharging(true);
            setBatteryFull(false);
            System.out.println("Battery is charging, please wait");
        } else {
            System.out.println("Battery is charging");
            //charge battery %1 every second
            if (getBatteryLevel() < getBatteryCapacity()) {
                for (int i = 0; i < 100; i++) {
                    try {
                        setBatteryLevel(i);
                        System.out.println("Battery level: " + getBatteryLevel() + "%");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void drive() {
        if (isBatteryEmpty()) {
            System.out.println("Battery is empty, please charge it");
        } else {
            System.out.println("Driving");
            setAccelerating(true);
            setMoving(true);
        }
    }

    public void stop() {
        System.out.println("Stopping");
        setAccelerating(false);
        setMoving(false);
    }
}
