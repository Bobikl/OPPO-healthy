package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.f;
import com.oplus.aiunit.vision.b45;
import com.oplus.aiunit.vision.ch0;
import com.oplus.aiunit.vision.hsb;
import com.oplus.aiunit.vision.kf1;
import com.oplus.aiunit.vision.ksb;
import com.oplus.aiunit.vision.lf1;
import com.oplus.aiunit.vision.nbb;
import com.oplus.aiunit.vision.obb;
import com.oplus.aiunit.vision.qak;
import com.oplus.aiunit.vision.rea;
import com.oplus.aiunit.vision.sbb;
import com.oplus.aiunit.vision.st5;
import com.oplus.aiunit.vision.t68;
import com.oplus.aiunit.vision.u68;
import com.oplus.aiunit.vision.uqf;
import com.oplus.aiunit.vision.va0;
import com.oplus.aiunit.vision.xz3;
import com.oplus.aiunit.vision.zqf;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f1349c;
    public kf1 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ch0 f1350e;
    public hsb f;
    public t68 g;
    public t68 h;
    public st5.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ksb f1351j;
    public xz3 k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.bumptech.glide.manager.b.InterfaceC0185b f1353n;
    public t68 o;
    public boolean p;

    @Nullable
    public List<uqf<Object>> q;
    public final Map<Class<?>, qak<?, ?>> a = new ArrayMap();
    public final d.a b = new d.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1352l = 4;
    public com.bumptech.glide.a.InterfaceC0172a m = new a();

    public class a implements com.bumptech.glide.a.InterfaceC0172a {
        public a() {
        }

        @Override // com.bumptech.glide.a.InterfaceC0172a
        @NonNull
        public zqf build() {
            return new zqf();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.b$b, reason: collision with other inner class name */
    public static final class C0173b {
    }

    public static final class c {
    }

    @NonNull
    public com.bumptech.glide.a a(@NonNull Context context, List<u68> list, va0 va0Var) {
        if (this.g == null) {
            this.g = t68.o();
        }
        if (this.h == null) {
            this.h = t68.m();
        }
        if (this.o == null) {
            this.o = t68.i();
        }
        if (this.f1351j == null) {
            this.f1351j = new ksb.a(context).a();
        }
        if (this.k == null) {
            this.k = new b45();
        }
        if (this.d == null) {
            int iB = this.f1351j.b();
            if (iB > 0) {
                this.d = new obb(iB);
            } else {
                this.d = new lf1();
            }
        }
        if (this.f1350e == null) {
            this.f1350e = new nbb(this.f1351j.a());
        }
        if (this.f == null) {
            this.f = new sbb(this.f1351j.d());
        }
        if (this.i == null) {
            this.i = new rea(context);
        }
        if (this.f1349c == null) {
            this.f1349c = new f(this.f, this.i, this.h, this.g, t68.p(), this.o, this.p);
        }
        List<uqf<Object>> list2 = this.q;
        if (list2 == null) {
            this.q = Collections.emptyList();
        } else {
            this.q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.a(context, this.f1349c, this.f, this.d, this.f1350e, new com.bumptech.glide.manager.b(this.f1353n), this.k, this.f1352l, this.m, this.a, this.q, list, va0Var, this.b.b());
    }

    public void b(@Nullable com.bumptech.glide.manager.b.InterfaceC0185b interfaceC0185b) {
        this.f1353n = interfaceC0185b;
    }
}
