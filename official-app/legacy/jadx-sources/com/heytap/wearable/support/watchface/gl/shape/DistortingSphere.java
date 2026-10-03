package com.heytap.wearable.support.watchface.gl.shape;

import java.nio.FloatBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DistortingSphere extends Sphere {
    protected int m20FaceSphereDepth;
    private ArrayList<Float> mCoords;
    private short mCountIndex;
    private ArrayList<Short> mIndexs;
    private ArrayList<Float> mNormals;
    private boolean mUse20Face;
    private ArrayList<Float> mVertexs;
    private static final float Z = 0.8506508f;
    private static final float X = 0.5257311f;
    private static final float[][] VDATA = {new float[]{-0.5257311f, 0.0f, Z}, new float[]{X, 0.0f, Z}, new float[]{-0.5257311f, 0.0f, -0.8506508f}, new float[]{X, 0.0f, -0.8506508f}, new float[]{0.0f, Z, X}, new float[]{0.0f, Z, -0.5257311f}, new float[]{0.0f, -0.8506508f, X}, new float[]{0.0f, -0.8506508f, -0.5257311f}, new float[]{Z, X, 0.0f}, new float[]{-0.8506508f, X, 0.0f}, new float[]{Z, -0.5257311f, 0.0f}, new float[]{-0.8506508f, -0.5257311f, 0.0f}};
    private static final int[][] TINDICES = {new int[]{1, 4, 0}, new int[]{4, 9, 0}, new int[]{4, 5, 9}, new int[]{8, 5, 4}, new int[]{1, 8, 4}, new int[]{1, 10, 8}, new int[]{10, 3, 8}, new int[]{8, 3, 5}, new int[]{3, 2, 5}, new int[]{3, 7, 2}, new int[]{3, 10, 7}, new int[]{10, 6, 7}, new int[]{6, 11, 7}, new int[]{6, 0, 11}, new int[]{6, 1, 0}, new int[]{10, 1, 6}, new int[]{11, 0, 9}, new int[]{2, 11, 9}, new int[]{5, 2, 9}, new int[]{11, 2, 7}};

    public DistortingSphere(float f, boolean z) {
        super(f);
        this.mVertexs = new ArrayList<>();
        this.mCoords = new ArrayList<>();
        this.mNormals = new ArrayList<>();
        this.mIndexs = new ArrayList<>();
        this.mCountIndex = (short) 0;
        this.m20FaceSphereDepth = 4;
        this.mUse20Face = z;
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Sphere
    public void create(float f, float f2, float f3, float f4) {
        this.mRadius = f4;
        float[] fArr = this.mPos;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArr2 = this.mBoundingBox;
        fArr2[0] = f - f4;
        fArr2[1] = f2 - f4;
        fArr2[2] = f3 - f4;
        fArr2[3] = f + f4;
        fArr2[4] = f2 + f4;
        fArr2[5] = f3 + f4;
        if (this.mUse20Face) {
            create20FaceSphere(this.m20FaceSphereDepth);
        } else {
            createSphere();
        }
        this.mVertexCount = this.mVertexs.size() / 3;
        this.mIndexCount = this.mIndexs.size();
        FloatBuffer floatBufferConvertToFloatBuffer = convertToFloatBuffer(this.mVertexs);
        FloatBuffer floatBufferConvertToFloatBuffer2 = convertToFloatBuffer(this.mCoords);
        FloatBuffer floatBufferConvertToFloatBuffer3 = convertToFloatBuffer(this.mNormals);
        beginUpdateData(this.mVertexCount);
        updateData(floatBufferConvertToFloatBuffer, floatBufferConvertToFloatBuffer2, floatBufferConvertToFloatBuffer3);
        endUpdateData();
        updateIndexData(this.mIndexCount, convertToShortBuffer(this.mIndexs));
        this.mVertexs.clear();
        this.mCoords.clear();
        this.mNormals.clear();
        this.mIndexs.clear();
        this.mIsCreated = true;
    }

    public void create20FaceSphere(int i) {
        this.mCountIndex = (short) 0;
        for (short s = 0; s < 20; s = (short) (s + 1)) {
            float[][] fArr = VDATA;
            int[] iArr = TINDICES[s];
            subdivide(fArr[iArr[0]], fArr[iArr[1]], fArr[iArr[2]], i);
        }
    }

    public void createSphere() {
        short s;
        double d = 3.141592653589793d / ((double) this.mSamplesZ);
        int i = 0;
        double d2 = 0.0d;
        while (true) {
            s = this.mSamplesZ;
            short s2 = 2;
            if (i >= s + 1) {
                break;
            }
            int i2 = 0;
            double d3 = 0.0d;
            for (int i3 = 1; i2 < (this.mSamplesZ * s2) + i3; i3 = 1) {
                float fSin = (float) (Math.sin(d2) * Math.cos(d3));
                float fSin2 = (float) (Math.sin(d2) * Math.sin(d3));
                double d4 = d;
                float fCos = (float) Math.cos(d2);
                short s3 = this.mSamplesZ;
                double d5 = (d2 - 1.5707963267948966d) / 1.5707963267948966d;
                float fAbs = ((float) (((double) (((i2 / s3) - 1.0f) - 0.5f)) * ((((double) (((float) (1.0d - Math.abs(d5))) * 0.6f)) * Math.abs((d3 - 4.71238898038469d) / 1.5707963267948966d)) + 0.4000000059604645d))) + 0.5f;
                float fAbs2 = ((float) (((double) ((i / s3) - 0.5f)) * ((Math.abs(d5) * 0.5d) + 0.5d))) + 0.5f;
                this.mNormals.add(Float.valueOf(fSin));
                this.mNormals.add(Float.valueOf(fSin2));
                this.mNormals.add(Float.valueOf(fCos));
                this.mVertexs.add(Float.valueOf(this.mPos[0] + (this.mRadius * fSin)));
                this.mVertexs.add(Float.valueOf(this.mPos[1] + (this.mRadius * fSin2)));
                this.mVertexs.add(Float.valueOf(this.mPos[2] + (this.mRadius * fCos)));
                this.mCoords.add(Float.valueOf(fAbs));
                this.mCoords.add(Float.valueOf(fAbs2));
                d3 += d4;
                i2++;
                d = d4;
                i = i;
                d2 = d2;
                s2 = 2;
            }
            i++;
            d2 += d;
        }
        short s4 = (short) ((s * 2) + 1);
        for (short s5 = 0; s5 < this.mSamplesZ; s5 = (short) (s5 + 1)) {
            for (short s6 = 0; s6 < this.mSamplesZ * 2; s6 = (short) (s6 + 1)) {
                int i4 = (s5 * s4) + s6;
                short s7 = (short) i4;
                int i5 = ((s5 + 1) * s4) + s6;
                short s8 = (short) (i5 + 1);
                this.mIndexs.add(Short.valueOf((short) (i4 + 1)));
                this.mIndexs.add(Short.valueOf(s7));
                this.mIndexs.add(Short.valueOf(s8));
                this.mIndexs.add(Short.valueOf(s7));
                this.mIndexs.add(Short.valueOf((short) i5));
                this.mIndexs.add(Short.valueOf(s8));
            }
        }
    }

    public void normalize(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        double dSqrt = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
        if (0.0d == dSqrt) {
            return;
        }
        fArr[0] = (float) (((double) fArr[0]) / dSqrt);
        fArr[1] = (float) (((double) fArr[1]) / dSqrt);
        fArr[2] = (float) (((double) fArr[2]) / dSqrt);
    }

    public void pushTriangle(float[] fArr, float[] fArr2, float[] fArr3) {
        pushVertex(fArr);
        pushVertex(fArr2);
        pushVertex(fArr3);
    }

    public void pushVertex(float[] fArr) {
        this.mNormals.add(Float.valueOf(fArr[0]));
        this.mNormals.add(Float.valueOf(fArr[1]));
        this.mNormals.add(Float.valueOf(fArr[2]));
        this.mVertexs.add(Float.valueOf(this.mPos[0] + (this.mRadius * fArr[0])));
        this.mVertexs.add(Float.valueOf(this.mPos[1] + (this.mRadius * fArr[1])));
        this.mVertexs.add(Float.valueOf(this.mPos[2] + (this.mRadius * fArr[2])));
        float fAcos = (float) Math.acos(fArr[0]);
        float fAcos2 = (float) (((double) ((float) Math.acos(fArr[2]))) / 3.141592653589793d);
        this.mCoords.add(Float.valueOf((float) (((double) fAcos) / 3.141592653589793d)));
        this.mCoords.add(Float.valueOf(fAcos2));
        ArrayList<Short> arrayList = this.mIndexs;
        short s = this.mCountIndex;
        this.mCountIndex = (short) (s + 1);
        arrayList.add(Short.valueOf(s));
    }

    public void subdivide(float[] fArr, float[] fArr2, float[] fArr3, int i) {
        float[] fArr4 = new float[3];
        float[] fArr5 = new float[3];
        float[] fArr6 = new float[3];
        if (i == 0) {
            pushTriangle(fArr, fArr2, fArr3);
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            fArr4[i2] = (fArr[i2] + fArr2[i2]) / 2.0f;
            fArr5[i2] = (fArr2[i2] + fArr3[i2]) / 2.0f;
            fArr6[i2] = (fArr3[i2] + fArr[i2]) / 2.0f;
        }
        normalize(fArr4);
        normalize(fArr5);
        normalize(fArr6);
        int i3 = i - 1;
        subdivide(fArr, fArr4, fArr6, i3);
        subdivide(fArr2, fArr5, fArr4, i3);
        subdivide(fArr3, fArr6, fArr5, i3);
        subdivide(fArr4, fArr5, fArr6, i3);
    }
}
