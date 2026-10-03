package com.oplus.aiunit.vision;

import com.heytap.health.operations.bean.MedalListBean;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class tod implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((MedalListBean) obj).getAcquisitionDate();
    }
}
