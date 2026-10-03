package com.heytap.store.business.component.utils.video;

import android.content.Context;
import android.os.Bundle;
import com.heytap.log.consts.BusinessType;
import com.heytap.store.business.component.adapter.OStoreBannerAction;
import com.heytap.store.business.component.data.VideoState;
import com.heytap.store.business.component.entity.BannerDetail;
import com.heytap.store.business.component.widget.VideoCardView;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerStatusListener;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerWrapper;
import com.oplus.channel.client.data.Action;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u001c\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010'\u001a\u00020\u0015J\u0006\u0010(\u001a\u00020\u0015J\u000e\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020&J\u000e\u0010.\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+J\u000e\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0013J\u0006\u00101\u001a\u00020\u0015J\u0006\u00102\u001a\u00020\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\\\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/heytap/store/business/component/utils/video/OStoreVideoPlayOperator;", "", "context", "Landroid/content/Context;", "videoState", "Lcom/heytap/store/business/component/data/VideoState;", "mData", "Lcom/heytap/store/business/component/entity/BannerDetail;", "(Landroid/content/Context;Lcom/heytap/store/business/component/data/VideoState;Lcom/heytap/store/business/component/entity/BannerDetail;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getMData", "()Lcom/heytap/store/business/component/entity/BannerDetail;", "setMData", "(Lcom/heytap/store/business/component/entity/BannerDetail;)V", "callback", "Lkotlin/Function3;", "", "Landroid/os/Bundle;", "", "playEventCallback", "getPlayEventCallback", "()Lkotlin/jvm/functions/Function3;", "setPlayEventCallback", "(Lkotlin/jvm/functions/Function3;)V", "playListener", "com/heytap/store/business/component/utils/video/OStoreVideoPlayOperator$playListener$1", "Lcom/heytap/store/business/component/utils/video/OStoreVideoPlayOperator$playListener$1;", "getVideoState", "()Lcom/heytap/store/business/component/data/VideoState;", "setVideoState", "(Lcom/heytap/store/business/component/data/VideoState;)V", "vodPlayer", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerWrapper;", "weakLayoutManager", "Ljava/lang/ref/WeakReference;", "Lcom/heytap/store/business/component/adapter/OStoreBannerAction;", "destroy", "pause", BusinessType.PLAY, "playView", "Lcom/heytap/store/business/component/widget/VideoCardView;", "setLayoutManager", ParserTag.LAYOUT_MANAGER, "setPlayView", "setRenderMode", "renderMode", "startPlay", Action.LIFE_CIRCLE_VALUE_STOP, "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreVideoPlayOperator {

    @NotNull
    private Context context;

    @Nullable
    private BannerDetail mData;

    @Nullable
    private Function3<? super Integer, ? super Integer, ? super Bundle, Unit> playEventCallback;

    @NotNull
    private OStoreVideoPlayOperator$playListener$1 playListener;

    @NotNull
    private VideoState videoState;

    @Nullable
    private VideoPlayerWrapper vodPlayer;

    @Nullable
    private WeakReference<OStoreBannerAction> weakLayoutManager;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.heytap.store.business.component.utils.video.OStoreVideoPlayOperator$playListener$1] */
    public OStoreVideoPlayOperator(@NotNull Context context, @NotNull VideoState videoState, @Nullable BannerDetail bannerDetail) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoState, "videoState");
        this.context = context;
        this.videoState = videoState;
        this.mData = bannerDetail;
        this.playListener = new VideoPlayerStatusListener() { // from class: com.heytap.store.business.component.utils.video.OStoreVideoPlayOperator$playListener$1
            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerStatusListener
            public void onPlayEventComing(int status, @Nullable Bundle p2) {
                OStoreBannerAction oStoreBannerAction;
                if (status == 102) {
                    this.this$0.getVideoState().setPlayState(VideoState.PlayState.PAUSE);
                    WeakReference weakReference = this.this$0.weakLayoutManager;
                    if (weakReference != null && (oStoreBannerAction = (OStoreBannerAction) weakReference.get()) != null) {
                        oStoreBannerAction.resume();
                    }
                }
                Function3<Integer, Integer, Bundle, Unit> playEventCallback = this.this$0.getPlayEventCallback();
                if (playEventCallback == null) {
                    return;
                }
                playEventCallback.invoke(Integer.valueOf(this.this$0.getVideoState().getPosition()), Integer.valueOf(status), p2);
            }
        };
        String url = this.videoState.getUrl();
        if (url == null || url.length() == 0) {
            return;
        }
        VideoPlayerWrapper videoPlayerWrapper = new VideoPlayerWrapper(this.context);
        videoPlayerWrapper.setMute(true);
        videoPlayerWrapper.setVideoPlayerStatusListener(this.playListener);
        this.vodPlayer = videoPlayerWrapper;
    }

    public final void destroy() {
        VideoPlayerWrapper videoPlayerWrapper = this.vodPlayer;
        if (videoPlayerWrapper != null) {
            videoPlayerWrapper.onDestroy();
        }
        setPlayEventCallback(null);
        this.weakLayoutManager = null;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final BannerDetail getMData() {
        return this.mData;
    }

    @Nullable
    public final Function3<Integer, Integer, Bundle, Unit> getPlayEventCallback() {
        return this.playEventCallback;
    }

    @NotNull
    public final VideoState getVideoState() {
        return this.videoState;
    }

    public final void pause() {
        VideoPlayerWrapper videoPlayerWrapper;
        OStoreBannerAction oStoreBannerAction;
        WeakReference<OStoreBannerAction> weakReference = this.weakLayoutManager;
        if (weakReference != null && (oStoreBannerAction = weakReference.get()) != null) {
            oStoreBannerAction.resume();
        }
        String url = this.videoState.getUrl();
        if (url == null || url.length() == 0) {
            return;
        }
        if (this.videoState.getPlayState() == VideoState.PlayState.PLAYING && (videoPlayerWrapper = this.vodPlayer) != null) {
            videoPlayerWrapper.pause();
        }
        this.videoState.setPlayState(VideoState.PlayState.PAUSE);
    }

    public final void play(@NotNull VideoCardView playView) {
        VideoPlayerWrapper videoPlayerWrapper;
        OStoreBannerAction oStoreBannerAction;
        OStoreBannerAction oStoreBannerAction2;
        Intrinsics.checkNotNullParameter(playView, "playView");
        String url = this.videoState.getUrl();
        if (url == null || url.length() == 0) {
            WeakReference<OStoreBannerAction> weakReference = this.weakLayoutManager;
            if (weakReference == null || (oStoreBannerAction2 = weakReference.get()) == null) {
                return;
            }
            oStoreBannerAction2.resume();
            return;
        }
        WeakReference<OStoreBannerAction> weakReference2 = this.weakLayoutManager;
        if (weakReference2 != null && (oStoreBannerAction = weakReference2.get()) != null) {
            oStoreBannerAction.pause();
        }
        VideoPlayerWrapper videoPlayerWrapper2 = this.vodPlayer;
        if (videoPlayerWrapper2 != null) {
            videoPlayerWrapper2.setPlayerViewWrapper(playView.getVideoViewWrapper());
        }
        this.videoState.setPlayView(playView);
        playView.startPlay();
        if (this.videoState.getPlayState() == VideoState.PlayState.STOP) {
            String url2 = this.videoState.getUrl();
            if (url2 != null) {
                VideoPlayerWrapper videoPlayerWrapper3 = this.vodPlayer;
                if (videoPlayerWrapper3 != null) {
                    videoPlayerWrapper3.setRenderMode(1);
                }
                VideoPlayerWrapper videoPlayerWrapper4 = this.vodPlayer;
                if (videoPlayerWrapper4 != null) {
                    videoPlayerWrapper4.startPlay(url2);
                }
            }
        } else if (this.videoState.getPlayState() == VideoState.PlayState.PAUSE && (videoPlayerWrapper = this.vodPlayer) != null) {
            videoPlayerWrapper.resume();
        }
        this.videoState.setPlayState(VideoState.PlayState.PLAYING);
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setLayoutManager(@NotNull OStoreBannerAction layoutManager) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        String url = this.videoState.getUrl();
        if (url == null || url.length() == 0) {
            return;
        }
        this.weakLayoutManager = new WeakReference<>(layoutManager);
    }

    public final void setMData(@Nullable BannerDetail bannerDetail) {
        this.mData = bannerDetail;
    }

    public final void setPlayEventCallback(@Nullable Function3<? super Integer, ? super Integer, ? super Bundle, Unit> function3) {
        String url = this.videoState.getUrl();
        if (url == null || url.length() == 0) {
            return;
        }
        this.playEventCallback = function3;
    }

    public final void setPlayView(@NotNull VideoCardView playView) {
        Intrinsics.checkNotNullParameter(playView, "playView");
        if (this.videoState.getPlayView() == playView) {
            return;
        }
        this.videoState.setPlayView(playView);
        VideoPlayerWrapper videoPlayerWrapper = this.vodPlayer;
        if (videoPlayerWrapper != null) {
            videoPlayerWrapper.setPlayerViewWrapper(playView.getVideoViewWrapper());
        }
        VideoPlayerWrapper videoPlayerWrapper2 = this.vodPlayer;
        if (videoPlayerWrapper2 == null) {
            return;
        }
        videoPlayerWrapper2.setRenderMode(1);
    }

    public final void setRenderMode(int renderMode) {
        VideoPlayerWrapper videoPlayerWrapper = this.vodPlayer;
        if (videoPlayerWrapper == null) {
            return;
        }
        videoPlayerWrapper.setRenderMode(renderMode);
    }

    public final void setVideoState(@NotNull VideoState videoState) {
        Intrinsics.checkNotNullParameter(videoState, "<set-?>");
        this.videoState = videoState;
    }

    public final void startPlay() {
        VideoPlayerWrapper videoPlayerWrapper;
        String url = this.videoState.getUrl();
        if (url != null && (videoPlayerWrapper = this.vodPlayer) != null) {
            videoPlayerWrapper.startPlay(url);
        }
        this.videoState.setPlayState(VideoState.PlayState.PLAYING);
    }

    public final void stop() {
        OStoreBannerAction oStoreBannerAction;
        WeakReference<OStoreBannerAction> weakReference = this.weakLayoutManager;
        if (weakReference != null && (oStoreBannerAction = weakReference.get()) != null) {
            oStoreBannerAction.resume();
        }
        String url = this.videoState.getUrl();
        if (url == null || url.length() == 0) {
            return;
        }
        VideoPlayerWrapper videoPlayerWrapper = this.vodPlayer;
        if (videoPlayerWrapper != null) {
            videoPlayerWrapper.stopPlay(false);
        }
        VideoCardView playView = this.videoState.getPlayView();
        if (playView != null) {
            playView.onPause();
        }
        this.videoState.setPlayState(VideoState.PlayState.STOP);
    }

    public /* synthetic */ OStoreVideoPlayOperator(Context context, VideoState videoState, BannerDetail bannerDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, videoState, (i & 4) != 0 ? null : bannerDetail);
    }
}
