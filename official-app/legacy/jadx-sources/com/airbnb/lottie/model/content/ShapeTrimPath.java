package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.oplus.aiunit.vision.e74;
import com.oplus.aiunit.vision.f40;
import com.oplus.aiunit.vision.k9b;
import com.oplus.aiunit.vision.l84;
import com.oplus.aiunit.vision.mck;

/* JADX INFO: loaded from: classes12.dex */
public class ShapeTrimPath implements l84 {
    public final String a;
    public final Type b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f40 f515c;
    public final f40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f40 f516e;
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

    public ShapeTrimPath(String str, Type type, f40 f40Var, f40 f40Var2, f40 f40Var3, boolean z) {
        this.a = str;
        this.b = type;
        this.f515c = f40Var;
        this.d = f40Var2;
        this.f516e = f40Var3;
        this.f = z;
    }

    @Override // com.oplus.aiunit.vision.l84
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new mck(aVar, this);
    }

    public f40 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public f40 d() {
        return this.f516e;
    }

    public f40 e() {
        return this.f515c;
    }

    public Type f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f515c + ", end: " + this.d + ", offset: " + this.f516e + "}";
    }
}
