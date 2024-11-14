package program.ArchonHuntReward;

public class Main {
    public static void main(String[] args) {
        ArchonHuntReward acr=new ArchonHuntReward();
        System.out.println(acr.ArchonHunt_boss());
        System.out.println(acr.ArchonHunt_node()[0]+acr.ArchonHunt_node()[1]+acr.ArchonHunt_node()[2]);
        System.out.println(acr.ArchonHunt_type()[0]+acr.ArchonHunt_type()[1]+acr.ArchonHunt_type()[2]);
        System.out.println(acr.ArchonHunt_eta());
    }
}
