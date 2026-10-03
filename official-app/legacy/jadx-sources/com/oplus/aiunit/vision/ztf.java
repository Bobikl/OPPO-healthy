package com.oplus.aiunit.vision;

import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Protocol;
import okhttp3.Request;

/* JADX INFO: loaded from: classes11.dex */
public final class ztf<T> {
    public final ytf a;

    @Nullable
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final cuf f19549c;

    public ztf(ytf ytfVar, @Nullable T t, @Nullable cuf cufVar) {
        this.a = ytfVar;
        this.b = t;
        this.f19549c = cufVar;
    }

    public static <T> ztf<T> c(int i, cuf cufVar) {
        Objects.requireNonNull(cufVar, "body == null");
        if (i >= 400) {
            return d(cufVar, new ytf.a().b(new dfd.c(cufVar.getK(), cufVar.getF10249l())).g(i).m("Response.error()").p(Protocol.HTTP_1_1).s(new Request.Builder().url("http://localhost/").build()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    public static <T> ztf<T> d(cuf cufVar, ytf ytfVar) {
        Objects.requireNonNull(cufVar, "body == null");
        Objects.requireNonNull(ytfVar, "rawResponse == null");
        if (ytfVar.b()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new ztf<>(ytfVar, null, cufVar);
    }

    public static <T> ztf<T> i(@Nullable T t, ytf ytfVar) {
        Objects.requireNonNull(ytfVar, "rawResponse == null");
        if (ytfVar.b()) {
            return new ztf<>(ytfVar, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.getCode();
    }

    @Nullable
    public cuf e() {
        return this.f19549c;
    }

    public gj8 f() {
        return this.a.getHeaders();
    }

    public boolean g() {
        return this.a.b();
    }

    public String h() {
        return this.a.getMessage();
    }

    public String toString() {
        return this.a.toString();
    }
}
