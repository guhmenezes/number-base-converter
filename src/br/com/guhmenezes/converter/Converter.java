package br.com.guhmenezes.converter;


import java.util.Scanner;

import static br.com.guhmenezes.converter.Binary.nToBinary;
import static br.com.guhmenezes.converter.Decimal.nToDecimal;
import static br.com.guhmenezes.converter.Hexadecimal.nToHexa;
import static br.com.guhmenezes.converter.Octal.nToOctal;
import static br.com.guhmenezes.converter.InputBase.baseVerify;

public class Converter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("***************************************************************");
        System.out.println("\n\t\t\t\tConversor de Base Numérica\n");
        System.out.println("***************************************************************");

        while (true) {
            System.out.print("\nInforme um número (Digite 0 para sair): ");
            try {
                int n = scan.nextInt();
                if (n == 0) break;
                System.out.print("""
                         Qual a base numérica?
                         1 - Binária
                         2 - Octal
                         3 - Decimal
                         4 - Hexadecimal
                         
                         """);
                int base = scan.nextInt();
                switch (base) {
                    case 1 -> {
                        base = 2;
                        if (baseVerify(Integer.toString(n),base)) {
                            System.out.printf("\nNúmero (%d)₂\n", n);
                            System.out.print("Decimal = ");
                            n = nToDecimal(Integer.toString(n), base);
                            System.out.print("Hexadecimal = ");
                            nToHexa(n);
                            System.out.print("Octal = ");
                            nToOctal(n);
                        } else System.out.printf("\n%d Não é um número binário\n", n);
                    }
                    case 2 -> {
                        base = 8;
                        if (baseVerify(Integer.toString(n),base)) {
                            System.out.printf("\nNúmero (%d)₈\n", n);
                            System.out.print("Decimal = ");
                            n = nToDecimal(Integer.toString(n), base);
                            System.out.print("Hexadecimal = ");
                            nToHexa(n);
                            System.out.print("Binário = ");
                            nToBinary(n);
                        } else System.out.printf("\n%d Não é um número octal.\n", n);
                    }
                    case 3 -> {
                        if (baseVerify(Integer.toString(n),10)) {
                            System.out.printf("\nNúmero (%d)₁₀\n", n);
                            System.out.print("Hexadecimal = ");
                            nToHexa(n);
                            System.out.print("Binário = ");
                            nToBinary(n);
                            System.out.print("Octal = ");
                            nToOctal(n);
                        } else System.out.printf("\n%d Não é um número decimal.\n", n);
                    }
                    case 4 -> {
                        base = 16;
                        if (baseVerify(Integer.toString(n),base)) {
                            System.out.printf("\nNúmero (%d)₁₆\n", n);
                            System.out.print("Decimal = ");
                            n = nToDecimal(Integer.toString(n), base);
                            System.out.print("Binário = ");
                            nToBinary(n);
                            System.out.print("Octal = ");
                            nToOctal(n);
                        } else System.out.printf("\n%d Não é um número hexadecimal.\n", n);
                    }
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                String input = scan.next();
                if (input.length() > 9){
                    break;
                }
                int n;
                int base = 16;

                if (baseVerify(input,base)) {
                    System.out.printf("\nNúmero (%s)₁₆\n", input);
                    System.out.print("Decimal = ");
                    n = nToDecimal(input, base);
                    System.out.print("Binário = ");
                    nToBinary(n);
                    System.out.print("Octal = ");
                    nToOctal(n);
                } else break;
            }
        }
    }
}
