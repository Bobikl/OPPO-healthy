package com.oplus.aiunit.vision;

import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
public final class ywj implements Runnable {
    public final /* synthetic */ Function0 i;

    public ywj(Function0 function0) {
        this.i = function0;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        Intrinsics.checkNotNullExpressionValue(this.i.invoke(), "invoke(...)");
    }
}
