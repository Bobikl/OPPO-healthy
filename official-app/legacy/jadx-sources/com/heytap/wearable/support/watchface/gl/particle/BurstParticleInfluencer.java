package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class BurstParticleInfluencer extends ParticleInfluencer {
    private final float MIN_VElOCITY = 0.001f;

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleInfluencer
    public boolean updateParticles(LinkedList<Particle> linkedList, ParticleEmitter particleEmitter) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = (jCurrentTimeMillis - this.mLastTime) / 1000.0f;
        this.mLastTime = jCurrentTimeMillis;
        boolean z = false;
        for (Particle particle : linkedList) {
            float f2 = (particle.mVelocity * f) + (particle.mAcceleration * 0.5f * f * f);
            Float3 float3 = particle.mPosition;
            float f3 = float3.x;
            Float3 float4 = particle.mDirection;
            float f4 = f3 + (float4.x * f2);
            float f5 = float3.y + (float4.y * f2);
            float f6 = float3.z + (f2 * float4.z);
            if (particleEmitter.collisionWithExtent(f4, f5, f6)) {
                particle.mVelocity = 0.0f;
                particle.mIsShow = false;
            } else {
                Float3 float5 = particle.mPosition;
                float5.x = f4;
                float5.y = f5;
                float5.z = f6;
                particle.mVelocity += particle.mAcceleration * f;
            }
            if (particle.mIsShow) {
                z = true;
            }
        }
        return z;
    }
}
