package com.heytap.store.platform.videoplayer.wrapper;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerConstants;", "", "()V", VideoPlayerConstants.EVT_PLAYABLE_DURATION_MS, "", VideoPlayerConstants.EVT_PLAY_DURATION_MS, VideoPlayerConstants.EVT_PLAY_PROGRESS_MS, "PLAY_ERR_NET_DISCONNECT", "", "PLAY_EVT_CONNECT_SUCC", "PLAY_EVT_PLAY_BEGIN", "PLAY_EVT_PLAY_END", "PLAY_EVT_PLAY_LOADING", "PLAY_EVT_PLAY_PROGRESS", "PLAY_EVT_RCV_FIRST_I_FRAME", "PLAY_EVT_VOD_LOADING_END", "PLAY_WARNING_RECONNECT", "PUSH_WARNING_NET_BUSY", "PUSH_WARNING_RECONNECT", "RENDER_MODE_ADJUST_RESOLUTION", "RENDER_MODE_FULL_FILL_SCREEN", "RENDER_ROTATION_LANDSCAPE", "RENDER_ROTATION_PORTRAIT", "androidplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoPlayerConstants {

    @NotNull
    public static final String EVT_PLAYABLE_DURATION_MS = "EVT_PLAYABLE_DURATION_MS";

    @NotNull
    public static final String EVT_PLAY_DURATION_MS = "EVT_PLAY_DURATION_MS";

    @NotNull
    public static final String EVT_PLAY_PROGRESS_MS = "EVT_PLAY_PROGRESS_MS";

    @NotNull
    public static final VideoPlayerConstants INSTANCE = new VideoPlayerConstants();
    public static final int PLAY_ERR_NET_DISCONNECT = 2301;
    public static final int PLAY_EVT_CONNECT_SUCC = 703;
    public static final int PLAY_EVT_PLAY_BEGIN = 3;
    public static final int PLAY_EVT_PLAY_END = 102;
    public static final int PLAY_EVT_PLAY_LOADING = 103;
    public static final int PLAY_EVT_PLAY_PROGRESS = 100;
    public static final int PLAY_EVT_RCV_FIRST_I_FRAME = 105;
    public static final int PLAY_EVT_VOD_LOADING_END = 104;
    public static final int PLAY_WARNING_RECONNECT = 2002;
    public static final int PUSH_WARNING_NET_BUSY = 1101;
    public static final int PUSH_WARNING_RECONNECT = 1102;
    public static final int RENDER_MODE_ADJUST_RESOLUTION = 1;
    public static final int RENDER_MODE_FULL_FILL_SCREEN = 0;
    public static final int RENDER_ROTATION_LANDSCAPE = 270;
    public static final int RENDER_ROTATION_PORTRAIT = 0;

    private VideoPlayerConstants() {
    }
}
