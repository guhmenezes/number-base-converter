package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {
    private static List<Integer> binary = new ArrayList<>();


    public static void nToBinary(int n){
        int quot = n;
        while (quot > 1){
            int rest = quot % 2;
            binary.add(rest);
            quot /= 2;
        }
        binary.add(quot);
        Collections.reverse(binary);
        for (int dig : binary) System.out.print(dig);
        binary.clear();
        System.out.println();

    }
}
