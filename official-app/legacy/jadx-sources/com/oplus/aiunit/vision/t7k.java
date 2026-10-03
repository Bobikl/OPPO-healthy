package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.common.DataType;
import com.oplus.nearx.track.internal.remoteconfig.RemoteGlobalConfigManager;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/t7k;", "", "", y15.PARAMS_DATA_TYPE, "Lcom/oplus/aiunit/vision/bw9;", "remoteConfigManager", "", "b", "a", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class t7k {

    @NotNull
    public static final t7k INSTANCE = new t7k();

    @NotNull
    public final String a(int dataType) {
        if (dataType == DataType.BIZ.getDataType()) {
            return RemoteGlobalConfigManager.INSTANCE.f();
        }
        return dataType == DataType.TECH.getDataType() ? RemoteGlobalConfigManager.INSTANCE.k() : "";
    }

    @NotNull
    public final String b(int dataType, @NotNull bw9 remoteConfigManager) {
        Intrinsics.checkNotNullParameter(remoteConfigManager, "remoteConfigManager");
        if (dataType == DataType.BIZ.getDataType()) {
            return remoteConfigManager.j();
        }
        return dataType == DataType.TECH.getDataType() ? remoteConfigManager.d() : "";
    }
}
