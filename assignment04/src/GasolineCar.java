public class GasolineCar extends Vehicle {
    private int fuelCapacity;
    private int fuelLevel;
    private boolean isFuelEmpty;
    private boolean isFuelFull;
    private boolean isFueling;

    //constructor
    public GasolineCar(String name, String model, String color, String vendor,
                       int year, int speed, int maxSpeed, int currentSpeed,
                       boolean isMoving, boolean isAccelerating, boolean isEngineOn,
                       int fuelCapacity, int fuelLevel, boolean isFuelEmpty,
                       boolean isFuelFull, boolean isFueling) {
        super(name, model, color, vendor, year, speed, maxSpeed, currentSpeed,
                isMoving, isAccelerating, isEngineOn);
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.isFuelEmpty = isFuelEmpty;
        this.isFuelFull = isFuelFull;
        this.isFueling = isFueling;

    }

    //getters and setters
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean isFuelEmpty() {
        return isFuelEmpty;
    }

    public void setFuelEmpty(boolean fuelEmpty) {
        isFuelEmpty = fuelEmpty;
    }

    public boolean isFuelFull() {
        return isFuelFull;
    }

    public void setFuelFull(boolean fuelFull) {
        isFuelFull = fuelFull;
    }

    public boolean isFueling() {
        return isFueling;
    }

    public void setFueling(boolean isFueling) {
        this.isFueling = isFueling;
    }

    public void refuel() {
        if (!isFuelFull()) {
            System.out.println(this + "'s Tank is Full, You can not refuel...");
            setFuelLevel(getFuelCapacity());
            setFuelEmpty(false);
            setFuelFull(true);
            setFueling(false);
        } else {
            System.out.println(this + " Refueling...");
            setFuelEmpty(true);
            setFuelFull(true);
            setFueling(true);
        }
        setFuelEmpty(false);
        setFueling(false);
        setFuelFull(true);
        setFuelEmpty(false);
    }

    //override Move
    @Override
    public void move() {
        if (!isFuelEmpty()) {

            setMoving(true);
            setFuelEmpty(false);
            setFuelFull(false);
            setFueling(false);
            for (int i = 0; i < 100; i += 10) {
                setFuelLevel(getFuelLevel() - 10);
                if (getFuelLevel() == 0){
                    System.out.println(this + "'s fuel is empty, please refuel...");
                    setFuelEmpty(true);
                    setFuelFull(false);
                    setFueling(false);
                    setMoving(false);
                    break;
                }
                System.out.println(this + " is moving.");
                setMoving(true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Car is not moving... Refuel the tank");
            setMoving(false);
            setFuelEmpty(true);
            setFuelFull(false);
            setFueling(false);
        }
    }


}
