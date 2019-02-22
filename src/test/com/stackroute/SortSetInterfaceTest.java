package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortSetInterfaceTest {


    SortSetInterface sortSetInterface;

    @Before
    public void setUp() throws Exception {
        sortSetInterface = new SortSetInterface();
    }

    @After
    public void tearDown() throws Exception {
        sortSetInterface = null;
    }

    @Test
    public void sortSetInterface() {

        Set<String> hash_Set = new HashSet<String>();{
            hash_Set.add("Harry");
            hash_Set.add("Olive");
            hash_Set.add("Alice");
            hash_Set.add("Buto");
            hash_Set.add("Eugene");
        }

        Set<String> sortedHashSet = new TreeSet<>();{

            sortedHashSet.add("Harry");
            sortedHashSet.add("Olive");
            sortedHashSet.add("Alice");
            sortedHashSet.add("Buto");
            sortedHashSet.add("Eugene");
        }
         assertEquals(sortedHashSet,sortSetInterface.sortSetInterface(hash_Set));
        assertNotNull(sortedHashSet);

    }


    @Test
    public void sortSetInterface1() {

        Set<String> hash_Set = new HashSet<String>();{
            hash_Set.add("Aman");
            hash_Set.add("Bathla");
            hash_Set.add("subojit");
            hash_Set.add("sounak");
            hash_Set.add("aish");
        }

        Set<String> sortedHashSet = new TreeSet<>();{

            sortedHashSet.add("Aman");
            sortedHashSet.add("Bathla");
            sortedHashSet.add("subojit");
            sortedHashSet.add("sounak");
            sortedHashSet.add("aish");
        }
        assertEquals(sortedHashSet,sortSetInterface.sortSetInterface(hash_Set));
        assertNotNull(sortedHashSet);


    }
}