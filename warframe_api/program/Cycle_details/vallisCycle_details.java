package program.Cycle_details;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class vallisCycle_details {
    public vallisCycle_data vallisCycle_detail() {
        String text=null;
        try {
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间
            URL url = new URL("https://api.warframestat.us/pc/vallisCycle/");
            // 2、连接服务器:打开服务器连接,得到对象conn
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            // 3、加载数据:获取加载数据的字节输入流
            InputStream is = conn.getInputStream();
            // 4、将is装饰为能一次读取一行的字符输入流br
            // BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            // 5、加载一行数据ca
            text = br.readLine();

        } catch (Exception e) {
            System.out.println("false");
        }
        Gson gson = new Gson();

        vallisCycle_data vallis = gson.fromJson(text, vallisCycle_data.class);
        return vallis;
    }
    
    public vallisCycle_data vallis =vallisCycle_detail();

    public boolean vallisCycle_detail_isWarm(){
         return vallis.isWarm;

    }
    public String vallisCycle_detail_timeLeft(){
         return vallis.timeLeft;
    }

    class vallisCycle_data {
        String id;
        String expiry;
        boolean isWarm;
        String timeLeft;

        /*
         * {
         * "id": "string",
         * "expiry": "string",
         * "timeLeft": "string",
         * "isWarm": true
         * }
         */
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getExpiry() {
            return expiry;
        }

        public void setExpiry(String expiry) {
            this.expiry = expiry;
        }

        public boolean getIsWarm() {
            return isWarm;
        }

        public void setIsWarm(boolean iswarm) {
            this.isWarm = iswarm;
        }

        public String gettimeLeft() {
            return timeLeft;
        }

        public void settimeLeft(String timeLeft) {
            this.timeLeft = timeLeft;
        }
    }
}
