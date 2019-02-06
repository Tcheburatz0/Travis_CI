package com.mycompany.app.my;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andie
 */
public class BlackBoxTests {


    /**
     * Test of GetFrquency method, of class StrHelper.
     */


    /**
     * Test of GetFrquency method, of class StrHelper.
     */
    @Test
    public void IONullTest() throws Exception {
        String message = "";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("",null);

        StrHelper strHelper = new StrHelper();
        assertEquals(expected, strHelper.GetFrquency(message));


    }

    /**
     * Test of toString method, of class StrHelper.
     */
    @Test
    public void IOTest() throws Exception {
        String message = "я ленивая задница, мне лень потратить 10 минут на решение простейшей задачи. Я лучше пойду поем.";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("я", 2);
        expected.put("ленивая", 1);
        expected.put("задница", 1);
        expected.put("мне", 1);
        expected.put("лень", 1);
        expected.put("потратить", 1);
        expected.put("10", 1);
        expected.put("минут", 1);
        expected.put("на", 1);
        expected.put("решение", 1);
        expected.put("задачи", 1);
        expected.put("лучше", 1);
        expected.put("пойду", 1);
        expected.put("поем", 1);
        expected.put("простейшей", 1);
        StrHelper strHelper = new StrHelper();
        assertEquals(expected, strHelper.GetFrquency(message));
    }
}

    

