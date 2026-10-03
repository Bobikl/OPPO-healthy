package com.oplus.anim.model.content;

import android.graphics.PointF;
import com.oplus.aiunit.vision.d74;
import com.oplus.aiunit.vision.e40;
import com.oplus.aiunit.vision.i50;
import com.oplus.aiunit.vision.jne;
import com.oplus.aiunit.vision.k84;
import com.oplus.aiunit.vision.wg6;
import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class PolystarShape implements k84 {
    public final String a;
    public final Type b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e40 f19623c;
    public final i50<PointF, PointF> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e40 f19624e;
    public final e40 f;
    public final e40 g;
    public final e40 h;
    public final e40 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19625j;
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

    public PolystarShape(String str, Type type, e40 e40Var, i50<PointF, PointF> i50Var, e40 e40Var2, e40 e40Var3, e40 e40Var4, e40 e40Var5, e40 e40Var6, boolean z, boolean z2) {
        this.a = str;
        this.b = type;
        this.f19623c = e40Var;
        this.d = i50Var;
        this.f19624e = e40Var2;
        this.f = e40Var3;
        this.g = e40Var4;
        this.h = e40Var5;
        this.i = e40Var6;
        this.f19625j = z;
        this.k = z2;
    }

    @Override // com.oplus.aiunit.vision.k84
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new jne(effectiveAnimationDrawable, aVar, this);
    }

    public e40 b() {
        return this.f;
    }

    public e40 c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public e40 e() {
        return this.g;
    }

    public e40 f() {
        return this.i;
    }

    public e40 g() {
        return this.f19623c;
    }

    public i50<PointF, PointF> h() {
        return this.d;
    }

    public e40 i() {
        return this.f19624e;
    }

    public Type j() {
        return this.b;
    }

    public boolean k() {
        return this.f19625j;
    }

    public boolean l() {
        return this.k;
    }
}
