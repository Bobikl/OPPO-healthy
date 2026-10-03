package com.oplus.aiunit.vision;

import android.os.Binder;
import com.heytap.health.base.splitapk.connection.SplitRequestParam;
import com.heytap.health.base.splitapk.connection.SplitResponse;
import com.heytap.store.business.rn.service.RnConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/c7i;", "Landroid/os/Binder;", "Lcom/heytap/health/base/splitapk/connection/SplitRequestParam;", RnConstant.KEY_INIT_OPTIONS, "Lcom/heytap/health/base/splitapk/connection/SplitResponse;", "a", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public class c7i extends Binder {
    @NotNull
    public SplitResponse a(@NotNull SplitRequestParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return new SplitResponse(-1, "");
    }
}
