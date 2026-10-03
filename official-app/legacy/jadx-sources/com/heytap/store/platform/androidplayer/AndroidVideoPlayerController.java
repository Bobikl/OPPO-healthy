package com.heytap.store.platform.androidplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.heytap.store.base.core.connectivity.ConnectivityManagerProxy;
import com.heytap.store.base.core.connectivity.NetworkMonitor;
import com.heytap.store.base.core.connectivity.NetworkObserver;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.base.core.util.RxBus;
import com.heytap.store.base.core.util.TimeUtil;
import com.heytap.store.base.core.util.ToastUtil;
import com.heytap.store.platform.androidplayer.AndroidVideoPlayerController;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.platform.videoplayer.VideoFullScreenPlayActivity;
import com.heytap.store.platform.videoplayer.base.ILivePlayerController;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerController;
import com.heytap.store.platform.videoplayer.base.IVideoPlayerListener;
import com.heytap.store.platform.videoplayer.bean.VideoControlBean;
import com.heytap.store.platform.videoplayer.bean.VideoPlayerProductDetailDataBeanKt;
import com.heytap.store.platform.videoplayer.impl.VideoPlayManager;
import com.heytap.store.platform.videoplayer.util.LowMachineUtil;
import com.heytap.store.platform.videoplayer.view.VideoPlayerLiteVideoCardPlayStateButton;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerConstants;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.kbd;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0014\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u00100\u001a\u00020\b\u0012\u0006\u00103\u001a\u000202\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0017J\b\u0010 \u001a\u00020\u0003H\u0017J\b\u0010!\u001a\u00020\u0003H\u0017J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0005H\u0016J \u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'H\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020'H\u0016R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00101R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010DR\u0014\u0010L\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010DR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010TR\u0016\u0010X\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010Y\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010TR\"\u0010Z\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010_\u001a\u00020'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010V\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010e\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010T\u001a\u0004\bk\u0010\\\"\u0004\bl\u0010^R\"\u0010m\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010T\u001a\u0004\bn\u0010\\\"\u0004\bo\u0010^R(\u0010q\u001a\b\u0012\u0002\b\u0003\u0018\u00010p8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010w\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010T\u001a\u0004\bw\u0010\\\"\u0004\bx\u0010^R\"\u0010y\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010T\u001a\u0004\bz\u0010\\\"\u0004\b{\u0010^R\"\u0010|\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b|\u0010T\u001a\u0004\b|\u0010\\\"\u0004\b}\u0010^R\"\u0010~\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b~\u0010T\u001a\u0004\b~\u0010\\\"\u0004\b\u007f\u0010^R\u0018\u0010\u0080\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010TR\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010TR\u0018\u0010\u0085\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010TR\u0018\u0010\u0086\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010TR&\u0010\u0087\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010T\u001a\u0005\b\u0087\u0001\u0010\\\"\u0005\b\u0088\u0001\u0010^R\u001a\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R#\u0010\u008e\u0001\u001a\f\u0012\u0005\u0012\u00030\u008d\u0001\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R(\u0010\u0094\u0001\u001a\u00020\n2\u0007\u0010\u0093\u0001\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0094\u0001\u0010\\\"\u0005\b\u0095\u0001\u0010^¨\u0006\u0098\u0001"}, d2 = {"Lcom/heytap/store/platform/androidplayer/AndroidVideoPlayerController;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerController;", "", "initVideoView", "", "visibility", "setVideoWidgetVisibility", "Landroid/view/View;", "view", "", "isVisibility", "keycode", "isStreamMute", "audioAdjustment", "getNetStatus", "initVideoViewOnClick", "setRotationByActivity", "onAttachNetworkObserver", "onDestroyNetworkObserver", "com/heytap/store/platform/androidplayer/AndroidVideoPlayerController$createNetworkObserver$1", "createNetworkObserver", "()Lcom/heytap/store/platform/androidplayer/AndroidVideoPlayerController$createNetworkObserver$1;", "initRxBus", "destroyRxBus", "status", "Landroid/os/Bundle;", "bundle", "setLiveNetStatus", "setOtherWidgetVisibility", "isShowPause", "onPause", "onResume", "onDestroy", "isPlay", "videoPlayStatus", ClickApiEntity.PLAY_VIDEO, "progress", "setVideoProgress", "", "url", "previewImage", "shopWindowAdUrl", "setContent", "color", "setSeekControlBg", "ratio", "setPlayerRatio", "itemView", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerListener;", "listener", "Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerListener;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "videoRootView", "Landroid/view/SurfaceView;", "videoParentView", "Landroid/view/SurfaceView;", "Landroid/widget/ImageView;", "simpleDraweeView", "Landroid/widget/ImageView;", "simpleDraweeView2", "videoPlayBtn", "Landroid/widget/TextView;", "videoCurrentDuration", "Landroid/widget/TextView;", "videoTotalDuration", "videoAudioAdjustment", "videoFullScreen", "Landroidx/appcompat/widget/AppCompatSeekBar;", "videoSeek", "Landroidx/appcompat/widget/AppCompatSeekBar;", "Lcom/heytap/store/platform/videoplayer/view/VideoPlayerLiteVideoCardPlayStateButton;", "progressBar", "Lcom/heytap/store/platform/videoplayer/view/VideoPlayerLiteVideoCardPlayStateButton;", "isPause", "Z", RunningPostureVideoActivity.VIDEO_PATH, "Ljava/lang/String;", "onStartTrackingTouch", "isFullScreen", "haveBeenFullScreen", ParserTag.AUTO_PLAY, "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "controlType", "getControlType", "()Ljava/lang/String;", "setControlType", "(Ljava/lang/String;)V", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "androidVodPlayer", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "getAndroidVodPlayer", "()Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "setAndroidVodPlayer", "(Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;)V", "isPlaying", "setPlaying", "hasSupportLowMachine", "getHasSupportLowMachine", "setHasSupportLowMachine", "Ljava/lang/Class;", "playActivityClass", "Ljava/lang/Class;", "getPlayActivityClass", "()Ljava/lang/Class;", "setPlayActivityClass", "(Ljava/lang/Class;)V", "isFullScreenForActivity", "setFullScreenForActivity", "stopPlayAfterEnd", "getStopPlayAfterEnd", "setStopPlayAfterEnd", "isPlayOnGallery", "setPlayOnGallery", "isPlayOnGalleryIsShow", "setPlayOnGalleryIsShow", "mNetNotAvailable", "Lcom/heytap/store/base/core/connectivity/ConnectivityManagerProxy$SimpleNetworkInfo;", "simpleNetworkInfo", "Lcom/heytap/store/base/core/connectivity/ConnectivityManagerProxy$SimpleNetworkInfo;", "mIsShowToast", "mWifiIsWork", "isSetMute", "isToast", "setToast", "Lcom/heytap/store/base/core/connectivity/NetworkObserver;", "mNetworkObserver", "Lcom/heytap/store/base/core/connectivity/NetworkObserver;", "Lcom/oplus/aiunit/vision/kbd;", "Lcom/heytap/store/base/core/util/RxBus$Event;", "obServable1", "Lcom/oplus/aiunit/vision/kbd;", "Lcom/oplus/aiunit/vision/cv5;", "subscription1", "Lcom/oplus/aiunit/vision/cv5;", "value", "isLoop", "setLoop", "<init>", "(Landroid/view/View;Landroid/content/Context;Lcom/heytap/store/platform/videoplayer/base/IVideoPlayerListener;)V", "androidplayer_release"}, k = 1, mv = {1, 6, 0})
public final class AndroidVideoPlayerController implements LifecycleObserver, IVideoPlayerController {

