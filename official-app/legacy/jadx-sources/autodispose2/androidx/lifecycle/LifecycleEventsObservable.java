package autodispose2.androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cd1;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.seb;
import com.oplus.aiunit.vision.xn0;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LifecycleEventsObservable extends lbd<Lifecycle.Event> {
    public final Lifecycle i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cd1<Lifecycle.Event> f349j = cd1.v1();

    public static final class AutoDisposeLifecycleObserver extends seb implements LifecycleObserver {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Lifecycle f350j;
        public final aed<? super Lifecycle.Event> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final cd1<Lifecycle.Event> f351l;

        public AutoDisposeLifecycleObserver(Lifecycle lifecycle, aed<? super Lifecycle.Event> aedVar, cd1<Lifecycle.Event> cd1Var) {
            this.f350j = lifecycle;
            this.k = aedVar;
            this.f351l = cd1Var;
        }

        @Override // com.oplus.aiunit.vision.seb
        public void a() {
            this.f350j.removeObserver(this);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public void onStateChange(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (isDisposed()) {
                return;
            }
            if (event != Lifecycle.Event.ON_CREATE || this.f351l.w1() != event) {
                this.f351l.onNext(event);
            }
            this.k.onNext(event);
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            a = iArr;
            try {
                iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Lifecycle.State.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Lifecycle.State.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Lifecycle.State.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Lifecycle.State.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public LifecycleEventsObservable(Lifecycle lifecycle) {
        this.i = lifecycle;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super Lifecycle.Event> aedVar) {
        AutoDisposeLifecycleObserver autoDisposeLifecycleObserver = new AutoDisposeLifecycleObserver(this.i, aedVar, this.f349j);
        aedVar.onSubscribe(autoDisposeLifecycleObserver);
        if (!xn0.b()) {
            aedVar.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.i.addObserver(autoDisposeLifecycleObserver);
        if (autoDisposeLifecycleObserver.isDisposed()) {
            this.i.removeObserver(autoDisposeLifecycleObserver);
        }
    }

    public void t1() {
        Lifecycle.Event event;
        int i = a.a[this.i.getState().ordinal()];
        if (i == 1) {
            event = Lifecycle.Event.ON_CREATE;
        } else if (i != 2) {
            event = (i == 3 || i == 4) ? Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_DESTROY;
        } else {
            event = Lifecycle.Event.ON_START;
        }
        this.f349j.onNext(event);
    }

    public Lifecycle.Event u1() {
        return this.f349j.w1();
    }
}
