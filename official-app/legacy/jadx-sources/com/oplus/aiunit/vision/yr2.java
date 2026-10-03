package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.cqf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0003B3\u0012*\u0010\u000b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R(\u0010\u000b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/yr2;", "Lcom/oplus/aiunit/vision/cqf;", "Req", "", "Rsp", "req", "a", "(Lcom/oplus/aiunit/vision/cqf;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/oplus/aiunit/vision/gea;", "[Lcom/oplus/aiunit/vision/gea;", "interceptors", "<init>", "([Lcom/oplus/aiunit/vision/gea;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class yr2<Req extends cqf, Rsp> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gea<Req, Rsp>[] interceptors;

    public yr2(@NotNull gea<Req, Rsp>... interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
    }

    @Nullable
    public final Object a(@NotNull Req req, @NotNull Continuation<? super Rsp> continuation) {
        return new mcf(ArraysKt___ArraysKt.toList(this.interceptors), req, 0, 4, null).a(req, continuation);
    }
}
