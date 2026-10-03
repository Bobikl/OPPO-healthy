package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes9.dex */
public class Renderer {
    public static final int MIRROR_FRAME_FLAG_CLEAR = 4;
    public static final int MIRROR_FRAME_FLAG_COMMIT = 1;
    public static final int MIRROR_FRAME_FLAG_SET_PRESENTATION_TIME = 2;
    private ClearOptions mClearOptions;
    private DisplayInfo mDisplayInfo;
    private final Engine mEngine;
    private FrameRateOptions mFrameRateOptions;
    private long mNativeObject;

    public static class ClearOptions {

        @NonNull
        public float[] clearColor = {0.0f, 0.0f, 0.0f, 0.0f};
        public boolean clear = false;
        public boolean discard = true;
    }

    public static class DisplayInfo {
        public float refreshRate = 60.0f;
        public long presentationDeadlineNanos = 0;
        public long vsyncOffsetNanos = 0;
    }

    public static class FrameRateOptions {
        public float interval = 0.016666668f;
        public float headRoomRatio = 0.0f;
        public float scaleRate = 0.06666667f;
        public int history = 15;
    }

    public Renderer(@NonNull Engine engine, long j2) {
        this.mEngine = engine;
        this.mNativeObject = j2;
    }

    private static native boolean nBeginFrame(long j2, long j3, long j4);

    private static native void nCopyFrame(long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    private static native void nEndFrame(long j2);

    private static native double nGetUserTime(long j2);

    private static native int nReadPixels(long j2, long j3, int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, Runnable runnable);

    private static native int nReadPixelsEx(long j2, long j3, long j4, int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, Runnable runnable);

    private static native void nRender(long j2, long j3);

    private static native void nRenderStandaloneView(long j2, long j3);

    private static native void nResetUserTime(long j2);

    private static native void nSetClearOptions(long j2, float f, float f2, float f3, float f4, boolean z, boolean z2);

    private static native void nSetDisplayInfo(long j2, float f, long j3, long j4);

    private static native void nSetFrameRateOptions(long j2, float f, float f2, float f3, int i);

    private static native void nSetResolutionScale(long j2, float f);

    public boolean beginFrame(@NonNull SwapChain swapChain, long j2) {
        return nBeginFrame(getNativeObject(), swapChain.getNativeObject(), j2);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void copyFrame(@NonNull SwapChain swapChain, @NonNull Viewport viewport, @NonNull Viewport viewport2, int i) {
        nCopyFrame(getNativeObject(), swapChain.getNativeObject(), viewport.left, viewport.bottom, viewport.width, viewport.height, viewport2.left, viewport2.bottom, viewport2.width, viewport2.height, i);
    }

    public void endFrame() {
        nEndFrame(getNativeObject());
    }

    @NonNull
    public ClearOptions getClearOptions() {
        if (this.mClearOptions == null) {
            this.mClearOptions = new ClearOptions();
        }
        return this.mClearOptions;
    }

    @NonNull
    public DisplayInfo getDisplayInfo() {
        if (this.mDisplayInfo == null) {
            this.mDisplayInfo = new DisplayInfo();
        }
        return this.mDisplayInfo;
    }

    @NonNull
    public Engine getEngine() {
        return this.mEngine;
    }

    @NonNull
    public FrameRateOptions getFrameRateOptions() {
        if (this.mFrameRateOptions == null) {
            this.mFrameRateOptions = new FrameRateOptions();
        }
        return this.mFrameRateOptions;
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed Renderer");
    }

    public double getUserTime() {
        return nGetUserTime(getNativeObject());
    }

    @Deprecated
    public void mirrorFrame(@NonNull SwapChain swapChain, @NonNull Viewport viewport, @NonNull Viewport viewport2, int i) {
        copyFrame(swapChain, viewport, viewport2, i);
    }

    public void readPixels(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @NonNull Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        if (pixelBufferDescriptor.storage.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        long nativeObject = getNativeObject();
        long nativeObject2 = this.mEngine.getNativeObject();
        Buffer buffer = pixelBufferDescriptor.storage;
        if (nReadPixels(nativeObject, nativeObject2, i, i2, i3, i4, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void render(@NonNull View view) {
        nRender(getNativeObject(), view.getNativeObject());
    }

    public void renderStandaloneView(@NonNull View view) {
        nRenderStandaloneView(getNativeObject(), view.getNativeObject());
    }

    public void resetUserTime() {
        nResetUserTime(getNativeObject());
    }

    public void setClearOptions(@NonNull ClearOptions clearOptions) {
        this.mClearOptions = clearOptions;
        long nativeObject = getNativeObject();
        float[] fArr = clearOptions.clearColor;
        nSetClearOptions(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], clearOptions.clear, clearOptions.discard);
    }

    public void setDisplayInfo(@NonNull DisplayInfo displayInfo) {
        this.mDisplayInfo = displayInfo;
        nSetDisplayInfo(getNativeObject(), displayInfo.refreshRate, displayInfo.presentationDeadlineNanos, displayInfo.vsyncOffsetNanos);
    }

    public void setFrameRateOptions(@NonNull FrameRateOptions frameRateOptions) {
        this.mFrameRateOptions = frameRateOptions;
        nSetFrameRateOptions(getNativeObject(), frameRateOptions.interval, frameRateOptions.headRoomRatio, frameRateOptions.scaleRate, frameRateOptions.history);
    }

    public void setResolutionScale(float f) {
        nSetResolutionScale(getNativeObject(), f);
    }

    public void readPixels(@NonNull RenderTarget renderTarget, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @NonNull Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        if (!pixelBufferDescriptor.storage.isReadOnly()) {
            long nativeObject = getNativeObject();
            long nativeObject2 = this.mEngine.getNativeObject();
            long nativeObject3 = renderTarget.getNativeObject();
            Buffer buffer = pixelBufferDescriptor.storage;
            if (nReadPixelsEx(nativeObject, nativeObject2, nativeObject3, i, i2, i3, i4, buffer, buffer.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, pixelBufferDescriptor.type.ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback) < 0) {
                throw new BufferOverflowException();
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }
}
