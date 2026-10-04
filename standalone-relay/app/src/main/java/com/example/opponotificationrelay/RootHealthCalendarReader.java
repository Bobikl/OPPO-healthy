package com.example.opponotificationrelay;
import android.database.Cursor;
import java.time.*;
import java.time.zone.*;
import java.util.*;
import org.json.*;
import java.io.IOException;
/** Sparse date-only projections. Timestamp grouping honors every timezone offset transition. */
final class RootHealthCalendarReader {
 static JSONArray dates(Object db,String account,String device,String metric,long start,long end,ZoneId zone)throws Exception {
  String table,column="date",filter;boolean timestamp=false;List<String> args=new ArrayList<>();args.add(account);
  switch(metric){
   case "sleep":table="DBSleepDataStatTable";filter="total_sleep_time>0";break;
   case "heart":table="DBHeartRateDataStatTable";filter="min_hr>0";break;
   case "wrist":table="DBWristTemperatureStat";filter="day_baseline_value>0 AND value>0";break;
   case "oxygen":table="DBBloodOxygenSaturation";column="data_created_timestamp";timestamp=true;filter="upper(device_unique_id)=? AND display=1 AND blood_oxygen_saturation_value>0 AND blood_oxygen_saturation_value<=100";args.add(device);break;
   case "mind":table="DBPhysicalMentalStat";filter="upper(data_client)=? AND display=1 AND avg_stress>0 AND avg_stress<=100 AND stress_state BETWEEN 1 AND 4";args.add(device);break;
   case "sunshine":table="DBSunshineStat";filter="upper(data_client)=? AND total_duration>=0";args.add(device);break;
   case "relax":table="DBRelax";column="start_timestamp";timestamp=true;filter="upper(device_unique_id)=? AND display=1 AND relax_duration>0";args.add(device);break;
   case "weight":table="DBWeightBodyFatTable";column="measurement_timestamp";timestamp=true;filter="user_tag_id=? AND sub_account=0 AND deleted=0 AND CAST(weight AS REAL)>0 AND CAST(weight AS REAL)<=1000000";args.add(account);break;
   case "glucose":table="DBBloodSugarStat";filter="avg_value>0";break;
   case "apnea":table="DBOsaResult";filter="1=1";break;
   case "steps":case "calories":table="DBSportDataStat";filter="upper(device_unique_id)=? AND sport_mode=-3 AND "+(metric.equals("steps")?"total_steps":"total_calories")+">0";args.add(device);break;
   default:throw new IOException("CALENDAR_METRIC");
  }
  TreeSet<LocalDate> dates=new TreeSet<>();String where=" FROM "+table+" WHERE ssoid=? AND "+filter+" AND "+column+">=? AND "+column+"<?";
  if(!timestamp){List<String> a=new ArrayList<>(args);a.add(Instant.ofEpochMilli(start).atZone(zone).toLocalDate().toString().replace("-",""));a.add(Instant.ofEpochMilli(end).atZone(zone).toLocalDate().toString().replace("-",""));
   try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT DISTINCT "+column+where+" ORDER BY "+column+" LIMIT 10001",a.toArray(new String[0]))){while(c.moveToNext()){String d=c.getString(0);if(d.length()!=8)throw new IOException("CALENDAR_DATE");dates.add(LocalDate.of(Integer.parseInt(d.substring(0,4)),Integer.parseInt(d.substring(4,6)),Integer.parseInt(d.substring(6,8))));}}
  }else{
   long from=start;int pieces=0;
   while(from<end){if(++pieces>100)throw new IOException("CALENDAR_ZONE_LIMIT");Instant instant=Instant.ofEpochMilli(from);ZoneOffsetTransition transition=zone.getRules().nextTransition(instant);long until=transition==null?end:Math.min(end,transition.getInstant().toEpochMilli());if(until<=from)throw new IOException("CALENDAR_ZONE");int offset=zone.getRules().getOffset(instant).getTotalSeconds();
    List<String> a=new ArrayList<>(args);a.add(Long.toString(from));a.add(Long.toString(until));String day="CAST(("+column+"+"+(offset*1000L)+")/86400000 AS INTEGER)";
    try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT DISTINCT "+day+where+" ORDER BY 1 LIMIT 10001",a.toArray(new String[0]))){while(c.moveToNext())dates.add(LocalDate.ofEpochDay(c.getLong(0)));}from=until;
   }
  }
  if(dates.size()>10000)throw new IOException("CALENDAR_LIMIT");JSONArray result=new JSONArray();for(LocalDate day:dates)result.put(day.toString());return result;
 }
}
