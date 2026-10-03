package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;

/* JADX INFO: loaded from: classes5.dex */
public class gug {
    public x95 a;
    public DeviceInfo b;

    public boolean a(ModuleInfo moduleInfo) {
        DeviceInfo deviceInfo = this.b;
        if (deviceInfo == null) {
            return false;
        }
        return b(deviceInfo.getMainModuleInfo(), moduleInfo) || b(this.b.getStubModuleInfo(), moduleInfo);
    }

    public final boolean b(ModuleInfo moduleInfo, ModuleInfo moduleInfo2) {
        if (moduleInfo == null || moduleInfo2 == null) {
            return false;
        }
        return moduleInfo.equals(moduleInfo2);
    }

    public DeviceInfo c() {
        return this.b;
    }

    public void d() {
        x95 x95Var = this.a;
        if (x95Var != null) {
            x95Var.w();
        }
    }

    public void e(@NonNull ModuleInfo moduleInfo, byte[] bArr, xs2<Void> xs2Var) {
        int connectionType = moduleInfo.getConnectionType();
        if (jx3.c(connectionType)) {
            this.a.y(bArr, xs2Var);
            return;
        }
        wil.b("ServerConnectionModule", "sendData: error type=" + connectionType);
    }

    public void f(@NonNull ModuleInfo moduleInfo, byte[] bArr, xs2<Void> xs2Var) {
        int connectionType = moduleInfo.getConnectionType();
        if (jx3.c(connectionType)) {
            this.a.z(bArr, xs2Var);
            return;
        }
        wil.b("ServerConnectionModule", "sendMessage: error type=" + connectionType);
    }
}
