package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.OnResultCallback;
import com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.io.PrintWriter;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface pq9 {
    void a(PrintWriter printWriter, String[] strArr);

    DeviceInfo b(String str);

    void c(DeviceInfo deviceInfo);

    void d(DeviceInfo deviceInfo, IRemoveBoundCallback iRemoveBoundCallback);

    boolean e(ModuleInfo moduleInfo, sr0 sr0Var);

    void f(OnResultCallback onResultCallback);

    void i(DeviceInfo deviceInfo, boolean z, boolean z2, byte[] bArr);

    void initialize(@NonNull Context context);

    void j(@NonNull Context context);

    String k(String str);

    void m(OnResultCallback onResultCallback);

    void o(ModuleInfo moduleInfo, sr0 sr0Var);
}
