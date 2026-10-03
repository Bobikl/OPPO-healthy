package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.math.VectorMath;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultParticleInfluencer extends ParticleInfluencer {
    private final float MIN_VElOCITY = 0.001f;

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleInfluencer
    public boolean updateParticles(LinkedList<Particle> linkedList, ParticleEmitter particleEmitter) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = (jCurrentTimeMillis - this.mLastTime) / 1000.0f;
        this.mLastTime = jCurrentTimeMillis;
        for (Particle particle : linkedList) {
            if (Math.abs(particle.mVelocity) < 0.001f) {
                particle.mDirection.x = ((float) Math.random()) * (0.5f - ((float) Math.random()));
                particle.mDirection.y = ((float) Math.random()) * (0.5f - ((float) Math.random()));
                Float3 float3 = particle.mDirection;
                float3.z = 0.0f;
                VectorMath.normalize(float3);
                particle.mAcceleration = 0.01f;
            }
            if (Math.abs(particle.mVelocity) > 0.1f) {
                particle.mAcceleration = -particle.mAccelerationOrign;
            }
            float f2 = (particle.mVelocity * f) + (particle.mAcceleration * 0.5f * f * f);
            Float3 float4 = particle.mPosition;
            float f3 = float4.x;
            Float3 float5 = particle.mDirection;
            float f4 = f3 + (float5.x * f2);
            float f5 = float4.y + (f2 * float5.y);
            if (particleEmitter.collisionWithExtent(f4, f5, 0.0f)) {
                particle.mVelocity = 0.0f;
            } else {
                Float3 float6 = particle.mPosition;
                float6.x = f4;
                float6.y = f5;
                particle.mVelocity += particle.mAcceleration * f;
            }
        }
        return true;
    }
}
