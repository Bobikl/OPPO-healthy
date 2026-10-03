package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class DailySphereShapeParticleEmitter extends ParticleEmitter {
    private static final float LINE_RATIO = 0.24157304f;
    private float mHeight;
    private int mNumParticles;
    private float mParticleSize;
    private float mProgress;
    private float mWidth;

    public DailySphereShapeParticleEmitter(float f, float f2, DailyParticleInfluencer dailyParticleInfluencer) {
        super(dailyParticleInfluencer);
        this.mProgress = 0.0f;
        this.mWidth = f;
        this.mHeight = f2;
        this.mParticleMesh = new XYParticleMesh[]{new XYParticleMesh()};
    }

    private void initParticle(Particle particle) {
        getRandomParticlePositionAndDirection(particle.mPosition, particle.mDirection);
        float f = this.mParticleSize;
        particle.mSize = f;
        particle.mAcceleration = f;
        particle.mAccelerationOrign = (float) Math.random();
        particle.mVelocity = ((float) Math.random()) * 10.0f;
        particle.mColor = (int) (particle.mAccelerationOrign * 255.0f);
        particle.mIsShow = true;
    }

    private void updateMesh() {
        this.mParticleMesh[0].updateParticleMesh(this.mParticles);
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public boolean collisionWithExtent(float f, float f2, float f3) {
        float f4 = this.mProgress;
        float f5 = this.mWidth;
        double d = ((((double) ((f4 - 0.5f) * f5)) * 0.7302d) / 0.2415730357170105d) - ((double) f);
        if (f4 >= 0.08f && f <= ((f4 - 0.5f) * f5) / 0.24157304f && Math.abs(f2) <= this.mHeight * 0.47f && (d <= (this.mWidth * 0.5f) / 0.24157304f || this.mProgress <= 0.5f)) {
            double dAbs = Math.abs(f2);
            float f6 = this.mHeight;
            if (dAbs <= ((double) (0.47f * f6)) - (((d * 0.2415730357170105d) * 0.4699999988079071d) * ((double) f6))) {
                return false;
            }
        }
        return true;
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
    }

    @Override // com.heytap.wearable.support.watchface.gl.particle.ParticleEmitter
    public void getRandomParticlePositionAndDirection(Float3 float3, Float3 float4) {
        float4.x = 0.2f;
        float4.y = (((float) Math.random()) - 0.5f) + 0.1f;
        float4.z = 0.0f;
        float3.x = ((((float) Math.random()) - 0.5f) * this.mWidth) / 0.24157304f;
        float3.y = (((float) Math.random()) - 0.5f) * this.mHeight * 0.85f;
        float3.z = 0.0f;
    }

    public void loadMesh() {
        this.mParticleMesh[0].initParticleMesh(this.mParticles, this.mNumParticles);
    }

    public void reset() {
        Iterator<Particle> it = this.mParticles.iterator();
        while (it.hasNext()) {
            initParticle(it.next());
        }
    }

    public void setAlpha(float f) {
        XYParticleMesh.sAlpha = f;
    }

    public void setProgress(float f) {
        this.mProgress = f;
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
