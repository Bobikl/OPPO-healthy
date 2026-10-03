package com.example.opponotificationrelay;

import android.content.*;
import android.content.pm.*;
import android.os.*;
import java.io.IOException;
import java.util.List;

/** 用户确认写回时临时绑定；业务调用仍由官方 UID 的短命任务执行。 */
final class OfficialDataLease {
    private static final String PKG="com.heytap.health";
    private static final ComponentName COMPONENT=new ComponentName(PKG,"com.heytap.databaseengineservice.SportHealthDataService");
    static ServiceLease<IBinder> open(Context supplied,int expectedUid)throws Exception {
        if(Looper.myLooper()==Looper.getMainLooper())throw new IOException("LEASE_MAIN_THREAD");
        final Context context=supplied.getApplicationContext();
        final Intent intent=new Intent("com.heytap.health.dataservice").setPackage(PKG).putExtra("type","IHealthManager");
        List<ResolveInfo> matches=context.getPackageManager().queryIntentServices(intent,0);
        if(matches.size()!=1)throw new IOException("LEASE_SERVICE_CHANGED");
        ServiceInfo info=matches.get(0).serviceInfo;
        if(info==null || info.applicationInfo==null || info.applicationInfo.uid!=expectedUid ||
           !info.enabled || !info.exported || !info.packageName.equals(COMPONENT.getPackageName()) ||
           !info.name.equals(COMPONENT.getClassName()) || !info.processName.equals(PKG+":SportDaemonService"))
            throw new IOException("LEASE_SERVICE_CHANGED");
        try {
            return ServiceLease.acquire(new ServiceLease.Connector<IBinder>() {
                boolean accepted;
                ServiceConnection connection;
                public boolean bind(ServiceLease.Callback<IBinder> callback)throws Exception {
                    connection=new ServiceConnection() {
                        public void onServiceConnected(ComponentName name,IBinder binder) {
                            if(!COMPONENT.equals(name))callback.failed("LEASE_SERVICE_CHANGED");
                            else callback.connected(binder);
                        }
                        public void onServiceDisconnected(ComponentName name){callback.failed("LEASE_DISCONNECTED");}
                        public void onBindingDied(ComponentName name){callback.failed("LEASE_BINDING_DIED");}
                        public void onNullBinding(ComponentName name){callback.failed("LEASE_NULL_BINDING");}
                    };
                    try {accepted=context.bindService(intent,connection,Context.BIND_AUTO_CREATE);return accepted;}
                    catch(RuntimeException failure){throw new IOException("LEASE_BIND_FAILED",failure);}
                }
                public void unbind()throws Exception {
                    try {
                        try{context.unbindService(connection);}
                        catch(IllegalArgumentException failure){if(accepted)throw failure;}
                        FileLogger.i("SettingsWrite","dataServiceLease=RELEASED");
                    } catch(RuntimeException failure) {
                        FileLogger.w("SettingsWrite","dataServiceLease=RELEASE_FAILED");
                        throw new IOException("LEASE_RELEASE_FAILED",failure);
                    }
                }
            },8000);
        } catch(InterruptedException interrupted) {
            Thread.currentThread().interrupt();throw new IOException("LEASE_CANCELLED",interrupted);
        }
    }
}
