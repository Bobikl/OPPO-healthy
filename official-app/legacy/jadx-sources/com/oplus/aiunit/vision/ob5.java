package com.oplus.aiunit.vision;

import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes15.dex */
public class ob5 {
    public final ConcurrentSkipListSet<fh5> a;

    public static class a {
        public static final ob5 INSTANCE = new ob5();
    }

    public static ob5 c() {
        return a.INSTANCE;
    }

    public static /* synthetic */ int d(fh5 fh5Var, fh5 fh5Var2) {
        return fh5Var == fh5Var2 ? 0 : 1;
    }

    public void b(fh5 fh5Var) {
        if (fh5Var == null) {
            kw0.d("DeviceCallbackCenter", "[addInfoCallback] callback = null.");
            return;
        }
        this.a.add(fh5Var);
        kw0.a("DeviceCallbackCenter", "addInfoCallback size = " + this.a.size() + "," + fh5Var);
    }

    public void e(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo) {
        for (fh5 fh5Var : this.a) {
            if (fh5Var != null) {
                fh5Var.a(dMProto$ConnectDeviceInfo);
            }
            kw0.a("DeviceCallbackCenter", "notifyInfoCallBack");
        }
        this.a.clear();
    }

    public ob5() {
        this.a = new ConcurrentSkipListSet<>(new Comparator() { // from class: com.oplus.aiunit.vision.jb5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ob5.d((fh5) obj, (fh5) obj2);
            }
        });
    }
}
