package program.rivenSearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import java.io.InputStreamReader;
import java.util.ArrayList;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;






public class weaponname {
    public String ReadGsonTest(String name,String file) {
        String name_url=null;
        Gson gson = new Gson();
        String reader=readJsonData(file);

    //先转JsonObject
            JsonObject jsonObject = new JsonParser().parse(reader).getAsJsonObject();
            
            /* JsonObject jsonObject = JsonParser.parseReader​(reader).getAsJsonObject(); */
            
    //再转JsonArray 加上数据头
            JsonArray jsonArray = jsonObject.getAsJsonArray("itemsweapon");


            ArrayList<itemsweapon> it = new ArrayList<>();

    //循环遍历
            for (JsonElement user : jsonArray) {
        //通过反射 得到UserBean.class
                itemsweapon its = gson.fromJson(user, new TypeToken<itemsweapon>() {}.getType());
                it.add(its);
            }
           /*  mainLView.setAdapter(new UserAdapter(this, userBeanList)); */

           System.out.println("name_hashCode="+name.hashCode());
           for(int i=0;i<it.size();i++){
            if(name.hashCode()==it.get(i).item_name.hashCode()){
                System.out.println("num="+i+"items_name:"+it.get(i).item_name);
                System.out.println("items_url:"+it.get(i).url_name);
                System.out.println("hashcode="+it.get(i).item_name.hashCode());
                name_url=it.get(i).url_name;
            }
                
           }

           return name_url;
            

}






        /* try {
            itemsweapon[] it=gson.fromJson(reader, itemsweapon[].class);
            
            System.out.println("success");
            System.out.println(it[1].url_name);
        } catch (Exception e) {
            System.out.println("false"+e);
        } */
        /* System.out.println(reader); */
       /*  weaponlist wea = gson.fromJson(reader, weaponlist.class); */
        
           /*  System.out.println(reader); */
        //获取jsonObject
        /* List<items> items = gson.fromJson(pay.items, List<items>.class); */
 
    /* } */
    public static String readJsonData(String pactFile){
		// 读取文件数据
		//System.out.println("读取文件数据util");
		
		StringBuffer strbuffer = new StringBuffer();
		File myFile = new File(pactFile);//"D:"+File.separatorChar+"DStores.json"
		if (!myFile.exists()) {
			System.err.println("Can't Find " + pactFile); 
		}
		try {
			FileInputStream fis = new FileInputStream(pactFile);
			InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
			BufferedReader in  = new BufferedReader(inputStreamReader);
			
			String str;
			while ((str = in.readLine()) != null) {
				strbuffer.append(str);  //new String(str,"UTF-8")
			}
			in.close();
		} catch (IOException e) {
			e.getStackTrace();
		}
		//System.out.println("读取文件结束util");
		return strbuffer.toString();
	}

}
/* class weaponlist{
    JsonObject payload;
    public JsonObject getPayload(){
        return payload;
    }
    public void setPayload(JsonObject payload){
        this.payload=payload;
    }
} */
/* class payload{
    
   List<itemsweapon> itemsweapon;
   public List<itemsweapon> getItems(){
        return itemsweapon;
    }
    public void setItems(List<itemsweapon> itemsweapons){
        this.itemsweapon=itemsweapons;
    }
    
 } */


class itemsweapon{
    
    String item_name;
    String url_name;
    public String getItem_name(){
        return item_name;
    }
    public void setItem_name(String item_name){
        this.item_name=item_name;
    }
    public String getItem_url(){
        return url_name;
    }
    public void setItem_url(String url_name){
        this.url_name=url_name;
    }
}


