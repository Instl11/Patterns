package patterns.streamHomework;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpTest {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();

        URI uri = new URI("http://yandex.ru");

        HttpRequest post = HttpRequest.newBuilder(uri)
                .POST(HttpRequest.BodyPublishers.ofString("Hello world!!!"))
                .build();

        HttpResponse<String> postResponse = client.send(post, HttpResponse.BodyHandlers.ofString());
        String body = postResponse.body();
        System.out.println(body);
    }
}
