package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public abstract class tjk<T> {
    public static final int ERROR_BUILD_COMMAND_FAIL = 10002;
    public static final int ERROR_EXCEPTION = 10004;
    public static final int ERROR_ILLEGA_ARGUMENT = 10001;
    public static final int ERROR_PARSE_FAIL = 10003;
    public static final int ERROR_UPDATE_FAIL = 10000;
    public d<T> a;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            tjk.this.c();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Object i;

        public b(Object obj) {
            this.i = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            tjk.this.a.a(this.i);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f17047j;

        public c(int i, String str) {
            this.i = i;
            this.f17047j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            tjk.this.a.b(this.i, this.f17047j);
        }
    }

    public interface d<T> {
        void a(T t);

        void b(int i, String str);
    }

    public void b() {
    }

    public abstract void c();

    public final void d(int i, String str) {
        b();
        if (this.a != null) {
            e(new c(i, str));
        }
    }

    public final void e(Runnable runnable) {
        crc.a().b().execute(runnable);
    }

    public final void f(T t) {
        b();
        t6b.b("Updater", "mCallback: " + this.a + "   t: " + t);
        if (this.a != null) {
            e(new b(t));
        }
    }

    public final void g(d<T> dVar) {
        this.a = dVar;
        e(new a());
    }
}
