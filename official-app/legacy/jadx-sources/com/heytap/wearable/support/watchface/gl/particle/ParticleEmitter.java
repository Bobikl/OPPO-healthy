package com.heytap.wearable.support.watchface.gl.particle;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class ParticleEmitter {
    protected int mColor;
    protected ParticleInfluencer mDefaultInfluencer;
    protected ForceParticleInfluencer mForceInfluencer;
    protected long mLastTime;
    protected ParticleMesh[] mParticleMesh;
    protected LinkedList<Particle> mParticles;

    public ParticleEmitter() {
        this.mParticles = new LinkedList<>();
        this.mParticleMesh = new ParticleMesh[]{new ParticleMesh()};
        this.mColor = -1;
        this.mDefaultInfluencer = new DefaultParticleInfluencer();
        this.mForceInfluencer = new ForceParticleInfluencer();
    }

    public boolean collisionWithExtent(float f, float f2, float f3) {
        return false;
    }

    public void emitParticles(int i, float f, Float3[] float3Arr, int i2) {
    }

    public int getColor() {
        return this.mColor;
    }

    public Mesh[] getParticleMeshes() {
        return this.mParticleMesh;
    }

    public void getRandomParticlePosition(Float3 float3) {
    }

    public void getRandomParticlePositionAndDirection(Float3 float3, Float3 float4) {
    }

    public void init() {
        start();
    }

    public void setAcceleration(float f) {
        this.mForceInfluencer.setAcceleration(f);
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    public void start() {
        this.mDefaultInfluencer.start();
        this.mForceInfluencer.start();
    }

    public boolean updateParticles() {
        return false;
    }

    public ParticleEmitter(ParticleInfluencer particleInfluencer) {
        this.mParticles = new LinkedList<>();
        this.mParticleMesh = new ParticleMesh[]{new ParticleMesh()};
        this.mColor = -1;
        this.mDefaultInfluencer = particleInfluencer;
        this.mForceInfluencer = new ForceParticleInfluencer();
    }
}
