package com.oplus.aiunit.vision;

import com.heytap.health.devicepair.manager.ResultData;
import com.opos.process.bridge.base.BridgeConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/u83;", "", "", "watchAccountName", "phoneAccountName", "", "a", "Lcom/heytap/health/devicepair/manager/ResultData;", BridgeConstant.KEY_RESULT_DATA, "b", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class u83 {
    public abstract void a(@NotNull String watchAccountName, @NotNull String phoneAccountName);

    public abstract void b(@NotNull ResultData resultData);
}
