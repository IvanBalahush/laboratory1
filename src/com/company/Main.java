package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        for (int i = 0; i< sizeOfArray;i++){
            System.out.print("Enter the "+ (i+1) +" number of array: ");
            array[i] = scanner.nextInt();
        }

        printTheArray(array);
        System.out.println("\nMax number = " + findTheMaxNumber(array));
        System.out.println("Min number = " + findTheMinNumber(array));

    }
    public static void printTheArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int findTheMaxNumber(int[] arr){
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
    public static int findTheMinNumber(int[] arr){
        int minNumber = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minNumber){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }
}
