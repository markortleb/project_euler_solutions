package com.markortleb.projecteuler1;

import java.util.*;

public class ProjectEuler1 {
    public static void main(String[] args) {
        
        int sumOfMuiltiples = 0;

        for (int i = 1; i < 1000; i++){
            if (i % 5 == 0 || i % 3 == 0){
                sumOfMuiltiples += i;
            }
        }

        System.out.println(sumOfMuiltiples);
    }
}