package program.ConstructionProgress;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class construction {
    public constructions constructions_detail() {
        String text=null;
        try {
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间
            URL url = new URL("https://api.warframestat.us/pc/zh/constructionProgress//");
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
        constructions construct = gson.fromJson(text, constructions.class);

        return construct;
    }
    public constructions construct=constructions_detail();
    public float getFomorian(){
        return construct.fomorianProgress;
    }
    public float getRazorback(){
        return construct.razorbackProgress;
    }
}
class constructions{
    float fomorianProgress;
    float razorbackProgress;
    public float getFomorianProgress(){
        return fomorianProgress;
    }
    public void setFomorianProress(float fomorianProgress){
        this.fomorianProgress=fomorianProgress;
    }
    public float getRazorbackProgress(){
        return razorbackProgress;
    }
    public void setRazorbackProgress(float razorbackProgress){
        this.razorbackProgress=razorbackProgress;
    }
}
