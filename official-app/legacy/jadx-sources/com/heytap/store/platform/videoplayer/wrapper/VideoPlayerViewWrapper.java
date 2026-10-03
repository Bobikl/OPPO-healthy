package com.heytap.store.platform.videoplayer.wrapper;

import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import com.heytap.store.platform.androidplayer.impl.AndroidVideoPlayerViewWrapperImp;
import com.heytap.store.platform.oplusplayer.impl.OplusVideoPlayerViewWrapperImp;
import com.heytap.store.platform.oppoplayer.impl.OppoVideoPlayerViewWrapperImp;
import com.heytap.store.platform.txplayer.impl.TxPlayerViewWrapperImp;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerViewWrapper;", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerViewWrapper;", "()V", "impl", "getVideoView", "Landroid/view/TextureView;", "getView", "Landroid/view/View;", "viewStubInflate", "", "stub", "Landroid/view/ViewStub;", "videoplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoPlayerViewWrapper implements IVideoPlayerViewWrapper {

    @Nullable
    private IVideoPlayerViewWrapper impl;

    public VideoPlayerViewWrapper() {
        try {
            try {
                try {
                    try {
                        this.impl = new TxPlayerViewWrapperImp();
                    } catch (NoClassDefFoundError unused) {
                        this.impl = new AndroidVideoPlayerViewWrapperImp();
                    }
                } catch (NoClassDefFoundError unused2) {
                    this.impl = new OplusVideoPlayerViewWrapperImp();
                }
            } catch (NoClassDefFoundError e2) {
                e2.printStackTrace();
            }
        } catch (NoClassDefFoundError unused3) {
            this.impl = new OppoVideoPlayerViewWrapperImp();
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper
    @Nullable
    public TextureView getVideoView() {
        IVideoPlayerViewWrapper iVideoPlayerViewWrapper = this.impl;
        if (iVideoPlayerViewWrapper == null) {
            return null;
        }
        return iVideoPlayerViewWrapper.getVideoView();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper
    @Nullable
    public View getView() {
        IVideoPlayerViewWrapper iVideoPlayerViewWrapper = this.impl;
        if (iVideoPlayerViewWrapper == null) {
            return null;
        }
        return iVideoPlayerViewWrapper.getView();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper
    public void viewStubInflate(@NotNull ViewStub stub) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        IVideoPlayerViewWrapper iVideoPlayerViewWrapper = this.impl;
        if (iVideoPlayerViewWrapper == null) {
            return;
        }
        iVideoPlayerViewWrapper.viewStubInflate(stub);
    }
}
