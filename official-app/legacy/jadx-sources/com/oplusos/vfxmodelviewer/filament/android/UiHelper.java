package com.oplusos.vfxmodelviewer.filament.android;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class UiHelper {
    private static final boolean LOGGING = false;
    private static final String LOG_TAG = "UiHelper";
    private int mDesiredHeight;
    private int mDesiredWidth;
    private boolean mHasSwapChain;
    private Object mNativeWindow;
    private boolean mOpaque;
    private boolean mOverlay;
    private RendererCallback mRenderCallback;
    private RenderSurface mRenderSurface;

    public enum ContextErrorPolicy {
        CHECK,
        DONT_CHECK
    }

    public interface RenderSurface {
        void detach();

        void resize(int i, int i2);
    }

    public interface RendererCallback {
        void onDetachedFromSurface();

        void onNativeWindowChanged(Surface surface);

        void onResized(int i, int i2);

        void onUpdated();
    }

    public static class SurfaceHolderHandler implements RenderSurface {
        private SurfaceHolder.Callback mCallBack;
        private SurfaceHolder mSurfaceHolder;

        public SurfaceHolderHandler(SurfaceHolder surfaceHolder) {
            this.mSurfaceHolder = surfaceHolder;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RenderSurface
        public void detach() {
            this.mSurfaceHolder.removeCallback(this.mCallBack);
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RenderSurface
        public void resize(int i, int i2) {
            this.mSurfaceHolder.setFixedSize(i, i2);
        }

        public void setCallBack(SurfaceHolder.Callback callback) {
            this.mCallBack = callback;
            this.mSurfaceHolder.addCallback(callback);
        }
    }

    public static class SurfaceViewHandler implements RenderSurface {
        private SurfaceHolder.Callback mCallBack;
        private SurfaceView mSurfaceView;

        public SurfaceViewHandler(SurfaceView surfaceView) {
            this.mSurfaceView = surfaceView;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RenderSurface
        public void detach() {
            this.mSurfaceView.getHolder().removeCallback(this.mCallBack);
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RenderSurface
        public void resize(int i, int i2) {
            this.mSurfaceView.getHolder().setFixedSize(i, i2);
        }

        public void setCallBack(SurfaceHolder.Callback callback) {
            this.mCallBack = callback;
            this.mSurfaceView.getHolder().addCallback(callback);
        }
    }

    public class TextureViewHandler implements RenderSurface {
        private TextureView.SurfaceTextureListener mCallBack;
        private Surface mSurface;
        private TextureView mTextureView;

        public TextureViewHandler(TextureView textureView) {
            this.mTextureView = textureView;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RenderSurface
        public void detach() {
            this.mTextureView.setSurfaceTextureListener(null);
            setSurface(null);
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RenderSurface
        public void resize(int i, int i2) {
            this.mTextureView.getSurfaceTexture().setDefaultBufferSize(i, i2);
            UiHelper.this.mRenderCallback.onResized(i, i2);
        }

        public void setCallBack(TextureView.SurfaceTextureListener surfaceTextureListener) {
            this.mCallBack = surfaceTextureListener;
            this.mTextureView.setSurfaceTextureListener(surfaceTextureListener);
        }

        public void setSurface(Surface surface) {
            Surface surface2;
            if (surface == null && (surface2 = this.mSurface) != null) {
                surface2.release();
            }
            this.mSurface = surface;
        }
    }

    public UiHelper() {
        this(ContextErrorPolicy.CHECK);
    }

    private boolean attach(@NonNull Object obj) {
        Object obj2 = this.mNativeWindow;
        if (obj2 != null) {
            if (obj2 == obj) {
                return false;
            }
            detach();
        }
        this.mNativeWindow = obj;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSwapChain(@NonNull Surface surface) {
        this.mRenderCallback.onNativeWindowChanged(surface);
        this.mHasSwapChain = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroySwapChain() {
        this.mRenderCallback.onDetachedFromSurface();
        this.mHasSwapChain = false;
    }

    public void attachTo(@NonNull SurfaceView surfaceView) {
        int i;
        if (attach(surfaceView)) {
            boolean z = !isOpaque();
            if (isMediaOverlay()) {
                surfaceView.setZOrderMediaOverlay(z);
            } else {
                surfaceView.setZOrderOnTop(z);
            }
            int i2 = isOpaque() ? -1 : -3;
            surfaceView.getHolder().setFormat(i2);
            SurfaceViewHandler surfaceViewHandler = new SurfaceViewHandler(surfaceView);
            this.mRenderSurface = surfaceViewHandler;
            SurfaceHolder.Callback callback = new SurfaceHolder.Callback() { // from class: com.oplusos.vfxmodelviewer.filament.android.UiHelper.1
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
                    UiHelper.this.mRenderCallback.onResized(i4, i5);
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    UiHelper.this.createSwapChain(surfaceHolder.getSurface());
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    UiHelper.this.destroySwapChain();
                }
            };
            SurfaceHolder holder = surfaceView.getHolder();
            surfaceViewHandler.setCallBack(callback);
            int i3 = this.mDesiredWidth;
            if (i3 > 0 && (i = this.mDesiredHeight) > 0) {
                holder.setFixedSize(i3, i);
            }
            Surface surface = holder.getSurface();
            if (surface == null || !surface.isValid()) {
                return;
            }
            callback.surfaceCreated(holder);
            callback.surfaceChanged(holder, i2, holder.getSurfaceFrame().width(), holder.getSurfaceFrame().height());
        }
    }

    public void detach() {
        RenderSurface renderSurface = this.mRenderSurface;
        if (renderSurface != null) {
            renderSurface.detach();
        }
        destroySwapChain();
        this.mNativeWindow = null;
        this.mRenderSurface = null;
    }

    public int getDesiredHeight() {
        return this.mDesiredHeight;
    }

    public int getDesiredWidth() {
        return this.mDesiredWidth;
    }

    @Nullable
    public RendererCallback getRenderCallback() {
        return this.mRenderCallback;
    }

    public long getSwapChainFlags() {
        return isOpaque() ? 0L : 1L;
    }

    public boolean isMediaOverlay() {
        return this.mOverlay;
    }

    public boolean isOpaque() {
        return this.mOpaque;
    }

    public boolean isReadyToRender() {
        return this.mHasSwapChain;
    }

    public void setDesiredSize(int i, int i2) {
        this.mDesiredWidth = i;
        this.mDesiredHeight = i2;
        RenderSurface renderSurface = this.mRenderSurface;
        if (renderSurface != null) {
            renderSurface.resize(i, i2);
        }
    }

    public void setMediaOverlay(boolean z) {
        this.mOverlay = z;
    }

    public void setOpaque(boolean z) {
        this.mOpaque = z;
    }

    public void setRenderCallback(@Nullable RendererCallback rendererCallback) {
        this.mRenderCallback = rendererCallback;
    }

    public UiHelper(ContextErrorPolicy contextErrorPolicy) {
        this.mOpaque = true;
        this.mOverlay = false;
    }

    public void attachTo(@NonNull TextureView textureView) {
        if (attach(textureView)) {
            textureView.setOpaque(isOpaque());
            TextureViewHandler textureViewHandler = new TextureViewHandler(textureView);
            this.mRenderSurface = textureViewHandler;
            TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.oplusos.vfxmodelviewer.filament.android.UiHelper.2
                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    if (UiHelper.this.mDesiredWidth > 0 && UiHelper.this.mDesiredHeight > 0) {
                        surfaceTexture.setDefaultBufferSize(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
                    }
                    Surface surface = new Surface(surfaceTexture);
                    ((TextureViewHandler) UiHelper.this.mRenderSurface).setSurface(surface);
                    UiHelper.this.createSwapChain(surface);
                    UiHelper.this.mRenderCallback.onResized(i, i2);
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    UiHelper.this.destroySwapChain();
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    if (UiHelper.this.mDesiredWidth <= 0 || UiHelper.this.mDesiredHeight <= 0) {
                        UiHelper.this.mRenderCallback.onResized(i, i2);
                    } else {
                        surfaceTexture.setDefaultBufferSize(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
                        UiHelper.this.mRenderCallback.onResized(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
                    }
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    UiHelper.this.mRenderCallback.onUpdated();
                }
            };
            textureViewHandler.setCallBack(surfaceTextureListener);
            if (textureView.isAvailable()) {
                surfaceTextureListener.onSurfaceTextureAvailable(textureView.getSurfaceTexture(), this.mDesiredWidth, this.mDesiredHeight);
            }
        }
    }

    public void attachTo(@NonNull final SurfaceHolder surfaceHolder) {
        int i;
        if (attach(surfaceHolder)) {
            int i2 = isOpaque() ? -1 : -3;
            surfaceHolder.setFormat(i2);
            SurfaceHolderHandler surfaceHolderHandler = new SurfaceHolderHandler(surfaceHolder);
            this.mRenderSurface = surfaceHolderHandler;
            SurfaceHolder.Callback callback = new SurfaceHolder.Callback() { // from class: com.oplusos.vfxmodelviewer.filament.android.UiHelper.3
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder2, int i3, int i4, int i5) {
                    UiHelper.this.mRenderCallback.onResized(i4, i5);
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder2) {
                    UiHelper.this.createSwapChain(surfaceHolder.getSurface());
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder2) {
                    UiHelper.this.destroySwapChain();
                }
            };
            surfaceHolderHandler.setCallBack(callback);
            int i3 = this.mDesiredWidth;
            if (i3 > 0 && (i = this.mDesiredHeight) > 0) {
                surfaceHolder.setFixedSize(i3, i);
            }
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                return;
            }
            callback.surfaceCreated(surfaceHolder);
            callback.surfaceChanged(surfaceHolder, i2, surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
        }
    }
}
