package program.getWeaponPlat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class getplat {
    public String[][] plat_detail(String urlname) {
        String text = null;
        try {
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间
            URL url = new URL("https://api.warframe.market/v1/items/" + urlname + "/orders?include=item");
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
        data data = gson.fromJson(text, data.class);
        // data data=gson.fromJson(text, data.class);
        payload pay = gson.fromJson(data.payload, payload.class);

        /*
         * String tempdata=gson.toJson(pay);
         * 
         * item it=gson.fromJson(tempdata, item.class);
         */

        String[][] temp = new String[pay.orders.size()][4];
        for (int i = 0; i < temp.length; i++) {
            user user = gson.fromJson(pay.orders.get(i).user, user.class);
                
                temp[i][0] = String.valueOf(pay.orders.get(i).platinum);

                temp[i][1] = String.valueOf(pay.orders.get(i).visible);
                temp[i][2]=user.status;
                temp[i][3]=user.ingame_name;

        }

        return temp;
    }
}

class data {
    JsonObject payload;

    public JsonObject getpayload() {
        return payload;
    }

    public void setpayload(JsonObject payload) {
        this.payload = payload;
    }
}

class payload {
    List<orders> orders;

    public List<orders> getOrders() {
        return orders;
    }

    public void setOrder(List<orders> orders) {
        this.orders = orders;
    }
}

class orders {
    int platinum;
    JsonObject user;
    boolean visible;

    public int getPlatnum() {
        return platinum;
    }

    public void setPlatnum(int platinum) {
        this.platinum = platinum;
    }

    public JsonObject getUser() {
        return user;
    }

    public void setUser(JsonObject user) {
        this.user = user;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}

class user {
    String status;
    String ingame_name;
    public String getingame_name(){
        return ingame_name;
    }
    public void setIngame_name(String ingame_name){
        this.ingame_name=ingame_name;
    }

    public String getOffline() {
        return status;
    }

    public void setOffline(String status) {
        this.status = status;
    }
}

/*
 * {
 * "payload": {
 * "orders": [
 * {
 * "order_type": "sell",
 * "platinum": 20,
 * "quantity": 1,
 * "user": {
 * 
 * "status": "offline"
 * },
 * 
 * "visible": true,
 * 
 * 
 * },
 */
