package com.heytap.store.platform.androidplayer.impl;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/platform/androidplayer/impl/AndroidVideoPlayerViewWrapperImp;", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerViewWrapper;", "()V", "parentView", "Landroid/view/SurfaceView;", "getParentView", "()Landroid/view/SurfaceView;", "setParentView", "(Landroid/view/SurfaceView;)V", "getVideoView", "Landroid/view/TextureView;", "getView", "Landroid/view/View;", "viewStubInflate", "", "stub", "Landroid/view/ViewStub;", "androidplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidVideoPlayerViewWrapperImp implements IVideoPlayerViewWrapper {

    @Nullable
    private SurfaceView parentView;

    @Nullable
    public final SurfaceView getParentView() {
        return this.parentView;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper
    @Nullable
    public TextureView getVideoView() {
        return null;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper
    @Nullable
    public View getView() {
        return this.parentView;
    }

    public final void setParentView(@Nullable SurfaceView surfaceView) {
        this.parentView = surfaceView;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper
    public void viewStubInflate(@NotNull ViewStub stub) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        if (this.parentView != null) {
            return;
        }
        View viewInflate = stub.inflate();
        if (viewInflate instanceof SurfaceView) {
            this.parentView = (SurfaceView) viewInflate;
        }
    }
}
