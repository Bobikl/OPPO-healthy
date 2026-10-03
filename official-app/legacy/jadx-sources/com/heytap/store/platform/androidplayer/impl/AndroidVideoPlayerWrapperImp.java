package com.heytap.store.platform.androidplayer.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerStatusListener;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010!J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0011H\u0016J\u0010\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001bJ\u0012\u0010-\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u000e\u0010-\u001a\u00020#2\u0006\u00100\u001a\u00020 J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020#2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\u0011H\u0016J>\u00109\u001a\u00020#26\u0010:\u001a2\u0012\u0013\u0012\u001106¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110?¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020#0;J\u000e\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020AJ\u000e\u0010B\u001a\u00020#2\u0006\u0010:\u001a\u00020CJ\u0010\u0010D\u001a\u00020#2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020\u0011H\u0016R\u001c\u0010\u0005\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/heytap/store/platform/androidplayer/impl/AndroidVideoPlayerWrapperImp;", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bufferDuration", "", "getBufferDuration", "()F", "setBufferDuration", "(F)V", "getContext", "()Landroid/content/Context;", "duration", "getDuration", "setDuration", "value", "", "isLoop", "()Z", "setLoop", "(Z)V", "isPlaying", "()Ljava/lang/Boolean;", "setPlaying", "(Ljava/lang/Boolean;)V", "parent", "Landroid/view/SurfaceView;", "playableDuration", "getPlayableDuration", "setPlayableDuration", "player", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "()Ljava/lang/Float;", "onDestroy", "", "pause", "resume", "seek", "progress", "", "setMute", "mute", "setParentView", "surfaceView", "setPlayerView", "view", "Landroid/view/View;", "playerView", "setPlayerViewWrapper", "playerViewWrapper", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerViewWrapper;", "setRenderMode", "mode", "", "setRequestAudioFocus", "focus", "setVideoPlayerStatusListener", "listener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "p1", "Landroid/os/Bundle;", "p2", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerStatusListener;", "setVodListener", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView$ITXVodPlayListener;", "startPlay", RunningPostureVideoActivity.VIDEO_PATH, "", "stopPlay", "needClearLastImg", "androidplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidVideoPlayerWrapperImp implements IVideoPlayerWrapper {
    private float bufferDuration;

    @NotNull
    private final Context context;
    private float duration;

    @Nullable
    private SurfaceView parent;
    private float playableDuration;

    @NotNull
    private final VideoPlayerView player;

    public AndroidVideoPlayerWrapperImp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.player = new VideoPlayerView(context, null, 0, 6, null);
    }

    public final float getBufferDuration() {
        return this.player.getBufferDuration();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    @Nullable
    /* JADX INFO: renamed from: getDuration, reason: collision with other method in class */
    public Float mo5037getDuration() {
        return Float.valueOf(this.player.getDuration());
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    @Nullable
    /* JADX INFO: renamed from: getPlayableDuration, reason: collision with other method in class */
    public Float mo5038getPlayableDuration() {
        return Float.valueOf(this.player.getPlayableDuration());
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public boolean isLoop() {
        return this.player.getIsLoop();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    @Nullable
    public Boolean isPlaying() {
        return Boolean.valueOf(this.player.isPlaying());
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void onDestroy() {
        this.player.onDestroy();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void pause() {
        this.player.pause();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void resume() {
        this.player.resume();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void seek(long progress) {
        this.player.seek(progress);
    }

    public final void setBufferDuration(float f) {
        this.bufferDuration = f;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setLoop(boolean z) {
        this.player.setLoop(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setMute(boolean mute) {
        this.player.setMute(mute);
    }

    public final void setParentView(@Nullable SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.parent = surfaceView;
        this.player.setPlayerView(surfaceView);
    }

    public final void setPlayableDuration(float f) {
        this.playableDuration = f;
    }

    public final void setPlayerView(@NotNull VideoPlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        SurfaceView surfaceView = this.parent;
        if (surfaceView == null) {
            return;
        }
        this.player.setPlayerView(surfaceView);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setPlayerViewWrapper(@NotNull IVideoPlayerViewWrapper playerViewWrapper) {
        Intrinsics.checkNotNullParameter(playerViewWrapper, "playerViewWrapper");
        View view = playerViewWrapper.getView();
        if (view instanceof SurfaceView) {
            setParentView((SurfaceView) view);
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setPlaying(@Nullable Boolean bool) {
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setRenderMode(int mode) {
        this.player.setRenderMode(mode);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setRequestAudioFocus(boolean focus) {
    }

    public final void setVideoPlayerStatusListener(@NotNull final VideoPlayerStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.player.setVodListener(new VideoPlayerView.ITXVodPlayListener() { // from class: com.heytap.store.platform.androidplayer.impl.AndroidVideoPlayerWrapperImp.setVideoPlayerStatusListener.1

            @NotNull
            private final Bundle empty;

            {
                Bundle EMPTY = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                this.empty = EMPTY;
            }

            @NotNull
            public final Bundle getEmpty() {
                return this.empty;
            }

            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView.ITXVodPlayListener
            public void onNetStatus(@Nullable VideoPlayerView p0, @Nullable Bundle p1) {
            }

            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView.ITXVodPlayListener
            public void onPlayEvent(@Nullable VideoPlayerView p0, int p1, @Nullable Bundle p2) {
                if (p1 == 2002) {
                    VideoPlayerStatusListener videoPlayerStatusListener = listener;
                    if (p2 == null) {
                        p2 = this.empty;
                    }
                    videoPlayerStatusListener.onPlayEventComing(103, p2);
                    return;
                }
                VideoPlayerStatusListener videoPlayerStatusListener2 = listener;
                if (p2 == null) {
                    p2 = this.empty;
                }
                videoPlayerStatusListener2.onPlayEventComing(p1, p2);
            }
        });
    }

    public final void setVodListener(@NotNull VideoPlayerView.ITXVodPlayListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.player.setVodListener(listener);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void startPlay(@NotNull String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        VideoPlayerView.startPlay$default(this.player, videoUrl, false, 2, null);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void stopPlay(boolean needClearLastImg) {
        this.player.stopPlay(needClearLastImg);
    }

    public final float getDuration() {
        return this.player.getDuration();
    }

    public final float getPlayableDuration() {
        return this.player.getPlayableDuration();
    }

    public final void setVideoPlayerStatusListener(@NotNull final Function2<? super Integer, ? super Bundle, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.player.setVodListener(new VideoPlayerView.ITXVodPlayListener() { // from class: com.heytap.store.platform.androidplayer.impl.AndroidVideoPlayerWrapperImp.setVideoPlayerStatusListener.2

            @NotNull
            private final Bundle empty;

            /* JADX WARN: Multi-variable type inference failed */
            {
                Bundle EMPTY = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                this.empty = EMPTY;
            }

            @NotNull
            public final Bundle getEmpty() {
                return this.empty;
            }

            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView.ITXVodPlayListener
            public void onNetStatus(@Nullable VideoPlayerView p0, @Nullable Bundle p1) {
            }

            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView.ITXVodPlayListener
            public void onPlayEvent(@Nullable VideoPlayerView p0, int p1, @Nullable Bundle p2) {
                if (p1 == 2002) {
                    Function2<Integer, Bundle, Unit> function2 = listener;
                    if (p2 == null) {
                        p2 = this.empty;
                    }
                    function2.invoke(103, p2);
                    return;
                }
                Function2<Integer, Bundle, Unit> function3 = listener;
                Integer numValueOf = Integer.valueOf(p1);
                if (p2 == null) {
                    p2 = this.empty;
                }
                function3.invoke(numValueOf, p2);
            }
        });
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setPlayerView(@Nullable View view) {
        if (view == null) {
            view = new SurfaceView(this.context.getApplicationContext());
        }
        if (view instanceof SurfaceView) {
            this.player.setPlayerView((SurfaceView) view);
        }
    }
}
