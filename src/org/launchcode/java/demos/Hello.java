package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        String str = "pineapple";
        String str2 = "purple";
        String[] arr = {str, str2, "str3", "str4", "purple pineapple"};

        str2 = str2.concat(" ").concat(str);
        str2 = str2.toUpperCase();
        arr[1] = str2;

        System.out.println(str2.toLowerCase().contains("pine"));
        System.out.println(str2.toLowerCase().equals("purple pineapple"));
        System.out.println(arr[1]);


    }
}
