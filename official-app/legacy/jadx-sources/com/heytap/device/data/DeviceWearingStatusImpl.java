package com.heytap.device.data;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.device.data.DeviceWearingStatusImpl;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService;
import com.oplus.aiunit.vision.ajl;
import com.oplus.aiunit.vision.bjl;
import com.oplus.aiunit.vision.xm3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = "/device_data_sync/data_sync/DeviceWearStatusService")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/DeviceWearingStatusImpl;", "Lcom/heytap/health/device_data_sync/data_sync/IDeviceWearStatusService;", "", "H0", "Lcom/oplus/aiunit/vision/xm3;", "statusCallback", "", "useCache", "", "W6", "Lcom/oplus/aiunit/vision/ajl;", "listener", "bb", "l7", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceWearingStatusImpl implements IDeviceWearStatusService {
    public static final void h1(boolean z, xm3 statusCallback) {
        Intrinsics.checkNotNullParameter(statusCallback, "$statusCallback");
        statusCallback.onResult(Integer.valueOf(bjl.INSTANCE.c(z)));
    }

    @Override // com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService
    public int H0() {
        return bjl.INSTANCE.c(false);
    }

    @Override // com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService
    public void W6(@NotNull final xm3<Integer> statusCallback, final boolean useCache) {
        Intrinsics.checkNotNullParameter(statusCallback, "statusCallback");
        ThreadUtils.doInBackground("WearStatus", new Runnable() { // from class: com.oplus.aiunit.vision.vq5
            @Override // java.lang.Runnable
            public final void run() {
                DeviceWearingStatusImpl.h1(useCache, statusCallback);
            }
        });
    }

    @Override // com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService
    public void bb(@NotNull ajl listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        bjl.INSTANCE.a(listener);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
        IDeviceWearStatusService.a.a(this, context);
    }

    @Override // com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService
    public void l7(@NotNull ajl listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        bjl.INSTANCE.h(listener);
    }
}
