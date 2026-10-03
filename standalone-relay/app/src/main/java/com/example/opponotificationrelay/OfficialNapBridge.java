package com.example.opponotificationrelay;

import android.content.*;
import android.content.pm.*;
import android.os.*;
import java.io.IOException;
import java.lang.reflect.*;

/** 官方UID内借用已发布服务，官方自行保存与云同步；不启动或绑定服务。 */
final class OfficialNapBridge {
    static final String PKG="com.heytap.health",SERVICE="com.heytap.databaseengineservice.SportHealthDataService";
    static final String POOL="com.heytap.databaseengine.IBinderPool",HEALTH="com.heytap.databaseengine.IHealthManager";
    static final String CALLBACK="com.heytap.databaseengine.callback.IDataOperateListener";
    final Object api;final Class<?> model,listener;final Method set;final int uid;
    OfficialNapBridge(IBinder binder,int uid)throws Exception {
        this.uid=uid;
        if(!HEALTH.equals(descriptor(binder)))throw new IOException("HEALTH_MISMATCH");
        Class<?> stub=Class.forName(HEALTH+"$Stub");api=stub.getMethod("asInterface",IBinder.class).invoke(null,binder);
        model=Class.forName("com.heytap.databaseengine.model.UserPreference");
        listener=Class.forName(CALLBACK);
        set=Class.forName(HEALTH).getMethod("setUserPreference",model,boolean.class,listener);
    }
    static String descriptor(IBinder binder)throws Exception {
        Parcel data=Parcel.obtain(),reply=Parcel.obtain();
        try {
            if(!binder.transact(IBinder.INTERFACE_TRANSACTION,data,reply,0))throw new IOException("INTERFACE_FAILED");
            return reply.readString();
        } finally {data.recycle();reply.recycle();}
    }
    static OfficialNapBridge connect(int uid)throws Exception {
        if(android.os.Process.myUid()!=uid)throw new IOException("OFFICIAL_UID_REQUIRED");
        if(Looper.getMainLooper()==null)Looper.prepareMainLooper();
        Class<?> at=Class.forName("android.app.ActivityThread");Object thread=at.getMethod("systemMain").invoke(null);
        Context system=(Context)at.getMethod("getSystemContext").invoke(thread);
        Context context=system.createPackageContext(PKG,Context.CONTEXT_IGNORE_SECURITY);
        PackageInfo info=context.getPackageManager().getPackageInfo(PKG,PackageManager.MATCH_DISABLED_COMPONENTS);
        if(info.applicationInfo==null || info.applicationInfo.uid!=uid || info.getLongVersionCode()!=6060700 ||
            !"6.6.7_097c6ef_260803".equals(info.versionName))throw new IOException("OFFICIAL_CHANGED");
        if(!info.applicationInfo.enabled)throw new IOException("OFFICIAL_DISABLED");
        ServiceInfo service=context.getPackageManager().getServiceInfo(new ComponentName(PKG,SERVICE),0);
        if(!service.enabled || !service.exported || !service.processName.equals(PKG+":SportDaemonService"))throw new IOException("SERVICE_CHANGED");
        Object manager=Class.forName("android.app.ActivityManager").getMethod("getService").invoke(null);
        Method peek=Class.forName("android.app.IActivityManager").getMethod("peekService",Intent.class,String.class,String.class);
        Intent intent=new Intent("com.heytap.health.dataservice").setComponent(new ComponentName(PKG,SERVICE));
        IBinder pool=NapWritePolicy.awaitPublished(new NapWritePolicy.Discovery<IBinder>() {
            public IBinder peek()throws Exception{return (IBinder)peek.invoke(manager,intent,null,PKG);}
            public long now(){return SystemClock.elapsedRealtime();}
            public void pause()throws Exception{Thread.sleep(250);}
        });
        if(!POOL.equals(descriptor(pool)))throw new IOException("POOL_MISMATCH");
        Parcel data=Parcel.obtain(),reply=Parcel.obtain();IBinder health;
        try {
            data.writeInterfaceToken(POOL);data.writeString("IHealthManager");
            if(!pool.transact(1,data,reply,0))throw new IOException("QUERY_BINDER_FAILED");
            reply.readException();health=reply.readStrongBinder();
        } finally {data.recycle();reply.recycle();}
        if(health==null)throw new IOException("NULL_HEALTH_BINDER");
        return new OfficialNapBridge(health,uid);
    }
    NapWritePolicy.Ack send(String account,String key,String value)throws Exception {
        if(!java.util.Arrays.asList(RootOfficialSettingsReader.NAP).contains(key))throw new IOException("NAP_KEY");
        Object preference=model.getConstructor().newInstance();
        model.getMethod("setSsoid",String.class).invoke(preference,account);
        model.getMethod("setKey",String.class).invoke(preference,key);
        model.getMethod("setValue",String.class).invoke(preference,value);
        model.getMethod("setSyncStatus",int.class).invoke(preference,0);
        model.getMethod("setModifiedTime",long.class).invoke(preference,System.currentTimeMillis());
        model.getMethod("setPushToCloud",boolean.class).invoke(preference,true);
        final Reply callback=new Reply(uid);
        Object adapter=Proxy.newProxyInstance(listener.getClassLoader(),new Class<?>[]{listener},(proxy,method,args)->{
            if(method.getName().equals("asBinder"))return callback;
            if(method.getName().equals("toString"))return "NapSaveCallback";
            if(method.getName().equals("hashCode"))return System.identityHashCode(proxy);
            if(method.getName().equals("equals"))return proxy==args[0];
            throw new IllegalStateException("CALLBACK_METHOD");
        });
        set.invoke(api,preference,false,adapter);return callback;
    }
    static final class Reply extends Binder implements NapWritePolicy.Ack {
        final int uid;private volatile Integer status;
        Reply(int uid){this.uid=uid;}
        public Integer status(){return status;}
        @Override protected boolean onTransact(int code,Parcel data,Parcel reply,int flags)throws RemoteException {
            if(Binder.getCallingUid()!=uid)throw new SecurityException("CALLBACK_UID");
            if(code==INTERFACE_TRANSACTION){reply.writeString(CALLBACK);return true;}
            if(code!=1)return super.onTransact(code,data,reply,flags);
            data.enforceInterface(CALLBACK);
            if(data.dataAvail()<8 || data.dataAvail()>16384)throw new SecurityException("CALLBACK_SIZE");
            int result=data.readInt(),count=data.readInt();
            // setUserPreference returns only the official empty result list; never deserialize objects.
            if((count!=0 && count!=-1) || data.dataAvail()!=0)throw new SecurityException("CALLBACK_FORMAT");
            synchronized(this){if(status!=null)throw new SecurityException("CALLBACK_DUPLICATE");status=result;}
            if(reply!=null)reply.writeNoException();return true;
        }
    }
}
