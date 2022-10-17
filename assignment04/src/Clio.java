public class Clio extends GasolineCar {
    private boolean isManual;
    private boolean isAutomatic;
    private boolean isHatchback;
    private boolean isSedan;
    private boolean isGasoline;
    private boolean isLPG;
    private boolean isLiquefiedPetroleumGas;

    //constructor
    public Clio(String name, String model, String color, String vendor,
                int year, int speed, int maxSpeed, int currentSpeed,
                boolean isMoving, boolean isAccelerating, boolean isEngineOn,
                int fuelCapacity, int fuelLevel, boolean isFuelEmpty,
                boolean isFuelFull, boolean isFueling, boolean isManual,
                boolean isAutomatic, boolean isHatchback, boolean isSedan,
                boolean isGasoline, boolean isLPG, boolean isLiquefiedPetroleumGas) {
        super(name, model, color, vendor, year, speed, maxSpeed, currentSpeed,
                isMoving, isAccelerating, isEngineOn, fuelCapacity, fuelLevel,
                isFuelEmpty, isFuelFull, isFueling);
        this.isManual = isManual;
        this.isAutomatic = isAutomatic;
        this.isHatchback = isHatchback;
        this.isSedan = isSedan;
        this.isGasoline = isGasoline;
        this.isLPG = isLPG;
        this.isLiquefiedPetroleumGas = isLiquefiedPetroleumGas;
    }
    //getters and setters
    public boolean isManual() {
        return isManual;
    }
    public void setManual(boolean manual) {
        isManual = manual;
    }
    public boolean isAutomatic() {
        return isAutomatic;
    }
    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
    public boolean isHatchback() {
        return isHatchback;
    }
    public void setHatchback(boolean hatchback) {
        isHatchback = hatchback;
    }
    public boolean isSedan() {
        return isSedan;
    }
    public void setSedan(boolean sedan) {
        isSedan = sedan;
    }
    public boolean isGasoline() {
        return isGasoline;
    }
    public void setGasoline(boolean gasoline) {
        isGasoline = gasoline;
    }
    public boolean isLPG() {
        return isLPG;
    }
    public void setLPG(boolean LPG) {
        isLPG = LPG;
    }
    public boolean isLiquefiedPetroleumGas() {
        return isLiquefiedPetroleumGas;
    }
    public void setLiquefiedPetroleumGas(boolean liquefiedPetroleumGas) {
        isLiquefiedPetroleumGas = liquefiedPetroleumGas;
    }
    //methods
    public void startEngine() {
        System.out.println("Starting engine...");
        System.out.println("Engine started.");
    }
    public void stopEngine() {
        System.out.println("Stopping engine...");
        System.out.println("Engine stopped.");
    }
    public void accelerate() {
        System.out.println("Accelerating...");
        System.out.println("Accelerated.");
    }


}
