package com.stackroute;

import java.util.*;



//Write a program to implement set interface which sorts the given randomly ordered names inascending order. Convert the sorted set in to an ​ array list
//Input : Harry Olive Alice Bluto Eugene
//Output :
//Sorted Set : Alice Bluto Eugene Harry Olive
//Array list​ from Set : Alice Bluto Eugene Harry Olive


public class SortSetInterface {


   // Function to sort the set interface and converted to the Array list as well

    public Set<String> sortSetInterface(Set<String> set){

        Set<String> hash_Set = set;

       Set<String> sortedHashSet = new TreeSet<String>();
        List<String> sortedSet = new ArrayList<String>(hash_Set);

        // sort using Collections.sort(); method
        Collections.sort(sortedSet);


        // After Sorting

        for(String coach : sortedSet) {
            sortedHashSet.add(coach);
        }


        return sortedHashSet;
    }
}
