package program.riven_arbitration;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class getriven_arbitration {
    private payload riven_arbitration() {
        String text = null;
        try {

            URL url = new URL("https://api.warframe.market/v1/riven/attributes");
            // 2、连接服务器:打开服务器连接,得到对象conn
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            conn.setRequestProperty("Language", "zh-hans");
            // 3、加载数据:获取加载数据的字节输入流
            InputStream is = conn.getInputStream();
            // 4、将is装饰为能一次读取一行的字符输入流br
            // BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            // 5、加载一行数据ca
            text = br.readLine();
            // System.out.println(unicodeDecode(text));

            // 使用正则表达式替换所有的Unicode转义序列

        } catch (Exception e) {
            System.out.println("false" + e);

        }

        Gson gson = new Gson();
        demo demo = gson.fromJson(unicodeDecode(text), demo.class);
        payload payload = gson.fromJson(demo.payload, payload.class);
        // System.out.println(payload.attributes.get(0).effect);
        return payload;

    }

    payload payload = riven_arbitration();

    public String[] geteffects() {
        String[] temp = new String[payload.attributes.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = payload.attributes.get(i).effect;
        }
        return temp;
    }

    public String[] geturl_names() {
        String[] temp = new String[payload.attributes.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = payload.attributes.get(i).url_name;
        }
        return temp;
    }

    public String[] getids() {
        String[] temp = new String[payload.attributes.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = payload.attributes.get(i).id;
        }
        return temp;
    }

    private static String unicodeDecode(String string) {
        Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher matcher = pattern.matcher(string);
        char ch;
        while (matcher.find()) {
            ch = (char) Integer.parseInt(matcher.group(2), 16);
            string = string.replace(matcher.group(1), ch + "");
        }
        return string;
    }

}

class demo {
    JsonObject payload;

    public JsonObject getPayload() {
        return payload;
    }

    public void setPayload(JsonObject payload) {
        this.payload = payload;
    }
}

class payload {
    List<attributes> attributes;

    public List<attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<attributes> attributes) {
        this.attributes = attributes;
    }
}

class attributes {
    String effect;
    String id;
    String url_name;

    public String getUrl_name() {
        return url_name;
    }

    public String getId() {
        return id;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUrl_name(String url_name) {
        this.url_name = url_name;
    }
}
