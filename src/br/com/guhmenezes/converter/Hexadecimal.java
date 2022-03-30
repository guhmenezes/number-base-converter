package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static br.com.guhmenezes.converter.CharHex.digToChar;


public class Hexadecimal {
    private static final List<Character> hexa = new ArrayList<>();

    public static void nToHexa(int n) {
        int quot = n;
        while (quot > 15) {
            int rest = quot % 16;
            hexa.add(digToChar(rest));
//            switch (rest) {
//                case 10 -> {
//                    rest = 'A';
//                    hexa.add((char) rest);
//                }
//                case 11 -> {
//                    rest = 'B';
//                    hexa.add((char) rest);
//                }
//                case 12 -> {
//                    rest = 'C';
//                    hexa.add((char) rest);
//                }
//                case 13 -> {
//                    rest = 'D';
//                    hexa.add((char) rest);
//                }
//                case 14 -> {
//                    rest = 'E';
//                    hexa.add((char) rest);
//                }
//                case 15 -> {
//                    rest = 'F';
//                    hexa.add((char) rest);
//                }
//                default -> hexa.add(Character.forDigit(rest, 10));
//            }
            quot /= 16;
        }

        hexa.add(digToChar(quot));
        Collections.reverse(hexa);
        for (Character dig : hexa) {
            System.out.print(dig);
        }
        hexa.clear();
        System.out.println();
    }
}
