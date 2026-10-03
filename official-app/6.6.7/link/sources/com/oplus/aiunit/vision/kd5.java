package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.OnResultCallback;
import com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@SuppressLint({"HealthLint_ExceptionPrintDetector"})
public class kd5 implements oq9 {
    public static final kd5 i = new kd5();
    public rq9 c;
    public pq9 e;
    public Set<d04> a = new CopyOnWriteArraySet();
    public Set<eu1> b = new CopyOnWriteArraySet();
    public d04 f = new a();
    public fq9 g = new b();
    public wj5.b h = new c();
    public c0f d = c0f.a();

    public class a extends d04 {

        public class a implements mp9.a {
            public final /* synthetic */ DeviceInfo a;

            public a(DeviceInfo deviceInfo) {
                this.a = deviceInfo;
            }

            @Override // com.oplus.aiunit.vision.mp9.a
            public void a(int i) {
                uml.b("DeviceConnectionManager2", "consult onFailed: " + i);
                kd5.this.c(this.a);
            }

            @Override // com.oplus.aiunit.vision.mp9.a
            public void b(ModuleInfo moduleInfo, qdk qdkVar) {
                uml.a("DeviceConnectionManager2", "onSuccess: moduleInfo " + moduleInfo + ",transferConfig " + qdkVar);
                kd5.this.w(this.a);
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.d04
        public void a(@NonNull DeviceInfo deviceInfo) {
            super.a(deviceInfo);
            mp9 mp9VarG = q14.f().g(deviceInfo.getConnectedModuleInfo());
            if (mp9VarG == null) {
                kd5.this.w(deviceInfo);
            } else {
                mp9VarG.f(new a(deviceInfo));
            }
        }

        @Override // com.oplus.aiunit.vision.d04
        public void d(@NonNull DeviceInfo deviceInfo, int i) {
            super.d(deviceInfo, i);
            kd5.this.x(deviceInfo, i);
        }
    }

    public class b implements fq9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.fq9
        public void a(@NonNull ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var) {
            kd5.this.c.a(moduleInfo, bArr, lt2Var);
        }

        @Override // com.oplus.aiunit.vision.fq9
        public void b(@NonNull ModuleInfo moduleInfo, sr0 sr0Var) {
            Iterator it = kd5.this.b.iterator();
            while (it.hasNext()) {
                ((eu1) it.next()).a(moduleInfo, sr0Var);
            }
        }

        @Override // com.oplus.aiunit.vision.fq9
        public void c(@NonNull ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var) {
            kd5.this.c.d(moduleInfo, bArr, lt2Var);
        }

        @Override // com.oplus.aiunit.vision.fq9
        public void d(@NonNull ModuleInfo moduleInfo, sr0 sr0Var) {
            if (q14.f().b(moduleInfo, sr0Var)) {
                return;
            }
            Iterator it = kd5.this.b.iterator();
            while (it.hasNext()) {
                ((eu1) it.next()).b(moduleInfo, sr0Var);
            }
        }
    }

    public class c implements wj5.b {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.wj5.b
        public void a(ModuleInfo moduleInfo, byte[] bArr) {
            kd5.this.d.d(1, moduleInfo, bArr);
        }

        @Override // com.oplus.aiunit.vision.wj5.b
        public void b(ModuleInfo moduleInfo, byte[] bArr) {
            kd5.this.d.d(2, moduleInfo, bArr);
        }
    }

