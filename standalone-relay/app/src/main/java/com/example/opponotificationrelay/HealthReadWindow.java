package com.example.opponotificationrelay;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

/** Calendar pages never split a sleep day or silently truncate a response. */
final class HealthReadWindow {
    final LocalDate start,end;
    HealthReadWindow(LocalDate start,LocalDate end){
        if(!end.isAfter(start))throw new IllegalArgumentException("HEALTH_RANGE");
        this.start=start;this.end=end;
    }
    List<HealthReadWindow> pages(){
        List<HealthReadWindow> out=new ArrayList<>();
        for(LocalDate a=start;a.isBefore(end);){LocalDate b=a.plusDays(31);if(b.isAfter(end))b=end;out.add(new HealthReadWindow(a,b));a=b;}
        Collections.reverse(out);return out;
    }
    LocalDate midpoint(){long days=ChronoUnit.DAYS.between(start,end);return days>1?start.plusDays(days/2):null;}
    static boolean capacity(String code){return "HEALTH_OUTPUT_LIMIT".equals(code)||"HEALTH_ROW_LIMIT".equals(code)||"HEALTH_RECORD_LIMIT".equals(code);}
    static boolean covered(long from,long to,List<long[]> ranges){
        ranges.sort(Comparator.comparingLong(r->r[0]));long reached=from;
        for(long[] r:ranges){if(r[0]>reached)return false;if(r[1]>reached)reached=r[1];if(reached>=to)return true;}
        return reached>=to;
    }
}
