package andre.alura.conversor.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    private String apiKey = "a03ea2e8a4cb1d5b61f2f8c9";
    protected String currency1 = "";
    protected String currency2 = "";
    protected double amount = 0;
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void searchAPI () {
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + currency1 + "/" + currency2 + "/" + amount);

        HttpRequest request = HttpRequest.newBuilder().uri(uri).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Currency mensagem = gson.fromJson(json, Currency.class);
            System.out.println(mensagem);
            JsonGenerator jsonGenerator = new JsonGenerator();
            jsonGenerator.saveJson(mensagem);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Não foi possível converter");
        }

    }

}

