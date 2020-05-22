package lesson12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://ithillel.ua/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

    }
}
