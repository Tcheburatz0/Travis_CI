package com.mycompany.app.my;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
 
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Andie */
 
public class Main {
    /**
     * @param args the command line arguments*/
     
    
    public static void main(String[] args) {
        String message = "я ленивая //////.d, s'f'svl;sd ,,, ;; задница, мне лень потратить 10 минут на решение простейшей задачи. Я лучше пойду поем и потрачу 10 минут на решение тестов!";
        String [] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
 
        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
 
        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
            //System.out.println(counterMap);
        }
       
        //MyFrame MyFrame = new MyFrame ("My Frame");
    }
    
    
    
       
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

/*package com.company;

import java.util.Map;
import java.util.Scanner;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StrHelper strHelper = new StrHelper();
        Map<String, Integer> items = strHelper.GetFrquency(line);
       strHelper.Print(items);
    }
}*/
