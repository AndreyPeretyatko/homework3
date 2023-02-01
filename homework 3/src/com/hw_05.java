package com;

import java.util.Scanner;

public class hw_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNum=scanner.nextInt();
        int minNumber=currentNum % 10;
        while (currentNum!=-1){
            String [] numbers=String.valueOf(currentNum).split("\\s*");
            for(String s:numbers){
                if(Integer.parseInt(s)<minNumber){
                    minNumber=Integer.parseInt(s);
                }
            }
            currentNum=scanner.nextInt();
        }
        System.out.println(minNumber);
    }
}
