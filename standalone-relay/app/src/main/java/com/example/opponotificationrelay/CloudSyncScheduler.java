package com.example.opponotificationrelay;
import android.app.job.*;
import android.content.*;
import android.net.*;
import java.util.Calendar;
/** One durable job, re-armed on completion. */
final class CloudSyncScheduler {
    static final int JOB=1080,MANUAL=1081;
    static void cancelManual(Context c){JobScheduler scheduler=c.getSystemService(JobScheduler.class);if(scheduler!=null)scheduler.cancel(MANUAL);}
    static void manual(Context c){
        if(!CloudSyncState.enabled(c)||!CloudSyncState.any(c)||!HealthAccountStore.exists(c))return;
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
    static void schedule(Context context,boolean changed){
        Context c=context.getApplicationContext();JobScheduler scheduler=c.getSystemService(JobScheduler.class);
        if(scheduler==null)return;
        if(!CloudSyncState.enabled(c)||!CloudSyncState.any(c)||!HealthAccountStore.exists(c)){scheduler.cancel(JOB);return;}
        String mode=CloudSyncState.mode(c);long now=System.currentTimeMillis();
        JobInfo.Builder job=new JobInfo.Builder(JOB,new ComponentName(c,CloudSyncJobService.class)).setPersisted(true);
        if("wifi".equals(mode))job.setRequiredNetwork(new NetworkRequest.Builder().addTransportType(NetworkCapabilities.TRANSPORT_WIFI).addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET).build());
        else job.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);
        if("charging".equals(mode))job.setRequiresCharging(true);
        long delay="daily".equals(mode)?nextDaily(now,CloudSyncState.hour(c),CloudSyncState.minute(c))-now:changed?0:3600000;
        job.setMinimumLatency(delay);job.setBackoffCriteria(60000,JobInfo.BACKOFF_POLICY_EXPONENTIAL);
        if(scheduler.schedule(job.build())!=JobScheduler.RESULT_SUCCESS)
            CloudSyncState.prefs(c).edit().putString("schedulerError","系统未能安排自动同步，请重新选择同步模式").apply();
        else CloudSyncState.prefs(c).edit().remove("schedulerError").apply();
    }
}
