package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapTest {


    ModifyMap modifyMap;

    @Before
    public void setUp() throws Exception {
        modifyMap = new ModifyMap();
    }

    @After
    public void tearDown() throws Exception {
        modifyMap = null;
    }


    @Test
    public void modifyMap() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("val1", "aman");
        map.put("val2", "bathla");

        Map<String, String> mapOutput = new LinkedHashMap<String, String>();
        mapOutput.put("val1", " ");
        mapOutput.put("val2", "aman");


        assertEquals(mapOutput,modifyMap.modifyMap(map));
       assertEquals(mapOutput,modifyMap.modifyMap(mapOutput));
    }

    @Test
    public void modifyMap1() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("val1", "aman111");
        map.put("val2", "bathla");

        Map<String, String> mapOutput = new LinkedHashMap<String, String>();
        mapOutput.put("val1", " ");
        mapOutput.put("val2", "aman111");


        assertEquals(mapOutput,modifyMap.modifyMap(map));
        assertEquals(mapOutput,modifyMap.modifyMap(mapOutput));
    }
}