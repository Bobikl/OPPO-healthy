package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class bz3 {
    public final Context a;
    public DeviceInfo b;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public Set<n4c> c = new CopyOnWriteArraySet();
    public Map<String, sa5> d = new ConcurrentHashMap();
    public Map<String, vx9> e = new ConcurrentHashMap();
    public qk5 j = new a();
    public vx9.a k = new b();

    public class a implements qk5 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.qk5
        public void a(sa5 sa5Var, int i) {
            uml.a("ConnectionModule", "onDisconnected: device=" + sa5Var + " reason=" + i);
            vx9 vx9VarP = bz3.this.p(sa5Var.l());
            if (vx9VarP != null) {
                vx9VarP.a(sa5Var, i);
            } else {
                bz3.this.s(sa5Var, i);
            }
        }

        @Override // com.oplus.aiunit.vision.qk5
        public void b(sa5 sa5Var) {
            uml.a("ConnectionModule", "onConnected: device=" + sa5Var);
            vx9 vx9VarP = bz3.this.p(sa5Var.l());
            if (vx9VarP != null) {
                vx9VarP.b(sa5Var);
            } else {
                bz3.this.q(sa5Var);
            }
        }

        @Override // com.oplus.aiunit.vision.qk5
        public void c(sa5 sa5Var) {
            uml.a("ConnectionModule", "onConnecting: device=" + sa5Var);
            bz3.this.r(sa5Var);
        }

        @Override // com.oplus.aiunit.vision.qk5
        public void d(sa5 sa5Var, byte[] bArr) {
            Iterator it = bz3.this.c.iterator();
            while (it.hasNext()) {
                ((n4c) it.next()).b(sa5Var.l(), bArr);
            }
        }

        @Override // com.oplus.aiunit.vision.qk5
        public void e(sa5 sa5Var, byte[] bArr) {
            Iterator it = bz3.this.c.iterator();
            while (it.hasNext()) {
                ((n4c) it.next()).c(sa5Var.l(), bArr);
            }
        }
    }

    public class b implements vx9.a {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.vx9.a
        public void a(sa5 sa5Var, int i) {
            bz3.this.s(sa5Var, i);
        }

        @Override // com.oplus.aiunit.vision.vx9.a
        public void b(sa5 sa5Var) {
            bz3.this.q(sa5Var);
        }
    }

    public bz3(Context context, @NonNull DeviceInfo deviceInfo) {
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
        sa5 sa5VarN = n(moduleInfo);
        if (sa5VarN != null) {
            sa5VarN.w();
            this.d.remove(moduleInfo.getKey());
        }
        vx9 vx9VarP = p(moduleInfo);
        if (vx9VarP != null) {
            vx9VarP.release();
            this.e.remove(moduleInfo.getKey());
        }
    }

    public void g() {
        this.i = false;
        u(this.b.getMainModuleInfo());
        u(this.b.getStubModuleInfo());
        if (l() == 2) {
            uml.a("ConnectionModule", "connect: is connected ignore");
        } else {
            this.g = h(this.b.getStubModuleInfo());
            this.f = h(this.b.getMainModuleInfo());
        }
    }

    public final synchronized boolean h(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return false;
        }
        uml.a("ConnectionModule", "connect: moduleInfo = " + moduleInfo);
        sa5 sa5VarN = n(moduleInfo);
        p(moduleInfo);
        if (sa5VarN == null) {
            uml.a("ConnectionModule", "connect: device == null");
            return false;
        }
        sa5VarN.n = true;
        sa5VarN.g();
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
        uml.a("ConnectionModule", "disconnect: moduleInfo = " + moduleInfo);
        sa5 sa5VarN = n(moduleInfo);
        vx9 vx9VarP = p(moduleInfo);
        if (vx9VarP != null) {
            vx9VarP.stop();
        }
        if (sa5VarN != null) {
            sa5VarN.h();
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
        sa5 sa5VarN = n(moduleInfo);
        if (sa5VarN != null) {
            return sa5VarN.k();
        }
        return 3;
    }

    public final synchronized sa5 n(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        return this.d.get(moduleInfo.getKey());
    }

    public DeviceInfo o() {
        return this.b;
    }

    public final vx9 p(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        String nodeId = moduleInfo.getNodeId();
        vx9 h65Var = this.e.get(moduleInfo.getKey());
        if (h65Var == null && t()) {
            h65Var = xx3.c(moduleInfo.getConnectionType()) ? new h65("BR", 0, true, nodeId) : new h65("BLE", this.b.getBleRetryCount(), false, nodeId);
            this.e.put(moduleInfo.getKey(), h65Var);
        }
        return h65Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x0098 A[LOOP:0: B:19:0x0092->B:21:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a6 A[ORIG_RETURN, RETURN] */
    public final void q(sa5 sa5Var) {
        boolean z;
        vx9 vx9VarP;
        Iterator<n4c> it;
        uml.a("ConnectionModule", "handleConnected: mIsLastStateConnected =" + sa5Var.m + ",mIsActiveConnect = " + sa5Var.n);
        this.f = false;
        this.g = false;
        if (!k(sa5Var.l(), this.b.getMainModuleInfo())) {
            if (k(sa5Var.l(), this.b.getStubModuleInfo())) {
                A(this.b.getStubModuleInfo(), 2);
                j(this.b.getMainModuleInfo());
            } else {
                z = false;
            }
            vx9VarP = p(sa5Var.l());
            if (vx9VarP != null) {
                vx9VarP.stop();
            }
            if (z) {
                if (sa5Var.n && sa5Var.m) {
                    return;
                }
                sa5Var.n = false;
                sa5Var.m = true;
                it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().a(o());
                }
            }
        }
        A(this.b.getMainModuleInfo(), 2);
        j(this.b.getStubModuleInfo());
        z = true;
        vx9VarP = p(sa5Var.l());
        if (vx9VarP != null) {
            vx9VarP.stop();
        }
        if (z) {
            if (sa5Var.n) {
            }
            sa5Var.n = false;
            sa5Var.m = true;
            it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(o());
            }
        }
    }

    public final void r(sa5 sa5Var) {
        uml.a("ConnectionModule", "handleConnecting: mIsLastStateConnected =" + sa5Var.m + ",mIsActiveConnect = " + sa5Var.n);
        if (k(sa5Var.l(), this.b.getMainModuleInfo())) {
            A(this.b.getMainModuleInfo(), 1);
        } else if (k(sa5Var.l(), this.b.getStubModuleInfo())) {
            A(this.b.getStubModuleInfo(), 1);
        }
        if (sa5Var.n) {
            Iterator<n4c> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().e(o());
            }
        }
    }

    public final void s(sa5 sa5Var, int i) {
        ModuleInfo mainModuleInfo;
        sa5 sa5VarN;
        uml.a("ConnectionModule", "handleDisconnected: mIsLastStateConnected =" + sa5Var.m + ",mIsActiveConnect = " + sa5Var.n);
        int iM = 3;
        if (k(sa5Var.l(), this.b.getMainModuleInfo())) {
            this.f = false;
            A(this.b.getMainModuleInfo(), 3);
            iM = m(this.b.getStubModuleInfo());
            mainModuleInfo = this.b.getStubModuleInfo();
        } else if (k(sa5Var.l(), this.b.getStubModuleInfo())) {
            this.g = false;
            A(this.b.getStubModuleInfo(), 3);
            iM = m(this.b.getMainModuleInfo());
            mainModuleInfo = this.b.getMainModuleInfo();
        } else {
            mainModuleInfo = null;
        }
        uml.a("ConnectionModule", "handleDisconnected: otherModuleState " + iM + " ,mIsActiveDisconnect " + this.i);
        if (iM == 2) {
            sa5Var.A(true);
            return;
        }
        vx9 vx9VarP = p(sa5Var.l());
        if (vx9VarP != null && t()) {
            vx9VarP.start();
        }
        if (!this.i && (sa5VarN = n(mainModuleInfo)) != null && sa5VarN.r()) {
            sa5VarN.A(false);
            vx9 vx9VarP2 = p(mainModuleInfo);
            uml.a("ConnectionModule", "handleDisconnected: otherRetryStrategy =" + vx9VarP2 + ",otherModule = " + mainModuleInfo);
            if (vx9VarP2 != null && t()) {
                vx9VarP2.start();
            }
        }
        if (this.f || this.g) {
            return;
        }
        if (sa5Var.n || sa5Var.m) {
            sa5Var.n = false;
            sa5Var.m = false;
            Iterator<n4c> it = this.c.iterator();
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
        uml.a("ConnectionModule", "prepareConnect: moduleInfo = " + moduleInfo);
        if (!BluetoothAdapter.checkBluetoothAddress(moduleInfo.getMacAddress())) {
            uml.a("ConnectionModule", "prepareConnect: error mac = " + moduleInfo.getMacAddress() + " , deviceInfo = " + this.b);
            return;
        }
        sa5 sa5VarN = n(moduleInfo);
        if (sa5VarN == null) {
            if (xx3.b(moduleInfo.getConnectionType())) {
                sa5VarN = new u48(this.a, moduleInfo, this.b.getBleConnectTimeout());
                sa5VarN.v(this.j);
                this.d.put(moduleInfo.getKey(), sa5VarN);
            } else if (xx3.c(moduleInfo.getConnectionType())) {
                sa5VarN = new gr0(this.a, moduleInfo);
                sa5VarN.v(this.j);
                this.d.put(moduleInfo.getKey(), sa5VarN);
            }
        }
        vx9 vx9VarP = p(moduleInfo);
        if (vx9VarP != null) {
            vx9VarP.stop();
            vx9VarP.c(sa5VarN);
            vx9VarP.setOnConnectChangeHoldListener(this.k);
        }
    }

    public void v(n4c n4cVar) {
        this.c.add(n4cVar);
    }

    public synchronized void w() {
        this.c.clear();
        Iterator<Map.Entry<String, sa5>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().w();
        }
        this.d.clear();
    }

    public int x(ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var) {
        sa5 sa5VarN = n(moduleInfo);
        if (sa5VarN != null) {
            return sa5VarN.y(bArr, lt2Var);
        }
        return 200;
    }

    public int y(ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var) {
        sa5 sa5VarN = n(moduleInfo);
        if (sa5VarN != null) {
            return sa5VarN.z(bArr, lt2Var);
        }
        return 200;
    }

    public synchronized void z(boolean z) {
        this.h = z;
        this.b.setAuto(z);
        if (!t()) {
            Iterator<Map.Entry<String, vx9>> it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().release();
            }
            this.e.clear();
        }
    }
}
