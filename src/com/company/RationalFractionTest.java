package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RationalFractionTest {

    @Test
    public void sumFractionsTest(){
        RationalFraction firstFraction = new RationalFraction(5,7);
        RationalFraction secondFraction = new RationalFraction(3,11);
        RationalFraction sumOfTwoFractions = RationalFraction.sumFraction(firstFraction,secondFraction);
        RationalFraction test = new RationalFraction(76, 77);
        assertTrue(test.getM() == sumOfTwoFractions.getM() && test.getN() == sumOfTwoFractions.getN());
    }
    @Test
    public void denominatorSignTest(){
        RationalFraction firstFraction = new RationalFraction(5,-7);
        RationalFraction secondFraction = new RationalFraction(3,11);
        RationalFraction sumOfTwoFractions = RationalFraction.sumFraction(firstFraction,secondFraction);
        RationalFraction test = new RationalFraction(-34, 77);
        System.out.println(firstFraction.getM()+" "+ firstFraction.getN());
        System.out.println(sumOfTwoFractions.getM()+" " + sumOfTwoFractions.getN());
        assertTrue(test.getM() == sumOfTwoFractions.getM() && test.getN() == sumOfTwoFractions.getN());
    }
    @Test
    public void addNextEvenTest(){
        ArrayList<RationalFraction> arrayList = new ArrayList<RationalFraction>();
        arrayList.add(new RationalFraction(1,2));
        arrayList.add(new RationalFraction(1,3));
        arrayList.add(new RationalFraction(1,4));
        RationalFraction.addNextEven(arrayList);
        RationalFraction testFraction = new RationalFraction(5,6);
        assertTrue(arrayList.get(0).getM() == testFraction.getM() && arrayList.get(0).getN() == testFraction.getN() && arrayList.get(1).getM() == 1 && arrayList.get(1).getN() == 3);
    }
}