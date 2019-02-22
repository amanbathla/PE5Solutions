package com.stackroute;

import java.util.HashMap;
import java.util.Map;


//Write a program where an array of strings is input and output is a Map<​ String​ ,boolean> where
//each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array
//Input :​ ​ String​ arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//Output - {“a” : true,”b” :false ,”c” :true,”d” : false}


public class TwoOccuranceOfCharacter {


    // Function to check occurance of words

    public Map<String,Boolean> checkOccuranceOfWords(String[] arr){


        Map<String,Integer>  map= new HashMap<String, Integer>();
        Map<String,Boolean> outputMap = new HashMap<String,Boolean>();

        String el [] = arr;

          for (String s : el) {
              int count = 0;
                 if (map.containsKey(s)) {
                     count = map.get(s);
                 }
             map.put(s, count + 1);
        }

        for(String s:el){
            if(map.containsKey(s)){
                int checkGretaerThen2 = map.get(s);
                     if(checkGretaerThen2 >=2){
                            outputMap.put(s,true);
                         }
                      else{
                            outputMap.put(s,false);
                         }
            }
        }
        return  outputMap;
    }

}
