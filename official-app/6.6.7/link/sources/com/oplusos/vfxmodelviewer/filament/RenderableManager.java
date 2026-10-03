package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class RenderableManager {
    private static final String LOG_TAG = "Filament";
    private long mNativeObject;

    public enum PrimitiveType {
        POINTS(0),
        LINES(1),
        TRIANGLES(4);

        private final int mType;

        PrimitiveType(int i) {
            this.mType = i;
        }

        public int getValue() {
            return this.mType;
        }
    }

    public RenderableManager(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBlendOrder(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoundingBox(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCulling(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3, int i3, int i4, int i5, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayerMask(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLightChannel(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMaterial(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMorphing(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPriority(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReceiveShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderScreenSpaceContactShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinning(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nBuilderSkinningBones(long j, int i, Buffer buffer, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinningBuffer(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i);

    private static native void nDestroy(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nEnableSkinningBuffers(long j, boolean z);

    private static native void nGetAxisAlignedBoundingBox(long j, int i, float[] fArr, float[] fArr2);

    private static native int nGetEnabledAttributesAt(long j, int i, int i2);

    private static native int nGetInstance(long j, int i);

    private static native boolean nGetLightChannel(long j, int i, int i2);

    private static native long nGetMaterialInstanceAt(long j, int i, int i2);

    private static native int nGetPrimitiveCount(long j, int i);

    private static native boolean nHasComponent(long j, int i);

    private static native boolean nIsShadowCaster(long j, int i);

    private static native boolean nIsShadowReceiver(long j, int i);

    private static native void nSetAxisAlignedBoundingBox(long j, int i, float f, float f2, float f3, float f4, float f5, float f6);

    private static native void nSetBlendOrderAt(long j, int i, int i2, int i3);

    private static native int nSetBonesAsMatrices(long j, int i, Buffer buffer, int i2, int i3, int i4);

    private static native int nSetBonesAsQuaternions(long j, int i, Buffer buffer, int i2, int i3, int i4);

    private static native void nSetCastShadows(long j, int i, boolean z);

    private static native void nSetCulling(long j, int i, boolean z);

    private static native void nSetGeometryAt(long j, int i, int i2, int i3, int i4, int i5);

    private static native void nSetGeometryAt(long j, int i, int i2, int i3, long j2, long j3, int i4, int i5);

    private static native void nSetLayerMask(long j, int i, int i2, int i3);

    private static native void nSetLightChannel(long j, int i, int i2, boolean z);

    private static native void nSetMaterialInstanceAt(long j, int i, int i2, long j2);

    private static native void nSetMorphWeights(long j, int i, float[] fArr);

    private static native void nSetPriority(long j, int i, int i2);

    private static native void nSetReceiveShadows(long j, int i, boolean z);

    private static native void nSetScreenSpaceContactShadows(long j, int i, boolean z);

    private static native void nSetSkinningBuffer(long j, int i, long j2, int i2, int i3);

    public void destroy(@Entity int i) {
        nDestroy(this.mNativeObject, i);
    }

    @NonNull
    public Box getAxisAlignedBoundingBox(@EntityInstance int i, @Nullable Box box) {
        if (box == null) {
            box = new Box();
        }
        nGetAxisAlignedBoundingBox(this.mNativeObject, i, box.getCenter(), box.getHalfExtent());
        return box;
    }

    public Set<VertexBuffer.VertexAttribute> getEnabledAttributesAt(@EntityInstance int i, @IntRange(from = 0) int i2) {
        int iNGetEnabledAttributesAt = nGetEnabledAttributesAt(this.mNativeObject, i, i2);
        EnumSet enumSetNoneOf = EnumSet.noneOf(VertexBuffer.VertexAttribute.class);
        VertexBuffer.VertexAttribute[] vertexAttributeArrValues = VertexBuffer.VertexAttribute.values();
        for (int i3 = 0; i3 < vertexAttributeArrValues.length; i3++) {
            if (((1 << i3) & iNGetEnabledAttributesAt) != 0) {
                enumSetNoneOf.add(vertexAttributeArrValues[i3]);
            }
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    @EntityInstance
    public int getInstance(@Entity int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public boolean getLightChannel(@EntityInstance int i, @IntRange(from = 0, to = 7) int i2) {
        return nGetLightChannel(this.mNativeObject, i, i2);
    }

    @NonNull
    public MaterialInstance getMaterialInstanceAt(@EntityInstance int i, @IntRange(from = 0) int i2) {
        return new MaterialInstance(nGetMaterialInstanceAt(this.mNativeObject, i, i2));
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @IntRange(from = 0)
    public int getPrimitiveCount(@EntityInstance int i) {
        return nGetPrimitiveCount(this.mNativeObject, i);
    }

    public boolean hasComponent(@Entity int i) {
        return nHasComponent(this.mNativeObject, i);
    }

    public boolean isShadowCaster(@EntityInstance int i) {
        return nIsShadowCaster(this.mNativeObject, i);
    }

    public boolean isShadowReceiver(@EntityInstance int i) {
        return nIsShadowReceiver(this.mNativeObject, i);
    }

    public void setAxisAlignedBoundingBox(@EntityInstance int i, @NonNull Box box) {
        nSetAxisAlignedBoundingBox(this.mNativeObject, i, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
    }

    public void setBlendOrderAt(@EntityInstance int i, @IntRange(from = 0) int i2, @IntRange(from = 0, to = 65535) int i3) {
        nSetBlendOrderAt(this.mNativeObject, i, i2, i3);
    }

    public void setBonesAsMatrices(@EntityInstance int i, @NonNull Buffer buffer, @IntRange(from = 0, to = 255) int i2, @IntRange(from = 0) int i3) {
        if (nSetBonesAsMatrices(this.mNativeObject, i, buffer, buffer.remaining(), i2, i3) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setBonesAsQuaternions(@EntityInstance int i, @NonNull Buffer buffer, @IntRange(from = 0, to = 255) int i2, @IntRange(from = 0) int i3) {
        if (nSetBonesAsQuaternions(this.mNativeObject, i, buffer, buffer.remaining(), i2, i3) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setCastShadows(@EntityInstance int i, boolean z) {
        nSetCastShadows(this.mNativeObject, i, z);
    }

    public void setCulling(@EntityInstance int i, boolean z) {
        nSetCulling(this.mNativeObject, i, z);
    }

    public void setGeometryAt(@EntityInstance int i, @IntRange(from = 0) int i2, @NonNull PrimitiveType primitiveType, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4) {
        nSetGeometryAt(this.mNativeObject, i, i2, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i3, i4);
    }

    public void setLayerMask(@EntityInstance int i, @IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3) {
        nSetLayerMask(this.mNativeObject, i, i2, i3);
    }

    public void setLightChannel(@EntityInstance int i, @IntRange(from = 0, to = 7) int i2, boolean z) {
        nSetLightChannel(this.mNativeObject, i, i2, z);
    }

    public void setMaterialInstanceAt(@EntityInstance int i, @IntRange(from = 0) int i2, @NonNull MaterialInstance materialInstance) {
        int requiredAttributesAsInt = materialInstance.getMaterial().getRequiredAttributesAsInt();
        if ((nGetEnabledAttributesAt(this.mNativeObject, i, i2) & requiredAttributesAsInt) != requiredAttributesAsInt) {
            Platform.get().warn("setMaterialInstanceAt() on primitive " + i2 + " of Renderable at " + i + ": declared attributes " + getEnabledAttributesAt(i, i2) + " do no satisfy required attributes " + materialInstance.getMaterial().getRequiredAttributes());
        }
        nSetMaterialInstanceAt(this.mNativeObject, i, i2, materialInstance.getNativeObject());
    }

    public void setMorphWeights(@EntityInstance int i, @NonNull @Size(min = SwapChain.CONFIG_ENABLE_XCB) float[] fArr) {
        nSetMorphWeights(this.mNativeObject, i, fArr);
    }

    public void setPriority(@EntityInstance int i, @IntRange(from = 0, to = 7) int i2) {
        nSetPriority(this.mNativeObject, i, i2);
    }

    public void setReceiveShadows(@EntityInstance int i, boolean z) {
        nSetReceiveShadows(this.mNativeObject, i, z);
    }

    public void setScreenSpaceContactShadows(@EntityInstance int i, boolean z) {
        nSetScreenSpaceContactShadows(this.mNativeObject, i, z);
    }

    public void setSkinningBuffer(@EntityInstance int i, @NonNull SkinningBuffer skinningBuffer, int i2, int i3) {
        nSetSkinningBuffer(this.mNativeObject, i, skinningBuffer.getNativeObject(), i2, i3);
    }

    public void setGeometryAt(@EntityInstance int i, @IntRange(from = 0) int i2, @NonNull PrimitiveType primitiveType, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer) {
        nSetGeometryAt(this.mNativeObject, i, i2, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), 0, indexBuffer.getIndexCount());
    }

    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                RenderableManager.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder(@IntRange(from = 1) int i) {
            long jNCreateBuilder = RenderableManager.nCreateBuilder(i);
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        @NonNull
        public Builder blendOrder(@IntRange(from = 0) int i, @IntRange(from = 0, to = 32767) int i2) {
            RenderableManager.nBuilderBlendOrder(this.mNativeBuilder, i, i2);
            return this;
        }

        @NonNull
        public Builder boundingBox(@NonNull Box box) {
            RenderableManager.nBuilderBoundingBox(this.mNativeBuilder, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
            return this;
        }

        public void build(@NonNull Engine engine, @Entity int i) {
            if (RenderableManager.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), i)) {
                return;
            }
            throw new IllegalStateException("Couldn't create Renderable component for entity " + i + ", see log.");
        }

        @NonNull
        public Builder castShadows(boolean z) {
            RenderableManager.nBuilderCastShadows(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder culling(boolean z) {
            RenderableManager.nBuilderCulling(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder enableSkinningBuffers(boolean z) {
            RenderableManager.nEnableSkinningBuffers(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder geometry(@IntRange(from = 0) int i, @NonNull PrimitiveType primitiveType, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i2, i3, i4, i5);
            return this;
        }

        @NonNull
        public Builder layerMask(@IntRange(from = 0, to = 255) int i, @IntRange(from = 0, to = 255) int i2) {
            RenderableManager.nBuilderLayerMask(this.mNativeBuilder, i & 255, i2 & 255);
            return this;
        }

        @NonNull
        public Builder lightChannel(@IntRange(from = 0, to = 7) int i, boolean z) {
            RenderableManager.nBuilderLightChannel(this.mNativeBuilder, i, z);
            return this;
        }

        @NonNull
        public Builder material(@IntRange(from = 0) int i, @NonNull MaterialInstance materialInstance) {
            RenderableManager.nBuilderMaterial(this.mNativeBuilder, i, materialInstance.getNativeObject());
            return this;
        }

        @NonNull
        public Builder morphing(boolean z) {
            RenderableManager.nBuilderMorphing(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder priority(@IntRange(from = 0, to = 7) int i) {
            RenderableManager.nBuilderPriority(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder receiveShadows(boolean z) {
            RenderableManager.nBuilderReceiveShadows(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder screenSpaceContactShadows(boolean z) {
            RenderableManager.nBuilderScreenSpaceContactShadows(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder skinning(SkinningBuffer skinningBuffer, @IntRange(from = 0, to = 255) int i, int i2) {
            RenderableManager.nBuilderSkinningBuffer(this.mNativeBuilder, skinningBuffer != null ? skinningBuffer.getNativeObject() : 0L, i, i2);
            return this;
        }

        @NonNull
        public Builder geometry(@IntRange(from = 0) int i, @NonNull PrimitiveType primitiveType, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i2, i3);
            return this;
        }

        @NonNull
        public Builder skinning(@IntRange(from = 0, to = 255) int i) {
            RenderableManager.nBuilderSkinning(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder skinning(@IntRange(from = 0, to = 255) int i, @NonNull Buffer buffer) {
            if (RenderableManager.nBuilderSkinningBones(this.mNativeBuilder, i, buffer, buffer.remaining()) >= 0) {
                return this;
            }
            throw new BufferOverflowException();
        }

        @NonNull
        public Builder geometry(@IntRange(from = 0) int i, @NonNull PrimitiveType primitiveType, @NonNull VertexBuffer vertexBuffer, @NonNull IndexBuffer indexBuffer) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject());
            return this;
        }
    }

    public void setGeometryAt(@EntityInstance int i, @IntRange(from = 0) int i2, @NonNull PrimitiveType primitiveType, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4) {
        nSetGeometryAt(this.mNativeObject, i, i2, primitiveType.getValue(), i3, i4);
    }
}
