package com.heytap.device.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.heytap.device.aidl.IDataSyncAlarm;
import com.heytap.health.base.base.BaseService;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gx4;

/* JADX INFO: loaded from: classes15.dex */
public class DeviceDataSyncAlarmService extends BaseService {
    public final IDataSyncAlarm.Stub i = new IDataSyncAlarm.Stub() { // from class: com.heytap.device.service.DeviceDataSyncAlarmService.1
        @Override // com.heytap.device.aidl.IDataSyncAlarm
        public void updateDataSyncAlarm() throws RemoteException {
            gx4.a().b();
        }
    };

    public class a implements ServiceConnection {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: com.heytap.device.service.DeviceDataSyncAlarmService$a$a, reason: collision with other inner class name */
        public class RunnableC0281a implements Runnable {
            public final /* synthetic */ IBinder i;

            public RunnableC0281a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IDataSyncAlarm.Stub.asInterface(this.i).updateDataSyncAlarm();
                } catch (Throwable th) {
                    a7b.b("Data-Sync", "Call update data sync alarm fail, error=" + th);
                }
            }
        }

        public a(Context context) {
            this.i = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ThreadUtils.doInBackground(new RunnableC0281a(iBinder));
            this.i.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static void b(Context context) {
        context.bindService(new Intent(context, (Class<?>) DeviceDataSyncAlarmService.class), new a(context), 1);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.i;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
