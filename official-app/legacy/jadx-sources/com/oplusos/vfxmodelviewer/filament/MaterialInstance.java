package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Size;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialInstance {
    private Material mMaterial;
    private String mName;
    private long mNativeMaterial;
    private long mNativeObject;

    public enum BooleanElement {
        BOOL,
        BOOL2,
        BOOL3,
        BOOL4
    }

    public enum FloatElement {
        FLOAT,
        FLOAT2,
        FLOAT3,
        FLOAT4,
        MAT3,
        MAT4
    }

    public enum IntElement {
        INT,
        INT2,
        INT3,
        INT4
    }

    public MaterialInstance(Engine engine, long j2) {
        this.mNativeObject = j2;
        this.mNativeMaterial = nGetMaterial(j2);
    }

    @NonNull
    public static MaterialInstance duplicate(@NonNull MaterialInstance materialInstance, String str) {
        long jNDuplicate = nDuplicate(materialInstance.mNativeObject, str);
        if (jNDuplicate != 0) {
            return new MaterialInstance(materialInstance.getMaterial(), jNDuplicate);
        }
        throw new IllegalStateException("Couldn't duplicate MaterialInstance");
    }

    private static native long nDuplicate(long j2, String str);

    private static native long nGetMaterial(long j2);

    private static native String nGetName(long j2);

    private static native void nSetBooleanParameterArray(long j2, @NonNull String str, int i, @NonNull @Size(min = 1) boolean[] zArr, @IntRange(from = 0) int i2, @IntRange(from = 1) int i3);

    private static native void nSetColorWrite(long j2, boolean z);

    private static native void nSetCullingMode(long j2, long j3);

    private static native void nSetDepthCulling(long j2, boolean z);

    private static native void nSetDepthWrite(long j2, boolean z);

    private static native void nSetDoubleSided(long j2, boolean z);

    private static native void nSetFloatParameterArray(long j2, @NonNull String str, int i, @NonNull @Size(min = 1) float[] fArr, @IntRange(from = 0) int i2, @IntRange(from = 1) int i3);

    private static native void nSetIntParameterArray(long j2, @NonNull String str, int i, @NonNull @Size(min = 1) int[] iArr, @IntRange(from = 0) int i2, @IntRange(from = 1) int i3);

    private static native void nSetMaskThreshold(long j2, float f);

    private static native void nSetParameterBool(long j2, @NonNull String str, boolean z);

    private static native void nSetParameterBool2(long j2, @NonNull String str, boolean z, boolean z2);

    private static native void nSetParameterBool3(long j2, @NonNull String str, boolean z, boolean z2, boolean z3);

    private static native void nSetParameterBool4(long j2, @NonNull String str, boolean z, boolean z2, boolean z3, boolean z4);

    private static native void nSetParameterFloat(long j2, @NonNull String str, float f);

    private static native void nSetParameterFloat2(long j2, @NonNull String str, float f, float f2);

    private static native void nSetParameterFloat3(long j2, @NonNull String str, float f, float f2, float f3);

    private static native void nSetParameterFloat4(long j2, @NonNull String str, float f, float f2, float f3, float f4);

    private static native void nSetParameterInt(long j2, @NonNull String str, int i);

    private static native void nSetParameterInt2(long j2, @NonNull String str, int i, int i2);

    private static native void nSetParameterInt3(long j2, @NonNull String str, int i, int i2, int i3);

    private static native void nSetParameterInt4(long j2, @NonNull String str, int i, int i2, int i3, int i4);

    private static native void nSetParameterTexture(long j2, @NonNull String str, long j3, int i);

    private static native void nSetPolygonOffset(long j2, float f, float f2);

    private static native void nSetScissor(long j2, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4);

    private static native void nSetSpecularAntiAliasingThreshold(long j2, float f);

    private static native void nSetSpecularAntiAliasingVariance(long j2, float f);

    private static native void nUnsetScissor(long j2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @NonNull
    public Material getMaterial() {
        if (this.mMaterial == null) {
            this.mMaterial = new Material(this.mNativeMaterial);
        }
        return this.mMaterial;
    }

    @NonNull
    public String getName() {
        if (this.mName == null) {
            this.mName = nGetName(getNativeObject());
        }
        return this.mName;
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed MaterialInstance");
    }

    public void setColorWrite(boolean z) {
        nSetColorWrite(getNativeObject(), z);
    }

    public void setCullingMode(Material.CullingMode cullingMode) {
        nSetCullingMode(getNativeObject(), cullingMode.ordinal());
    }

    public void setDepthCulling(boolean z) {
        nSetDepthCulling(getNativeObject(), z);
    }

    public void setDepthWrite(boolean z) {
        nSetDepthWrite(getNativeObject(), z);
    }

    public void setDoubleSided(boolean z) {
        nSetDoubleSided(getNativeObject(), z);
    }

    public void setMaskThreshold(float f) {
        nSetMaskThreshold(getNativeObject(), f);
    }

    public void setParameter(@NonNull String str, boolean z) {
        nSetParameterBool(getNativeObject(), str, z);
    }

    public void setPolygonOffset(float f, float f2) {
        nSetPolygonOffset(getNativeObject(), f, f2);
    }

    public void setScissor(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4) {
        nSetScissor(getNativeObject(), i, i2, i3, i4);
    }

    public void setSpecularAntiAliasingThreshold(float f) {
        nSetSpecularAntiAliasingThreshold(getNativeObject(), f);
    }

    public void setSpecularAntiAliasingVariance(float f) {
        nSetSpecularAntiAliasingVariance(getNativeObject(), f);
    }

    public void unsetScissor() {
        nUnsetScissor(getNativeObject());
    }

    public void setParameter(@NonNull String str, float f) {
        nSetParameterFloat(getNativeObject(), str, f);
    }

    public void setParameter(@NonNull String str, int i) {
        nSetParameterInt(getNativeObject(), str, i);
    }

    public MaterialInstance(@NonNull Material material, long j2) {
        this.mMaterial = material;
        this.mNativeMaterial = material.getNativeObject();
        this.mNativeObject = j2;
    }

    public void setParameter(@NonNull String str, boolean z, boolean z2) {
        nSetParameterBool2(getNativeObject(), str, z, z2);
    }

    public void setParameter(@NonNull String str, float f, float f2) {
        nSetParameterFloat2(getNativeObject(), str, f, f2);
    }

    public void setParameter(@NonNull String str, int i, int i2) {
        nSetParameterInt2(getNativeObject(), str, i, i2);
    }

    public void setParameter(@NonNull String str, boolean z, boolean z2, boolean z3) {
        nSetParameterBool3(getNativeObject(), str, z, z2, z3);
    }

    public MaterialInstance(long j2) {
        this.mNativeObject = j2;
        this.mNativeMaterial = nGetMaterial(j2);
    }

    public void setParameter(@NonNull String str, float f, float f2, float f3) {
        nSetParameterFloat3(getNativeObject(), str, f, f2, f3);
    }

    public void setParameter(@NonNull String str, int i, int i2, int i3) {
        nSetParameterInt3(getNativeObject(), str, i, i2, i3);
    }

    public void setParameter(@NonNull String str, boolean z, boolean z2, boolean z3, boolean z4) {
        nSetParameterBool4(getNativeObject(), str, z, z2, z3, z4);
    }

    public void setParameter(@NonNull String str, float f, float f2, float f3, float f4) {
        nSetParameterFloat4(getNativeObject(), str, f, f2, f3, f4);
    }

    public void setParameter(@NonNull String str, int i, int i2, int i3, int i4) {
        nSetParameterInt4(getNativeObject(), str, i, i2, i3, i4);
    }

    public void setParameter(@NonNull String str, @NonNull Texture texture, @NonNull TextureSampler textureSampler) {
        nSetParameterTexture(getNativeObject(), str, texture.getNativeObject(), textureSampler.mSampler);
    }

    public void setParameter(@NonNull String str, @NonNull BooleanElement booleanElement, @NonNull boolean[] zArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        nSetBooleanParameterArray(getNativeObject(), str, booleanElement.ordinal(), zArr, i, i2);
    }

    public void setParameter(@NonNull String str, @NonNull IntElement intElement, @NonNull int[] iArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        nSetIntParameterArray(getNativeObject(), str, intElement.ordinal(), iArr, i, i2);
    }

    public void setParameter(@NonNull String str, @NonNull FloatElement floatElement, @NonNull float[] fArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        nSetFloatParameterArray(getNativeObject(), str, floatElement.ordinal(), fArr, i, i2);
    }

    public void setParameter(@NonNull String str, @NonNull Colors.RgbType rgbType, float f, float f2, float f3) {
        float[] linear = Colors.toLinear(rgbType, f, f2, f3);
        nSetParameterFloat3(getNativeObject(), str, linear[0], linear[1], linear[2]);
    }

    public void setParameter(@NonNull String str, @NonNull Colors.RgbaType rgbaType, float f, float f2, float f3, float f4) {
        float[] linear = Colors.toLinear(rgbaType, f, f2, f3, f4);
        nSetParameterFloat4(getNativeObject(), str, linear[0], linear[1], linear[2], linear[3]);
    }
}
