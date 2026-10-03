package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.math.VectorMath;

/* JADX INFO: loaded from: classes2.dex */
public class BoxShapeParticleEmitter extends ParticleEmitter {
    private Float3 mExtent;
    private int mNumParticles;
    private Float3 mMinPos = new Float3();
    private Float3 mMaxPos = new Float3();

    public BoxShapeParticleEmitter(Float3 float3, Float3 float4) {
        Float3 float5 = new Float3();
        this.mExtent = float5;
        Float3 float6 = this.mMinPos;
        float6.x = float3.x;
        float6.y = float3.y;
        float6.z = float3.z;
        float5.x = float4.x;
        float5.y = float4.y;
        float5.z = float4.z;
        Float3 float7 = this.mMaxPos;
        float7.x = float3.x + float4.x;
        float7.y = float3.y + float4.y;
        float7.z = float3.z + float4.z;
    }

    private void loadMesh() {
        this.mParticleMesh[0].initParticleMesh(this.mParticles, this.mNumParticles);
    }

    private void updateMesh() {
        this.mParticleMesh[0].updateParticleMesh(this.mParticles);
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public boolean collisionWithExtent(float f, float f2, float f3) {
        Float3 float3 = this.mMinPos;
        if (f < float3.x) {
            return true;
        }
        Float3 float4 = this.mMaxPos;
        return f > float4.x || f2 < float3.y || f2 > float4.y || f3 < float3.z || f3 > float4.z;
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public void emitParticles(int i, float f, Float3[] float3Arr, int i2) {
        this.mNumParticles = i;
        for (int i3 = 0; i3 < i; i3++) {
            Particle particle = new Particle();
            if (i3 < i2) {
                Float3 float3 = particle.mPosition;
                Float3 float4 = float3Arr[i3];
                float3.x = float4.x;
                float3.y = float4.y;
                float3.z = float4.z;
            } else {
                getRandomParticlePosition(particle.mPosition);
            }
            getRandomParticleDirection(particle.mDirection);
            particle.mSize = f;
            particle.mColor = this.mColor;
            this.mParticles.add(particle);
        }
        loadMesh();
    }

    public void getRandomParticleDirection(Float3 float3) {
        float3.x = (float) Math.random();
        float3.y = (float) Math.random();
        float3.z = 0.0f;
        VectorMath.normalize(float3);
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public void getRandomParticlePosition(Float3 float3) {
        float3.x = this.mMinPos.x + (this.mExtent.x * ((float) Math.random()));
        float3.y = this.mMinPos.y + (this.mExtent.y * ((float) Math.random()));
        float3.z = this.mMinPos.z + (this.mExtent.z * ((float) Math.random()));
    }

    public void update() {
        updateParticles();
        updateMesh();
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public boolean updateParticles() {
        return this.mDefaultInfluencer.updateParticles(this.mParticles, this);
    }
}
