package com.stackroute;

public class Student {




    private int id;
    private String name;
    private int age;


    //Get Student Constructor


    public Student(int id,String name,int age){

        this.id = id;
        this.age = age;
        this.name = name;
    }

    //get id

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
