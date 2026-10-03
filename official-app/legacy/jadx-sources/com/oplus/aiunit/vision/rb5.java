package com.oplus.aiunit.vision;

import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.heytap.health.settings.band.bean.DeviceVersionBean;
import heytap.health.device.protocol.ota.OTAProto$Ota;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes17.dex */
public class rb5 {
    public ConcurrentSkipListSet<hh5> a;
    public ConcurrentSkipListSet<WeakReference<jq5>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConcurrentSkipListSet<WeakReference<hjk>> f16148c;
    public ConcurrentSkipListSet<kk5> d;

    public static class a {
        public static final rb5 INSTANCE = new rb5();
    }

    public static rb5 j() {
        return a.INSTANCE;
    }

    public static /* synthetic */ int k(hh5 hh5Var, hh5 hh5Var2) {
        return hh5Var == hh5Var2 ? 0 : 1;
    }

    public static /* synthetic */ int l(WeakReference weakReference, WeakReference weakReference2) {
        return weakReference.get() == weakReference2.get() ? 0 : 1;
    }

    public static /* synthetic */ int m(WeakReference weakReference, WeakReference weakReference2) {
        return weakReference.get() == weakReference2.get() ? 0 : 1;
    }

    public static /* synthetic */ int n(kk5 kk5Var, kk5 kk5Var2) {
        return kk5Var == kk5Var2 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(String str, OTAProto$Ota oTAProto$Ota) {
        Iterator<kk5> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().C5(str, oTAProto$Ota);
        }
    }

    public void f(hh5 hh5Var) {
        if (hh5Var == null) {
            jw0.d("DeviceCallbackCenter", "[addInfoCallback] callback = null.");
            return;
        }
        this.a.add(hh5Var);
        jw0.a("DeviceCallbackCenter", "addInfoCallback size = " + this.a.size() + "," + hh5Var.toString());
    }

    public void g(kk5 kk5Var) {
        this.d.add(kk5Var);
    }

    public void h(hjk hjkVar) {
        if (hjkVar == null) {
            jw0.d("DeviceCallbackCenter", "[addUpdateCallback] callback = null.");
            return;
        }
        this.f16148c.add(new WeakReference<>(hjkVar));
        jw0.a("DeviceCallbackCenter", "[addUpdateCallback] size = " + this.f16148c.size());
    }

    public void i(jq5 jq5Var) {
        if (jq5Var == null) {
            jw0.d("DeviceCallbackCenter", "[addVersionCallback] callback = null.");
            return;
        }
        this.b.add(new WeakReference<>(jq5Var));
        jw0.a("DeviceCallbackCenter", "addVersionCallback size = " + this.b.size() + "," + jq5Var.toString());
    }

    public void p(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo) {
        for (hh5 hh5Var : this.a) {
            if (hh5Var != null) {
                hh5Var.a(dMProto$ConnectDeviceInfo);
            }
            jw0.a("DeviceCallbackCenter", "notifyInfoCallBack");
        }
        this.a.clear();
    }

    public void q(final String str, final OTAProto$Ota oTAProto$Ota) {
        dh8.b(new Runnable() { // from class: com.oplus.aiunit.vision.nb5
            @Override // java.lang.Runnable
            public final void run() {
                this.i.o(str, oTAProto$Ota);
            }
        });
    }

    public void r(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo, DeviceVersionBean deviceVersionBean) {
        for (WeakReference<jq5> weakReference : this.b) {
            if (weakReference.get() != null) {
                weakReference.get().a(dMProto$ConnectDeviceInfo, deviceVersionBean);
                jw0.a("DeviceCallbackCenter", "notifyVersionCallBack==" + weakReference.get());
            }
        }
        this.b.clear();
    }

    public void s(Float f) {
        for (WeakReference<hjk> weakReference : this.f16148c) {
            if (weakReference.get() != null) {
                weakReference.get().a(f.floatValue());
            } else {
                jw0.a("DeviceCallbackCenter", "onDownlaodProgress is null");
            }
        }
    }

    public void t(int i) {
        for (WeakReference<hjk> weakReference : this.f16148c) {
            if (weakReference.get() != null) {
                weakReference.get().b(i);
            } else {
                jw0.a("DeviceCallbackCenter", "onSendFileProgress is null");
            }
        }
    }

    public void u(kk5 kk5Var) {
        this.d.remove(kk5Var);
    }

    public void v(hjk hjkVar) {
        for (WeakReference<hjk> weakReference : this.f16148c) {
            if (hjkVar == weakReference.get()) {
                this.f16148c.remove(weakReference);
            } else {
                jw0.a("DeviceCallbackCenter", "removeUpdateListener is null");
            }
        }
    }

    public rb5() {
        this.a = new ConcurrentSkipListSet<>(new Comparator() { // from class: com.oplus.aiunit.vision.ib5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return rb5.k((hh5) obj, (hh5) obj2);
            }
        });
        this.b = new ConcurrentSkipListSet<>(new Comparator() { // from class: com.oplus.aiunit.vision.kb5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return rb5.l((WeakReference) obj, (WeakReference) obj2);
            }
        });
        this.f16148c = new ConcurrentSkipListSet<>(new Comparator() { // from class: com.oplus.aiunit.vision.lb5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return rb5.m((WeakReference) obj, (WeakReference) obj2);
            }
        });
        this.d = new ConcurrentSkipListSet<>(new Comparator() { // from class: com.oplus.aiunit.vision.mb5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return rb5.n((kk5) obj, (kk5) obj2);
            }
        });
    }
}
