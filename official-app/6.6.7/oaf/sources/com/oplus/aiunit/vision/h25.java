package com.oplus.aiunit.vision;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u001f\u0010\u000e¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/h25;", "", "", "a", "I", "()I", "f", "(I)V", "addedVersion", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "columnName", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "()Ljava/lang/Class;", "h", "(Ljava/lang/Class;)V", "columnType", "", "d", "Z", "e", "()Z", "j", "(Z)V", "isUnique", "i", "defaultValue", "<init>", "()V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class h25 {
    public int a = 1;

    @Nullable
    public String b;

    @Nullable
    public Class<?> c;
    public boolean d;

    @Nullable
    public String e;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getA() {
        return this.a;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Nullable
    public final Class<?> c() {
        return this.c;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    public final void f(int i) {
        this.a = i;
    }

    public final void g(@Nullable String str) {
        this.b = str;
    }

    public final void h(@Nullable Class<?> cls) {
        this.c = cls;
    }

    public final void i(@Nullable String str) {
        this.e = str;
    }

    public final void j(boolean z) {
        this.d = z;
    }
}
