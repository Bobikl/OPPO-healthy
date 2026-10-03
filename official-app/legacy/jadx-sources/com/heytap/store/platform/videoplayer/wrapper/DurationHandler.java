package com.heytap.store.platform.videoplayer.wrapper;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.VideoView;
import com.heytap.store.platform.tools.LogUtils;
import io.netty.util.internal.StringUtil;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\r¨\u0006("}, d2 = {"Lcom/heytap/store/platform/videoplayer/wrapper/DurationHandler;", "Landroid/os/Handler;", "playerRef", "Ljava/lang/ref/SoftReference;", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "(Ljava/lang/ref/SoftReference;)V", "bufferMs", "", "complete", "", "getComplete", "()Z", "setComplete", "(Z)V", "destroy", "getDestroy", "setDestroy", "first", "getFirst", "setFirst", "listenerRef", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView$ITXVodPlayListener;", "getListenerRef", "()Ljava/lang/ref/SoftReference;", "setListenerRef", "getPlayerRef", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "seekAction", "getSeekAction", "setSeekAction", "clearTask", "", "postNextTask", "setListener", "listener", "updateBuffer", "newBufferPercent", "androidplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DurationHandler extends Handler {
    private int bufferMs;
    private boolean complete;
    private boolean destroy;
    private boolean first;

    @Nullable
    private SoftReference<VideoPlayerView.ITXVodPlayListener> listenerRef;

    @NotNull
    private final SoftReference<VideoPlayerView> playerRef;

    @NotNull
    private final Runnable runnable;
    private boolean seekAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurationHandler(@NotNull SoftReference<VideoPlayerView> playerRef) {
        super(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(playerRef, "playerRef");
        this.playerRef = playerRef;
        this.first = true;
        this.runnable = new Runnable() { // from class: com.heytap.store.platform.videoplayer.wrapper.a
            @Override // java.lang.Runnable
            public final void run() {
                DurationHandler.m5064runnable$lambda3(this.i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runnable$lambda-3, reason: not valid java name */
    public static final void m5064runnable$lambda3(DurationHandler this$0) {
        SoftReference<VideoPlayerView.ITXVodPlayListener> listenerRef;
        VideoPlayerView.ITXVodPlayListener iTXVodPlayListener;
        int pauseProgress;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.seekAction) {
            this$0.clearTask();
            return;
        }
        VideoPlayerView videoPlayerView = this$0.playerRef.get();
        if (videoPlayerView == null || (listenerRef = this$0.getListenerRef()) == null || (iTXVodPlayListener = listenerRef.get()) == null) {
            return;
        }
        VideoView mediaPlayer = videoPlayerView.getMediaPlayer();
        int duration = mediaPlayer.getDuration();
        if (this$0.getComplete()) {
            pauseProgress = duration;
        } else {
            pauseProgress = videoPlayerView.getPauseProgress() != 0 ? videoPlayerView.getPauseProgress() : mediaPlayer.getCurrentPosition();
        }
        this$0.bufferMs = (mediaPlayer.getBufferPercentage() * duration) / 100;
        Bundle bundle = new Bundle();
        bundle.putInt(VideoPlayerConstants.EVT_PLAYABLE_DURATION_MS, this$0.bufferMs);
        bundle.putInt(VideoPlayerConstants.EVT_PLAY_PROGRESS_MS, pauseProgress);
        bundle.putInt(VideoPlayerConstants.EVT_PLAY_DURATION_MS, duration);
        Context context = videoPlayerView.getContext();
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            this$0.setDestroy(true);
        }
        LogUtils.INSTANCE.d("setVodListener", "oplus bufferMs = " + this$0.bufferMs + " totalMs is " + duration + " progressMs is " + pauseProgress + StringUtil.SPACE);
        iTXVodPlayListener.onPlayEvent(videoPlayerView, 100, bundle);
        this$0.clearTask();
        if (this$0.getComplete() || this$0.getDestroy()) {
            return;
        }
        this$0.postNextTask();
    }

    public final void clearTask() {
        removeCallbacksAndMessages(null);
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final boolean getDestroy() {
        return this.destroy;
    }

    public final boolean getFirst() {
        return this.first;
    }

    @Nullable
    public final SoftReference<VideoPlayerView.ITXVodPlayListener> getListenerRef() {
        return this.listenerRef;
    }

    @NotNull
    public final SoftReference<VideoPlayerView> getPlayerRef() {
        return this.playerRef;
    }

    @NotNull
    public final Runnable getRunnable() {
        return this.runnable;
    }

    public final boolean getSeekAction() {
        return this.seekAction;
    }

    public final void postNextTask() {
        postDelayed(this.runnable, 1000L);
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setDestroy(boolean z) {
        this.destroy = z;
    }

    public final void setFirst(boolean z) {
        this.first = z;
    }

    public final void setListener(@NotNull VideoPlayerView.ITXVodPlayListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listenerRef = new SoftReference<>(listener);
    }

    public final void setListenerRef(@Nullable SoftReference<VideoPlayerView.ITXVodPlayListener> softReference) {
        this.listenerRef = softReference;
    }

    public final void setSeekAction(boolean z) {
        this.seekAction = z;
    }

    public final void updateBuffer(int newBufferPercent) {
        VideoPlayerView videoPlayerView = this.playerRef.get();
        if (videoPlayerView == null) {
            return;
        }
        this.bufferMs = (videoPlayerView.getMediaPlayer().getDuration() * newBufferPercent) / 100;
        postNextTask();
    }
}
