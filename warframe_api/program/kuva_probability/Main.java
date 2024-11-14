package program.kuva_probability;

public class Main {
    public static String[] kuvamods = new String[] { "LOHK", "XATA", "JAHU" };
    public static boolean[] kuvamods_bo = new boolean[] { false, true, true };

    public static void main(String[] args) {
        getprobability(getkuvamod("LOHK", "XATA", "JAHU"), kuvamods_bo);
    }

    public static String[] getkuvamod(String a, String b, String c) {
        kuva_mods mods = new kuva_mods();
        String[] temp = new String[3];
        String[] mod = mods.getMods();
        for (int i = 0; i < mod.length; i++) {
            if (a.equals(mod[i])) {
                System.out.println(a + " is true");
                temp[0] = a;
                break;
            }
        }
        for (int i = 0; i < mod.length; i++) {
            if (b.equals(mod[i])) {
                System.out.println(b + " is true");
                temp[1] = b;
                break;
            }
        }
        for (int i = 0; i < mod.length; i++) {
            if (c.equals(mod[i])) {
                System.out.println(c + " is true");
                temp[2] = c;
                break;
            }
        }
        return temp;
    }

    public static void getprobability(String[] temp, boolean[] kuva_bo) {
        mods_detail detail = new mods_detail();
        detail.setMods(temp);
        detail.setMods_bo(kuva_bo);
    }
}

final class kuva_mods {
    String[] mods = new String[] { "LOHK", "XATA", "JAHU", "VOME", "RIS", "FASS", "NETRA", "KHRA" };
    String oull = "OULL";

    public String[] getMods() {
        return mods;
    }

}

class mods_detail {
    String mod1;
    String mod2;
    String mod3;
    boolean mod1_bo = false;
    boolean mod2_bo = false;
    boolean mod3_bo = false;

    public String getMod1() {
        return mod1;
    }

    public String getMod2() {
        return mod2;
    }

    public String getMod3() {
        return mod3;
    }

    public boolean getmod1_bo() {
        return mod1_bo;
    }

    public boolean getmod2_bo() {
        return mod2_bo;
    }

    public boolean getmod3_bo() {
        return mod3_bo;
    }

    public void setMods(String mods[]) {
        this.mod1 = mods[0];
        this.mod2 = mods[1];
        this.mod3 = mods[2];
    }

    public void setMods_bo(boolean mods_bo[]) {
        this.mod1_bo = mods_bo[0];
        this.mod2_bo = mods_bo[1];
        this.mod3_bo = mods_bo[2];
    }

    public void setMod1(String mod1) {
        this.mod1 = mod1;
    }

    public void setMod2(String mod2) {
        this.mod2 = mod2;
    }

    public void setMod3(String mod3) {
        this.mod3 = mod3;
    }

    public void setMod1_bo(boolean mod1_bo) {
        this.mod1_bo = mod1_bo;
    }

    public void setMod2_bo(boolean mod2_bo) {
        this.mod2_bo = mod2_bo;
    }

    public void setMod3_bo(boolean mod3_bo) {
        this.mod3_bo = mod3_bo;
    }
}
