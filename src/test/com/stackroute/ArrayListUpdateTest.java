package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;




public class ArrayListUpdateTest {

    ArrayListUpdate arrayListUpdate;

    @Before
    public void setUp() throws Exception {
        arrayListUpdate = new ArrayListUpdate();
    }

    @After
    public void tearDown() throws Exception {
        arrayListUpdate = null;
    }

    @Test
    public void updateAndDeleteArray() {

        List<String> inputList =  new ArrayList<>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        List<String> outputList =  new ArrayList<>(Arrays.asList("Kiwi", "Grape", "Melon", "Berry"));
        List<String> outputList1 =  new ArrayList<>(Arrays.asList("Apple", "PineApple", "Melon", "Berry"));
        assertEquals(outputList,arrayListUpdate.updateAndDeleteArray(inputList,"Apple","Kiwi"));
        assertNotEquals(inputList,arrayListUpdate.updateAndDeleteArray(inputList,"Apple","Kiwi"));

    }


    @Test
    public void updateAndDeleteArray1() {

        List<String> inputList =  new ArrayList<>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        List<String> outputList =  new ArrayList<>(Arrays.asList("Kiwi", "Grape", "Melon", "Berry"));
        List<String> outputList1 =  new ArrayList<>(Arrays.asList("Apple", "PineApple", "Melon", "Berry"));

        assertEquals(outputList1,arrayListUpdate.updateAndDeleteArray(inputList,"Grape","PineApple"));
        assertTrue(arrayListUpdate.deleteList(outputList));
    }


}