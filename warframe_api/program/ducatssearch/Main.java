package program.ducatssearch;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import program.getItemUrlName.itemurlget;

public class Main {
    public static void main(String[] args) {

        /*
         * ducatsget du = new ducatsget();
         * itemurlget it = new itemurlget();
         * int num = it.getitemurl().length;
         */
        ducatsget du = new ducatsget();
        itemurlget it = new itemurlget();
        // String[] name = new String[du.getid().length];
        // for (int i = 0; i < du.getid().length; i++) {
        // for (int j = 0; j < it.getid().length; j++) {
        // if (du.getitem()[i].hashCode() == it.getid()[j].hashCode()) {
        // name[i] = it.getitemname()[j];
        // System.out.println(name[i]);
        // }
        // }
        // }
        // ArrayList<String> name = contains(du.getitem(), it.getid(),
        // it.getitemname());
        ArrayList<String> name = du.sethash(du.getitem(), it.getid(),
                it.getitemname());
        ArrayList<String> thumb = du.sethashthumb(du.getitem(), it.getid(),
                it.getthumb());

        int[] num = du.getthemaxnum(du.getducats_per_platinum_wa(), 5);
        for (int i = 0; i < num.length; i++) {
            System.out.println("物品id:\t" + du.getid()[num[i]]);
            System.out.println("物品剩余:\t" + du.getvolume()[num[i]]);
            System.out.println("物品平均售价:\t" + du.getwa_price()[num[i]]);
            System.out.println("物品最低售价:\t" + du.getmedian()[num[i]]);
            System.out.println("物品名字:\t" + name.get(num[i]));
            // System.out.println("物品白金:\t" + du.getplat_worth()[i]);
            System.out.println("物品杜卡德:\t" + du.getducats()[num[i]]);
            System.out.println("物品平均白金(杜卡德/1白金):\t" +
                    du.getducats_per_platinum_wa()[num[i]]);
            System.out.println("物品刷新时间:\t" + du.getdatetime()[num[i]]);
            System.out.println("物品thumb:\t" + thumb.get(num[i]));
            System.out.println("\n");
        }
        try {
            strToDate(du.getdatetime()[0]);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // for (int i = 0; i < du.getid().length; i++) {
        // System.out.println("物品id:\t" + du.getid()[i]);
        // System.out.println("物品剩余:\t" + du.getvolume()[i]);
        // System.out.println("物品平均售价:\t" + du.getwa_price()[i]);
        // System.out.println("物品最低售价:\t" + du.getmedian()[i]);
        // System.out.println("物品名字:\t" + name.get(i));
        // // System.out.println("物品白金:\t" + du.getplat_worth()[i]);
        // System.out.println("物品杜卡德:\t" + du.getducats()[i]);
        // System.out.println("物品平均白金:\t" + du.getducats_per_platinum()[i]);
        // System.out.println("物品刷新时间:\t" + du.getdatetime()[i]);
        // System.out.println("\n");
        // }
        // bubbleSort(du.getid(), du.getvolume(), du.getwa_price(), du.getmedian(),
        // du.getducats(), du.getducats_per_platinum(), name);

    }

    public static long strToDate(String dateStr) throws Exception {
        Date dates = new Date();
        // this object contains the current date value
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Date da = sdf.parse(sdf.format(dates));
        // System.out.println(da.getHours() + "\t" + da.getTime());

        Date date = sdf.parse(dateStr);
        long diff = da.getTime() - date.getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        // System.out.println(date.getHours() + "\t" + date.getTime());
        long hours = (diff - days * (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (diff - days * (1000 * 60 * 60 * 24) - hours * (1000 * 60 * 60)) / (1000 * 60);

        System.out.println("结果:\t" + (60 - minutes) + "分");
        long atleasttime = (60 - minutes);
        return atleasttime;
    }
}

// public static void bubbleSort(String[] getid, int[] volume, float[]
// getwa_price, int[] getmedian, int[] getducats,
// float[] getducats_per_platinum/* 该数组存放 */, ArrayList<String> name) {
// // 冒泡排序的时间复杂度为O(n*n)
// float temp = 0;// 临时变量
// String id_temp = null;
// int volume_temp = 0;
// float getwa_price_temp = 0;
// int getmedian_temp = 0;
// int getducats_temp = 0;
// float getducats_per_platinum_temp = 0;
// String name_temp = null;
// String[] namearray = new String[name.size()];
// for (int i = 0; i < name.size(); i++) {
// namearray[i] = name.get(i);
// }
// for (int j = 0; j < getducats_per_platinum.length - 1; j++) {

// for (int i = 0; i < getducats_per_platinum.length - 1 - j; i++) {
// if (getducats_per_platinum[i] < getducats_per_platinum[i + 1]) {
// // 三角交换
// temp = getducats_per_platinum[i];
// getducats_per_platinum[i] = getducats_per_platinum[i + 1];
// getducats_per_platinum[i + 1] = temp;

// id_temp = getid[i];
// getid[i] = getid[i + 1];
// getid[i + 1] = id_temp;

// volume_temp = volume[i];
// volume[i] = volume[i + 1];
// volume[i + 1] = volume_temp;

// getwa_price_temp = getwa_price[i];
// getwa_price[i] = getwa_price[i + 1];
// getwa_price[i + 1] = getwa_price_temp;

// getmedian_temp = getmedian[i];
// getmedian[i] = getmedian[i + 1];
// getmedian[i + 1] = getmedian_temp;

// getducats_temp = getducats[i];
// getducats[i] = getducats[i + 1];
// getducats[i + 1] = getducats_temp;

// getducats_per_platinum_temp = getducats_per_platinum[i];
// getducats_per_platinum[i] = getducats_per_platinum[i + 1];
// getducats_per_platinum[i + 1] = getducats_per_platinum_temp;

// name_temp = namearray[i];
// namearray[i] = namearray[i + 1];
// namearray[i + 1] = name_temp;

// }
// }
// }
// for (int i = 0; i < getid.length; i++) {
// System.out.println("物品id:\t" + getid[i]);
// System.out.println("物品剩余:\t" + volume[i]);
// System.out.println("物品平均售价:\t" + getwa_price[i]);
// System.out.println("物品最低售价:\t" + getmedian[i]);
// System.out.println("物品名字:\t" + namearray[i]);
// // System.out.println("物品白金:\t" + du.getplat_worth()[i]);
// System.out.println("物品杜卡德:\t" + getducats[i]);
// System.out.println("物品平均白金:\t" + getducats_per_platinum[i]);
// // System.out.println("物品刷新时间:\t" + getdatetime[i]);
// System.out.println("\n");
// }

// }

// public static ArrayList<String> contains(String[] array1, String[] array2,
// String[] array3) {
// ArrayList<String> array = new ArrayList<String>();
// int num = 0;
// // Arrays.sort(array1);
// // Arrays.sort(array2);
// for (String string : array2) {
// if (ArrayUtils.contains(array1, string)) {
// array.add(array3[num]);
// System.out
// .println("相同元素:" + string + "\t\t" + array1[num] + "\t\t" + array2[num] +
// "\t\t" + array3[num]
// + "\t\t" + array.get(num));
// num++;
// } else {
// System.out.println("no");
// }
// }

// return array;
// }
// for (int i = 0; i < it.getitemname().length; i++) {

// System.out.println(it.getid()[i]);
// System.out.println(it.getitemname()[i]);
// System.out.println(it.getitemurl()[i]);
// System.out.println();

// }
/*
 * search_id sea = new search_id();
 * sea.getname();
 */

/*
 * urlname_search u = new urlname_search();
 * System.out.println(u.geturlname()[0]);
 */