package javaBasicPrograms;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args){
        printAsciiAtoZ();
        asciiInput();
    }

    private static void asciiInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("The value of "+ch+" :"+(int)ch);
    }

    private static void printAsciiAtoZ() {
        for(int i=65;i<=90;i++){
            System.out.println("The value of "+(char)i+" :"+i);
        }
    }
}
