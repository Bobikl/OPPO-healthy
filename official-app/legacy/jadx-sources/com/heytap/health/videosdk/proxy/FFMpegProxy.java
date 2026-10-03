package com.heytap.health.videosdk.proxy;

import android.view.Surface;
import com.heytap.accessory.file.model.Constant;
import com.heytap.health.videosdk.IPaly;
import com.heytap.health.videosdk.IPalyListener;
import com.heytap.health.videosdk.PlayerState;
import com.heytap.health.videosdk.Step;
import com.heytap.health.videosdk.config.OutConfig;
import com.heytap.health.videosdk.utils.FFMpegUtils;
import com.heytap.health.videosdk.utils.LogHelper;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.jzk;
import com.oplus.aiunit.vision.oea;
import com.oplus.channel.client.data.Action;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0011\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0011\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0016JC\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 J\t\u0010\u001a\u001a\u00020\u0006H\u0082 J\u0011\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J+\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0082 J\u0011\u0010!\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u0011\u0010\"\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u0019\u0010#\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0082 J\u0011\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u0011\u0010&\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u0011\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u0019\u0010(\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0082 J\b\u0010)\u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0002J0\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\u0004H\u0002J\u0010\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\u0016H\u0002J\b\u00105\u001a\u00020\fH\u0016J\"\u00106\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u00107\u001a\u00020\fH\u0016J\u0018\u00108\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00062\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020\fH\u0016J\b\u0010=\u001a\u00020\fH\u0016J\u0010\u0010>\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/heytap/health/videosdk/proxy/FFMpegProxy;", "Lcom/heytap/health/videosdk/IPaly;", "()V", "TAG", "", "nativeManager", "", "outConfig", "Lcom/heytap/health/videosdk/config/OutConfig;", "palyListener", "Lcom/heytap/health/videosdk/IPalyListener;", "cutting", "", "srcPath", Constant.DEST_PATH, "startTime", "endTime", oea.CALLBACK, "Lcom/heytap/health/videosdk/utils/FFMpegUtils$VideoCuttingInterface;", "getCurrTimestamp", "getPlayerState", "Lcom/heytap/health/videosdk/PlayerState;", "", "init", "iPalyListener", "nativeCutting", "nativeInit", "nativePause", "nativePrepare", "", "path", "surface", "Landroid/view/Surface;", "nativeRelease", "nativeResume", "nativeSeekTo", "seekTime", "nativeStart", "nativeStop", "nativeSurfaceDestroy", "nativeSurfaceReCreate", "onNativePalyComplete", "onNativePalyProgress", ClickApiEntity.TIME, "", "onNativeVideoConfig", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "duration", "fps", "codecName", "onPlayError", "code", "pause", "prepare", "resume", "seekTo", "nextStep", "Lcom/heytap/health/videosdk/Step;", "start", Action.LIFE_CIRCLE_VALUE_STOP, "surfaceDestroy", "surfaceReCreate", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FFMpegProxy implements IPaly {

    @NotNull
    private final String TAG;
    private long nativeManager;

    @Nullable
    private OutConfig outConfig;

    @Nullable
    private IPalyListener palyListener;

    public FFMpegProxy() {
        System.loadLibrary(jzk.SO_NAME_VIDEO_SDK);
        this.TAG = "FFMpegProxy";
        this.nativeManager = -1L;
    }

    private final native long getCurrTimestamp(long nativeManager);

    private final native int getPlayerState(long nativeManager);

    private final native void nativeCutting(long nativeManager, String srcPath, String destPath, long startTime, long endTime, OutConfig outConfig, FFMpegUtils.VideoCuttingInterface cb);

    private final native long nativeInit();

    private final native void nativePause(long nativeManager);

    private final native boolean nativePrepare(long nativeManager, String path, Surface surface, OutConfig outConfig);

    private final native void nativeRelease(long nativeManager);

    private final native void nativeResume(long nativeManager);

    private final native boolean nativeSeekTo(long nativeManager, long seekTime);

    private final native void nativeStart(long nativeManager);

    private final native void nativeStop(long nativeManager);

    private final native void nativeSurfaceDestroy(long nativeManager);

    private final native void nativeSurfaceReCreate(long nativeManager, Surface surface);

    private final void onNativePalyComplete() {
        LogHelper.INSTANCE.i(this.TAG, "onNativePalyComplete: ");
        IPalyListener iPalyListener = this.palyListener;
        if (iPalyListener != null) {
            iPalyListener.onPalyComplete();
        }
    }

    private final void onNativePalyProgress(double time) {
        LogHelper.INSTANCE.d(this.TAG, "onNativePalyProgress: " + time);
        IPalyListener iPalyListener = this.palyListener;
        if (iPalyListener != null) {
            iPalyListener.onPalyProgress(time);
        }
    }

    private final void onNativeVideoConfig(int width, int height, double duration, double fps, String codecName) {
        LogHelper.INSTANCE.i(this.TAG, "onNativeVideoConfig: " + width + '*' + height + " duration:" + duration + " fps:" + fps + " codecName:" + codecName);
        IPalyListener iPalyListener = this.palyListener;
        if (iPalyListener != null) {
            iPalyListener.onVideoConfig(width, height, duration, fps);
        }
    }

    private final void onPlayError(int code) {
        LogHelper.INSTANCE.e(this.TAG, "onPlayError code:" + code);
        IPalyListener iPalyListener = this.palyListener;
        if (iPalyListener != null) {
            iPalyListener.onPlayError(code);
        }
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void cutting(@NotNull String srcPath, @NotNull String destPath, long startTime, long endTime, @Nullable OutConfig outConfig, @NotNull FFMpegUtils.VideoCuttingInterface cb) {
        Intrinsics.checkNotNullParameter(srcPath, "srcPath");
        Intrinsics.checkNotNullParameter(destPath, "destPath");
        Intrinsics.checkNotNullParameter(cb, "cb");
        nativeCutting(this.nativeManager, srcPath, destPath, startTime, endTime, outConfig, cb);
    }

    @Override // com.heytap.health.videosdk.IPaly
    public long getCurrTimestamp() {
        return getCurrTimestamp(this.nativeManager);
    }

    @Override // com.heytap.health.videosdk.IPaly
    @NotNull
    public PlayerState getPlayerState() {
        return PlayerState.INSTANCE.fromState(getPlayerState(this.nativeManager));
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void init(@Nullable IPalyListener iPalyListener) {
        this.palyListener = iPalyListener;
        this.nativeManager = nativeInit();
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void pause() {
        nativePause(this.nativeManager);
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void prepare(@NotNull String path, @NotNull Surface surface, @Nullable OutConfig outConfig) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (path.length() == 0) {
            LogHelper.INSTANCE.e(this.TAG, "prepare path is empty");
        } else {
            this.outConfig = outConfig;
            nativePrepare(this.nativeManager, path, surface, outConfig);
        }
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void resume() {
        nativeResume(this.nativeManager);
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void seekTo(long seekTime, @NotNull Step nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        nativeSeekTo(this.nativeManager, seekTime);
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void start() {
        nativeStart(this.nativeManager);
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void stop() {
        nativeStop(this.nativeManager);
        nativeRelease(this.nativeManager);
        this.palyListener = null;
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void surfaceDestroy() {
        nativeSurfaceDestroy(this.nativeManager);
    }

    @Override // com.heytap.health.videosdk.IPaly
    public void surfaceReCreate(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        nativeSurfaceReCreate(this.nativeManager, surface);
    }
}
