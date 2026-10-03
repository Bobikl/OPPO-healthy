package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.accessory.utils.XmlReader;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes5.dex */
public class oy3 {
    public final Context a;
    public DeviceInfo b;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<y2c> f15096c = new CopyOnWriteArraySet();
    public Map<String, x95> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, ow9> f15097e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public uj5 f15098j = new a();
    public ow9.a k = new b();

    public class a implements uj5 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.uj5
        public void a(x95 x95Var, int i) {
            wil.a("ConnectionModule", "onDisconnected: device=" + x95Var + " reason=" + i);
            ow9 ow9VarP = oy3.this.p(x95Var.l());
            if (ow9VarP != null) {
                ow9VarP.a(x95Var, i);
            } else {
                oy3.this.s(x95Var, i);
            }
        }

        @Override // com.oplus.aiunit.vision.uj5
        public void b(x95 x95Var) {
            wil.a("ConnectionModule", "onConnected: device=" + x95Var);
            ow9 ow9VarP = oy3.this.p(x95Var.l());
            if (ow9VarP != null) {
                ow9VarP.b(x95Var);
            } else {
                oy3.this.q(x95Var);
            }
        }

        @Override // com.oplus.aiunit.vision.uj5
        public void c(x95 x95Var) {
            wil.a("ConnectionModule", "onConnecting: device=" + x95Var);
            oy3.this.r(x95Var);
        }

        @Override // com.oplus.aiunit.vision.uj5
        public void d(x95 x95Var, byte[] bArr) {
            Iterator it = oy3.this.f15096c.iterator();
            while (it.hasNext()) {
                ((y2c) it.next()).b(x95Var.l(), bArr);
            }
        }

