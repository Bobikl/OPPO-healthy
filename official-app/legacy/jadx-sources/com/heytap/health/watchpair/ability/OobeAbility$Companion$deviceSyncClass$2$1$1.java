package com.heytap.health.watchpair.ability;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class OobeAbility$Companion$deviceSyncClass$2$1$1 extends FunctionReferenceImpl implements Function1<DeviceModel, Boolean> {
    public static final OobeAbility$Companion$deviceSyncClass$2$1$1 INSTANCE = new OobeAbility$Companion$deviceSyncClass$2$1$1();

    public OobeAbility$Companion$deviceSyncClass$2$1$1() {
        super(1, DeviceModel.class, "isBand", "isBand()Z", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DeviceModel p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.A9());
    }
}
