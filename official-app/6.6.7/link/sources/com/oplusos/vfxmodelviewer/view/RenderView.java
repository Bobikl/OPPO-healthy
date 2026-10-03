package com.oplusos.vfxmodelviewer.view;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.oplusos.vfxmodelviewer.filament.SwapChain;
import com.oplusos.vfxmodelviewer.filament.android.UiHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002:\u0003=>?B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020#J\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u0004\u0018\u00010\u0012J\u0006\u0010)\u001a\u00020\u0007J\b\u0010*\u001a\u00020\u0019H\u0014J\b\u0010+\u001a\u00020\u0019H\u0014J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.H\u0014J\u0012\u0010/\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u00101\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\rJ\u0018\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020!2\b\b\u0002\u00106\u001a\u00020\u0007J\u0018\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020%2\b\b\u0002\u00106\u001a\u00020\u0007J\u001a\u00109\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u00106\u001a\u00020\u0007H\u0002J\u0016\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/RenderView;", "Lcom/oplusos/vfxmodelviewer/view/SceneComponent;", "Landroid/view/View$OnAttachStateChangeListener;", "modelScene", "Lcom/oplusos/vfxmodelviewer/view/ModelScene;", "(Lcom/oplusos/vfxmodelviewer/view/ModelScene;)V", "mEnableTransparent", "", "mFrameCount", "", "mFrameDuration", "mLastFrameTime", "mListener", "Lcom/oplusos/vfxmodelviewer/view/RenderView$OnRenderViewChangeListener;", "mOpenSmoothTrick", "mSize", "", "mSwapChain", "Lcom/oplusos/vfxmodelviewer/filament/SwapChain;", "mSwapChainFlag", "mUiHelper", "Lcom/oplusos/vfxmodelviewer/filament/android/UiHelper;", "mView", "Landroid/view/View;", "addDetachListener", "", "view", "applyViewSize", "clearView", "enableAlpha", "enable", "enableSmoothTrick", "getCreatSurfaceView", "Landroid/view/SurfaceView;", "context", "Landroid/content/Context;", "getCreatTextureView", "Landroid/view/TextureView;", "getFPS", "", "getSwapChain", "isReadToRender", "onDestroy", "onEnable", "onUpdate", "deltaTime", "", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "setListener", "listener", "setSurfaceView", "surfaceView", "applySize", "setTextureView", "textureView", "setView", "setViewSize", "width", "height", "OnRenderViewChangeListener", "OnViewSizeChangeListener", "SurfaceCallback", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RenderView extends SceneComponent implements View.OnAttachStateChangeListener {
    private boolean mEnableTransparent;
    private long mFrameCount;
    private long mFrameDuration;
    private long mLastFrameTime;

    @Nullable
    private OnRenderViewChangeListener mListener;
    private boolean mOpenSmoothTrick;

    @NotNull
    private int[] mSize;

    @Nullable
    private SwapChain mSwapChain;
    private long mSwapChainFlag;

    @NotNull
    private UiHelper mUiHelper;

    @Nullable
    private View mView;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/RenderView$OnRenderViewChangeListener;", "", "onViewChange", "", "newView", "Landroid/view/View;", "oldView", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnRenderViewChangeListener {
        void onViewChange(@Nullable View newView, @Nullable View oldView);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/RenderView$OnViewSizeChangeListener;", "", "onViewSizeChange", "", "width", "", "height", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnViewSizeChangeListener {
        void onViewSizeChange(int width, int height);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/RenderView$SurfaceCallback;", "Lcom/oplusos/vfxmodelviewer/filament/android/UiHelper$RendererCallback;", "(Lcom/oplusos/vfxmodelviewer/view/RenderView;)V", "onDetachedFromSurface", "", "onNativeWindowChanged", "surface", "Landroid/view/Surface;", "onResized", "width", "", "height", "onUpdated", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class SurfaceCallback implements UiHelper.RendererCallback {
        final /* synthetic */ RenderView this$0;

        public SurfaceCallback(RenderView renderView) {
            Intrinsics.checkNotNullParameter(renderView, "this$0");
            this.this$0 = renderView;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RendererCallback
        public void onDetachedFromSurface() {
            SwapChain swapChain = this.this$0.mSwapChain;
            if (swapChain == null) {
                return;
            }
            RenderView renderView = this.this$0;
            renderView.getMScene().getMEngine().destroySwapChain(swapChain);
            renderView.mSwapChain = null;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RendererCallback
        public void onNativeWindowChanged(@NotNull Surface surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            SwapChain swapChain = this.this$0.mSwapChain;
            if (swapChain != null) {
                this.this$0.getMScene().getMEngine().destroySwapChain(swapChain);
            }
            RenderView renderView = this.this$0;
            renderView.mSwapChain = renderView.getMScene().getMEngine().createSwapChain(surface, this.this$0.mSwapChainFlag);
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RendererCallback
        public void onResized(int width, int height) {
            this.this$0.getMScene().onViewSizeChange(width, height);
        }

        @Override // com.oplusos.vfxmodelviewer.filament.android.UiHelper.RendererCallback
        public void onUpdated() {
            this.this$0.mFrameDuration += System.nanoTime() - this.this$0.mLastFrameTime;
            this.this$0.mFrameCount++;
            this.this$0.mLastFrameTime = System.nanoTime();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderView(@NotNull ModelScene modelScene) {
        super(modelScene);
        Intrinsics.checkNotNullParameter(modelScene, "modelScene");
        UiHelper uiHelper = new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK);
        this.mUiHelper = uiHelper;
        this.mEnableTransparent = true;
        this.mSwapChainFlag = 1L;
        uiHelper.setRenderCallback(new SurfaceCallback(this));
        this.mSize = new int[]{1080, 1080};
    }

    private final void addDetachListener(View view) {
        view.addOnAttachStateChangeListener(this);
    }

    private final void applyViewSize() {
        View view = this.mView;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int[] iArr = this.mSize;
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view.requestLayout();
    }

    public static /* synthetic */ void setSurfaceView$default(RenderView renderView, SurfaceView surfaceView, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        renderView.setSurfaceView(surfaceView, z);
    }

    public static /* synthetic */ void setTextureView$default(RenderView renderView, TextureView textureView, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        renderView.setTextureView(textureView, z);
    }

    private final void setView(View view, boolean applySize) {
        if (Intrinsics.areEqual(this.mView, view)) {
            return;
        }
        View view2 = this.mView;
        if (view2 != null) {
            this.mUiHelper.detach();
            view2.removeOnAttachStateChangeListener(this);
        }
        View view3 = this.mView;
        this.mView = view;
        if (view != null) {
            if (view.getLayoutParams() == null) {
                int[] iArr = this.mSize;
                view.setLayoutParams(new ViewGroup.LayoutParams(iArr[0], iArr[1]));
            }
            this.mUiHelper.setOpaque(!this.mEnableTransparent);
            SurfaceView surfaceView = view instanceof SurfaceView ? (SurfaceView) view : null;
            if (surfaceView != null) {
                this.mUiHelper.attachTo(surfaceView);
            } else {
                TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
                if (textureView != null) {
                    this.mUiHelper.attachTo(textureView);
                }
            }
            if (applySize) {
                this.mSize[0] = view.getLayoutParams().width;
                this.mSize[1] = view.getLayoutParams().height;
            } else {
                applyViewSize();
            }
            addDetachListener(view);
        }
        OnRenderViewChangeListener onRenderViewChangeListener = this.mListener;
        if (onRenderViewChangeListener == null) {
            return;
        }
        onRenderViewChangeListener.onViewChange(this.mView, view3);
    }

    public static /* synthetic */ void setView$default(RenderView renderView, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        renderView.setView(view, z);
    }

    public final void clearView() {
        View view = this.mView;
        if (view != null) {
            this.mUiHelper.detach();
            view.removeOnAttachStateChangeListener(this);
            OnRenderViewChangeListener onRenderViewChangeListener = this.mListener;
            if (onRenderViewChangeListener != null) {
                onRenderViewChangeListener.onViewChange(null, this.mView);
            }
        }
        this.mView = null;
    }

    public final void enableAlpha(boolean enable) {
        this.mEnableTransparent = enable;
        this.mSwapChainFlag = enable ? 1L : 0L;
        View view = this.mView;
        if (view == null) {
            return;
        }
        SurfaceView surfaceView = view instanceof SurfaceView ? (SurfaceView) view : null;
        if (surfaceView == null) {
            TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
            if (textureView != null) {
                textureView.setOpaque(!enable);
                return;
            }
            return;
        }
        SurfaceHolder holder = surfaceView.getHolder();
        Intrinsics.checkNotNullExpressionValue(holder, "surfaceView.holder");
        surfaceView.setZOrderOnTop(this.mEnableTransparent);
        if (this.mEnableTransparent) {
            holder.setFormat(-2);
        } else {
            holder.setFormat(-1);
        }
    }

    public final void enableSmoothTrick(boolean enable) {
        this.mOpenSmoothTrick = enable;
    }

    @NotNull
    public final SurfaceView getCreatSurfaceView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.mView == null) {
            SurfaceView surfaceView = new SurfaceView(context);
            int[] iArr = this.mSize;
            surfaceView.setLayoutParams(new ViewGroup.LayoutParams(iArr[0], iArr[1]));
            setSurfaceView$default(this, surfaceView, false, 2, null);
        }
        View view = this.mView;
        SurfaceView surfaceView2 = view instanceof SurfaceView ? (SurfaceView) view : null;
        if (surfaceView2 != null) {
            return surfaceView2;
        }
        clearView();
        return getCreatSurfaceView(context);
    }

    @NotNull
    public final TextureView getCreatTextureView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.mView == null) {
            TextureView textureView = new TextureView(context);
            int[] iArr = this.mSize;
            textureView.setLayoutParams(new ViewGroup.LayoutParams(iArr[0], iArr[1]));
            setTextureView$default(this, textureView, false, 2, null);
        }
        View view = this.mView;
        TextureView textureView2 = view instanceof TextureView ? (TextureView) view : null;
        if (textureView2 != null) {
            return textureView2;
        }
        clearView();
        return getCreatTextureView(context);
    }

    public final int getFPS() {
        long j = this.mFrameDuration;
        if (j == 0) {
            return 0;
        }
        return MathKt.roundToInt(this.mFrameCount / ((float) (j / ((double) 1000000000))));
    }

    @Nullable
    /* JADX INFO: renamed from: getSwapChain, reason: from getter */
    public final SwapChain getMSwapChain() {
        return this.mSwapChain;
    }

    public final boolean isReadToRender() {
        return this.mUiHelper.isReadyToRender();
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onDestroy() {
        super.onDestroy();
        this.mUiHelper.detach();
        View view = this.mView;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
        this.mView = null;
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onEnable() {
        this.mLastFrameTime = System.nanoTime();
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onUpdate(float deltaTime) {
        if (this.mUiHelper.isReadyToRender() && this.mOpenSmoothTrick) {
            View view = this.mView;
            TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
            if (textureView == null) {
                return;
            }
            textureView.setOpaque(!textureView.isOpaque());
            textureView.setOpaque(!textureView.isOpaque());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@Nullable View v) {
        getMScene().localEnable(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@Nullable View v) {
        getMScene().localEnable(false);
    }

    public final void setListener(@NotNull OnRenderViewChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    public final void setSurfaceView(@NotNull SurfaceView surfaceView, boolean applySize) {
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        setView(surfaceView, applySize);
    }

    public final void setTextureView(@NotNull TextureView textureView, boolean applySize) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        setView(textureView, applySize);
    }

    public final void setViewSize(int width, int height) {
        int[] iArr = this.mSize;
        iArr[0] = width;
        iArr[1] = height;
        applyViewSize();
    }
}
