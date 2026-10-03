package com.heytap.health.watchface.adaptation.device.ow5;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class Ow5DataManager$onGetSyncMsg$isWatchTaycan$1 extends FunctionReferenceImpl implements Function1<DeviceModel, Boolean> {
    public static final Ow5DataManager$onGetSyncMsg$isWatchTaycan$1 INSTANCE = new Ow5DataManager$onGetSyncMsg$isWatchTaycan$1();

    public Ow5DataManager$onGetSyncMsg$isWatchTaycan$1() {
        super(1, DeviceModel.class, "isWatchTaycan", "isWatchTaycan()Z", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DeviceModel p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.ka());
    }
}
