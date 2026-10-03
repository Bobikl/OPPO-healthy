package com.heytap.health.videosdk;

import android.view.Surface;
import com.heytap.accessory.file.model.Constant;
import com.heytap.health.videosdk.config.OutConfig;
import com.heytap.health.videosdk.utils.FFMpegUtils;
import com.oplus.aiunit.vision.oea;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\bH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0019\u001a\u00020\u0003H&J\u001a\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&¨\u0006\""}, d2 = {"Lcom/heytap/health/videosdk/IPaly;", "", "cutting", "", "srcPath", "", Constant.DEST_PATH, "startTime", "", "endTime", "outConfig", "Lcom/heytap/health/videosdk/config/OutConfig;", oea.CALLBACK, "Lcom/heytap/health/videosdk/utils/FFMpegUtils$VideoCuttingInterface;", "getCurrTimestamp", "getPlayerState", "Lcom/heytap/health/videosdk/PlayerState;", "init", "iPalyListener", "Lcom/heytap/health/videosdk/IPalyListener;", "pause", "prepare", "path", "surface", "Landroid/view/Surface;", "resume", "seekTo", "seekTime", "nextStep", "Lcom/heytap/health/videosdk/Step;", "start", Action.LIFE_CIRCLE_VALUE_STOP, "surfaceDestroy", "surfaceReCreate", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IPaly {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void prepare$default(IPaly iPaly, String str, Surface surface, OutConfig outConfig, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            }
            if ((i & 4) != 0) {
                outConfig = null;
            }
            iPaly.prepare(str, surface, outConfig);
        }

        public static /* synthetic */ void seekTo$default(IPaly iPaly, long j2, Step step, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: seekTo");
            }
            if ((i & 2) != 0) {
                step = Step.UnknownStep.INSTANCE;
            }
            iPaly.seekTo(j2, step);
        }
    }

    void cutting(@NotNull String srcPath, @NotNull String destPath, long startTime, long endTime, @Nullable OutConfig outConfig, @NotNull FFMpegUtils.VideoCuttingInterface cb);

    long getCurrTimestamp();

    @NotNull
    PlayerState getPlayerState();

    void init(@Nullable IPalyListener iPalyListener);

    void pause();

    void prepare(@NotNull String path, @NotNull Surface surface, @Nullable OutConfig outConfig);

    void resume();

    void seekTo(long seekTime, @NotNull Step nextStep);

    void start();

    void stop();

    void surfaceDestroy();

    void surfaceReCreate(@NotNull Surface surface);
}
