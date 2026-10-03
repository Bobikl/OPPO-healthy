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

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"HealthLint_ExceptionPrintDetector"})
public class pc5 implements ip9 {
    public static final pc5 i = new pc5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lp9 f15313c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jp9 f15314e;
    public Set<qz3> a = new CopyOnWriteArraySet();
    public Set<qt1> b = new CopyOnWriteArraySet();
    public qz3 f = new a();
    public zo9 g = new b();
    public aj5.b h = new c();
    public rxe d = rxe.a();

    public class a extends qz3 {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.pc5$a$a, reason: collision with other inner class name */
        public class C0914a implements go9.a {
            public final /* synthetic */ DeviceInfo a;

            public C0914a(DeviceInfo deviceInfo) {
                this.a = deviceInfo;
            }

            @Override // com.oplus.aiunit.vision.go9.a
            public void a(int i) {
                wil.b("DeviceConnectionManager2", "consult onFailed: " + i);
                pc5.this.c(this.a);
            }

            @Override // com.oplus.aiunit.vision.go9.a
            public void b(ModuleInfo moduleInfo, o9k o9kVar) {
                wil.a("DeviceConnectionManager2", "onSuccess: moduleInfo " + moduleInfo + ",transferConfig " + o9kVar);
                pc5.this.w(this.a);
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.qz3
        public void a(@NonNull DeviceInfo deviceInfo) {
            super.a(deviceInfo);
            go9 go9VarG = d14.f().g(deviceInfo.getConnectedModuleInfo());
            if (go9VarG == null) {
                pc5.this.w(deviceInfo);
            } else {
                go9VarG.f(new C0914a(deviceInfo));
            }
        }

        @Override // com.oplus.aiunit.vision.qz3
        public void d(@NonNull DeviceInfo deviceInfo, int i) {
            super.d(deviceInfo, i);
            pc5.this.x(deviceInfo, i);
        }
    }

    public class b implements zo9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.zo9
        public void a(@NonNull ModuleInfo moduleInfo, byte[] bArr, xs2<Void> xs2Var) {
            pc5.this.f15313c.a(moduleInfo, bArr, xs2Var);
        }

        @Override // com.oplus.aiunit.vision.zo9
        public void b(@NonNull ModuleInfo moduleInfo, br0 br0Var) {
            Iterator it = pc5.this.b.iterator();
            while (it.hasNext()) {
                ((qt1) it.next()).a(moduleInfo, br0Var);
            }
        }

        @Override // com.oplus.aiunit.vision.zo9
        public void c(@NonNull ModuleInfo moduleInfo, byte[] bArr, xs2<Void> xs2Var) {
            pc5.this.f15313c.d(moduleInfo, bArr, xs2Var);
        }

        @Override // com.oplus.aiunit.vision.zo9
        public void d(@NonNull ModuleInfo moduleInfo, br0 br0Var) {
            if (d14.f().b(moduleInfo, br0Var)) {
                return;
            }
            Iterator it = pc5.this.b.iterator();
            while (it.hasNext()) {
                ((qt1) it.next()).b(moduleInfo, br0Var);
            }
        }
    }

    public class c implements aj5.b {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.aj5.b
        public void a(ModuleInfo moduleInfo, byte[] bArr) {
            pc5.this.d.d(1, moduleInfo, bArr);
        }

        @Override // com.oplus.aiunit.vision.aj5.b
        public void b(ModuleInfo moduleInfo, byte[] bArr) {
            pc5.this.d.d(2, moduleInfo, bArr);
        }
    }

