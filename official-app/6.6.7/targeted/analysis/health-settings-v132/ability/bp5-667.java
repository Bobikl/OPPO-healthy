package com.oplus.aiunit.model;

import com.heytap.health.vision.deviceability.DeviceModel;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/bp5;", "Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", "Lcom/oplus/aiunit/vision/ap5;", BuildConfig.VERSION_NAME, "model", "<init>", "(Ljava/lang/String;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class bp5 extends DeviceModel implements ap5 {
    public bp5(@Nullable String str) {
        super(str);
    }

    @Override // com.oplus.aiunit.model.ap5
    public boolean F3() {
        return ap5.a.a(this);
    }

    @Override // com.oplus.aiunit.model.ap5
    public boolean N7() {
        return ap5.a.b(this);
    }
}