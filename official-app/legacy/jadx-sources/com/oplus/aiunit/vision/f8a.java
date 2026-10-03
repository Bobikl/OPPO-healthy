package com.oplus.aiunit.vision;

import android.app.Application;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class f8a {
    public final List<a8a> a;
    public final p90 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11263c;

    public class a implements mn0.c {
        public final /* synthetic */ a8a a;

        public a(a8a a8aVar) {
            this.a = a8aVar;
        }

        @Override // com.oplus.aiunit.vision.mn0.c
        public boolean a() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.mn0.c
        public void task() {
            this.a.initAfterInternetAgreed();
        }
    }

    public class b implements mn0.c {
        public final /* synthetic */ a8a a;

        public b(a8a a8aVar) {
            this.a = a8aVar;
        }

        @Override // com.oplus.aiunit.vision.mn0.c
        public boolean a() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.mn0.c
        public void task() {
            this.a.initAfterPrivacyAgreed();
        }
    }

    public f8a(g8a g8aVar, p90 p90Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.b = p90Var;
        this.f11263c = 20;
        this.a = h(g8aVar.a());
        a7b.f("InitializerExecutor", "InitializerExecutor: cost time is " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", open DEBUG is false");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(List list) {
        for (int i = 0; i < list.size(); i++) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            a8a a8aVar = (a8a) list.get(i);
            a8aVar.init();
            mn0.g().h(new a(a8aVar));
            mn0.g().i(new b(a8aVar));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 > this.f11263c) {
                i(a8aVar, jCurrentTimeMillis2, "performInit background");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("performInit background initializer is ");
            sb.append(a8aVar);
            sb.append(" cost time is ");
            sb.append(jCurrentTimeMillis2);
        }
    }

    public static /* synthetic */ int e(a8a a8aVar, a8a a8aVar2) {
        return a8aVar2.getPriority() - a8aVar.getPriority();
    }

    public final void c(Runnable runnable) {
        if (runnable != null) {
            new qv8(runnable, "InitializerE").start();
        }
    }

    public void f(Application application) {
        lrk.a("performAttachContext_start");
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (a8a a8aVar : this.a) {
            lrk.a("performAttachContext_" + a8aVar.getClass().getSimpleName());
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            a8aVar.attachContext(application);
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
            if (jCurrentTimeMillis3 > this.f11263c) {
                i(a8aVar, jCurrentTimeMillis3, "performAttachContext");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("executeAttachContext initializer is ");
            sb.append(a8aVar);
            sb.append(" cost time is ");
            sb.append(jCurrentTimeMillis3);
            lrk.b();
        }
        a7b.f("InitializerExecutor", "executeAttachContext: total cost time is " + (System.currentTimeMillis() - jCurrentTimeMillis));
        lrk.b();
    }

    public void g() {
        lrk.a("performInit_start");
        final ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (final a8a a8aVar : this.a) {
            if (a8aVar.getPriority() > 100) {
                lrk.a("performInit_init_" + a8aVar.getClass().getSimpleName());
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                a8aVar.init();
                lrk.b();
                lrk.a("performInit_initAfterInternetAgreed_" + a8aVar.getClass().getSimpleName());
                mn0.g().h(new mn0.c() { // from class: com.oplus.aiunit.vision.c8a
                    @Override // com.oplus.aiunit.vision.mn0.c
                    public final void task() {
                        a8aVar.initAfterInternetAgreed();
                    }
                });
                lrk.b();
                lrk.a("performInit_initAfterPrivacyAgreed_" + a8aVar.getClass().getSimpleName());
                mn0.g().i(new mn0.c() { // from class: com.oplus.aiunit.vision.d8a
                    @Override // com.oplus.aiunit.vision.mn0.c
                    public final void task() {
                        a8aVar.initAfterPrivacyAgreed();
                    }
                });
                lrk.b();
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (jCurrentTimeMillis3 > this.f11263c) {
                    i(a8aVar, jCurrentTimeMillis3, "performInit main thread");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("performInit initializer is ");
                sb.append(a8aVar);
                sb.append(" cost time is ");
                sb.append(jCurrentTimeMillis3);
            } else {
                arrayList.add(a8aVar);
            }
        }
        c(arrayList.isEmpty() ? null : new Runnable() { // from class: com.oplus.aiunit.vision.e8a
            @Override // java.lang.Runnable
            public final void run() {
                this.i.d(arrayList);
            }
        });
        a7b.f("InitializerExecutor", "executeInit: total cost time is " + (System.currentTimeMillis() - jCurrentTimeMillis));
        lrk.b();
    }

    public final List<a8a> h(List<a8a> list) {
        list.sort(new Comparator() { // from class: com.oplus.aiunit.vision.b8a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f8a.e((a8a) obj, (a8a) obj2);
            }
        });
        return list;
    }

    public final void i(a8a a8aVar, long j2, String str) {
        a8aVar.timeout(j2);
        k0k.a(a8aVar, j2, this.b, str);
    }
}
