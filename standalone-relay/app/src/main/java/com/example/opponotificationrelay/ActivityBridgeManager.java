package com.example.opponotificationrelay;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.*;
import org.json.*;

/** Manual, single-flight bridge. No persistent process and no background external database writes. */
final class ActivityBridgeManager {
    private static ActivityBridgeManager instance;
    static synchronized ActivityBridgeManager get(Context c){if(instance==null)instance=new ActivityBridgeManager(c.getApplicationContext());return instance;}
    private final Context context;private final ExecutorService worker=Executors.newSingleThreadExecutor(r->new Thread(r,"activity-bridge"));
    private volatile boolean running;private volatile String message="导入官方历史，并同步每日活动";
    private ActivityBridgeManager(Context c){context=c;}
    boolean running(){return running;}String message(){return message;}
    synchronized void sync(){if(running)return;running=true;message="正在与官方健康同步…";String device=RelayConfig.getTargetMac(context);
        worker.execute(()->{try{
            OfficialHistoryStore.requireAllowed(context);
            String mac=HealthArchive.device(device);boolean enabled=context.getPackageManager().getApplicationInfo("com.heytap.health",PackageManager.MATCH_DISABLED_COMPONENTS).enabled;
            HealthArchive archive=HealthArchive.get(context);OfficialSettingsClient client=new OfficialSettingsClient(context);
            JSONObject result=client.activity(mac,enabled?null:archive.watchActivity(mac));
            if(!device.equalsIgnoreCase(RelayConfig.getTargetMac(context)))throw new IllegalStateException("ACTIVITY_DEVICE_CHANGED");
            int imported=archive.importOfficialActivity(mac,result),written=result.optInt("written");
            HealthDataManager.get(context).request(java.time.LocalDate.now(),false,true);
            message=enabled?"已导入 "+imported+" 天 · 停用官方健康后可写回":"已同步 "+imported+" 天历史 · 写回 "+written+" 天";
            FileLogger.i("ActivityBridge","导入天数="+imported+"，写回天数="+written+"，备份="+result.optString("backup"));
        }catch(Exception e){String code=e.getMessage();message="ACTIVITY_OFFICIAL_RUNNING".equals(code)?"请先停用官方健康，再同步写回":"同步未完成 · "+(code!=null&&code.matches("[A-Z_]{1,64}")?code:"请稍后重试");FileLogger.w("ActivityBridge",message);}
        finally{running=false;}});
    }
}
