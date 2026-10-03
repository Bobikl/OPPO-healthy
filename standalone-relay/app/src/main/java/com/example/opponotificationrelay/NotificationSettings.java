package com.example.opponotificationrelay;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/** 官方只读基线按目标手表保存；读取失败不以猜测默认值覆盖手表。 */
public final class NotificationSettings {
    public static volatile String detail="等待独立通道连接后同步";
    private NotificationSettings() { }
    private static String key(Context c) {return "notification_baseline_"+RelayConfig.getTargetMac(c).toUpperCase(java.util.Locale.ROOT);}
    public static boolean hasBaseline(Context c) {
        return RelayConfig.getTargetMac(c).matches("(?i)([0-9a-f]{2}:){5}[0-9a-f]{2}") && RelayConfig.getPrefs(c).contains(key(c));
    }
    public static Boolean baselineFlag(Context c,int bit) {
        return hasBaseline(c)?(RelayConfig.getPrefs(c).getInt(key(c),0)&bit)!=0:null;
    }
    /** 仅由连接工作线程调用，每次接管读取一次，不按通知轮询 Root。 */
    public static void refreshBaseline(Context c) {
        String target=RelayConfig.getTargetMac(c);
        if(!target.matches("(?i)([0-9a-f]{2}:){5}[0-9a-f]{2}")) {
            detail="未同步：请先保存有效的目标手表地址";return;
        }
        for(String pkg:new String[]{"com.heytap.health","com.coloros.health"}) {
            int uid;
            try {uid=c.getPackageManager().getApplicationInfo(pkg,PackageManager.MATCH_DISABLED_COMPONENTS).uid;}
            catch(PackageManager.NameNotFoundException ignored) {continue;}
            // KernelSU 的调用方命名空间可能隐藏其他应用目录；只让短命只读子进程进入全局视图。
            // 不支持此选项的 su 仍尝试普通调用，不改系统挂载、官方文件或 Root 观察器。
            for(boolean globalNamespace:new boolean[]{true,false}) {
            Process child=null;
            try {
                FileLogger.i("NotificationSettings","只读获取官方通知设置 package="+pkg+" uid="+uid);
                String apk=c.getApplicationInfo().sourceDir.replace("'","'\\''");
                String command="exec env CLASSPATH='"+apk+"' /system/bin/app_process /system/bin com.example.opponotificationrelay.RootNotificationSettingsReader "+pkg+" "+uid;
                ProcessBuilder launch=globalNamespace ? new ProcessBuilder("su","--mount-master","-c",command)
                    : new ProcessBuilder("su","-c",command);
                child=launch.redirectErrorStream(true).start();
                final Process process=child;
                FutureTask<String> read=new FutureTask<>(() -> {
                    try(InputStream in=process.getInputStream();ByteArrayOutputStream bytes=new ByteArrayOutputStream()) {
                        byte[] block=new byte[1024];int n;
                        while((n=in.read(block))!=-1) {
                            if(bytes.size()+n>16384) throw new IllegalStateException("CID84 output limit");
                            bytes.write(block,0,n);
                            String output=new String(bytes.toByteArray(),StandardCharsets.UTF_8);
                            int end=output.lastIndexOf('\n');
                            if(end>=0) {
                                String complete=output.substring(0,end+1);
                                for(String line:complete.split("\\r?\\n"))
                                    if(line.startsWith("CID84BASE1 OK ") || line.startsWith("CID84BASE1 ERROR ")) return complete;
                            }
                        }
                        return new String(bytes.toByteArray(),StandardCharsets.UTF_8);
                    }
                });
                Thread reader=new Thread(read,"CID84-baseline-result");reader.setDaemon(true);reader.start();
                String output=read.get(10,TimeUnit.SECONDS);
                for(String line:output.split("\\r?\\n"))
                    if(line.matches("CID84BASE1 ERROR [A-Z0-9_]{1,40}")) FileLogger.w("NotificationSettings",line);
                int bitmap=NotificationSwitchPolicy.parseBaseline(output);
                if(!target.equalsIgnoreCase(RelayConfig.getTargetMac(c))) return;
                if(!RelayConfig.getPrefs(c).edit().putInt(key(c),bitmap).commit()) throw new IllegalStateException("CID84 save failed");
                detail="已读取官方保存的通知设置，等待写入手表";
                FileLogger.i("NotificationSettings","已读取官方通知开关基线 bitmap=0x"+Integer.toHexString(bitmap));
                return;
            } catch(InterruptedException ignored) {Thread.currentThread().interrupt();return;}
            catch(Exception failure) {FileLogger.w("NotificationSettings","读取基线失败 type="+failure.getClass().getSimpleName());}
            finally {if(child!=null) {try {child.getOutputStream().close();} catch(Exception ignored) { } child.destroy();}}
            }
        }
        detail=hasBaseline(c) ? "官方设置暂不可读，将沿用此手表上次保存的基线" : "未同步：无法读取官方保存的通知设置，请查看日志后重新连接";
        FileLogger.w("NotificationSettings",detail);
    }
    public static RelayPayloadEncoder.EventEnvelope envelope(Context c) {
        if(!hasBaseline(c)) return null;
        int baseline=RelayConfig.getPrefs(c).getInt(key(c),0);
        int bitmap=NotificationSwitchPolicy.apply(baseline,RelayForegroundService.enabled(c) && NotificationPreferences.enabled(c),ListenerRecovery.authorized(c),
            RelayConfig.shouldForward(c,"com.tencent.mm"),NotificationPreferences.screenPush(c),NotificationPreferences.wristOverride(c));
        return RelayPayloadEncoder.encodeNotificationSwitches(bitmap,c.getPackageName());
    }
    public static void written(RelayPayloadEncoder.EventEnvelope event) {
        detail="通知设置已写入蓝牙，手表是否生效仍待确认";
        FileLogger.i("NotificationSettings","通知设置 CID=84 已写入 bytes="+event.payload.length);
    }
}
