package com.heytap.store.platform.videoplayer;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleObserver;
import com.heytap.store.platform.androidplayer.AndroidVideoPlayerController;
import com.heytap.store.platform.oplusplayer.OPlusVideoPlayerController;
import com.heytap.store.platform.oppoplayer.OppoVideoPlayerController;
import com.heytap.store.platform.txplayer.TxVideoPlayerController;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerController;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerListener;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000bH\u0016J\b\u00102\u001a\u00020/H\u0016J\b\u00103\u001a\u00020/H\u0016J \u00104\u001a\u00020/2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0011H\u0016J\u001a\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020:H\u0016J\u0010\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020\u0011H\u0016J\u0010\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020:H\u0016J\u0010\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020:H\u0016J\u0018\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020:2\u0006\u00101\u001a\u00020\u000bH\u0016R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R$\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R$\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R$\u0010!\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R$\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010¨\u0006G"}, d2 = {"Lcom/heytap/store/platform/videoplayer/VideoPlayerController;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerController;", "itemView", "Landroid/view/View;", "context", "Landroid/content/Context;", "listener", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerListener;", "(Landroid/view/View;Landroid/content/Context;Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerListener;)V", "value", "", ParserTag.AUTO_PLAY, "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "", "controlType", "getControlType", "()Ljava/lang/String;", "setControlType", "(Ljava/lang/String;)V", "controller", "hasSupportLowMachine", "getHasSupportLowMachine", "setHasSupportLowMachine", "isFullScreenForActivity", "setFullScreenForActivity", "isLoop", "setLoop", "isPlayOnGallery", "setPlayOnGallery", "isPlayOnGalleryIsShow", "setPlayOnGalleryIsShow", "isPlaying", "setPlaying", "Ljava/lang/Class;", "playActivityClass", "getPlayActivityClass", "()Ljava/lang/Class;", "setPlayActivityClass", "(Ljava/lang/Class;)V", "stopPlayAfterEnd", "getStopPlayAfterEnd", "setStopPlayAfterEnd", "onDestroy", "", "onPause", "isShowPause", "onResume", ClickApiEntity.PLAY_VIDEO, "setContent", "url", "previewImage", "shopWindowAdUrl", "setLiveNetStatus", "status", "", "bundle", "Landroid/os/Bundle;", "setOtherWidgetVisibility", "visibility", "setPlayerRatio", "ratio", "setSeekControlBg", "color", "setVideoProgress", "progress", "videoPlayStatus", "isPlay", "videoplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoPlayerController implements LifecycleObserver, IVideoPlayerController {

    @NotNull
    private Context context;

    @Nullable
    private IVideoPlayerController controller;

    @NotNull
    private View itemView;

    @Nullable
    private final IVideoPlayerListener listener;

    public VideoPlayerController(@NotNull View itemView, @NotNull Context context, @Nullable IVideoPlayerListener iVideoPlayerListener) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemView = itemView;
        this.context = context;
        this.listener = iVideoPlayerListener;
        try {
            try {
                try {
                    try {
                        this.controller = new TxVideoPlayerController(this.itemView, this.context, iVideoPlayerListener);
                    } catch (NoClassDefFoundError unused) {
                        this.controller = new AndroidVideoPlayerController(this.itemView, this.context, this.listener);
                    }
                } catch (NoClassDefFoundError unused2) {
                    this.controller = new OPlusVideoPlayerController(this.itemView, this.context, this.listener);
                }
            } catch (NoClassDefFoundError unused3) {
                this.controller = new OppoVideoPlayerController(this.itemView, this.context, this.listener);
            }
        } catch (NoClassDefFoundError unused4) {
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public boolean getAutoPlay() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return false;
        }
        return iVideoPlayerController.getAutoPlay();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    @NotNull
    public String getControlType() {
        String controlType;
        IVideoPlayerController iVideoPlayerController = this.controller;
        return (iVideoPlayerController == null || (controlType = iVideoPlayerController.getControlType()) == null) ? "" : controlType;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public boolean getHasSupportLowMachine() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return true;
        }
        return iVideoPlayerController.getHasSupportLowMachine();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    @Nullable
    public Class<?> getPlayActivityClass() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return null;
        }
        return iVideoPlayerController.getPlayActivityClass();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public boolean getStopPlayAfterEnd() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return false;
        }
        return iVideoPlayerController.getStopPlayAfterEnd();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    /* JADX INFO: renamed from: isFullScreenForActivity */
    public boolean getIsFullScreenForActivity() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return false;
        }
        return iVideoPlayerController.getIsFullScreenForActivity();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public boolean isLoop() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return false;
        }
        return iVideoPlayerController.isLoop();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    /* JADX INFO: renamed from: isPlayOnGallery */
    public boolean getIsPlayOnGallery() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return false;
        }
        return iVideoPlayerController.getIsPlayOnGallery();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    /* JADX INFO: renamed from: isPlayOnGalleryIsShow */
    public boolean getIsPlayOnGalleryIsShow() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return false;
        }
        return iVideoPlayerController.getIsPlayOnGalleryIsShow();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    /* JADX INFO: renamed from: isPlaying */
    public boolean getIsPlaying() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return false;
        }
        return iVideoPlayerController.getIsPlaying();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void onDestroy() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.onDestroy();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void onPause(boolean isShowPause) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.onPause(isShowPause);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void onResume() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.onResume();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void playVideo() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.playVideo();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setAutoPlay(boolean z) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setAutoPlay(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setContent(@NotNull String url, @NotNull String previewImage, @NotNull String shopWindowAdUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(previewImage, "previewImage");
        Intrinsics.checkNotNullParameter(shopWindowAdUrl, "shopWindowAdUrl");
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setContent(url, previewImage, shopWindowAdUrl);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setControlType(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setControlType(value);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setFullScreenForActivity(boolean z) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setFullScreenForActivity(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setHasSupportLowMachine(boolean z) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setHasSupportLowMachine(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setLiveNetStatus(int status, @Nullable Bundle bundle) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setLiveNetStatus(status, bundle);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setLoop(boolean z) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setLoop(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setOtherWidgetVisibility(int visibility) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setOtherWidgetVisibility(visibility);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlayActivityClass(@Nullable Class<?> cls) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setPlayActivityClass(cls);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlayOnGallery(boolean z) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setPlayOnGallery(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlayOnGalleryIsShow(boolean z) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setPlayOnGalleryIsShow(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlayerRatio(@NotNull String ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setPlayerRatio(ratio);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlaying(boolean z) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setPlaying(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setSeekControlBg(int color) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setSeekControlBg(color);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setStopPlayAfterEnd(boolean z) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setStopPlayAfterEnd(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setVideoProgress(int progress) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.setVideoProgress(progress);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void videoPlayStatus(int isPlay, boolean isShowPause) {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.videoPlayStatus(isPlay, isShowPause);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void onPause() {
        IVideoPlayerController iVideoPlayerController = this.controller;
        if (iVideoPlayerController == null) {
            return;
        }
        iVideoPlayerController.onPause();
    }
}
