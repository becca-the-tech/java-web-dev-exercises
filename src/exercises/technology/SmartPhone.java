package exercises.technology;

public class SmartPhone extends Computer {
    private String phoneNumber;

    public SmartPhone(String brand, int hardDriveSize, double cost, String phoneNumber){
        super(brand, hardDriveSize, cost);
        this.phoneNumber = phoneNumber;
    }

    public String makeCall(String whoYouGonnaCall){
        String output = "You are now calling: " + whoYouGonnaCall;
        System.out.println(output);

        return output;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
