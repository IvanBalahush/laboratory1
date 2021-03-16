package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ShortLongNumber {
    Scanner scanner = new Scanner(System.in);

    public int[] arr;


    public ShortLongNumber(int size){
        this.arr = new int[size];
    }

    public ShortLongNumber(){
        System.out.print("Enter the size of array: ");
        this.arr = new int[scanner.nextInt()];
    }

    public ShortLongNumber(int[] arr){
        this.arr = arr;
    }

    public void fillArray(){
        for (int i = 0; i < arr.length;i++){
            System.out.print("Enter the "+ (i+1) +" number of array: ");
            arr[i] = scanner.nextInt();
        }
    }

    public int getSizeOfArray() {
        return arr.length;
    }
    public void printTheArray(){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int findTheMaxNumber(){
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    public int findTheMinNumber(){
        int minNumber = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minNumber){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }
}
