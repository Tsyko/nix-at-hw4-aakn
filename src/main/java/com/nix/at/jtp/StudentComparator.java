package com.nix.at.jtp;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student first, Student second) {
        // TODO: compare 2 students, return -1, 0 or 1
        // sort first by name, then by age, then by course
        // test StudentComparatorTest must not fail :)

        int n = first.getName().compareToIgnoreCase(second.getName());
        if (n==0) {
            n = first.getCourse().compareToIgnoreCase(second.getCourse());
        }
        if (n==0) {
          n =  (first.getAge() < second.getAge()) ? -1 : ((first.getAge() == second.getAge()) ? 0 : 1);
        }
        return n;
    }
}
