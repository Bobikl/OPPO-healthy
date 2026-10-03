package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0018\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0004R#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/bvf;", ExifInterface.GPS_DIRECTION_TRUE, "", "b", "()Ljava/lang/Object;", "default", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "Lkotlin/Result;", "Ljava/lang/Object;", "result", "<init>", "(Ljava/lang/Object;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class bvf<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object result;

    public bvf(@NotNull Object obj) {
        this.result = obj;
    }

    public final T a(T t) {
        T t2 = (T) this.result;
        return Result.m5293isFailureimpl(t2) ? t : t2;
    }

    @Nullable
    public final T b() {
        T t = (T) this.result;
        if (Result.m5293isFailureimpl(t)) {
            return null;
        }
        return t;
    }

    public final T c() throws Exception {
        T t = (T) this.result;
        ResultKt.throwOnFailure(t);
        return t;
    }
}
