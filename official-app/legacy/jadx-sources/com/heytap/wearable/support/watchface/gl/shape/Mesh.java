package com.heytap.wearable.support.watchface.gl.shape;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import com.oplus.aiunit.vision.k18;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class Mesh {
    protected float[] mModelMatrix;
    protected float[] mPos = {0.0f, 0.0f, 0.0f};
    protected float[] mScale = {1.0f, 1.0f, 1.0f};
    protected float[] mImpulseVector = {0.0f, 0.0f, 0.0f};
    protected float[] mColor = {0.0f, 0.0f, 0.0f, 1.0f};
    protected float[] mRot = {0.0f, 0.0f, 0.0f};
    protected float[] mEdgeBlendParam = {0.0f, 0.0f, 0.0f};
    protected float[] mBoundingBox = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    protected Mesh[] mChildMeshes = null;
    protected int mVertexCount = 0;
    protected int mIndexCount = 0;
    protected int[] mVertexBuffer = {0};
    protected int[] mIndexBuffer = {0};
    protected short mTexIndex = -1;
    private boolean mIsShow = true;

    public Mesh() {
        float[] fArr = new float[16];
        this.mModelMatrix = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void beginDraw() {
        GLES20.glBindBuffer(k18.GL_ARRAY_BUFFER, this.mVertexBuffer[0]);
        GLES20.glBindBuffer(k18.GL_ELEMENT_ARRAY_BUFFER, this.mIndexBuffer[0]);
    }

    public void beginUpdateData(int i) {
        this.mVertexCount = i;
        int[] iArr = this.mVertexBuffer;
        if (iArr[0] == 0) {
            GLES20.glGenBuffers(iArr.length, iArr, 0);
        }
        GLES20.glBindBuffer(k18.GL_ARRAY_BUFFER, this.mVertexBuffer[0]);
    }

    public void beginUpdateIndex(int i) {
        int[] iArr = this.mIndexBuffer;
        if (iArr[0] == 0) {
            GLES20.glGenBuffers(1, iArr, 0);
        }
        this.mIndexCount = i;
        GLES20.glBindBuffer(k18.GL_ELEMENT_ARRAY_BUFFER, this.mIndexBuffer[0]);
        GLES20.glBufferData(k18.GL_ELEMENT_ARRAY_BUFFER, this.mIndexCount * 2, null, k18.GL_STATIC_DRAW);
    }

    public void beginUpdateVertex(int i, int i2) {
        this.mVertexCount = i;
        int[] iArr = this.mVertexBuffer;
        if (iArr[0] == 0) {
            GLES20.glGenBuffers(iArr.length, iArr, 0);
        }
        GLES20.glBindBuffer(k18.GL_ARRAY_BUFFER, this.mVertexBuffer[0]);
        GLES20.glBufferData(k18.GL_ARRAY_BUFFER, this.mVertexCount * i2 * 4, null, k18.GL_STATIC_DRAW);
    }

    public FloatBuffer convertToFloatBuffer(ArrayList<Float> arrayList) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = arrayList.get(i).floatValue();
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(arrayList.size() * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public ShortBuffer convertToShortBuffer(ArrayList<Short> arrayList) {
        int size = arrayList.size();
        short[] sArr = new short[size];
        for (int i = 0; i < size; i++) {
            sArr[i] = arrayList.get(i).shortValue();
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(arrayList.size() * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        shortBufferAsShortBuffer.put(sArr);
        shortBufferAsShortBuffer.position(0);
        return shortBufferAsShortBuffer;
    }

    public void create() {
    }

    public void draw() {
        GLES20.glDrawElements(4, this.mIndexCount, 5123, 0);
    }

    public void drawInstanced(int i, float f) {
        GLES30.glDrawElementsInstanced(4, (int) (f * this.mIndexCount), 5123, 0, i);
    }

    public void endDraw() {
        GLES20.glBindBuffer(k18.GL_ELEMENT_ARRAY_BUFFER, 0);
    }

    public void endUpdateData() {
        GLES20.glBindBuffer(k18.GL_ARRAY_BUFFER, 0);
    }

    public void endUpdateIndex() {
        GLES20.glBindBuffer(k18.GL_ELEMENT_ARRAY_BUFFER, 0);
    }

    public void endUpdateVertex() {
        GLES20.glBindBuffer(k18.GL_ARRAY_BUFFER, 0);
    }

    public void genDynamicData(int i, int i2) {
        this.mVertexCount = i;
        int[] iArr = this.mVertexBuffer;
        if (iArr[0] == 0) {
            GLES20.glGenBuffers(iArr.length, iArr, 0);
        }
        GLES20.glBindBuffer(k18.GL_ARRAY_BUFFER, this.mVertexBuffer[0]);
        GLES20.glBufferData(k18.GL_ARRAY_BUFFER, this.mVertexCount * i2 * 4, null, k18.GL_DYNAMIC_DRAW);
    }

    public float[] getBoundingBox() {
        return this.mBoundingBox;
    }

    public Mesh[] getChildMeshes() {
        return this.mChildMeshes;
    }

    public float[] getColor() {
        return this.mColor;
    }

    public float[] getEdgeBlendParam() {
        return this.mEdgeBlendParam;
    }

    public float getExtendX() {
        return 0.0f;
    }

    public float[] getImpulseVector() {
        return this.mImpulseVector;
    }

    public int getIndexCount() {
        return this.mIndexCount;
    }

    public boolean getIsShow() {
        return this.mIsShow;
    }

    public float getMinX() {
        return 0.0f;
    }

    public float[] getModelMatrix() {
        return this.mModelMatrix;
    }

    public float[] getPos() {
        return this.mPos;
    }

    public float[] getRot() {
        return this.mRot;
    }

    public float[] getScale() {
        return this.mScale;
    }

    public short getTexIndex() {
        return this.mTexIndex;
    }

    public int getVertexCount() {
        return this.mVertexCount;
    }

    public void setChildMeshes(Mesh[] meshArr) {
        this.mChildMeshes = meshArr;
    }

    public void setColor(float[] fArr) {
        this.mColor = fArr;
    }

    public void setEdgeBlendParam(float[] fArr) {
        this.mEdgeBlendParam = fArr;
    }

    public void setImpulseVector(float[] fArr) {
        this.mImpulseVector = fArr;
    }

    public void setIsShow(boolean z) {
        this.mIsShow = z;
    }

    public void setModelMatrix(float[] fArr) {
        this.mModelMatrix = fArr;
    }

    public void setPos(float[] fArr) {
        this.mPos = fArr;
    }

    public void setRot(float[] fArr) {
        this.mRot = fArr;
    }

    public void setScale(float[] fArr) {
        this.mScale = fArr;
    }

    public void setTexIndex(short s) {
        this.mTexIndex = s;
    }

    public void updateData(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, FloatBuffer floatBuffer3) {
        GLES20.glBufferData(k18.GL_ARRAY_BUFFER, this.mVertexCount * 8 * 4, null, k18.GL_STATIC_DRAW);
        if (floatBuffer != null) {
            GLES20.glBufferSubData(k18.GL_ARRAY_BUFFER, 0, this.mVertexCount * 3 * 4, floatBuffer);
        }
        if (floatBuffer2 != null) {
            int i = this.mVertexCount;
            GLES20.glBufferSubData(k18.GL_ARRAY_BUFFER, i * 3 * 4, i * 2 * 4, floatBuffer2);
        }
        if (floatBuffer3 != null) {
            int i2 = this.mVertexCount;
            GLES20.glBufferSubData(k18.GL_ARRAY_BUFFER, i2 * 5 * 4, i2 * 3 * 4, floatBuffer3);
        }
    }

    public void updateDataDynamic(FloatBuffer floatBuffer, int i, int i2) {
        GLES20.glBindBuffer(k18.GL_ARRAY_BUFFER, this.mVertexBuffer[0]);
        if (floatBuffer != null) {
            GLES20.glBufferSubData(k18.GL_ARRAY_BUFFER, i, i2, floatBuffer);
        }
    }

    public void updateIndexData(int i, ShortBuffer shortBuffer) {
        int[] iArr = this.mIndexBuffer;
        if (iArr[0] == 0) {
            GLES20.glGenBuffers(1, iArr, 0);
        }
        GLES20.glBindBuffer(k18.GL_ELEMENT_ARRAY_BUFFER, this.mIndexBuffer[0]);
        GLES20.glBufferData(k18.GL_ELEMENT_ARRAY_BUFFER, i * 2, shortBuffer, k18.GL_STATIC_DRAW);
        this.mIndexCount = i;
    }

    public void updateIndexSubData(ShortBuffer shortBuffer, int i, int i2) {
        if (shortBuffer != null) {
            GLES20.glBufferSubData(k18.GL_ELEMENT_ARRAY_BUFFER, i * 2, i2 * 2, shortBuffer);
        }
    }

    public void updateSubVertexData(FloatBuffer floatBuffer, int i, int i2) {
        if (floatBuffer != null) {
            GLES20.glBufferSubData(k18.GL_ARRAY_BUFFER, i * 4, i2 * 4, floatBuffer);
        }
    }
}
