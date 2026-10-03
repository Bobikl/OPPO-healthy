package com.heytap.store.homemodule.widget.sfxplayer;

import android.view.Surface;
import com.oplus.aiunit.vision.VideoSize;
import com.oplus.aiunit.vision.y4;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016¨\u0006\u001c"}, d2 = {"Lcom/heytap/store/homemodule/widget/sfxplayer/HomeItemPlayer;", "Lcom/oplus/aiunit/vision/y4;", "Lcom/oplus/aiunit/vision/izk;", "getVideoInfo", "", "initMediaPlayer", "pause", "prepareAsync", "release", "reset", "", "dataPath", "setDataSource", "", "looping", "setLooping", "isMute", "setMute", "onWhilePlaying", "setScreenOnWhilePlaying", "Landroid/view/Surface;", "surface", "setSurface", "start", Action.LIFE_CIRCLE_VALUE_STOP, "getPlayerType", "<init>", "()V", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0})
public class HomeItemPlayer extends y4 {
    public HomeItemPlayer() {
        super(null, 1, null);
    }

    @NotNull
    public String getPlayerType() {
        return "homeStoreVideoPlayer";
    }

    @NotNull
    public VideoSize getVideoInfo() {
        return new VideoSize(400, 800);
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void initMediaPlayer() {
    }

    public void pause() {
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void prepareAsync() {
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void release() {
    }

    public void reset() {
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setDataSource(@NotNull String dataPath) {
        Intrinsics.checkNotNullParameter(dataPath, "dataPath");
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setLooping(boolean looping) {
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setMute(boolean isMute) {
    }

    public void setScreenOnWhilePlaying(boolean onWhilePlaying) {
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void start() {
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void stop() {
    }
}
