package com.heytap.store.platform.videoplayer.base;

import android.content.Context;
import android.content.Intent;
import com.heytap.store.apm.PageTrackBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerListener;", "", "onDuration", "", "durationMs", "", "onStartFullScreen", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onVideoStop", "process", PageTrackBean.TOTAL_TIME, "videoPlay", "isPlay", "", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IVideoPlayerListener {
    void onDuration(int durationMs);

    void onStartFullScreen(@NotNull Context context, @NotNull Intent intent);

    void onVideoStop(int process, int totalTime);

    void videoPlay(boolean isPlay);
}
