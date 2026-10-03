package com.oplus.aiunit.vision;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.watch.watchface.api.IWatchFaceAidl;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.oplus.health.apiprovider.ClientManager;

/* JADX INFO: loaded from: classes19.dex */
public class q9l {
    public static final String WATCH_FACE_AIDL = "watch_face_aidl";

    public static Proto$DeviceInfo a() {
        IWatchFaceAidl iWatchFaceAidlB = b();
        if (iWatchFaceAidlB != null) {
            try {
                byte[] currentDeviceInfo = iWatchFaceAidlB.getCurrentDeviceInfo();
                if (currentDeviceInfo != null) {
                    return Proto$DeviceInfo.parseFrom(currentDeviceInfo);
                }
                ltl.i("WatchFaceApiManager", "[getCurrentDeviceInfo] --> bytes == null");
                return null;
            } catch (RemoteException | InvalidProtocolBufferException e2) {
                ltl.i("WatchFaceApiManager", "[getCurrentDeviceInfo] --> " + e2.getMessage());
            }
        }
        return null;
    }

    public static IWatchFaceAidl b() {
        return (IWatchFaceAidl) ClientManager.getInstance().getBuildService(WATCH_FACE_AIDL, new ClientManager.a() { // from class: com.oplus.aiunit.vision.p9l
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return IWatchFaceAidl.Stub.asInterface(iBinder);
            }
        });
    }

    public static String c(int i) {
        IWatchFaceAidl iWatchFaceAidlB = b();
        if (iWatchFaceAidlB == null) {
            return null;
        }
        try {
            return iWatchFaceAidlB.getWatchFaceTempPath(i);
        } catch (RemoteException e2) {
            ltl.i("WatchFaceApiManager", "[getCurrentDeviceInfo] --> " + e2.getMessage());
            return null;
        }
    }
}
