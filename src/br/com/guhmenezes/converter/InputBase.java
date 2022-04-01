package br.com.guhmenezes.converter;

public class InputBase {
    public static boolean baseVerify(String input, int base){
        String[] inputArray = input.split("");
        for (String s : inputArray) {
            if (base == 2 && s.matches("[^0-1]")) return false;
            if (base == 8 && s.matches("[^0-7]")) return false;
            if (base == 10 && s.matches("[^0-9]")) return false;
            if (base == 16 && s.toUpperCase().matches("[^0-F]")) return false;
        }
        return true;
    }
}
