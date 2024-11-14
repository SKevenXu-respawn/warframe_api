package program.Cycle_details;



public class Main {
    public static void main(String[] args) {
        cetusCycle_details ce=new cetusCycle_details();
        System.out.println( ce.cetusCycle_detail_isday());
       System.out.println( ce.cetusCycle_detail_timeLeft());

       cambionCycle_details ca=new cambionCycle_details();
       System.out.println( ca.cambionCycle_detail_state());
       System.out.println( ca.cambionCycle_detail_timeLeft());
       
       vallisCycle_details va=new vallisCycle_details();
       System.out.println( va.vallisCycle_detail_isWarm());
       System.out.println( va.vallisCycle_detail_timeLeft());
        
    }
}
