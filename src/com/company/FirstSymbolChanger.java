package com.company;

import java.util.Locale;

public class FirstSymbolChanger {

    public String changeFirstSymbol(String sentence, String word, String substr){
        String newWord = substr;
        sentence = sentence.toLowerCase(Locale.ROOT);
        word = word.toLowerCase(Locale.ROOT);

        String[] wordsArray = sentence.split(" ");

        sentence = "";

        for(int i = 0; i < wordsArray.length; i++){
            //System.out.println(wordsArray[i] + " == "+ word);
            if (wordsArray[i].equals(word)){
                wordsArray[i] = newWord;
            } else if (wordsArray[i].contains(word + ",")){
                wordsArray[i] = newWord + ",";
            }else if (wordsArray[i].contains(word + ".")){
                wordsArray[i] = newWord + ".";
            }
            sentence += wordsArray[i]+" ";
        }
       // System.out.println(sentence.trim());
        sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
        return sentence.trim();
    }




}
