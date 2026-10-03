package com.badlogic.gdx.physics.box2d;

/* JADX INFO: loaded from: classes13.dex */
public class PolygonShape extends Shape {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static float[] f1275j = new float[2];

    public PolygonShape() {
        this.i = newPolygonShape();
    }

    private native void jniSet(long j2, float[] fArr, int i, int i2);

    private native long newPolygonShape();

    public void i(float[] fArr) {
        jniSet(this.i, fArr, 0, fArr.length);
    }
}
