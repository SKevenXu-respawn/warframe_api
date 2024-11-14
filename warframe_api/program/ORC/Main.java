package program.ORC;

import program.getItemUrlName.itemurlget;
import program.rivenSearch.rivrenSearch;
import program.rivenSearch.weaponname;

public class Main {
    public static void main(String[] args) {
        ORC orc = new ORC();

        get_orc_data get = new get_orc_data();
        itemurlget name = new itemurlget();
        name.url_detail("https://api.warframe.market/v1/riven/items");
        get.getdata(orc.orcpapi("712f5b19a288957", "program/ORC/3.jpg"));
        // for (int i = 0; i < name.getitemname().length; i++) {
        // System.out.println(name.getitemname()[i] + "\t\t" + name.getitemurl()[i]);
        // }
        System.out.println(get.gettext_pro()[1]);

        System.out.println(name.getoneurlname(get.gettext_pro()[1]));
        weaponname wea = new weaponname();

        rivrenSearch ri = new rivrenSearch();
        ri.riven_search(name.getoneurlname(get.gettext_pro()[1]), null, null);
        String[][] temp = ri.getdata().clone();

        for (int i = 0; i < temp.length; i++) {
            if (temp[i][4].hashCode() != -1548612125 && Integer.valueOf(temp[i][1]) < 921) {
                System.out.println("in game name=\t" + temp[i][0]);
                System.out.println("buyout_price=\t" + temp[i][1]);
                System.out.println("item url_name=\t" + temp[i][2]);
                System.out.println("item name=\t" + temp[i][3]);
                System.out.println("is offline=\t" + temp[i][4]);
                System.out.println("want buy\t" + temp[i][5] + "\n");

            }
        }

    }
}
