package br.com.guhmenezes.converter;

public class CharHex {

    public static char digToChar(int n) {
        switch (n) {
            case 10 -> {
                return 'A';
            }
            case 11 -> {
                return 'B';
            }
            case 12 -> {
                return 'C';
            }
            case 13 -> {
                return 'D';
            }
            case 14 -> {
                return 'E';
            }
            case 15 -> {
                return 'F';
            }
            default -> {return Character.forDigit(n,10);}
        }
    }
}
