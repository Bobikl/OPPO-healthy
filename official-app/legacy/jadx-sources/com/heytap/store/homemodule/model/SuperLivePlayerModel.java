package com.heytap.store.homemodule.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.heytap.store.platform.tools.LogUtils;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\u0012J \u0010(\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001bH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Lcom/heytap/store/homemodule/model/SuperLivePlayerModel;", "Lcom/heytap/store/homemodule/model/ISuperPlayerModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "livePlayer", "Lcom/tencent/rtmp/TXLivePlayer;", "getLivePlayer", "()Lcom/tencent/rtmp/TXLivePlayer;", "setLivePlayer", "(Lcom/tencent/rtmp/TXLivePlayer;)V", "liveView", "Lcom/tencent/rtmp/ui/TXCloudVideoView;", "getLiveView", "()Lcom/tencent/rtmp/ui/TXCloudVideoView;", "setLiveView", "(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V", "mLivePlayListener", "Lcom/heytap/store/homemodule/model/SuperLivePlayerModel$LivePlayListener;", "value", "", "mute", "getMute", "()Z", "setMute", "(Z)V", "getPlayType", "", "pullUrl", "", "handlePlayEvent", "", "code", "videoView", "onDestroy", "onPausePlay", "onResumePlay", "onStopPlay", "setLivePlayListener", "livePlayListener", "startPlay", "Landroid/view/View;", "renderMode", "LivePlayListener", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SuperLivePlayerModel extends ISuperPlayerModel {

    @NotNull
    private TXLivePlayer livePlayer;

    @Nullable
    private TXCloudVideoView liveView;

    @Nullable
    private LivePlayListener mLivePlayListener;
    private boolean mute;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/model/SuperLivePlayerModel$LivePlayListener;", "", "onNetStatus", "", "p0", "Landroid/os/Bundle;", "onPlayEvent", "", "p1", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface LivePlayListener {
        boolean onNetStatus(@Nullable Bundle p0);

        boolean onPlayEvent(int p0, @Nullable Bundle p1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLivePlayerModel(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.livePlayer = new TXLivePlayer(context);
        this.mute = true;
    }

    private final int getPlayType(String pullUrl) {
        if (StringsKt__StringsJVMKt.startsWith$default(pullUrl, "rtmp://", false, 2, null)) {
            return 0;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(pullUrl, "https://", false, 2, null) && StringsKt__StringsKt.contains$default((CharSequence) pullUrl, (CharSequence) ".flv", false, 2, (Object) null)) {
            return 1;
        }
        return (StringsKt__StringsJVMKt.startsWith$default(pullUrl, "https://", false, 2, null) && StringsKt__StringsKt.contains$default((CharSequence) pullUrl, (CharSequence) ".mp4", false, 2, (Object) null)) ? 4 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePlayEvent(int code, TXCloudVideoView videoView) {
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d(SuperPlayerModel.TAG, Intrinsics.stringPlus("code from txcloudvideoview is ", Integer.valueOf(code)));
        if (code == 3) {
            logUtils.d(SuperPlayerModel.TAG, "play begin");
            return;
        }
        if (code == 102) {
            logUtils.d(SuperPlayerModel.TAG, "play end");
            videoView.setVisibility(4);
        } else {
            if (code != 2301) {
                return;
            }
            logUtils.d(SuperPlayerModel.TAG, "err in getting live stream");
            videoView.setVisibility(4);
        }
    }

    @NotNull
    public final TXLivePlayer getLivePlayer() {
        return this.livePlayer;
    }

    @Nullable
    public final TXCloudVideoView getLiveView() {
        return this.liveView;
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public boolean getMute() {
        return this.mute;
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void onDestroy() {
        TXCloudVideoView tXCloudVideoView = this.liveView;
        if (tXCloudVideoView == null) {
            return;
        }
        tXCloudVideoView.onDestroy();
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void onPausePlay() {
        this.livePlayer.pause();
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void onResumePlay() {
        this.livePlayer.resume();
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void onStopPlay() {
        this.livePlayer.stopPlay(true);
        this.livePlayer.setPlayerView((TXCloudVideoView) null);
    }

    public final void setLivePlayListener(@Nullable LivePlayListener livePlayListener) {
        this.mLivePlayListener = livePlayListener;
    }

    public final void setLivePlayer(@NotNull TXLivePlayer tXLivePlayer) {
        Intrinsics.checkNotNullParameter(tXLivePlayer, "<set-?>");
        this.livePlayer = tXLivePlayer;
    }

    public final void setLiveView(@Nullable TXCloudVideoView tXCloudVideoView) {
        this.liveView = tXCloudVideoView;
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void setMute(boolean z) {
        this.mute = z;
        if (getIsPlaying()) {
            this.livePlayer.setMute(getMute());
        }
    }

    @Override // com.heytap.store.homemodule.model.ISuperPlayerModel
    public void startPlay(@NotNull final View videoView, @NotNull String pullUrl, int renderMode) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(pullUrl, "pullUrl");
        if (getIsPlaying() || TextUtils.isEmpty(pullUrl) || !(videoView instanceof TXCloudVideoView)) {
            return;
        }
        TXCloudVideoView tXCloudVideoView = (TXCloudVideoView) videoView;
        this.liveView = tXCloudVideoView;
        int playType = getPlayType(pullUrl);
        this.livePlayer.setPlayerView(tXCloudVideoView);
        this.livePlayer.startLivePlay(pullUrl, playType);
        this.livePlayer.setMute(getMute());
        this.livePlayer.setRenderMode(renderMode);
        setPlaying(true);
        this.livePlayer.setPlayListener(new ITXLivePlayListener() { // from class: com.heytap.store.homemodule.model.SuperLivePlayerModel.startPlay.1
            public void onNetStatus(@Nullable Bundle p0) {
                LivePlayListener livePlayListener = SuperLivePlayerModel.this.mLivePlayListener;
                if (livePlayListener == null) {
                    return;
                }
                livePlayListener.onNetStatus(p0);
            }

            public void onPlayEvent(int p0, @Nullable Bundle p1) {
                LivePlayListener livePlayListener = SuperLivePlayerModel.this.mLivePlayListener;
                if (livePlayListener == null ? false : livePlayListener.onPlayEvent(p0, p1)) {
                    return;
                }
                SuperLivePlayerModel.this.handlePlayEvent(p0, videoView);
            }
        });
    }
}
