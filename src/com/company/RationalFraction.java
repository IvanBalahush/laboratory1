package com.company;


import java.util.ArrayList;

public class RationalFraction {

    private int m;
    private int n;

    public RationalFraction(int m, int n){

        this.m = m;
        denominatorSign(n);
        this.n = Math.abs(n);
    }
    public void denominatorSign(int num){
        if (num < 0){
            m = -m;

        }
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    //
    public static RationalFraction sumFraction(RationalFraction firstFraction, RationalFraction secondFraction){
        if(firstFraction.getN() == 0 || firstFraction.getM() == 0){
            return secondFraction;
        }
        else if(secondFraction.getN() == 0 || secondFraction.getM() == 0){
            return firstFraction;
        }
        int theFirstChrist = firstFraction.getN() * secondFraction.getM();
        int theSecondChrist = firstFraction.getM() * secondFraction.getN();
        int sumNumerator = theFirstChrist + theSecondChrist;
        int sumDenominator = firstFraction.getN()* secondFraction.getN();
        return new RationalFraction(sumNumerator, sumDenominator);
    }
    public static void addNextEven(ArrayList<RationalFraction> fractions){
        for(int i = 0; i + 1 < fractions.size(); i+=2 ){
            fractions.set(i, sumFraction(fractions.get(i), fractions.get(i+1)));
        }
    }
}
