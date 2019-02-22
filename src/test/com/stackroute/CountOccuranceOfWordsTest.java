package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;



public class CountOccuranceOfWordsTest {


    CountOccuranceOfWords countOccuranceOfWords;

    @Before
    public void setUp() throws Exception {
        countOccuranceOfWords = new CountOccuranceOfWords();
    }

    @After
    public void tearDown() throws Exception {
        countOccuranceOfWords = null;
    }


    @Test
    public void checkOccuranceOfWords() {
           String inputString = "one one -one  two,,three,one @three*one?two";
        String inputString1 = "one one two,,three,one @three*one?two";

        Map<String,Integer> map= new HashMap<String, Integer>();{
          map.put("one",5);
          map.put("two",2);
          map.put("three",2);
        }

        assertEquals(map,countOccuranceOfWords.checkOccuranceOfWords(inputString));
        assertNotEquals(map,countOccuranceOfWords.checkOccuranceOfWords(inputString1));

    }
}