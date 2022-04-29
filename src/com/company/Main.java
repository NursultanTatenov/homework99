package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Сан жазыныз! ");
            int a= scanner.nextInt();
            System.out.println("1 ден "+a+"го чейинки сандардын арасында 3ко, 4ко жана 5ке (баарына) калдыксыз\n" +
                    "      болунгон сандардын суммасы: "+sum(a));
        }
        static int sum(int a){
            int sum=0;
            for (int i = 1; i <= a ; i++) {
                if (i%3==0 && i%4==0 && i%5==0) { sum+=i;
                }
            }
            return sum;
        }
    }
