package program.fissures;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class fissures {
    public fissures_data[] fissuress() {
        String text=null;

        try {
            // like https://api.warframestat.us/pc/zh/vallisCycle/
            URL url = new URL("https://api.warframestat.us/pc/zh/fissures/");
            // 2、连接服务器:打开服务器连接,得到对象conn
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            // 3、加载数据:获取加载数据的字节输入流
            InputStream is = conn.getInputStream();
            // 4、将is装饰为能一次读取一行的字符输入流br
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            // 5、加载一行数据ca
            text = br.readLine();

        } catch (Exception e) {
            System.out.println("false");
        }
        
            Gson gson = new Gson();
            fissures_data[] fiss = gson.fromJson(text, fissures_data[].class);

        return fiss;
    }
   
    
    public fissures_data[] fiss =fissuress();

    public String[] fissure_Hardmission(int tiernum){
        
            int Hard_j=0;
            String[] Hardmission = new String[fiss.length];
            String[] HardTire=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isHard==true&&fiss[i].tierNum==tiernum){
                    Hardmission[Hard_j]=fiss[i].missionType;
                    HardTire[Hard_j]=fiss[i].tier;
                    Hard_j++;
                }
                
                
            }
            int Hard_j_j=0;
            String[]HardTier_notnull=new String[Hard_j];
            String[] Hardmission_notnull=new String[Hard_j];
            
            for(int i=0;i<Hardmission.length;i++){
                if(Hardmission[i]!=null){
                    Hardmission_notnull[Hard_j_j]=Hardmission[i];
                    HardTier_notnull[Hard_j_j]=HardTire[i];
                    Hard_j_j++;
                }
            }
            
            return Hardmission_notnull;
    }
    public String[] fissure_Hardeta(int tiernum){
        int Hard_j=0;
            String[] Hardeta = new String[fiss.length];
            
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isHard==true&&fiss[i].tierNum==tiernum){
                    Hardeta[Hard_j]=fiss[i].eta;
                    Hard_j++;
                }
                
                
            }
            int Hard_j_j=0;
            
            String[] Hardeta_notnull=new String[Hard_j];
            
            for(int i=0;i<Hardeta.length;i++){
                if(Hardeta[i]!=null){
                    Hardeta_notnull[Hard_j_j]=Hardeta[i];

                    Hard_j_j++;
                }
            }
            
            return Hardeta_notnull;
    }
    public String[] fissure_Hardtier(int tiernum){
        int Hard_j=0;
            String[] Hardtier = new String[fiss.length];
            
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isHard==true&&fiss[i].tierNum==tiernum){
                    Hardtier[Hard_j]=fiss[i].tier;
                    Hard_j++;
                }
                
                
            }
            int Hard_j_j=0;
            
            String[] Hardtier_notnull=new String[Hard_j];
            
            for(int i=0;i<Hardtier.length;i++){
                if(Hardtier[i]!=null){
                    Hardtier_notnull[Hard_j_j]=Hardtier[i];

                    Hard_j_j++;
                }
            }
            
            return Hardtier_notnull;
    }
    public String[] fissure_Hardenemy(int tiernum){
        int Hard_j=0;
            String[] Hardenemy = new String[fiss.length];
            
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isHard==true&&fiss[i].tierNum==tiernum){
                    Hardenemy[Hard_j]=fiss[i].enemy;
                    Hard_j++;
                }
                
                
            }
            int Hard_j_j=0;
            
            String[] Hardenemy_notnull=new String[Hard_j];
            
            for(int i=0;i<Hardenemy.length;i++){
                if(Hardenemy[i]!=null){
                    Hardenemy_notnull[Hard_j_j]=Hardenemy[i];

                    Hard_j_j++;
                }
            }
            
            return Hardenemy_notnull;
    }
    public String[] fissure_Hardnode(int tiernum){
        int Hard_j=0;
            String[] Hardnode = new String[fiss.length];
            
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isHard==true&&fiss[i].tierNum==tiernum){
                    Hardnode[Hard_j]=fiss[i].node;
                    Hard_j++;
                }
                
                
            }
            int Hard_j_j=0;
            
            String[] Hardnode_notnull=new String[Hard_j];
            
            for(int i=0;i<Hardnode.length;i++){
                if(Hardnode[i]!=null){
                    Hardnode_notnull[Hard_j_j]=Hardnode[i];

                    Hard_j_j++;
                }
            }
            
            return Hardnode_notnull;
    }

    public String[] fissure_Stormeta(int tiernum){
        
            int Storm_j=0;
            String[] Stormeta = new String[fiss.length];
            
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==true&&fiss[i].tierNum==tiernum){
                    Stormeta[Storm_j]=fiss[i].eta;
                    
                    Storm_j++;
                }
                
                
            }
            int Storm_j_j=0;
            
            String[] Stormeta_notnull=new String[Storm_j];
            
            for(int i=0;i<Stormeta.length;i++){
                if(Stormeta[i]!=null){
                    Stormeta_notnull[Storm_j_j]=Stormeta[i];
                    Storm_j_j++;
                }
            }
            return Stormeta_notnull;
    }
    public String[] fissure_Stormmission(int tiernum){
        
            int Storm_j=0;
            String[] Stormmission = new String[fiss.length];
            String[] StormTire=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==true&&fiss[i].tierNum==tiernum){
                    Stormmission[Storm_j]=fiss[i].missionType;
                    StormTire[Storm_j]=fiss[i].tier;
                    Storm_j++;
                }
                
                
            }
            int Storm_j_j=0;
            
            String[] Stormmission_notnull=new String[Storm_j];
            
            for(int i=0;i<Stormmission.length;i++){
                if(Stormmission[i]!=null){
                    Stormmission_notnull[Storm_j_j]=Stormmission[i];
                    
                    Storm_j_j++;
                }
            }
            
            return Stormmission_notnull;
    }
    public String[] fissure_Stormtier(int tiernum){
        
            int Storm_j=0;
            String[] StormTier=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==true&&fiss[i].tierNum==tiernum){
                    StormTier[Storm_j]=fiss[i].tier;
                    Storm_j++;
                }
            }
            int Storm_j_j=0;
            String[] Stormtier_notnull=new String[Storm_j];
            
            for(int i=0;i<StormTier.length;i++){
                if(StormTier[i]!=null){
                    Stormtier_notnull[Storm_j_j]=StormTier[i];
                    
                    Storm_j_j++;
                }
            }
            
            return Stormtier_notnull;
    }
    public String[] fissure_Stormenemy(int tiernum){
        
            int Storm_j=0;
            String[] Stormenemy=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==true&&fiss[i].tierNum==tiernum){
                    Stormenemy[Storm_j]=fiss[i].enemy;
                    Storm_j++;
                }
            }
            int Storm_j_j=0;
            String[] Stormenemy_notnull=new String[Storm_j];
            
            for(int i=0;i<Stormenemy.length;i++){
                if(Stormenemy[i]!=null){
                    Stormenemy_notnull[Storm_j_j]=Stormenemy[i];
                    
                    Storm_j_j++;
                }
            }
            
            return Stormenemy_notnull;
    }
    public String[] fissure_Stormnode(int tiernum){
        
            int Storm_j=0;
            String[] Stormnode=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==true&&fiss[i].tierNum==tiernum){
                    Stormnode[Storm_j]=fiss[i].node;
                    Storm_j++;
                }
            }
            int Storm_j_j=0;
            String[] Stormnode_notnull=new String[Storm_j];
            
            for(int i=0;i<Stormnode.length;i++){
                if(Stormnode[i]!=null){
                    Stormnode_notnull[Storm_j_j]=Stormnode[i];
                    
                    Storm_j_j++;
                }
            }
            
            return Stormnode_notnull;
    }
    
    public String[] fissure_Commonmission(int tiernum){
        
            int Common_j=0;
            String[] Commonmission=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==false&&fiss[i].isStorm==false&&fiss[i].tierNum==tiernum){
                    Commonmission[Common_j]=fiss[i].missionType;
                    Common_j++;
                }
            }
            int Common_j_j=0;
            String[] Commonmission_notnull=new String[Common_j];
            
            for(int i=0;i<Commonmission.length;i++){
                if(Commonmission[i]!=null){
                    Commonmission_notnull[Common_j_j]=Commonmission[i];
                    
                    Common_j_j++;
                }
            }
            
            return Commonmission_notnull;
    }
    public String[] fissure_Commoneta(int tiernum){
        
            int Common_j=0;
            String[] Commoneta=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==false&&fiss[i].isStorm==false&&fiss[i].tierNum==tiernum){
                    Commoneta[Common_j]=fiss[i].eta;
                    Common_j++;
                }
            }
            int Common_j_j=0;
            String[] Commoneta_notnull=new String[Common_j];
            
            for(int i=0;i<Commoneta.length;i++){
                if(Commoneta[i]!=null){
                    Commoneta_notnull[Common_j_j]=Commoneta[i];
                    
                    Common_j_j++;
                }
            }
            
            return Commoneta_notnull;
    }
    public String[] fissure_Commontier(int tiernum){
        
            int Common_j=0;
            String[] Commontier=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==false&&fiss[i].isStorm==false&&fiss[i].tierNum==tiernum){
                    Commontier[Common_j]=fiss[i].tier;
                    Common_j++;
                }
            }
            int Common_j_j=0;
            String[] Commontier_notnull=new String[Common_j];
            
            for(int i=0;i<Commontier.length;i++){
                if(Commontier[i]!=null){
                    Commontier_notnull[Common_j_j]=Commontier[i];
                    
                    Common_j_j++;
                }
            }
            
            return Commontier_notnull;
    }
    public String[] fissure_Commonenemy(int tiernum){
        
            int Common_j=0;
            String[] Commonenemy=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==false&&fiss[i].isStorm==false&&fiss[i].tierNum==tiernum){
                    Commonenemy[Common_j]=fiss[i].enemy;
                    Common_j++;
                }
            }
            int Common_j_j=0;
            String[] Commonenemy_notnull=new String[Common_j];
            
            for(int i=0;i<Commonenemy.length;i++){
                if(Commonenemy[i]!=null){
                    Commonenemy_notnull[Common_j_j]=Commonenemy[i];
                    
                    Common_j_j++;
                }
            }
            
            return Commonenemy_notnull;
    }
    public String[] fissure_Commonnode(int tiernum){
        
            int Common_j=0;
            String[] Commonnode=new String[fiss.length];
            for(int i=0;i<fiss.length;i++){
                if(fiss[i].isStorm==false&&fiss[i].isStorm==false&&fiss[i].tierNum==tiernum){
                    Commonnode[Common_j]=fiss[i].node;
                    Common_j++;
                }
            }
            int Common_j_j=0;
            String[] Commonnode_notnull=new String[Common_j];
            
            for(int i=0;i<Commonnode.length;i++){
                if(Commonnode[i]!=null){
                    Commonnode_notnull[Common_j_j]=Commonnode[i];
                    
                    Common_j_j++;
                }
            }
            
            return Commonnode_notnull;
    }
    
    public String[] fissure_alltype(){
        String[] temp=new String[fiss.length];
        for(int i=0;i<fiss.length;i++){
            temp[i]=fiss[i].missionType;
        }
        return temp;
    }
    public String[] fissure_allnode(){
        String[] temp=new String[fiss.length];
        for(int i=0;i<fiss.length;i++){
            temp[i]=fiss[i].node;
        }
        return temp;
    }
    public int[] fissure_alltierNum(){
        int[] temp=new int[fiss.length];
        for(int i=0;i<fiss.length;i++){
            temp[i]=fiss[i].tierNum;
        }
        return temp;
    }
    public String[] fissure_alleta(){
        String[] temp=new String[fiss.length];
        for(int i=0;i<fiss.length;i++){
            temp[i]=fiss[i].eta;
        }
        return temp;
    }
    public boolean[] fissure_allishard(){
        boolean[] temp=new boolean[fiss.length];
        for(int i=0;i<fiss.length;i++){
            temp[i]=fiss[i].isHard;
        }
        return temp;
    }
    public boolean[] fissure_allisStorm(){
        boolean[] temp=new boolean[fiss.length];
        for(int i=0;i<fiss.length;i++){
            temp[i]=fiss[i].isStorm;
        }
        return temp;
    }
}


