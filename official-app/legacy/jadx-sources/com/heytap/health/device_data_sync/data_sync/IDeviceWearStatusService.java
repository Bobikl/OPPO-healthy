package com.heytap.health.device_data_sync.data_sync;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.ajl;
import com.oplus.aiunit.vision.xm3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/device_data_sync/data_sync/IDeviceWearStatusService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "H0", "Lcom/oplus/aiunit/vision/xm3;", "statusCallback", "", "useCache", "", "W6", "Lcom/oplus/aiunit/vision/ajl;", "listener", "bb", "l7", "device_data_sync_release"}, k = 1, mv = {1, 8, 0})
public interface IDeviceWearStatusService extends IProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull IDeviceWearStatusService iDeviceWearStatusService, @Nullable Context context) {
        }
    }

    int H0();

    void W6(@NotNull xm3<Integer> statusCallback, boolean useCache);

    void bb(@NotNull ajl listener);

    void l7(@NotNull ajl listener);
}
