package com.company;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ShortLongNumberTest {

    @Test
    // Проверка на максимальное число с помощью метода findTheMaxNumber()
    // класса ShortLongNumber и метода stream.max() класса Arrays
    public void isMax(){
        int[] testArray = {1,2,3,4,5};
        ShortLongNumber shortLongNumber = new ShortLongNumber(testArray);
        int maxClassNum = shortLongNumber.findTheMaxNumber();
        assertTrue(maxClassNum == Arrays.stream(shortLongNumber.arr).max().getAsInt());
    }

    // Проверка на максимальное число с помощью метода findTheMinNumber()
    //  класса ShortLongNumber и метода stream.min() класса Arrays
    @Test
    public void isMin(){
        int[] testArray = {1,2,3,4,5};
        ShortLongNumber shortLongNumber = new ShortLongNumber(testArray);
        int minClassNum = shortLongNumber.findTheMinNumber();
        assertTrue(minClassNum == Arrays.stream(shortLongNumber.arr).min().getAsInt());
    }
}