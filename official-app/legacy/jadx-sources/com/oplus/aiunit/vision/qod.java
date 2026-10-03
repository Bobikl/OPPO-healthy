package com.oplus.aiunit.vision;

import com.heytap.health.operations.bean.MedalListBean;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class qod implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((MedalListBean) obj).isOnline();
    }
}
