package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Octal {
    private static List<Integer> octal = new ArrayList<>();


    public static void nToOctal(int n) {
        int quot = n;
        while (quot > 7) {
            int rest = quot % 8;
            octal.add(rest);
            quot /= 8;
        }
        octal.add(quot);
        Collections.reverse(octal);
        for (int dig : octal) System.out.print(dig);
        octal.clear();
        System.out.println();

    }
}
