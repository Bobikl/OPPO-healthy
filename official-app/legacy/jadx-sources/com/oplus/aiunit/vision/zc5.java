package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.device.aidl.IDataSync;
import com.heytap.device.service.DeviceDataSyncApiProviderImpl;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes15.dex */
public class zc5 implements cm9<IDataSync> {
    @Override // com.oplus.aiunit.vision.cm9
    public void a(@NonNull PrintWriter printWriter, String[] strArr) {
        DeviceDataSyncApiProviderImpl.f().d(printWriter, strArr);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NonNull Context context) {
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NonNull Context context) {
        a7b.f("DeviceDataSyncApiProvider", " DeviceDataSyncApiProvider onCreate: ");
        DeviceDataSyncApiProviderImpl.f();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IDataSync d() {
        return DeviceDataSyncApiProviderImpl.f().e();
    }
}
