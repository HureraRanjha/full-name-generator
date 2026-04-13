package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        String fullName = myScanner.nextLine();

        //Grab first name by checking first instance of space
        int spacePosition  = fullName.indexOf(' ');
        String firstName = fullName.substring(0,spacePosition);

        //Update the String without the first Name
        fullName = fullName.substring(spacePosition+1);
//        System.out.println(fullName);

        //Check Middle Initial and update string without it
        String middleName = "";
        if(fullName.contains("."))
        {
            middleName = fullName.substring(0, 2);
//            System.out.println(middleName);
            fullName = fullName.substring(3);
//            System.out.println("Full Name after middle: " + fullName);
        }

        //Grab suffix check after ","
        String suffix = "";
        if(fullName.contains(","))
        {
            int commaPosition = fullName.indexOf(',');
            suffix = fullName.substring(commaPosition+2);
            suffix = suffix.trim();
            fullName = fullName.substring(0, commaPosition);
        }

        //Remaining is Last Name
        String lastName = fullName;
        lastName = lastName.trim();


        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Suffix: " + suffix);
    }
}
