package com.stackroute;
import java.util.List;
import java.util.ArrayList;


//1. Write a Java program to update specific array element by given element and empty the ​ array list​ .
//Input: [Apple, Grape, Melon, Berry]
//Output: [Kiwi, Grape, Mango, Berry]
//Array list​ after removing all elements []

public class ArrayListUpdate {



    //Function to update Map list Element

    public List<String> updateAndDeleteArray(List<String> inputList,String elementToReplace,String updatedValue){

        List<String> Outputlist = new ArrayList<String>(inputList);


        for(String str: Outputlist) {
            if(str.trim().contains(elementToReplace)){

                Outputlist.set(Outputlist.indexOf(elementToReplace),updatedValue);
            }

        }
        for(String str: Outputlist) {
            if(str.trim().contains(elementToReplace)){

                Outputlist.set(Outputlist.indexOf(elementToReplace),updatedValue);
            }

        }

        return Outputlist;
    }

    //Delete the whole list

    public Boolean deleteList(List<String> list){
        list.removeAll(list);
        if(list.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }

}
