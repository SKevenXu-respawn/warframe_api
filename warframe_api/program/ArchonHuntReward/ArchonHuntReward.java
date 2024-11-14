package program.ArchonHuntReward;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class ArchonHuntReward {
  public archonHunt ArchonHunt() {
    String text=null;
    try {
      // like https://api.warframestat.us/pc/zh/vallisCycle/
      // cambionCycle是火卫二时间
      // cetusCycle是希图斯时间
      // vallisCycle是金星平原时间
      URL url = new URL("https://api.warframestat.us/pc/zh/archonHunt/");
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
      System.out.println("error");
    }
      Gson gson = new Gson();

      archonHunt arch = gson.fromJson(text, archonHunt.class);
      return arch;
  }

  public archonHunt arch=ArchonHunt();
  
  public String ArchonHunt_boss(){
      return arch.boss;
  }


  public String[] ArchonHunt_node(){

    String[] nodes=new String[arch.missions.size()];

    for (int i = 0; i < nodes.length; i++) {
          nodes[i]=arch.missions.get(i).node;
        }
    return nodes;
  }


  public String[] ArchonHunt_type(){

    String[] types=new String[arch.missions.size()];

    for (int i = 0; i < types.length; i++) {
          types[i]=arch.missions.get(i).type;
        }
    return types;
  }

  public String ArchonHunt_eta(){
    return arch.eta;
  }

}

class archonHunt {
  String id;
  String activation;
  String expiry;
  String startString;
  boolean active;
  String rewardPool;
  List<missions> missions;
  String boss;
  String faction;
  String eta;

  /*
   * "boss": "string",
   * "faction": "Orokin",
   * "factionKey": "Orokin",
   * "expired": true,
   * "eta": "string"
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public String getStartString() {
    return startString;
  }

  public void setStartString(String startString) {
    this.startString = startString;
  }

  public List<missions> getMissions() {
    return missions;
  }

  public void setMissions(List<missions> missions) {
    this.missions = missions;
  }

  public String getBoss() {
    return boss;
  }

  public void setBoss(String boss) {
    this.boss = boss;
  }

  public String getfaction() {
    return faction;
  }

  public void setFaction(String faction) {
    this.faction = faction;
  }

  public String getEta() {
    return eta;
  }

  public void setEta(String eta) {
    this.eta = eta;
  }
  /*
   * String startString;
   * boolean active;
   * String rewardPool;
   * List<missions> missions;
   * String boss;
   * String faction;
   * String eta;
   */
}

class missions {
  String node;
  String nodeKey;
  String type;
  String typeKey;

  public String getNode() {
    return node;
  }

  public void setNode(String node) {
    this.node = node;
  }

  public String getNodeKey() {
    return nodeKey;
  }

  public void setNodeKey(String nodeKey) {
    this.nodeKey = nodeKey;
  }

  public String setType() {
    return type;
  }

  public void getType(String type) {
    this.type = type;
  }

  public String setTypeKey() {
    return typeKey;
  }

  public void getTypeKey(String typeKey) {
    this.typeKey = typeKey;
  }

}
