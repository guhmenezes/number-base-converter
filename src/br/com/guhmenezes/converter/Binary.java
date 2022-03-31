package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {
    private static final List<Integer>
    BYNARY= new ArrayList<>();


    public static void nToBinary(int n){
        int quot = n;
        while (quot > 1){
            int rest = quot % 2;

            BYNARY.add(rest);
            quot /= 2;
        }

        BYNARY.add(quot);
        Collections.reverse(
                BYNARY
        );
        for (int dig :
        BYNARY) System.out.print(dig);

        BYNARY.clear();
        System.out.println();

    }
}
