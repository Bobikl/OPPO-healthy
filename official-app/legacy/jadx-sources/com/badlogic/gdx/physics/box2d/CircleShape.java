package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes13.dex */
public class CircleShape extends Shape {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f1265j = new float[2];
    public final Vector2 k = new Vector2();

    public CircleShape() {
        this.i = newCircleShape();
    }

    private native long newCircleShape();
}
