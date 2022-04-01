package br.com.guhmenezes.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {
    private static final List<Integer>
    BINARY= new ArrayList<>();


    public static void nToBinary(long n){
        long quot = n;
        while (quot > 1){
            long rest = quot % 2;

            BINARY.add((int)rest);
            quot /= 2;
        }

        BINARY.add((int)quot);
        Collections.reverse(
                BINARY
        );
        for (int dig :
        BINARY) System.out.print(dig);

        BINARY.clear();
        System.out.println();

    }
}
