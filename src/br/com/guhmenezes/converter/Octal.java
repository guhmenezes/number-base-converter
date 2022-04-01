package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Octal {
    private static final List<Integer> OCTAL = new ArrayList<>();


    public static void nToOctal(long n) {
        long quot = n;
        while (quot > 7) {
            long rest = quot % 8;
            OCTAL.add((int)rest);
            quot /= 8;
        }
        OCTAL.add((int)quot);
        Collections.reverse(OCTAL);
        for (int dig : OCTAL) System.out.print(dig);
        OCTAL.clear();
        System.out.println();

    }
}