        @Override // com.oplus.aiunit.vision.uj5
        public void e(x95 x95Var, byte[] bArr) {
            Iterator it = oy3.this.f15096c.iterator();
            while (it.hasNext()) {
                ((y2c) it.next()).c(x95Var.l(), bArr);
            }
        }
    }

    public class b implements ow9.a {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ow9.a
        public void a(x95 x95Var, int i) {
            oy3.this.s(x95Var, i);
        }

        @Override // com.oplus.aiunit.vision.ow9.a
        public void b(x95 x95Var) {
            oy3.this.q(x95Var);
        }
    }

    public oy3(Context context, @NonNull DeviceInfo deviceInfo) {
        this.a = context.getApplicationContext();
        this.b = deviceInfo;
    }

    public final void A(ModuleInfo moduleInfo, int i) {
        if (moduleInfo != null) {
            moduleInfo.setState(i);
        }
    }

    public synchronized void B(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        if (!k(deviceInfo.getMainModuleInfo(), this.b.getMainModuleInfo())) {
            f(this.b.getMainModuleInfo());
            this.b.setMainModuleInfo(deviceInfo.getMainModuleInfo());
            deviceInfo.getMainModuleInfo().setMainModule(true);
        }
        if (!k(deviceInfo.getStubModuleInfo(), this.b.getStubModuleInfo())) {
            f(this.b.getStubModuleInfo());
            this.b.setStubModuleInfo(deviceInfo.getStubModuleInfo());
            if (deviceInfo.getStubModuleInfo() != null) {
                deviceInfo.getStubModuleInfo().setMainModule(false);
            }
        }
    }

    public final synchronized void f(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return;
        }
        x95 x95VarN = n(moduleInfo);
        if (x95VarN != null) {
            x95VarN.w();
            this.d.remove(moduleInfo.getKey());
        }
        ow9 ow9VarP = p(moduleInfo);
        if (ow9VarP != null) {
            ow9VarP.release();
            this.f15097e.remove(moduleInfo.getKey());
        }
    }

    public void g() {
        this.i = false;
        u(this.b.getMainModuleInfo());
        u(this.b.getStubModuleInfo());
        if (l() == 2) {
            wil.a("ConnectionModule", "connect: is connected ignore");
        } else {
            this.g = h(this.b.getStubModuleInfo());
            this.f = h(this.b.getMainModuleInfo());
        }
    }

    public final synchronized boolean h(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return false;
        }
        wil.a("ConnectionModule", "connect: moduleInfo = " + moduleInfo);
        x95 x95VarN = n(moduleInfo);
        p(moduleInfo);
        if (x95VarN == null) {
            wil.a("ConnectionModule", "connect: device == null");
            return false;
        }
        x95VarN.f18542n = true;
        x95VarN.g();
        return true;
    }

    public void i() {
        this.i = true;
        this.f = false;
        this.g = false;
        j(this.b.getMainModuleInfo());
        j(this.b.getStubModuleInfo());
    }

    public final void j(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return;
        }
        wil.a("ConnectionModule", "disconnect: moduleInfo = " + moduleInfo);
        x95 x95VarN = n(moduleInfo);
        ow9 ow9VarP = p(moduleInfo);
        if (ow9VarP != null) {
            ow9VarP.stop();
        }
        if (x95VarN != null) {
            x95VarN.h();
        }
    }

    public final boolean k(ModuleInfo moduleInfo, ModuleInfo moduleInfo2) {
        if (moduleInfo == null || moduleInfo2 == null) {
            return false;
        }
        return moduleInfo.equals(moduleInfo2);
    }

    public int l() {
        int iM = m(this.b.getMainModuleInfo());
        int iM2 = m(this.b.getStubModuleInfo());
        int i = 2;
        if (iM != 2 && iM2 != 2) {
            i = 1;
            if (iM != 1 && iM2 != 1) {
                i = 4;
                if (iM != 4 && iM2 != 4) {
                    return 3;
                }
            }
        }
        return i;
    }

    public final int m(ModuleInfo moduleInfo) {
        x95 x95VarN = n(moduleInfo);
        if (x95VarN != null) {
            return x95VarN.k();
        }
        return 3;
    }

    public final synchronized x95 n(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        return this.d.get(moduleInfo.getKey());
    }

    public DeviceInfo o() {
        return this.b;
    }

    public final ow9 p(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        String nodeId = moduleInfo.getNodeId();
        ow9 n55Var = this.f15097e.get(moduleInfo.getKey());
        if (n55Var == null && t()) {
            n55Var = jx3.c(moduleInfo.getConnectionType()) ? new n55(alf.BR, 0, true, nodeId) : new n55(XmlReader.TRANSPORT_BLE, this.b.getBleRetryCount(), false, nodeId);
            this.f15097e.put(moduleInfo.getKey(), n55Var);
        }
        return n55Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x0098 A[LOOP:0: B:19:0x0092->B:21:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a6 A[ORIG_RETURN, RETURN] */
    public final void q(x95 x95Var) {
        boolean z;
        ow9 ow9VarP;
        Iterator<y2c> it;
        wil.a("ConnectionModule", "handleConnected: mIsLastStateConnected =" + x95Var.m + ",mIsActiveConnect = " + x95Var.f18542n);
        this.f = false;
        this.g = false;
        if (!k(x95Var.l(), this.b.getMainModuleInfo())) {
            if (k(x95Var.l(), this.b.getStubModuleInfo())) {
                A(this.b.getStubModuleInfo(), 2);
                j(this.b.getMainModuleInfo());
            } else {
                z = false;
            }
            ow9VarP = p(x95Var.l());
            if (ow9VarP != null) {
                ow9VarP.stop();
            }
            if (z) {
                if (x95Var.f18542n && x95Var.m) {
                    return;
                }
                x95Var.f18542n = false;
                x95Var.m = true;
                it = this.f15096c.iterator();
                while (it.hasNext()) {
                    it.next().a(o());
                }
            }
        }
        A(this.b.getMainModuleInfo(), 2);
        j(this.b.getStubModuleInfo());
        z = true;
        ow9VarP = p(x95Var.l());
        if (ow9VarP != null) {
            ow9VarP.stop();
        }
        if (z) {
            if (x95Var.f18542n) {
            }
            x95Var.f18542n = false;
            x95Var.m = true;
            it = this.f15096c.iterator();
            while (it.hasNext()) {
                it.next().a(o());
            }
        }
    }

    public final void r(x95 x95Var) {
        wil.a("ConnectionModule", "handleConnecting: mIsLastStateConnected =" + x95Var.m + ",mIsActiveConnect = " + x95Var.f18542n);
        if (k(x95Var.l(), this.b.getMainModuleInfo())) {
            A(this.b.getMainModuleInfo(), 1);
        } else if (k(x95Var.l(), this.b.getStubModuleInfo())) {
            A(this.b.getStubModuleInfo(), 1);
        }
        if (x95Var.f18542n) {
            Iterator<y2c> it = this.f15096c.iterator();
            while (it.hasNext()) {
                it.next().e(o());
            }
        }
    }

    public final void s(x95 x95Var, int i) {
        ModuleInfo mainModuleInfo;
        x95 x95VarN;
        wil.a("ConnectionModule", "handleDisconnected: mIsLastStateConnected =" + x95Var.m + ",mIsActiveConnect = " + x95Var.f18542n);
        int iM = 3;
        if (k(x95Var.l(), this.b.getMainModuleInfo())) {
            this.f = false;
            A(this.b.getMainModuleInfo(), 3);
            iM = m(this.b.getStubModuleInfo());
            mainModuleInfo = this.b.getStubModuleInfo();
        } else if (k(x95Var.l(), this.b.getStubModuleInfo())) {
            this.g = false;
            A(this.b.getStubModuleInfo(), 3);
            iM = m(this.b.getMainModuleInfo());
            mainModuleInfo = this.b.getMainModuleInfo();
        } else {
            mainModuleInfo = null;
        }
        wil.a("ConnectionModule", "handleDisconnected: otherModuleState " + iM + " ,mIsActiveDisconnect " + this.i);
        if (iM == 2) {
            x95Var.A(true);
            return;
        }
        ow9 ow9VarP = p(x95Var.l());
        if (ow9VarP != null && t()) {
            ow9VarP.start();
        }
        if (!this.i && (x95VarN = n(mainModuleInfo)) != null && x95VarN.r()) {
            x95VarN.A(false);
            ow9 ow9VarP2 = p(mainModuleInfo);
            wil.a("ConnectionModule", "handleDisconnected: otherRetryStrategy =" + ow9VarP2 + ",otherModule = " + mainModuleInfo);
            if (ow9VarP2 != null && t()) {
                ow9VarP2.start();
            }
        }
        if (this.f || this.g) {
            return;
        }
        if (x95Var.f18542n || x95Var.m) {
            x95Var.f18542n = false;
            x95Var.m = false;
            Iterator<y2c> it = this.f15096c.iterator();
            while (it.hasNext()) {
                it.next().d(o(), i);
            }
        }
    }

    public boolean t() {
        return this.h;
    }

    public final synchronized void u(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return;
        }
        wil.a("ConnectionModule", "prepareConnect: moduleInfo = " + moduleInfo);
        if (!BluetoothAdapter.checkBluetoothAddress(moduleInfo.getMacAddress())) {
            wil.a("ConnectionModule", "prepareConnect: error mac = " + moduleInfo.getMacAddress() + " , deviceInfo = " + this.b);
            return;
        }
        x95 x95VarN = n(moduleInfo);
        if (x95VarN == null) {
            if (jx3.b(moduleInfo.getConnectionType())) {
                x95VarN = new r38(this.a, moduleInfo, this.b.getBleConnectTimeout());
                x95VarN.v(this.f15098j);
                this.d.put(moduleInfo.getKey(), x95VarN);
            } else if (jx3.c(moduleInfo.getConnectionType())) {
                x95VarN = new pq0(this.a, moduleInfo);
                x95VarN.v(this.f15098j);
                this.d.put(moduleInfo.getKey(), x95VarN);
            }
        }
        ow9 ow9VarP = p(moduleInfo);
        if (ow9VarP != null) {
            ow9VarP.stop();
            ow9VarP.c(x95VarN);
            ow9VarP.setOnConnectChangeHoldListener(this.k);
        }
    }

    public void v(y2c y2cVar) {
        this.f15096c.add(y2cVar);
    }

    public synchronized void w() {
        this.f15096c.clear();
        Iterator<Map.Entry<String, x95>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().w();
        }
        this.d.clear();
    }

    public int x(ModuleInfo moduleInfo, byte[] bArr, xs2<Void> xs2Var) {
        x95 x95VarN = n(moduleInfo);
        if (x95VarN != null) {
            return x95VarN.y(bArr, xs2Var);
        }
        return 200;
    }

    public int y(ModuleInfo moduleInfo, byte[] bArr, xs2<Void> xs2Var) {
        x95 x95VarN = n(moduleInfo);
        if (x95VarN != null) {
            return x95VarN.z(bArr, xs2Var);
        }
        return 200;
    }

    public synchronized void z(boolean z) {
        this.h = z;
        this.b.setAuto(z);
        if (!t()) {
            Iterator<Map.Entry<String, ow9>> it = this.f15097e.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().release();
            }
            this.f15097e.clear();
        }
    }
}
