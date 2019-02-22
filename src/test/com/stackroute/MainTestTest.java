package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {

    MainTest mainTest;

    @Before
    public void setUp() throws Exception {
        mainTest = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        mainTest = null;
    }

    @Test
    public void sortStudentList() {

        List<Student> li = new ArrayList<Student>();
      //  StudentSorter studentSorter = new StudentSorter();

        Student s1 = new Student(1,"ajay",23);
        Student s2 = new Student(2,"aman",23);
        Student s3 = new Student(3,"sounak",25);
        Student s4 = new Student(4,"subojit",24);
        Student s5 = new Student(5,"santosh",12);


        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        li.add(s5);



        String str="[Student{id=3, name='sounak', age=25}, Student{id=4, name='subojit', age=24}, Student{id=2, name='aman', age=23}, Student{id=1, name='ajay', age=23}, Student{id=5, name='santosh', age=12}]";
       assertEquals(str,mainTest.sortStudentList(li).toString());
       assertNotNull(mainTest);
    }
}