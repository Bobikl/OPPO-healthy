package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class DailyParticleInfluencer extends ParticleInfluencer {
    public static final float LINE_RATIO = 0.24157304f;

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleInfluencer
    public boolean updateParticles(LinkedList<Particle> linkedList, ParticleEmitter particleEmitter) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = (jCurrentTimeMillis - this.mLastTime) / 1000.0f;
        this.mLastTime = jCurrentTimeMillis;
        boolean z = false;
        for (Particle particle : linkedList) {
            float f2 = particle.mSize;
            float f3 = particle.mAcceleration;
            if (f2 <= 0.9f * f3 || f2 >= 1.1f * f3) {
                float f4 = particle.mAccelerationOrign;
                float f5 = f4 * (1.0f - f4);
                particle.mAccelerationOrign = f5;
                particle.mSize = f2 + (f3 * 0.02f * (f5 - 0.5f));
            } else {
                particle.mSize = f2 + (f3 * 0.02f * (particle.mAccelerationOrign - 0.5f));
            }
            if (particle.mAccelerationOrign > 0.5f) {
                particle.mColor++;
            } else {
                particle.mColor--;
            }
            float f6 = (particle.mVelocity * f) + (f * f * 1.05f);
            Float3 float3 = particle.mPosition;
            float f7 = float3.x;
            Float3 float4 = particle.mDirection;
            float f8 = f7 + (float4.x * f6);
            float f9 = float3.y + (float4.y * f6);
            float f10 = float3.z + (float4.z * f6);
            if (particleEmitter.collisionWithExtent(f8, f9, f10)) {
                if (Math.abs(particle.mPosition.y) > 0.5f) {
                    Float3 float5 = particle.mDirection;
                    float f11 = float5.y * (-1.0f);
                    float5.y = f11;
                    particle.mPosition.y += f6 * f11;
                }
                Float3 float6 = particle.mPosition;
                if (float6.x > 2.0697675f) {
                    float6.x = -2.0697675f;
                }
                particle.mIsShow = false;
            } else {
                Float3 float7 = particle.mPosition;
                float7.x = f8;
                float7.y = f9;
                float7.z = f10;
                particle.mVelocity += particle.mAcceleration * f;
                particle.mIsShow = true;
                z = true;
            }
        }
        return z;
    }
}
