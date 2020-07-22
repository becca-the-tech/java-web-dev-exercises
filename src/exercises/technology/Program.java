package exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Program {
    Computer acerChromebook;
    Laptop dellLaptop;
    SmartPhone alexasPhone;

    @Before
    public void createObjects() {
        acerChromebook = new Computer("Acer", 32, 199);
        dellLaptop = new Laptop("Dell", 128, 712.05, 8);
        alexasPhone = new SmartPhone("Apple", 32, 999, "111-123-4567");
    }

    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }

    //Testing Computer Constructor and Methods

    @Test
    public void testComputerConstructor(){
        assertTrue(acerChromebook.getBrand().equals("Acer"));
        assertTrue(acerChromebook.getHardDriveSize() == 32);
        assertTrue(acerChromebook.getCost() == 199);
        assertTrue(acerChromebook.getBatteryLife() == 100);
    }

    @Test
    public void testChargedMethod(){
        assertTrue(acerChromebook.isCharged());
    }

    @Test
    public void testDownloadsMethod(){
        acerChromebook.downloadProgram(10);
        assertTrue(acerChromebook.getHardDriveSize() == 32 -10);
        assertTrue(acerChromebook.getBatteryLife() == 100 - 20);
    }

    //Testing Laptop Constructor and Methods
    @Test
    public void testLaptopConstructor(){
        assertTrue(dellLaptop.getBrand().equals("Dell"));
        assertTrue(dellLaptop.getHardDriveSize() == 128);
        assertTrue(dellLaptop.getCost() == 712.05);
        assertTrue(dellLaptop.getMemory() == 8);
        assertTrue(dellLaptop.getBatteryLife() == 100);
    }

    @Test
    public void testLaptopMemoryAvailableMethod(){
        dellLaptop.memoryAvailable(3);
        assertTrue(dellLaptop.getMemory() == 5);
    }

    @Test
    public void testDownloadProgramMethod(){
        dellLaptop.downloadProgram(28);
        assertTrue(dellLaptop.getHardDriveSize() == 100);
    }

    @Test
    public void testProgramCounterMethod(){
        dellLaptop.downloadProgram(10);
        dellLaptop.downloadProgram(10);

        assertTrue(dellLaptop.getProgramCounter() == 2);
    }

    //SmartPhone Constructor and Methods
    @Test
    public void testSmartPhoneConstructor(){
        assertTrue(alexasPhone.getBrand().equals("Apple"));
        assertTrue(alexasPhone.getHardDriveSize() == 32);
        assertTrue(alexasPhone.getCost() == 999);
        assertTrue(alexasPhone.getPhoneNumber().equals("111-123-4567"));
    }

    @Test
    public void testMakeCallMethod(){
        assertTrue(alexasPhone.makeCall("Becca The Greatest and Most Humblest").equals("You are now calling: Becca The Greatest and Most Humblest"));
    }

}
