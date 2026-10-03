package com.heytap.store.platform.videoplayer.wrapper;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView;
import com.oplus.aiunit.vision.cdd;
import com.oplus.aiunit.vision.dcd;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.ifg;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.zj9;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001c\u0018\u0000 ~2\u00020\u0001:\u0002~\u007fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010c\u001a\u00020d2\u0006\u0010`\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u0007H\u0002J\b\u0010e\u001a\u00020dH\u0002J\u0018\u0010f\u001a\u00020d2\u0006\u0010`\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u0007H\u0002J\u0016\u0010g\u001a\u00020d2\u0006\u0010h\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u0007J\u0010\u0010j\u001a\u00020d2\u0006\u0010k\u001a\u00020/H\u0002J\u0006\u0010l\u001a\u00020dJ\u0006\u0010m\u001a\u00020dJ\u0006\u0010n\u001a\u00020dJ\u000e\u0010o\u001a\u00020d2\u0006\u0010p\u001a\u00020RJ\u0006\u0010q\u001a\u00020dJ\u000e\u0010r\u001a\u00020d2\u0006\u0010s\u001a\u00020\u001fJ\u0010\u0010t\u001a\u00020d2\b\u0010u\u001a\u0004\u0018\u00010)J\b\u0010v\u001a\u00020dH\u0002J\u000e\u0010w\u001a\u00020d2\u0006\u0010x\u001a\u00020\u0007J\u000e\u0010y\u001a\u00020d2\u0006\u0010z\u001a\u00020[J\u0018\u0010{\u001a\u00020d2\u0006\u0010k\u001a\u00020/2\b\b\u0002\u0010&\u001a\u00020\u001fJ\u000e\u0010|\u001a\u00020d2\u0006\u0010}\u001a\u00020\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00108FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u00020\u00108FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b%\u0010 R\u001a\u0010&\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\u001a\u0010H\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\u001c\u0010K\u001a\u00020\u00108FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0012\"\u0004\bM\u0010\u0014R\u001a\u0010N\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\u001a\u0010Q\u001a\u00020RX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010B\"\u0004\bY\u0010DR\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010B\"\u0004\bb\u0010D¨\u0006\u0080\u0001"}, d2 = {"Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "bufferDuration", "", "getBufferDuration", "()F", "setBufferDuration", "(F)V", "getContext", "()Landroid/content/Context;", "duration", "getDuration", "setDuration", "durationHandler", "Lcom/heytap/store/platform/videoplayer/wrapper/DurationHandler;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "isLoop", "", "()Z", "setLoop", "(Z)V", "isMuteConfig", "setMuteConfig", "isPlaying", "isPrepared", "setPrepared", "lastParent", "Landroid/view/SurfaceView;", "getLastParent", "()Landroid/view/SurfaceView;", "setLastParent", "(Landroid/view/SurfaceView;)V", "lastVideoUrl", "", "getLastVideoUrl", "()Ljava/lang/String;", "setLastVideoUrl", "(Ljava/lang/String;)V", "mediaPlayer", "Landroid/widget/VideoView;", "getMediaPlayer", "()Landroid/widget/VideoView;", "setMediaPlayer", "(Landroid/widget/VideoView;)V", "mp", "Landroid/media/MediaPlayer;", "getMp", "()Landroid/media/MediaPlayer;", "setMp", "(Landroid/media/MediaPlayer;)V", "parentHeight", "getParentHeight", "()I", "setParentHeight", "(I)V", "parentWidth", "getParentWidth", "setParentWidth", "pauseProgress", "getPauseProgress", "setPauseProgress", "playableDuration", "getPlayableDuration", "setPlayableDuration", "renderModeValue", "getRenderModeValue", "setRenderModeValue", "startPlayer", "", "getStartPlayer", "()J", "setStartPlayer", "(J)V", "videoHeight", "getVideoHeight", "setVideoHeight", "videoListener", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView$ITXVodPlayListener;", "getVideoListener", "()Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView$ITXVodPlayListener;", "setVideoListener", "(Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView$ITXVodPlayListener;)V", "videoWidth", "getVideoWidth", "setVideoWidth", "changeVideoViewAdjustSize", "", "changeVideoViewByConstrainLayout", "changeVideoViewFullSize", "changeVideoViewSize", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "getVideoSize", RunningPostureVideoActivity.VIDEO_PATH, "onDestroy", "pause", "resume", "seek", "progress", "seekStart", "setMute", "mute", "setPlayerView", "parent", "setPrepareListener", "setRenderMode", "mode", "setVodListener", "listener", "startPlay", "stopPlay", "flag", "Companion", "ITXVodPlayListener", "androidplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoPlayerView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static zj9 proxy;

    @Nullable
    private AudioManager audioManager;
    private float bufferDuration;

    @NotNull
    private final Context context;
    private float duration;

    @NotNull
    private final DurationHandler durationHandler;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private boolean isLoop;
    private boolean isMuteConfig;
    private boolean isPrepared;

    @Nullable
    private SurfaceView lastParent;

    @Nullable
    private String lastVideoUrl;

    @NotNull
    private VideoView mediaPlayer;

    @Nullable
    private MediaPlayer mp;
    private int parentHeight;
    private int parentWidth;
    private int pauseProgress;
    private float playableDuration;
    private int renderModeValue;
    private long startPlayer;
    private int videoHeight;

    @Nullable
    private ITXVodPlayListener videoListener;
    private int videoWidth;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView$Companion;", "", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/zj9;", "getProxy", "proxy", "Lcom/oplus/aiunit/vision/zj9;", "<init>", "()V", "androidplayer_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final zj9 getProxy(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (VideoPlayerView.proxy == null) {
                VideoPlayerView.proxy = new zj9.b(context.getApplicationContext()).c(20).d(1073741824L).a();
            }
            zj9 zj9Var = VideoPlayerView.proxy;
            Intrinsics.checkNotNull(zj9Var);
            return zj9Var;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView$ITXVodPlayListener;", "", "onNetStatus", "", "var1", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "var2", "Landroid/os/Bundle;", "onPlayEvent", "", "var3", "androidplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface ITXVodPlayListener {
        void onNetStatus(@Nullable VideoPlayerView var1, @Nullable Bundle var2);

        void onPlayEvent(@Nullable VideoPlayerView var1, int var2, @Nullable Bundle var3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPlayerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void changeVideoViewAdjustSize(int videoWidth, int videoHeight) {
        SurfaceView surfaceView = this.lastParent;
        if (surfaceView == null || videoWidth == 0 || videoHeight == 0 || surfaceView.getWidth() == 0 || surfaceView.getHeight() == 0) {
            return;
        }
        float f = videoWidth / videoHeight;
        float width = surfaceView.getWidth();
        float height = surfaceView.getHeight();
        float f2 = width / height;
        if (f > f2) {
            float f3 = width / (f * height);
            SurfaceView lastParent = getLastParent();
            if (lastParent == null) {
                return;
            }
            lastParent.setScaleY(f3);
            return;
        }
        if (f < f2) {
            float f4 = (f * height) / width;
            SurfaceView lastParent2 = getLastParent();
            if (lastParent2 == null) {
                return;
            }
            lastParent2.setScaleX(f4);
        }
    }

    private final void changeVideoViewByConstrainLayout() {
        ViewParent parent = this.mediaPlayer.getParent();
        if (!(parent instanceof ConstraintLayout) || this.videoWidth == -1 || this.videoHeight == -1) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int width = constraintLayout.getWidth();
        int height = constraintLayout.getHeight();
        if (width == this.parentWidth && height == this.parentHeight) {
            return;
        }
        this.parentWidth = width;
        this.parentHeight = height;
        if (width <= 0 || height <= 0) {
            return;
        }
        float f = this.videoWidth / this.videoHeight;
        float f2 = width / height;
        LogUtils.INSTANCE.i("VideoPlayerView", "视频宽高：" + f + " 父容器宽高：" + f2 + "  父容器宽度 " + this.parentWidth + " 父容器高度 " + this.parentHeight);
        ViewGroup.LayoutParams layoutParams = this.mediaPlayer.getLayoutParams();
        if (f > f2) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        this.mediaPlayer.setLayoutParams(layoutParams);
    }

    private final void changeVideoViewFullSize(int videoWidth, int videoHeight) {
        SurfaceView surfaceView = this.lastParent;
        if (surfaceView == null || videoWidth == 0 || videoHeight == 0 || surfaceView.getWidth() == 0 || surfaceView.getHeight() == 0) {
            return;
        }
        float f = videoWidth / videoHeight;
        float width = surfaceView.getWidth();
        float height = surfaceView.getHeight();
        float f2 = width / height;
        if (f > f2) {
            float f3 = (f * height) / width;
            SurfaceView lastParent = getLastParent();
            if (lastParent == null) {
                return;
            }
            lastParent.setScaleX(f3);
            return;
        }
        if (f < f2) {
            float f4 = width / (f * height);
            SurfaceView lastParent2 = getLastParent();
            if (lastParent2 == null) {
                return;
            }
            lastParent2.setScaleY(f4);
        }
    }

    private final void getVideoSize(final String videoUrl) {
        if (Intrinsics.areEqual(this.lastVideoUrl, videoUrl)) {
            return;
        }
        kbd.c(new cdd() { // from class: com.oplus.aiunit.vision.uyk
            @Override // com.oplus.aiunit.vision.cdd
            public final void subscribe(dcd dcdVar) {
                VideoPlayerView.m5065getVideoSize$lambda3(dcdVar);
            }
        }).q(new j08() { // from class: com.oplus.aiunit.vision.vyk
            @Override // com.oplus.aiunit.vision.j08
            public final Object apply(Object obj) {
                return VideoPlayerView.m5066getVideoSize$lambda4(videoUrl, this, (Boolean) obj);
            }
        }).B(ifg.b()).r(e30.a()).w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getVideoSize$lambda-3, reason: not valid java name */
    public static final void m5065getVideoSize$lambda3(dcd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.onNext(Boolean.TRUE);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getVideoSize$lambda-4, reason: not valid java name */
    public static final Unit m5066getVideoSize$lambda4(String videoUrl, VideoPlayerView this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(videoUrl, "$videoUrl");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(videoUrl);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        this$0.videoWidth = strExtractMetadata == null ? -1 : Integer.parseInt(strExtractMetadata);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        this$0.videoHeight = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : -1;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: globalLayoutListener$lambda-0, reason: not valid java name */
    public static final void m5067globalLayoutListener$lambda0(VideoPlayerView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeVideoViewByConstrainLayout();
    }

    private final void setPrepareListener() {
        this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.tyk
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoPlayerView.m5068setPrepareListener$lambda1(this.i, mediaPlayer);
            }
        });
        this.mediaPlayer.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setPrepareListener$lambda-1, reason: not valid java name */
    public static final void m5068setPrepareListener$lambda1(VideoPlayerView this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.i("setVodListener", Intrinsics.stringPlus("初步缓冲完成 : ", Long.valueOf(System.currentTimeMillis() - this$0.startPlayer)));
        if (this$0.isPrepared) {
            logUtils.i("setVodListener", "缓冲处理，先暂停");
            this$0.mediaPlayer.pause();
        } else {
            logUtils.i("setVodListener", "非缓冲，直接进行播放");
            this$0.mediaPlayer.start();
        }
        mediaPlayer.setLooping(this$0.isLoop);
        this$0.durationHandler.postNextTask();
        this$0.mp = mediaPlayer;
        this$0.setMute(this$0.isMuteConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setVodListener$lambda-10, reason: not valid java name */
    public static final boolean m5069setVodListener$lambda10(VideoPlayerView this$0, MediaPlayer mediaPlayer, int i, int i2) {
        SurfaceView surfaceView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LogUtils.INSTANCE.i("setVodListener", "setOnInfoListener what is " + i + " p2 is " + i2 + " current " + mediaPlayer.getCurrentPosition() + " all " + mediaPlayer.getDuration());
        if (i == 3) {
            SurfaceView surfaceView2 = this$0.lastParent;
            if (surfaceView2 != null) {
                surfaceView2.setAlpha(1.0f);
            }
        } else if (i == 100 && (surfaceView = this$0.lastParent) != null) {
            surfaceView.setAlpha(1.0f);
        }
        ITXVodPlayListener iTXVodPlayListener = this$0.videoListener;
        if (iTXVodPlayListener == null) {
            return false;
        }
        iTXVodPlayListener.onPlayEvent(this$0, i, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setVodListener$lambda-11, reason: not valid java name */
    public static final void m5070setVodListener$lambda11(VideoPlayerView this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LogUtils.INSTANCE.i("setVodListener", "setOnCompletionListener current " + this$0.mediaPlayer.getCurrentPosition() + " all " + this$0.mediaPlayer.getDuration());
        this$0.durationHandler.setComplete(true);
        ITXVodPlayListener iTXVodPlayListener = this$0.videoListener;
        if (iTXVodPlayListener != null) {
            iTXVodPlayListener.onPlayEvent(this$0, 102, null);
        }
        SurfaceView surfaceView = this$0.lastParent;
        if (surfaceView == null) {
            return;
        }
        surfaceView.setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setVodListener$lambda-12, reason: not valid java name */
    public static final boolean m5071setVodListener$lambda12(MediaPlayer mediaPlayer, int i, int i2) {
        LogUtils.INSTANCE.i("setVodListener", "setOnErrorListener what is " + i + " extra is " + i2);
        return true;
    }

    public static /* synthetic */ void startPlay$default(VideoPlayerView videoPlayerView, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        videoPlayerView.startPlay(str, z);
    }

    public final void changeVideoViewSize(int width, int height) {
    }

    @Nullable
    public final AudioManager getAudioManager() {
        return this.audioManager;
    }

    public final float getBufferDuration() {
        return this.mediaPlayer.getBufferPercentage() * getDuration();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final float getDuration() {
        return this.mediaPlayer.getDuration();
    }

    @Nullable
    public final SurfaceView getLastParent() {
        return this.lastParent;
    }

    @Nullable
    public final String getLastVideoUrl() {
        return this.lastVideoUrl;
    }

    @NotNull
    public final VideoView getMediaPlayer() {
        return this.mediaPlayer;
    }

    @Nullable
    public final MediaPlayer getMp() {
        return this.mp;
    }

    public final int getParentHeight() {
        return this.parentHeight;
    }

    public final int getParentWidth() {
        return this.parentWidth;
    }

    public final int getPauseProgress() {
        return this.pauseProgress;
    }

    public final float getPlayableDuration() {
        int i = this.pauseProgress;
        if (i != 0) {
            return i;
        }
        VideoView videoView = this.mediaPlayer;
        return (videoView == null ? null : Integer.valueOf(videoView.getCurrentPosition())).intValue();
    }

    public final int getRenderModeValue() {
        return this.renderModeValue;
    }

    public final long getStartPlayer() {
        return this.startPlayer;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    @Nullable
    public final ITXVodPlayListener getVideoListener() {
        return this.videoListener;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    /* JADX INFO: renamed from: isLoop, reason: from getter */
    public final boolean getIsLoop() {
        return this.isLoop;
    }

    /* JADX INFO: renamed from: isMuteConfig, reason: from getter */
    public final boolean getIsMuteConfig() {
        return this.isMuteConfig;
    }

    public final boolean isPlaying() {
        VideoView videoView = this.mediaPlayer;
        if (videoView == null) {
            return false;
        }
        return videoView.isPlaying();
    }

    /* JADX INFO: renamed from: isPrepared, reason: from getter */
    public final boolean getIsPrepared() {
        return this.isPrepared;
    }

    public final void onDestroy() {
        this.durationHandler.setDestroy(true);
        this.videoListener = null;
    }

    public final void pause() {
        if (this.mediaPlayer.getCurrentPosition() != 0) {
            this.pauseProgress = this.mediaPlayer.getCurrentPosition();
        }
        this.mediaPlayer.pause();
    }

    public final void resume() {
        this.mediaPlayer.start();
        SurfaceView surfaceView = this.lastParent;
        if (surfaceView != null) {
            surfaceView.setAlpha(1.0f);
        }
        int i = this.pauseProgress;
        if (i != 0) {
            this.mediaPlayer.seekTo(i);
            this.pauseProgress = 0;
        }
    }

    public final void seek(long progress) {
        long j2 = ((long) 1000) * progress;
        LogUtils.INSTANCE.i("setVodListener", "seek to progress is " + progress + " progressMs is " + j2);
        this.mediaPlayer.seekTo((int) j2);
        this.durationHandler.setSeekAction(false);
        this.durationHandler.postNextTask();
    }

    public final void seekStart() {
        this.durationHandler.clearTask();
        this.durationHandler.setSeekAction(true);
    }

    public final void setAudioManager(@Nullable AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public final void setBufferDuration(float f) {
        this.bufferDuration = f;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    public final void setLastParent(@Nullable SurfaceView surfaceView) {
        this.lastParent = surfaceView;
    }

    public final void setLastVideoUrl(@Nullable String str) {
        this.lastVideoUrl = str;
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    public final void setMediaPlayer(@NotNull VideoView videoView) {
        Intrinsics.checkNotNullParameter(videoView, "<set-?>");
        this.mediaPlayer = videoView;
    }

    public final void setMp(@Nullable MediaPlayer mediaPlayer) {
        this.mp = mediaPlayer;
    }

    public final void setMute(boolean mute) {
        this.isMuteConfig = mute;
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            if (mute) {
                MediaPlayer mp = getMp();
                if (mp != null) {
                    mp.setVolume(0.0f, 0.0f);
                    unit = Unit.INSTANCE;
                }
            } else {
                MediaPlayer mp2 = getMp();
                if (mp2 != null) {
                    mp2.setVolume(1.0f, 1.0f);
                    unit = Unit.INSTANCE;
                }
            }
            Result.m5287constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void setMuteConfig(boolean z) {
        this.isMuteConfig = z;
    }

    public final void setParentHeight(int i) {
        this.parentHeight = i;
    }

    public final void setParentWidth(int i) {
        this.parentWidth = i;
    }

    public final void setPauseProgress(int i) {
        this.pauseProgress = i;
    }

    public final void setPlayableDuration(float f) {
        this.playableDuration = f;
    }

    public final void setPlayerView(@Nullable SurfaceView parent) {
        if (Intrinsics.areEqual(this.lastParent, parent) || parent == null) {
            return;
        }
        parent.setAlpha(0.0f);
        if (parent instanceof VideoView) {
            setMediaPlayer((VideoView) parent);
            setPrepareListener();
        }
        setLastParent(parent);
        ITXVodPlayListener videoListener = getVideoListener();
        if (videoListener == null) {
            return;
        }
        setVodListener(videoListener);
    }

    public final void setPrepared(boolean z) {
        this.isPrepared = z;
    }

    public final void setRenderMode(int mode) {
        LogUtils.INSTANCE.i("setVodListener", Intrinsics.stringPlus("setRenderMode ", Integer.valueOf(mode)));
        this.renderModeValue = mode;
    }

    public final void setRenderModeValue(int i) {
        this.renderModeValue = i;
    }

    public final void setStartPlayer(long j2) {
        this.startPlayer = j2;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoListener(@Nullable ITXVodPlayListener iTXVodPlayListener) {
        this.videoListener = iTXVodPlayListener;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public final void setVodListener(@NotNull ITXVodPlayListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.videoListener = listener;
        this.durationHandler.setListener(listener);
        setPrepareListener();
        this.mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.oplus.aiunit.vision.pyk
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                return VideoPlayerView.m5069setVodListener$lambda10(this.i, mediaPlayer, i, i2);
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.qyk
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                VideoPlayerView.m5070setVodListener$lambda11(this.i, mediaPlayer);
            }
        });
        this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.oplus.aiunit.vision.ryk
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return VideoPlayerView.m5071setVodListener$lambda12(mediaPlayer, i, i2);
            }
        });
    }

    public final void startPlay(@NotNull String videoUrl, boolean isPrepared) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.i("setVodListener", Intrinsics.stringPlus("startPlay invoked url is ", videoUrl));
        this.startPlayer = System.currentTimeMillis();
        this.isPrepared = isPrepared;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (isPrepared) {
                logUtils.i("setVodListener", "尝试进行缓冲处理");
                setLastVideoUrl(videoUrl);
            } else {
                logUtils.i("setVodListener", "开始视频播放");
                getMediaPlayer().setVideoPath(INSTANCE.getProxy(getContext()).i(videoUrl));
                getMediaPlayer().start();
            }
            this.durationHandler.setComplete(false);
            Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        getVideoSize(videoUrl);
    }

    public final void stopPlay(boolean flag) {
        this.mediaPlayer.stopPlayback();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmOverloads
    public VideoPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.durationHandler = new DurationHandler(new SoftReference(this));
        this.mediaPlayer = new VideoView(context);
        setPrepareListener();
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.oplus.aiunit.vision.syk
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                VideoPlayerView.m5067globalLayoutListener$lambda0(this.i);
            }
        };
        Object systemService = context.getSystemService("audio");
        if (systemService != null) {
            this.audioManager = (AudioManager) systemService;
            this.videoWidth = -1;
            this.videoHeight = -1;
            this.parentWidth = -1;
            this.parentHeight = -1;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    public /* synthetic */ VideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
