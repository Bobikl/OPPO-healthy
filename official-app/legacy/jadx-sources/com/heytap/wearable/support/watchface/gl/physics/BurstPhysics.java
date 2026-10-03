package com.heytap.wearable.support.watchface.gl.physics;

import com.heytap.wearable.support.watchface.gl.shape.Mesh;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class BurstPhysics extends Physics {
    private static final short BURST_SAMPLES_Z = 5;
    private static final float EVERY_PHY_SCALE = 0.85f;
    private static final float EVERY_PHY_TRANS = 13.0f;
    private static final short MAX_COUNT_PHY = 13;
    private short mCountPhy;
    private boolean mIsBurstVBO;
    private boolean mIsBursting;

    public BurstPhysics(Mesh mesh) {
        super(mesh);
        this.mIsBursting = false;
        this.mIsBurstVBO = false;
        this.mCountPhy = (short) 0;
    }

    @Override // com.heytap.wearable.support.watchface.gl.physics.Physics
    public void createPhysicsVBO() {
        BurstPhysics burstPhysics = this;
        Mesh[] childMeshes = burstPhysics.mMesh.getChildMeshes();
        Short sh = (short) 2;
        int i = 0;
        Short sh2 = (short) 0;
        if (childMeshes != null) {
            for (Mesh mesh : childMeshes) {
                float[] fArr = {Float.POSITIVE_INFINITY, burstPhysics.mMesh.getEdgeBlendParam()[1], burstPhysics.mMesh.getEdgeBlendParam()[2]};
                mesh.setPos((float[]) burstPhysics.mMesh.getPos().clone());
                mesh.setScale(new float[]{1.0f, 1.0f, 1.0f});
                mesh.setColor((float[]) burstPhysics.mMesh.getColor().clone());
                mesh.setEdgeBlendParam(fArr);
            }
            return;
        }
        float radius = getRadius();
        Mesh[] meshArr = new Mesh[36];
        double d = 0.0d;
        int i2 = 0;
        short s = 0;
        while (true) {
            if (i2 >= 6) {
                burstPhysics.mMesh.setChildMeshes(meshArr);
                return;
            }
            double d2 = -1.5707963267948966d;
            int i3 = i;
            for (int i4 = 6; i3 < i4; i4 = 6) {
                meshArr[s] = new Mesh();
                ArrayList<Float> arrayList = new ArrayList<>();
                ArrayList<Float> arrayList2 = new ArrayList<>();
                ArrayList<Float> arrayList3 = new ArrayList<>();
                ArrayList<Short> arrayList4 = new ArrayList<>();
                float f = radius;
                float fSin = (float) (Math.sin(d) * Math.cos(d2));
                short s2 = s;
                float fSin2 = (float) (Math.sin(d) * Math.sin(d2));
                Short sh3 = sh2;
                float fCos = (float) Math.cos(d);
                float f2 = (i3 / 5.0f) / 2.0f;
                float f3 = i2 / 5.0f;
                Mesh[] meshArr2 = meshArr;
                arrayList3.add(Float.valueOf(fSin));
                arrayList3.add(Float.valueOf(fSin2));
                arrayList3.add(Float.valueOf(fCos));
                arrayList2.add(Float.valueOf(f2));
                arrayList2.add(Float.valueOf(f3));
                double d3 = d2 + 0.6283185307179586d;
                float fSin3 = (float) (Math.sin(d) * Math.cos(d3));
                float fSin4 = (float) (Math.sin(d) * Math.sin(d3));
                float fCos2 = (float) Math.cos(d);
                int i5 = i3 + 1;
                float f4 = (i5 / 5.0f) / 2.0f;
                arrayList3.add(Float.valueOf(fSin3));
                arrayList3.add(Float.valueOf(fSin4));
                arrayList3.add(Float.valueOf(fCos2));
                arrayList2.add(Float.valueOf(f4));
                arrayList2.add(Float.valueOf(f3));
                double d4 = d + 0.6283185307179586d;
                double d5 = d;
                float fSin5 = (float) (Math.sin(d4) * Math.cos(d3));
                float fSin6 = (float) (Math.sin(d4) * Math.sin(d3));
                float fCos3 = (float) Math.cos(d4);
                float f5 = (i2 + 1) / 5.0f;
                arrayList3.add(Float.valueOf(fSin5));
                arrayList3.add(Float.valueOf(fSin6));
                arrayList3.add(Float.valueOf(fCos3));
                arrayList2.add(Float.valueOf(f4));
                arrayList2.add(Float.valueOf(f5));
                float fSin7 = (float) (Math.sin(d4) * Math.cos(d2));
                float fSin8 = (float) (Math.sin(d2) * Math.sin(d4));
                float fCos4 = (float) Math.cos(d4);
                arrayList3.add(Float.valueOf(fSin7));
                arrayList3.add(Float.valueOf(fSin8));
                arrayList3.add(Float.valueOf(fCos4));
                arrayList2.add(Float.valueOf(f2));
                arrayList2.add(Float.valueOf(f5));
                arrayList4.add((short) 1);
                arrayList4.add(sh3);
                arrayList4.add(sh);
                arrayList4.add(sh3);
                arrayList4.add((short) 3);
                arrayList4.add(sh);
                float[] impulseVector = meshArr2[s2].getImpulseVector();
                Short sh4 = sh;
                float fRandom = (float) (Math.random() * 6.283185307179586d);
                impulseVector[0] = 0.0f;
                double d6 = fRandom;
                impulseVector[1] = (float) Math.sin(d6);
                impulseVector[2] = (float) Math.cos(d6);
                arrayList.add(Float.valueOf((fSin - impulseVector[0]) * f));
                arrayList.add(Float.valueOf((fSin2 - impulseVector[1]) * f));
                arrayList.add(Float.valueOf((fCos - impulseVector[2]) * f));
                arrayList.add(Float.valueOf(f * (fSin3 - impulseVector[0])));
                arrayList.add(Float.valueOf(f * (fSin4 - impulseVector[1])));
                arrayList.add(Float.valueOf(f * (fCos2 - impulseVector[2])));
                arrayList.add(Float.valueOf((fSin5 - impulseVector[0]) * f));
                arrayList.add(Float.valueOf(f * (fSin6 - impulseVector[1])));
                arrayList.add(Float.valueOf(f * (fCos3 - impulseVector[2])));
                arrayList.add(Float.valueOf(f * (fSin7 - impulseVector[0])));
                arrayList.add(Float.valueOf(f * (fSin8 - impulseVector[1])));
                arrayList.add(Float.valueOf(f * (fCos4 - impulseVector[2])));
                int size = arrayList.size() / 3;
                int size2 = arrayList4.size();
                FloatBuffer floatBufferConvertToFloatBuffer = meshArr2[s2].convertToFloatBuffer(arrayList);
                FloatBuffer floatBufferConvertToFloatBuffer2 = meshArr2[s2].convertToFloatBuffer(arrayList2);
                FloatBuffer floatBufferConvertToFloatBuffer3 = meshArr2[s2].convertToFloatBuffer(arrayList3);
                meshArr2[s2].beginUpdateData(size);
                meshArr2[s2].updateData(floatBufferConvertToFloatBuffer, floatBufferConvertToFloatBuffer2, floatBufferConvertToFloatBuffer3);
                meshArr2[s2].endUpdateData();
                meshArr2[s2].updateIndexData(size2, meshArr2[s2].convertToShortBuffer(arrayList4));
                s = (short) (s2 + 1);
                sh = sh4;
                i2 = i2;
                i3 = i5;
                radius = f;
                meshArr = meshArr2;
                d2 = d3;
                sh2 = sh3;
                d = d5;
            }
            d += 0.6283185307179586d;
            i2++;
            burstPhysics = this;
            i = 0;
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
            Mesh[] childMeshes = this.mMesh.getChildMeshes();
            if (!this.mIsBurstVBO) {
                createPhysicsVBO();
                this.mIsBurstVBO = true;
                if (childMeshes != null) {
                    for (Mesh mesh : childMeshes) {
                        float[] pos = mesh.getPos();
                        float radius = getRadius();
                        pos[0] = this.mMesh.getPos()[0] + (mesh.getImpulseVector()[0] * radius);
                        pos[1] = this.mMesh.getPos()[1] + (mesh.getImpulseVector()[1] * radius);
                        pos[2] = this.mMesh.getPos()[2] + (radius * mesh.getImpulseVector()[2]);
                        float[] scale = mesh.getScale();
                        scale[0] = this.mMesh.getScale()[0] * 0.5f;
                        scale[1] = this.mMesh.getScale()[1] * 0.5f;
                        scale[2] = this.mMesh.getScale()[2] * 0.5f;
                        mesh.setColor(this.mMesh.getColor());
                        float[] edgeBlendParam = mesh.getEdgeBlendParam();
                        edgeBlendParam[0] = Float.POSITIVE_INFINITY;
                        edgeBlendParam[1] = this.mMesh.getEdgeBlendParam()[1];
                        edgeBlendParam[2] = this.mMesh.getEdgeBlendParam()[2];
                    }
                    return;
                }
                return;
            }
            if (this.mCountPhy >= 13 || childMeshes == null) {
                return;
            }
            float fRandom = (float) Math.random();
            for (Mesh mesh2 : childMeshes) {
                float[] scale2 = mesh2.getScale();
                scale2[0] = scale2[0] * EVERY_PHY_SCALE;
                scale2[1] = scale2[1] * EVERY_PHY_SCALE;
                scale2[2] = scale2[2] * EVERY_PHY_SCALE;
                float[] pos2 = mesh2.getPos();
                float[] impulseVector = mesh2.getImpulseVector();
                float f = pos2[1];
                float f2 = EVERY_PHY_TRANS * fRandom * fRandom;
                pos2[1] = f + (impulseVector[1] * f2);
                pos2[2] = pos2[2] + (f2 * impulseVector[2]);
            }
            short s = (short) (this.mCountPhy + 1);
            this.mCountPhy = s;
            if (s >= 13) {
                this.mMesh.setIsShow(false);
            }
        }
    }
}
