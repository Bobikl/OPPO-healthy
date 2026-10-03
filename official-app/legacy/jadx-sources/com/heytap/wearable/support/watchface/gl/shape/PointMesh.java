package com.heytap.wearable.support.watchface.gl.shape;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class PointMesh extends Mesh {
    private float mX;
    private float mY;
    private float mZ;

    public PointMesh(float f, float f2, float f3) {
        this.mX = f;
        this.mY = f2;
        this.mZ = f3;
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Mesh
    public void create() {
        float f = this.mX;
        float f2 = this.mY;
        float f3 = this.mZ;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(48);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{f, f2, f3, f, f2, f3, f, f2, f3, f, f2, f3});
        floatBufferAsFloatBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(48);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer3 = byteBufferAllocateDirect3.asFloatBuffer();
        floatBufferAsFloatBuffer3.put(new float[]{-1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f});
        floatBufferAsFloatBuffer3.position(0);
        beginUpdateData(4);
        updateData(floatBufferAsFloatBuffer, floatBufferAsFloatBuffer2, floatBufferAsFloatBuffer3);
        endUpdateData();
        ByteBuffer byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(12);
        byteBufferAllocateDirect4.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect4.asShortBuffer();
        shortBufferAsShortBuffer.put(new short[]{1, 0, 3, 1, 3, 2});
        shortBufferAsShortBuffer.position(0);
        updateIndexData(6, shortBufferAsShortBuffer);
    }
}
