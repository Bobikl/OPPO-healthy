package com.example.opponotificationrelay;

import android.database.Cursor;
import org.json.*;
import java.io.IOException;
import java.time.*;

/** Account-scoped, bounded projections from the existing SQLCipher read-only connection. */
final class RootHealthDataReader {
    static JSONArray rows(Object db,String sql,int limit,String... args)throws Exception {
        JSONArray out=new JSONArray();try(Cursor c=RootOfficialSettingsReader.query(db,sql,args)){
            while(c.moveToNext()){if(out.length()>=limit)throw new IOException("HEALTH_ROW_LIMIT");JSONArray row=new JSONArray();
                for(int i=0;i<c.getColumnCount();i++)row.put(c.isNull(i)?JSONObject.NULL:c.getLong(i));out.put(row);}
        }return out;
    }
    static JSONArray uniqueRows(Object db,String sql,int limit,String... args)throws Exception {
        JSONArray out=new JSONArray();java.util.Set<Long> seen=new java.util.HashSet<>();int scanned=0;
        try(Cursor c=RootOfficialSettingsReader.query(db,sql,args)){
            while(c.moveToNext()){if(++scanned>limit)throw new IOException("HEALTH_ROW_LIMIT");if(!seen.add(c.getLong(0)))continue;
                JSONArray row=new JSONArray();for(int i=0;i<c.getColumnCount();i++)row.put(c.isNull(i)?JSONObject.NULL:c.getLong(i));out.put(row);}
        }return out;
    }
    static JSONArray heartBins(Object db,String account,String from,String to,ZoneId zone)throws Exception {
        java.util.TreeMap<Long,long[]> bins=new java.util.TreeMap<>();int count=0;
        // One indexed range scan avoids a correlated join against the entire heart table.
        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT data_created_timestamp,heart_rate_value FROM DBHeartRate WHERE ssoid=? AND display=1 AND heart_rate_type NOT IN(1,4,5) AND heart_rate_value>0 AND data_created_timestamp>=? AND data_created_timestamp<? ORDER BY data_created_timestamp",new String[]{account,from,to})){
            long previous=-1;while(c.moveToNext()){if(++count>3000000)throw new IOException("HEALTH_RECORD_LIMIT");long time=c.getLong(0);int value=c.getInt(1);if(value>300||time==previous)continue;previous=time;long bucket=HealthTime.bucket(time,30,zone);long[] b=bins.get(bucket);
                if(b==null){if(bins.size()>=18000)throw new IOException("HEALTH_ROW_LIMIT");b=new long[]{bucket,value,value,0,0,time,value};bins.put(bucket,b);}
                b[1]=Math.min(b[1],value);b[2]=Math.max(b[2],value);b[3]+=value;b[4]++;if(time>=b[5]){b[5]=time;b[6]=value;}
            }
        }
        JSONArray out=new JSONArray();for(long[] b:bins.values())out.put(new JSONArray(b));return out;
    }
    static void activityBins(Object db,String account,String device,long start,long end,JSONObject result,ZoneId zone)throws Exception {
        java.util.TreeMap<Long,long[]> hours=new java.util.TreeMap<>(),halves=new java.util.TreeMap<>();int scanned=0;
        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT start_time,end_time,steps,calories,workout,device_category FROM DBSportDataDetail WHERE ssoid=? AND upper(device_unique_id)=? AND display=1 AND start_time>=? AND start_time<? ORDER BY start_time",new String[]{account,device,Long.toString(start),Long.toString(end)})){
            while(c.moveToNext()){if(++scanned>3000000)throw new IOException("HEALTH_RECORD_LIMIT");long stamp=c.getLong(0),hour=HealthTime.bucket(stamp,60,zone),half=HealthTime.bucket(stamp,30,zone),steps=c.getLong(2),calories=c.getLong(3);String category=c.getString(5);
                long[] h=hours.get(hour);if(h==null){if(hours.size()>=9000)throw new IOException("HEALTH_ROW_LIMIT");h=new long[]{hour,0,0,0,0};hours.put(hour,h);}h[1]=Math.addExact(h[1],steps);h[2]=Math.addExact(h[2],calories);h[3]=Math.max(h[3],c.getLong(1));
                if("Watch".equals(category)?steps>0:category!=null&&!category.isEmpty()&&!"Phone".equals(category)&&!"mobile".equals(category)&&steps>30)h[4]=1;
                long[] m=halves.get(half);if(m==null){if(halves.size()>=18000)throw new IOException("HEALTH_ROW_LIMIT");m=new long[]{half,0,0,0,0};halves.put(half,m);}m[1]=Math.addExact(m[1],steps);m[2]=Math.addExact(m[2],calories);m[3]=Math.addExact(m[3],c.getLong(4));m[4]=Math.max(m[4],c.getLong(1));
            }
        }
        JSONArray hourRows=new JSONArray(),halfRows=new JSONArray(),moveRows=new JSONArray();for(long[] h:hours.values()){hourRows.put(new JSONArray(new long[]{h[0],h[1],h[2],h[3]}));moveRows.put(new JSONArray(new long[]{h[0],h[4]}));}for(long[] m:halves.values())halfRows.put(new JSONArray(m));
        result.put("activityBins",hourRows).put("activityHalves",halfRows).put("moveHours",moveRows);
    }
    static void readWellness(Object db,String account,String device,long start,long end,JSONObject result,ZoneId zone)throws Exception {
        String from=Long.toString(start),to=Long.toString(end);
        int firstDate=Integer.parseInt(Instant.ofEpochMilli(start).atZone(zone).toLocalDate().toString().replace("-",""));
        int lastDate=Integer.parseInt(Instant.ofEpochMilli(end).atZone(zone).toLocalDate().toString().replace("-",""));
        String first=Integer.toString(firstDate),last=Integer.toString(lastDate);
        result.put("mentalDays",uniqueRows(db,"SELECT date,avg_stress,stress_state,avg_hrv,baseline_low,baseline_middle,baseline_high,avg_sleep_hrv,avg_resting_heart_rate,stress_reminder FROM DBPhysicalMentalStat WHERE ssoid=? AND upper(data_client)=? AND display=1 AND avg_stress>0 AND avg_stress<=100 AND stress_state BETWEEN 1 AND 4 AND date>=? AND date<? ORDER BY date,modified_timestamp DESC,rowid DESC LIMIT 5001",5000,account,device,first,last));
        result.put("mentalRaw",uniqueRows(db,"SELECT start_timestamp,stress,stress_state,type,value FROM DBPhysicalMentalStatus WHERE ssoid=? AND upper(data_client)=? AND display=1 AND stress>0 AND stress<=100 AND stress_state BETWEEN 1 AND 4 AND start_timestamp>=? AND start_timestamp<? ORDER BY start_timestamp,modified_timestamp DESC LIMIT 20001",20000,account,device,from,to));
        result.put("sunshineDays",uniqueRows(db,"SELECT date,total_duration,target_duration,sunshine_type FROM DBSunshineStat WHERE ssoid=? AND upper(data_client)=? AND date>=? AND date<? ORDER BY date,modified_timestamp DESC,rowid DESC LIMIT 5001",5000,account,device,first,last));
        result.put("latestSunshine",uniqueRows(db,"SELECT date,total_duration,target_duration,sunshine_type FROM DBSunshineStat WHERE ssoid=? AND upper(data_client)=? AND date>=20190101 AND date<? ORDER BY date DESC,modified_timestamp DESC,rowid DESC LIMIT 1",1,account,device,first));
        result.put("relaxRows",uniqueRows(db,"SELECT start_timestamp,relax_duration,type,sub_type,min_hr,max_hr,physical_mental,stress_value FROM DBRelax WHERE ssoid=? AND upper(device_unique_id)=? AND display=1 AND relax_duration>0 AND start_timestamp>=? AND start_timestamp<? ORDER BY start_timestamp,modified_timestamp DESC,rowid DESC LIMIT 5001",5000,account,device,from,to));
    }
    static JSONArray glucoseRows(Object db,String account,long start,long end)throws Exception {
        JSONArray out=new JSONArray();long previous=-1;int scanned=0;
        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT data_created_timestamp,value,trend FROM DBBloodSugar WHERE ssoid=? AND display=1 AND value>0 AND value<=1000 AND data_created_timestamp>=? AND data_created_timestamp<? ORDER BY data_created_timestamp,modified_timestamp DESC,data_client LIMIT 20001",new String[]{account,Long.toString(start),Long.toString(end)})){
            while(c.moveToNext()){if(++scanned>20000)throw new IOException("HEALTH_ROW_LIMIT");long stamp=c.getLong(0);if(stamp==previous)continue;previous=stamp;long milli=Math.round(c.getDouble(1)*1000);if(milli<=0)continue;out.put(new JSONArray().put(stamp).put(milli).put(Math.max(0,c.getInt(2))));}
        }return out;
    }
    static void readAdditionalCards(Object db,String account,long start,long end,JSONObject result,ZoneId zone)throws Exception {
        String from=Long.toString(start),to=Long.toString(end),first=Instant.ofEpochMilli(start).atZone(zone).toLocalDate().toString().replace("-",""),last=Instant.ofEpochMilli(end).atZone(zone).toLocalDate().toString().replace("-","");
        JSONArray weights=new JSONArray();long previous=-1;int scanned=0;
        // The original main card queries the signed-in person's userTagId (the ssoid), across scales/manual entries.
        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT measurement_timestamp,weight FROM DBWeightBodyFatTable WHERE ssoid=? AND user_tag_id=? AND sub_account=0 AND deleted=0 AND CAST(weight AS REAL)>0 AND CAST(weight AS REAL)<=1000000 AND measurement_timestamp>=? AND measurement_timestamp<? ORDER BY measurement_timestamp,modified_timestamp DESC,weight_id DESC LIMIT 5001",new String[]{account,account,from,to})){
            while(c.moveToNext()){if(++scanned>5000)throw new IOException("HEALTH_ROW_LIMIT");long stamp=c.getLong(0);if(stamp==previous)continue;previous=stamp;long grams=Math.round(c.getDouble(1));if(grams>0)weights.put(new JSONArray().put(stamp).put(grams));}
        }result.put("weightRows",weights);
        JSONArray predecessor=new JSONArray();try(Cursor row=RootOfficialSettingsReader.query(db,"SELECT measurement_timestamp,weight FROM DBWeightBodyFatTable WHERE ssoid=? AND user_tag_id=? AND sub_account=0 AND deleted=0 AND CAST(weight AS REAL)>0 AND CAST(weight AS REAL)<=1000000 AND measurement_timestamp<? ORDER BY measurement_timestamp DESC,modified_timestamp DESC,weight_id DESC LIMIT 1",new String[]{account,account,from})){
            if(row.moveToFirst())predecessor.put(new JSONArray().put(row.getLong(0)).put(Math.round(row.getDouble(1))));
        }result.put("latestWeight",predecessor);
        JSONArray glucose=new JSONArray();previous=-1;scanned=0;
        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT date,min_value,max_value,avg_value,low_threshold,high_threshold FROM DBBloodSugarStat WHERE ssoid=? AND date>=? AND date<? ORDER BY date,modified_timestamp DESC,data_client LIMIT 5001",new String[]{account,first,last})){
            while(c.moveToNext()){if(++scanned>5000)throw new IOException("HEALTH_ROW_LIMIT");long day=c.getLong(0);if(day==previous)continue;previous=day;JSONArray row=new JSONArray().put(day);for(int i=1;i<6;i++)row.put(c.isNull(i)?JSONObject.NULL:Math.round(c.getDouble(i)*1000));glucose.put(row);}
        }result.put("glucoseDays",glucose);
        JSONArray apnea=new JSONArray();previous=-1;scanned=0;
        // OSA results are account/day summaries; retain the latest model version, never infer a level from AHI.
        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT date,osa_level,ahi,version FROM DBOsaResult WHERE ssoid=? AND date>=? AND date<? ORDER BY date,version DESC,modified_timestamp DESC LIMIT 5001",new String[]{account,first,last})){
            while(c.moveToNext()){if(++scanned>5000)throw new IOException("HEALTH_ROW_LIMIT");long day=c.getLong(0);if(day==previous)continue;previous=day;int level=c.isNull(1)?-1:c.getInt(1);apnea.put(new JSONArray().put(day).put(level>=0&&level<=3?level+1:0).put(c.isNull(2)||c.getDouble(2)<0?JSONObject.NULL:Math.round(c.getDouble(2)*1000)).put(c.getInt(3)));}
        }result.put("apneaDays",apnea);
    }
    static JSONArray oxygenDays(Object db,String account,String device,String from,String to,ZoneId zone)throws Exception {
        java.util.TreeMap<Long,long[]> days=new java.util.TreeMap<>();int count=0;
        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT data_created_timestamp,max(blood_oxygen_saturation_value) FROM DBBloodOxygenSaturation WHERE ssoid=? AND upper(device_unique_id)=? AND display=1 AND blood_oxygen_saturation_value>0 AND blood_oxygen_saturation_value<=100 AND data_created_timestamp>=? AND data_created_timestamp<? GROUP BY data_created_timestamp ORDER BY data_created_timestamp",new String[]{account,device,from,to})){
            while(c.moveToNext()){if(++count>3000000)throw new IOException("HEALTH_RECORD_LIMIT");long time=c.getLong(0);int value=c.getInt(1);
                long stamp=Instant.ofEpochMilli(time).atZone(zone).toLocalDate().atStartOfDay(zone).toInstant().toEpochMilli();
                long[] d=days.get(stamp);if(d==null){if(days.size()>=5000)throw new IOException("HEALTH_ROW_LIMIT");d=new long[]{stamp,value,value,0,value,time,0};days.put(stamp,d);}
                d[1]=Math.min(d[1],value);d[2]=Math.max(d[2],value);d[3]+=value;d[4]=value;d[5]=time;d[6]++;
            }
        }
        JSONArray out=new JSONArray();for(long[] d:days.values()){d[3]=Math.round((double)d[3]/d[6]);out.put(new JSONArray(d));}return out;
    }
    static void sleepSegments(java.util.TreeMap<Long,JSONArray> output,int date,JSONObject source)throws Exception {
        JSONArray rows=source.optJSONArray("sleepUnitDataList");if(rows==null)return;
        for(int i=0;i<rows.length();i++){JSONObject r=rows.getJSONObject(i);long start=r.getLong("startTimestamp"),end=r.getLong("endTimestamp");
            if(start<=0||end<=start||end-start>86400000L)throw new IOException("SLEEP_INTERVAL");
            output.put(start,new JSONArray().put(start).put(end).put(r.getInt("sleepType")).put(r.optBoolean("stageSleepEnd")?1:0).put(date));
            if(output.size()>40000)throw new IOException("HEALTH_ROW_LIMIT");}
    }
    static void cloudSleep(Object db,String account,String device,String first,String last,JSONObject result,java.util.TreeMap<Long,JSONArray> segments,ZoneId zone)throws Exception {
        JSONArray nights=result.getJSONArray("sleepNight");java.util.Set<Integer> known=new java.util.HashSet<>();for(int i=0;i<nights.length();i++)known.add(nights.getJSONArray(i).getInt(0));
        // A server day summary supplies the ownership and exact main sleep interval. No guessed nap/day boundary.
        try(Cursor days=RootOfficialSettingsReader.query(db,"SELECT date,fall_asleep,sleep_out,total_sleep_time,total_deep_sleep_time,total_lightly_sleep_time,total_rem_time,total_wake_up_time FROM DBSleepDataStatTable WHERE ssoid=? AND upper(device_unique_id)=? AND date>=? AND date<? AND fall_asleep>0 AND sleep_out>fall_asleep ORDER BY date,modified_timestamp DESC,rowid DESC LIMIT 5001",new String[]{account,device,first,last})){
            int previous=-1,scanned=0;while(days.moveToNext()){if(++scanned>5000)throw new IOException("HEALTH_ROW_LIMIT");int date=days.getInt(0);if(date==previous)continue;previous=date;if(known.contains(date))continue;long from=days.getLong(1),to=days.getLong(2);if(to-from>86400000L)continue;
                int wakes=0,previousState=-1;long previousEnd=-1;
                try(Cursor raw=RootOfficialSettingsReader.query(db,"SELECT start_time,end_time,sleep_state FROM DBSleepTable WHERE ssoid=? AND upper(device_unique_id)=? AND display=1 AND start_time>=? AND start_time<? ORDER BY start_time,modified_timestamp DESC LIMIT 20001",new String[]{account,device,Long.toString(from),Long.toString(to)})){
                    long stamp=-1;int count=0;while(raw.moveToNext()){if(++count>20000)throw new IOException("HEALTH_ROW_LIMIT");long start=raw.getLong(0),end=Math.min(to,raw.getLong(1));if(start==stamp)continue;stamp=start;int state=raw.getInt(2);if(end<=start||state<2||state>5)continue;int stage=state==5?4:state==4?0:state;
                        if(state==5&&(previousState!=5||previousEnd!=start))wakes++;previousState=state;previousEnd=end;segments.put(start,new JSONArray().put(start).put(end).put(stage).put(end==to?1:0).put(date));if(segments.size()>40000)throw new IOException("HEALTH_ROW_LIMIT");}
                }
                JSONArray night=new JSONArray();for(int column=0;column<8;column++)night.put(days.isNull(column)?JSONObject.NULL:days.getLong(column));night.put(wakes);nights.put(night);
            }
        }
    }
    static JSONObject read(Object db,String account,byte[] key,JSONObject request)throws Exception {
        return readLocal(db,account,RootActivityBridge.scope(account,key),request);
    }
    static JSONObject readLocal(Object db,String account,String scope,JSONObject request)throws Exception {
        String operation=request.getString("operation"),device=request.getString("device");
        if(!device.matches("(?i)[0-9a-f]{2}(:[0-9a-f]{2}){5}"))throw new IOException("HEALTH_DEVICE");device=device.toUpperCase(java.util.Locale.ROOT);
        ZoneId zone=ZoneId.of(request.optString("zone",ZoneId.systemDefault().getId()));
        long start=request.getLong("start"),end=request.getLong("end");
        if(request.length()!=(request.has("zone")?5:4)+(request.has("calendar")?1:0)||start<LocalDate.of(2019,1,1).atStartOfDay(zone).toInstant().toEpochMilli()||end<=start||end-start>(request.has("calendar")?10000L:367L)*86400000L||end>System.currentTimeMillis()+86400000L)throw new IOException("HEALTH_RANGE");

        JSONObject result=new JSONObject().put("zone",zone.getId()).put("status","OK").put("scope",scope).put("start",start).put("end",end).put("readAt",System.currentTimeMillis());
        if(request.has("calendar")){if(!"readHealth".equals(operation))throw new IOException("CALENDAR_OPERATION");return result.put("calendar",RootHealthCalendarReader.dates(db,account,device,request.getString("calendar"),start,end,zone));}
        String from=Long.toString(start),to=Long.toString(end);
        if("readHeartRaw".equals(operation)){
            if(end-start>26*3600000L)throw new IOException("HEALTH_RANGE");
            result.put("raw",rows(db,"SELECT data_created_timestamp,heart_rate_value,heart_rate_type FROM DBHeartRate WHERE ssoid=? AND display=1 AND heart_rate_type NOT IN(1,4,5) AND heart_rate_value>0 AND data_created_timestamp>=? AND data_created_timestamp<? GROUP BY data_created_timestamp ORDER BY data_created_timestamp LIMIT 20001",20000,account,from,to));
            result.put("oxygen",rows(db,"SELECT data_created_timestamp,max(blood_oxygen_saturation_value) FROM DBBloodOxygenSaturation WHERE ssoid=? AND upper(device_unique_id)=? AND display=1 AND blood_oxygen_saturation_value>0 AND blood_oxygen_saturation_value<=100 AND data_created_timestamp>=? AND data_created_timestamp<? GROUP BY data_created_timestamp ORDER BY data_created_timestamp LIMIT 20001",20000,account,device,from,to));
            result.put("glucoseRaw",glucoseRows(db,account,start,end));
            if(result.toString().length()>1100000)throw new IOException("HEALTH_OUTPUT_LIMIT");return result;
        }
        if(!"readHealth".equals(operation))throw new IOException("HEALTH_ARGUMENT");
        String first=Instant.ofEpochMilli(start).atZone(zone).toLocalDate().toString().replace("-",""),last=Instant.ofEpochMilli(end).atZone(zone).toLocalDate().toString().replace("-","");
        RootOfficialSettingsReader.stage="HEALTH_STATS";
        result.put("heart",uniqueRows(db,"SELECT date,min_hr,max_hr,average_hr,rest_hr,walk_avg_hr,sleep_base_hr FROM DBHeartRateDataStatTable WHERE ssoid=? AND date>=? AND date<? ORDER BY date,modified_timestamp DESC,rowid DESC LIMIT 5001",5000,account,first,last));
        result.put("sleep",uniqueRows(db,"SELECT date,sleep_score,checked_sleep_score,total_sleep_time,total_deep_sleep_time,total_lightly_sleep_time,total_rem_time,total_wake_up_time FROM DBSleepDataStatTable WHERE ssoid=? AND date>=? AND date<? ORDER BY date,modified_timestamp DESC,rowid DESC LIMIT 5001",5000,account,first,last));
        // Same visibility/type filtering as the official detail card. Reliability is not a visibility filter.
        RootOfficialSettingsReader.stage="HEALTH_BINS";
        result.put("bins",heartBins(db,account,from,to,zone));
        result.put("oxygenDays",oxygenDays(db,account,device,from,to,zone));
        result.put("latest",rows(db,"SELECT data_created_timestamp,heart_rate_value FROM DBHeartRate WHERE ssoid=? AND display=1 AND heart_rate_type NOT IN(1,4,5) AND heart_rate_value>0 AND data_created_timestamp>=? AND data_created_timestamp<? ORDER BY data_created_timestamp DESC LIMIT 1",1,account,from,to));
        result.put("warnings",rows(db,"SELECT start_timestamp,end_timestamp,warning_type,warning_heart_rate_type,min_heart_rate,max_heart_rate FROM DBHeartRateWarning WHERE ssoid=? AND start_timestamp>=? AND start_timestamp<? ORDER BY start_timestamp LIMIT 2001",2000,account,from,to));
        RootOfficialSettingsReader.stage="HEALTH_ACTIVITY_BINS";
        activityBins(db,account,device,start,end,result,zone);
        RootOfficialSettingsReader.stage="HEALTH_SLEEP_DETAIL";
        result.put("sleepNight",uniqueRows(db,"SELECT date,sleep_in_timestamp,sleep_out_timestamp,total_sleep_time,total_deep_sleep_time,total_lightly_sleep_time,total_rem_time,total_wake_up_time,wake_count FROM DBSleepDayStat WHERE ssoid=? AND upper(device_unique_id)=? AND date>=? AND date<? ORDER BY date,modified_timestamp DESC,rowid DESC LIMIT 5001",5000,account,device,first,last));
        // Date comes from the assembled day, including overnight and fragmented sleep.
        JSONArray segments=new JSONArray();java.util.TreeMap<Long,JSONArray> unique=new java.util.TreeMap<>();
        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT date,sleep_main_data,sleep_frg_data FROM DBSleepDayStat WHERE ssoid=? AND upper(device_unique_id)=? AND date>=? AND date<? ORDER BY date,modified_timestamp DESC,rowid DESC LIMIT 5001",new String[]{account,device,first,last})){
            while(c.moveToNext()){int date=c.getInt(0);if(!c.isNull(1)&&!c.getString(1).isEmpty())sleepSegments(unique,date,new JSONObject(c.getString(1)));
                if(!c.isNull(2)&&!c.getString(2).isEmpty()){JSONArray fragments=new JSONArray(c.getString(2));for(int i=0;i<fragments.length();i++)sleepSegments(unique,date,fragments.getJSONObject(i));}}
        }
        cloudSleep(db,account,device,first,last,result,unique,zone);
        for(JSONArray row:unique.values())segments.put(row);result.put("sleepSegments",segments);
        result.put("sleepIndex",uniqueRows(db,"SELECT data_created_timestamp,avg_sleep_spo2,avg_sleep_heart_rate,sleep_heart_rate_range_low,sleep_heart_rate_range_high,avg_sleep_breath_range_low,avg_sleep_breath_range_high,basal_hrv,min_hrv,max_hrv FROM DBSleepIndex WHERE ssoid=? AND upper(device_unique_id)=? AND data_created_timestamp>=? AND data_created_timestamp<? ORDER BY data_created_timestamp,modified_timestamp DESC,rowid DESC LIMIT 5001",5000,account,device,from,to));
        JSONArray indexes=result.getJSONArray("sleepIndex");java.util.Set<LocalDate> indexDays=new java.util.HashSet<>();for(int i=0;i<indexes.length();i++)indexDays.add(Instant.ofEpochMilli(indexes.getJSONArray(i).getLong(0)).atZone(zone).toLocalDate());
        try(Cursor heart=RootOfficialSettingsReader.query(db,"SELECT date,avg_sleep_heart_rate,min_hr,max_hr FROM DBSleepHeartRateStat WHERE ssoid=? AND date>=? AND date<? ORDER BY date,modified_timestamp DESC",new String[]{account,first,last})){
            int count=0;while(heart.moveToNext()){if(++count>5000)throw new IOException("HEALTH_ROW_LIMIT");LocalDate day=HealthMetricsData.dateCode(heart.getInt(0));if(!indexDays.add(day)||heart.getInt(1)<=0)continue;long time=day.atStartOfDay(zone).toInstant().toEpochMilli();indexes.put(new JSONArray().put(time).put(0).put(heart.getInt(1)).put(heart.getInt(2)).put(heart.getInt(3)).put(0).put(0).put(0).put(0).put(0));}
        }
        result.put("sleepWrist",uniqueRows(db,"SELECT date,day_baseline_value,confidence,value FROM DBWristTemperatureStat WHERE ssoid=? AND date>=? AND date<? ORDER BY date,modified_timestamp DESC,rowid DESC LIMIT 5001",5000,account,first,last));
        readWellness(db,account,device,start,end,result,zone);
        readAdditionalCards(db,account,start,end,result,zone);
        result.put("knowledge",RootKnowledgeReader.read(db));
        result.put("activity",RootActivityBridge.readLocal(db,account,device,scope,first,last));
        if(result.toString().length()>1100000)throw new IOException("HEALTH_OUTPUT_LIMIT");return result;
    }
}
