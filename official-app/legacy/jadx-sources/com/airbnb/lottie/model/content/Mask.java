package com.airbnb.lottie.model.content;

import com.oplus.aiunit.vision.j40;
import com.oplus.aiunit.vision.t40;

/* JADX INFO: loaded from: classes12.dex */
public class Mask {
    public final MaskMode a;
    public final t40 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j40 f507c;
    public final boolean d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, t40 t40Var, j40 j40Var, boolean z) {
        this.a = maskMode;
        this.b = t40Var;
        this.f507c = j40Var;
        this.d = z;
    }

    public MaskMode a() {
        return this.a;
    }

    public t40 b() {
        return this.b;
    }

    public j40 c() {
        return this.f507c;
    }

    public boolean d() {
        return this.d;
    }
}
