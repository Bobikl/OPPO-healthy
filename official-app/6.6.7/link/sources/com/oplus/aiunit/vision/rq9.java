package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface rq9 {
    int a(ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var);

    DeviceInfo b(String str);

    void c(DeviceInfo deviceInfo);

    int d(ModuleInfo moduleInfo, byte[] bArr, lt2<Void> lt2Var);

    void e(DeviceInfo deviceInfo, boolean z);

    void f(d04 d04Var);

    void release();
}
