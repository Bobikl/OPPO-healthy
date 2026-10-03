package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;

/* JADX INFO: loaded from: classes2.dex */
public class Particle {
    public float mSize;
    private final float PARTICLE_ACCELERATION = 0.001f;
    public Float3 mPosition = new Float3();
    public Float3 mDirection = new Float3(0.0f, 0.0f, 0.0f);
    public float mAcceleration = 0.001f;
    public float mAccelerationOrign = 0.001f;
    public float mVelocity = 0.0f;
    public int mColor = -1;
    public boolean mIsShow = true;
}
