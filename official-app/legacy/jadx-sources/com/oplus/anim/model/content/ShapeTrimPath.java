package com.oplus.anim.model.content;

import com.oplus.aiunit.vision.d74;
import com.oplus.aiunit.vision.e40;
import com.oplus.aiunit.vision.k84;
import com.oplus.aiunit.vision.lck;
import com.oplus.aiunit.vision.wg6;
import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class ShapeTrimPath implements k84 {
    public final String a;
    public final Type b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e40 f19629c;
    public final e40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e40 f19630e;
    public final boolean f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public ShapeTrimPath(String str, Type type, e40 e40Var, e40 e40Var2, e40 e40Var3, boolean z) {
        this.a = str;
        this.b = type;
        this.f19629c = e40Var;
        this.d = e40Var2;
        this.f19630e = e40Var3;
        this.f = z;
    }

    @Override // com.oplus.aiunit.vision.k84
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new lck(aVar, this);
    }

    public e40 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public e40 d() {
        return this.f19630e;
    }

    public e40 e() {
        return this.f19629c;
    }

    public Type f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f19629c + ", end: " + this.d + ", offset: " + this.f19630e + "}";
    }
}
