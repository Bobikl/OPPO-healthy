package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/q43;", "Lcom/oplus/aiunit/vision/fqa;", "<init>", "()V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"StaticFieldLeak"})
public final class q43 extends fqa {

    @NotNull
    public static final q43 INSTANCE = new q43();

    /* JADX WARN: Illegal instructions before constructor call */
    public q43() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        super(contextA);
    }
}
