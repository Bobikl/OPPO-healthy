package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wj5 extends f21 {
    public final Context c;
    public b d;
    public bz3 f;
    public final Map<String, bz3> e = new ConcurrentHashMap();
    public final Map<Integer, wxg> g = new ConcurrentHashMap();
    public n4c h = new a();

    public class a implements n4c {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.n4c
        public void a(DeviceInfo deviceInfo) {
            wj5.this.A(deviceInfo);
        }

        @Override // com.oplus.aiunit.vision.n4c
        public void b(ModuleInfo moduleInfo, byte[] bArr) {
            if (wj5.this.d != null) {
                wj5.this.d.a(moduleInfo, bArr);
            }
        }

        @Override // com.oplus.aiunit.vision.n4c
        public void c(ModuleInfo moduleInfo, byte[] bArr) {
            if (wj5.this.d != null) {
                wj5.this.d.b(moduleInfo, bArr);
            }
        }

        @Override // com.oplus.aiunit.vision.n4c
        public void d(DeviceInfo deviceInfo, int i) {
            wj5.this.s(deviceInfo, i);
        }

        @Override // com.oplus.aiunit.vision.n4c
        public void e(DeviceInfo deviceInfo) {
            wj5.this.r(deviceInfo);
        }
    }

    public interface b {
        void a(ModuleInfo moduleInfo, byte[] bArr);

        void b(ModuleInfo moduleInfo, byte[] bArr);
    }

    public wj5(Context context, b bVar) {
        this.c = context;
        this.d = bVar;
    }

    public final void A(DeviceInfo deviceInfo) {
        q(deviceInfo);
    }

    @Override // com.oplus.aiunit.vision.rq9
    public int a(ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var) {
        if (moduleInfo == null) {
            uml.a("DeviceInteractionImpl", "unpack deviceInfo == null ");
            return 200;
        }
        bz3 bz3VarX = x(moduleInfo);
        if (bz3VarX != null) {
            return bz3VarX.x(moduleInfo, bArr, lt2Var);
        }
        wxg wxgVarZ = z(moduleInfo);
        if (wxgVarZ != null && wxgVarZ.a(moduleInfo)) {
            wxgVarZ.e(moduleInfo, bArr, lt2Var);
        }
        return 200;
    }

    @Override // com.oplus.aiunit.vision.rq9
    public DeviceInfo b(String str) {
        bz3 bz3Var = this.e.get(str);
        if (bz3Var != null) {
            return bz3Var.o();
        }
        Iterator<Map.Entry<Integer, wxg>> it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfoC = it.next().getValue().c();
            if (deviceInfoC != null && TextUtils.equals(str, deviceInfoC.getNodeId())) {
                return deviceInfoC;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.rq9
    public void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            uml.a("DeviceInteractionImpl", "disconnectDevice deviceInfo == null ");
            return;
        }
        bz3 bz3VarW = w(deviceInfo);
        if (bz3VarW != null) {
            bz3VarW.i();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0045, please report this as an issue */
    @Override // com.oplus.aiunit.vision.rq9
    public int d(ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var) {
        boolean z;
        if (moduleInfo == null) {
            uml.b("DeviceInteractionImpl", "sendMessage deviceInfo == null ");
            return 200;
        }
        bz3 bz3VarX = x(moduleInfo);
        if (bz3VarX != null) {
            return bz3VarX.y(moduleInfo, bArr, lt2Var);
        }
        wxg wxgVarZ = z(moduleInfo);
        if (wxgVarZ != null) {
            if (wxgVarZ.a(moduleInfo)) {
                wxgVarZ.f(moduleInfo, bArr, lt2Var);
                z = true;
            } else {
                uml.b("DeviceInteractionImpl", "sendMessage: serverConnectionModule checkModule error " + moduleInfo);
            }
            if (!z) {
                uml.a("DeviceInteractionImpl", "sendMessage device not find " + moduleInfo);
            }
            return 200;
        }
        uml.b("DeviceInteractionImpl", "sendMessage: serverConnectionModule is null");
        z = false;
        if (!z) {
            uml.a("DeviceInteractionImpl", "sendMessage device not find " + moduleInfo);
        }
        return 200;
    }

    @Override // com.oplus.aiunit.vision.rq9
    public void e(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null) {
            uml.b("DeviceInteractionImpl", "connectDevice: deviceInfo == null");
            return;
        }
        uml.a("DeviceInteractionImpl", "connectDevice " + deviceInfo.getNodeId());
        bz3 bz3VarY = y(deviceInfo);
        bz3VarY.z(z);
        bz3VarY.B(deviceInfo);
        bz3VarY.g();
        this.f = bz3VarY;
    }

    @Override // com.oplus.aiunit.vision.f21, com.oplus.aiunit.vision.rq9
    public void release() {
        super.release();
        if (this.e.size() > 0) {
            Iterator<Map.Entry<String, bz3>> it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().w();
            }
            this.e.clear();
        }
        if (this.g.size() > 0) {
            Iterator<Map.Entry<Integer, wxg>> it2 = this.g.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().d();
            }
            this.g.clear();
        }
    }

    public final bz3 v(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return null;
        }
        return new bz3(this.c, deviceInfo);
    }

    public final bz3 w(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return null;
        }
        return this.e.get(deviceInfo.getNodeId());
    }

    public final bz3 x(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        return this.e.get(moduleInfo.getNodeId());
    }

    @NonNull
    public final bz3 y(@NonNull DeviceInfo deviceInfo) {
        bz3 bz3VarW;
        synchronized (this.e) {
            bz3VarW = w(deviceInfo);
            if (bz3VarW == null) {
                bz3VarW = v(deviceInfo);
                this.e.put(deviceInfo.getNodeId(), bz3VarW);
                bz3VarW.v(this.h);
            }
        }
        return bz3VarW;
    }

    public final wxg z(ModuleInfo moduleInfo) {
        return this.g.get(Integer.valueOf(moduleInfo.getConnectionType()));
    }
}
