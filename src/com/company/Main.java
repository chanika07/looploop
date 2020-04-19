package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double rub = sc.nextDouble();


       while (true){
           int nub=0;
           if (nub==n){
               System.out.println("Full");
               break;

           }
           double sum=0;

           while (true){
               int cou=0;
               double g = sc.nextDouble();
               if (g<0){
                   break;
               }
                sum+=g;
                cou++;
               if (sum/cou >=rub){
                   System.out.println("Congrat");
                   nub++;
               }
               else {
                   System.out.println("Sorry");
               }
           }

       }
    }
}
