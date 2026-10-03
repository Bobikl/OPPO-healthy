package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wxg {
    public sa5 a;
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
        sa5 sa5Var = this.a;
        if (sa5Var != null) {
            sa5Var.w();
        }
    }

    public void e(@NonNull ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var) {
        int connectionType = moduleInfo.getConnectionType();
        if (xx3.c(connectionType)) {
            this.a.y(bArr, lt2Var);
            return;
        }
        uml.b("ServerConnectionModule", "sendData: error type=" + connectionType);
    }

    public void f(@NonNull ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var) {
        int connectionType = moduleInfo.getConnectionType();
        if (xx3.c(connectionType)) {
            this.a.z(bArr, lt2Var);
            return;
        }
        uml.b("ServerConnectionModule", "sendMessage: error type=" + connectionType);
    }
}
