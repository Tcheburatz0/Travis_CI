package com.mycompany.app.my;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class WhiteBoxTests {

    private StrHelper strHelper = new StrHelper();

    @org.junit.Test
    public void SplitTest() throws Exception {
        String[] strs = {
                "a b c d i f g h i j k",
                "1 2 3 4 5 6 7 8 9 ",
                "я ленивая задница, мне лень потратить 10 минут на решение простейшей задачи. Я лучше пойду поем."
        };
        String[][] expected = {
                {"a", "b", "c", "d", "i", "f", "g", "h", "i", "j", "k"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"я", "ленивая", "задница", "мне", "лень", "потратить", "10", "минут", "на", "решение", "простейшей", "задачи", "я", "лучше", "пойду", "поем"}
        };
        for (int i = 0; i < strs.length; i++) {
            assertEquals(expected[i], strHelper.Split(strs[i]));
        }
    }

    @org.junit.Test
    public void FrequencyTest() throws Exception {
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
        assertEquals(expected, strHelper.GetFrquency(message));
    }
}
