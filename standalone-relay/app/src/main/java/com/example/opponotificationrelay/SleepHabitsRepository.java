package com.example.opponotificationrelay;

import android.content.*;
import android.os.SystemClock;
import org.json.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

/** Per-watch sleep preferences. Official DB reads are baseline-only; confirmed edits stay local. */
public final class SleepHabitsRepository {
    private static SleepHabitsRepository instance;
    public static synchronized SleepHabitsRepository get(Context c){if(instance==null)instance=new SleepHabitsRepository(c);return instance;}
    public static final class Snapshot {
        public final String json,message,mac;public final long revision;public final boolean busy,loaded,modeKnown;public final int accord;
        Snapshot(String json,String message,String mac,long revision,boolean busy,boolean loaded,boolean modeKnown,int accord){this.json=json;this.message=message;this.mac=mac;this.revision=revision;this.busy=busy;this.loaded=loaded;this.modeKnown=modeKnown;this.accord=accord;}
        public JSONObject values(){try{return new JSONObject(json);}catch(JSONException e){return new JSONObject();}}
    }
    private final Context context;private final RfcommWearTransport transport;private final ExecutorService worker=Executors.newSingleThreadExecutor();
    private final SharedPreferences prefs;
    private JSONObject values=new JSONObject();private byte[] mode;private long modeAt,modeGeneration=-1,revision;private boolean busy,loaded;
    private String mac="",scope="",message="尚未读取作息设置";
    private SleepHabitsRepository(Context c){context=c.getApplicationContext();transport=RfcommWearTransport.getInstance(c);prefs=context.getSharedPreferences("sleep_habits_v1",Context.MODE_PRIVATE);}
    public synchronized Snapshot snapshot(){int accord=values.optInt("accord",-1);try{if(mode!=null)accord=HealthProto.parse(mode).number(2,0);}catch(IOException ignored){}return new Snapshot(values.toString(),message,mac,revision,busy,loaded,mode!=null && accord>=0 && modeGeneration==transport.healthGeneration(),accord);}
    private String target(){return RelayConfig.getTargetMac(context).toUpperCase(Locale.ROOT);}
    private String key(){return mac+":"+scope;}
    private void current(String expected)throws IOException{if(!expected.equals(target()))throw new IOException("SLEEP_TARGET_CHANGED");}
    private synchronized void status(String s){message=s;}
    public synchronized void load(){
        if(busy)return;String selected=target();if(selected.isEmpty()){message="请先选择手表";return;}
        if(!selected.equals(mac)){values=new JSONObject();mode=null;loaded=false;scope="";mac=selected;revision++;}
        busy=true;message="正在读取本机作息记录…";final String owner=mac;
        worker.execute(()->{
            try{
                JSONObject result=new OfficialSettingsClient(context).readSleep();current(owner);
                String next=result.getString("scope");if(!next.matches("[0-9a-f]{64}"))throw new IOException("SLEEP_SCOPE");
                JSONObject initial=baseline(result.getJSONObject("values"));
                synchronized(this){scope=next;String saved=prefs.getString(key(),null);values=saved==null?initial:new JSONObject(saved);for(java.util.Iterator<String> keys=initial.keys();keys.hasNext();){String k=keys.next();if(!values.has(k))values.put(k,initial.get(k));}validate(values);loaded=true;mode=null;revision++;message="已读取本机作息记录，正在连接手表…";}
                try{if(!prefs.contains(key()+":pending")){readMode(owner,values);status("已读取作息记录，并同步睡眠模式");}}catch(Exception e){status("作息记录已读取；手表模式暂未读取，可刷新重试");}
                if(prefs.contains(key()+":pending"))status("上次保存结果未确认，请核对后重新保存；当前显示最近已知设置");
            }catch(Exception e){status("作息读取失败："+safe(e)+"，请稍后刷新");}
            finally{synchronized(this){busy=false;}}
        });
    }
    private static String safe(Exception e){String s=e.getMessage();return s!=null && s.matches("[A-Z_0-9-]{1,64}")?s:"READ_OR_CONNECTION_FAILED";}
    private static int numeric(JSONObject source,String key)throws JSONException{
        if(!source.has(key))return -1;String s=source.getString(key);if(!s.matches("[0-9]{1,6}"))throw new JSONException("SLEEP_VALUE");return Integer.parseInt(s);
    }
    static JSONObject baseline(JSONObject source)throws Exception{
        JSONObject v=new JSONObject();
        JSONObject mode=source.has("SLEEP_MODEL_SETTINGS")?new JSONObject(source.getString("SLEEP_MODEL_SETTINGS")):new JSONObject();
        v.put("accord",mode.optInt("mAccordRestSwitch",-1)).put("sync",mode.optInt("mStateSync",-1)).put("syncAt",mode.optInt("mStateSyncTime",0));
        v.put("goal",numeric(source,"SLEEP_GOAL")).put("bedOn",numeric(source,"BED_TIME_SWITCH")).put("bedTime",numeric(source,"BED_TIME"))
            .put("stayOn",numeric(source,"STAY_UP_BED_TIME_SWITCH")).put("stayTime",numeric(source,"STAY_UP_BED_TIME")).put("music",numeric(source,"CLOSE_MUSIC"));
        if(source.has("USER_REST_NEW")){JSONObject rest=new JSONObject(source.getString("USER_REST_NEW"));v.put("rests",rest.getJSONArray("mSleepRests"));v.put("restKnown",true);}
        else {v.put("rests",new JSONArray());v.put("restKnown",false);}
        validate(v);return v;
    }
    private static void validate(JSONObject v)throws Exception{
        for(String k:new String[]{"bedOn","stayOn","music","accord","sync"}){int n=v.getInt(k);if(n< -1 || n>1)throw new IOException("SLEEP_SWITCH");}
        for(String k:new String[]{"goal","bedTime","stayTime"}){int n=v.getInt(k);if(n!= -1)SleepSettingsProtocol.minutes(n);}
        if(v.getJSONArray("rests").length()>35)throw new IOException("SLEEP_REST_LIMIT");
        // Individual imported schedules are checked without rewriting their original JSON fields.
        restList(v.getJSONArray("rests"));
    }
    static List<SleepSettingsProtocol.Rest> restList(JSONArray a)throws Exception{
        List<SleepSettingsProtocol.Rest> result=new ArrayList<>();Set<Integer> ids=new HashSet<>();
        for(int i=0;i<a.length();i++){JSONObject r=a.getJSONObject(i);long id=r.getLong("createTime");if(id<1 || id>Integer.MAX_VALUE || !ids.add((int)id))throw new IOException("SLEEP_REST_ID");
            result.add(new SleepSettingsProtocol.Rest((int)id,r.getInt("bedTime"),r.getInt("wakeUpTime"),r.getInt("userDefinedDate"),r.optInt("restType",0),r.optInt("excludeHoliday",0)!=0));}
        return result;
    }
    private byte[] exchange(String owner,SleepSettingsProtocol.Request request)throws Exception{
        current(owner);long until=SystemClock.elapsedRealtime()+20000;
        OafHealthChannel.Snapshot h=transport.healthSettings();
        if(!h.connected || h.busy){transport.requestHealthSettings();}
        while(true){current(owner);h=transport.healthSettings();if(h.connected && !h.busy)break;if(SystemClock.elapsedRealtime()>=until)throw new IOException("SLEEP_CONNECTION_TIMEOUT");Thread.sleep(100);}
        final long generation=transport.healthConnection();final CountDownLatch done=new CountDownLatch(1);final boolean[] success={false};final byte[][] data={null};
        if(!transport.sleepCommand(request,(ok,body,msg)->{success[0]=ok;data[0]=body;done.countDown();}))throw new IOException("SLEEP_CHANNEL_BUSY");
        if(!done.await(20,TimeUnit.SECONDS))throw new IOException("SLEEP_ACK_TIMEOUT");current(owner);
        if(generation!=transport.healthConnection())throw new IOException("SLEEP_NOT_CONFIRMED");if(!success[0])throw new IOException("SLEEP_UNCONFIRMED_"+(data[0]==null?-1:HealthProto.parse(data[0]).number(1,-1))+"_LEN_"+(data[0]==null?0:data[0].length));return data[0];
    }
    private void readMode(String owner,JSONObject source)throws Exception{
        int accord=source.getInt("accord"),sync=source.getInt("sync");
        if(accord<0 || sync<0)throw new IOException("SLEEP_MODE_BASELINE_REQUIRED");
        byte[] response=SleepSettingsProtocol.mode(exchange(owner,SleepSettingsProtocol.syncMode(accord,sync,source.optInt("syncAt",0))));
        HealthProto.Node state=HealthProto.parse(response);
        synchronized(this){mode=response;modeAt=SystemClock.elapsedRealtime();modeGeneration=transport.healthGeneration();source.put("sync",state.number(4,0));source.put("syncAt",state.number(5,0));revision++;}
    }
    public synchronized boolean save(String field,Object value,long expected){
        if(busy || !loaded || revision!=expected || !mac.equals(target()))return false;
        final JSONObject proposed;
        try{proposed=new JSONObject(values.toString());proposed.put(field,value);if("rests".equals(field))proposed.put("restKnown",true);validate(proposed);}catch(Exception e){message="时间或作息格式不正确";return false;}
        final String owner=mac;busy=true;message="正在保存作息设置…";
        worker.execute(()->{
            boolean sent=false;
            try{
                current(owner);SleepSettingsProtocol.Request request;
                if("accord".equals(field)){
                    int on=(Integer)value;if(on==1 && proposed.getJSONArray("rests").length()==0)throw new IOException("SLEEP_REST_REQUIRED");
                    if(mode==null || modeGeneration!=transport.healthGeneration() || SystemClock.elapsedRealtime()-modeAt>=60000)readMode(owner,values);
                    request=SleepSettingsProtocol.modeChange(mode,on,HealthProto.parse(mode).number(4,0),(int)(System.currentTimeMillis()/1000));
                }else if("goal".equals(field))request=SleepSettingsProtocol.goal(proposed.getInt("goal"));
                else if("rests".equals(field))request=SleepSettingsProtocol.rest(restList(proposed.getJSONArray("rests")));
                else if("bedOn".equals(field)||"bedTime".equals(field)){
                    int on=proposed.getInt("bedOn"),time=proposed.getInt("bedTime");
                    if(time<0)throw new IOException("SLEEP_SET_REMINDER_TIME_FIRST");if(on<0){on=0;proposed.put("bedOn",0);}request=SleepSettingsProtocol.bed(on,time);
                }else if("stayOn".equals(field)||"stayTime".equals(field)){
                    int on=proposed.getInt("stayOn"),time=proposed.getInt("stayTime");
                    if(time<0)throw new IOException("SLEEP_SET_REMINDER_TIME_FIRST");if(on<0){on=0;proposed.put("stayOn",0);}request=SleepSettingsProtocol.stayUp(on,time);
                }else if("music".equals(field))request=SleepSettingsProtocol.music(proposed.getInt("music"));
                else throw new IOException("SLEEP_FIELD");
                if(!prefs.edit().putString(key()+":pending",new JSONObject().put("cid",request.cid).put("at",System.currentTimeMillis()).toString()).commit())throw new IOException("SLEEP_JOURNAL");
                sent=true;exchange(owner,request);
                if("accord".equals(field)){
                    proposed.put("sync",HealthProto.parse(mode).number(4,0)).put("syncAt",HealthProto.parse(mode).number(5,0));
                    readMode(owner,proposed);if(HealthProto.parse(mode).number(2,0)!=(Integer)value)throw new IOException("SLEEP_READBACK_MISMATCH");
                }
                synchronized(this){current(owner);if(!prefs.edit().putString(key(),proposed.toString()).remove(key()+":pending").commit())throw new IOException("SLEEP_LOCAL_SAVE");values=proposed;revision++;message="accord".equals(field)?"已保存，并从手表读取确认":"手表已确认保存；已记录到独立版";}
            }catch(Exception e){String reason=safe(e);status("SLEEP_SET_REMINDER_TIME_FIRST".equals(reason)?"请先设定提醒时间，再开启提醒":"SLEEP_REST_REQUIRED".equals(reason)?"请先添加作息时间":"保存未完成："+reason+(sent?"，请核对手表后重试":""));}
            finally{synchronized(this){busy=false;}}
        });return true;
    }
}
