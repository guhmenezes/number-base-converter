package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {
    private static int rest;
    private static int quot;
    private static List<Integer> binary = new ArrayList<>();


    public static void nToBinary(int n){
        quot = n;
        while (quot > 1){
            rest = quot % 2;
            binary.add(rest);
            quot /= 2;
        }
        binary.add(quot);
        Collections.reverse(binary);
        for (int dig : binary) System.out.print(dig);
    }
}
