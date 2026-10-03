package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class aj5 extends r11 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f9391c;
    public b d;
    public oy3 f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, oy3> f9392e = new ConcurrentHashMap();
    public final Map<Integer, gug> g = new ConcurrentHashMap();
    public y2c h = new a();

    public class a implements y2c {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.y2c
        public void a(DeviceInfo deviceInfo) {
            aj5.this.A(deviceInfo);
        }

        @Override // com.oplus.aiunit.vision.y2c
        public void b(ModuleInfo moduleInfo, byte[] bArr) {
            if (aj5.this.d != null) {
                aj5.this.d.a(moduleInfo, bArr);
            }
        }

        @Override // com.oplus.aiunit.vision.y2c
        public void c(ModuleInfo moduleInfo, byte[] bArr) {
            if (aj5.this.d != null) {
                aj5.this.d.b(moduleInfo, bArr);
            }
        }

        @Override // com.oplus.aiunit.vision.y2c
        public void d(DeviceInfo deviceInfo, int i) {
            aj5.this.s(deviceInfo, i);
        }

        @Override // com.oplus.aiunit.vision.y2c
        public void e(DeviceInfo deviceInfo) {
            aj5.this.r(deviceInfo);
        }
    }

    public interface b {
        void a(ModuleInfo moduleInfo, byte[] bArr);

        void b(ModuleInfo moduleInfo, byte[] bArr);
    }

    public aj5(Context context, b bVar) {
        this.f9391c = context;
        this.d = bVar;
    }

    public final void A(DeviceInfo deviceInfo) {
        q(deviceInfo);
    }

    @Override // com.oplus.aiunit.vision.lp9
    public int a(ModuleInfo moduleInfo, byte[] bArr, xs2<Void> xs2Var) {
        if (moduleInfo == null) {
            wil.a("DeviceInteractionImpl", "unpack deviceInfo == null ");
            return 200;
        }
        oy3 oy3VarX = x(moduleInfo);
        if (oy3VarX != null) {
            return oy3VarX.x(moduleInfo, bArr, xs2Var);
        }
        gug gugVarZ = z(moduleInfo);
        if (gugVarZ != null && gugVarZ.a(moduleInfo)) {
            gugVarZ.e(moduleInfo, bArr, xs2Var);
        }
        return 200;
    }

    @Override // com.oplus.aiunit.vision.lp9
    public DeviceInfo b(String str) {
        oy3 oy3Var = this.f9392e.get(str);
        if (oy3Var != null) {
            return oy3Var.o();
        }
        Iterator<Map.Entry<Integer, gug>> it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfoC = it.next().getValue().c();
            if (deviceInfoC != null && TextUtils.equals(str, deviceInfoC.getNodeId())) {
                return deviceInfoC;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.lp9
    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            wil.a("DeviceInteractionImpl", "disconnectDevice deviceInfo == null ");
            return;
        }
        oy3 oy3VarW = w(deviceInfo);
        if (oy3VarW != null) {
            oy3VarW.i();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0045, please report this as an issue */
    @Override // com.oplus.aiunit.vision.lp9
    public int d(ModuleInfo moduleInfo, byte[] bArr, xs2<Void> xs2Var) {
        boolean z;
        if (moduleInfo == null) {
            wil.b("DeviceInteractionImpl", "sendMessage deviceInfo == null ");
            return 200;
        }
        oy3 oy3VarX = x(moduleInfo);
        if (oy3VarX != null) {
            return oy3VarX.y(moduleInfo, bArr, xs2Var);
        }
        gug gugVarZ = z(moduleInfo);
        if (gugVarZ != null) {
            if (gugVarZ.a(moduleInfo)) {
                gugVarZ.f(moduleInfo, bArr, xs2Var);
                z = true;
            } else {
                wil.b("DeviceInteractionImpl", "sendMessage: serverConnectionModule checkModule error " + moduleInfo);
            }
            if (!z) {
                wil.a("DeviceInteractionImpl", "sendMessage device not find " + moduleInfo);
            }
            return 200;
        }
        wil.b("DeviceInteractionImpl", "sendMessage: serverConnectionModule is null");
        z = false;
        if (!z) {
            wil.a("DeviceInteractionImpl", "sendMessage device not find " + moduleInfo);
        }
        return 200;
    }

    @Override // com.oplus.aiunit.vision.lp9
    public void e(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null) {
            wil.b("DeviceInteractionImpl", "connectDevice: deviceInfo == null");
            return;
        }
        wil.a("DeviceInteractionImpl", "connectDevice " + deviceInfo.getNodeId());
        oy3 oy3VarY = y(deviceInfo);
        oy3VarY.z(z);
        oy3VarY.B(deviceInfo);
        oy3VarY.g();
        this.f = oy3VarY;
    }

    @Override // com.oplus.aiunit.vision.r11, com.oplus.aiunit.vision.lp9
    public void release() {
        super.release();
        if (this.f9392e.size() > 0) {
            Iterator<Map.Entry<String, oy3>> it = this.f9392e.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().w();
            }
            this.f9392e.clear();
        }
        if (this.g.size() > 0) {
            Iterator<Map.Entry<Integer, gug>> it2 = this.g.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().d();
            }
            this.g.clear();
        }
    }

    public final oy3 v(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return null;
        }
        return new oy3(this.f9391c, deviceInfo);
    }

    public final oy3 w(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return null;
        }
        return this.f9392e.get(deviceInfo.getNodeId());
    }

    public final oy3 x(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        return this.f9392e.get(moduleInfo.getNodeId());
    }

    @NonNull
    public final oy3 y(@NonNull DeviceInfo deviceInfo) {
        oy3 oy3VarW;
        synchronized (this.f9392e) {
            oy3VarW = w(deviceInfo);
            if (oy3VarW == null) {
                oy3VarW = v(deviceInfo);
                this.f9392e.put(deviceInfo.getNodeId(), oy3VarW);
                oy3VarW.v(this.h);
            }
        }
        return oy3VarW;
    }

    public final gug z(ModuleInfo moduleInfo) {
        return this.g.get(Integer.valueOf(moduleInfo.getConnectionType()));
    }
}
