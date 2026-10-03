package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class brd<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b<Object> f9829e = new a();
    public final T a;
    public final b<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9830c;
    public volatile byte[] d;

    public class a implements b<Object> {
        @Override // com.oplus.aiunit.vision.brd.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public brd(@NonNull String str, @Nullable T t, @NonNull b<T> bVar) {
        this.f9830c = cpe.b(str);
        this.a = t;
        this.b = (b) cpe.d(bVar);
    }

    @NonNull
    public static <T> brd<T> a(@NonNull String str, @Nullable T t, @NonNull b<T> bVar) {
        return new brd<>(str, t, bVar);
    }

    @NonNull
    public static <T> b<T> b() {
        return (b<T>) f9829e;
    }

    @NonNull
    public static <T> brd<T> e(@NonNull String str) {
        return new brd<>(str, null, b());
    }

    @NonNull
    public static <T> brd<T> f(@NonNull String str, @NonNull T t) {
        return new brd<>(str, t, b());
    }

    @Nullable
    public T c() {
        return this.a;
    }

    @NonNull
    public final byte[] d() {
        if (this.d == null) {
            this.d = this.f9830c.getBytes(ona.CHARSET);
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof brd) {
            return this.f9830c.equals(((brd) obj).f9830c);
        }
        return false;
    }

    public void g(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.b.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f9830c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f9830c + "'}";
    }
}
