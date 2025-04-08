
package br.com.alura.challenge;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarValorMoeda {

    public TaxaConversao buscarValor(String moeda){

        HttpClient client = HttpClient.newHttpClient();

        URI url = URI.create("https://v6.exchangerate-api.com/v6/758221960137ffbbfea0b9e1/latest/"+moeda);

        HttpRequest request = HttpRequest.newBuilder().uri(url).build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), TaxaConversao.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o valor da moeda.!");
        }


    }

}
