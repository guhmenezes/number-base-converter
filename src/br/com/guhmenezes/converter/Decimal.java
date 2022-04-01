package br.com.guhmenezes.converter;

import static br.com.guhmenezes.converter.CharHex.charToDig;

public class Decimal {

    public static int nToDecimal(String n, int base){
        int decimal = 0;
        int digit;
        String[] digits;
        digits = n.split("");

        if (base == 2 || base == 8) {
            for (int i = 0; i < digits.length; i++) {
                digit = Integer.parseInt(digits[digits.length - (i + 1)]);
                decimal += digit * Math.pow(base, i);
            }
        }

        else if (base == 16){
            for (int i = 0; i < digits.length; i++) {
                digit = charToDig(digits[digits.length - (i + 1)]);
                decimal += digit * Math.pow(base, i);
            }
        }
        System.out.println(decimal);
        return decimal;
    }
}
