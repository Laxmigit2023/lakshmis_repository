package myJavaPrograms;

import java.util.Scanner;

public class cubeOfNumbers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sn.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("Number is " +i+" and cube of " +i+" is "+i*i*i);
        }
    }
   }