    public static ip9 v() {
        return i;
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void a(PrintWriter printWriter, String[] strArr) {
        printWriter.println("DeviceConnectionManager2:");
        printWriter.println(" mConnectionStateListeners: " + this.a.size());
        printWriter.println(" mBtDataReceivingCallbacks: " + this.b.size());
        jp9 jp9VarU = u();
        printWriter.println(" mGmsProxy: " + jp9VarU);
        if (jp9VarU != null) {
            jp9VarU.a(printWriter, strArr);
        }
    }

    @Override // com.oplus.aiunit.vision.jp9
    public DeviceInfo b(String str) {
        lp9 lp9Var = this.f15313c;
        DeviceInfo deviceInfoB = lp9Var != null ? lp9Var.b(str) : null;
        if (deviceInfoB != null) {
            return deviceInfoB;
        }
        jp9 jp9VarU = u();
        if (jp9VarU != null) {
            return jp9VarU.b(str);
        }
        wil.d("DeviceConnectionManager2", "getDeviceInfoByNodeId: not support gms");
        return null;
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            wil.b("DeviceConnectionManager2", "disconnectDevice deviceInfo == null");
            return;
        }
        ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
        if (jx3.e(mainModuleInfo.getConnectionType())) {
            jp9 jp9VarU = u();
            if (jp9VarU != null) {
                jp9VarU.c(deviceInfo);
                return;
            } else {
                wil.d("DeviceConnectionManager2", "disconnectDevice: not support gms");
                return;
            }
        }
        this.f15313c.c(deviceInfo);
        this.d.h(mainModuleInfo.getKey());
        ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
        if (stubModuleInfo != null) {
            this.d.h(stubModuleInfo.getKey());
        }
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void d(DeviceInfo deviceInfo, IRemoveBoundCallback iRemoveBoundCallback) {
        jp9 jp9VarU = u();
        if (jp9VarU != null) {
            jp9VarU.d(deviceInfo, iRemoveBoundCallback);
            return;
        }
        wil.d("DeviceConnectionManager2", "forgetDevice: not support gms");
        if (iRemoveBoundCallback != null) {
            try {
                iRemoveBoundCallback.onDeviceRemovalFailed("not support gms", -100);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.jp9
    public boolean e(ModuleInfo moduleInfo, br0 br0Var) {
        if (!jx3.e(moduleInfo.getConnectionType())) {
            return this.d.g(2, moduleInfo, br0Var);
        }
        jp9 jp9VarU = u();
        if (jp9VarU != null) {
            return jp9VarU.e(moduleInfo, br0Var);
        }
        wil.d("DeviceConnectionManager2", "sendMessage: not support gms");
        return false;
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void f(OnResultCallback onResultCallback) {
        jp9 jp9VarU = u();
        if (jp9VarU != null) {
            jp9VarU.f(onResultCallback);
            return;
        }
        wil.d("DeviceConnectionManager2", "getConnectedNodesOfWearOS: not support gms");
        try {
            onResultCallback.onFailure("not support");
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.ip9
    public void g(qt1 qt1Var) {
        this.b.remove(qt1Var);
    }

    @Override // com.oplus.aiunit.vision.ip9
    public void h(qz3 qz3Var) {
        this.a.add(qz3Var);
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void i(DeviceInfo deviceInfo, boolean z, boolean z2, byte[] bArr) {
        if (deviceInfo == null) {
            wil.b("DeviceConnectionManager2", "enableDeviceConnection deviceInfo == null");
            return;
        }
        ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
        if (jx3.e(mainModuleInfo.getConnectionType())) {
            jp9 jp9VarU = u();
            if (jp9VarU != null) {
                jp9VarU.i(deviceInfo, z, z2, bArr);
                return;
            } else {
                wil.d("DeviceConnectionManager2", "connectDevice: not support gms");
                return;
            }
        }
        if (z2) {
            d14.f().i(deviceInfo, z2, bArr);
        }
        this.d.e(mainModuleInfo.getKey(), this.g);
        ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
        if (stubModuleInfo != null) {
            this.d.e(stubModuleInfo.getKey(), this.g);
        }
        this.f15313c.f(this.f);
        this.f15313c.e(deviceInfo, z);
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void initialize(@NonNull Context context) {
        wil.d("DeviceConnectionManager2", "initialize enter");
        if (this.f15313c == null) {
            this.f15313c = new aj5(context.getApplicationContext(), this.h);
        }
        iu1.h().k(context);
        jp9 jp9VarU = u();
        if (jp9VarU == null) {
            wil.d("DeviceConnectionManager2", "initialize: not support gms");
        } else {
            wil.d("DeviceConnectionManager2", "initialize: support gms");
            jp9VarU.initialize(context);
        }
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void j(@NonNull Context context) {
        jp9 jp9VarU = u();
        if (jp9VarU != null) {
            jp9VarU.j(context);
        }
        this.f15313c.release();
        iu1.h().n(context);
        iu1.g();
    }

    @Override // com.oplus.aiunit.vision.jp9
    public String k(String str) {
        jp9 jp9VarU = u();
        if (jp9VarU != null) {
            return jp9VarU.k(str);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.ip9
    public void l(qz3 qz3Var) {
        this.a.remove(qz3Var);
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void m(OnResultCallback onResultCallback) {
        jp9 jp9VarU = u();
        if (jp9VarU != null) {
            jp9VarU.m(onResultCallback);
            return;
        }
        wil.d("DeviceConnectionManager2", "getBondNodesOfWearOS: not support gms");
        try {
            onResultCallback.onFailure("not support gms");
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.ip9
    public void n(qt1 qt1Var) {
        this.b.add(qt1Var);
    }

    @Override // com.oplus.aiunit.vision.jp9
    public void o(ModuleInfo moduleInfo, br0 br0Var) {
        if (!jx3.e(moduleInfo.getConnectionType())) {
            this.d.g(1, moduleInfo, br0Var);
            return;
        }
        jp9 jp9VarU = u();
        if (jp9VarU != null) {
            jp9VarU.o(moduleInfo, br0Var);
        } else {
            wil.d("DeviceConnectionManager2", "sendData: not support gms");
        }
    }

    @Nullable
    public final synchronized jp9 u() {
        if (!z18.a()) {
            return null;
        }
        if (this.f15314e == null) {
            try {
                this.f15314e = (jp9) Class.forName("com.oplus.wearable.linkservice.transport.gms.GMSProxy").getConstructor(Set.class, Set.class).newInstance(this.a, this.b);
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("not found GMSProxy build config error?");
            } catch (Exception e2) {
                wil.b("DeviceConnectionManager2", "getGmsProxy: failed " + e2);
            }
        }
        return this.f15314e;
    }

    public final void w(DeviceInfo deviceInfo) {
        Iterator<qz3> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(deviceInfo);
        }
    }

    public final void x(DeviceInfo deviceInfo, int i2) {
        d14.f().j(deviceInfo);
        p9k.e().h(deviceInfo);
        this.d.c(deviceInfo);
        Iterator<qz3> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(deviceInfo, i2);
        }
    }
}
