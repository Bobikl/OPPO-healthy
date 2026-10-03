package com.heytap.health.devicepair.migrate;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "invoke", "(Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class MigrateGuideActivity$Companion$start$1$pairType$1 extends Lambda implements Function1<DeviceInfo, Boolean> {
    public static final MigrateGuideActivity$Companion$start$1$pairType$1 INSTANCE = new MigrateGuideActivity$Companion$start$1$pairType$1();

    public MigrateGuideActivity$Companion$start$1$pairType$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
        Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
        return Boolean.valueOf(applyInfo.Ra());
    }
}
