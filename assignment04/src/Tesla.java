public class Tesla extends ElectricalCar {
    //Some extra properties for Tesla E-car
    private boolean isSelfDriving;
    private boolean isFastCharging;

    //constructor
    public Tesla(String name, String model, String color, String vendor,
                 int year, int speed, int maxSpeed, int currentSpeed,
                 boolean isMoving, boolean isAccelerating, boolean isEngineOn
            , int batteryCapacity, int batteryLevel, boolean isBatteryEmpty,
                 boolean isBatteryFull, boolean isBatteryCharged,
                 boolean isBatteryCharging, boolean isSelfDriving,
                 boolean isFastCharging) {
        super(name, model, color, vendor, year, speed, maxSpeed, currentSpeed
                , isMoving, isAccelerating, isEngineOn, batteryCapacity,
                batteryLevel, isBatteryEmpty, isBatteryFull, isBatteryCharged
                , isBatteryCharging);
        this.isSelfDriving = isSelfDriving;
        this.isFastCharging = isFastCharging;
    }

    //getters and setters
    public boolean isSelfDriving() {
        return isSelfDriving;
    }

    public void setSelfDriving(boolean selfDriving) {
        isSelfDriving = selfDriving;
    }

    public boolean isFastCharging() {
        return isFastCharging;
    }

    public void setFastCharging(boolean fastCharging) {
        isFastCharging = fastCharging;
    }

    //methods
    public void selfDrive() {
        if (isSelfDriving) {
            System.out.println("Tesla is self driving");
        } else {
            System.out.println("Tesla is not self driving");
        }
    }

    public void fastCharge() {
        if (isFastCharging) {
            System.out.println("Tesla is fast charging");

        } else {
            System.out.println("Tesla is not fast charging");
        }
    }

    //if tesla is moving decrease the battery level
    public void move() {
        if (isEngineOn()) {
            if (isBatteryEmpty()) {
                System.out.println("Battery is empty, charge the" + this + "....");
                return;
            } else if (getBatteryLevel() > 10) {
                if (!isMoving()) {
                    for (int i = 0; i < 100; i += 10) {
                        System.out.println(this + " is moving");
                        setBatteryLevel(getBatteryLevel() - 10);
                        setMoving(true);
                        if (getBatteryLevel() == 0) {
                            System.out.println("Battery is empty, charge the " + this);
                            setBatteryEmpty(true);
                            setMoving(false);
                            setEngineOn(false);
                            return;
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    System.out.println(this + " is not moving");
                }
            }
        } else {
            System.out.println("Engine Starting...");
            setEngineOn(true);
            move();
        }

    }

    @Override
    public void chargeBattery() {
        if (isBatteryEmpty()) {
            System.out.println("Battery charging fastly...");
            setBatteryCharging(true);
            setFastCharging(true);
            //charge battery %10 every second
            if (getBatteryLevel() < getBatteryCapacity()) {
                for (int i = 0; i < 100; i += 10) {
                    try {
                        setBatteryLevel(getBatteryLevel() + 10);
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
            setFastCharging(true);
            //charge battery %1 every second
            if (getBatteryLevel() < getBatteryCapacity()) {
                for (int i = 0; i < 100; i += 10) {
                    try {
                        setBatteryLevel(getBatteryLevel() + 10);
                        System.out.println("Battery level: " + getBatteryLevel() + "%");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
