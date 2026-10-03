package com.heytap.health.devicemanager.client;

import com.heytap.health.devicemanager.manager.IDeviceManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/heytap/health/devicemanager/manager/IDeviceManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CDM2Connect$getCurrConnectIngMac$1 extends Lambda implements Function1<IDeviceManager, String> {
    public static final CDM2Connect$getCurrConnectIngMac$1 INSTANCE = new CDM2Connect$getCurrConnectIngMac$1();

    public CDM2Connect$getCurrConnectIngMac$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @Nullable
    public final String invoke(@NotNull IDeviceManager it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCurrConnectIngMac();
    }
}
