public class Vehicle {
    //  Variables should be private because of encapsulation.
    private String name;
    private String model;
    private String color;
    private String vendor;
    private int year;
    private int speed;
    private int maxSpeed;
    private int currentSpeed;
    private boolean isMoving;
    private boolean isAccelerating;
    private boolean isEngineOn;

    //constructor
    public Vehicle(String name, String model, String color, String vendor,
                   int year, int speed, int maxSpeed, int currentSpeed,
                   boolean isMoving, boolean isAccelerating, boolean isEngineOn) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.vendor = vendor;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.isMoving = isMoving;
        this.isEngineOn = isEngineOn;
        this.isAccelerating = isAccelerating;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public boolean isMoving() {
        return isMoving;
    }
    public void setMoving(boolean moving) {
        isMoving = moving;
    }
    public boolean isEngineOn() {
        return isEngineOn;
    }
    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
    public boolean isAccelerating() {
        return isAccelerating;
    }
    public void setAccelerating(boolean accelerating) {
        isAccelerating = accelerating;
    }
    //toString
    @Override
    public String toString() {
        return this.name;
    }

    //methods
    public void startEngine(){
        if(!isEngineOn()){
            setEngineOn(true);
            System.out.println("Engine is started.");
        }else{
            System.out.println("Engine is already started.");
        }
    }
    public void stopEngine(){
        if(isEngineOn()){
            setEngineOn(false);
            System.out.println("Engine is stopped.");
        }else{
            System.out.println("Engine is already stopped.");
        }
    }
    public void accelerate(int speed){
        if(isEngineOn){
            if(getCurrentSpeed() + speed <= maxSpeed){
                setCurrentSpeed(getCurrentSpeed() + speed);
                setAccelerating(true);
                setMoving(true);
                System.out.println("Speed is increased by " + speed + " km/h.");
            }else{
                System.out.println("Speed cannot be increased by " + speed + " km/h.");
            }
        }else{
            System.out.println("Engine is not started.");
            setMoving(false);
            setAccelerating(false);
        }
    }
    public void move() {
        if (!isEngineOn()) {
            setEngineOn(true);
            System.out.println("Engine is starting.");
            System.out.println(this + "is moving.");
        } else {
            System.out.println("Vehicle is moving.");
        }
    }



}
