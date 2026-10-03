package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes18.dex */
public abstract class w60<T> implements v60<T> {
    public Handler a = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public final /* synthetic */ Object i;

        public a(Object obj) {
            this.i = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            w60.this.b(this.i);
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
            w60.this.c(this.i);
        }
    }

    @Override // com.oplus.aiunit.vision.v60
    public void a(Object obj) {
        this.a.post(new a(obj));
    }

    public abstract void b(Object obj);

    public abstract void c(T t);

    @Override // com.oplus.aiunit.vision.v60
    public void onResult(T t) {
        this.a.post(new b(t));
    }
}
