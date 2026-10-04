package com.example.opponotificationrelay;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import org.json.*;
import java.time.*;
import java.util.*;
/** Adds the independent app's own records before the calendar is first rendered. */
final class LocalHealthCalendar {
    static void add(Map<LocalDate,Float> out,LocalDate day){if(!day.isBefore(LocalDate.of(2019,1,1))&&!day.isAfter(LocalDate.now()))out.put(day,1f);}
    static void read(Context c,String mac,String metric,ZoneId zone,Map<LocalDate,Float> out)throws Exception {
        String device=HealthArchive.device(mac);SQLiteDatabase archive=HealthArchive.get(c).getReadableDatabase();
        if(metric.equals("steps")||metric.equals("calories")){
            String column=metric.equals("steps")?"steps":"kcal";try(Cursor rows=archive.rawQuery("SELECT day FROM daily WHERE device=? AND "+column+">0",new String[]{device})){while(rows.moveToNext())add(out,LocalDate.parse(rows.getString(0)));}
            try(Cursor rows=archive.rawQuery("SELECT a.day,a.body FROM official_activity a JOIN official_activity_scope s ON a.scope=s.scope AND a.device=s.device WHERE a.device=?",new String[]{device})){while(rows.moveToNext()){JSONArray values=new JSONObject(rows.getString(1)).getJSONArray("values");if(values.optLong(metric.equals("steps")?0:1)>0)add(out,LocalDate.parse(rows.getString(0)));}}
        }
        if(metric.equals("heart")||metric.equals("sleep")){
            String kinds=metric.equals("heart")?"'HEART'":"'SLEEP','SLEEP_STAGE'";
            try(Cursor rows=archive.rawQuery("SELECT kind,stamp,body FROM records WHERE device=? AND kind IN("+kinds+") ORDER BY stamp",new String[]{device})){
                while(rows.moveToNext()){String kind=rows.getString(0);long time=rows.getLong(1)*1000;HealthProto.Node data=HealthProto.parse(rows.getBlob(2));boolean valid;
                    if(kind.equals("HEART")){int value=data.number(2,0),type=data.number(4,0);valid=value>0&&value<=300&&type!=1&&type!=4&&type!=5;}
                    else if(kind.equals("SLEEP")){int score=data.number(2,0),minutes=data.number(7,0);valid=score>0&&score<=100&&minutes>0&&minutes<=1440;}
                    else {valid=WatchSleepProjection.rawStage(data.number(2,0))>0;time+=4*3600000L;}
                    if(valid)add(out,Instant.ofEpochMilli(time).atZone(zone).toLocalDate());
                }
            }
        }
        String kind;boolean date=true;
        switch(metric){case "heart":kind="heart";break;case "sleep":kind="sleep";break;case "wrist":kind="sleepWrist";break;case "mind":kind="mentalDays";break;case "sunshine":kind="sunshineDays";break;case "glucose":kind="glucoseDays";break;case "apnea":kind="apneaDays";break;case "oxygen":kind="oxygenDays";date=false;break;case "relax":kind="relaxRows";date=false;break;case "weight":kind="weightRows";date=false;break;default:return;}
        SQLiteDatabase details=HealthMetricsStore.get(c).getReadableDatabase();try(Cursor rows=details.rawQuery("SELECT i.stamp,i.body FROM items i JOIN scopes s ON i.device=s.device AND i.scope=s.scope WHERE i.device=? AND i.kind=?",new String[]{device,kind})){
            while(rows.moveToNext()){JSONArray data=new JSONArray(rows.getString(1));boolean valid;
                switch(metric){case "heart":valid=data.optLong(1)>0;break;case "sleep":valid=data.optLong(3)>0;break;case "wrist":valid=data.optLong(1)>0&&data.optLong(3)>0;break;case "mind":valid=data.optLong(1)>0&&data.optLong(1)<=100&&data.optLong(2)>=1&&data.optLong(2)<=4;break;case "sunshine":valid=data.optLong(1)>=0;break;case "glucose":valid=data.optLong(3)>0;break;case "apnea":valid=true;break;default:valid=data.optLong(1)>0;}
                if(valid)add(out,date?HealthMetricsData.dateCode(rows.getInt(0)):Instant.ofEpochMilli(rows.getLong(0)).atZone(zone).toLocalDate());
            }
        }
    }
}
