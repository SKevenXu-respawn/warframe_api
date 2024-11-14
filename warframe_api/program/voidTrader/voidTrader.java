package program.voidTrader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.google.gson.Gson;

public class voidTrader {
    public voidTraders voidTrader_Data() {
        String text = null;
        try {
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间
            URL url = new URL("https://api.warframestat.us/pc/zh/voidTrader/");
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
        voidTraders steel = gson.fromJson(text, voidTraders.class);

        return steel;
    }

    public voidTraders steel = voidTrader_Data();

    public String voidLocation() {
        return steel.location;
    }

    public String voidEndString() {
        return steel.endString;
    }

    public String[] item() {
        String[] items = new String[steel.inventory.size()];
        for (int i = 0; i < items.length; i++) {
            items[i] = steel.inventory.get(i).item;
        }
        return items;
    }

    public int[] item_ducats() {
        int[] ducats = new int[steel.inventory.size()];
        for (int i = 0; i < ducats.length; i++) {
            ducats[i] = steel.inventory.get(i).ducats;
        }
        return ducats;
    }

    public int[] item_credits() {
        int[] credits = new int[steel.inventory.size()];
        for (int i = 0; i < credits.length; i++) {
            credits[i] = steel.inventory.get(i).credits;
        }
        return credits;
    }

    public boolean voidtrader_active() {
        return steel.active;
    }

    public String getexpiry() {
        return steel.expiry;
    }

    public String getstartString() {
        return steel.startString;
    }

}

class voidTraders {
    String startString;
    String expiry;
    boolean active;
    String location;
    List<inventory> inventory;
    String endString;

    public String getStartString() {
        return startString;
    }

    public void setStartString(String startString) {
        this.startString = startString;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEndString() {
        return endString;
    }

    public void setEndString(String endString) {
        this.endString = endString;
    }

    public List<inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<inventory> inventory) {
        this.inventory = inventory;
    }
}

class inventory {
    String item;
    int ducats;
    int credits;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getDucats() {
        return ducats;
    }

    public void setDucats(int ducats) {
        this.ducats = ducats;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
/*
 * {
 * 
 * 
 * "startString": "-23h 2m 43s",
 * "expiry": "2023-11-19T14:00:00.000Z",
 * "active": true,
 * 
 * "location": "Kronia 中继站 (土星)",
 * "inventory": [
 * {
 * "uniqueName":
 * "/Lotus/StoreItems/Upgrades/Skins/Sigils/EventSigilScarletSpear",
 * "item": "Event Sigil Scarlet Spear",
 * "ducats": 45,
 * "credits": 45000
 * },
 * ],
 * 
 * "endString": "1d 1h 57m 16s",
 * }
 */
