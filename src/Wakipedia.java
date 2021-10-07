import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class Wakipedia {

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://en.wikipedia.org/api/rest_v1/page/summary/Wikipedia")
                .method("GET", null)
                .addHeader("Cookie", "GeoIP=US:NY:Farmingdale:40.73:-73.43:v4; WMF-Last-Access-Global=06-Oct-2021; WMF-Last-Access=06-Oct-2021")
                .build();
        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

