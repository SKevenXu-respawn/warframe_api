package program.getItemUrlName;

import java.util.regex.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        itemurlget it = new itemurlget();
        it.url_detail("https://api.warframe.market/v1/riven/items");
        // String input="月";
        /*
         * String pattern=".*视使之触.*";
         * ArrayList temp=new ArrayList();
         * Pattern p=Pattern.compile(pattern);
         */
        for (int i = 0; i < it.getitemname().length; i++) {
            // Matcher m=p.matcher(it.getitemname()[i]);
            /*
             * if(m.find()){
             * System.out.println(m.group()+"\n");
             * temp.add(m.group());
             * System.out.println(temp.size());
             * }
             */
            System.out.println(it.getid()[i]);
            System.out.println(it.getitemname()[i]);
            System.out.println(it.getitemurl()[i]);
            System.out.println();

        }

        /*
         * System.out.println(it.getoneurlname("月面狂风 枪托"));
         * System.out.println(it.getonename("axi_d4_relic"));
         */
    }
}
