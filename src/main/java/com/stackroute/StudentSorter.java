package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator {


    @Override
    public int compare(Object o, Object t1) {
        if (((Student) (o)).getAge() > ((Student) (t1)).getAge()) {
            return -1;

        }
        //sort by name if the age is same
        else if (((Student) (o)).getAge() == ((Student) (t1)).getAge()) {
            int compareString = ((Student) (o)).getName().compareTo(((Student) (t1)).getName());
            if (compareString > 0) {
                return -1;
            } else if (compareString == 0) {
                if (((Student) (o)).getId() > ((Student) (t1)).getId()) {
                    return -1;

                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        else {
            return 1;
        }



    }
}
