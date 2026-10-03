package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

/* JADX INFO: loaded from: classes9.dex */
public class Camera {

    @Entity
    private final int mEntity;
    private long mNativeObject;

    public enum Fov {
        VERTICAL,
        HORIZONTAL
    }

    public enum Projection {
        PERSPECTIVE,
        ORTHO
    }

    public Camera(long j2, @Entity int i) {
        this.mNativeObject = j2;
        this.mEntity = i;
    }

    public static double computeEffectiveFocalLength(double d, double d2) {
        return nComputeEffectiveFocalLength(d, d2);
    }

    public static double computeEffectiveFov(double d, double d2) {
        return nComputeEffectiveFov(d, d2);
    }

    private static native double nComputeEffectiveFocalLength(double d, double d2);

    private static native double nComputeEffectiveFov(double d, double d2);

    private static native float nGetAperture(long j2);

    private static native float nGetCullingFar(long j2);

    private static native void nGetCullingProjectionMatrix(long j2, double[] dArr);

    private static native double nGetFocalLength(long j2);

    private static native float nGetFocusDistance(long j2);

    private static native void nGetForwardVector(long j2, float[] fArr);

    private static native void nGetLeftVector(long j2, float[] fArr);

    private static native void nGetModelMatrix(long j2, float[] fArr);

    private static native void nGetModelMatrixFp64(long j2, double[] dArr);

    private static native float nGetNear(long j2);

    private static native void nGetPosition(long j2, float[] fArr);

    private static native void nGetProjectionMatrix(long j2, double[] dArr);

    private static native void nGetScaling(long j2, double[] dArr);

    private static native float nGetSensitivity(long j2);

    private static native float nGetShutterSpeed(long j2);

    private static native void nGetUpVector(long j2, float[] fArr);

    private static native void nGetViewMatrix(long j2, float[] fArr);

    private static native void nGetViewMatrixFp64(long j2, double[] dArr);

    private static native void nLookAt(long j2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9);

    private static native void nSetCustomProjection(long j2, double[] dArr, double[] dArr2, double d, double d2);

    private static native void nSetExposure(long j2, float f, float f2, float f3);

    private static native void nSetFocusDistance(long j2, float f);

    private static native void nSetLensProjection(long j2, double d, double d2, double d3, double d4);

    private static native void nSetModelMatrix(long j2, float[] fArr);

    private static native void nSetModelMatrixFp64(long j2, double[] dArr);

    private static native void nSetProjection(long j2, int i, double d, double d2, double d3, double d4, double d5, double d6);

    private static native void nSetProjectionFov(long j2, double d, double d2, double d3, double d4, int i);

    private static native void nSetScaling(long j2, double d, double d2);

