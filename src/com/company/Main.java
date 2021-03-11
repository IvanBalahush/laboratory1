package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ShortLongNumber shortLongNumber = new ShortLongNumber(5);
        int n = shortLongNumber.getSizeOfArray();
        System.out.println(n);
        shortLongNumber.fillArray();
        shortLongNumber.printTheArray();
        int max = shortLongNumber.findTheMaxNumber();
        int min = shortLongNumber.findTheMinNumber();
        System.out.println("\nMax: "+max);
        System.out.println("Hi!");
        System.out.println("Min: "+min);
    }
}
