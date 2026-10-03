package com.heytap.store.homemodule.model;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0016H&J\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\tH\u0016J\"\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H&J\u0006\u0010%\u001a\u00020\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006&"}, d2 = {"Lcom/heytap/store/homemodule/model/ISuperPlayerModel;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "isPause", "", "()Z", "setPause", "(Z)V", "isPlaying", "setPlaying", "loopPlay", "getLoopPlay", "setLoopPlay", "mute", "getMute", "setMute", "onDestroy", "", "onPausePlay", "onResumePlay", "onStopPlay", "pausePlay", "resumePlay", "setRequestAudioFocus", TypedValues.Custom.S_BOOLEAN, "startPlay", "videoView", "Landroid/view/View;", "pullUrl", "", "renderMode", "", "stopPlay", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ISuperPlayerModel {

    @NotNull
    private Context context;
    private boolean isPause;
    private boolean isPlaying;
    private boolean loopPlay;
    private boolean mute;

    public ISuperPlayerModel(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mute = true;
    }

    public static /* synthetic */ void startPlay$default(ISuperPlayerModel iSuperPlayerModel, View view, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlay");
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        iSuperPlayerModel.startPlay(view, str, i);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final boolean getLoopPlay() {
        return this.loopPlay;
    }

    public boolean getMute() {
        return this.mute;
    }

    /* JADX INFO: renamed from: isPause, reason: from getter */
    public final boolean getIsPause() {
        return this.isPause;
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public abstract void onDestroy();

    public abstract void onPausePlay();

    public abstract void onResumePlay();

    public abstract void onStopPlay();

    public final void pausePlay() {
        if (this.isPlaying && this.isPause) {
            onPausePlay();
            this.isPause = true;
        }
    }

    public final void resumePlay() {
        if (this.isPlaying && this.isPause) {
            onResumePlay();
            this.isPause = false;
        }
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setLoopPlay(boolean z) {
        this.loopPlay = z;
    }

    public void setMute(boolean z) {
        this.mute = z;
    }

    public final void setPause(boolean z) {
        this.isPause = z;
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public void setRequestAudioFocus(boolean z) {
    }

    public abstract void startPlay(@NotNull View videoView, @NotNull String pullUrl, int renderMode);

    public final void stopPlay() {
        if (this.isPlaying) {
            onStopPlay();
            this.isPlaying = false;
            this.isPause = false;
        }
    }
}
