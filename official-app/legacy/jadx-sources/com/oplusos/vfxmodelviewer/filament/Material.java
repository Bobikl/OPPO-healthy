package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import com.oplusos.vfxmodelviewer.filament.proguard.UsedByNative;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class Material {
    private final MaterialInstance mDefaultInstance;
    private long mNativeObject;
    private Set<VertexBuffer.VertexAttribute> mRequiredAttributes;

    public enum BlendingMode {
        OPAQUE,
        TRANSPARENT,
        ADD,
        MASKED,
        FADE,
        MULTIPLY,
        SCREEN
    }

    public static class Builder {
        private Buffer mBuffer;
        private int mSize;

        @NonNull
        public Material build(@NonNull Engine engine) {
            long jNBuilderBuild = Material.nBuilderBuild(engine.getNativeObject(), this.mBuffer, this.mSize);
            if (jNBuilderBuild != 0) {
                return new Material(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Material");
        }

        @NonNull
        public Builder payload(@NonNull Buffer buffer, @IntRange(from = 0) int i) {
            this.mBuffer = buffer;
            this.mSize = i;
            return this;
        }
    }

    public enum CullingMode {
        NONE,
        FRONT,
        BACK,
        FRONT_AND_BACK
    }

    public enum Interpolation {
        SMOOTH,
        FLAT
    }

    @UsedByNative("Material.cpp")
    public static class Parameter {

        @UsedByNative("Material.cpp")
        private static final int SAMPLER_OFFSET = Type.MAT4.ordinal() + 1;

        @UsedByNative("Material.cpp")
        private static final int SUBPASS_OFFSET = Type.SAMPLER_3D.ordinal() + 1;

        @IntRange(from = 1)
        public final int count;

        @NonNull
        public final String name;

        @NonNull
        public final Precision precision;

        @NonNull
        public final Type type;

        public enum Precision {
            LOW,
            MEDIUM,
            HIGH,
            DEFAULT
        }

        public enum Type {
            BOOL,
            BOOL2,
            BOOL3,
            BOOL4,
            FLOAT,
            FLOAT2,
            FLOAT3,
            FLOAT4,
            INT,
            INT2,
            INT3,
            INT4,
            UINT,
            UINT2,
            UINT3,
            UINT4,
            MAT3,
            MAT4,
            SAMPLER_2D,
            SAMPLER_2D_ARRAY,
            SAMPLER_CUBEMAP,
            SAMPLER_EXTERNAL,
            SAMPLER_3D,
            SUBPASS_INPUT
        }

        private Parameter(@NonNull String str, @NonNull Type type, @NonNull Precision precision, @IntRange(from = 1) int i) {
            this.name = str;
            this.type = type;
            this.precision = precision;
            this.count = i;
        }

        @UsedByNative("Material.cpp")
        private static void add(@NonNull List<Parameter> list, @NonNull String str, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 1) int i3) {
            list.add(new Parameter(str, Type.values()[i], Precision.values()[i2], i3));
        }
    }

    public enum RefractionMode {
        NONE,
        CUBEMAP,
        SCREEN_SPACE
    }

    public enum RefractionType {
        SOLID,
        THIN
    }

    public enum Shading {
        UNLIT,
        LIT,
        SUBSURFACE,
        CLOTH,
        SPECULAR_GLOSSINESS
    }

    public enum VertexDomain {
        OBJECT,
        WORLD,
        VIEW,
        DEVICE
    }

    public Material(long j2) {
        this.mNativeObject = j2;
        this.mDefaultInstance = new MaterialInstance(this, nGetDefaultInstance(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j2, @NonNull Buffer buffer, int i);

    private static native long nCreateInstance(long j2);

    private static native long nCreateInstanceWithName(long j2, @NonNull String str);

    private static native int nGetBlendingMode(long j2);

    private static native int nGetCullingMode(long j2);

    private static native long nGetDefaultInstance(long j2);

    private static native int nGetInterpolation(long j2);

    private static native float nGetMaskThreshold(long j2);

    private static native String nGetName(long j2);

    private static native int nGetParameterCount(long j2);

    private static native void nGetParameters(long j2, @NonNull List<Parameter> list, @IntRange(from = 1) int i);

    private static native int nGetRefractionMode(long j2);

    private static native int nGetRefractionType(long j2);

    private static native int nGetRequiredAttributes(long j2);

    private static native int nGetShading(long j2);

    private static native float nGetSpecularAntiAliasingThreshold(long j2);

    private static native float nGetSpecularAntiAliasingVariance(long j2);

    private static native int nGetVertexDomain(long j2);

    private static native boolean nHasParameter(long j2, @NonNull String str);

    private static native boolean nIsColorWriteEnabled(long j2);

    private static native boolean nIsDepthCullingEnabled(long j2);

    private static native boolean nIsDepthWriteEnabled(long j2);

    private static native boolean nIsDoubleSided(long j2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @NonNull
    public MaterialInstance createInstance() {
        long jNCreateInstance = nCreateInstance(getNativeObject());
        if (jNCreateInstance != 0) {
            return new MaterialInstance(this, jNCreateInstance);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }

    public BlendingMode getBlendingMode() {
        return BlendingMode.values()[nGetBlendingMode(getNativeObject())];
    }

    public CullingMode getCullingMode() {
        return CullingMode.values()[nGetCullingMode(getNativeObject())];
    }

    @NonNull
    public MaterialInstance getDefaultInstance() {
        return this.mDefaultInstance;
    }

    public Interpolation getInterpolation() {
        return Interpolation.values()[nGetInterpolation(getNativeObject())];
    }

    public float getMaskThreshold() {
        return nGetMaskThreshold(getNativeObject());
    }

    public String getName() {
        return nGetName(getNativeObject());
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed Material");
    }

    public int getParameterCount() {
        return nGetParameterCount(getNativeObject());
    }

    public List<Parameter> getParameters() {
        int parameterCount = getParameterCount();
        ArrayList arrayList = new ArrayList(parameterCount);
        if (parameterCount > 0) {
            nGetParameters(getNativeObject(), arrayList, parameterCount);
        }
        return arrayList;
    }

    public RefractionMode getRefractionMode() {
        return RefractionMode.values()[nGetRefractionMode(getNativeObject())];
    }

    public RefractionType getRefractionType() {
        return RefractionType.values()[nGetRefractionType(getNativeObject())];
    }

    public Set<VertexBuffer.VertexAttribute> getRequiredAttributes() {
        if (this.mRequiredAttributes == null) {
            int iNGetRequiredAttributes = nGetRequiredAttributes(getNativeObject());
            this.mRequiredAttributes = EnumSet.noneOf(VertexBuffer.VertexAttribute.class);
            VertexBuffer.VertexAttribute[] vertexAttributeArrValues = VertexBuffer.VertexAttribute.values();
            for (int i = 0; i < vertexAttributeArrValues.length; i++) {
                if (((1 << i) & iNGetRequiredAttributes) != 0) {
                    this.mRequiredAttributes.add(vertexAttributeArrValues[i]);
                }
            }
            this.mRequiredAttributes = Collections.unmodifiableSet(this.mRequiredAttributes);
        }
        return this.mRequiredAttributes;
    }

    public int getRequiredAttributesAsInt() {
        return nGetRequiredAttributes(getNativeObject());
    }

    public Shading getShading() {
        return Shading.values()[nGetShading(getNativeObject())];
    }

    public float getSpecularAntiAliasingThreshold() {
        return nGetSpecularAntiAliasingThreshold(getNativeObject());
    }

    public float getSpecularAntiAliasingVariance() {
        return nGetSpecularAntiAliasingVariance(getNativeObject());
    }

    public VertexDomain getVertexDomain() {
        return VertexDomain.values()[nGetVertexDomain(getNativeObject())];
    }

    public boolean hasParameter(@NonNull String str) {
        return nHasParameter(getNativeObject(), str);
    }

    public boolean isColorWriteEnabled() {
        return nIsColorWriteEnabled(getNativeObject());
    }

    public boolean isDepthCullingEnabled() {
        return nIsDepthCullingEnabled(getNativeObject());
    }

    public boolean isDepthWriteEnabled() {
        return nIsDepthWriteEnabled(getNativeObject());
    }

    public boolean isDoubleSided() {
        return nIsDoubleSided(getNativeObject());
    }

    public void setDefaultParameter(@NonNull String str, boolean z) {
        this.mDefaultInstance.setParameter(str, z);
    }

    public void setDefaultParameter(@NonNull String str, float f) {
        this.mDefaultInstance.setParameter(str, f);
    }

    public void setDefaultParameter(@NonNull String str, int i) {
        this.mDefaultInstance.setParameter(str, i);
    }

    @NonNull
    public MaterialInstance createInstance(@NonNull String str) {
        long jNCreateInstanceWithName = nCreateInstanceWithName(getNativeObject(), str);
        if (jNCreateInstanceWithName != 0) {
            return new MaterialInstance(this, jNCreateInstanceWithName);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }

    public void setDefaultParameter(@NonNull String str, boolean z, boolean z2) {
        this.mDefaultInstance.setParameter(str, z, z2);
    }

    public void setDefaultParameter(@NonNull String str, float f, float f2) {
        this.mDefaultInstance.setParameter(str, f, f2);
    }

    public void setDefaultParameter(@NonNull String str, int i, int i2) {
        this.mDefaultInstance.setParameter(str, i, i2);
    }

    public void setDefaultParameter(@NonNull String str, boolean z, boolean z2, boolean z3) {
        this.mDefaultInstance.setParameter(str, z, z2, z3);
    }

    public void setDefaultParameter(@NonNull String str, float f, float f2, float f3) {
        this.mDefaultInstance.setParameter(str, f, f2, f3);
    }

    public void setDefaultParameter(@NonNull String str, int i, int i2, int i3) {
        this.mDefaultInstance.setParameter(str, i, i2, i3);
    }

    public void setDefaultParameter(@NonNull String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.mDefaultInstance.setParameter(str, z, z2, z3, z4);
    }

    public void setDefaultParameter(@NonNull String str, float f, float f2, float f3, float f4) {
        this.mDefaultInstance.setParameter(str, f, f2, f3, f4);
    }

    public void setDefaultParameter(@NonNull String str, int i, int i2, int i3, int i4) {
        this.mDefaultInstance.setParameter(str, i, i2, i3, i4);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull MaterialInstance.BooleanElement booleanElement, @NonNull @Size(min = 1) boolean[] zArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        this.mDefaultInstance.setParameter(str, booleanElement, zArr, i, i2);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull MaterialInstance.IntElement intElement, @NonNull @Size(min = 1) int[] iArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        this.mDefaultInstance.setParameter(str, intElement, iArr, i, i2);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull MaterialInstance.FloatElement floatElement, @NonNull @Size(min = 1) float[] fArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        this.mDefaultInstance.setParameter(str, floatElement, fArr, i, i2);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull Colors.RgbType rgbType, float f, float f2, float f3) {
        this.mDefaultInstance.setParameter(str, rgbType, f, f2, f3);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull Colors.RgbaType rgbaType, float f, float f2, float f3, float f4) {
        this.mDefaultInstance.setParameter(str, rgbaType, f, f2, f3, f4);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull Texture texture, @NonNull TextureSampler textureSampler) {
        this.mDefaultInstance.setParameter(str, texture, textureSampler);
    }
}
