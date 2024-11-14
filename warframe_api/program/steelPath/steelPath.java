package program.steelPath;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class steelPath {
    public steelPaths steelPath_Data() {
        String text=null;
        try {
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间
            URL url = new URL("https://api.warframestat.us/pc/zh/steelPath/");
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
        steelPaths steel = gson.fromJson(text, steelPaths.class);
        return steel;
    }

    public steelPaths steel=steelPath_Data();
    public currentReward curr=curr_Data();

    public currentReward curr_Data(){
        Gson gson=new Gson();
        currentReward curr=gson.fromJson(steel.currentReward,currentReward.class);
        return curr;
    }
    
    public String curr_name(){
        return curr.name;
    }
    public int curr_cost(){
        return curr.cost;
    }
    public String steel_remaining(){
        return steel.remaining;
    }
}

class steelPaths{
    String remaining;
    JsonObject currentReward;
    public  JsonObject getCurrentReward(){
        return currentReward;
    }
    public void setCurrentReward(JsonObject  currentReward){
        this.currentReward=currentReward;
    }
    public String getRemaining(){
        return remaining;
    }
    public void setRemaining(String remaining){
        this.remaining=remaining;
    }
}
class currentReward{
    String name;
    int cost;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
}
   /*  "currentReward": {
        "name": "Zaw 裂罅 Mod",
        "cost": 75
    },
    "activation": "2023-11-13T00:00:00.000Z",
    "expiry": "2023-11-19T23:59:59.000Z",
    "remaining": "1d 12h 20m 17s", */