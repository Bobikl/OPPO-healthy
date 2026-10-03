package com.oplus.anim.model.content;

import com.oplus.aiunit.vision.i40;
import com.oplus.aiunit.vision.s40;

/* JADX INFO: loaded from: classes19.dex */
public class Mask {
    public final MaskMode a;
    public final s40 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i40 f19621c;
    public final boolean d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, s40 s40Var, i40 i40Var, boolean z) {
        this.a = maskMode;
        this.b = s40Var;
        this.f19621c = i40Var;
        this.d = z;
    }

    public MaskMode a() {
        return this.a;
    }

    public s40 b() {
        return this.b;
    }

    public i40 c() {
        return this.f19621c;
    }

    public boolean d() {
        return this.d;
    }
}
