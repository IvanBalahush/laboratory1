package com.company;

import java.util.ArrayList;

public class Polinom {
    private ArrayList<RationalFraction> k;

    public Polinom(ArrayList<RationalFraction> k){
        this.k = k;
    }

    public RationalFraction getSum(){
        RationalFraction sum = new RationalFraction(0,0);

        for (RationalFraction rationalFraction : k){
            RationalFraction s = RationalFraction.sumFraction(sum, rationalFraction);
            sum.setM(s.getM());
            sum.setN(s.getN());
        }
        return sum;
    }

}
