package com.badlogic.gdx.physics.box2d;

import com.oplus.aiunit.vision.bv5;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Shape implements bv5 {
    public long i;

    public enum Type {
        Circle,
        Edge,
        Polygon,
        Chain
    }

    private native void jniDispose(long j2);

    private native void jniSetRadius(long j2, float f);

    public void b(float f) {
        jniSetRadius(this.i, f);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        jniDispose(this.i);
    }
}
