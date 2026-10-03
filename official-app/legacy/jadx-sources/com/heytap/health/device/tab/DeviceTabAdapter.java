package com.heytap.health.device.tab;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device.flexadapter.FlexAdapter;
import com.heytap.health.device.tab.itemview.base.BaseDeviceTabItem;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/health/device/tab/DeviceTabAdapter;", "Lcom/heytap/health/device/flexadapter/FlexAdapter;", "Lcom/heytap/health/device/tab/itemview/base/BaseDeviceTabItem;", "tag", "", "dataList", "", "(Ljava/lang/String;Ljava/util/List;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceTabAdapter extends FlexAdapter<BaseDeviceTabItem<?>> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceTabAdapter(@NotNull String tag, @NotNull List<BaseDeviceTabItem<?>> dataList) {
        super(tag, dataList);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
    }
}
