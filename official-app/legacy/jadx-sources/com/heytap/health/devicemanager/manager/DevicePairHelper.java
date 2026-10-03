package com.heytap.health.devicemanager.manager;

import androidx.lifecycle.Observer;
import com.heytap.health.devicemanager.processor.bean.OobeStatusBean;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.to5;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0001J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/devicemanager/manager/DevicePairHelper;", "Landroidx/lifecycle/Observer;", "Lcom/heytap/health/devicemanager/processor/bean/OobeStatusBean;", "Lcom/oplus/aiunit/vision/to5;", "", "oobeStatusBean", "deviceStatusCallback", "", "d", "value", "c", "", "mac", "", "isReset", "isOobeFinish", "b", "a", "Lcom/heytap/health/devicemanager/manager/DevicePairHelper$a;", "callback", MapSchema.FIELD_NAME_ENTRY, "j", "Lcom/heytap/health/devicemanager/manager/DevicePairHelper$a;", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class DevicePairHelper implements Observer<OobeStatusBean>, to5 {

    @NotNull
    public static final DevicePairHelper INSTANCE;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static a callback;
    public final /* synthetic */ DeviceStatusHelperImpl i = new DeviceStatusHelperImpl();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/devicemanager/manager/DevicePairHelper$a;", "", "", "mac", "", "isReset", "isOobeFinish", "", "b", "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull String mac);

        void b(@NotNull String mac, boolean isReset, boolean isOobeFinish);
    }

    static {
        DevicePairHelper devicePairHelper = new DevicePairHelper();
        INSTANCE = devicePairHelper;
        gl4.devicePrimary.nodeApi.a().observeForever(devicePairHelper);
    }

    private DevicePairHelper() {
    }

    @Override // com.oplus.aiunit.vision.to5
    public void a(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        a aVar = callback;
        if (aVar != null) {
            aVar.a(mac);
        }
    }

    @Override // com.oplus.aiunit.vision.to5
    public void b(@NotNull String mac, boolean isReset, boolean isOobeFinish) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        a aVar = callback;
        if (aVar != null) {
            aVar.b(mac, isReset, isOobeFinish);
        }
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onChanged(@NotNull OobeStatusBean value) {
        Intrinsics.checkNotNullParameter(value, "value");
        d(value, this);
    }

    public void d(@NotNull OobeStatusBean oobeStatusBean, @NotNull to5 deviceStatusCallback) {
        Intrinsics.checkNotNullParameter(oobeStatusBean, "oobeStatusBean");
        Intrinsics.checkNotNullParameter(deviceStatusCallback, "deviceStatusCallback");
        this.i.b(oobeStatusBean, deviceStatusCallback);
    }

    public final void e(@NotNull a callback2) {
        Intrinsics.checkNotNullParameter(callback2, "callback");
        callback = callback2;
    }
}
