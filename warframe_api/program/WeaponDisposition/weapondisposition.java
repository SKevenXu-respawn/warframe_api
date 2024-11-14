package program.WeaponDisposition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.InputStreamReader;


import com.google.gson.Gson;

public class weapondisposition {
    
    public weapondispositions[] weapondisposition_detail(String file) {
        String text=null;
        try {
            // https://api.warframestat.us/weapons/
            text=readJsonData(file);

        } catch (Exception e) {
            System.out.println("false");
        }
        Gson gson = new Gson();
        weapondispositions[] weapondata = gson.fromJson(text, weapondispositions[].class);

        return weapondata;
    }
weapondispositions[] weapondata=weapondisposition_detail("localfile\\123.json");
public String getName(int i){
    return weapondata[i].name;
}
public String getdescription(int i){
    return weapondata[i].description;
}
public int getdisposition(int i){
    return weapondata[i].disposition;
}

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
class weapondispositions{
    int disposition;
    String name;
    String description;
    public int getDisposition(){
        return disposition;
    }
    public void setDisposition(int disposition){
        this.disposition=disposition;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
}
