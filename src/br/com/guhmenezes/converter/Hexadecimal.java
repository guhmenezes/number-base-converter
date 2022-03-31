package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static br.com.guhmenezes.converter.CharHex.digToChar;


public class Hexadecimal {
    private static final List<Character> HEXA = new ArrayList<>();

    public static void nToHexa(int n) {
        int quot = n;
        while (quot > 15) {
            int rest = quot % 16;
            HEXA.add(digToChar(rest));
            quot /= 16;
        }

        HEXA.add(digToChar(quot));
        Collections.reverse(HEXA);
        for (Character dig : HEXA) {
            System.out.print(dig);
        }
        HEXA.clear();
        System.out.println();
    }
}
