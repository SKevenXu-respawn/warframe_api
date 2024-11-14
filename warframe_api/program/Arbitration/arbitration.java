package program.Arbitration;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;



public class arbitration {
    public arbitration_data arbitrations() {
        String text=null;
        try {

            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间
            URL url = new URL("https://api.warframestat.us/pc/zh/arbitration/");
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
        arbitration_data arbit = gson.fromJson(text, arbitration_data.class);

        return arbit;
    }
    public arbitration_data arbit=arbitrations();

    public String arbitnode(){
        return arbit.node;
    }
    public String arbitenemy(){
        return arbit.enemy;
    }
    public String arbittype(){
        return arbit.type;
    }
    public String arbittime(){
        getTime gt=new getTime();
        return String.valueOf(gt.gettime(arbit.expiry, arbit.activation)) ;
    }

}
class arbitration_data{
    /*  "activation": "2023-11-17T10:05:00.000Z",
    "expiry": "2023-11-17T11:04:00.000Z",
    "enemy": "Corpus",
    "type": "生存",
    "archwing": false,
    "sharkwing": false,
    "node": "Tycho (月球)",
    "nodeKey": "Tycho (Lua)",
    "typeKey": "Survival",
    "id": "4f3616e74b97152a8f481ef2f203254a3d107002d856171c688de81aaf79d9c5",
    "expired": true */
    String activation;
    String expiry;
    String enemy;
    String type;
    String node;
    public String getActivation(){
        return activation;
    }
    public void setActivation(String activation){
        this.activation=activation;
    }
    public String getExpiry(){
        return expiry;
    }
    public void setExpiry(String expiry){
        this.expiry=expiry;
    }
    public String getEnemy(){
        return enemy;
    }
    public void setEnemy(String enemy){
        this.enemy=enemy;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getNode(){
        return node;
    }
    public void setNode(String node){
        this.node=node;
    }
}
