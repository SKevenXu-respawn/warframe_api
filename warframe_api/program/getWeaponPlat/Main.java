package program.getWeaponPlat;

import program.getItemUrlName.itemurlget;

public class Main {
    public static void main(String[] args) {
        getplat ge=new getplat();
        
        itemurlget it=new itemurlget();
        String[][] temp=ge.plat_detail(it.getoneurlname("和平·高飞")).clone();
        for(int i=0;i<temp.length;i++){
            if(temp[i][2].hashCode()!="offline".hashCode()){
                System.out.println(temp[i][0]);
            System.out.println(temp[i][1]);
            System.out.println(temp[i][3]);
            System.out.println(temp[i][2]+"\n");
            }
        }
        int num=Integer.valueOf(temp[0][0]);
        for(int i=0;i<temp.length;i++){

            if(Integer.valueOf(temp[i][0])<num&&temp[i][2].hashCode()!="offline".hashCode()){
                num=Integer.valueOf(temp[i][0]);

            }
        }
        System.out.println(num);
    }
}
