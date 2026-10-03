package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.oplus.aiunit.vision.e74;
import com.oplus.aiunit.vision.f40;
import com.oplus.aiunit.vision.ine;
import com.oplus.aiunit.vision.j50;
import com.oplus.aiunit.vision.k9b;
import com.oplus.aiunit.vision.l84;

/* JADX INFO: loaded from: classes12.dex */
public class PolystarShape implements l84 {
    public final String a;
    public final Type b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f40 f509c;
    public final j50<PointF, PointF> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f40 f510e;
    public final f40 f;
    public final f40 g;
    public final f40 h;
    public final f40 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f511j;
    public final boolean k;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, f40 f40Var, j50<PointF, PointF> j50Var, f40 f40Var2, f40 f40Var3, f40 f40Var4, f40 f40Var5, f40 f40Var6, boolean z, boolean z2) {
        this.a = str;
        this.b = type;
        this.f509c = f40Var;
        this.d = j50Var;
        this.f510e = f40Var2;
        this.f = f40Var3;
        this.g = f40Var4;
        this.h = f40Var5;
        this.i = f40Var6;
        this.f511j = z;
        this.k = z2;
    }

    @Override // com.oplus.aiunit.vision.l84
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new ine(lottieDrawable, aVar, this);
    }

    public f40 b() {
        return this.f;
    }

    public f40 c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public f40 e() {
        return this.g;
    }

    public f40 f() {
        return this.i;
    }

    public f40 g() {
        return this.f509c;
    }

    public j50<PointF, PointF> h() {
        return this.d;
    }

    public f40 i() {
        return this.f510e;
    }

    public Type j() {
        return this.b;
    }

    public boolean k() {
        return this.f511j;
    }

    public boolean l() {
        return this.k;
    }
}
