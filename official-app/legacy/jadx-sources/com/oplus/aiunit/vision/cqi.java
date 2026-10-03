package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/cqi;", "Lcom/oplus/aiunit/vision/bqi;", "", "b", "()V", "finish", "", "a", "Lcom/oplus/aiunit/vision/sxg;", "Lcom/oplus/aiunit/vision/sxg;", "setupEngine", "Z", "isValid", "<init>", "(Lcom/oplus/aiunit/vision/sxg;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class cqi implements bqi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final sxg setupEngine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isValid;

    public cqi(@NotNull sxg setupEngine) {
        Intrinsics.checkNotNullParameter(setupEngine, "setupEngine");
        this.setupEngine = setupEngine;
        this.isValid = true;
    }

    @Override // com.oplus.aiunit.vision.bqi
    public boolean a() {
        return this.setupEngine.i();
    }

    public final void b() {
        this.isValid = false;
    }

    @Override // com.oplus.aiunit.vision.bqi
    public void finish() {
        if (this.isValid) {
            this.setupEngine.e();
        }
    }
}
