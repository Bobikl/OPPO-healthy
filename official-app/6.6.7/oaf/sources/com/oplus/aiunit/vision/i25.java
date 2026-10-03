package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u001c\u0010\u001eB3\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\b\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/i25;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "dbName", "", "b", "I", "c", "()I", "dbVersion", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "()[Ljava/lang/Class;", "dbTableClasses", "", "d", "Z", "e", "()Z", "mainIOCheck", "Lcom/oplus/aiunit/vision/r26;", "Lcom/oplus/aiunit/vision/r26;", "()Lcom/oplus/aiunit/vision/r26;", "mDowngradeCallback", "<init>", "(Ljava/lang/String;I[Ljava/lang/Class;ZLcom/oplus/aiunit/vision/r26;)V", "(Ljava/lang/String;I[Ljava/lang/Class;)V", "(Ljava/lang/String;I[Ljava/lang/Class;Lcom/oplus/aiunit/vision/r26;)V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class i25 {

    @NotNull
    public final String a;
    public final int b;

    @NotNull
    public final Class<?>[] c;
    public final boolean d;

    @NotNull
    public final r26 e;

    public i25(@NotNull String str, int i, @NotNull Class<?>[] clsArr, boolean z, @NotNull r26 r26Var) {
        Intrinsics.checkParameterIsNotNull(str, "dbName");
        Intrinsics.checkParameterIsNotNull(clsArr, "dbTableClasses");
        Intrinsics.checkParameterIsNotNull(r26Var, "mDowngradeCallback");
        this.d = z;
        this.c = clsArr;
        this.a = str;
        this.b = i;
        this.e = r26Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @NotNull
    public final Class<?>[] b() {
        return this.c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final r26 getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i25(@NotNull String str, int i, @NotNull Class<?>[] clsArr) {
        this(str, i, clsArr, false, new r26());
        Intrinsics.checkParameterIsNotNull(str, "dbName");
        Intrinsics.checkParameterIsNotNull(clsArr, "dbTableClasses");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i25(@NotNull String str, int i, @NotNull Class<?>[] clsArr, @NotNull r26 r26Var) {
        this(str, i, clsArr, false, r26Var);
        Intrinsics.checkParameterIsNotNull(str, "dbName");
        Intrinsics.checkParameterIsNotNull(clsArr, "dbTableClasses");
        Intrinsics.checkParameterIsNotNull(r26Var, "mDowngradeCallback");
    }
}
