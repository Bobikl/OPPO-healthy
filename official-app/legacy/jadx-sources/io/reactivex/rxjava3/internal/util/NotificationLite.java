package io.reactivex.rxjava3.internal.util;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.disposables.a;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final a upstream;

        public DisposableNotification(a aVar) {
            this.upstream = aVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Throwable f20634e;

        public ErrorNotification(Throwable th) {
            this.f20634e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return Objects.equals(this.f20634e, ((ErrorNotification) obj).f20634e);
            }
            return false;
        }

        public int hashCode() {
            return this.f20634e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f20634e + "]";
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final c3j upstream;

        public SubscriptionNotification(c3j c3jVar) {
            this.upstream = c3jVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    public static <T> boolean accept(Object obj, v2j<? super T> v2jVar) {
        if (obj == COMPLETE) {
            v2jVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            v2jVar.onError(((ErrorNotification) obj).f20634e);
            return true;
        }
        v2jVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, v2j<? super T> v2jVar) {
        if (obj == COMPLETE) {
            v2jVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            v2jVar.onError(((ErrorNotification) obj).f20634e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            v2jVar.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        v2jVar.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(a aVar) {
        return new DisposableNotification(aVar);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static a getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f20634e;
    }

    public static c3j getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(c3j c3jVar) {
        return new SubscriptionNotification(c3jVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, aed<? super T> aedVar) {
        if (obj == COMPLETE) {
            aedVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            aedVar.onError(((ErrorNotification) obj).f20634e);
            return true;
        }
        aedVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, aed<? super T> aedVar) {
        if (obj == COMPLETE) {
            aedVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            aedVar.onError(((ErrorNotification) obj).f20634e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            aedVar.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        aedVar.onNext(obj);
        return false;
    }
}
