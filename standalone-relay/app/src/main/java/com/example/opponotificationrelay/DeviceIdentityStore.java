package com.example.opponotificationrelay;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.*;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.json.JSONObject;
import java.util.concurrent.*;

/** Caches only model/SKU/name. The Root reader runs once when missing or on an explicit refresh. */
public final class DeviceIdentityStore {
    public interface Callback{void done(String message);}
    private static boolean busy;private static String attempted="";private static long attemptedAt;
    private static SharedPreferences prefs(Context c){return c.getSharedPreferences("device_identity",Context.MODE_PRIVATE);}
    public static DeviceIdentity read(Context c){
        SharedPreferences p=prefs(c);String mac=RelayConfig.getTargetMac(c);
        if(!DeviceStatusProtocol.validMac(mac) || !mac.equalsIgnoreCase(p.getString("mac","")))return null;
        try{return new DeviceIdentity(p.getString("model",""),p.getString("skuCode",""),p.getString("sku",""),p.getString("name",""));}catch(IllegalArgumentException ignored){return null;}
    }
    public static synchronized void refresh(Context original,boolean force,Callback callback){
        if(!OfficialHistoryStore.allowed(original)){if(callback!=null)callback.done("已关闭官方数据访问，保留独立版设备信息");return;}
        Context c=original.getApplicationContext();String mac=RelayConfig.getTargetMac(c);long now=SystemClock.elapsedRealtime();
        if(busy || !DeviceStatusProtocol.validMac(mac) || (!force && (read(c)!=null || (mac.equals(attempted) && now-attemptedAt<300000)))){
            if(callback!=null)callback.done(busy?"设备信息正在读取":"请先保存有效手表 MAC 地址");return;
        }
        busy=true;attempted=mac;attemptedAt=now;
        new Thread(()->{
            String message="暂未读取到设备外观信息，可在设备管理中重试";
            try{
                ApplicationInfo app=c.getPackageManager().getApplicationInfo("com.heytap.health",PackageManager.MATCH_DISABLED_COMPONENTS);
                if(app.uid<10000 || app.uid>=100000)throw new IllegalStateException("USER_UNSUPPORTED");
                String command="exec env CLASSPATH="+SettingsPreviewProtocol.quote(c.getApplicationInfo().sourceDir)+" /system/bin/app_process /system/bin com.example.opponotificationrelay.RootDeviceInfoReader "+app.uid+" "+SettingsPreviewProtocol.quote(mac)+" "+SettingsPreviewProtocol.quote(app.sourceDir);
                JSONObject result=null;
                for(boolean global:new boolean[]{true,false}){
                    Process child=null;FutureTask<String> task=null;
                    try{
                        child=OfficialHistoryStore.launch(c,(global?new ProcessBuilder("su","--mount-master",Integer.toString(app.uid),"-c",command):new ProcessBuilder("su",Integer.toString(app.uid),"-c",command)).redirectErrorStream(true));
                        final Process running=child;task=new FutureTask<>(()->SettingsPreviewProtocol.read(running.getInputStream()));Thread reader=new Thread(task,"device-info-pipe");reader.setDaemon(true);reader.start();
                        String value=task.get(20,TimeUnit.SECONDS);if(value.length()>4096)throw new IllegalStateException("RESULT_LIMIT");result=new JSONObject(value);break;
                    }catch(Exception failed){if(!global)throw failed;}
                    finally{if(child!=null){OfficialHistoryStore.release(child);try{child.getOutputStream().close();}catch(Exception ignored){}child.destroy();try{child.getInputStream().close();}catch(Exception ignored){}}if(task!=null)task.cancel(true);}
                }
                if(result!=null && "OK".equals(result.optString("status"))){
                    DeviceIdentity d=new DeviceIdentity(result.getString("model"),result.getString("skuCode"),result.getString("sku"),result.getString("name"));
                    if(OfficialHistoryStore.allowed(c)&&mac.equalsIgnoreCase(RelayConfig.getTargetMac(c))){
                        prefs(c).edit().putString("mac",mac).putString("model",d.model).putString("skuCode",d.skuCode).putString("sku",d.skuLabel).putString("name",d.name).putLong("readAt",System.currentTimeMillis()).commit();
                        message="已读取 "+d.name+" · "+d.skuLabel;FileLogger.i("DeviceIdentity","型号/SKU 已读取，官方外观资源="+d.blueWatchX2());
                    }else message="设备已切换，本次读取结果已忽略";
                }else if(result!=null){String code=result.optString("code");FileLogger.w("DeviceIdentity","设备外观读取暂不可用 code="+(code.matches("[A-Z_]{1,64}")?code:"UNKNOWN"));}
            }catch(Exception ignored){FileLogger.w("DeviceIdentity","设备外观读取暂不可用");}
            synchronized(DeviceIdentityStore.class){busy=false;}
            if(callback!=null){final String value=message;new Handler(Looper.getMainLooper()).post(()->callback.done(value));}
        },"device-info-read").start();
    }
}
