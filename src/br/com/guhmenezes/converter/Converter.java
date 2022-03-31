package br.com.guhmenezes.converter;

public class Converter {
    public static void main(String[] args) {
        //Testes
        Binary.nToBinary(12412);
        Binary.nToBinary(93);
        Octal.nToOctal(12412);
        Octal.nToOctal(8);
        Decimal.nToDecimal("11000001111100",2);
        Decimal.nToDecimal("1011101", 2);
        Decimal.nToDecimal("1A82", 16);
        Decimal.nToDecimal("73", 8);
        Decimal.nToDecimal("1750", 8);

        Decimal.nToDecimal("10", 2);
        Hexadecimal.nToHexa(12412);
        Hexadecimal.nToHexa(16);
//        for(int i = 0; i < 1000; i++){
//            System.out.print(i + " ");
//            Hexadecimal.nToHexa(i);
//        }
    }
}
