package program.rivenSearch;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        weaponname wea = new weaponname();

        rivrenSearch ri = new rivrenSearch();
        ri.riven_search(wea.ReadGsonTest("战刃", "localfile\\weapon.json"), null, null);
        String[][] temp = ri.getdata().clone();

        for (int i = 0; i < temp.length; i++) {
            if (temp[i][4].hashCode() != -1548612125 && Integer.valueOf(temp[i][1]) < 921) {
                System.out.println("in game name=\t" + temp[i][0]);
                System.out.println("buyout_price=\t" + temp[i][1]);
                System.out.println("item url_name=\t" + temp[i][2]);
                System.out.println("item name=\t" + temp[i][3]);
                System.out.println("is offline=\t" + temp[i][4]);
                System.out.println("want buy\t" + temp[i][5] + "\n");
                boolean[] att = ri.getattributes_positive(i);
                String[] att_1 = ri.getattributes_url_name(i);
                float[] att_2 = ri.getattributes_value(i);
                for (int j = 0; j < att.length; j++) {
                    System.out.println("url_name\t" + att_1[j] + "\n");
                    System.out.println("value\t" + att_2[j] + "\n");
                    System.out.println("positive\t" + att[j] + "\n");
                }

            }
            /*
             * "in game name="
             * "buyout_price="
             * "item name="
             * "is offline="
             */
        }

        /* wea.ReadGsonTest(readname()); */
        /* System.out.println(readname()); */
    }

    /**
     * 读入TXT文件
     */
    public static String readname() {
        String pathname = "program\\rivenSearch\\inputname.txt"; // 绝对路径或相对路径都可以,写入文件时演示相对路径,读取以上路径的input.txt文件
        String temp = null;
        // 防止文件建立或读取失败,用catch捕捉错误并打印,也可以throw;
        // 不关闭文件会导致资源的泄露,读写文件都同理
        // Java7的try-with-resources可以优雅关闭文件,异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271

        try (FileInputStream fis = new FileInputStream(new File(pathname));
                InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr) // 建立一个对象,它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            // 网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                temp = line;
                System.out.println(temp.hashCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;

    }

    public static int readplat() {
        String pathname = "program\\rivenSearch\\inputPlat.txt"; // 绝对路径或相对路径都可以,写入文件时演示相对路径,读取以上路径的input.txt文件
        int temp = 0;
        // 防止文件建立或读取失败,用catch捕捉错误并打印,也可以throw;
        // 不关闭文件会导致资源的泄露,读写文件都同理
        // Java7的try-with-resources可以优雅关闭文件,异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname);
                BufferedReader br = new BufferedReader(reader) // 建立一个对象,它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            // 网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                temp = Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;

    }

}
