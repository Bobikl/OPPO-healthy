package com.oplus.mydevices.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.oplus.aiunit.vision.a8i;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.mydevices.sdk.device.DeviceInfo;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\fH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0014"}, d2 = {"Lcom/oplus/mydevices/sdk/internal/IDeviceService;", "", "add", "", "deviceInfo", "Lcom/oplus/mydevices/sdk/device/DeviceInfo;", "clear", "insertOrUpdate", "notifyDevicesChanged", "", SearchIntents.EXTRA_QUERY, "mac", "", "queryDeviceById", "deviceId", "queryDevices", "", EventType.STATE_PACKAGE_CHANGED_REMOVE, a8i.UPDATE, "Factory", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public interface IDeviceService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/oplus/mydevices/sdk/internal/IDeviceService$Factory;", "", "()V", "createDeviceRepository", "Lcom/oplus/mydevices/sdk/internal/DeviceRepositoryImpl;", "context", "Landroid/content/Context;", ParserTag.TAG_URI, "Landroid/net/Uri;", "createDeviceRepository$sdk_domesticRelease", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    public static final class Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @Nullable
        public final DeviceRepositoryImpl createDeviceRepository$sdk_domesticRelease(@NotNull Context context, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (uri != null) {
                return new DeviceRepositoryImpl(context, uri);
            }
            return null;
        }
    }

    boolean add(@NotNull DeviceInfo deviceInfo);

    boolean clear();

    boolean insertOrUpdate(@NotNull DeviceInfo deviceInfo);

    void notifyDevicesChanged();

    @Nullable
    DeviceInfo query(@NotNull String mac);

    @Nullable
    DeviceInfo queryDeviceById(@NotNull String deviceId);

    @NotNull
    List<DeviceInfo> queryDevices();

    boolean remove(@NotNull DeviceInfo deviceInfo);

    boolean update(@NotNull DeviceInfo deviceInfo);
}
