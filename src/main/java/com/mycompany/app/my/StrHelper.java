package com.mycompany.app.my;

import java.util.HashMap;
import java.util.Map;

public class StrHelper {

    private Map<String, Integer> counterMap = new HashMap<>();

    public String[] Split(String message) {
        return message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
    }

    public Map<String, Integer> GetFrquency(String message) {
        return GetFrquency(Split(message));
    }

    public Map<String, Integer> GetFrquency(String[] words) {
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if (count == null)
                    count = 0;
                counterMap.put(word, ++count);
            }
        }
        return counterMap;
    }

    public void Print() {
        System.out.println(toString());
    }

    public String toString() {
        String str = "";
        for (String word : counterMap.keySet())
            str += word + ": " + counterMap.get(word) + "\n";
        return str;
    }

    public StrHelper() {

    }
}

