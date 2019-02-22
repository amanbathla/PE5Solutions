package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TwoOccuranceOfCharacterTest {


    TwoOccuranceOfCharacter twoOccuranceOfCharacter;

    @Before
    public void setUp() throws Exception {
        twoOccuranceOfCharacter = new TwoOccuranceOfCharacter();
    }

    @After
    public void tearDown() throws Exception {
        twoOccuranceOfCharacter = null;
    }

    @Test
    public void checkOccuranceOfWords() {
     String arr[] = {"a","a","a","b","v","c","c"};
        Map<String,Boolean> map = new HashMap<String,Boolean>();{
            map.put("a",true);
            map.put("b",false);
            map.put("c",true);
            map.put("v",false);

        }
        assertEquals(map,twoOccuranceOfCharacter.checkOccuranceOfWords(arr));
        assertNotNull(twoOccuranceOfCharacter.checkOccuranceOfWords(arr));

    }


    @Test
    public void checkOccuranceOfWords1() {
        String arr1[] = {"a","a","a","b","v","c","c"};
        String arr[] = {"a","a","a","b","v","c","c","d","d","d","d","c","c","c"};
        Map<String,Boolean> map = new HashMap<String,Boolean>();{
            map.put("a",true);
            map.put("b",false);
            map.put("c",true);
            map.put("v",false);
            map.put("d",true);

        }
        assertEquals(map,twoOccuranceOfCharacter.checkOccuranceOfWords(arr));
        assertNotNull(twoOccuranceOfCharacter.checkOccuranceOfWords(arr));
        assertNotEquals(map,twoOccuranceOfCharacter.checkOccuranceOfWords(arr1));

    }
}