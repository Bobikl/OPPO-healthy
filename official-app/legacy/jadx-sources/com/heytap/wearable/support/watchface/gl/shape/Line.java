package com.heytap.wearable.support.watchface.gl.shape;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.math.VectorMath;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class Line extends CurveLine {
    private float mEndX;
    private float mEndY;
    private float mRatio;
    private float mStartX;
    private float mStartY;

    public Line() {
        this.mRatio = 1.0f;
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.CurveLine
    public void createCombined(CombinedMesh combinedMesh, int i, int i2) {
        int i3;
        int i4 = this.mSamples;
        float[] fArr = new float[i4 * 6];
        float[] fArr2 = new float[i4 * 4];
        Float3 float3 = new Float3(this.mEndX - this.mStartX, this.mEndY - this.mStartY, 0.0f);
        float length = VectorMath.length(float3) / (this.mSamples - 1);
        VectorMath.normalize(float3);
        Float3 float4 = new Float3();
        VectorMath.rotate(float4, float3, -90.0f, 0.0f, 0.0f, 1.0f);
        VectorMath.normalize(float4);
        float fSin = (float) Math.sin(this.mRotateRadian);
        float fCos = (float) Math.cos(this.mRotateRadian);
        int i5 = 0;
        while (true) {
            i3 = this.mSamples;
            if (i5 >= i3) {
                break;
            }
            float f = i5;
            float f2 = this.mStartX + (float3.x * length * f);
            float f3 = this.mStartY + (float3.y * length * f);
            int i6 = i5 * 6;
            float f4 = (f2 * fCos) - (f3 * fSin);
            fArr[i6] = f4;
            float f5 = (f2 * fSin) + (f3 * fCos);
            float f6 = this.mRatio;
            fArr[i6 + 1] = f5 * f6;
            fArr[i6 + 2] = 1.0f;
            int i7 = i5 * 4;
            float f7 = float4.x;
            float f8 = float4.y;
            fArr2[i7] = (f7 * fCos) - (f8 * fSin);
            fArr2[i7 + 1] = (f7 * fSin) + (f8 * fCos);
            fArr[i6 + 3] = f4;
            fArr[i6 + 4] = f5 * f6;
            fArr[i6 + 5] = 0.0f;
            fArr2[i7 + 2] = -((f7 * fCos) - (f8 * fSin));
            fArr2[i7 + 3] = -((f7 * fSin) + (f8 * fCos));
            i5++;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3 * 6 * 4);
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
            int i8 = this.mSamples;
            if (s >= i8 - 1) {
                ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect((i8 - 1) * 6 * 2);
                byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
                ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
                shortBufferAsShortBuffer.put(sArr);
                shortBufferAsShortBuffer.position(0);
                combinedMesh.updateIndexSubData(shortBufferAsShortBuffer, i2, (this.mSamples - 1) * 6);
                return;
            }
            int i9 = s * 6;
            int i10 = i + (s * 2);
            sArr[i9] = (short) i10;
            int i11 = s + 1;
            int i12 = i + (i11 * 2);
            short s2 = (short) i12;
            sArr[i9 + 1] = s2;
            short s3 = (short) (i10 + 1);
            sArr[i9 + 2] = s3;
            sArr[i9 + 3] = s3;
            sArr[i9 + 4] = s2;
            sArr[i9 + 5] = (short) (i12 + 1);
            s = (short) i11;
        }
    }

    public void init(float f, float f2, float f3, float f4, float f5, int i) {
        this.mStartX = f2;
        this.mStartY = f3;
        this.mEndX = f4;
        this.mEndY = f5;
        if (i > 2) {
            this.mSamples = i;
        }
        this.mRotateRadian = (float) Math.toRadians(f);
    }

    public Line(float f) {
        this.mRatio = f;
    }
}
