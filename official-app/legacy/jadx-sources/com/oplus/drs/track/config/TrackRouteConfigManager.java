package com.oplus.drs.track.config;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/drs/track/config/TrackRouteConfigManager;", "", "Lcom/oplus/drs/track/config/TrackApiRouteType;", "a", "type", "", "b", "itemType", "Lcom/oplus/drs/track/config/TrackApiRouteType;", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class TrackRouteConfigManager {

    @NotNull
    public static final TrackRouteConfigManager INSTANCE = new TrackRouteConfigManager();

    @NotNull
    private static TrackApiRouteType itemType = TrackApiRouteType.DRS_REMOTE_IPC;

    @NotNull
    public final TrackApiRouteType a() {
        return itemType;
    }

    public final void b(@NotNull TrackApiRouteType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        itemType = type;
    }
}
