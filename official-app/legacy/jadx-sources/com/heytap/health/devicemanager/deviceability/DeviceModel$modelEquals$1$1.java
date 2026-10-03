package com.heytap.health.devicemanager.deviceability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class DeviceModel$modelEquals$1$1 extends FunctionReferenceImpl implements Function2<String, Object, Boolean> {
    public static final DeviceModel$modelEquals$1$1 INSTANCE = new DeviceModel$modelEquals$1$1();

    public DeviceModel$modelEquals$1$1() {
        super(2, String.class, "equals", "equals(Ljava/lang/Object;)Z", 0);
    }

    @Override // p010kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@NotNull String p0, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.equals(obj));
    }
}
