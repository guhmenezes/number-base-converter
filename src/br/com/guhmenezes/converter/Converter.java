package br.com.guhmenezes.converter;

public class Converter {
    public static void main(String[] args) {
        Binary.nToBinary(12412);
        Binary.nToBinary(2);
        Octal.nToOctal(12412);
        Octal.nToOctal(8);
//        Decimal.ntoDecimal(11000001111100);
//        Decimal.ntoDecimal(10);
        Hexadecimal.nToHexa(12412);
        Hexadecimal.nToHexa(16);
        for(int i = 0; i < 1000; i++){
            System.out.print(i + " ");
            Hexadecimal.nToHexa(i);
        }
    }
}
