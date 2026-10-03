package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class ForceParticleInfluencer extends ParticleInfluencer {
    private float mAcceleration = 0.0f;
    private long mDuration = 1000;
    private long mBeginTime = 0;
    private float mLastDis = 0.0f;
    private Float3 mDirection = new Float3(1.0f, 0.0f, 0.0f);
    private boolean mRunning = false;
    private Lock mRunningLock = new ReentrantLock();

    public void setAcceleration(float f) {
        this.mRunningLock.lock();
        try {
            if (!this.mRunning) {
                this.mAcceleration = f;
                this.mBeginTime = System.currentTimeMillis();
                this.mRunning = true;
            }
        } finally {
            this.mRunningLock.unlock();
        }
    }
}
