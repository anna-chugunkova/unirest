import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by chugunkova_a on 30/12/2016.
 */
public class Runner {
    public static void main(String[] args) throws UnirestException {
        final HttpResponse<JsonNode> jsonResponse = Unirest.post('https://tradable.com')
                .header("accept", "application/json").asJson();
        System.out.println(jsonResponse.getBody());
    }
}
