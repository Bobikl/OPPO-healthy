package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/w25;", "", "", "a", "I", "()I", "d", "(I)V", "addedVersion", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "tableName", "", "Lcom/oplus/aiunit/vision/p7a;", "[Lcom/oplus/aiunit/vision/p7a;", "()[Lcom/oplus/aiunit/vision/p7a;", "e", "([Lcom/oplus/aiunit/vision/p7a;)V", "indices", "<init>", "()V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class w25 {
    public int a;

    @Nullable
    public String b;

    @NotNull
    public p7a[] c = new p7a[0];

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getA() {
        return this.a;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final p7a[] getC() {
        return this.c;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final void d(int i) {
        this.a = i;
    }

    public final void e(@NotNull p7a[] p7aVarArr) {
        Intrinsics.checkParameterIsNotNull(p7aVarArr, "<set-?>");
        this.c = p7aVarArr;
    }

    public final void f(@Nullable String str) {
        this.b = str;
    }
}
