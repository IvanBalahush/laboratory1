package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PolinomTest {

    @Test
    public void getSumTest(){
        ArrayList<RationalFraction>  arrayList = new ArrayList<>();
        arrayList.add(new RationalFraction(1,2));
        arrayList.add(new RationalFraction(1,3));
        arrayList.add(new RationalFraction(1,4));
        RationalFraction testFraction = new RationalFraction(26,24);
        Polinom polinom = new Polinom(arrayList);
        RationalFraction polinomFraction = polinom.getSum();
        assertTrue(testFraction.getM() == polinomFraction.getM() && testFraction.getN() == polinomFraction.getN());
    }
}