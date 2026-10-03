package com.oplus.aiunit.vision;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes10.dex */
public final class bvc<T> {
    public static final bvc<Object> b = new bvc<>(null);
    public final Object a;

    public bvc(Object obj) {
        this.a = obj;
    }

    public static <T> bvc<T> a() {
        return (bvc<T>) b;
    }

    public static <T> bvc<T> b(Throwable th) {
        abd.d(th, "error is null");
        return new bvc<>(NotificationLite.error(th));
    }

    public static <T> bvc<T> c(T t) {
        abd.d(t, "value is null");
        return new bvc<>(t);
    }

    public Throwable d() {
        Object obj = this.a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    public boolean e() {
        return NotificationLite.isError(this.a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof bvc) {
            return abd.c(this.a, ((bvc) obj).a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.a + "]";
    }
}
