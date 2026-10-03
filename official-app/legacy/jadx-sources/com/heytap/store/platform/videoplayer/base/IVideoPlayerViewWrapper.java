package com.heytap.store.platform.videoplayer.base;

import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerViewWrapper;", "", "getVideoView", "Landroid/view/TextureView;", "getView", "Landroid/view/View;", "viewStubInflate", "", "stub", "Landroid/view/ViewStub;", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IVideoPlayerViewWrapper {
    @Nullable
    TextureView getVideoView();

    @Nullable
    View getView();

    void viewStubInflate(@NotNull ViewStub stub);
}
