package com.example.opponotificationrelay;
import android.app.job.*;
import android.os.*;
public final class CloudSyncJobService extends JobService {
    private final Handler main=new Handler(Looper.getMainLooper());private JobParameters owner;
    @Override public boolean onStartJob(JobParameters parameters){
        if(owner!=null||CloudSyncEngine.running()){main.post(()->jobFinished(parameters,true));return true;}
        owner=parameters;
        boolean started=CloudSyncEngine.start(this,retry->main.post(()->{
            if(owner!=parameters)return;
            owner=null;jobFinished(parameters,retry);
            if(!retry)CloudSyncScheduler.schedule(this,false);
        }));
        if(!started){owner=null;main.post(()->jobFinished(parameters,true));}
        return true;
    }
    @Override public boolean onStopJob(JobParameters parameters){
        if(owner!=null&&owner.getJobId()==parameters.getJobId()){owner=null;CloudSyncEngine.cancel();}
        return CloudSyncState.enabled(this)&&CloudSyncState.any(this)&&HealthAccountStore.exists(this);
    }
}
