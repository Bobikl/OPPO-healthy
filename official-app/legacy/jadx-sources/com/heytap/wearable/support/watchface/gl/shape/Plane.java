package com.heytap.wearable.support.watchface.gl.shape;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class Plane extends Mesh {
    private float mDepth;
    private float mHeight;
    private float mWidth;

    public Plane(float f, float f2) {
        this.mWidth = f;
        this.mHeight = f2;
        this.mDepth = 0.0f;
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Mesh
    public void create() {
        float f = this.mWidth * 0.5f;
        float f2 = this.mHeight * 0.5f;
        float f3 = -f;
        float f4 = this.mDepth;
        float f5 = -f2;
        float[] fArr = {f3, f2, f4, f, f2, f4, f, f5, f4, f3, f5, f4};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(48);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        beginUpdateData(4);
        updateData(floatBufferAsFloatBuffer, floatBufferAsFloatBuffer2, floatBufferAsFloatBuffer);
        endUpdateData();
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(12);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
        shortBufferAsShortBuffer.put(new short[]{1, 0, 3, 1, 3, 2});
        shortBufferAsShortBuffer.position(0);
        updateIndexData(6, shortBufferAsShortBuffer);
    }

    public Plane(float f, float f2, float f3) {
        this.mWidth = f;
        this.mHeight = f2;
        this.mDepth = f3;
    }
}
