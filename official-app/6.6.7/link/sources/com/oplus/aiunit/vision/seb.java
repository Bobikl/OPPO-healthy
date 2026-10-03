package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\f\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/seb;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "ip", "", "b", "I", "d", "()I", "port", "e", "(I)V", "hbInterval", "f", "hbTimeout", "<init>", "(Ljava/lang/String;III)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final class seb {

    @NotNull
    public final String a;
    public final int b;
    public int c;
    public int d;

    public seb(@NotNull String str, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "ip");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public final void e(int i) {
        this.c = i;
    }

    public final void f(int i) {
        this.d = i;
    }
}
