package program.nightwave;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.google.gson.Gson;

public class nightwave {
    public payload nightwave_details() {
        String text = null;
        try {
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间
            URL url = new URL("https://api.warframestat.us/pc/zh/nightwave/");
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
        payload pay = gson.fromJson(text, payload.class);
        System.out.println(pay.activeChallenges.get(0).desc);
        return pay;
    }

    payload pay = nightwave_details();

    public String getActivation() {
        return pay.activation;
    }

    public String getstartString() {
        return pay.startString;
    }

    public String getexpiry() {
        return pay.expiry;
    }

    public boolean getactive() {
        return pay.active;
    }

    public int getseason() {
        return pay.season;
    }

    public String getTag() {
        return pay.tag;
    }

    public boolean[] getactiveChallenges_active() {
        boolean[] temp = new boolean[pay.activeChallenges.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = pay.activeChallenges.get(i).active;
        }
        return temp;
    }

    public boolean[] getactiveChallenges_isDaily() {
        boolean[] temp = new boolean[pay.activeChallenges.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = pay.activeChallenges.get(i).isDaily;
        }
        return temp;
    }

    public boolean[] getactiveChallenges_isElite() {
        boolean[] temp = new boolean[pay.activeChallenges.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = pay.activeChallenges.get(i).isElite;
        }
        return temp;
    }

    public String[] getactiveChallenges_desc() {
        String[] temp = new String[pay.activeChallenges.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = pay.activeChallenges.get(i).desc;
        }
        return temp;
    }

    public String[] getactiveChallenges_title() {
        String[] temp = new String[pay.activeChallenges.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = pay.activeChallenges.get(i).title;
        }
        return temp;
    }

    public int[] getactiveChallenges_reputation() {

        int[] temp = new int[pay.activeChallenges.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = pay.activeChallenges.get(i).reputation;
        }
        return temp;
    }
}

class payload {
    String id;
    String activation;
    String startString;
    String expiry;
    boolean active;
    int season;
    String tag;
    List<activeChallenges> activeChallenges;

    public String getActivation() {
        return activation;
    }

    public List<activeChallenges> getActiveChallenges() {
        return activeChallenges;
    }

    public String getExpiry() {
        return expiry;
    }

    public String getId() {
        return id;
    }

    public int getSeason() {
        return season;
    }

    public String getStartString() {
        return startString;
    }

    public String getTag() {
        return tag;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setActiveChallenges(List<activeChallenges> activeChallenges) {
        this.activeChallenges = activeChallenges;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setStartString(String startString) {
        this.startString = startString;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

class activeChallenges {
    String id;
    String startString;
    String activation;
    boolean active;
    boolean isDaily;
    boolean isElite;
    String desc;
    String title;
    int reputation;
    boolean isPermanent;

    public String getActivation() {
        return activation;
    }

    public String getDesc() {
        return desc;
    }

    public String getId() {
        return id;
    }

    public int getReputation() {
        return reputation;
    }

    public String getStartString() {
        return startString;
    }

    public String getTitle() {
        return title;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setDaily(boolean isDaily) {
        this.isDaily = isDaily;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setElite(boolean isElite) {
        this.isElite = isElite;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPermanent(boolean isPermanent) {
        this.isPermanent = isPermanent;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public void setStartString(String startString) {
        this.startString = startString;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}