    public static oq9 v() {
        return i;
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void a(PrintWriter printWriter, String[] strArr) {
        printWriter.println("DeviceConnectionManager2:");
        printWriter.println(" mConnectionStateListeners: " + this.a.size());
        printWriter.println(" mBtDataReceivingCallbacks: " + this.b.size());
        pq9 pq9VarU = u();
        printWriter.println(" mGmsProxy: " + pq9VarU);
        if (pq9VarU != null) {
            pq9VarU.a(printWriter, strArr);
        }
    }

    @Override // com.oplus.aiunit.vision.pq9
    public DeviceInfo b(String str) {
        rq9 rq9Var = this.c;
        DeviceInfo deviceInfoB = rq9Var != null ? rq9Var.b(str) : null;
        if (deviceInfoB != null) {
            return deviceInfoB;
        }
        pq9 pq9VarU = u();
        if (pq9VarU != null) {
            return pq9VarU.b(str);
        }
        uml.d("DeviceConnectionManager2", "getDeviceInfoByNodeId: not support gms");
        return null;
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            uml.b("DeviceConnectionManager2", "disconnectDevice deviceInfo == null");
            return;
        }
        ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
        if (xx3.e(mainModuleInfo.getConnectionType())) {
            pq9 pq9VarU = u();
            if (pq9VarU != null) {
                pq9VarU.c(deviceInfo);
                return;
            } else {
                uml.d("DeviceConnectionManager2", "disconnectDevice: not support gms");
                return;
            }
        }
        this.c.c(deviceInfo);
        this.d.h(mainModuleInfo.getKey());
        ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
        if (stubModuleInfo != null) {
            this.d.h(stubModuleInfo.getKey());
        }
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void d(DeviceInfo deviceInfo, IRemoveBoundCallback iRemoveBoundCallback) {
        pq9 pq9VarU = u();
        if (pq9VarU != null) {
            pq9VarU.d(deviceInfo, iRemoveBoundCallback);
            return;
        }
        uml.d("DeviceConnectionManager2", "forgetDevice: not support gms");
        if (iRemoveBoundCallback != null) {
            try {
                iRemoveBoundCallback.onDeviceRemovalFailed("not support gms", -100);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.pq9
    public boolean e(ModuleInfo moduleInfo, sr0 sr0Var) {
        if (!xx3.e(moduleInfo.getConnectionType())) {
            return this.d.g(2, moduleInfo, sr0Var);
        }
        pq9 pq9VarU = u();
        if (pq9VarU != null) {
            return pq9VarU.e(moduleInfo, sr0Var);
        }
        uml.d("DeviceConnectionManager2", "sendMessage: not support gms");
        return false;
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void f(OnResultCallback onResultCallback) {
        pq9 pq9VarU = u();
        if (pq9VarU != null) {
            pq9VarU.f(onResultCallback);
            return;
        }
        uml.d("DeviceConnectionManager2", "getConnectedNodesOfWearOS: not support gms");
        try {
            onResultCallback.onFailure("not support");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.oq9
    public void g(eu1 eu1Var) {
        this.b.remove(eu1Var);
    }

    @Override // com.oplus.aiunit.vision.oq9
    public void h(d04 d04Var) {
        this.a.add(d04Var);
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void i(DeviceInfo deviceInfo, boolean z, boolean z2, byte[] bArr) {
        if (deviceInfo == null) {
            uml.b("DeviceConnectionManager2", "enableDeviceConnection deviceInfo == null");
            return;
        }
        ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
        if (xx3.e(mainModuleInfo.getConnectionType())) {
            pq9 pq9VarU = u();
            if (pq9VarU != null) {
                pq9VarU.i(deviceInfo, z, z2, bArr);
                return;
            } else {
                uml.d("DeviceConnectionManager2", "connectDevice: not support gms");
                return;
            }
        }
        if (z2) {
            q14.f().i(deviceInfo, z2, bArr);
        }
        this.d.e(mainModuleInfo.getKey(), this.g);
        ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
        if (stubModuleInfo != null) {
            this.d.e(stubModuleInfo.getKey(), this.g);
        }
        this.c.f(this.f);
        this.c.e(deviceInfo, z);
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void initialize(@NonNull Context context) {
        uml.d("DeviceConnectionManager2", "initialize enter");
        if (this.c == null) {
            this.c = new wj5(context.getApplicationContext(), this.h);
        }
        wu1.h().k(context);
        pq9 pq9VarU = u();
        if (pq9VarU == null) {
            uml.d("DeviceConnectionManager2", "initialize: not support gms");
        } else {
            uml.d("DeviceConnectionManager2", "initialize: support gms");
            pq9VarU.initialize(context);
        }
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void j(@NonNull Context context) {
        pq9 pq9VarU = u();
        if (pq9VarU != null) {
            pq9VarU.j(context);
        }
        this.c.release();
        wu1.h().n(context);
        wu1.g();
    }

    @Override // com.oplus.aiunit.vision.pq9
    public String k(String str) {
        pq9 pq9VarU = u();
        if (pq9VarU != null) {
            return pq9VarU.k(str);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.oq9
    public void l(d04 d04Var) {
        this.a.remove(d04Var);
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void m(OnResultCallback onResultCallback) {
        pq9 pq9VarU = u();
        if (pq9VarU != null) {
            pq9VarU.m(onResultCallback);
            return;
        }
        uml.d("DeviceConnectionManager2", "getBondNodesOfWearOS: not support gms");
        try {
            onResultCallback.onFailure("not support gms");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.oq9
    public void n(eu1 eu1Var) {
        this.b.add(eu1Var);
    }

    @Override // com.oplus.aiunit.vision.pq9
    public void o(ModuleInfo moduleInfo, sr0 sr0Var) {
        if (!xx3.e(moduleInfo.getConnectionType())) {
            this.d.g(1, moduleInfo, sr0Var);
            return;
        }
        pq9 pq9VarU = u();
        if (pq9VarU != null) {
            pq9VarU.o(moduleInfo, sr0Var);
        } else {
            uml.d("DeviceConnectionManager2", "sendData: not support gms");
        }
    }

    @Nullable
    public final synchronized pq9 u() {
        if (!c38.a()) {
            return null;
        }
        if (this.e == null) {
            try {
                this.e = (pq9) Class.forName("com.oplus.wearable.linkservice.transport.gms.GMSProxy").getConstructor(Set.class, Set.class).newInstance(this.a, this.b);
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("not found GMSProxy build config error?");
            } catch (Exception e) {
                uml.b("DeviceConnectionManager2", "getGmsProxy: failed " + e);
            }
        }
        return this.e;
    }

    public final void w(DeviceInfo deviceInfo) {
        Iterator<d04> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(deviceInfo);
        }
    }

    public final void x(DeviceInfo deviceInfo, int i2) {
        q14.f().j(deviceInfo);
        rdk.e().h(deviceInfo);
        this.d.c(deviceInfo);
        Iterator<d04> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(deviceInfo, i2);
        }
    }
}
