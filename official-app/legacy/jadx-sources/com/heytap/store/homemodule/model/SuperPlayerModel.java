package com.heytap.store.homemodule.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J \u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/heytap/store/homemodule/model/SuperPlayerModel;", "Lcom/heytap/store/homemodule/model/ISuperPlayerModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mVideoPlayListener", "Lcom/heytap/store/homemodule/model/SuperPlayerModel$VideoPlayListener;", "value", "", "mute", "getMute", "()Z", "setMute", "(Z)V", "vodPlayer", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerWrapper;", "getVodPlayer", "()Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerWrapper;", "setVodPlayer", "(Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerWrapper;)V", "onDestroy", "", "onPausePlay", "onResumePlay", "onStopPlay", "setRequestAudioFocus", TypedValues.Custom.S_BOOLEAN, "setVideoPlayListener", "videoPlayListener", "startPlay", "videoView", "Landroid/view/View;", "pullUrl", "", "renderMode", "", "Companion", "VideoPlayListener", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SuperPlayerModel extends ISuperPlayerModel {

    @NotNull
    public static final String TAG = "SuperPlayerModel";

    @Nullable
    private VideoPlayListener mVideoPlayListener;
    private boolean mute;

    @NotNull
    private VideoPlayerWrapper vodPlayer;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/model/SuperPlayerModel$VideoPlayListener;", "", "onNetStatus", "", "var1", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "var2", "Landroid/os/Bundle;", "onPlayEvent", "", "var3", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface VideoPlayListener {
        boolean onNetStatus(@Nullable VideoPlayerView var1, @Nullable Bundle var2);

        boolean onPlayEvent(@Nullable VideoPlayerView var1, int var2, @Nullable Bundle var3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPlayerModel(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.vodPlayer = new VideoPlayerWrapper(context);
        this.mute = true;
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public boolean getMute() {
        return this.mute;
    }

    @NotNull
    public final VideoPlayerWrapper getVodPlayer() {
        return this.vodPlayer;
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void onDestroy() {
        this.vodPlayer.onDestroy();
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void onPausePlay() {
        this.vodPlayer.pause();
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void onResumePlay() {
        this.vodPlayer.resume();
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void onStopPlay() {
        this.vodPlayer.stopPlay(true);
        this.vodPlayer.setPlayerView(new SurfaceView(getContext().getApplicationContext()));
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void setMute(boolean z) {
        this.mute = z;
        if (getIsPlaying()) {
            this.vodPlayer.setMute(getMute());
        }
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void setRequestAudioFocus(boolean z) {
        this.vodPlayer.setRequestAudioFocus(z);
    }

    public final void setVideoPlayListener(@Nullable VideoPlayListener videoPlayListener) {
        this.mVideoPlayListener = videoPlayListener;
    }

    public final void setVodPlayer(@NotNull VideoPlayerWrapper videoPlayerWrapper) {
        Intrinsics.checkNotNullParameter(videoPlayerWrapper, "<set-?>");
        this.vodPlayer = videoPlayerWrapper;
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void startPlay(@NotNull final View videoView, @NotNull String pullUrl, int renderMode) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(pullUrl, "pullUrl");
        if (getIsPlaying() || TextUtils.isEmpty(pullUrl)) {
            return;
        }
        this.vodPlayer.setPlayerView(videoView);
        this.vodPlayer.startPlay(pullUrl);
        this.vodPlayer.setMute(getMute());
        this.vodPlayer.setLoop(getLoopPlay());
        this.vodPlayer.setRenderMode(renderMode);
        setPlaying(true);
        this.vodPlayer.setVodListener(new VideoPlayerView.ITXVodPlayListener() { // from class: com.heytap.store.homemodule.model.SuperPlayerModel.startPlay.1
            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView.ITXVodPlayListener
            public void onNetStatus(@Nullable VideoPlayerView p0, @Nullable Bundle p1) {
                VideoPlayListener videoPlayListener = SuperPlayerModel.this.mVideoPlayListener;
                if (videoPlayListener == null) {
                    return;
                }
                videoPlayListener.onNetStatus(p0, p1);
            }

            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView.ITXVodPlayListener
            public void onPlayEvent(@Nullable VideoPlayerView p0, int p1, @Nullable Bundle p2) {
                VideoPlayListener videoPlayListener = SuperPlayerModel.this.mVideoPlayListener;
                if (videoPlayListener == null ? false : videoPlayListener.onPlayEvent(p0, p1, p2)) {
                    return;
                }
                if (p1 == 102) {
                    LogUtils.INSTANCE.d(SuperPlayerModel.TAG, "play end");
                    videoView.setVisibility(4);
                } else {
                    if (p1 != 2301) {
                        return;
                    }
                    LogUtils.INSTANCE.d(SuperPlayerModel.TAG, "err in getting live stream");
                    videoView.setVisibility(4);
                }
            }
        });
    }
}
