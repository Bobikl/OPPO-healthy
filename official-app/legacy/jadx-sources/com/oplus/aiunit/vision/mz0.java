package com.oplus.aiunit.vision;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes18.dex */
public abstract class mz0<T> implements c70<T> {
    protected static final String TAG = "BaseApduJob";
    private SoftReference<v60<T>> mCallback;

    public class a implements Runnable {
        public final /* synthetic */ Object i;

        public a(Object obj) {
            this.i = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            v60 v60Var;
            if (mz0.this.mCallback == null || (v60Var = (v60) mz0.this.mCallback.get()) == 0) {
                return;
            }
            v60Var.onResult(this.i);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Object i;

        public b(Object obj) {
            this.i = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            v60 v60Var;
            if (mz0.this.mCallback == null || (v60Var = (v60) mz0.this.mCallback.get()) == null) {
                return;
            }
            v60Var.a(this.i);
        }
    }

    public void notifyFailed(Object obj) {
        t6b.i(TAG, "notifyFailed " + obj.toString());
        sr0.g(new b(obj));
    }

    public void notifyResult(T t) {
        sr0.i(new a(t));
    }

    public void setCallback(v60<T> v60Var) {
        if (v60Var == null) {
            this.mCallback = null;
        } else {
            this.mCallback = new SoftReference<>(v60Var);
        }
    }
}
