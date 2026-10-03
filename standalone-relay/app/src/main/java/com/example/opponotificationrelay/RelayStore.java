package com.example.opponotificationrelay;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;

/** Recent preview/count are diagnostic; critical configuration is saved separately. */
public final class RelayStore {
    private static final String PREFS="relay_state",LAST_EVENT="last_event",EVENT_COUNT="event_count";
    private static volatile String lastDecision="本次启动尚无所选应用的通知处理记录";
    private static final Handler main=new Handler(Looper.getMainLooper());
    private static final Runnable write=RelayStore::flush;
    private static SharedPreferences prefs;
    private static EventStatistics state;
    private static boolean scheduled;
    private RelayStore() {}
    public static void decision(String pkg,String reason) {lastDecision=pkg+" · "+reason;}
    public static String lastDecision() {return lastDecision;}
    private static void init(Context c) {
        if(state!=null)return;
        prefs=c.getApplicationContext().getSharedPreferences(PREFS,Context.MODE_PRIVATE);
        state=new EventStatistics(prefs.getInt(EVENT_COUNT,0),prefs.getString(LAST_EVENT,"暂无通知事件"));
    }
    public static synchronized void save(Context c,RelayEvent event) {
        init(c);state.record(event);
        if(!scheduled){scheduled=true;main.postDelayed(write,5000);}
    }
    public static synchronized void flush() {
        main.removeCallbacks(write);scheduled=false;if(state==null)return;
        EventStatistics.Snapshot pending=state.pending();if(pending==null)return;
        prefs.edit().putString(LAST_EVENT,pending.preview).putInt(EVENT_COUNT,pending.count).apply();state.saved(pending);
    }
    public static synchronized String lastEvent(Context c) {init(c);return state.snapshot().preview;}
    public static synchronized int eventCount(Context c) {init(c);return state.snapshot().count;}
}
