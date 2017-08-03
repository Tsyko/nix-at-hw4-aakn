package com.nix.at.jtp;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentComparatorTest {

    @Test(groups = { "fast" })
    public void sortTest() {
        final List<Student> list = new ArrayList<>();
        final List<Student> expected = new ArrayList<>();
        final Student student1 = new Student("aaa", "bbb", 20);
        final Student student2 = new Student("aaa", "bbb", 21);
        final Student student3 = new Student("aaa", "ccc", 21);
        final Student student4 = new Student("bbb", "aaa", 18);

        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student1);

        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);

        list.sort(new StudentComparator());

        Assert.assertEquals(list, expected);
    }
}
