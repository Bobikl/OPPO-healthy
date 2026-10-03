package com.heytap.store.platform.videoplayer.base;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010$\u001a\u00020%H'J\b\u0010&\u001a\u00020%H'J\u0012\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u0003H&J\b\u0010(\u001a\u00020%H'J\b\u0010)\u001a\u00020%H&J \u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH&J\u001a\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H&J\u0010\u00103\u001a\u00020%2\u0006\u00104\u001a\u000200H&J\u0010\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\tH&J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u000200H&J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u000200H&J\u001c\u0010;\u001a\u00020%2\b\b\u0002\u0010<\u001a\u0002002\b\b\u0002\u0010'\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007R\u0018\u0010\u0013\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0005\"\u0004\b\u0014\u0010\u0007R\u0018\u0010\u0015\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u0018\u0010\u0017\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0007R\u0018\u0010\u0019\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0005\"\u0004\b\u001a\u0010\u0007R\u001e\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cX¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0005\"\u0004\b#\u0010\u0007¨\u0006="}, d2 = {"Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerController;", "", ParserTag.AUTO_PLAY, "", "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "controlType", "", "getControlType", "()Ljava/lang/String;", "setControlType", "(Ljava/lang/String;)V", "hasSupportLowMachine", "getHasSupportLowMachine", "setHasSupportLowMachine", "isFullScreenForActivity", "setFullScreenForActivity", "isLoop", "setLoop", "isPlayOnGallery", "setPlayOnGallery", "isPlayOnGalleryIsShow", "setPlayOnGalleryIsShow", "isPlaying", "setPlaying", "playActivityClass", "Ljava/lang/Class;", "getPlayActivityClass", "()Ljava/lang/Class;", "setPlayActivityClass", "(Ljava/lang/Class;)V", "stopPlayAfterEnd", "getStopPlayAfterEnd", "setStopPlayAfterEnd", "onDestroy", "", "onPause", "isShowPause", "onResume", ClickApiEntity.PLAY_VIDEO, "setContent", "url", "previewImage", "shopWindowAdUrl", "setLiveNetStatus", "status", "", "bundle", "Landroid/os/Bundle;", "setOtherWidgetVisibility", "visibility", "setPlayerRatio", "ratio", "setSeekControlBg", "color", "setVideoProgress", "progress", "videoPlayStatus", "isPlay", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IVideoPlayerController {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onPause$default(IVideoPlayerController iVideoPlayerController, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPause");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            iVideoPlayerController.onPause(z);
        }

        public static /* synthetic */ void videoPlayStatus$default(IVideoPlayerController iVideoPlayerController, int i, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: videoPlayStatus");
            }
            if ((i2 & 1) != 0) {
                i = -1;
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            iVideoPlayerController.videoPlayStatus(i, z);
        }
    }

    boolean getAutoPlay();

    @NotNull
    String getControlType();

    boolean getHasSupportLowMachine();

    @Nullable
    Class<?> getPlayActivityClass();

    boolean getStopPlayAfterEnd();

    boolean isFullScreenForActivity();

    boolean isLoop();

    boolean isPlayOnGallery();

    boolean isPlayOnGalleryIsShow();

    boolean isPlaying();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause();

    void onPause(boolean isShowPause);

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume();

    void playVideo();

    void setAutoPlay(boolean z);

    void setContent(@NotNull String url, @NotNull String previewImage, @NotNull String shopWindowAdUrl);

    void setControlType(@NotNull String str);

    void setFullScreenForActivity(boolean z);

    void setHasSupportLowMachine(boolean z);

    void setLiveNetStatus(int status, @Nullable Bundle bundle);

    void setLoop(boolean z);

    void setOtherWidgetVisibility(int visibility);

    void setPlayActivityClass(@Nullable Class<?> cls);

    void setPlayOnGallery(boolean z);

    void setPlayOnGalleryIsShow(boolean z);

    void setPlayerRatio(@NotNull String ratio);

    void setPlaying(boolean z);

    void setSeekControlBg(int color);

    void setStopPlayAfterEnd(boolean z);

    void setVideoProgress(int progress);

    void videoPlayStatus(int isPlay, boolean isShowPause);
}
