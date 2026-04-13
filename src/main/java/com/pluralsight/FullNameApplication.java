package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        String fullName = myScanner.nextLine();

        String[] partsOfName = fullName.split(" ");
//        for(int i = 0; i < partsOfName.length; i++)
//        {
//            System.out.println(partsOfName[i]);
//        }

        String firstName = partsOfName[0];
        String middleName = "";
        String lastName = "";
        String suffix = "";
        if(partsOfName[1].contains("."))
        {
            middleName = partsOfName[1];
            lastName = partsOfName[2];
            if(lastName.endsWith(","))
            {
                lastName = lastName.substring(0,lastName.length()-1);
            }

            System.out.println("Changed last name no COMMA " + lastName);
            if(partsOfName.length == 4)
            {
                suffix = partsOfName[3];
            }
        }
        else
        {
            lastName = partsOfName[1];
            if(lastName.endsWith(","))
            {
                lastName = lastName.substring(0,lastName.length()-1);
            }
            if(partsOfName.length == 3)
            {
                suffix = partsOfName[2];

            }

        }


//
//        //Grab first name by checking first instance of space
//        int spacePosition  = fullName.indexOf(' ');
//        String firstName = fullName.substring(0,spacePosition);
//
//        //Update the String without the first Name
//        fullName = fullName.substring(spacePosition+1);
////        System.out.println(fullName);
//
//        //Check Middle Initial and update string without it
//        String middleName = "";
//        if(fullName.contains("."))
//        {
//            middleName = fullName.substring(0, 2);
////            System.out.println(middleName);
//            fullName = fullName.substring(3);
////            System.out.println("Full Name after middle: " + fullName);
//        }
//
//        //Grab suffix check after ","
//        String suffix = "";
//        if(fullName.contains(","))
//        {
//            int commaPosition = fullName.indexOf(',');
//            suffix = fullName.substring(commaPosition+2);
//            suffix = suffix.trim();
//            fullName = fullName.substring(0, commaPosition);
//        }
//
//        //Remaining is Last Name
//        String lastName = fullName;
//        lastName = lastName.trim();
//
//
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Suffix: " + suffix);


    }
}
