package br.com.alura.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        var opc = 0;

        while (opc != 7) {

            System.out.println("*--------------------------------------------------*");
            System.out.println("|      Seja bem vindo/a ao Conversor de Moedas     |");
            System.out.println("| 1) Converte Dólar           ---> Peso Argentino  |");
            System.out.println("| 2) Converte Peso Argentino  ---> Dólar           |");
            System.out.println("| 3) Converte Dólar           ---> Real Brasileiro |");
            System.out.println("| 4) Converte Real Brasileiro ---> Dólar           |");
            System.out.println("| 5) Converte Dólar           ---> Peso Colombiano |");
            System.out.println("| 6) Converte Peso Colombiano ---> Dólar           |");
            System.out.println("| 7) Sair                                          |");
            System.out.println("*--------------------------------------------------*");
            System.out.println("  Escolha uma opção: ");
            opc = leitura.nextInt();
            if (opc == 7) {
                break;
            }

            BuscarValorMoeda buscar = new BuscarValorMoeda();
            DigitaValorParaConversao digita = new DigitaValorParaConversao();

            switch (opc) {

                case 1: {
                    var valor = buscar.buscarValor("USD");   // Busca na Api os valores para conversão
                    var valorParaConverter = digita.digitarValor(); // Digita o valor da moeda a ser convertida
                    RetornaValorMoeda valorMoeda = new RetornaValorMoeda();
                    String stringParaProcura = valor.conversion_rates().toString(); // Transforma retorno da api em string;
                    var valorConversao = valorMoeda.retornoValor(stringParaProcura, "ARS"); // Retorna o valor da moeda a ser convertida
                    System.out.println(String.format("Valor de %.2f %s %.7f %s",valorParaConverter,"[USD] corresponde ao valor final de ==>> ", (valorParaConverter * valorConversao)," [ARS]"));
                    break;
                }
                case 2: {
                    var valor = buscar.buscarValor("ARS");
                    var valorParaConverter = digita.digitarValor();
                    RetornaValorMoeda valorMoeda = new RetornaValorMoeda();
                    String stringParaProcura = valor.conversion_rates().toString();
                    var valorConversao = valorMoeda.retornoValor(stringParaProcura, "USD");
                    System.out.println(String.format("Valor de %.2f %s %.7f %s",valorParaConverter,"[ARS] corresponde ao valor final de ==>> ", (valorParaConverter * valorConversao)," [USD]"));
                    break;
                }
                case 3: {
                    var valor = buscar.buscarValor("USD");
                    var valorParaConverter = digita.digitarValor();
                    RetornaValorMoeda valorMoeda = new RetornaValorMoeda();
                    String stringParaProcura = valor.conversion_rates().toString();
                    var valorConversao = valorMoeda.retornoValor(stringParaProcura, "BRL");
                    System.out.println(String.format("Valor de %.2f %s %.7f %s",valorParaConverter,"[USD] corresponde ao valor final de ==>> ", (valorParaConverter * valorConversao)," [BRL]"));
                    break;
                }
                case 4: {
                    var valor = buscar.buscarValor("BRL");
                    var valorParaConverter = digita.digitarValor();
                    RetornaValorMoeda valorMoeda = new RetornaValorMoeda();
                    String stringParaProcura = valor.conversion_rates().toString();
                    var valorConversao = valorMoeda.retornoValor(stringParaProcura, "USD");
                    System.out.println(String.format("Valor de %.2f %s %.7f %s",valorParaConverter,"[BRL] corresponde ao valor final de ==>> ", (valorParaConverter * valorConversao)," [USD]"));
                    break;
                }
                case 5: {
                    var valor = buscar.buscarValor("USD");
                    var valorParaConverter = digita.digitarValor();
                    RetornaValorMoeda valorMoeda = new RetornaValorMoeda();
                    String stringParaProcura = valor.conversion_rates().toString();
                    var valorConversao = valorMoeda.retornoValor(stringParaProcura, "COP");
                    System.out.println(String.format("Valor de %.2f %s %.7f %s",valorParaConverter,"[USD] corresponde ao valor final de ==>> ", (valorParaConverter * valorConversao)," [COP]"));
                    break;
                }
                case 6: {
                    var valor = buscar.buscarValor("COP");
                    var valorParaConverter = digita.digitarValor();
                    RetornaValorMoeda valorMoeda = new RetornaValorMoeda();
                    String stringParaProcura = valor.conversion_rates().toString();
                    var valorConversao = valorMoeda.retornoValor(stringParaProcura, "USD");
                    System.out.println(String.format("Valor de %.2f %s %.7f %s",valorParaConverter,"[COP] corresponde ao valor final de ==>> ", (valorParaConverter * valorConversao)," [USD]"));
                    break;
                }
            }
        }

    }
}
