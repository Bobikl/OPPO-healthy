package com.oplus.aiunit.vision;

import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/sjd;", "Lcom/oplus/aiunit/vision/dv5;", "Lkotlinx/coroutines/Deferred;", "Lcom/oplus/aiunit/vision/m4a;", "a", "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "job", "<init>", "(Lkotlinx/coroutines/Deferred;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class sjd implements dv5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Deferred<m4a> job;

    /* JADX WARN: Multi-variable type inference failed */
    public sjd(@NotNull Deferred<? extends m4a> deferred) {
        this.job = deferred;
    }
}
