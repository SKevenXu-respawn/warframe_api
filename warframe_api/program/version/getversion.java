package program.version;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class getversion {
    payload payload;

    public payload getJson(String temp) {
        Gson gson = new Gson();
        String json = temp;
        System.out.println(json);
        demo demo = gson.fromJson(json, demo.class);
        payload = gson.fromJson(demo.payload, payload.class);
        // System.out.println(payload.version.get(1).ver_num);

        // System.out.println(payload.version.get(1).detail.get(0).detail_text);
        return payload;
    }

    public String[] getversion_time() {
        String[] time = new String[payload.version.size()];
        for (int i = 0; i < time.length; i++) {
            time[i] = payload.version.get(i).time;
        }
        return time;

    }

    public String[] getversion_num() {
        String[] ver_num = new String[payload.version.size()];
        for (int i = 0; i < ver_num.length; i++) {
            ver_num[i] = payload.version.get(i).ver_num;
        }
        return ver_num;

    }

    public int returnversionsize(int num) {
        return payload.version.get(num).detail.size();
    }

    public String[] getversion_detail(int num) {
        String[] detail = new String[payload.version.get(num).detail.size()];
        for (int i = 0; i < detail.length; i++) {
            detail[i] = payload.version.get(num).detail.get(i).detail_text;
        }
        return detail;

    }

    public static String readJsonData(String pactFile) {
        // 读取文件数据
        // System.out.println("读取文件数据util");

        StringBuffer strbuffer = new StringBuffer();
        File myFile = new File(pactFile);// "D:"+File.separatorChar+"DStores.json"
        if (!myFile.exists()) {
            System.err.println("Can't Find " + pactFile);
        }
        try {
            FileInputStream fis = new FileInputStream(pactFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
            BufferedReader in = new BufferedReader(inputStreamReader);

            String str;
            while ((str = in.readLine()) != null) {
                strbuffer.append(str); // new String(str,"UTF-8")
            }
            in.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        // System.out.println("读取文件结束util");
        return strbuffer.toString();
    }
}

class detail {
    String detail_text;

    public String getDetails() {
        return detail_text;
    }

    public void setDetails(String detail_text) {
        this.detail_text = detail_text;
    }
}

// class ver_del {
// // 与 JSON 中的 "details" 对应
// List<detail> detail;

// public List<detail> getDetail() {
// return detail;
// }

// public void setDetail(List<detail> detail) {
// this.detail = detail;
// }
// // Getter 和 Setter 方法

// }

// 代表 version 对象的类
class version {
    public String time;
    public String ver_num; // 使用 camelCase 命名法
    List<detail> detail;

    public List<detail> getDetail() {
        return detail;
    }

    public void setDetail(List<detail> detail) {
        this.detail = detail;
    }

    // public JsonObject getVer_del() {
    // return ver_del;
    // }

    // public void setVer_del(JsonObject ver_del) {
    // this.ver_del = ver_del;
    // }

    // Getter 和 Setter 方法
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVerNum() {
        return ver_num;
    }

    public void setVerNum(String ver_num) {
        this.ver_num = ver_num;
    }

}

// 顶层对象，包含 version 数组
class payload {

    public List<version> version; // JSON 中的 "version" 键对应一个数组

    // Getter 和 Setter 方法
    public List<version> getVersion() {
        return version;
    }

    public void setVersion(List<version> version) {
        this.version = version;
    }
}

class demo {
    JsonObject payload;

    public JsonObject getPayload() {
        return payload;
    }

    public void setPayload(JsonObject payload) {
        this.payload = payload;
    }
}