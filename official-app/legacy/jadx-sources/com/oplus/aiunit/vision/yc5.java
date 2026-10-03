package com.oplus.aiunit.vision;

import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.device.aidl.IDataSync;
import com.heytap.device.aidl.SyncDataParam;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.health.apiprovider.ClientManager;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes15.dex */
public class yc5 {
    public static final String ACTION_BROADCAST_DATA_SYNC_STATE = "com.heytap.device.ACTION_DATA_SYNC_STATE";
    public static final String DATA_SYNC_AIDL = "device_data_sync_api";
    public static final String KEY_DATA_SYNC_STATE = "data_sync_state";
    public static final ExecutorService a = zq8.a("DataSyncApi");

    public static IDataSync c() {
        return (IDataSync) ClientManager.getInstance().getBuildService(DATA_SYNC_AIDL, new ClientManager.a() { // from class: com.oplus.aiunit.vision.wc5
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return IDataSync.Stub.asInterface(iBinder);
            }
        });
    }

    public static boolean d() {
        IDataSync iDataSyncC = c();
        if (iDataSyncC == null) {
            a7b.b("DeviceDataSyncApi", " get sport relative data in syncing service is null ");
            return false;
        }
        try {
            return iDataSyncC.isSportRelativeDataInSyncing();
        } catch (RemoteException e2) {
            a7b.b("DeviceDataSyncApi", "On get sport relative data in syncing  error --> " + e2.getMessage());
            return false;
        }
    }

    public static /* synthetic */ void e() {
        IDataSync iDataSyncC = c();
        if (iDataSyncC == null) {
            a7b.b("DeviceDataSyncApi", " get sync calorie and step to devices service is null ");
            return;
        }
        try {
            iDataSyncC.syncCalorieAndStepToDevices();
        } catch (RemoteException e2) {
            a7b.b("DeviceDataSyncApi", "On sync calorie and step to devices error --> " + e2.getMessage());
        }
    }

    public static /* synthetic */ void f(SyncDataParam syncDataParam) {
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        boolean z = userDeviceInfoJ == null;
        a7b.f("DeviceDataSyncApi", "Call sync data, param=" + syncDataParam.toString());
        if (z) {
            a7b.f("DeviceDataSyncApi", " Current connected device is null ");
            return;
        }
        if (!userDeviceInfoJ.isConnect()) {
            a7b.f("DeviceDataSyncApi", " the device is disconnect ");
            return;
        }
        IDataSync iDataSyncC = c();
        if (iDataSyncC == null) {
            a7b.b("DeviceDataSyncApi", " get data sync service is null ");
            return;
        }
        try {
            iDataSyncC.syncByParam(syncDataParam);
        } catch (RemoteException e2) {
            a7b.b("DeviceDataSyncApi", "On call data sync error --> " + e2.getMessage());
        }
    }

    public static void g(String str) {
        IDataSync iDataSyncC = c();
        if (iDataSyncC == null) {
            a7b.b("DeviceDataSyncApi", " get on device connected service is null ");
            return;
        }
        try {
            iDataSyncC.onDeviceConnected(str);
        } catch (RemoteException e2) {
            a7b.b("DeviceDataSyncApi", "On device connected  error --> " + e2.getMessage());
        }
    }

    public static void h(String str) {
        IDataSync iDataSyncC = c();
        if (iDataSyncC == null) {
            a7b.b("DeviceDataSyncApi", " get on device disconnect service is null ");
            return;
        }
        try {
            iDataSyncC.onDeviceDisconnect(str);
        } catch (RemoteException e2) {
            a7b.b("DeviceDataSyncApi", "On device disconnect  error --> " + e2.getMessage());
        }
    }

    public static void i(int i, int i2, boolean z, int i3) {
        SyncDataParam syncDataParam = new SyncDataParam();
        syncDataParam.setSyncType(1);
        syncDataParam.setStartTime(i);
        syncDataParam.setEndTime(i2);
        syncDataParam.setAutoSync(z);
        syncDataParam.setTriggerType(i3);
        m(syncDataParam);
    }

    public static void j(boolean z, int i) {
        i(-1, -1, z, i);
    }

    public static void k(int i, int... iArr) {
        SyncDataParam syncDataParam = new SyncDataParam();
        syncDataParam.setSyncType(2);
        syncDataParam.setDataTypeList(iArr);
        syncDataParam.setTriggerType(i);
        m(syncDataParam);
    }

    public static void l() {
        a.execute(new Runnable() { // from class: com.oplus.aiunit.vision.xc5
            @Override // java.lang.Runnable
            public final void run() {
                yc5.e();
            }
        });
    }

    public static void m(final SyncDataParam syncDataParam) {
        a.execute(new Runnable() { // from class: com.oplus.aiunit.vision.vc5
            @Override // java.lang.Runnable
            public final void run() {
                yc5.f(syncDataParam);
            }
        });
    }
}
