package Utilities;
import Classes.Code;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ExchangeCodes {
    public static List<Code> RequestCodes(){
        URI connector = URI.create("https://v6.exchangerate-api.com/v6/dd7d3ba16824901d7d78b4fd/codes");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(connector).build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        JsonObject jElement = new Gson().fromJson(response.body(),JsonObject.class );
        JsonArray jsonArr = jElement.getAsJsonArray("supported_codes");
        List<Code> l = new ArrayList<Code>();
        for( JsonElement j : jsonArr){
            JsonArray codeFields = j.getAsJsonArray();
            l.add(new Code(codeFields.get(0).getAsString(),codeFields.get(1).getAsString()));
        }
        return l;
    }
}
