package conversor.herramientas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicioApi {

    public double obtenerConversion(String pMonedaInicial, String pMonedaFinal){

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            String direccion = "https://v6.exchangerate-api.com/v6/1c637b3d90f17acf5cbbbf36/pair/"+pMonedaInicial+"/"+pMonedaFinal;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .GET()
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            RatioExchangeApi rExchange = gson.fromJson(json, RatioExchangeApi.class);

            double exchangeRatio = rExchange.conversion_rate();

            return exchangeRatio;

        } catch (Exception e) {
            System.out.println("Error inesperado" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
