package program.Cycle_details;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class cetusCycle_details {
    public cetusCycle_data cetusCycle_detail() {
        String text=null;
        
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间

            try {
                URL url = new URL("https://api.warframestat.us/pc/cetusCycle/");
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
               
            }
            
            Gson gson = new Gson();
            cetusCycle_data cetus = gson.fromJson(text, cetusCycle_data.class);

        
        return cetus;
    }
    cetusCycle_data cetus=cetusCycle_detail();
    public boolean cetusCycle_detail_isday(){
             
                    /* System.out.println("现在地球时间:夜晚   " + cetus.isday); */
                    
                return cetus.isday;
    }
    public String cetusCycle_detail_timeLeft(){
        
                
                    /* System.out.println("距离白天还有:" + cetus.timeLeft); */
                return cetus.timeLeft;
    }

    class cetusCycle_data {
        String id;
        String activation;
        String expiry;
        String startString;
        boolean active;
        boolean isday;
        String state;
        String timeLeft;
        boolean isCetus;
        String shortString;

        /*
         * {
         * "id": "string",
         * "activation": "2019-08-24T14:15:22Z",
         * "expiry": "2019-08-24T14:15:22Z",
         * "startString": "string",
         * "active": true,
         * "isDay": true,
         * "state": "string",
         * "timeLeft": "string",
         * "isCetus": true,
         * "shortString": "string"
         * }
         */
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getActivation() {
            return activation;
        }

        public void setActivation(String activation) {
            this.activation = activation;
        }

        public String getExpiry() {
            return expiry;
        }

        public void setExpiry(String expiry) {
            this.expiry = expiry;
        }

        public String getstartString() {
            return startString;
        }

        public void setstartString(String startString) {
            this.startString = startString;
        }

        public boolean getactive() {
            return active;
        }

        public void setactive(boolean active) {
            this.active = active;
        }

        public boolean getIsday() {
            return isday;
        }

        public void setIsday(boolean isday) {
            this.isday = isday;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public boolean getIscetus() {
            return isCetus;
        }

        public void setIscetus(boolean isCetus) {
            this.isCetus = isCetus;
        }

        public String gettimeLeft() {
            return timeLeft;
        }

        public void settimeLeft(String timeLeft) {
            this.timeLeft = timeLeft;
        }

        public String getShortString() {
            return shortString;
        }

        public void setShortString(String shortString) {
            this.shortString = shortString;
        }
    }
}
