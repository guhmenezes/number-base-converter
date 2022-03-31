package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Octal {
    private static final List<Integer> OCTAL = new ArrayList<>();


    public static void nToOctal(int n) {
        int quot = n;
        while (quot > 7) {
            int rest = quot % 8;
            OCTAL.add(rest);
            quot /= 8;
        }
        OCTAL.add(quot);
        Collections.reverse(OCTAL);
        for (int dig : OCTAL) System.out.print(dig);
        OCTAL.clear();
        System.out.println();

    }
}
