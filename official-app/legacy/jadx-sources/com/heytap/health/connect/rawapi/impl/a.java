package com.heytap.health.connect.rawapi.impl;

import com.oplus.aiunit.vision.je1;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/a;", "Lcom/oplus/aiunit/vision/je1;", "Lcom/oplus/aiunit/vision/je1$a;", "listener", "", "a", "Lcom/heytap/health/connect/rawapi/impl/b;", "Lcom/heytap/health/connect/rawapi/impl/b;", "getLCbManager", "()Lcom/heytap/health/connect/rawapi/impl/b;", "lCbManager", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class a implements je1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final b lCbManager = b.INSTANCE.a();

    @Override // com.oplus.aiunit.vision.je1
    public void a(@NotNull je1.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.lCbManager.n0(listener);
    }
}
