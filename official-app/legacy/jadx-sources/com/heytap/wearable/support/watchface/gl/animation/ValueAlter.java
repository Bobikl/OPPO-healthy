package com.heytap.wearable.support.watchface.gl.animation;

/* JADX INFO: loaded from: classes2.dex */
public class ValueAlter {
    private long mLastTime;
    private float[] mMax;
    private float[] mMin;
    private int mNum;
    private float[] mValue;
    private float[] mVelocity;

    public ValueAlter(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i) {
        this.mValue = fArr;
        this.mMin = fArr2;
        this.mMax = fArr3;
        this.mVelocity = fArr4;
        this.mNum = i;
    }

    public void start() {
        this.mLastTime = System.currentTimeMillis();
    }

    public void update() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = (jCurrentTimeMillis - this.mLastTime) / 1000.0f;
        this.mLastTime = jCurrentTimeMillis;
        if (Math.abs(f) > 1.0f) {
            return;
        }
        for (int i = 0; i < this.mNum; i++) {
            float[] fArr = this.mValue;
            float f2 = fArr[i];
            float[] fArr2 = this.mVelocity;
            float f3 = fArr2[i];
            float f4 = f2 + (f3 * f);
            if (f4 < this.mMin[i] || f4 > this.mMax[i]) {
                fArr2[i] = f3 * (-1.0f);
            } else {
                fArr[i] = f4;
            }
        }
    }
}
