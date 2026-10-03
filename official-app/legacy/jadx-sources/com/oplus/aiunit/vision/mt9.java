package com.oplus.aiunit.vision;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/mt9;", "", "Ljava/io/Closeable;", "closeable", "", "a", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class mt9 {

    @NotNull
    public static final mt9 INSTANCE = new mt9();

    @JvmStatic
    public static final void a(@Nullable Closeable closeable) {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (closeable == null) {
                unit = null;
            } else {
                closeable.close();
                unit = Unit.INSTANCE;
            }
            Result.m5287constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
    }
}
