package program.sortie;

public class Main {
    public static void main(String[] args) {
        sortie so=new sortie();
        for(int i=0;i<so.sortie_1().length;i++){
            System.out.println(so.sortie_1()[i]+so.sortie_2()[i]+so.sortie_3()[i]);
        }
        for(int i=0;i<so.getmissions().length;i++){
            System.out.println(so.getmissions()[i]);
            System.out.println(so.getnodes()[i]);
            System.out.println(so.getmodifiers()[i]);
            System.out.println(so.getmodifierDescriptions()[i]);
        }
        
    }
}
