package com.oplus.aiunit.vision;

import androidx.core.util.Supplier;
import com.heytap.health.connect.rawapi.NodeApi;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class nb7 implements Supplier {
    public final /* synthetic */ NodeApi a;

    @Override // androidx.core.util.Supplier
    public final Object get() {
        return this.a.getActiveNodeId();
    }
}
