package com.nix.at.jtp;

import JsonPackage.JsonReader;
import JsonPackage.StudentList;

import java.util.Arrays;
import java.util.List;

public class DreamTeamApp {

    public static void main(String[] args) {
        try {
            StudentList studentList = JsonReader.read();
            List<Student> list = Arrays.asList(studentList.getStudents());
            list.sort(new StudentComparator());
            print(list);
        } catch (Exception e) {
            //TODO: add exception handling
        }
    }

    private static void print(List<Student> list) {
        // TODO: print list of students
    }
}