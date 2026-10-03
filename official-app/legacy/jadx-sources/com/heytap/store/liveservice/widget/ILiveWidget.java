package com.heytap.store.liveservice.widget;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.heytap.store.liveservice.util.LiveStatusListener;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u0019\u001a\u00020\u0003H&¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/liveservice/widget/ILiveWidget;", "", "bindLiveViewParent", "", "parent", "Landroid/view/ViewGroup;", "getLikeLottieConfig", "Lcom/heytap/store/liveservice/widget/LottieConfig;", "getStreamLottieConfig", "onDestroy", "pause", "resume", "setBackgroundImage", "url", "", "setBackgroundScaleType", ParserTag.TAG_SCALE_TYPE, "Landroid/widget/ImageView$ScaleType;", "setLiveStatusListener", "listener", "Lcom/heytap/store/liveservice/util/LiveStatusListener;", "setMute", "mute", "", "startPlay", "stopPlay", "livevideo-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ILiveWidget {
    void bindLiveViewParent(@NotNull ViewGroup parent);

    @NotNull
    LottieConfig getLikeLottieConfig();

    @NotNull
    LottieConfig getStreamLottieConfig();

    void onDestroy();

    void pause();

    void resume();

    void setBackgroundImage(@NotNull String url);

    void setBackgroundScaleType(@NotNull ImageView.ScaleType scaleType);

    void setLiveStatusListener(@NotNull LiveStatusListener listener);

    void setMute(boolean mute);

    void startPlay(@NotNull String url);

    void stopPlay();
}
