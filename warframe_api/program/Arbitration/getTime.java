package program.Arbitration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class getTime {
    public long gettime(String endtime,String starttime) {
        /* String endtime = "2023-11-17T04:25:12.853Z";
        String starttime = "2023-11-16T23:25:15.104Z"; */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Instant now = Instant.now();
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        Date date = Date.from(now);
        String nowdate = sdf.format(date);
        

        /* System.out.println("endtime="+gettimeLeft(endtime) + "\t" + "starttime="+gettimeLeft(starttime) + "\t"+"nowtime="+gettimeLeft(nowdate));
        System.out.println((gettimeLeft(endtime) - gettimeLeft(nowdate))); */

        long temp = gettimeLeft(endtime) - gettimeLeft(nowdate);
        /* System.out.println(nowdate);
        System.out.println("temp=\t" + temp); */
        int atleasttime=(int)temp/1000/60;
        return atleasttime;
    }

    public long gettimeLeft(String time) {
        long temp = 0;

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        try {
            Date date = format.parse(time);

            temp = date.getTime();
        } catch (Exception e) {
            System.out.println("gettimelife is flase:     " + e);
        }

        /* System.out.println("date=\t" + temp); */

        return temp;
    }

}
