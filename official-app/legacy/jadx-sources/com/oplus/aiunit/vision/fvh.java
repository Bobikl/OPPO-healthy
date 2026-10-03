package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.formula.formula.DeviceMsgBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/fvh;", "", "Lcom/heytap/health/sleep/formula/formula/DeviceMsgBean;", "deviceMsgBean", "", "hasOsaData", "", "d", MapSchema.FIELD_NAME_ENTRY, "f", b2n.f, b2n.g, "a", "b", "c", "i", "j", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class fvh {
    public static final int $stable = 0;

    public final void a(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 2;
        deviceMsgBean.generation = 1;
    }

    public final void b(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 2;
        deviceMsgBean.generation = 2;
    }

    public final void c(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 3;
        deviceMsgBean.generation = 1;
    }

    public final void d(@NotNull DeviceMsgBean deviceMsgBean, boolean hasOsaData) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 6;
        deviceMsgBean.generation = hasOsaData ? 2 : 1;
    }

    public final void e(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 1;
        deviceMsgBean.generation = 1;
    }

    public final void f(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 1;
        deviceMsgBean.generation = 2;
    }

    public final void g(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 1;
        deviceMsgBean.generation = 3;
    }

    public final void h(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 1;
        deviceMsgBean.generation = 4;
    }

    public final void i(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 4;
        deviceMsgBean.generation = 1;
    }

    public final void j(@NotNull DeviceMsgBean deviceMsgBean) {
        Intrinsics.checkNotNullParameter(deviceMsgBean, "deviceMsgBean");
        deviceMsgBean.deviceType = 5;
        deviceMsgBean.generation = 1;
    }
}
