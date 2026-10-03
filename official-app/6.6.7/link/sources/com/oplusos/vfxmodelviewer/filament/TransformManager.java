package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class TransformManager {
    private long mNativeObject;

    public TransformManager(long j) {
        this.mNativeObject = j;
    }

    private static native void nCommitLocalTransformTransaction(long j);

    private static native int nCreate(long j, int i);

    private static native int nCreateArray(long j, int i, int i2, float[] fArr);

    private static native int nCreateArrayFp64(long j, int i, int i2, double[] dArr);

    private static native void nDestroy(long j, int i);

    private static native int nGetInstance(long j, int i);

    private static native int nGetParent(long j, int i);

    private static native void nGetTransform(long j, int i, float[] fArr);

    private static native void nGetTransformFp64(long j, int i, double[] dArr);

    private static native void nGetWorldTransform(long j, int i, float[] fArr);

    private static native void nGetWorldTransformFp64(long j, int i, double[] dArr);

    private static native boolean nHasComponent(long j, int i);

    private static native boolean nIsAccurateTranslationsEnabled(long j);

    private static native void nOpenLocalTransformTransaction(long j);

    private static native void nSetAccurateTranslationsEnabled(long j, boolean z);

    private static native void nSetParent(long j, int i, int i2);

    private static native void nSetTransform(long j, int i, float[] fArr);

    private static native void nSetTransformFp64(long j, int i, double[] dArr);

    public void commitLocalTransformTransaction() {
        nCommitLocalTransformTransaction(this.mNativeObject);
    }

    @EntityInstance
    public int create(@Entity int i) {
        return nCreate(this.mNativeObject, i);
    }

    public void destroy(@Entity int i) {
        nDestroy(this.mNativeObject, i);
    }

    @EntityInstance
    public int getInstance(@Entity int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Entity
    public int getParent(@EntityInstance int i) {
        return nGetParent(this.mNativeObject, i);
    }

    @NonNull
    @Size(min = 16)
    public float[] getTransform(@EntityInstance int i, @Nullable @Size(min = 16) float[] fArr) {
        float[] fArrAssertMat4f = Asserts.assertMat4f(fArr);
        nGetTransform(this.mNativeObject, i, fArrAssertMat4f);
        return fArrAssertMat4f;
    }

    @NonNull
    @Size(min = 16)
    public float[] getWorldTransform(@EntityInstance int i, @Nullable @Size(min = 16) float[] fArr) {
        float[] fArrAssertMat4f = Asserts.assertMat4f(fArr);
        nGetWorldTransform(this.mNativeObject, i, fArrAssertMat4f);
        return fArrAssertMat4f;
    }

    public boolean hasComponent(@Entity int i) {
        return nHasComponent(this.mNativeObject, i);
    }

    public boolean isAccurateTranslationsEnabled() {
        return nIsAccurateTranslationsEnabled(this.mNativeObject);
    }

    public void openLocalTransformTransaction() {
        nOpenLocalTransformTransaction(this.mNativeObject);
    }

    public void setAccurateTranslationsEnabled(boolean z) {
        nSetAccurateTranslationsEnabled(this.mNativeObject, z);
    }

    public void setParent(@EntityInstance int i, @EntityInstance int i2) {
        nSetParent(this.mNativeObject, i, i2);
    }

    public void setTransform(@EntityInstance int i, @NonNull @Size(min = 16) float[] fArr) {
        Asserts.assertMat4fIn(fArr);
        nSetTransform(this.mNativeObject, i, fArr);
    }

    @EntityInstance
    public int create(@Entity int i, @EntityInstance int i2, @Nullable @Size(min = 16) float[] fArr) {
        return nCreateArray(this.mNativeObject, i, i2, fArr);
    }

    @EntityInstance
    public int create(@Entity int i, @EntityInstance int i2, @Nullable @Size(min = 16) double[] dArr) {
        return nCreateArrayFp64(this.mNativeObject, i, i2, dArr);
    }

    @NonNull
    @Size(min = 16)
    public double[] getTransform(@EntityInstance int i, @Nullable @Size(min = 16) double[] dArr) {
        double[] dArrAssertMat4 = Asserts.assertMat4(dArr);
        nGetTransformFp64(this.mNativeObject, i, dArrAssertMat4);
        return dArrAssertMat4;
    }

    @NonNull
    @Size(min = 16)
    public double[] getWorldTransform(@EntityInstance int i, @Nullable @Size(min = 16) double[] dArr) {
        double[] dArrAssertMat4 = Asserts.assertMat4(dArr);
        nGetWorldTransformFp64(this.mNativeObject, i, dArrAssertMat4);
        return dArrAssertMat4;
    }

    public void setTransform(@EntityInstance int i, @NonNull @Size(min = 16) double[] dArr) {
        Asserts.assertMat4In(dArr);
        nSetTransformFp64(this.mNativeObject, i, dArr);
    }
}
