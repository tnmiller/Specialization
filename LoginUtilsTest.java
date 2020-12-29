package com.example.myfirstapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class
LoginUtilsTest {

    private LoginUtils utils;

    @Before
    public void setUp(){
        utils = new LoginUtils();
    }

    @Test
    public void aValidEmailPasses() {
        assertTrue(utils.isValid("foo@bar.com"));
    }

    @Test
    public void anInvalidEAFails(){
        assertFalse(utils.isValid("invalid"));
    }

    @Test
    public void localPartLengthTest(){
        assertEquals(1, utils.getLocalPartLength("a@b.com"));
    }
}