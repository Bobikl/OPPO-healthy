package io.reactivex.internal.util;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.v2j;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final cv5 upstream;

        public DisposableNotification(cv5 cv5Var) {
            this.upstream = cv5Var;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Throwable f20512e;

        public ErrorNotification(Throwable th) {
            this.f20512e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return abd.c(this.f20512e, ((ErrorNotification) obj).f20512e);
            }
            return false;
        }

        public int hashCode() {
            return this.f20512e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f20512e + "]";
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
            v2jVar.onError(((ErrorNotification) obj).f20512e);
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
            v2jVar.onError(((ErrorNotification) obj).f20512e);
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

    public static Object disposable(cv5 cv5Var) {
        return new DisposableNotification(cv5Var);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static cv5 getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f20512e;
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

    public static <T> boolean accept(Object obj, bed<? super T> bedVar) {
        if (obj == COMPLETE) {
            bedVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            bedVar.onError(((ErrorNotification) obj).f20512e);
            return true;
        }
        bedVar.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, bed<? super T> bedVar) {
        if (obj == COMPLETE) {
            bedVar.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            bedVar.onError(((ErrorNotification) obj).f20512e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            bedVar.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        bedVar.onNext(obj);
        return false;
    }
}
