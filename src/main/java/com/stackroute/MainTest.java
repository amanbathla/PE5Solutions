package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create a Student class that represents the following information of a student: id, name, and age
//all the member variables should be private .
//a. Implement `getter and setter` .
//b. Create a `StudentSorter` class that implements `Comparator interface` .
//c. Write a class `Maintest` create Student class object(minimum 5)
//d. Add these student object into a List of type Student .
//e. Sort the list based on their age in decreasing order, for student having
//same age, sort based on their name.
//f. For students having same name and age, sort them according to their ID.


public class MainTest {

    public List<Student> sortStudentList(List<Student> list){

        Collections.sort(list,new StudentSorter());
        return list;

    }
}