    private static native void nSetShift(long j2, double d, double d2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public float getAperture() {
        return nGetAperture(getNativeObject());
    }

    public float getCullingFar() {
        return nGetCullingFar(getNativeObject());
    }

    @NonNull
    @Size(min = 16)
    public double[] getCullingProjectionMatrix(@Nullable @Size(min = 16) double[] dArr) {
        double[] dArrAssertMat4d = Asserts.assertMat4d(dArr);
        nGetCullingProjectionMatrix(getNativeObject(), dArrAssertMat4d);
        return dArrAssertMat4d;
    }

    @Entity
    public int getEntity() {
        return this.mEntity;
    }

    public double getFocalLength() {
        return nGetFocalLength(getNativeObject());
    }

    public float getFocusDistance() {
        return nGetFocusDistance(getNativeObject());
    }

    @NonNull
    @Size(min = 3)
    public float[] getForwardVector(@Nullable @Size(min = 3) float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetForwardVector(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    @NonNull
    @Size(min = 3)
    public float[] getLeftVector(@Nullable @Size(min = 3) float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetLeftVector(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    @NonNull
    @Size(min = 16)
    public float[] getModelMatrix(@Nullable @Size(min = 16) float[] fArr) {
        float[] fArrAssertMat4f = Asserts.assertMat4f(fArr);
        nGetModelMatrix(getNativeObject(), fArrAssertMat4f);
        return fArrAssertMat4f;
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed Camera");
    }

    public float getNear() {
        return nGetNear(getNativeObject());
    }

    @NonNull
    @Size(min = 3)
    public float[] getPosition(@Nullable @Size(min = 3) float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetPosition(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    @NonNull
    @Size(min = 16)
    public double[] getProjectionMatrix(@Nullable @Size(min = 16) double[] dArr) {
        double[] dArrAssertMat4d = Asserts.assertMat4d(dArr);
        nGetProjectionMatrix(getNativeObject(), dArrAssertMat4d);
        return dArrAssertMat4d;
    }

    @NonNull
    @Size(min = 4)
    public double[] getScaling(@Nullable @Size(min = 4) double[] dArr) {
        double[] dArrAssertDouble4 = Asserts.assertDouble4(dArr);
        nGetScaling(getNativeObject(), dArrAssertDouble4);
        return dArrAssertDouble4;
    }

    public float getSensitivity() {
        return nGetSensitivity(getNativeObject());
    }

    public float getShutterSpeed() {
        return nGetShutterSpeed(getNativeObject());
    }

    @NonNull
    @Size(min = 3)
    public float[] getUpVector(@Nullable @Size(min = 3) float[] fArr) {
        float[] fArrAssertFloat3 = Asserts.assertFloat3(fArr);
        nGetUpVector(getNativeObject(), fArrAssertFloat3);
        return fArrAssertFloat3;
    }

    @NonNull
    @Size(min = 16)
    public float[] getViewMatrix(@Nullable @Size(min = 16) float[] fArr) {
        float[] fArrAssertMat4f = Asserts.assertMat4f(fArr);
        nGetViewMatrix(getNativeObject(), fArrAssertMat4f);
        return fArrAssertMat4f;
    }

    public void lookAt(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        nLookAt(getNativeObject(), d, d2, d3, d4, d5, d6, d7, d8, d9);
    }

    public void setCustomProjection(@NonNull @Size(min = 16) double[] dArr, double d, double d2) {
        Asserts.assertMat4dIn(dArr);
        nSetCustomProjection(getNativeObject(), dArr, dArr, d, d2);
    }

    public void setExposure(float f, float f2, float f3) {
        nSetExposure(getNativeObject(), f, f2, f3);
    }

    public void setFocusDistance(float f) {
        nSetFocusDistance(getNativeObject(), f);
    }

    public void setLensProjection(double d, double d2, double d3, double d4) {
        nSetLensProjection(getNativeObject(), d, d2, d3, d4);
    }

    public void setModelMatrix(@NonNull @Size(min = 16) float[] fArr) {
        Asserts.assertMat4fIn(fArr);
        nSetModelMatrix(getNativeObject(), fArr);
    }

    public void setProjection(@NonNull Projection projection, double d, double d2, double d3, double d4, double d5, double d6) {
        nSetProjection(getNativeObject(), projection.ordinal(), d, d2, d3, d4, d5, d6);
    }

    public void setScaling(double d, double d2) {
        nSetScaling(getNativeObject(), d, d2);
    }

    public void setShift(double d, double d2) {
        nSetShift(getNativeObject(), d, d2);
    }

    public void setExposure(float f) {
        setExposure(1.0f, 1.2f, (1.0f / f) * 100.0f);
    }

    public void setProjection(double d, double d2, double d3, double d4, @NonNull Fov fov) {
        nSetProjectionFov(getNativeObject(), d, d2, d3, d4, fov.ordinal());
    }

    @Deprecated
    public void setScaling(@NonNull @Size(min = 4) double[] dArr) {
        Asserts.assertDouble4In(dArr);
        setScaling(dArr[0], dArr[1]);
    }

    @NonNull
    @Size(min = 16)
    public double[] getModelMatrix(@Nullable @Size(min = 16) double[] dArr) {
        double[] dArrAssertMat4 = Asserts.assertMat4(dArr);
        nGetModelMatrixFp64(getNativeObject(), dArrAssertMat4);
        return dArrAssertMat4;
    }

    @NonNull
    @Size(min = 16)
    public double[] getViewMatrix(@Nullable @Size(min = 16) double[] dArr) {
        double[] dArrAssertMat4 = Asserts.assertMat4(dArr);
        nGetViewMatrixFp64(getNativeObject(), dArrAssertMat4);
        return dArrAssertMat4;
    }

    public void setCustomProjection(@NonNull @Size(min = 16) double[] dArr, @NonNull @Size(min = 16) double[] dArr2, double d, double d2) {
        Asserts.assertMat4dIn(dArr);
        Asserts.assertMat4dIn(dArr2);
        nSetCustomProjection(getNativeObject(), dArr, dArr2, d, d2);
    }

    public void setModelMatrix(@NonNull @Size(min = 16) double[] dArr) {
        Asserts.assertMat4In(dArr);
        nSetModelMatrixFp64(getNativeObject(), dArr);
    }
}
