package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {
    private static final List<Integer>
    BYNARY= new ArrayList<>();


    public static void nToBinary(long n){
        long quot = n;
        while (quot > 1){
            long rest = quot % 2;

            BYNARY.add((int)rest);
            quot /= 2;
        }

        BYNARY.add((int)quot);
        Collections.reverse(
                BYNARY
        );
        for (int dig :
        BYNARY) System.out.print(dig);

        BYNARY.clear();
        System.out.println();

    }

//    public static void nToBinary(String n){
//        long quot = Long.parseLong(n);
//        while (quot > 1){
//            long rest = quot % 2;
//
//            BYNARY.add((int)rest);
//            quot /= 2;
//        }
//
//        BYNARY.add((int)quot);
//        Collections.reverse(
//                BYNARY
//        );
//        for (int dig :
//                BYNARY) System.out.print(dig);
//
//        BYNARY.clear();
//        System.out.println();
//
//    }
}
