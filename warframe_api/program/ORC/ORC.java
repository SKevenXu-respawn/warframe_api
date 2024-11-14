package program.ORC;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Base64;

public class ORC {

    public String orcpapi(String API_KEY, String FILE_PATH) {
        String text = null;
        // 创建HttpClient实例
        HttpClient client = HttpClient.newHttpClient();
        String url = "https://api.ocr.space/parse/image";
        // String apiKey = "712f5b19a288957"; // 替换为您的OCR.space API密钥

        try {
            String base64FileContent = encodeImageToBase64(FILE_PATH);
            String requestBody = "&language=chs"
                    + "&OCREngine=2"
                    + "&base64Image=" + "data:image/jpg; base64,"
                    + URLEncoder.encode(base64FileContent, StandardCharsets.UTF_8.toString());

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .header("apikey", API_KEY)
                    .header("filetype", "base64Image")
                    .POST(BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println("apikey:\t" + API_KEY);
            System.out.println("file path:\t" + FILE_PATH);
            System.out.println("request time\t" + request.timeout());
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
            text = response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\ntext" + text);
        return text;
    }

    public static String encodeImageToBase64(String imagePath) {
        String text = null;
        try {
            try (InputStream imageFileInputStream = new FileInputStream(imagePath)) {
                // 创建BufferedInputStream来提高读取效率
                try (InputStream bufferedInputStream = new BufferedInputStream(imageFileInputStream)) {
                    // 读取图片字节数据
                    byte[] imageBytes = new byte[bufferedInputStream.available()];
                    // 读取字节数据到数组
                    bufferedInputStream.read(imageBytes);
                    // 使用Base64编码字节数据
                    text = Base64.getEncoder().encodeToString(imageBytes);
                    // System.out.println(text + "\n\n\n\n");
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return text;
    }
}