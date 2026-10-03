package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.Node;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/buc;", "", "", "deviceModel", "mainMac", "subMac", "Lcom/oplus/wearable/linkservice/sdk/Node;", "a", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class buc {

    @NotNull
    public static final buc INSTANCE = new buc();

    @JvmStatic
    @Nullable
    public static final Node a(@Nullable String deviceModel, @Nullable String mainMac, @Nullable String subMac) {
        return ptc.a(deviceModel).M3(mainMac, subMac);
    }
}
