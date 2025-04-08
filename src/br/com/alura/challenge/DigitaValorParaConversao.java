package br.com.alura.challenge;

import java.util.Scanner;

public class DigitaValorParaConversao {

    public double digitarValor(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor que quer converter: ");
        double valorParaConverter = leitura.nextDouble();
        return valorParaConverter;
    }

}




