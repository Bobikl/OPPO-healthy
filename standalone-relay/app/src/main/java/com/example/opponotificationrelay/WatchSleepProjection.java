package com.example.opponotificationrelay;
import java.time.*;
import java.util.*;
/** Read-only V2 CID 14 minute states. Preserve official assembled nights when present. */
final class WatchSleepProjection {
    static int rawStage(int state){int type=state&7;return type==1?4:type==2?2:type==3?3:type==4?0:type==0&&(state&48)!=0?0:-1;}
    static void apply(HealthMetricsData data,TreeMap<Long,Integer> minutes){
        TreeMap<LocalDate,TreeMap<Long,Integer>> grouped=new TreeMap<>();
        for(Map.Entry<Long,Integer> e:minutes.entrySet()){LocalDate date=HealthMetricsData.date(e.getKey()+4*3600000L);grouped.computeIfAbsent(date,k->new TreeMap<>()).put(e.getKey(),rawStage(e.getValue()));}
        for(Map.Entry<LocalDate,TreeMap<Long,Integer>> entry:grouped.entrySet()){
            if(!data.sleep(entry.getKey()).isEmpty())continue;TreeMap<Long,Integer> rows=entry.getValue();long first=0,last=0;
            for(Map.Entry<Long,Integer> e:rows.entrySet())if(e.getValue()>0){if(first==0)first=e.getKey();last=e.getKey();}if(first==0)continue;
            List<HealthMetricsData.SleepSegment> segments=new ArrayList<>();long segmentStart=0,segmentEnd=0;int previous=-1;int deep=0,light=0,rem=0,awake=0,wakes=0;
            for(Map.Entry<Long,Integer> e:rows.subMap(first,true,last,true).entrySet()){long t=e.getKey();int stage=e.getValue();if(stage<0)continue;
                if(stage==2)deep++;else if(stage==4)light++;else if(stage==3)rem++;else awake++;
                if(stage==0&&(previous!=0||t!=segmentEnd))wakes++;
                if(stage!=previous||t!=segmentEnd){if(segmentEnd>segmentStart)segments.add(new HealthMetricsData.SleepSegment(segmentStart,segmentEnd,previous,t!=segmentEnd));segmentStart=t;previous=stage;}segmentEnd=t+60000;
            }
            if(segmentEnd>segmentStart)segments.add(new HealthMetricsData.SleepSegment(segmentStart,segmentEnd,previous,true));
            if(segments.isEmpty())continue;data.sleepSegments.put(entry.getKey(),segments);HealthMetricsData.Day day=data.day(entry.getKey());day.sleepIn=first;day.sleepOut=last+60000;day.deep=deep;day.light=light;day.rem=rem;day.awake=awake;day.wakes=wakes;if(day.sleepMinutes<=0)day.sleepMinutes=deep+light+rem;
        }
    }
}
