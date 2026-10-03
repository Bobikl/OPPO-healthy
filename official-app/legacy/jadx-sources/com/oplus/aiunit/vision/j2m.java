package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/j2m;", "", "", "deviceListSize", "", "a", "other", "", "equals", "hashCode", "Lcom/oplus/aiunit/vision/sj5;", "Lcom/oplus/aiunit/vision/sj5;", "b", "()Lcom/oplus/aiunit/vision/sj5;", "deviceListChangeListener", "I", "currDeviceListSize", "", "c", "Ljava/lang/String;", "TAG", "<init>", "(Lcom/oplus/aiunit/vision/sj5;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class j2m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final sj5 deviceListChangeListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int currDeviceListSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    public j2m(@NotNull sj5 deviceListChangeListener) {
        Intrinsics.checkNotNullParameter(deviceListChangeListener, "deviceListChangeListener");
        this.deviceListChangeListener = deviceListChangeListener;
        this.currDeviceListSize = -1;
        this.TAG = "WrapperDeviceListChangeListener";
    }

    public final void a(int deviceListSize) {
        ml4.d(this.TAG, "deviceListChange currDeviceListSize:" + this.currDeviceListSize + " deviceListSize:" + deviceListSize + " listener:" + this.deviceListChangeListener);
        if (deviceListSize != this.currDeviceListSize) {
            this.currDeviceListSize = deviceListSize;
            this.deviceListChangeListener.a(deviceListSize);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final sj5 getDeviceListChangeListener() {
        return this.deviceListChangeListener;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(j2m.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.devicemanager.client.listener.WrapperDeviceListChangeListener");
        return Intrinsics.areEqual(this.deviceListChangeListener, ((j2m) other).deviceListChangeListener);
    }

    public int hashCode() {
        return this.deviceListChangeListener.hashCode();
    }
}
