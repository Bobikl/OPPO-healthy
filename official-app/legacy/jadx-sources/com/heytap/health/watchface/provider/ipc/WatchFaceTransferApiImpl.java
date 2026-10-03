package com.heytap.health.watchface.provider.ipc;

import android.os.RemoteException;
import com.heytap.health.watch.watchface.api.IWatchFaceAidl;
import com.oplus.aiunit.vision.i11;
import com.oplus.aiunit.vision.kvi;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.ntl;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes19.dex */
public class WatchFaceTransferApiImpl {
    public static volatile WatchFaceTransferApiImpl b;
    public final IWatchFaceAidl.Stub a = new IWatchFaceAidl.Stub() { // from class: com.heytap.health.watchface.provider.ipc.WatchFaceTransferApiImpl.1
        @Override // com.heytap.health.watch.watchface.api.IWatchFaceAidl
        public byte[] getCurrentDeviceInfo() throws RemoteException {
            i11 i11VarF = ntl.m().f();
            if (i11VarF != null) {
                return i11VarF.h().toByteArray();
            }
            ltl.i("WatchFaceTransferApiImpl", "[getCurrentDeviceInfo] currentDataManager=null");
            return null;
        }

        @Override // com.heytap.health.watch.watchface.api.IWatchFaceAidl
        public String getWatchFaceTempPath(int i) throws RemoteException {
            i11 i11VarF = ntl.m().f();
            if (i11VarF == null) {
                ltl.i("WatchFaceTransferApiImpl", "[getWatchFaceTempPath] currentDataManager=null");
                return null;
            }
            kvi kviVarM = i11VarF.m();
            if (kviVarM != null && i == 7) {
                return kviVarM.P();
            }
            return null;
        }
    };

    public static WatchFaceTransferApiImpl c() {
        if (b == null) {
            synchronized (WatchFaceTransferApiImpl.class) {
                if (b == null) {
                    b = new WatchFaceTransferApiImpl();
                }
            }
        }
        return b;
    }

    public void a(PrintWriter printWriter, String[] strArr) {
    }

    public IWatchFaceAidl.Stub b() {
        return this.a;
    }
}
