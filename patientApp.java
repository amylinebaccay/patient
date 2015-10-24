/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class patientApp {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String fName;
        String lName;
        int num;
        String adrs;

    System.out.println("Patient Information");
    System.out.println("===========================");

    System.out.println("First Name:");
    fname = sc.next();
    System.out.println("Last Name:");
    lname = sc.next();
    System.out.println("Age:");
    num= sc.nextInt();
    System.out.println("Address:");
    adrs = sc.next();



    }
}
