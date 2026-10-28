package com.example.opponotificationrelay;
import android.app.job.*;
import android.content.*;
import android.net.*;
import android.os.PersistableBundle;
import java.util.Calendar;
/** Daily jobs are timed; charging and Wi-Fi jobs are created only by a new connection event. */
final class CloudSyncScheduler {
    static final int JOB=1080,MANUAL=1081;
    static boolean ready(Context c){return CloudSyncState.enabled(c)&&CloudSyncState.any(c)&&HealthAccountStore.exists(c);}
    static void cancelManual(Context c){JobScheduler scheduler=c.getSystemService(JobScheduler.class);if(scheduler!=null)scheduler.cancel(MANUAL);}
    static void manual(Context c){
        if(!ready(c))return;
        JobScheduler scheduler=c.getSystemService(JobScheduler.class);if(scheduler==null)return;
        JobInfo job=new JobInfo.Builder(MANUAL,new ComponentName(c,CloudSyncJobService.class))
            .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY).setMinimumLatency(0).setBackoffCriteria(60000,JobInfo.BACKOFF_POLICY_EXPONENTIAL).build();
        if(scheduler.schedule(job)!=JobScheduler.RESULT_SUCCESS)
            android.widget.Toast.makeText(c,"无法启动同步，请稍后重试",android.widget.Toast.LENGTH_LONG).show();
    }
    static long nextDaily(long now,int hour,int minute){
        Calendar next=Calendar.getInstance();next.setTimeInMillis(now);
        next.set(Calendar.HOUR_OF_DAY,hour);next.set(Calendar.MINUTE,minute);
        next.set(Calendar.SECOND,0);next.set(Calendar.MILLISECOND,0);
        if(next.getTimeInMillis()<=now)next.add(Calendar.DAY_OF_YEAR,1);
        return next.getTimeInMillis();
    }
    static boolean validAutomatic(Context c,JobParameters parameters){
        return ready(c)&&!"manual".equals(CloudSyncState.mode(c))&&
            parameters.getExtras().getLong("revision",-1)==CloudSyncState.revision(c)&&
            CloudSyncState.mode(c).equals(parameters.getExtras().getString("mode"));
    }
    static void connection(Context c,String mode){
        if(ready(c)&&mode.equals(CloudSyncState.mode(c)))enqueue(c,mode,0);
    }
    private static void enqueue(Context c,String mode,long delay){
        JobScheduler scheduler=c.getSystemService(JobScheduler.class);if(scheduler==null)return;
        PersistableBundle extras=new PersistableBundle();extras.putLong("revision",CloudSyncState.revision(c));extras.putString("mode",mode);
        JobInfo.Builder job=new JobInfo.Builder(JOB,new ComponentName(c,CloudSyncJobService.class)).setPersisted(true).setExtras(extras);
        if("wifi".equals(mode))job.setRequiredNetwork(new NetworkRequest.Builder().addTransportType(NetworkCapabilities.TRANSPORT_WIFI).addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET).build());
        else job.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);
        if("charging".equals(mode))job.setRequiresCharging(true);
        job.setMinimumLatency(delay);job.setBackoffCriteria(60000,JobInfo.BACKOFF_POLICY_EXPONENTIAL);
        if(scheduler.schedule(job.build())!=JobScheduler.RESULT_SUCCESS)
            CloudSyncState.prefs(c).edit().putString("schedulerError","系统未能安排自动同步，请重新选择同步模式").apply();
        else CloudSyncState.prefs(c).edit().remove("schedulerError").apply();
    }
    static void schedule(Context context,boolean changed){
        Context c=context.getApplicationContext();if(changed)CloudSyncState.prefs(c).edit().remove("schedulerError").apply();CloudSyncTriggers.refresh(c,changed);
        JobScheduler scheduler=c.getSystemService(JobScheduler.class);if(scheduler==null)return;
        if(!ready(c)||"manual".equals(CloudSyncState.mode(c))){scheduler.cancel(JOB);CloudSyncState.prefs(c).edit().remove("schedulerError").apply();return;}
        String mode=CloudSyncState.mode(c);
        if(changed)scheduler.cancel(JOB);
        if("daily".equals(mode)){
            if(!changed&&scheduler.getPendingJob(JOB)!=null)return;
            long now=System.currentTimeMillis();enqueue(c,mode,nextDaily(now,CloudSyncState.hour(c),CloudSyncState.minute(c))-now);
        }
    }
}
