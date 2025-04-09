
package br.com.alura.challenge;

import com.google.gson.Gson;

import java.util.Map;

public class RetornaValorMoeda {

    public double retornaValorConvertido(String string, String moeda){
        Gson gson = new Gson();
        Map<String, Double> taxas = gson.fromJson(string, Map.class);
        return taxas.get(moeda);
    }

}
