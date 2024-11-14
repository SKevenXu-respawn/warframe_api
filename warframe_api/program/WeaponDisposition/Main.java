package program.WeaponDisposition;


public class Main {
    public static void main(String[] args) {
        weapondisposition we=new weapondisposition();
                
                for(int i=0;i<we.weapondata.length;i++){
                    if(we.getName(i).hashCode()=="赤毒·沙皇".hashCode()){
                        System.out.println(we.getName(i));
                    System.out.println(we.getdisposition(i));
                    System.out.println(we.getdescription(i)+"\n");
                    }
                    
                    
                }  
       

    }
}
