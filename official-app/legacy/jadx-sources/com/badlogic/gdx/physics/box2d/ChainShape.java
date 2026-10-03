package com.badlogic.gdx.physics.box2d;

/* JADX INFO: loaded from: classes13.dex */
public class ChainShape extends Shape {
    public static float[] k = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1264j = false;

    public ChainShape() {
        this.i = newChainShape();
    }

    private native void jniCreateLoop(long j2, float[] fArr, int i, int i2);

    private native long newChainShape();

    public void i(float[] fArr) {
        jniCreateLoop(this.i, fArr, 0, fArr.length / 2);
        this.f1264j = true;
    }
}
