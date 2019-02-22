package com.stackroute;

import java.util.Map;
import java.util.HashMap;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;


//Write a program to find the number of counts in the following ​ String​ . Store the output in
//Map<​ String​ ,Integer> as key value pair.
//Input : ​ String​ str = “one one -one___two,,three,one @three*one?two”;
//Output : {"one":5 , "two":2, "three" :2}

public class CountOccuranceOfWords {



   //Function to check occurance of words

    public Map<String,Integer> checkOccuranceOfWords(String str){


        Map<String,Integer>  map= new HashMap<String, Integer>();


        String el [] = str.split("([\\W\\s]+)");
        for (String s : el) {
            int count = 0;
            if (map.containsKey(s)) {
                count = map.get(s);
            }
            map.put(s, count + 1);
        }

        return  map;
    }
}
