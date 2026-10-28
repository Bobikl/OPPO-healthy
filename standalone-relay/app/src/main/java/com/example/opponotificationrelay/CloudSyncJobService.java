package com.example.opponotificationrelay;
import android.app.job.*;
import android.os.*;
public final class CloudSyncJobService extends JobService {
    private final Handler main=new Handler(Looper.getMainLooper());private JobParameters owner;
    @Override public boolean onStartJob(JobParameters parameters){
        if(parameters.getJobId()==CloudSyncScheduler.JOB&&!CloudSyncScheduler.validAutomatic(this,parameters))return false;
        if(owner!=null||CloudSyncEngine.running()){main.post(()->jobFinished(parameters,true));return true;}
        owner=parameters;
        boolean started=CloudSyncEngine.start(this,parameters.getNetwork(),retry->main.post(()->{
            if(owner!=parameters)return;
            owner=null;jobFinished(parameters,retry);
            if(!retry&&parameters.getJobId()==CloudSyncScheduler.JOB&&"daily".equals(CloudSyncState.mode(this)))CloudSyncScheduler.schedule(this,true);
        }));
        if(!started){owner=null;main.post(()->jobFinished(parameters,true));}
        return true;
    }
    @Override public boolean onStopJob(JobParameters parameters){
        if(owner!=null&&owner.getJobId()==parameters.getJobId()){owner=null;CloudSyncEngine.cancel();}
        return (parameters.getJobId()==CloudSyncScheduler.MANUAL||CloudSyncScheduler.validAutomatic(this,parameters))&&CloudSyncScheduler.ready(this);
    }
}