    @Nullable
    private VideoPlayerView androidVodPlayer;
    private boolean autoPlay;

    @NotNull
    private Context context;

    @NotNull
    private String controlType;

    @NotNull
    private final Handler handler;
    private boolean hasSupportLowMachine;
    private boolean haveBeenFullScreen;
    private boolean isFullScreen;
    private boolean isFullScreenForActivity;
    private boolean isPause;
    private boolean isPlayOnGallery;
    private boolean isPlayOnGalleryIsShow;
    private boolean isPlaying;
    private boolean isSetMute;
    private boolean isToast;

    @NotNull
    private View itemView;

    @Nullable
    private final IVideoPlayerListener listener;
    private boolean mIsShowToast;
    private boolean mNetNotAvailable;
    private NetworkObserver mNetworkObserver;
    private boolean mWifiIsWork;

    @Nullable
    private kbd<RxBus.Event> obServable1;
    private boolean onStartTrackingTouch;

    @Nullable
    private Class<?> playActivityClass;

    @NotNull
    private final VideoPlayerLiteVideoCardPlayStateButton progressBar;

    @NotNull
    private final Runnable runnable;

    @NotNull
    private final ImageView simpleDraweeView;

    @NotNull
    private final ImageView simpleDraweeView2;

    @Nullable
    private ConnectivityManagerProxy.SimpleNetworkInfo simpleNetworkInfo;
    private boolean stopPlayAfterEnd;

    @Nullable
    private cv5 subscription1;

    @NotNull
    private final ImageView videoAudioAdjustment;

    @NotNull
    private final TextView videoCurrentDuration;

    @NotNull
    private final ImageView videoFullScreen;

    @NotNull
    private SurfaceView videoParentView;

    @NotNull
    private final ImageView videoPlayBtn;

    @NotNull
    private final View videoRootView;

    @NotNull
    private final AppCompatSeekBar videoSeek;

    @NotNull
    private final TextView videoTotalDuration;

    @NotNull
    private String videoUrl;

