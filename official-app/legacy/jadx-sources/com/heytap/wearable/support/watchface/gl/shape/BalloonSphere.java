package com.heytap.wearable.support.watchface.gl.shape;

import com.heytap.wearable.support.watchface.gl.physics.BurstParticlePhysics;
import com.heytap.wearable.support.watchface.gl.physics.PhysicsInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class BalloonSphere extends Sphere implements PhysicsInterface {
    private static BurstParticlePhysics mShareBurstPhysics;
    private static Sphere mShareSphere;
    private BurstParticlePhysics mBurstPhysics = new BurstParticlePhysics(this);
    private BalloonSphere[] mLight = new BalloonSphere[9];
    private int mLightCount = 0;

    private void createPlaneMesh(Sphere sphere) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(48);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, -1.0f});
        floatBufferAsFloatBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        sphere.beginUpdateData(4);
        sphere.updateData(floatBufferAsFloatBuffer, floatBufferAsFloatBuffer2, floatBufferAsFloatBuffer);
        sphere.endUpdateData();
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(12);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
        shortBufferAsShortBuffer.put(new short[]{1, 0, 3, 1, 3, 2});
        shortBufferAsShortBuffer.position(0);
        sphere.updateIndexData(6, shortBufferAsShortBuffer);
        sphere.mRadius = 1.0f;
        sphere.mIsCreated = true;
    }

    public static void destroySingleShareSphereMesh() {
        mShareBurstPhysics = null;
        BurstParticlePhysics.destroySingleShareParticleEmitter();
    }

    public static void initSingleShareSphereMesh() {
        Sphere sphere = new Sphere();
        mShareSphere = sphere;
        mShareBurstPhysics = new BurstParticlePhysics(sphere);
        BurstParticlePhysics.initSingleShareParticleEmitter();
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Sphere, com.heytap.wearable.support.watchface.gl.shape.Mesh
    public void create() {
        create(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public float distanceFrom(Sphere sphere) {
        float[] pos = sphere.getPos();
        return (float) Math.sqrt(Math.pow(this.mPos[0] - pos[0], 2.0d) + Math.pow(this.mPos[1] - pos[1], 2.0d) + Math.pow(this.mPos[2] - pos[2], 2.0d));
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.PhysicsInterface
    public boolean doAction() {
        return this.mBurstPhysics.doAction();
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Mesh
    public Mesh[] getChildMeshes() {
        if (!getIsActionDone() || mShareSphere == null) {
            return null;
        }
        if (!mShareBurstPhysics.getIsActionDone()) {
            mShareBurstPhysics.createPhysicsVBO();
            mShareBurstPhysics.setIsActionDone(true);
        }
        return mShareSphere.mChildMeshes;
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.PhysicsInterface
    public boolean getIsActionDone() {
        return this.mBurstPhysics.getIsActionDone();
    }

    public BalloonSphere[] getLight() {
        return this.mLight;
    }

    public int getLightCount() {
        return this.mLightCount;
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Sphere
    public float getRadius() {
        return this.mRadius;
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.PhysicsInterface
    public void setIsActionDone(boolean z) {
        this.mBurstPhysics.setIsActionDone(z);
    }

    public void setLightCount(int i) {
        this.mLightCount = i;
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.PhysicsInterface
    public void updatePhy() {
        this.mBurstPhysics.updatePhy();
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Sphere
    public void create(float f, float f2, float f3, float f4) {
        Sphere sphere = mShareSphere;
        if (sphere == null) {
            return;
        }
        if (!sphere.getIsCreated()) {
            createPlaneMesh(mShareSphere);
        }
        Sphere sphere2 = mShareSphere;
        this.mIndexCount = sphere2.mIndexCount;
        this.mVertexCount = sphere2.mVertexCount;
        this.mIndexBuffer = sphere2.mIndexBuffer;
        this.mVertexBuffer = sphere2.mVertexBuffer;
        float[] fArr = this.mPos;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArr2 = this.mScale;
        fArr2[0] = f4;
        fArr2[1] = f4;
        fArr2[2] = f4;
        this.mRadius = f4;
        float[] fArr3 = this.mBoundingBox;
        fArr3[0] = f - f4;
        fArr3[1] = f2 - f4;
        fArr3[2] = f3 - f4;
        fArr3[3] = f + f4;
        fArr3[4] = f2 + f4;
        fArr3[5] = f3 + f4;
        this.mIsCreated = true;
    }
}
