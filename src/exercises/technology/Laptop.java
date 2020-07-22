package exercises.technology;

public class Laptop extends Computer {
    private int memory;

    public Laptop(String brand, int hardDriveSize, double cost, int memory){
        super(brand, hardDriveSize, cost);
        this.memory = memory;
    }

    public void memoryAvailable(int memoryUsed){
        memory -= memoryUsed;
        System.out.println("A program is using " + memoryUsed + "GB of memory");
        System.out.println("Your device has " + memory + "GB of memory available");
    }

    public int getMemory(){
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

}
