package com.nix.at.jtp;

import java.util.List;

public class DreamTeamApp {

    public static void main(String[] args) {
        // TODO: add exception handling
        List<Student> students = new JsonReader().read();
        students.sort(new StudentComparator());
        print(students);
    }

    private static void print(List<Student> list) {
        // TODO: print list of students
    }
}
