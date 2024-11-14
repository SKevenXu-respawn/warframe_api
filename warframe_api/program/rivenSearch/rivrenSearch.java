package program.rivenSearch;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class rivrenSearch {
    payload pay;

    public payload riven_search(String weapon_name, String[] positive, String[] negitive) {
        String text = null;
        try {

            URL url = new URL("https://api.warframe.market/v1/auctions/search?type=riven&weapon_url_name=" + weapon_name
                    + urlapped_positive(positive) + urlapped_negitive(negitive)
                    + "&polarity=any&buyout_policy=direct&sort_by=price_asc");
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

        riven riv = gson.fromJson(text, riven.class);
        pay = gson.fromJson(riv.payload, payload.class);

        /* List<auctions> auca=gson.fromJson(pay,auctions.class); */
        /* owner owner =gson.fromJson(pay.auctions.get(0).owner, owner.class); */
        /* System.out.println(pay.auctions); */

        /*
         * for(int i=0;i<pay.auctions.size();i++){
         * item item=gson.fromJson(pay.auctions.get(i).item, item.class);
         * owner owner=gson.fromJson(pay.auctions.get(i).owner, owner.class);
         * 
         * if(pay.auctions.get(i).buyout_price<plat&&owner.status.hashCode()!=-
         * 1548612125){//这些可删
         * System.out.println("in game name="+owner.ingame_name);
         * System.out.println("buyout_price="+pay.auctions.get(i).buyout_price);
         * System.out.println("item name="+item.weapon_url_name+"-"+item.name);
         * System.out.println("is offline="+owner.status+"\n");
         * System.out.println("copy this:\t '/w "+owner.ingame_name+" Hi!'");
         * 
         * }
         * 
         * }
         */

        return pay;

    }

    public String[][] getdata() {
        Gson gson = new Gson();
        String[][] test = new String[pay.auctions.size()][6];

        for (int i = 0; i < pay.auctions.size(); i++) {
            item item = gson.fromJson(pay.auctions.get(i).item, item.class);
            owner owner = gson.fromJson(pay.auctions.get(i).owner, owner.class);

            /*
             * if(pay.auctions.get(i).buyout_price<plat&&owner.status.hashCode()!=-
             * 1548612125){
             */// 这些可删
            test[i][0] = owner.ingame_name;
            test[i][1] = String.valueOf(pay.auctions.get(i).buyout_price);
            test[i][2] = item.weapon_url_name;
            test[i][3] = item.name;
            test[i][4] = owner.status;
            test[i][5] = "copy this:\t '/w " + owner.ingame_name + " Hi! I want buy " + item.weapon_url_name + "-"
                    + item.name;

            /* } */

        }
        return test;
    }

    public String[] getattributes_url_name(int i) {

        Gson gson = new Gson();

        item item = gson.fromJson(pay.auctions.get(i).item, item.class);
        String[] temp = new String[item.attributes.size()];
        for (int j = 0; j < temp.length; j++) {
            temp[j] = item.attributes.get(j).url_name;
        }
        return temp;
    }

    public float[] getattributes_value(int i) {

        Gson gson = new Gson();

        item item = gson.fromJson(pay.auctions.get(i).item, item.class);
        float[] temp = new float[item.attributes.size()];
        for (int j = 0; j < temp.length; j++) {
            temp[j] = item.attributes.get(j).value;
        }
        return temp;
    }

    public boolean[] getattributes_positive(int i) {

        Gson gson = new Gson();

        item item = gson.fromJson(pay.auctions.get(i).item, item.class);
        boolean[] temp = new boolean[item.attributes.size()];
        for (int j = 0; j < temp.length; j++) {
            temp[j] = item.attributes.get(j).positive;
        }
        return temp;
    }

    public String urlapped_positive(String[] positive_keyword) {
        String POSITIVE_STATS = "&positive_stats=";

        StringBuffer temp = new StringBuffer();
        if (positive_keyword != null) {
            if (positive_keyword.length > 1) {
                temp.append(POSITIVE_STATS);
                for (int i = 0; i < positive_keyword.length - 1; i++) {
                    temp.append(positive_keyword[i] + ",");
                }
                temp.append(positive_keyword[positive_keyword.length - 1]);
            }
            if (positive_keyword.length == 1) {
                temp.append(POSITIVE_STATS);
                temp.append(positive_keyword[0]);
            }
            if (positive_keyword.length < 1) {
                temp.append("");
            }
        } else {
            temp.append("");
        }

        return temp.toString();

    }

    public String urlapped_negitive(String[] negitive_keyword) {

        String NEGITIVE_STATS = "&negative_stats=";
        StringBuffer temp = new StringBuffer();
        if (negitive_keyword != null) {
            if (negitive_keyword.length > 1) {
                temp.append(NEGITIVE_STATS);
                for (int i = 0; i < negitive_keyword.length - 1; i++) {
                    temp.append(negitive_keyword[i] + ",");
                }
                temp.append(negitive_keyword[negitive_keyword.length - 1]);
            }
            if (negitive_keyword.length == 1) {
                temp.append(NEGITIVE_STATS);
                temp.append(negitive_keyword[0]);
            }
            if (negitive_keyword.length < 1) {
                temp.append("");
            }
        } else {
            temp.append("");
        }

        return temp.toString();

    }

}

class riven {
    JsonObject payload;

    public JsonObject getPayload() {
        return payload;
    }

    public void setPayload(JsonObject payload) {
        this.payload = payload;
    }
}

class payload {
    List<auctions> auctions;

    public List<auctions> getAuctions() {
        return auctions;
    }

    public void setAuctions(List<auctions> auctions) {
        this.auctions = auctions;
    }
}

class auctions {

    int buyout_price;
    JsonObject item;
    int starting_price;
    boolean visible;
    JsonObject owner;
    String platform;
    boolean closed;
    boolean is_direct_sell;

    public int getBuyout_price() {
        return buyout_price;
    }

    public void setBuyout_price(int buyout_price) {
        this.buyout_price = buyout_price;
    }

    public JsonObject getItem() {
        return item;
    }

    public void setItem(JsonObject item) {
        this.item = item;
    }

    public int getStarting_price() {
        return starting_price;
    }

    public void setStarting_price(int starting_price) {
        this.starting_price = starting_price;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public JsonObject getOwner() {
        return owner;
    }

    public void setOwner(JsonObject owner) {
        this.owner = owner;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean getClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean getIs_direct_sell() {
        return is_direct_sell;
    }

    public void setIs_direct_sell(boolean is_direct_sell) {
        this.is_direct_sell = is_direct_sell;
    }

}

class item {
    String type;
    int mod_rank;
    String vazarin;
    int mastery_level;
    int re_rolls;
    String weapon_url_name;
    List<attributes> attributes;
    String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMod_rank() {
        return mod_rank;
    }

    public void setMod_rank(int mod_rank) {
        this.mod_rank = mod_rank;
    }

    public String getVazarin() {
        return vazarin;
    }

    public void setVazarin(String vazarin) {
        this.vazarin = vazarin;
    }

    public int getMastery_level() {
        return mastery_level;
    }

    public void setMastery_level(int mastery_level) {
        this.mastery_level = mastery_level;
    }

    public int getRe_rolls() {
        return re_rolls;
    }

    public void setRr_rolls(int re_rolls) {
        this.re_rolls = re_rolls;
    }

    public String getWeapon_url_name() {
        return weapon_url_name;
    }

    public void setWeapon_url_name(String weapon_url_name) {
        this.weapon_url_name = weapon_url_name;
    }

    public List<attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<attributes> attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class attributes {
    boolean positive;
    float value;
    String url_name;

    public boolean getPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getUrl_name() {
        return url_name;
    }

    public void setUrl_name(String url_name) {
        this.url_name = url_name;
    }
}

class owner {
    String ingame_name;
    String status;

    public String getIngame_name() {
        return ingame_name;
    }

    public void setIngame_name(String ingame_name) {
        this.ingame_name = ingame_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
/*
 * "payload": {
 * "auctions": [
 * {
 * "buyout_price": 20,
 * "item": {
 * "type": "riven",
 * "mod_rank": 0,
 * "polarity": "vazarin",
 * "mastery_level": 12,
 * "re_rolls": 0,
 * "weapon_url_name": "larkspur",
 * "attributes": [
 * {
 * "positive": true,
 * "value": 15.9,
 * "url_name": "heat_damage"
 * },
 * {
 * "positive": true,
 * "value": 8.2,
 * "url_name": "fire_rate_/_attack_speed"
 * },
 * {
 * "positive": false,
 * "value": -4.8,
 * "url_name": "slash_damage"
 * }
 * ],
 * "name": "cronipha"
 * },
 * "starting_price": 20,
 * "visible": true,
 * "owner": {
 * "ingame_name": "NikolsonAkaSamurai",
 * "status": "offline",
 * },
 * "platform": "pc",
 * "closed": false,
 * "is_direct_sell": true,
 * "private": false
 * },
 */