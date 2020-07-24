package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        double comparing = o1.getCost() - o2.getCost();
        if (comparing > 0){
 //           System.out.println(o1.getName() + " is greater");
            return 1;
        } else if (comparing < 0){
//            System.out.println(o2.getName() + " is greater");
            return -1;
        } else{
            //(comparing == 0){
            return 0;
        }
    }
}
