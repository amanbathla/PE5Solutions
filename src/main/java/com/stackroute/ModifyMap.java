package com.stackroute;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

//Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//Modify and return the given map as follows:
//a. If the key `val1` has
//b. Set the key `val1` to
//Example 1:
//The map {"val1": "java",
//"java"}
//Example 2:
//The map {"val1": "mars",
//"mars"}
//a value, set the key `val2` to have that value, and
//have the value `" "` (empty​ ​ string​ ).
//"val2": "c++"} should return {"val1": " ", "val2":
//"val2": "saturn"}
//should return {"val1": " ", "val2":

public class ModifyMap {


    //Function to modify the map interfacae and sewap key values

    public  Map<String,String> modifyMap(Map<String,String> inputMap){

        Map<String,String>  map = inputMap;


        List<String> indexes = new ArrayList<String>(map.keySet());

        String firstKey = map.keySet().stream().findFirst().get();

         String valueOf1stKey = map.get(firstKey);

         if(!valueOf1stKey.trim().isEmpty()){
             map.put(firstKey," ");
             map.put("val2",valueOf1stKey);
         }



        return map;

    }
}
