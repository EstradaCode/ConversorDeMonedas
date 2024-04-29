package Utilities;

import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExchangeRequest {
    // EXCHANGE RELATIVE TO A PARAMETRE (NAME) -> NAME MUST BE CONTAIN IN ARRAYLIST
    // https://v6.exchangerate-api.com/v6/YOUR-API-KEY/enriched/GBP/JPY BUSCAR ELEMENT NAME
   // https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD PUEDO OBTENER EL GBP
        public static String getPairConversion(String base_Code, String target_Code ){
                return "null";
        }
        public static String getPairConversionAmount(String base_Code, String target_Code, double amount){
                return "null";
        }
        public static String getAllCurrencies(String base_Code){
            URI connector = URI.create("https://v6.exchangerate-api.com/v6/dd7d3ba16824901d7d78b4fd/latest/" + base_Code);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(connector).build();
            HttpResponse<String> response;
            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
            JsonObject jElement = new Gson().fromJson(response.body(),JsonObject.class );
            JsonObject j = jElement.getAsJsonObject("conversion_rates");
            String currencies = "";
            for(Map.Entry<String,JsonElement> entrada: j.entrySet()){
                currencies += entrada.getKey() +" : " + entrada.getValue().getAsString() + " \n";
            }
            return currencies;
        }
}
