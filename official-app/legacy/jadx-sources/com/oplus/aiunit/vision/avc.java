package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class avc<T> {
    public static final avc<Object> b = new avc<>(null);
    public final Object a;

    public avc(Object obj) {
        this.a = obj;
    }

    public static <T> avc<T> a() {
        return (avc<T>) b;
    }

    public static <T> avc<T> b(Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new avc<>(NotificationLite.error(th));
    }

    public static <T> avc<T> c(T t) {
        Objects.requireNonNull(t, "value is null");
        return new avc<>(t);
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
        if (obj instanceof avc) {
            return Objects.equals(this.a, ((avc) obj).a);
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
