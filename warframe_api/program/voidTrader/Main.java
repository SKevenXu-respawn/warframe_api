package program.voidTrader;

public class Main {
    public static void main(String[] args) {
        voidTrader vt = new voidTrader();
        // vt.voidTrader_Data();
        System.out.println(vt.voidLocation());
        System.out.println(vt.voidEndString());
        if (vt.voidtrader_active() == true) {
            System.out.println(vt.item()[0]);
        }

    }
}
