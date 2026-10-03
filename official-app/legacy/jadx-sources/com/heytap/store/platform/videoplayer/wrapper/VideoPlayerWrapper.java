package com.heytap.store.platform.videoplayer.wrapper;

import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.heytap.store.platform.androidplayer.impl.AndroidVideoPlayerWrapperImp;
import com.heytap.store.platform.oplusplayer.impl.OplusVideoPlayerWrapperImp;
import com.heytap.store.platform.oppoplayer.impl.OppoVideoPlayerWrapperImp;
import com.heytap.store.platform.txplayer.impl.TxPlayerWrapperIml;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerViewWrapper;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!J\u0012\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\tH\u0016J>\u0010-\u001a\u00020\u001726\u0010.\u001a2\u0012\u0013\u0012\u00110*¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0013\u0012\u001103¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00170/J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u000205J\u000e\u00106\u001a\u00020\u00172\u0006\u0010.\u001a\u000207J\u0010\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006="}, d2 = {"Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerWrapper;", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "impl", "value", "", "isLoop", "()Z", "setLoop", "(Z)V", "isPlaying", "()Ljava/lang/Boolean;", "setPlaying", "(Ljava/lang/Boolean;)V", "getDuration", "", "()Ljava/lang/Float;", "getPlayableDuration", "onDestroy", "", "pause", "resume", "seek", "progress", "", "setMute", "mute", "setParentView", "surfaceView", "Landroid/view/SurfaceView;", "setPlayerView", "view", "Landroid/view/View;", "setPlayerViewWrapper", "playerViewWrapper", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerViewWrapper;", "setRenderMode", "mode", "", "setRequestAudioFocus", "focus", "setVideoPlayerStatusListener", "listener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "p1", "Landroid/os/Bundle;", "p2", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerStatusListener;", "setVodListener", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView$ITXVodPlayListener;", "startPlay", RunningPostureVideoActivity.VIDEO_PATH, "", "stopPlay", "needClearLastImg", "videoplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoPlayerWrapper implements IVideoPlayerWrapper {

    @NotNull
    private final Context context;

    @Nullable
    private IVideoPlayerWrapper impl;

    public VideoPlayerWrapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        try {
            try {
                try {
                    try {
                        this.impl = new TxPlayerWrapperIml(context);
                    } catch (NoClassDefFoundError unused) {
                        this.impl = new OplusVideoPlayerWrapperImp(this.context);
                    }
                } catch (NoClassDefFoundError unused2) {
                    this.impl = new OppoVideoPlayerWrapperImp(this.context);
                }
            } catch (NoClassDefFoundError unused3) {
                this.impl = new AndroidVideoPlayerWrapperImp(this.context);
            }
        } catch (NoClassDefFoundError e2) {
            e2.printStackTrace();
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    @Nullable
    /* JADX INFO: renamed from: getDuration */
    public Float mo5037getDuration() {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return null;
        }
        return iVideoPlayerWrapper.mo5037getDuration();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    @Nullable
    /* JADX INFO: renamed from: getPlayableDuration */
    public Float mo5038getPlayableDuration() {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return null;
        }
        return iVideoPlayerWrapper.mo5038getPlayableDuration();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public boolean isLoop() {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return false;
        }
        return iVideoPlayerWrapper.isLoop();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    @Nullable
    public Boolean isPlaying() {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return null;
        }
        return iVideoPlayerWrapper.isPlaying();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void onDestroy() {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.onDestroy();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void pause() {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.pause();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void resume() {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.resume();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void seek(long progress) {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.seek(progress);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setLoop(boolean z) {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.setLoop(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setMute(boolean mute) {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.setMute(mute);
    }

    public final void setParentView(@Nullable SurfaceView surfaceView) {
        try {
            OppoVideoPlayerWrapperImp oppoVideoPlayerWrapperImp = this.impl;
            if (oppoVideoPlayerWrapperImp != null && (oppoVideoPlayerWrapperImp instanceof OppoVideoPlayerWrapperImp)) {
                oppoVideoPlayerWrapperImp.setParentView(surfaceView);
            }
        } catch (NoClassDefFoundError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setPlayerView(@Nullable View view) {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.setPlayerView(view);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setPlayerViewWrapper(@NotNull IVideoPlayerViewWrapper playerViewWrapper) {
        Intrinsics.checkNotNullParameter(playerViewWrapper, "playerViewWrapper");
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.setPlayerViewWrapper(playerViewWrapper);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setPlaying(@Nullable Boolean bool) {
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setRenderMode(int mode) {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.setRenderMode(mode);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void setRequestAudioFocus(boolean focus) {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.setRequestAudioFocus(focus);
    }

    public final void setVideoPlayerStatusListener(@NotNull VideoPlayerStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            OppoVideoPlayerWrapperImp oppoVideoPlayerWrapperImp = this.impl;
            if (oppoVideoPlayerWrapperImp != null && (oppoVideoPlayerWrapperImp instanceof OppoVideoPlayerWrapperImp)) {
                oppoVideoPlayerWrapperImp.setVideoPlayerStatusListener(listener);
            }
        } catch (NoClassDefFoundError e2) {
            e2.printStackTrace();
        }
        try {
            TxPlayerWrapperIml txPlayerWrapperIml = this.impl;
            if (txPlayerWrapperIml != null && (txPlayerWrapperIml instanceof TxPlayerWrapperIml)) {
                txPlayerWrapperIml.setVideoPlayerStatusListener(listener);
            }
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
        }
        try {
            OplusVideoPlayerWrapperImp oplusVideoPlayerWrapperImp = this.impl;
            if (oplusVideoPlayerWrapperImp != null && (oplusVideoPlayerWrapperImp instanceof OplusVideoPlayerWrapperImp)) {
                oplusVideoPlayerWrapperImp.setVideoPlayerStatusListener(listener);
            }
        } catch (NoClassDefFoundError e4) {
            e4.printStackTrace();
        }
        try {
            IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
            if (iVideoPlayerWrapper != null && (iVideoPlayerWrapper instanceof AndroidVideoPlayerWrapperImp)) {
                ((AndroidVideoPlayerWrapperImp) iVideoPlayerWrapper).setVideoPlayerStatusListener(listener);
            }
        } catch (NoClassDefFoundError e5) {
            e5.printStackTrace();
        }
    }

    public final void setVodListener(@NotNull VideoPlayerView.ITXVodPlayListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            OppoVideoPlayerWrapperImp oppoVideoPlayerWrapperImp = this.impl;
            if (oppoVideoPlayerWrapperImp != null && (oppoVideoPlayerWrapperImp instanceof OppoVideoPlayerWrapperImp)) {
                oppoVideoPlayerWrapperImp.setVodListener(listener);
            }
        } catch (NoClassDefFoundError e2) {
            e2.printStackTrace();
        }
        try {
            TxPlayerWrapperIml txPlayerWrapperIml = this.impl;
            if (txPlayerWrapperIml != null && (txPlayerWrapperIml instanceof TxPlayerWrapperIml)) {
                txPlayerWrapperIml.setVodListener(listener);
            }
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
        }
        try {
            OplusVideoPlayerWrapperImp oplusVideoPlayerWrapperImp = this.impl;
            if (oplusVideoPlayerWrapperImp != null && (oplusVideoPlayerWrapperImp instanceof OplusVideoPlayerWrapperImp)) {
                oplusVideoPlayerWrapperImp.setVodListener(listener);
            }
        } catch (NoClassDefFoundError e4) {
            e4.printStackTrace();
        }
        try {
            IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
            if (iVideoPlayerWrapper != null && (iVideoPlayerWrapper instanceof AndroidVideoPlayerWrapperImp)) {
                ((AndroidVideoPlayerWrapperImp) iVideoPlayerWrapper).setVodListener(listener);
            }
        } catch (NoClassDefFoundError e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void startPlay(@NotNull String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.startPlay(videoUrl);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerWrapper
    public void stopPlay(boolean needClearLastImg) {
        IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
        if (iVideoPlayerWrapper == null) {
            return;
        }
        iVideoPlayerWrapper.stopPlay(needClearLastImg);
    }

    public final void setVideoPlayerStatusListener(@NotNull Function2<? super Integer, ? super Bundle, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            OppoVideoPlayerWrapperImp oppoVideoPlayerWrapperImp = this.impl;
            if (oppoVideoPlayerWrapperImp != null && (oppoVideoPlayerWrapperImp instanceof OppoVideoPlayerWrapperImp)) {
                oppoVideoPlayerWrapperImp.setVideoPlayerStatusListener(listener);
            }
        } catch (NoClassDefFoundError e2) {
            e2.printStackTrace();
        }
        try {
            TxPlayerWrapperIml txPlayerWrapperIml = this.impl;
            if (txPlayerWrapperIml != null && (txPlayerWrapperIml instanceof TxPlayerWrapperIml)) {
                txPlayerWrapperIml.setVideoPlayerStatusListener(listener);
            }
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
        }
        try {
            OplusVideoPlayerWrapperImp oplusVideoPlayerWrapperImp = this.impl;
            if (oplusVideoPlayerWrapperImp != null && (oplusVideoPlayerWrapperImp instanceof OplusVideoPlayerWrapperImp)) {
                oplusVideoPlayerWrapperImp.setVideoPlayerStatusListener(listener);
            }
        } catch (NoClassDefFoundError e4) {
            e4.printStackTrace();
        }
        try {
            IVideoPlayerWrapper iVideoPlayerWrapper = this.impl;
            if (iVideoPlayerWrapper != null && (iVideoPlayerWrapper instanceof AndroidVideoPlayerWrapperImp)) {
                ((AndroidVideoPlayerWrapperImp) iVideoPlayerWrapper).setVideoPlayerStatusListener(listener);
            }
        } catch (NoClassDefFoundError e5) {
            e5.printStackTrace();
        }
    }
}
