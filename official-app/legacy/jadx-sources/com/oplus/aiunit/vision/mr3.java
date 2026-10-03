package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/mr3;", "", "R", "Lkotlin/Function1;", "Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", "deviceModel", "<init>", "(Lcom/heytap/health/devicemanager/deviceability/DeviceModel;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class mr3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DeviceModel deviceModel;

    public mr3(@NotNull DeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.deviceModel = deviceModel;
    }

    public final <R> R a(@NotNull Function1<? super DeviceModel, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(this.deviceModel);
    }
}
