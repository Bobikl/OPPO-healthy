package com.heytap.store.platform.videoplayer.base;

import android.view.View;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\rJ\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0003H&J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006("}, d2 = {"Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerWrapper;", "", "isLoop", "", "()Z", "setLoop", "(Z)V", "isPlaying", "()Ljava/lang/Boolean;", "setPlaying", "(Ljava/lang/Boolean;)V", "getDuration", "", "()Ljava/lang/Float;", "getPlayableDuration", "onDestroy", "", "pause", "resume", "seek", "progress", "", "setMute", "mute", "setPlayerView", "view", "Landroid/view/View;", "setPlayerViewWrapper", "playerViewWrapper", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerViewWrapper;", "setRenderMode", "mode", "", "setRequestAudioFocus", "focus", "startPlay", RunningPostureVideoActivity.VIDEO_PATH, "", "stopPlay", "needClearLastImg", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IVideoPlayerWrapper {
    @Nullable
    /* JADX INFO: renamed from: getDuration */
    Float mo5037getDuration();

    @Nullable
    /* JADX INFO: renamed from: getPlayableDuration */
    Float mo5038getPlayableDuration();

    boolean isLoop();

    @Nullable
    Boolean isPlaying();

    void onDestroy();

    void pause();

    void resume();

    void seek(long progress);

    void setLoop(boolean z);

    void setMute(boolean mute);

    void setPlayerView(@Nullable View view);

    void setPlayerViewWrapper(@NotNull IVideoPlayerViewWrapper playerViewWrapper);

    void setPlaying(@Nullable Boolean bool);

    void setRenderMode(int mode);

    void setRequestAudioFocus(boolean focus);

    void startPlay(@NotNull String videoUrl);

    void stopPlay(boolean needClearLastImg);
}
