package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.network.core.BaseResponse;

/* JADX INFO: loaded from: classes15.dex */
public class nnc<T> {
    public static final int CODE_COURSE_HAS_JOINED_22401 = 22401;
    public static final int CODE_FAIL = 444;
    public static final int CODE_SUCCESS = 200;
    public T a;
    public Throwable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14565c = 200;
    public String d = "";

    public static abstract class a<T> extends u61<T> {
        public nnc<T> i;

        @Override // com.oplus.aiunit.vision.u61
        public void a(BaseResponse baseResponse) {
            super.a(baseResponse);
            nnc<T> nncVar = this.i;
            if (nncVar != null) {
                nncVar.e(baseResponse.getErrorCode());
            }
            if (!TextUtils.isEmpty(baseResponse.getMessage())) {
                y0k.i(baseResponse.getMessage());
            }
            e(baseResponse, this.i);
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            nnc<T> nncVar = new nnc<>(null);
            this.i = nncVar;
            nncVar.e(444);
            this.i.g(th, str);
            f(this.i);
        }

        @Override // com.oplus.aiunit.vision.u61
        public void d(T t) {
            nnc<T> nncVar = new nnc<>(t);
            this.i = nncVar;
            nncVar.e(200);
            this.i.f(null);
            g(this.i);
        }

        public void e(BaseResponse baseResponse, nnc<T> nncVar) {
        }

        public abstract void f(nnc<T> nncVar);

        public abstract void g(nnc<T> nncVar);
    }

    public nnc(T t) {
        this.a = t;
    }

    public int a() {
        return this.f14565c;
    }

    public String b() {
        return this.d;
    }

    public Throwable c() {
        return this.b;
    }

    public T d() {
        return this.a;
    }

    public void e(int i) {
        this.f14565c = i;
    }

    public void f(Throwable th) {
        this.b = th;
    }

    public void g(Throwable th, String str) {
        this.b = th;
        this.d = str;
    }
}
