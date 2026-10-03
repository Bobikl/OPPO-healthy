package com.heytap.wearable.support.watchface.gl.shape;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.math.VectorMath;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class CurveLine {
    protected static final int COORD_ELEMENT_NUM = 4;
    protected static final int POSITION_ELEMENT_NUM = 6;
    private float mOffsetX;
    private float mOffsetY;
    private float mRadian;
    private float mRadius;
    private float mRatio;
    protected float mRotateRadian;
    protected int mSamples;
    private float mStartRadian;

    public CurveLine() {
        this.mOffsetX = 0.0f;
        this.mOffsetY = 0.0f;
        this.mRotateRadian = 0.0f;
        this.mSamples = 2;
        this.mRatio = 1.0f;
    }

    public static int getVertexElementsNum() {
        return 5;
    }

    public void createCombined(CombinedMesh combinedMesh, int i, int i2) {
        int i3 = this.mSamples;
        float[] fArr = new float[i3 * 6];
        float[] fArr2 = new float[i3 * 4];
        float f = this.mRadian / (i3 - 1);
        float f2 = this.mStartRadian;
        float f3 = this.mRadius;
        float fSin = (float) Math.sin(this.mRotateRadian);
        float fCos = (float) Math.cos(this.mRotateRadian);
        int i4 = this.mSamples;
        float f4 = 1.0f;
        if (i4 > 2) {
            int i5 = 0;
            while (i5 < this.mSamples) {
                double d = (i5 * f) + f2;
                float fCos2 = (float) Math.cos(d);
                float fSin2 = (float) Math.sin(d);
                float f5 = (fCos2 * f3) + this.mOffsetX;
                float f6 = (fSin2 * f3) + this.mOffsetY;
                int i6 = i5 * 6;
                float f7 = (f5 * fCos) - (f6 * fSin);
                fArr[i6] = f7;
                float f8 = (f5 * fSin) + (f6 * fCos);
                float f9 = this.mRatio;
                fArr[i6 + 1] = f8 * f9;
                fArr[i6 + 2] = f4;
                int i7 = i5 * 4;
                float f10 = (fCos2 * fCos) - (fSin2 * fSin);
                fArr2[i7] = f10;
                float f11 = (fCos2 * fSin) + (fSin2 * fCos);
                fArr2[i7 + 1] = f11;
                fArr[i6 + 3] = f7;
                fArr[i6 + 4] = f8 * f9;
                fArr[i6 + 5] = 0.0f;
                fArr2[i7 + 2] = -f10;
                fArr2[i7 + 3] = -f11;
                i5++;
                f4 = 1.0f;
            }
        } else if (2 == i4) {
            Float3 float3 = new Float3((float) (Math.cos(this.mStartRadian) - Math.cos(this.mStartRadian + this.mRadian)), (float) (Math.sin(this.mStartRadian) - Math.sin(this.mStartRadian + this.mRadian)), 0.0f);
            VectorMath.normalize(float3);
            Float3 float4 = new Float3();
            VectorMath.rotate(float4, float3, 90.0f, 0.0f, 0.0f, 1.0f);
            VectorMath.normalize(float4);
            int i8 = 0;
            while (i8 < this.mSamples) {
                double d2 = (i8 * f) + f2;
                float fCos3 = (float) Math.cos(d2);
                float fSin3 = (float) Math.sin(d2);
                int i9 = i8 * 6;
                float f12 = fCos3 * f3;
                float f13 = this.mOffsetX;
                fArr[i9] = f12 + f13;
                float f14 = fSin3 * f3;
                float f15 = this.mOffsetY;
                fArr[i9 + 1] = f14 + f15;
                fArr[i9 + 2] = 1.0f;
                int i10 = i8 * 4;
                float f16 = float4.x;
                fArr2[i10] = f16;
                float f17 = f2;
                float f18 = float4.y;
                fArr2[i10 + 1] = f18;
                fArr[i9 + 3] = f12 + f13;
                fArr[i9 + 4] = f14 + f15;
                fArr[i9 + 5] = 0.0f;
                fArr2[i10 + 2] = -f16;
                fArr2[i10 + 3] = -f18;
                i8++;
                f2 = f17;
            }
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.mSamples * 6 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.mSamples * 4 * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        int vertexCount = combinedMesh.getVertexCount();
        combinedMesh.updateSubVertexData(floatBufferAsFloatBuffer, i * 3, this.mSamples * 2 * 3);
        combinedMesh.updateSubVertexData(floatBufferAsFloatBuffer2, (vertexCount * 3) + (i * 2), this.mSamples * 2 * 2);
        short[] sArr = new short[(this.mSamples - 1) * 6];
        short s = 0;
        while (true) {
            int i11 = this.mSamples;
            if (s >= i11 - 1) {
                ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect((i11 - 1) * 6 * 2);
                byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
                ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
                shortBufferAsShortBuffer.put(sArr);
                shortBufferAsShortBuffer.position(0);
                combinedMesh.updateIndexSubData(shortBufferAsShortBuffer, i2, (this.mSamples - 1) * 6);
                return;
            }
            int i12 = s * 6;
            int i13 = i + (s * 2);
            sArr[i12] = (short) i13;
            int i14 = s + 1;
            int i15 = i + (i14 * 2);
            short s2 = (short) i15;
            sArr[i12 + 1] = s2;
            short s3 = (short) (i13 + 1);
            sArr[i12 + 2] = s3;
            sArr[i12 + 3] = s3;
            sArr[i12 + 4] = s2;
            sArr[i12 + 5] = (short) (i15 + 1);
            s = (short) i14;
        }
    }

    public int getIndexCount() {
        return (this.mSamples - 1) * 6;
    }

    public int getVertexCount() {
        return this.mSamples * 2;
    }

    public void init(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.mOffsetX = f;
        this.mOffsetY = f2;
        this.mRotateRadian = (float) Math.toRadians(f3);
        this.mRadius = f4;
        this.mRadian = (float) Math.toRadians(f6 - f5);
        this.mStartRadian = (float) Math.toRadians(f5);
        if (i > 1) {
            this.mSamples = i;
        }
    }

    public CurveLine(float f) {
        this.mOffsetX = 0.0f;
        this.mOffsetY = 0.0f;
        this.mRotateRadian = 0.0f;
        this.mSamples = 2;
        this.mRatio = f;
    }
}
