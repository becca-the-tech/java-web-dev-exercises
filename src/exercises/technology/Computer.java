package exercises.technology;

public class Computer extends AbstractEntity {
    private String brand;
    private int hardDriveSize;
    private double cost;
    private double batteryLife;
    private int programCounter = 0;

    public Computer(){
        super();
        this.brand = "Unspecified";
        this.hardDriveSize = 0;
        this.cost = 0.0;
    }

    public Computer(String brand, int hardDriveSize, double cost){
        super();
        this.brand = brand;
        this.hardDriveSize = hardDriveSize;
        this.cost = cost;
        this.batteryLife = 100.0;
    }

    public boolean isCharged(){
        if (batteryLife >= 70){
            return true;
        } else {
            return false;
        }
    }

    public void downloadProgram(int spaceUsed){
        hardDriveSize -= spaceUsed;
        batteryLife -= 20;
        System.out.println("You downloaded a program that used " + spaceUsed);
        System.out.println("Your device now has " + hardDriveSize + "GB of space left");
        programCounter++;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public String getBrand() {
        return brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getBatteryLife(){
        return batteryLife;
    }

    public int getProgramCounter(){
        return programCounter;
    }

}
