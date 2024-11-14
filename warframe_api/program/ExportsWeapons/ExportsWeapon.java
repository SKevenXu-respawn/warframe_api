package program.ExportsWeapons;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ExportsWeapon {
    public String ExportWeapon_data() {
        String text = null;

        StringBuilder sb = new StringBuilder();

        try {
            URL url = new URL(
                    "https://content.warframe.com/PublicExport/Manifest/ExportDrones_zh.json!00_nm9WLTe5YxwZGgPklStPJw");
            System.out.println("ok" + url.hashCode());
            // 打开与URL的连接
            URLConnection conn = url.openConnection();
            // HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            System.out.println("ok" + conn.getConnectTimeout());
            // 2、连接服务器:打开服务器连接,得到对象conn

            // conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0;Windows NT; DigExt)");
            // 3、加载数据:获取加载数据的字节输入流
            InputStream is = conn.getInputStream();
            // 4、将is装饰为能一次读取一行的字符输入流br
            System.out.println("ok" + is.hashCode());
            // BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
            System.out.println("ok" + br.hashCode());
            // 5、加载一行数据ca
            String longString;
            while ((longString = br.readLine()) != null) {
                text = longString;
                System.out.println("ok" + text);
            }
            br.close();
            is.close();

            /*
             * String line;
             * StringBuilder sb = new StringBuilder();
             * while ((line = br.readLine()) != null) {
             * sb.append(line).append(System.lineSeparator());
             * }
             * longString = sb.toString();
             */
        } catch (Exception e) {
            System.out.println("false" + e);
        }
        /*
         * for (int i = 0; i < arrayList.size(); i++) {
         * System.out.println("for:" + i);
         * text = text + arrayList.get(i);
         * 
         * }
         */
        // System.out.println(text);

        return text;
    }

    // public payload pay = ExportWeapon_data();

    /*
     * public String getList() {
     * return pay.ExportWeapons.get(0).name;
     * }
     */
}

/**
 * InnerExportsWeapon
 */
class payload {
    List<ExportWeapons> ExportWeapons;

    public List<ExportWeapons> getExportWeapons() {
        return ExportWeapons;
    }

    public void setExportWeapons(List<ExportWeapons> exportWeapons) {
        ExportWeapons = exportWeapons;
    }

}

/**
 * InnerExportsWeapon
 */
class ExportWeapons {
    String name;
    String uniqueName;
    String codexSecret;
    float totalDamage;
    String description;
    float criticalChance;
    float criticalMultiplier;
    float procChance;
    float fireRate;
    int masteryReq;
    String productCategory;
    float omegaAttenuation;

    public String getCodexSecret() {
        return codexSecret;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public float getCriticalMultiplier() {
        return criticalMultiplier;
    }

    public String getDescription() {
        return description;
    }

    public float getFireRate() {
        return fireRate;
    }

    public int getMasteryReq() {
        return masteryReq;
    }

    public String getName() {
        return name;
    }

    public float getOmegaAttenuation() {
        return omegaAttenuation;
    }

    public float getProcChance() {
        return procChance;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public float getTotalDamage() {
        return totalDamage;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setCodexSecret(String codexSecret) {
        this.codexSecret = codexSecret;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public void setCriticalMultiplier(float criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFireRate(float fireRate) {
        this.fireRate = fireRate;
    }

    public void setMasteryReq(int masteryReq) {
        this.masteryReq = masteryReq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOmegaAttenuation(float omegaAttenuation) {
        this.omegaAttenuation = omegaAttenuation;
    }

    public void setProcChance(float procChance) {
        this.procChance = procChance;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setTotalDamage(float totalDamage) {
        this.totalDamage = totalDamage;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }
}
