package Creational;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Factory {
    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        Date time = cal.getTime();
        System.out.println(cal.getTime());

        // To TimeZone America/New_York
        SimpleDateFormat sdfAmerica = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
        TimeZone tzInAmerica = TimeZone.getTimeZone("America/New_York");
        sdfAmerica.setTimeZone(tzInAmerica);

        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");

        String dateInString = "26-04-2020 08:25:00 PM";
        Date date = formatter.parse(dateInString);
        calendar.setTime(date);
        calendar.setTimeZone(tzInAmerica);

        //Correct! need formatter
        System.out.println("Date (New York) (Correct!) : " + sdfAmerica.format(calendar.getTime()));
        System.out.println(calendar);

    }
}

/*Output:
java.util.GregorianCalendar[time=1587912818988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=117,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=23,SECOND=38,MILLISECOND=988,ZONE_OFFSET=19800000,DST_OFFSET=0]
Sun Apr 26 20:23:38 IST 2020
Date (New York) (Correct!) : 26-4-2020 10:55:00 AM
java.util.GregorianCalendar[time=1587912900000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=117,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=25,SECOND=0,MILLISECOND=0,ZONE_OFFSET=19800000,DST_OFFSET=0]

Process finished with exit code 0
 */