    public AndroidVideoPlayerController(@NotNull View itemView, @NotNull Context context, @Nullable IVideoPlayerListener iVideoPlayerListener) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemView = itemView;
        this.context = context;
        this.listener = iVideoPlayerListener;
        this.handler = new Handler(Looper.getMainLooper());
        this.runnable = new Runnable() { // from class: com.oplus.aiunit.vision.m30
            @Override // java.lang.Runnable
            public final void run() {
                AndroidVideoPlayerController.m5035runnable$lambda0(this.i);
            }
        };
        View viewFindViewById = this.itemView.findViewById(R.id.gallery_video_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.gallery_video_layout)");
        this.videoRootView = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.gallery_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.gallery_video)");
        this.videoParentView = (SurfaceView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.iv_gallery_item);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.iv_gallery_item)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.simpleDraweeView = imageView;
        View viewFindViewById4 = this.itemView.findViewById(R.id.iv_gallery_item_2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(R.id.iv_gallery_item_2)");
        ImageView imageView2 = (ImageView) viewFindViewById4;
        this.simpleDraweeView2 = imageView2;
        View viewFindViewById5 = this.itemView.findViewById(R.id.btn_play_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "itemView.findViewById(R.id.btn_play_video)");
        ImageView imageView3 = (ImageView) viewFindViewById5;
        this.videoPlayBtn = imageView3;
        View viewFindViewById6 = this.itemView.findViewById(R.id.video_current_duration);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "itemView.findViewById(R.id.video_current_duration)");
        this.videoCurrentDuration = (TextView) viewFindViewById6;
        View viewFindViewById7 = this.itemView.findViewById(R.id.video_total_duration);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "itemView.findViewById(R.id.video_total_duration)");
        this.videoTotalDuration = (TextView) viewFindViewById7;
        View viewFindViewById8 = this.itemView.findViewById(R.id.video_audio_adjustment);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "itemView.findViewById(R.id.video_audio_adjustment)");
        ImageView imageView4 = (ImageView) viewFindViewById8;
        this.videoAudioAdjustment = imageView4;
        View viewFindViewById9 = this.itemView.findViewById(R.id.video_full_screen);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "itemView.findViewById(R.id.video_full_screen)");
        ImageView imageView5 = (ImageView) viewFindViewById9;
        this.videoFullScreen = imageView5;
        View viewFindViewById10 = this.itemView.findViewById(R.id.video_seek);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "itemView.findViewById(R.id.video_seek)");
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) viewFindViewById10;
        this.videoSeek = appCompatSeekBar;
        View viewFindViewById11 = this.itemView.findViewById(R.id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "itemView.findViewById(R.id.progress_bar)");
        this.progressBar = (VideoPlayerLiteVideoCardPlayStateButton) viewFindViewById11;
        this.videoUrl = "";
        this.controlType = "";
        this.playActivityClass = VideoFullScreenPlayActivity.class;
        this.isFullScreenForActivity = true;
        this.stopPlayAfterEnd = true;
        this.isPlayOnGallery = true;
        this.isPlayOnGalleryIsShow = true;
        initVideoView();
        imageView2.setVisibility(8);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.n30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AndroidVideoPlayerController.m5030_init_$lambda1(this.i, view);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.o30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AndroidVideoPlayerController.m5031_init_$lambda2(this.i, view);
            }
        });
        initVideoViewOnClick();
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.p30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AndroidVideoPlayerController.m5032_init_$lambda3(this.i, view);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.q30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AndroidVideoPlayerController.m5033_init_$lambda4(this.i, view);
            }
        });
        audioAdjustment();
        appCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.heytap.store.platform.androidplayer.AndroidVideoPlayerController.5
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
                LogUtils.INSTANCE.d("ProductVideoControlCore", Intrinsics.stringPlus("onProgressChanged: ", Integer.valueOf(progress)));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
                LogUtils.INSTANCE.d("ProductVideoControlCore", "onStartTrackingTouch: ");
                AndroidVideoPlayerController.this.onStartTrackingTouch = true;
                VideoPlayerView androidVodPlayer = AndroidVideoPlayerController.this.getAndroidVodPlayer();
                if (androidVodPlayer == null) {
                    return;
                }
                androidVodPlayer.seekStart();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            @SensorsDataInstrumented
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
                LogUtils.INSTANCE.d("ProductVideoControlCore", "onStopTrackingTouch: ");
                if (seekBar != null) {
                    AndroidVideoPlayerController androidVideoPlayerController = AndroidVideoPlayerController.this;
                    VideoPlayerView androidVodPlayer = androidVideoPlayerController.getAndroidVodPlayer();
                    if (androidVodPlayer != null) {
                        androidVodPlayer.seek(seekBar.getProgress());
                    }
                    androidVideoPlayerController.onStartTrackingTouch = false;
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(seekBar);
            }
        });
        if (getIsFullScreenForActivity()) {
            initRxBus();
        }
        onAttachNetworkObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m5030_init_$lambda1(AndroidVideoPlayerController this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.getIsPlaying()) {
            this$0.videoPlayBtn.callOnClick();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m5031_init_$lambda2(AndroidVideoPlayerController this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.playVideo();
        this$0.handler.removeCallbacks(this$0.runnable);
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m5032_init_$lambda3(AndroidVideoPlayerController this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.audioAdjustment();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-4, reason: not valid java name */
    public static final void m5033_init_$lambda4(AndroidVideoPlayerController this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getIsFullScreenForActivity()) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this$0.setRotationByActivity(it);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void audioAdjustment() {
        if (this.isSetMute) {
            this.isSetMute = false;
            VideoPlayerView videoPlayerView = this.androidVodPlayer;
            if (videoPlayerView != null) {
                videoPlayerView.setMute(false);
            }
            this.videoAudioAdjustment.setImageResource(R.drawable.pf_videoplayer_audio_on);
            return;
        }
        this.isSetMute = true;
        VideoPlayerView videoPlayerView2 = this.androidVodPlayer;
        if (videoPlayerView2 != null) {
            videoPlayerView2.setMute(true);
        }
        this.videoAudioAdjustment.setImageResource(R.drawable.pf_videoplayer_audio_off);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.heytap.store.platform.androidplayer.AndroidVideoPlayerController$createNetworkObserver$1] */
    private final AnonymousClass1 createNetworkObserver() {
        return new NetworkObserver() { // from class: com.heytap.store.platform.androidplayer.AndroidVideoPlayerController.createNetworkObserver.1
            @Override // com.heytap.store.base.core.connectivity.NetworkObserver
            public void notify(@NotNull ConnectivityManagerProxy.SimpleNetworkInfo networkInfo) {
                Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
                AndroidVideoPlayerController.this.simpleNetworkInfo = networkInfo;
                if (!networkInfo.isAvailable()) {
                    if (networkInfo.isAvailable()) {
                        return;
                    }
                    ToastUtil.show(AndroidVideoPlayerController.this.context, "网络不可用,请重试");
                    AndroidVideoPlayerController.this.mNetNotAvailable = true;
                    return;
                }
                AndroidVideoPlayerController.this.mWifiIsWork = networkInfo.isWifi();
                if (AndroidVideoPlayerController.this.mNetNotAvailable) {
                    AndroidVideoPlayerController.this.mNetNotAvailable = false;
                }
            }
        };
    }

    private final void destroyRxBus() {
        if (this.obServable1 != null) {
            cv5 cv5Var = this.subscription1;
            Intrinsics.checkNotNull(cv5Var);
            cv5Var.dispose();
            RxBus rxBus = RxBus.get();
            kbd<RxBus.Event> kbdVar = this.obServable1;
            Intrinsics.checkNotNull(kbdVar);
            rxBus.unregister(RxBus.Event.class, (kbd) kbdVar);
            this.obServable1 = null;
            this.subscription1 = null;
        }
    }

    private final boolean getNetStatus() {
        if (this.mNetNotAvailable) {
            ToastUtil.show(ContextGetterUtils.INSTANCE.getApp(), "网络不可用,请重试");
            return false;
        }
        if (this.mWifiIsWork || this.mIsShowToast) {
            return true;
        }
        this.mIsShowToast = true;
        ToastUtil.show(ContextGetterUtils.INSTANCE.getApp(), "您当前是移动网络数据，请注意流量消耗");
        return true;
    }

    private final void initRxBus() {
        kbd<RxBus.Event> kbdVarR;
        kbd<RxBus.Event> kbdVarRegister = RxBus.get().register(RxBus.Event.class);
        this.obServable1 = kbdVarRegister;
        if (kbdVarRegister == null || (kbdVarR = kbdVarRegister.r(e30.a())) == null) {
            return;
        }
        kbdVarR.subscribe(new bed<RxBus.Event>() { // from class: com.heytap.store.platform.androidplayer.AndroidVideoPlayerController.initRxBus.1
            @Override // com.oplus.aiunit.vision.bed
            public void onComplete() {
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onError(@NotNull Throwable e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onSubscribe(@NotNull cv5 d) {
                Intrinsics.checkNotNullParameter(d, "d");
                AndroidVideoPlayerController.this.subscription1 = d;
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onNext(@NotNull RxBus.Event event) {
                int videoStatus;
                Intrinsics.checkNotNullParameter(event, "event");
                String str = event.tag;
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode == -174134890) {
                        if (str.equals(VideoPlayerProductDetailDataBeanKt.VIDEO_RX_BUS_TAG)) {
                            Object obj = event.o;
                            if (obj instanceof Integer) {
                                AndroidVideoPlayerController androidVideoPlayerController = AndroidVideoPlayerController.this;
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                }
                                IVideoPlayerController.DefaultImpls.videoPlayStatus$default(androidVideoPlayerController, ((Integer) obj).intValue(), false, 2, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (iHashCode == 330773691) {
                        if (str.equals(VideoPlayerProductDetailDataBeanKt.TOOLBAR_EXPANSION_KEY) && (event.o instanceof Integer)) {
                            AndroidVideoPlayerController.this.videoPlayBtn.setVisibility(0);
                            AndroidVideoPlayerController.this.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_resume);
                            AndroidVideoPlayerController androidVideoPlayerController2 = AndroidVideoPlayerController.this;
                            Object obj2 = event.o;
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                            IVideoPlayerController.DefaultImpls.videoPlayStatus$default(androidVideoPlayerController2, ((Integer) obj2).intValue(), false, 2, null);
                            return;
                        }
                        return;
                    }
                    if (iHashCode == 614862977 && str.equals(VideoPlayerProductDetailDataBeanKt.VIDEO_RESULT)) {
                        AndroidVideoPlayerController.this.isFullScreen = false;
                        Object obj3 = event.o;
                        if (obj3 instanceof VideoControlBean) {
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.platform.videoplayer.bean.VideoControlBean");
                            }
                            if (Intrinsics.areEqual(((VideoControlBean) obj3).getControlType(), AndroidVideoPlayerController.this.getControlType())) {
                                Object obj4 = event.o;
                                if (obj4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.platform.videoplayer.bean.VideoControlBean");
                                }
                                if (Intrinsics.areEqual(((VideoControlBean) obj4).getVideoUrl(), AndroidVideoPlayerController.this.videoUrl)) {
                                    Object obj5 = event.o;
                                    if (obj5 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.platform.videoplayer.bean.VideoControlBean");
                                    }
                                    int progress = ((VideoControlBean) obj5).getProgress();
                                    Object obj6 = event.o;
                                    if (obj6 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.platform.videoplayer.bean.VideoControlBean");
                                    }
                                    if (((VideoControlBean) obj6).getVideoIsPlaying()) {
                                        Object obj7 = event.o;
                                        if (obj7 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.platform.videoplayer.bean.VideoControlBean");
                                        }
                                        if (((VideoControlBean) obj7).getVideoStatus() == 1) {
                                            AndroidVideoPlayerController.this.progressBar.setVisibility(8);
                                            AndroidVideoPlayerController.this.videoPlayBtn.setVisibility(8);
                                        } else if (AndroidVideoPlayerController.this.videoPlayBtn.getVisibility() == 8) {
                                            AndroidVideoPlayerController.this.videoPlayBtn.setVisibility(0);
                                        }
                                        Object obj8 = event.o;
                                        if (obj8 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.platform.videoplayer.bean.VideoControlBean");
                                        }
                                        videoStatus = ((VideoControlBean) obj8).getVideoStatus();
                                    } else {
                                        videoStatus = 10003;
                                    }
                                    if (AndroidVideoPlayerController.this.getHasSupportLowMachine()) {
                                        AndroidVideoPlayerController.this.setVideoProgress(progress);
                                    } else {
                                        AndroidVideoPlayerController.this.initVideoView();
                                        AndroidVideoPlayerController.this.playVideo();
                                        AndroidVideoPlayerController.this.playVideo();
                                    }
                                    IVideoPlayerController.DefaultImpls.videoPlayStatus$default(AndroidVideoPlayerController.this, videoStatus, false, 2, null);
                                    AndroidVideoPlayerController androidVideoPlayerController3 = AndroidVideoPlayerController.this;
                                    Object obj9 = event.o;
                                    if (obj9 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.platform.videoplayer.bean.VideoControlBean");
                                    }
                                    androidVideoPlayerController3.isSetMute = !((VideoControlBean) obj9).getVideoMute();
                                    AndroidVideoPlayerController.this.audioAdjustment();
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initVideoView() {
        if (this.androidVodPlayer == null) {
            this.androidVodPlayer = new VideoPlayerView(this.context, null, 0, 6, null);
        }
        VideoPlayerView videoPlayerView = this.androidVodPlayer;
        if (videoPlayerView != null) {
            videoPlayerView.setPlayerView(this.videoParentView);
        }
        VideoPlayerView videoPlayerView2 = this.androidVodPlayer;
        if (videoPlayerView2 != null) {
            videoPlayerView2.setRenderMode(1);
        }
        VideoPlayerView videoPlayerView3 = this.androidVodPlayer;
        if (videoPlayerView3 == null) {
            return;
        }
        videoPlayerView3.setVodListener(new VideoPlayerView.ITXVodPlayListener() { // from class: com.heytap.store.platform.androidplayer.AndroidVideoPlayerController.initVideoView.1
            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView.ITXVodPlayListener
            public void onNetStatus(@Nullable VideoPlayerView txVodPlayer, @Nullable Bundle bundle) {
            }

            @Override // com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView.ITXVodPlayListener
            public void onPlayEvent(@Nullable VideoPlayerView txVodPlayer, int eventCode, @Nullable Bundle bundle) {
                AndroidVideoPlayerController.this.setLiveNetStatus(eventCode, bundle);
            }
        });
    }

    private final void initVideoViewOnClick() {
        this.videoParentView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.k30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AndroidVideoPlayerController.m5034initVideoViewOnClick$lambda10(this.i, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: initVideoViewOnClick$lambda-10, reason: not valid java name */
    public static final void m5034initVideoViewOnClick$lambda10(AndroidVideoPlayerController this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.progressBar.getVisibility() == 0) {
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
            return;
        }
        this$0.handler.removeCallbacks(this$0.runnable);
        IVideoPlayerListener iVideoPlayerListener = this$0.listener;
        if (iVideoPlayerListener != null) {
            iVideoPlayerListener.videoPlay(true);
        }
        if (this$0.getIsPlaying() && this$0.videoPlayBtn.getVisibility() == 8) {
            this$0.videoPlayBtn.setVisibility(0);
            if (this$0.isPause) {
                this$0.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_resume);
            } else {
                this$0.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_pause);
            }
        } else {
            this$0.videoPlayBtn.setVisibility(8);
        }
        this$0.handler.postDelayed(this$0.runnable, 2000L);
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[Catch: Exception -> 0x0066, TRY_LEAVE, TryCatch #1 {Exception -> 0x0066, blocks: (B:20:0x0041, B:23:0x0046, B:26:0x0052, B:27:0x0056, B:30:0x0062), top: B:40:0x0041 }] */
    private final boolean isStreamMute(int keycode) {
        VideoPlayerView videoPlayerView;
        boolean z = false;
        try {
            Object systemService = ContextGetterUtils.INSTANCE.getApp().getSystemService("audio");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
            }
            int streamVolume = ((AudioManager) systemService).getStreamVolume(3);
            LogUtils.INSTANCE.d("ProductVideoControlCore", Intrinsics.stringPlus("isStreamMute: ", Integer.valueOf(streamVolume)));
            boolean z2 = keycode == 10005 ? streamVolume < 0 : !(keycode == 10006 ? !(streamVolume == 1 || streamVolume == 0) : !(streamVolume == 1 || streamVolume == 0));
            if (z2) {
                this.videoAudioAdjustment.setImageResource(R.drawable.pf_videoplayer_audio_off);
                videoPlayerView = this.androidVodPlayer;
                if (videoPlayerView == null) {
                    videoPlayerView.setMute(true);
                }
            } else {
                try {
                    if (this.isSetMute) {
                        this.videoAudioAdjustment.setImageResource(R.drawable.pf_videoplayer_audio_off);
                        videoPlayerView = this.androidVodPlayer;
                        if (videoPlayerView == null) {
                            videoPlayerView.setMute(true);
                        }
                    } else {
                        this.videoAudioAdjustment.setImageResource(R.drawable.pf_videoplayer_audio_on);
                        VideoPlayerView videoPlayerView2 = this.androidVodPlayer;
                        if (videoPlayerView2 != null) {
                            videoPlayerView2.setMute(false);
                        }
                    }
                } catch (Exception unused) {
                    z = z2;
                    return z;
                }
            }
            return z2;
        } catch (Exception unused2) {
        }
    }

    private final boolean isVisibility(View view) {
        if (Intrinsics.areEqual(getControlType(), "ITEM_GALLERY")) {
            return getIsPlayOnGalleryIsShow();
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocalVisibleRect(rect);
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        boolean zIsShown = view.isShown();
        int i = rect.bottom;
        if (i <= 0 || iArr[1] >= DeviceInfoUtil.screenHeight || iArr[0] > DeviceInfoUtil.screenWidth || !zIsShown) {
            return false;
        }
        int i2 = rect.top;
        int i3 = 100;
        if (i2 != 0 || i != height) {
            if (i2 > 0) {
                i3 = ((height - i2) * 100) / height;
            } else {
                if (1 <= i && i < height) {
                    i3 = (i * 100) / height;
                }
            }
        }
        LogUtils.INSTANCE.d("ProductVideoControlCore", Intrinsics.stringPlus("percents ", Integer.valueOf(i3)));
        return i3 > 50;
    }

    private final void onAttachNetworkObserver() {
        this.mNetworkObserver = createNetworkObserver();
        NetworkMonitor networkMonitor = NetworkMonitor.getInstance();
        NetworkObserver networkObserver = this.mNetworkObserver;
        if (networkObserver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNetworkObserver");
            networkObserver = null;
        }
        networkMonitor.addObserver(networkObserver);
    }

    private final void onDestroyNetworkObserver() {
        NetworkMonitor networkMonitor = NetworkMonitor.getInstance();
        NetworkObserver networkObserver = this.mNetworkObserver;
        if (networkObserver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNetworkObserver");
            networkObserver = null;
        }
        networkMonitor.delObserver(networkObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runnable$lambda-0, reason: not valid java name */
    public static final void m5035runnable$lambda0(AndroidVideoPlayerController this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.videoPlayBtn.setVisibility(8);
    }

    private final void setRotationByActivity(View view) {
        if (Intrinsics.areEqual(getPlayActivityClass(), VideoFullScreenPlayActivity.class)) {
            try {
                throw new Exception("VideoFullScreenPlayActivity 需要实现子类，以及自己业务数据的埋点");
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (!(view.getContext() instanceof Activity) || getPlayActivityClass() == null) {
            return;
        }
        int i = 1;
        this.haveBeenFullScreen = true;
        Context context = view.getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        Intent intent = new Intent((Activity) context, getPlayActivityClass());
        IVideoPlayerListener iVideoPlayerListener = this.listener;
        if (iVideoPlayerListener != null) {
            iVideoPlayerListener.onStartFullScreen(this.context, intent);
        }
        LogUtils.INSTANCE.d("ProductVideoControlCore", Intrinsics.stringPlus("videoSeek progress: ", Integer.valueOf(this.videoSeek.getProgress())));
        setHasSupportLowMachine(LowMachineUtil.checkDevice());
        if (getHasSupportLowMachine()) {
            this.isFullScreen = false;
            intent.putExtra(VideoPlayerProductDetailDataBeanKt.HAS_SUPPORT_LOW_MACHINE, true);
        } else {
            this.isFullScreen = true;
            intent.putExtra(VideoPlayerProductDetailDataBeanKt.HAS_SUPPORT_LOW_MACHINE, false);
        }
        intent.putExtra(VideoPlayerProductDetailDataBeanKt.VIDEO_PROGRESS_KEY, this.videoSeek.getProgress());
        intent.putExtra(VideoPlayerProductDetailDataBeanKt.VIDEO_URL_KEY, this.videoUrl);
        intent.putExtra(VideoPlayerProductDetailDataBeanKt.CONTROL_TYPE, getControlType());
        VideoPlayerView videoPlayerView = this.androidVodPlayer;
        intent.putExtra(VideoPlayerProductDetailDataBeanKt.VIDEO_WIDTH_KEY, videoPlayerView == null ? -1 : videoPlayerView.getVideoWidth());
        VideoPlayerView videoPlayerView2 = this.androidVodPlayer;
        intent.putExtra(VideoPlayerProductDetailDataBeanKt.VIDEO_HEIGHT_KEY, videoPlayerView2 != null ? videoPlayerView2.getVideoHeight() : -1);
        if (!getIsPlaying()) {
            i = 4;
        } else if (this.isPause) {
            i = 2;
        }
        intent.putExtra(VideoPlayerProductDetailDataBeanKt.VIDEO_STATUS, i);
        intent.putExtra(VideoPlayerProductDetailDataBeanKt.VIDEO_IS_MUTE, this.isSetMute);
        VideoPlayerView videoPlayerView3 = this.androidVodPlayer;
        if (videoPlayerView3 != null) {
            VideoPlayManager.INSTANCE.addVideoPlay(this.videoUrl, videoPlayerView3);
        }
        Context context2 = view.getContext();
        if (context2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        ((Activity) context2).startActivityForResult(intent, 10001);
    }

    private final void setVideoWidgetVisibility(int visibility) {
        this.videoCurrentDuration.setVisibility(visibility);
        this.videoTotalDuration.setVisibility(visibility);
        this.videoAudioAdjustment.setVisibility(visibility);
        this.videoFullScreen.setVisibility(visibility);
        this.videoSeek.setVisibility(visibility);
        this.videoParentView.setVisibility(visibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoPlayStatus$lambda-8, reason: not valid java name */
    public static final void m5036videoPlayStatus$lambda8(AndroidVideoPlayerController this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.videoPlayStatus(2, false);
    }

    @Nullable
    public final VideoPlayerView getAndroidVodPlayer() {
        return this.androidVodPlayer;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public boolean getAutoPlay() {
        return this.autoPlay;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    @NotNull
    public String getControlType() {
        return this.controlType;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public boolean getHasSupportLowMachine() {
        return this.hasSupportLowMachine;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    @Nullable
    public Class<?> getPlayActivityClass() {
        return this.playActivityClass;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public boolean getStopPlayAfterEnd() {
        return this.stopPlayAfterEnd;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    /* JADX INFO: renamed from: isFullScreenForActivity, reason: from getter */
    public boolean getIsFullScreenForActivity() {
        return this.isFullScreenForActivity;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public boolean isLoop() {
        VideoPlayerView videoPlayerView = this.androidVodPlayer;
        if (videoPlayerView == null) {
            return false;
        }
        return videoPlayerView.getIsLoop();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    /* JADX INFO: renamed from: isPlayOnGallery, reason: from getter */
    public boolean getIsPlayOnGallery() {
        return this.isPlayOnGallery;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    /* JADX INFO: renamed from: isPlayOnGalleryIsShow, reason: from getter */
    public boolean getIsPlayOnGalleryIsShow() {
        return this.isPlayOnGalleryIsShow;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: isToast, reason: from getter */
    public final boolean getIsToast() {
        return this.isToast;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        IVideoPlayerController.DefaultImpls.videoPlayStatus$default(this, 3, false, 2, null);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void onPause(boolean isShowPause) {
        videoPlayStatus(2, isShowPause);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (this.videoParentView.isShown()) {
            IVideoPlayerController.DefaultImpls.videoPlayStatus$default(this, 1, false, 2, null);
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void playVideo() {
        ILivePlayerController iLivePlayerController;
        ILivePlayerController iLivePlayerController2;
        ILivePlayerController iLivePlayerController3;
        if (getNetStatus()) {
            if (this.androidVodPlayer == null) {
                initVideoView();
            }
            if (!getIsPlaying()) {
                if (this.videoUrl.length() > 0) {
                    VideoPlayerView videoPlayerView = this.androidVodPlayer;
                    if (videoPlayerView != null) {
                        VideoPlayerView.startPlay$default(videoPlayerView, this.videoUrl, false, 2, null);
                    }
                    setPlaying(true);
                    this.isPause = false;
                    this.videoRootView.setKeepScreenOn(true);
                    VideoPlayerLiteVideoCardPlayStateButton.switchToState$default(this.progressBar, VideoPlayerLiteVideoCardPlayStateButton.ButtonState.BUFFERING, false, 2, null);
                    this.progressBar.setVisibility(0);
                    setVideoWidgetVisibility(0);
                    setOtherWidgetVisibility(8);
                    this.videoPlayBtn.setVisibility(8);
                    IVideoPlayerListener iVideoPlayerListener = this.listener;
                    if (iVideoPlayerListener != null) {
                        iVideoPlayerListener.videoPlay(true);
                    }
                    WeakReference<ILivePlayerController> livePlayerRef = VideoPlayManager.INSTANCE.getLivePlayerRef();
                    if (livePlayerRef == null || (iLivePlayerController = livePlayerRef.get()) == null) {
                        return;
                    }
                    iLivePlayerController.onPause();
                    return;
                }
                return;
            }
            VideoPlayerView videoPlayerView2 = this.androidVodPlayer;
            if (videoPlayerView2 != null) {
                if (this.isPause) {
                    this.isPause = false;
                    videoPlayerView2.resume();
                    this.videoPlayBtn.setVisibility(8);
                    WeakReference<ILivePlayerController> livePlayerRef2 = VideoPlayManager.INSTANCE.getLivePlayerRef();
                    if (livePlayerRef2 != null && (iLivePlayerController3 = livePlayerRef2.get()) != null) {
                        iLivePlayerController3.onPause();
                    }
                } else {
                    this.isPause = true;
                    videoPlayerView2.pause();
                    this.videoPlayBtn.setVisibility(0);
                    IVideoPlayerListener iVideoPlayerListener2 = this.listener;
                    if (iVideoPlayerListener2 != null) {
                        iVideoPlayerListener2.onVideoStop(this.videoSeek.getProgress(), this.videoSeek.getMax());
                    }
                    this.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_resume);
                    WeakReference<ILivePlayerController> livePlayerRef3 = VideoPlayManager.INSTANCE.getLivePlayerRef();
                    if (livePlayerRef3 != null && (iLivePlayerController2 = livePlayerRef3.get()) != null) {
                        iLivePlayerController2.onResume();
                    }
                }
            }
            IVideoPlayerListener iVideoPlayerListener3 = this.listener;
            if (iVideoPlayerListener3 == null) {
                return;
            }
            iVideoPlayerListener3.videoPlay(false);
        }
    }

    public final void setAndroidVodPlayer(@Nullable VideoPlayerView videoPlayerView) {
        this.androidVodPlayer = videoPlayerView;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setContent(@NotNull String url, @NotNull String previewImage, @NotNull String shopWindowAdUrl) {
        VideoPlayerView videoPlayerView;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(previewImage, "previewImage");
        Intrinsics.checkNotNullParameter(shopWindowAdUrl, "shopWindowAdUrl");
        ImageLoader.load(previewImage, this.simpleDraweeView);
        if (shopWindowAdUrl.length() > 0) {
            this.simpleDraweeView2.setVisibility(0);
            ImageLoader.load(shopWindowAdUrl, this.simpleDraweeView2);
        } else {
            this.simpleDraweeView2.setVisibility(8);
        }
        this.videoUrl = url;
        if (!Intrinsics.areEqual(getControlType(), "ITEM_GALLERY")) {
            setControlType(this.videoUrl);
        }
        if (this.videoUrl.length() > 0) {
            if (getAutoPlay()) {
                playVideo();
            } else {
                if (getIsPlaying() || (videoPlayerView = this.androidVodPlayer) == null) {
                    return;
                }
                videoPlayerView.startPlay(this.videoUrl, true);
            }
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setControlType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.controlType = str;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setFullScreenForActivity(boolean z) {
        this.isFullScreenForActivity = z;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setHasSupportLowMachine(boolean z) {
        this.hasSupportLowMachine = z;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setLiveNetStatus(int status, @Nullable Bundle bundle) {
        IVideoPlayerListener iVideoPlayerListener;
        if (status == 100) {
            Integer numValueOf = bundle == null ? null : Integer.valueOf(bundle.getInt(VideoPlayerConstants.EVT_PLAYABLE_DURATION_MS));
            Integer numValueOf2 = bundle == null ? null : Integer.valueOf(bundle.getInt(VideoPlayerConstants.EVT_PLAY_PROGRESS_MS));
            Integer numValueOf3 = bundle != null ? Integer.valueOf(bundle.getInt(VideoPlayerConstants.EVT_PLAY_DURATION_MS)) : null;
            this.videoParentView.isShown();
            if (numValueOf3 != null) {
                int iIntValue = numValueOf3.intValue();
                int i = iIntValue / 1000;
                LogUtils logUtils = LogUtils.INSTANCE;
                logUtils.d("ProductVideoControlCore", Intrinsics.stringPlus("onPlayEvent: 总时长毫秒 ", Integer.valueOf(iIntValue)));
                logUtils.d("ProductVideoControlCore", Intrinsics.stringPlus("onPlayEvent: 总时长秒:", Integer.valueOf(i)));
                logUtils.d("ProductVideoControlCore", Intrinsics.stringPlus("onPlayEvent: 总时长秒转换:", TimeUtil.getTimeHms(i)));
                VideoPlayerView androidVodPlayer = getAndroidVodPlayer();
                if ((androidVodPlayer != null && androidVodPlayer.isPlaying()) && !this.isPause && (iVideoPlayerListener = this.listener) != null) {
                    iVideoPlayerListener.onDuration(iIntValue);
                }
                this.videoTotalDuration.setText(TimeUtil.getTimeMs(iIntValue));
                this.videoSeek.setMax(i);
            }
            if (numValueOf2 != null) {
                int iIntValue2 = numValueOf2.intValue();
                int iCeil = (int) Math.ceil(iIntValue2 / 1000.0f);
                LogUtils logUtils2 = LogUtils.INSTANCE;
                logUtils2.d("ProductVideoControlCore", Intrinsics.stringPlus("onPlayEvent: 播放进度毫秒 ", Integer.valueOf(iIntValue2)));
                logUtils2.d("ProductVideoControlCore", Intrinsics.stringPlus("onPlayEvent: 播放进度度秒 ", Integer.valueOf(iCeil)));
                this.videoCurrentDuration.setText(TimeUtil.getTimeMs(iIntValue2));
                if (!this.onStartTrackingTouch) {
                    this.videoSeek.setProgress(iCeil);
                }
            }
            if (numValueOf != null) {
                int iIntValue3 = numValueOf.intValue();
                int i2 = iIntValue3 / 1000;
                LogUtils logUtils3 = LogUtils.INSTANCE;
                logUtils3.d("ProductVideoControlCore", Intrinsics.stringPlus("onPlayEvent: 加载进度毫秒 ", Integer.valueOf(iIntValue3)));
                logUtils3.d("ProductVideoControlCore", Intrinsics.stringPlus("onPlayEvent: 加载进度秒 ", Integer.valueOf(i2)));
                this.videoSeek.setSecondaryProgress(i2);
            }
            LogUtils.INSTANCE.d("ProductVideoControlCore", "onPlayEvent: ------------------------");
        }
        if (100 == status || status == -6 || 703 == status) {
            return;
        }
        if (102 != status) {
            if (103 == status || 2002 == status) {
                this.progressBar.setVisibility(0);
                return;
            }
            if (1102 == status || 1101 == status) {
                return;
            }
            if (3 == status || 104 == status) {
                this.progressBar.setVisibility(8);
                if (this.mWifiIsWork || this.mIsShowToast) {
                    return;
                }
                this.mIsShowToast = true;
                ToastUtil.show(ContextGetterUtils.INSTANCE.getApp(), "您当前是移动网络数据，请注意流量消耗");
                return;
            }
            return;
        }
        setPlaying(false);
        this.handler.removeCallbacks(this.runnable);
        this.videoRootView.setKeepScreenOn(false);
        this.videoCurrentDuration.setText(this.videoTotalDuration.getText());
        this.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_resume);
        if (!getStopPlayAfterEnd()) {
            IVideoPlayerListener iVideoPlayerListener2 = this.listener;
            if (iVideoPlayerListener2 != null) {
                iVideoPlayerListener2.onVideoStop(this.videoSeek.getProgress(), this.videoSeek.getMax());
            }
            VideoPlayerView videoPlayerView = this.androidVodPlayer;
            if (videoPlayerView != null) {
                videoPlayerView.stopPlay(false);
            }
            setOtherWidgetVisibility(0);
            return;
        }
        setVideoWidgetVisibility(8);
        setOtherWidgetVisibility(0);
        IVideoPlayerListener iVideoPlayerListener3 = this.listener;
        if (iVideoPlayerListener3 != null) {
            iVideoPlayerListener3.videoPlay(false);
        }
        VideoPlayerView videoPlayerView2 = this.androidVodPlayer;
        if (videoPlayerView2 == null) {
            return;
        }
        videoPlayerView2.stopPlay(true);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setLoop(boolean z) {
        VideoPlayerView videoPlayerView = this.androidVodPlayer;
        if (videoPlayerView == null) {
            return;
        }
        videoPlayerView.setLoop(z);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setOtherWidgetVisibility(int visibility) {
        this.videoPlayBtn.setVisibility(visibility);
        if (Intrinsics.areEqual(getControlType(), "10002")) {
            this.simpleDraweeView.setVisibility(8);
            this.simpleDraweeView2.setVisibility(8);
        } else {
            this.simpleDraweeView.setVisibility(visibility);
            this.simpleDraweeView2.setVisibility(visibility);
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlayActivityClass(@Nullable Class<?> cls) {
        this.playActivityClass = cls;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlayOnGallery(boolean z) {
        this.isPlayOnGallery = z;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlayOnGalleryIsShow(boolean z) {
        this.isPlayOnGalleryIsShow = z;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlayerRatio(@NotNull String ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setSeekControlBg(int color) {
        View viewFindViewById = this.itemView.findViewById(R.id.video_control_layout);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(color);
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setStopPlayAfterEnd(boolean z) {
        this.stopPlayAfterEnd = z;
    }

    public final void setToast(boolean z) {
        this.isToast = z;
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void setVideoProgress(int progress) {
        if (progress != -1) {
            this.videoPlayBtn.setVisibility(8);
            VideoPlayerView videoPlayerView = this.androidVodPlayer;
            if (videoPlayerView == null) {
                return;
            }
            videoPlayerView.seek(progress);
        }
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    public void videoPlayStatus(int isPlay, boolean isShowPause) {
        ILivePlayerController iLivePlayerController;
        ILivePlayerController iLivePlayerController2;
        IVideoPlayerListener iVideoPlayerListener;
        ILivePlayerController iLivePlayerController3;
        ILivePlayerController iLivePlayerController4;
        ILivePlayerController iLivePlayerController5;
        boolean z = false;
        if (this.isPause && getIsPlayOnGallery()) {
            VideoPlayerView videoPlayerView = this.androidVodPlayer;
            if (((videoPlayerView == null || videoPlayerView.isPlaying()) ? false : true) && isPlay != 3 && !isVisibility(this.videoParentView)) {
                return;
            }
        }
        if (this.isFullScreen) {
            return;
        }
        if (isShowPause) {
            this.videoPlayBtn.setVisibility(0);
            this.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_resume);
            WeakReference<ILivePlayerController> livePlayerRef = VideoPlayManager.INSTANCE.getLivePlayerRef();
            if (livePlayerRef != null && (iLivePlayerController5 = livePlayerRef.get()) != null) {
                iLivePlayerController5.onResume();
            }
        }
        if (isPlay == 1) {
            if (getIsPlaying() && this.isPause) {
                if (this.videoPlayBtn.getVisibility() != 8) {
                    this.handler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.l30
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidVideoPlayerController.m5036videoPlayStatus$lambda8(this.i);
                        }
                    }, 200L);
                    return;
                }
                this.isPause = false;
                VideoPlayerView videoPlayerView2 = this.androidVodPlayer;
                if (videoPlayerView2 != null) {
                    videoPlayerView2.resume();
                }
                this.videoPlayBtn.setVisibility(8);
                this.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_pause);
                WeakReference<ILivePlayerController> livePlayerRef2 = VideoPlayManager.INSTANCE.getLivePlayerRef();
                if (livePlayerRef2 == null || (iLivePlayerController = livePlayerRef2.get()) == null) {
                    return;
                }
                iLivePlayerController.onPause();
                return;
            }
            return;
        }
        if (isPlay == 2) {
            VideoPlayerView videoPlayerView3 = this.androidVodPlayer;
            if (videoPlayerView3 != null && videoPlayerView3.isPlaying()) {
                z = true;
            }
            if (z && (iVideoPlayerListener = this.listener) != null) {
                iVideoPlayerListener.onVideoStop(this.videoSeek.getProgress(), this.videoSeek.getMax());
            }
            this.isPause = true;
            VideoPlayerView videoPlayerView4 = this.androidVodPlayer;
            if (videoPlayerView4 != null) {
                videoPlayerView4.pause();
            }
            this.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_resume);
            WeakReference<ILivePlayerController> livePlayerRef3 = VideoPlayManager.INSTANCE.getLivePlayerRef();
            if (livePlayerRef3 == null || (iLivePlayerController2 = livePlayerRef3.get()) == null) {
                return;
            }
            iLivePlayerController2.onResume();
            return;
        }
        if (isPlay == 3) {
            if (!this.isSetMute) {
                audioAdjustment();
            }
            VideoPlayerView videoPlayerView5 = this.androidVodPlayer;
            if (videoPlayerView5 != null) {
                videoPlayerView5.setPlayerView(null);
            }
            VideoPlayerView videoPlayerView6 = this.androidVodPlayer;
            if (videoPlayerView6 != null) {
                videoPlayerView6.stopPlay(true);
            }
            VideoPlayerView videoPlayerView7 = this.androidVodPlayer;
            if (videoPlayerView7 != null) {
                videoPlayerView7.onDestroy();
            }
            WeakReference<ILivePlayerController> livePlayerRef4 = VideoPlayManager.INSTANCE.getLivePlayerRef();
            if (livePlayerRef4 != null && (iLivePlayerController3 = livePlayerRef4.get()) != null) {
                iLivePlayerController3.onResume();
            }
            this.androidVodPlayer = null;
            destroyRxBus();
            onDestroyNetworkObserver();
            return;
        }
        if (isPlay != 10003) {
            if (isPlay == 10005) {
                isStreamMute(10005);
                return;
            } else {
                if (isPlay != 10006) {
                    return;
                }
                isStreamMute(10006);
                return;
            }
        }
        setPlaying(false);
        if (getStopPlayAfterEnd()) {
            VideoPlayerView videoPlayerView8 = this.androidVodPlayer;
            if (videoPlayerView8 != null) {
                videoPlayerView8.stopPlay(true);
            }
            this.videoSeek.setProgress(0);
            this.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_resume);
            setVideoWidgetVisibility(8);
            setOtherWidgetVisibility(0);
        } else {
            VideoPlayerView videoPlayerView9 = this.androidVodPlayer;
            if (videoPlayerView9 != null) {
                videoPlayerView9.stopPlay(false);
            }
            this.videoSeek.setProgress(0);
            this.videoPlayBtn.setVisibility(0);
            this.videoPlayBtn.setImageResource(R.drawable.pf_videoplayer_video_play_resume);
        }
        WeakReference<ILivePlayerController> livePlayerRef5 = VideoPlayManager.INSTANCE.getLivePlayerRef();
        if (livePlayerRef5 == null || (iLivePlayerController4 = livePlayerRef5.get()) == null) {
            return;
        }
        iLivePlayerController4.onResume();
    }

    @Override // com.heytap.store.platform.videoplayer.base.IVideoPlayerController
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        IVideoPlayerController.DefaultImpls.videoPlayStatus$default(this, 2, false, 2, null);
    }
}
