package io.reactivex.rxjava3.processors;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.ou7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class PublishProcessor<T> extends ou7<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final PublishSubscription[] f20635l = new PublishSubscription[0];
    public static final PublishSubscription[] m = new PublishSubscription[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<PublishSubscription<T>[]> f20636j = new AtomicReference<>(m);
    public Throwable k;

    public static final class PublishSubscription<T> extends AtomicLong implements c3j {
        private static final long serialVersionUID = 3562861878281475070L;
        final v2j<? super T> downstream;
        final PublishProcessor<T> parent;

        public PublishSubscription(v2j<? super T> v2jVar, PublishProcessor<T> publishProcessor) {
            this.downstream = v2jVar;
            this.parent = publishProcessor;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.G(this);
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        public boolean isFull() {
            return get() == 0;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                g4g.u(th);
            }
        }

        public void onNext(T t) {
            long j2 = get();
            if (j2 == Long.MIN_VALUE) {
                return;
            }
            if (j2 != 0) {
                this.downstream.onNext(t);
                vr0.f(this, 1L);
            } else {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                vr0.b(this, j2);
            }
        }
    }

    public static <T> PublishProcessor<T> F() {
        return new PublishProcessor<>();
    }

    public boolean E(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f20636j.get();
            if (publishSubscriptionArr == f20635l) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!fue.a(this.f20636j, publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    public void G(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f20636j.get();
            if (publishSubscriptionArr == f20635l || publishSubscriptionArr == m) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishSubscriptionArr[i] == publishSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr2 = m;
            } else {
                PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i);
                System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr3, i, (length - i) - 1);
                publishSubscriptionArr2 = publishSubscriptionArr3;
            }
        } while (!fue.a(this.f20636j, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.f20636j.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f20635l;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            return;
        }
        PublishSubscription<T>[] andSet = this.f20636j.getAndSet(publishSubscriptionArr2);
        for (PublishSubscription<T> publishSubscription : andSet) {
            publishSubscription.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        PublishSubscription<T>[] publishSubscriptionArr = this.f20636j.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f20635l;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            g4g.u(th);
            return;
        }
        this.k = th;
        PublishSubscription<T>[] andSet = this.f20636j.getAndSet(publishSubscriptionArr2);
        for (PublishSubscription<T> publishSubscription : andSet) {
            publishSubscription.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        ExceptionHelper.c(t, "onNext called with a null value.");
        for (PublishSubscription<T> publishSubscription : this.f20636j.get()) {
            publishSubscription.onNext(t);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (this.f20636j.get() == f20635l) {
            c3jVar.cancel();
        } else {
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(v2jVar, this);
        v2jVar.onSubscribe(publishSubscription);
        if (E(publishSubscription)) {
            if (publishSubscription.isCancelled()) {
                G(publishSubscription);
            }
        } else {
            Throwable th = this.k;
            if (th != null) {
                v2jVar.onError(th);
            } else {
                v2jVar.onComplete();
            }
        }
    }
}
