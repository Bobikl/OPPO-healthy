package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.math.VectorMath;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class SphereShapeParticleEmitter extends ParticleEmitter {
    private int mNumParticles;
    private float mParticleSize;
    private Float3 mPos;
    private float mRadius;

    public SphereShapeParticleEmitter(Float3 float3, float f, BurstParticleInfluencer burstParticleInfluencer) {
        super(burstParticleInfluencer);
        this.mPos = float3;
        this.mRadius = f;
    }

    private void initParticle(Particle particle) {
        getRandomParticlePositionAndDirection(particle.mPosition, particle.mDirection);
        particle.mSize = this.mParticleSize * (((float) Math.random()) + 0.5f);
        particle.mColor = this.mColor;
        particle.mAcceleration = 1.1f;
        particle.mAccelerationOrign = 1.1f;
        particle.mVelocity = ((float) Math.random()) * 3.0f;
        particle.mIsShow = true;
    }

    private void loadMesh() {
        this.mParticleMesh[0].initParticleMesh(this.mParticles, this.mNumParticles);
    }

    private void updateMesh() {
        this.mParticleMesh[0].updateParticleMesh(this.mParticles);
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public boolean collisionWithExtent(float f, float f2, float f3) {
        Float3 float3 = this.mPos;
        return VectorMath.length(new Float3(f - float3.x, f2 - float3.y, f3 - float3.z)) > this.mRadius * 1.3f;
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public void emitParticles(int i, float f, Float3[] float3Arr, int i2) {
        this.mNumParticles = i;
        this.mParticleSize = f;
        for (int i3 = 0; i3 < i; i3++) {
            Particle particle = new Particle();
            initParticle(particle);
            this.mParticles.add(particle);
        }
        loadMesh();
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public void getRandomParticlePositionAndDirection(Float3 float3, Float3 float4) {
        float4.x = ((float) Math.random()) - 0.5f;
        float4.y = ((float) Math.random()) - 0.5f;
        float4.z = ((float) Math.random()) - 0.5f;
        VectorMath.normalize(float4);
        Float3 float5 = this.mPos;
        float f = float5.x;
        float f2 = this.mRadius;
        float3.x = f + (float4.x * f2);
        float3.y = float5.y + (float4.y * f2);
        float3.z = float5.z + (f2 * float4.z);
    }

    public void restart() {
        Iterator<Particle> it = this.mParticles.iterator();
        while (it.hasNext()) {
            initParticle(it.next());
        }
        start();
    }

    public boolean update() {
        boolean zUpdateParticles = updateParticles();
        updateMesh();
        return zUpdateParticles;
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public boolean updateParticles() {
        return this.mDefaultInfluencer.updateParticles(this.mParticles, this);
    }
}
