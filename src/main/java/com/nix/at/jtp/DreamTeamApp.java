package com.nix.at.jtp;

import JsonPackage.JsonReader;
import JsonPackage.StudentList;

public class DreamTeamApp {

    public static void main(String[] args) {

        //TODO: add exception handling
        StudentList studentList = JsonReader.read();
        //studentList.sort(new StudentComparator());

        }

    private static void print(Student[] students) {
        // TODO: add exception handling

    }
}