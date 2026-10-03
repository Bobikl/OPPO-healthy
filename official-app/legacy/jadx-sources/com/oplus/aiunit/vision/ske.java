package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Pixmap;

/* JADX INFO: loaded from: classes13.dex */
public class ske extends fj0<Pixmap, a> {
    public Pixmap b;

    public static class a extends bi0<Pixmap> {
    }

    public ske(mb7 mb7Var) {
        super(mb7Var);
    }

    @Override // com.oplus.aiunit.vision.ai0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public wg0<yh0> a(String str, kb7 kb7Var, a aVar) {
        return null;
    }

    @Override // com.oplus.aiunit.vision.fj0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(di0 di0Var, String str, kb7 kb7Var, a aVar) {
        this.b = null;
        this.b = new Pixmap(kb7Var);
    }

    @Override // com.oplus.aiunit.vision.fj0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Pixmap d(di0 di0Var, String str, kb7 kb7Var, a aVar) {
        Pixmap pixmap = this.b;
        this.b = null;
        return pixmap;
    }
}
