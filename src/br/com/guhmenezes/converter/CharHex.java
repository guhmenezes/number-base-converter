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

    public static int charToDig(String n){
        return switch (n.toUpperCase()) {
            case "A" -> 10;
            case "B" -> 11;
            case "C" -> 12;
            case "D" -> 13;
            case "E" -> 14;
            case "F" -> 15;
            default -> Integer.parseInt(n);
        };
    }
}
