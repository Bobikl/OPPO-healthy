package com.heytap.wearable.support.watchface.gl.physics;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.particle.BurstParticleInfluencer;
import com.heytap.wearable.support.watchface.gl.particle.SphereShapeParticleEmitter;
import com.heytap.wearable.support.watchface.gl.shape.Mesh;

/* JADX INFO: loaded from: classes2.dex */
public class BurstParticlePhysics extends Physics {
    private static final short MAX_COUNT_PHY = 333;
    private static SphereShapeParticleEmitter mShareParticleEmitter;
    private short mCountPhy;
    private boolean mIsBurstVBO;
    private boolean mIsBursting;

    public BurstParticlePhysics(Mesh mesh) {
        super(mesh);
        this.mIsBursting = false;
        this.mIsBurstVBO = false;
        this.mCountPhy = (short) 0;
    }

    public static void destroySingleShareParticleEmitter() {
        mShareParticleEmitter = null;
    }

    public static void initSingleShareParticleEmitter() {
        SphereShapeParticleEmitter sphereShapeParticleEmitter = new SphereShapeParticleEmitter(new Float3(0.0f, 0.0f, 0.0f), 1.0f, new BurstParticleInfluencer());
        mShareParticleEmitter = sphereShapeParticleEmitter;
        sphereShapeParticleEmitter.setColor(-1711276288);
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.Physics
    public void createPhysicsVBO() {
        Mesh[] childMeshes = this.mMesh.getChildMeshes();
        if (childMeshes == null) {
            mShareParticleEmitter.emitParticles(500, 0.015f, null, 0);
            this.mMesh.setChildMeshes(mShareParticleEmitter.getParticleMeshes());
            mShareParticleEmitter.start();
            return;
        }
        mShareParticleEmitter.restart();
        for (Mesh mesh : childMeshes) {
            float[] fArr = {Float.POSITIVE_INFINITY, this.mMesh.getEdgeBlendParam()[1], this.mMesh.getEdgeBlendParam()[2]};
            mesh.setPos((float[]) this.mMesh.getPos().clone());
            mesh.setScale(new float[]{1.0f, 1.0f, 1.0f});
            mesh.setColor((float[]) this.mMesh.getColor().clone());
            mesh.setEdgeBlendParam(fArr);
        }
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.Physics
    public boolean doAction() {
        if (this.mIsBursting) {
            return false;
        }
        this.mIsBursting = true;
        return true;
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.Physics
    public boolean getIsActionDone() {
        return this.mIsBursting;
    }

    public float getRadius() {
        float[] boundingBox = this.mMesh.getBoundingBox();
        return Math.abs(boundingBox[3] - boundingBox[0]) / 2.0f;
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.Physics
    public void setIsActionDone(boolean z) {
        this.mIsBursting = z;
        if (z) {
            return;
        }
        this.mIsBurstVBO = false;
        this.mCountPhy = (short) 0;
        this.mMesh.setIsShow(true);
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.Physics
    public void updatePhy() {
        if (this.mIsBursting) {
            if (this.mIsBurstVBO) {
                if (this.mCountPhy >= 333 || this.mMesh.getChildMeshes() == null) {
                    return;
                }
                boolean zUpdate = mShareParticleEmitter.update();
                short s = (short) (this.mCountPhy + 1);
                this.mCountPhy = s;
                if (s >= 333 || !zUpdate) {
                    this.mCountPhy = MAX_COUNT_PHY;
                    this.mMesh.setIsShow(false);
                    return;
                }
                return;
            }
            createPhysicsVBO();
            this.mIsBurstVBO = true;
            float radius = getRadius();
            Mesh[] childMeshes = this.mMesh.getChildMeshes();
            if (childMeshes != null) {
                for (Mesh mesh : childMeshes) {
                    float[] scale = mesh.getScale();
                    scale[0] = radius;
                    scale[1] = radius;
                    scale[2] = radius;
                    mesh.setTexIndex(this.mMesh.getTexIndex());
                }
            }
        }
    }
}