class fissures_data {
    String activation;
    String expiry;
    String node;
    String missionType;
    String missionKey;
    String enemy;
    String tier;
    int tierNum;
    String eta;
    boolean isStorm;
    boolean isHard;

    public int getTierNum() {
        return tierNum;
    }

    public void setTierNum(int tierNum) {
        this.tierNum = tierNum;
    }

    public boolean getIsStorm() {
        return isStorm;
    }

    public void setIsStorm(boolean isStorm) {
        this.isStorm = isStorm;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionsType(String missionType) {
        this.missionType = missionType;
    }

    public String getMissionKey() {
        return missionKey;
    }

    public void setMissionsKey(String missionKey) {
        this.missionKey = missionKey;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public boolean getIsHard() {
        return isHard;
    }

    public void setIsHard(boolean isHard) {
        this.isHard = isHard;
    }

}

/*
 * [
 * {
 * "id": "655726a5a5de446cf8e45be3",
 * "activation": "2023-11-17T08:39:01.758Z",
 * "startString": "-1h 57m 1s",
 * "expiry": "2023-11-17T10:36:58.545Z",
 * "active": true,
 * "node": "Pago (Kuva 要塞)",
 * "missionType": "間諜",
 * "missionKey": "Spy",
 * "enemy": "Grineer",
 * "enemyKey": "Grineer",
 * "nodeKey": "Pago (Kuva Fortress)",
 * "tier": "安魂",
 * "tierNum": 5,
 * "expired": false,
 * "eta": "55s",
 * "isStorm": false,
 * "isHard": false
 * },
 */
