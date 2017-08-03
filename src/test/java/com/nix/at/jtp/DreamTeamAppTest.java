package com.nix.at.jtp;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DreamTeamAppTest {

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void fastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void slowTest() {
        System.out.println("Slow test");
    }

}
