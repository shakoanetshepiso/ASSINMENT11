package com.company;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String name, msg;
	int age;
	final int TWELVE_HOURS = 12;

        Scanner sc = new Scanner(System.in);
        msg="Please enter your name:";
        System.out.println(msg);
        name = sc.nextLine();

       LocalTime time = LocalTime.now();

       if(time.getHour()< TWELVE_HOURS) {
            msg = "Good morning" + "\t" + name;
            System.out.println(msg);
     }else{
            msg = "Good afternoon" + "\t" + name;
            System.out.println(msg);
      }
        msg = "Please enter your age:";
        System.out.println(msg);
        age = sc.nextInt();

       Random random = new Random();
       int appAge = random.nextInt(90)+18;

        int ageDifference;

       if(appAge > age) {
           ageDifference = appAge - age;
           System.out.println("I am " + appAge + "years old, which is " + ageDifference + " years older than you");
       }
       else if(appAge < age){
           ageDifference = age - appAge;
           System.out.println("I am " + appAge + " years old, which is " + ageDifference + " years younger than you");
       }
       else{
           System.out.println("I am " + appAge + " years old, which is neither younger or older than you");

       }
        System.out.println("Twice my age would be: " + appAge * 2);//twice my age


        if( appAge % 2 == 0 ) {
            String evenOdd = "even number";
            System.out.println("My age is an: " + evenOdd );
        }
        else{
            String evenOdd = "odd number";
            System.out.println("My age is an: " + evenOdd);
        }
        System.exit(0);


    }
}
