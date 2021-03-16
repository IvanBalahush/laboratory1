package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstSymbolChangerTest {

    private final FirstSymbolChanger firstSymbolChanger = new FirstSymbolChanger();

    @Test
    public void oneSameWord(){

        String a = "Word word sword";
        String b = firstSymbolChanger.changeFirstSymbol("word word sword", "word","word");
        assertTrue(a.equals(b));
    }
    @Test
    public void differentWords(){
        String a = firstSymbolChanger.changeFirstSymbol("I hate mariana ro","hate","love");
        assertTrue(a.equals("I love mariana ro"));
    }
    @Test
    public void firstLetterIsUpper(){
        String a = firstSymbolChanger.changeFirstSymbol("word","word","word");
        assertTrue(a.substring(0,1).equals("W"));
    }
    @Test
    public void ignoreDotAndComma(){
        String a = firstSymbolChanger.changeFirstSymbol("word. word, word", "word", "word");
    }
}