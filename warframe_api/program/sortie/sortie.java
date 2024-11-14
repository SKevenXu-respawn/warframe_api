package program.sortie;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.google.gson.Gson;



public class sortie {
    public sorties sortie_Data() {
        String text=null;
        try {
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            // cambionCycle是火卫二时间
            // cetusCycle是希图斯时间
            // vallisCycle是金星平原时间
            URL url = new URL("https://api.warframestat.us/pc/zh/sortie/");
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

            sorties sort = gson.fromJson(text, sorties.class);
        return sort;
    }

    public sorties sort=sortie_Data();

    public String[] sortie_1(){
        String[] sort_1=new String[4];
        sort_1[0]=sort.variants.get(0).node;
        sort_1[1]=sort.variants.get(0).missionType;
        sort_1[2]=sort.variants.get(0).modifier;
        sort_1[3]=sort.variants.get(0).modifierDescription;
        return sort_1;
    }

    public String[] sortie_2(){
        String[] sort_2=new String[4];
        sort_2[0]=sort.variants.get(1).node;
        sort_2[1]=sort.variants.get(1).missionType;
        sort_2[2]=sort.variants.get(1).modifier;
        sort_2[3]=sort.variants.get(1).modifierDescription;
        return sort_2;
    }

    public String[] sortie_3(){
        String[] sort_3=new String[4];
        sort_3[0]=sort.variants.get(2).node;
        sort_3[1]=sort.variants.get(2).missionType;
        sort_3[2]=sort.variants.get(2).modifier;
        sort_3[3]=sort.variants.get(2).modifierDescription;
        return sort_3;
    }

    public String getSortieEta(){
        String eta=sort.eta;
        return eta;
    }
    public String[] getmissions(){
        String[] mission=new String[sort.variants.size()];
        for(int i=0;i<mission.length;i++){
            mission[i]=sort.variants.get(i).missionType;
        }
        return mission;
    }
    public String[] getnodes(){
        String[] nodes=new String[sort.variants.size()];
        for(int i=0;i<nodes.length;i++){
            nodes[i]=sort.variants.get(i).node;
        }
        return nodes;
    }
    public String[] getmodifiers(){
        String[] modifiers=new String[sort.variants.size()];
        for(int i=0;i<modifiers.length;i++){
            modifiers[i]=sort.variants.get(i).modifier;
        }
        return modifiers;
    }
    public String[] getmodifierDescriptions(){
        String[] modifierDescriptions=new String[sort.variants.size()];
        for(int i=0;i<modifierDescriptions.length;i++){
            modifierDescriptions[i]=sort.variants.get(i).modifierDescription;
        }
        return modifierDescriptions;
    }
}
class sorties{
    List<variants> variants;
    String eta;
    public List<variants>  getVariants(){
        return variants;
    }
    public void setVariants(List<variants> variants){
        this.variants=variants;
    }
    public String getEta(){
        return eta;
    }
    public void setEta(String eta){
        this.eta=eta;
    }
}
class variants{
    String missionType;
    String modifier;
    String modifierDescription;
    String node;
    public String getMissionType(){
        return missionType;
    }
    public void setMissionType(String missionType){
        this.missionType=missionType;
    }
    public String getModifier(){
        return modifier;
    }
    public void setModfier(String modifier){
        this.modifier=modifier;
    } 
    public String getModifierDescription(){
        return modifierDescription;
    }
    public void setModifierDescription(String modifierDescription){
        this.modifierDescription=modifierDescription;
    }
    public String getNode(){
        return node;
    }
    public void setNode(String node){
        this.node=node;
    }
}
/* {
    "variants": [
        {
            "missionType": "殲滅",
            "modifier": "辐射灾害",
            "modifierDescription": "Any damage received will impart radiation effects, and so will green clouds around the tileset.",
            "node": "Phlegyas (火卫二)"
        },
        {
            "missionType": "殲滅",
            "modifier": "卓越者大本营",
            "modifierDescription": "卓越者单位在这个任务中的生成率更高,并且携带的光环数量更多。",
            "node": "Ludi (穀神星)"
        },
        {
            "missionType": "中断",
            "modifier": "武器限定:近戰",
            "modifierDescription": "此任務中只能使用近戰武器,其他類型的武器將會自動被換掉",
            "node": "Hydron (賽德娜)"
        }
    ],
    "eta": "8h 7m 34s"
}
 */