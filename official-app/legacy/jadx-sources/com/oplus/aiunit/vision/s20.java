package com.oplus.aiunit.vision;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import autodispose2.OutsideScopeException;
import autodispose2.androidx.lifecycle.LifecycleEventsObservable;
import autodispose2.lifecycle.LifecycleEndedException;

/* JADX INFO: loaded from: classes12.dex */
public final class s20 implements dwa<Lifecycle.Event> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ta4<Lifecycle.Event> f16446c = new ta4() { // from class: com.oplus.aiunit.vision.r20
        @Override // com.oplus.aiunit.vision.ta4, com.oplus.aiunit.vision.d08
        public final Object apply(Object obj) {
            return s20.k((Lifecycle.Event) obj);
        }
    };
    public final ta4<Lifecycle.Event> a;
    public final LifecycleEventsObservable b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class b implements ta4<Lifecycle.Event> {
        public final Lifecycle.Event i;

        public b(Lifecycle.Event event) {
            this.i = event;
        }

        @Override // com.oplus.aiunit.vision.ta4, com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Lifecycle.Event apply(Lifecycle.Event event) throws OutsideScopeException {
            return this.i;
        }
    }

    public s20(Lifecycle lifecycle, ta4<Lifecycle.Event> ta4Var) {
        this.b = new LifecycleEventsObservable(lifecycle);
        this.a = ta4Var;
    }

    public static s20 f(Lifecycle lifecycle) {
        return h(lifecycle, f16446c);
    }

    public static s20 g(Lifecycle lifecycle, Lifecycle.Event event) {
        return h(lifecycle, new b(event));
    }

    public static s20 h(Lifecycle lifecycle, ta4<Lifecycle.Event> ta4Var) {
        return new s20(lifecycle, ta4Var);
    }

    public static s20 i(LifecycleOwner lifecycleOwner) {
        return f(lifecycleOwner.getLifecycle());
    }

    public static s20 j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        return g(lifecycleOwner.getLifecycle(), event);
    }

    public static /* synthetic */ Lifecycle.Event k(Lifecycle.Event event) throws OutsideScopeException {
        int i = a.a[event.ordinal()];
        if (i == 1) {
            return Lifecycle.Event.ON_DESTROY;
        }
        if (i == 2) {
            return Lifecycle.Event.ON_STOP;
        }
        if (i == 3) {
            return Lifecycle.Event.ON_PAUSE;
        }
        if (i == 4) {
            return Lifecycle.Event.ON_STOP;
        }
        throw new LifecycleEndedException("Lifecycle has ended! Last event was " + event);
    }

    @Override // com.oplus.aiunit.vision.dwa
    public lbd<Lifecycle.Event> a() {
        return this.b;
    }

    @Override // com.oplus.aiunit.vision.nig
    public ds3 c() {
        return hwa.e(this);
    }

    @Override // com.oplus.aiunit.vision.dwa
    public ta4<Lifecycle.Event> d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.dwa
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Lifecycle.Event b() {
        this.b.t1();
        return this.b.u1();
    }
}
