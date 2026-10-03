package com.heytap.health.watch.records.utils;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.lc5;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watch/records/utils/SyncUtil;", "", "", "a", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SyncUtil {

    @NotNull
    public static final SyncUtil INSTANCE = new SyncUtil();

    public final boolean a() {
        return ilj.x() && !((Boolean) lc5.c(gl4.managerApi.getCurrActiveMac()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.watch.records.utils.SyncUtil$isSupportAutoSync$isNoSupportSyncWatchColumbus$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                return Boolean.valueOf(applyInfo.ea() && !applyInfo.Sa(190));
            }
        })).booleanValue();
    }
}
