package program.Syndicate;

public class Main {
    public static void main(String[] args) {
        CetusSyndicate ce = new CetusSyndicate();
        for (int i = 0; i < ce.CetusSyndicatesList().length; i++) {
            System.out.println(ce.CetusSyndicatesList()[i]);
            
        }
        for (int i = 0; i < ce.cambionSyndicatesList().length; i++) {
           System.out.println(ce.cambionSyndicatesList()[i]);
            
        }

    }
}
