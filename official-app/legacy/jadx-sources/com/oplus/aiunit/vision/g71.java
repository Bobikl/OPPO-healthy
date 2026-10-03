package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004J\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "", "", "b", "c", "", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class g71 implements gea<h6e, i6e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "PairStep";

    public final void b(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        j3d.INSTANCE.b(this.TAG, obj);
    }

    public final void c(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        j3d.INSTANCE.c(this.TAG, obj);
    }
}
