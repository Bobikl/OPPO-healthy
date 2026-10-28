package com.example.opponotificationrelay;
import android.content.*;
import android.database.Cursor;
import org.json.*;
import java.util.*;

/** Replayable consumer. Source events are committed with the raw watch packet, never inferred on login. */
final class CloudNativeProducer {
    static JSONObject owner(Context c,String mac){
        try{
            long generation=HealthAccountStore.generation();JSONObject session=HealthAccountStore.load(c);
            if(session==null||!HealthArchive.device(mac).equals(HealthArchive.device(RelayConfig.credentials(c).getString("mac")))||RelayConfig.getPrefs(c).getLong("credentials_verified_at",0)<=0)return null;
            DeviceIdentity identity=DeviceIdentityStore.read(c);if(identity==null||!identity.model.equals("OWW251"))return null;
            String account=session.getString("account");
            java.io.File history=OfficialHistoryStore.current(c);if(history==null)return null;
            if(!account.equals(OfficialHistoryStore.json(new java.io.File(history,"manifest.json")).getString("account")))return null;
            boolean known=false;String category="";synchronized(OfficialHistoryStore.LOCK){
                try(android.database.sqlite.SQLiteDatabase db=OfficialHistoryStore.open(new java.io.File(history,"databases/database.db"));Cursor row=db.rawQuery("SELECT 1 FROM DBHeartRate WHERE ssoid=? AND upper(device_unique_id)=? LIMIT 1",new String[]{account,HealthArchive.device(mac)})){known=row.moveToFirst();}
                try(android.database.sqlite.SQLiteDatabase db=OfficialHistoryStore.open(new java.io.File(history,"databases/database.db"));Cursor row=db.rawQuery("SELECT DISTINCT device_category FROM DBSportDataDetail WHERE ssoid=? AND upper(device_unique_id)=? AND device_category IS NOT NULL AND device_category<>'' LIMIT 2",new String[]{account,HealthArchive.device(mac)})){
                    if(row.moveToFirst()){String candidate=row.getString(0);if(!row.moveToNext())category=candidate;}
                }
            }
            if(!known||generation!=HealthAccountStore.generation())return null;
            return new JSONObject().put("deviceType",category).put("scope",CloudSyncEngine.accountKey(account)).put("generation",generation).put("model",identity.model).put("zone",java.time.ZoneId.systemDefault().getId());
        }catch(Exception unknown){return null;}
    }
    static String kind(CloudStream stream){
        switch(stream.id){case "activity-detail":return "ACTIVITY";case "activity-stat":return "ACTIVITY_SUMMARY";case "heart":return "HEART";default:return "";}
    }
    static JSONObject prepare(CloudStream stream,JSONObject row,JSONObject baseline,JSONObject metadata)throws Exception {
        if(baseline!=null){JSONObject merged=new JSONObject(baseline.toString());Iterator<String> names=row.keys();while(names.hasNext()){String key=names.next();merged.put(key,row.get(key));}row=merged;}
        if(stream.id.equals("activity-detail")){
            String category=metadata.optString("deviceType",row.optString("deviceType"));
            if(category.isEmpty())throw new java.io.IOException("CLOUD_DEVICE_TYPE_UNVERIFIED");row.put("deviceType",category);
        }
        if(stream.id.equals("activity-stat")){
            // Match pinned bei.f(): merge cumulative observations without reducing existing totals.
            for(String field:new String[]{"totalSteps","totalDistance","totalCalories","totalAltitudeOffset","totalDuration","totalWorkoutMinutes","totalMoveAboutTimes","totalStaticCal","sedentaryCounts","sedentaryTime"})
                if(baseline!=null&&baseline.has(field))row.put(field,Math.max(row.optLong(field),baseline.optLong(field)));
            JSONArray goals=metadata.optJSONArray("goals");
            String[] target={"currentDayStepsGoal","currentDayCaloriesGoal","exerciseGoal","activitiesGoal"};
            if(goals!=null)for(int i=0;i<4;i++)if(row.optLong(target[i])<=0)row.put(target[i],i==1?Math.multiplyExact(goals.getLong(i),1000):goals.getLong(i));
            for(String field:target)if(row.optLong(field)<=0)throw new java.io.IOException("CLOUD_ACTIVITY_GOALS_UNVERIFIED");
            String[] total={"totalSteps","totalCalories","totalWorkoutMinutes","totalMoveAboutTimes"},completed={"stepsGoalComplete","caloriesGoalComplete","exerciseGoalComplete","activitiesGoalComplete"};int day=1;
            for(int i=0;i<4;i++){int done=row.optLong(total[i])>=row.getLong(target[i])?1:0;row.put(completed[i],done);day&=done;}row.put("dayGoalComplete",day);
            // Java primitive fields in the pinned StepsStatPOJO constructor default to zero.
            Iterator<String> fields=stream.mapping.keys();while(fields.hasNext()){String field=fields.next();if(!row.has(field)&&stream.wireTypes.optString(field).length()==1)row.put(field,0);}
        }
        String modified=stream.field(stream.modifiedColumn());if(modified!=null)row.put(modified,baseline==null?0:stream.modified(baseline));
        if(stream.has("updated"))row.put("updated",1);
        return row;
    }
    static void capture(Context c,CloudStore store,CloudStream stream)throws Exception {
        String kind=kind(stream);if(kind.isEmpty()||store.nativePendingCount(stream)>=200)return;
        boolean daily=stream.id.equals("activity-stat");
        if(daily)store.supersedeNativeReady(stream,"native-v1:");
        long through=store.producerCursor(stream);
        try(Cursor events=HealthArchive.get(c).getReadableDatabase().rawQuery("SELECT sequence,event_id,device,stamp,received_at,body,zone,model,metadata FROM cloud_source_events WHERE scope=? AND kind=? AND sequence>? ORDER BY sequence LIMIT 100",new String[]{store.scope,kind,Long.toString(through)})){
            while(events.moveToNext()){
                store.check();String source=(daily?"native-v2:":"native-v1:")+events.getString(1);long sequence=events.getLong(0);
                if(store.replayNative(stream,source,sequence))continue;
                JSONObject row=eventRow(c,store,stream,events);
                if(row!=null){
                    store.enqueueNative(stream,row,source,sequence);
                }else store.producerCursor(stream,sequence);
            }
        }
    }
    static JSONObject eventRow(Context c,CloudStore store,CloudStream stream,Cursor events)throws Exception {
        String device=events.getString(2);long stamp=events.getLong(3),received=events.getLong(4);
        JSONObject row=CloudNativeProjection.project(stream.id,store.account,device,stamp,received,events.getBlob(5),events.getString(6),events.getString(7));
        if(row==null)return null;
        JSONObject baseline=store.remote(stream,row),metadata=new JSONObject(events.getString(8));
        if(stream.id.equals("activity-stat")){
            boolean verified=metadata.optBoolean("goalsVerified");
            if(!metadata.has("goalsVerified"))try(Cursor proof=HealthArchive.get(c).getReadableDatabase().rawQuery("SELECT 1 FROM goal_schema WHERE device=? AND verified_at<=?",new String[]{device,Long.toString(received)})){verified=proof.moveToFirst();}
            int[] values=verified?DailyActivityData.wireGoals(HealthProto.parse(events.getBlob(5))):null;
            if(values!=null){JSONArray goals=new JSONArray();for(int value:values)goals.put(value);metadata.put("goals",goals);}
        }
        return prepare(stream,row,baseline,metadata);
    }
}
