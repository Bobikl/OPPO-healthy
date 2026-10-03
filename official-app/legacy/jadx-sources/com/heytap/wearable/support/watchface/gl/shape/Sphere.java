package com.heytap.wearable.support.watchface.gl.shape;

import java.nio.FloatBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class Sphere extends Mesh {
    protected boolean mIsCreated;
    protected float mRadius;
    protected short mSamplesZ;

    public Sphere() {
        this.mRadius = 2.8f;
        this.mIsCreated = false;
        this.mSamplesZ = (short) 40;
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Mesh
    public void create() {
        create(0.0f, 0.0f, 0.0f, this.mRadius);
    }

    public boolean getIsCreated() {
        return this.mIsCreated;
    }

    public float getRadius() {
        return this.mRadius;
    }

    public void create(float f) {
        create(0.0f, 0.0f, 0.0f, f);
    }

    public void create(float f, float f2, float f3) {
        create(f, f2, f3, this.mRadius);
    }

    public void create(float f, float f2, float f3, float f4) {
        short s;
        ArrayList<Float> arrayList = new ArrayList<>();
        ArrayList<Float> arrayList2 = new ArrayList<>();
        ArrayList<Float> arrayList3 = new ArrayList<>();
        ArrayList<Short> arrayList4 = new ArrayList<>();
        double d = 3.141592653589793d / ((double) this.mSamplesZ);
        this.mRadius = f4;
        float[] fArr = this.mPos;
        fArr[0] = f;
        int i = 1;
        fArr[1] = f2;
        short s2 = 2;
        fArr[2] = f3;
        float[] fArr2 = this.mBoundingBox;
        fArr2[0] = f - f4;
        fArr2[1] = f2 - f4;
        fArr2[2] = f3 - f4;
        fArr2[3] = f + f4;
        fArr2[4] = f2 + f4;
        fArr2[5] = f3 + f4;
        int i2 = 0;
        double d2 = 0.0d;
        while (true) {
            s = this.mSamplesZ;
            if (i2 >= s + 1) {
                break;
            }
            int i3 = 0;
            double d3 = 0.0d;
            while (i3 < (this.mSamplesZ * s2) + i) {
                float fSin = (float) (Math.sin(d2) * Math.cos(d3));
                float fSin2 = (float) (Math.sin(d2) * Math.sin(d3));
                float fCos = (float) Math.cos(d2);
                short s3 = this.mSamplesZ;
                arrayList3.add(Float.valueOf(fSin));
                arrayList3.add(Float.valueOf(fSin2));
                arrayList3.add(Float.valueOf(fCos));
                arrayList.add(Float.valueOf(f + (fSin * f4)));
                arrayList.add(Float.valueOf(f2 + (f4 * fSin2)));
                arrayList.add(Float.valueOf(f3 + (fCos * f4)));
                arrayList2.add(Float.valueOf((i3 / s3) / 2.0f));
                arrayList2.add(Float.valueOf(i2 / s3));
                d3 += d;
                i3++;
                i = 1;
                s2 = 2;
            }
            d2 += d;
            i2++;
            i = 1;
            s2 = 2;
        }
        short s4 = s2;
        short s5 = (short) ((s * s4) + 1);
        for (short s6 = 0; s6 < this.mSamplesZ; s6 = (short) (s6 + 1)) {
            for (short s7 = 0; s7 < this.mSamplesZ * s4; s7 = (short) (s7 + 1)) {
                int i4 = (s6 * s5) + s7;
                short s8 = (short) i4;
                int i5 = ((s6 + 1) * s5) + s7;
                short s9 = (short) (i5 + 1);
                arrayList4.add(Short.valueOf((short) (i4 + 1)));
                arrayList4.add(Short.valueOf(s8));
                arrayList4.add(Short.valueOf(s9));
                arrayList4.add(Short.valueOf(s8));
                arrayList4.add(Short.valueOf((short) i5));
                arrayList4.add(Short.valueOf(s9));
            }
        }
        this.mVertexCount = arrayList.size() / 3;
        this.mIndexCount = arrayList4.size();
        FloatBuffer floatBufferConvertToFloatBuffer = convertToFloatBuffer(arrayList);
        FloatBuffer floatBufferConvertToFloatBuffer2 = convertToFloatBuffer(arrayList2);
        FloatBuffer floatBufferConvertToFloatBuffer3 = convertToFloatBuffer(arrayList3);
        beginUpdateData(this.mVertexCount);
        updateData(floatBufferConvertToFloatBuffer, floatBufferConvertToFloatBuffer2, floatBufferConvertToFloatBuffer3);
        endUpdateData();
        updateIndexData(this.mIndexCount, convertToShortBuffer(arrayList4));
        this.mIsCreated = true;
    }

    public Sphere(float f) {
        this.mIsCreated = false;
        this.mSamplesZ = (short) 40;
        this.mRadius = f;
    }
}
