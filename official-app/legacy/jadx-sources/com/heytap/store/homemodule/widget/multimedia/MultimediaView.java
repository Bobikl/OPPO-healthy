package com.heytap.store.homemodule.widget.multimedia;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.base.core.util.AudioFocusHelper;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.base.core.util.ImageSizeUtil;
import com.heytap.store.home.R;
import com.heytap.store.homemodule.config.HomeGlobalConfigViewModel;
import com.heytap.store.homemodule.data.AdvertPendantInfo;
import com.heytap.store.homemodule.data.MediaInfo;
import com.heytap.store.homemodule.model.ISuperPlayerModel;
import com.heytap.store.homemodule.model.SuperLivePlayerModel;
import com.heytap.store.homemodule.model.SuperPlayerModel;
import com.heytap.store.homemodule.utils.VideoPlayTimesUtil;
import com.heytap.store.homemodule.utils.ViewItemIntrusionHelper;
import com.heytap.store.homemodule.widget.AspectRatioMeasure;
import com.heytap.store.homemodule.widget.HomeCardPendantView;
import com.heytap.store.homemodule.widget.multimedia.MultimediaView;
import com.heytap.store.homemodule.widget.multimediareservation.BottomFeature;
import com.heytap.store.homemodule.widget.sfxplayer.SfxPlayerSdkHelper;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerViewWrapper;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0002opB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010G\u001a\u00020HH\u0002J\u001c\u0010I\u001a\u00020H2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010J\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u001cH\u0002J\b\u0010N\u001a\u00020HH\u0002J\u0006\u0010O\u001a\u00020\u000bJ\u0010\u0010P\u001a\u00020H2\u0006\u0010Q\u001a\u00020\u001cH\u0002J\b\u0010R\u001a\u00020HH\u0014J\b\u0010S\u001a\u00020HH\u0007J\b\u0010T\u001a\u00020HH\u0014J\u0018\u0010U\u001a\u00020H2\u0006\u0010V\u001a\u00020\b2\u0006\u0010W\u001a\u00020\bH\u0014J\b\u0010X\u001a\u00020HH\u0007J\b\u0010Y\u001a\u00020HH\u0007J\u0010\u0010Z\u001a\u00020H2\u0006\u0010Q\u001a\u00020\u001cH\u0002J\u0012\u0010[\u001a\u00020H2\b\u0010M\u001a\u0004\u0018\u00010\u001cH\u0002J\u0006\u0010\\\u001a\u00020HJ\b\u0010]\u001a\u00020HH\u0002J\u0010\u0010^\u001a\u00020H2\u0006\u0010_\u001a\u00020\u001eH\u0002J\u001e\u0010`\u001a\u00020H2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010a\u001a\u00020H2\u0006\u0010b\u001a\u00020\bJ\u0012\u0010c\u001a\u00020H2\b\u0010Q\u001a\u0004\u0018\u00010\u001cH\u0002J0\u0010d\u001a\u00020H2\b\u0010e\u001a\u0004\u0018\u00010f2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u001c2\u0006\u0010i\u001a\u00020\bJ\u000e\u0010j\u001a\u00020H2\u0006\u0010k\u001a\u00020\u000bJ\u000e\u0010l\u001a\u00020H2\u0006\u0010m\u001a\u000208J\u0006\u0010n\u001a\u00020HR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010%\"\u0004\b2\u0010'R\u000e\u00103\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/heytap/store/homemodule/widget/multimedia/MultimediaView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attach", "", "getAttach", "()Z", "setAttach", "(Z)V", "audioFocusHelper", "Lcom/heytap/store/base/core/util/AudioFocusHelper;", "getAudioFocusHelper", "()Lcom/heytap/store/base/core/util/AudioFocusHelper;", "audioFocusHelper$delegate", "Lkotlin/Lazy;", "createdSfxPlayer", "intrusionHelper", "Lcom/heytap/store/homemodule/utils/ViewItemIntrusionHelper;", "itemView", "Landroid/view/View;", "lastVideoPlayer", "", "mAspectRatio", "", "mMeasureSpec", "Lcom/heytap/store/homemodule/widget/AspectRatioMeasure$Spec;", "mMediaInfo", "Lcom/heytap/store/homemodule/data/MediaInfo;", "mMediaLive", "getMMediaLive", "()Landroid/view/View;", "setMMediaLive", "(Landroid/view/View;)V", "mMediaLiveStub", "Landroid/view/ViewStub;", "getMMediaLiveStub", "()Landroid/view/ViewStub;", "setMMediaLiveStub", "(Landroid/view/ViewStub;)V", "mMediaPic", "Landroid/widget/ImageView;", "mMediaVideo", "getMMediaVideo", "setMMediaVideo", "mMediaVideoMuteBtn", "mMediaVideoStub", "getMMediaVideoStub", "setMMediaVideoStub", "mRePlayListener", "Lcom/heytap/store/homemodule/widget/multimedia/MultimediaView$VideoRePlayOrStopPlayListener;", "mSuperPlayerModel", "Lcom/heytap/store/homemodule/model/ISuperPlayerModel;", "getMSuperPlayerModel", "()Lcom/heytap/store/homemodule/model/ISuperPlayerModel;", "setMSuperPlayerModel", "(Lcom/heytap/store/homemodule/model/ISuperPlayerModel;)V", "pendantView", "Lcom/heytap/store/homemodule/widget/HomeCardPendantView;", "getPendantView", "()Lcom/heytap/store/homemodule/widget/HomeCardPendantView;", "setPendantView", "(Lcom/heytap/store/homemodule/widget/HomeCardPendantView;)V", "sfxPlayerSdkHelper", "Lcom/heytap/store/homemodule/widget/sfxplayer/SfxPlayerSdkHelper;", "changePendCardViewMargin", "", "createAlphaVideo", "mediaInfo", "getVideoPlayListener", "Lcom/heytap/store/homemodule/model/SuperPlayerModel$VideoPlayListener;", RunningPostureVideoActivity.VIDEO_PATH, "hidePendantView", "isVideoPlaying", "onAlphaVideoPlay", "url", "onAttachedToWindow", "onDestroy", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onPause", "onResume", "onVideoPlay", ClickApiEntity.PLAY_VIDEO, "rePlayVideo", "removeAlpha", "setAspectRatio", "aspectRatio", "setData", "setDispalyMuteIcon", "visibility", "setImage", "setPendantData", "advertPendantInfo", "Lcom/heytap/store/homemodule/data/AdvertPendantInfo;", "module", "moduleCode", "weight", "setVideoMute", "mute", "setVideoRePlayListener", "videoRePlayListener", "stopPlayVideo", "Companion", "VideoRePlayOrStopPlayListener", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MultimediaView extends ConstraintLayout implements LifecycleObserver {
    public static final int MEDIA_TYPE_ALPHA_VIDEO = 3;
    public static final int MEDIA_TYPE_PIC = 2;
    public static final int MEDIA_TYPE_VIDEO = 1;
    private boolean attach;

    /* JADX INFO: renamed from: audioFocusHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy audioFocusHelper;
    private boolean createdSfxPlayer;

    @Nullable
    private ViewItemIntrusionHelper intrusionHelper;

    @Nullable
    private View itemView;

    @Nullable
    private String lastVideoPlayer;
    private float mAspectRatio;

    @NotNull
    private final AspectRatioMeasure.Spec mMeasureSpec;

    @Nullable
    private MediaInfo mMediaInfo;

    @Nullable
    private View mMediaLive;

    @Nullable
    private ViewStub mMediaLiveStub;

    @NotNull
    private ImageView mMediaPic;

    @Nullable
    private View mMediaVideo;

    @NotNull
    private ImageView mMediaVideoMuteBtn;

    @NotNull
    private ViewStub mMediaVideoStub;

    @Nullable
    private VideoRePlayOrStopPlayListener mRePlayListener;

    @Nullable
    private ISuperPlayerModel mSuperPlayerModel;

    @Nullable
    private HomeCardPendantView pendantView;

    @Nullable
    private SfxPlayerSdkHelper sfxPlayerSdkHelper;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/widget/multimedia/MultimediaView$VideoRePlayOrStopPlayListener;", "", "onRePlayOrStopPlay", "", "multimediaView", "Lcom/heytap/store/homemodule/widget/multimedia/MultimediaView;", "isRePlay", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface VideoRePlayOrStopPlayListener {
        void onRePlayOrStopPlay(@NotNull MultimediaView multimediaView, boolean isRePlay);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultimediaView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m4997_init_$lambda0(MultimediaView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.isLongClickable()) {
            this$0.setVideoMute(true);
        } else {
            this$0.setVideoMute(false);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changePendCardViewMargin() {
        HomeCardPendantView homeCardPendantView = this.pendantView;
        if (homeCardPendantView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = homeCardPendantView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(this.mMediaVideoMuteBtn.getVisibility() == 0 ? DisplayUtil.dip2px(6.0f) : DisplayUtil.dip2px(10.0f));
        homeCardPendantView.setLayoutParams(layoutParams2);
    }

    private final void createAlphaVideo(View itemView, MediaInfo mediaInfo) {
        if (mediaInfo == null || itemView == null || mediaInfo.getType() != 3) {
            return;
        }
        if (mediaInfo.getAlphaVideo().length() == 0) {
            return;
        }
        if (this.sfxPlayerSdkHelper != null || this.intrusionHelper != null) {
            removeAlpha();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.sfxPlayerSdkHelper = new SfxPlayerSdkHelper(context);
        this.intrusionHelper = new ViewItemIntrusionHelper(itemView, mediaInfo, this) { // from class: com.heytap.store.homemodule.widget.multimedia.MultimediaView.createAlphaVideo.1
            final /* synthetic */ View $itemView;
            final /* synthetic */ MediaInfo $mediaInfo;
            final /* synthetic */ MultimediaView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(itemView, mediaInfo);
                this.$itemView = itemView;
                this.$mediaInfo = mediaInfo;
                this.this$0 = this;
            }

            @Override // com.heytap.store.homemodule.utils.ViewItemIntrusionHelper
            @Nullable
            /* JADX INFO: renamed from: getAlignView */
            public View getAlignViewParam() {
                return this.this$0.mMediaPic;
            }

            @Override // com.heytap.store.homemodule.utils.ViewItemIntrusionHelper
            @Nullable
            public View getFloatView() {
                SfxPlayerSdkHelper sfxPlayerSdkHelper = this.this$0.sfxPlayerSdkHelper;
                if (sfxPlayerSdkHelper == null) {
                    return null;
                }
                return sfxPlayerSdkHelper.get3DVideoView(true);
            }
        };
    }

    private final AudioFocusHelper getAudioFocusHelper() {
        return (AudioFocusHelper) this.audioFocusHelper.getValue();
    }

    private final SuperPlayerModel.VideoPlayListener getVideoPlayListener(String videoUrl) {
        return new SuperPlayerModel.VideoPlayListener() { // from class: com.heytap.store.homemodule.widget.multimedia.MultimediaView.getVideoPlayListener.1
            private boolean oncePlayEndFlag = true;
            private int preVodEvtCode = -1;

            public final boolean getOncePlayEndFlag() {
                return this.oncePlayEndFlag;
            }

            public final int getPreVodEvtCode() {
                return this.preVodEvtCode;
            }

            @Override // com.heytap.store.homemodule.model.SuperPlayerModel.VideoPlayListener
            public boolean onNetStatus(@Nullable VideoPlayerView var1, @Nullable Bundle var2) {
                return false;
            }

            @Override // com.heytap.store.homemodule.model.SuperPlayerModel.VideoPlayListener
            public boolean onPlayEvent(@Nullable VideoPlayerView videoView, int code, @Nullable Bundle bundle) {
                VideoRePlayOrStopPlayListener videoRePlayOrStopPlayListener;
                if (code != 3) {
                    if (code == 102) {
                        this.oncePlayEndFlag = true;
                        MediaInfo mediaInfo = MultimediaView.this.mMediaInfo;
                        if (mediaInfo != null) {
                            VideoPlayTimesUtil.addTimes(mediaInfo.getId());
                        }
                        ISuperPlayerModel mSuperPlayerModel = MultimediaView.this.getMSuperPlayerModel();
                        if (mSuperPlayerModel != null && (mSuperPlayerModel instanceof SuperPlayerModel)) {
                            ((SuperPlayerModel) mSuperPlayerModel).setVideoPlayListener(null);
                        }
                        MultimediaView.this.mMediaVideoMuteBtn.setVisibility(8);
                        MultimediaView.this.changePendCardViewMargin();
                        VideoRePlayOrStopPlayListener videoRePlayOrStopPlayListener2 = MultimediaView.this.mRePlayListener;
                        if (videoRePlayOrStopPlayListener2 != null) {
                            videoRePlayOrStopPlayListener2.onRePlayOrStopPlay(MultimediaView.this, false);
                        }
                    }
                } else {
                    if (this.oncePlayEndFlag) {
                        this.preVodEvtCode = code;
                        this.oncePlayEndFlag = false;
                        return false;
                    }
                    if (this.preVodEvtCode == 100 && (videoRePlayOrStopPlayListener = MultimediaView.this.mRePlayListener) != null) {
                        videoRePlayOrStopPlayListener.onRePlayOrStopPlay(MultimediaView.this, true);
                    }
                }
                this.preVodEvtCode = code;
                return false;
            }

            public final void setOncePlayEndFlag(boolean z) {
                this.oncePlayEndFlag = z;
            }

            public final void setPreVodEvtCode(int i) {
                this.preVodEvtCode = i;
            }
        };
    }

    private final void hidePendantView() {
        HomeCardPendantView homeCardPendantView = this.pendantView;
        if (homeCardPendantView == null) {
            return;
        }
        homeCardPendantView.setVisibility(8);
    }

    private final void onAlphaVideoPlay(final String url) {
        MediaInfo mediaInfo = this.mMediaInfo;
        if (mediaInfo == null) {
            return;
        }
        LogUtils.INSTANCE.i("jarvanTest hascode is " + hashCode() + " initVideo 开始被调用");
        SfxPlayerSdkHelper sfxPlayerSdkHelper = this.sfxPlayerSdkHelper;
        if (sfxPlayerSdkHelper == null) {
            return;
        }
        sfxPlayerSdkHelper.initVideo(mediaInfo, new Function1<String, Unit>() { // from class: com.heytap.store.homemodule.widget.multimedia.MultimediaView$onAlphaVideoPlay$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String dataUrl) {
                ViewTreeObserver viewTreeObserver;
                Intrinsics.checkNotNullParameter(dataUrl, "dataUrl");
                if (!this.this$0.getAttach()) {
                    ViewItemIntrusionHelper viewItemIntrusionHelper = this.this$0.intrusionHelper;
                    if (viewItemIntrusionHelper == null) {
                        return;
                    }
                    viewItemIntrusionHelper.onVideoHide();
                    return;
                }
                SfxPlayerSdkHelper sfxPlayerSdkHelper2 = this.this$0.sfxPlayerSdkHelper;
                if (!Intrinsics.areEqual(dataUrl, sfxPlayerSdkHelper2 == null ? null : sfxPlayerSdkHelper2.getEmptyUlr())) {
                    this.this$0.onVideoPlay(dataUrl);
                }
                LogUtils logUtils = LogUtils.INSTANCE;
                logUtils.i("jarvanTest hascode is " + this.this$0.hashCode() + "  video url is " + url + "  data url is " + dataUrl);
                this.this$0.lastVideoPlayer = dataUrl;
                ViewItemIntrusionHelper viewItemIntrusionHelper2 = this.this$0.intrusionHelper;
                if (viewItemIntrusionHelper2 != null) {
                    viewItemIntrusionHelper2.onVideoShow();
                }
                ViewItemIntrusionHelper viewItemIntrusionHelper3 = this.this$0.intrusionHelper;
                if (viewItemIntrusionHelper3 == null ? false : viewItemIntrusionHelper3.notifyAlign()) {
                    return;
                }
                logUtils.i("jarvanTest hascode is " + this.this$0.hashCode() + " 直接添加失败，尝试监听添加 OnGlobalLayoutListener");
                View view = this.this$0.itemView;
                if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                final MultimediaView multimediaView = this.this$0;
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.store.homemodule.widget.multimedia.MultimediaView$onAlphaVideoPlay$1$1.1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver2;
                        View view2 = multimediaView.itemView;
                        if (view2 != null && (viewTreeObserver2 = view2.getViewTreeObserver()) != null) {
                            viewTreeObserver2.removeOnGlobalLayoutListener(this);
                        }
                        LogUtils.INSTANCE.i("jarvanTest hascode is " + hashCode() + " 直接添加失败，添加 通过 OnGlobalLayoutListener attach is " + multimediaView.getAttach());
                        if (multimediaView.getAttach()) {
                            ViewItemIntrusionHelper viewItemIntrusionHelper4 = multimediaView.intrusionHelper;
                            if (viewItemIntrusionHelper4 == null) {
                                return;
                            }
                            viewItemIntrusionHelper4.notifyAlign();
                            return;
                        }
                        ViewItemIntrusionHelper viewItemIntrusionHelper5 = multimediaView.intrusionHelper;
                        if (viewItemIntrusionHelper5 == null) {
                            return;
                        }
                        viewItemIntrusionHelper5.onVideoHide();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoPlay(String url) {
        setVideoMute(true);
        MediaInfo mediaInfo = this.mMediaInfo;
        setDispalyMuteIcon(mediaInfo != null && mediaInfo.getIs_video_sound() == 1 ? 0 : 8);
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.i("jarvanTest hascode is " + hashCode() + "  onVideoPlay url is " + url);
        ISuperPlayerModel iSuperPlayerModel = this.mSuperPlayerModel;
        if (iSuperPlayerModel == null) {
            return;
        }
        if (iSuperPlayerModel instanceof SuperPlayerModel) {
            logUtils.i("jarvanTest hascode is " + hashCode() + "  is mSuperPlayerModel url is " + url);
            ((SuperPlayerModel) iSuperPlayerModel).setVideoPlayListener(getVideoPlayListener(url));
            logUtils.i("jarvanTest hascode is " + hashCode() + "  is setVideoPlayListener url is " + url + " mMediaVideo is " + getMMediaVideo());
            View mMediaVideo = getMMediaVideo();
            if (mMediaVideo != null) {
                mMediaVideo.setVisibility(0);
                ISuperPlayerModel.startPlay$default(iSuperPlayerModel, mMediaVideo, url, 0, 4, null);
                logUtils.e("jarvanTest hascode is " + hashCode() + "  player.startPlay(it, url) url is " + url);
            }
        }
        if (iSuperPlayerModel instanceof SuperLivePlayerModel) {
            logUtils.e("jarvanTest hascode is " + hashCode() + "  竟然是 SuperLivePlayerModel ？？？！！  url is " + url);
            View mMediaLive = getMMediaLive();
            if (mMediaLive == null) {
                return;
            }
            mMediaLive.setVisibility(0);
            ISuperPlayerModel.startPlay$default(iSuperPlayerModel, mMediaLive, url, 0, 4, null);
        }
    }

    private final void playVideo(String videoUrl) {
        MediaInfo mediaInfo = this.mMediaInfo;
        if (mediaInfo != null) {
            Intrinsics.checkNotNull(mediaInfo);
            if (!VideoPlayTimesUtil.canPlay(mediaInfo.getId())) {
                LogUtils logUtils = LogUtils.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append("jarvanTest hascode is ");
                sb.append(hashCode());
                sb.append(" playVideo 无法播放 Id is ");
                MediaInfo mediaInfo2 = this.mMediaInfo;
                sb.append(mediaInfo2 == null ? null : Integer.valueOf(mediaInfo2.getId()));
                sb.append(StringUtil.SPACE);
                logUtils.i(sb.toString());
                return;
            }
        }
        if (videoUrl == null) {
            return;
        }
        boolean z = (DisplayUtil.isPadWindow() || DisplayUtil.isFoldDevice() || Build.VERSION.SDK_INT < HomeGlobalConfigViewModel.INSTANCE.getIntConfig("home_config", "HOME_SFX_DISABLE_OS_LEVEL", 28)) ? false : true;
        MediaInfo mediaInfo3 = this.mMediaInfo;
        if ((mediaInfo3 != null && mediaInfo3.getType() == 3) && !z) {
            removeAlpha();
            return;
        }
        MediaInfo mediaInfo4 = this.mMediaInfo;
        if (!(mediaInfo4 != null && mediaInfo4.getType() == 3) || !z) {
            onVideoPlay(videoUrl);
        } else {
            createAlphaVideo(this.itemView, this.mMediaInfo);
            onAlphaVideoPlay(videoUrl);
        }
    }

    private final void removeAlpha() {
        ViewItemIntrusionHelper viewItemIntrusionHelper = this.intrusionHelper;
        if (viewItemIntrusionHelper != null) {
            viewItemIntrusionHelper.onVideoHide();
        }
        this.intrusionHelper = null;
        SfxPlayerSdkHelper sfxPlayerSdkHelper = this.sfxPlayerSdkHelper;
        if (sfxPlayerSdkHelper != null) {
            sfxPlayerSdkHelper.stopPlay();
        }
        SfxPlayerSdkHelper sfxPlayerSdkHelper2 = this.sfxPlayerSdkHelper;
        if (sfxPlayerSdkHelper2 != null) {
            sfxPlayerSdkHelper2.setDestroy(true);
        }
        this.sfxPlayerSdkHelper = null;
    }

    private final void setAspectRatio(float aspectRatio) {
        if (aspectRatio == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = aspectRatio;
        requestLayout();
    }

    private final void setImage(String url) {
        if (url != null) {
            ImageLoader.load(url, this.mMediaPic);
        }
    }

    public static /* synthetic */ void setPendantData$default(MultimediaView multimediaView, AdvertPendantInfo advertPendantInfo, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        multimediaView.setPendantData(advertPendantInfo, str, str2, i);
    }

    public final boolean getAttach() {
        return this.attach;
    }

    @Nullable
    public final View getMMediaLive() {
        return this.mMediaLive;
    }

    @Nullable
    public final ViewStub getMMediaLiveStub() {
        return this.mMediaLiveStub;
    }

    @Nullable
    public final View getMMediaVideo() {
        return this.mMediaVideo;
    }

    @NotNull
    public final ViewStub getMMediaVideoStub() {
        return this.mMediaVideoStub;
    }

    @Nullable
    public final ISuperPlayerModel getMSuperPlayerModel() {
        return this.mSuperPlayerModel;
    }

    @Nullable
    public final HomeCardPendantView getPendantView() {
        return this.pendantView;
    }

    public final boolean isVideoPlaying() {
        String str = this.lastVideoPlayer;
        if (str != null) {
            SfxPlayerSdkHelper sfxPlayerSdkHelper = this.sfxPlayerSdkHelper;
            if (Intrinsics.areEqual(str, sfxPlayerSdkHelper == null ? null : sfxPlayerSdkHelper.getEmptyUlr())) {
                SfxPlayerSdkHelper sfxPlayerSdkHelper2 = this.sfxPlayerSdkHelper;
                if (sfxPlayerSdkHelper2 == null) {
                    return false;
                }
                return sfxPlayerSdkHelper2.isPlaying();
            }
        }
        ISuperPlayerModel iSuperPlayerModel = this.mSuperPlayerModel;
        if (iSuperPlayerModel == null) {
            return false;
        }
        return iSuperPlayerModel.getIsPlaying();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attach = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ISuperPlayerModel iSuperPlayerModel = this.mSuperPlayerModel;
        if (iSuperPlayerModel != null) {
            iSuperPlayerModel.stopPlay();
        }
        LogUtils.INSTANCE.i("jarvanTest hascode is " + hashCode() + "  onDestroy()");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attach = false;
        removeAlpha();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        AspectRatioMeasure.Spec spec = this.mMeasureSpec;
        spec.width = widthMeasureSpec;
        spec.height = heightMeasureSpec;
        AspectRatioMeasure.updateMeasureSpec(spec, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        AspectRatioMeasure.Spec spec2 = this.mMeasureSpec;
        super.onMeasure(spec2.width, spec2.height);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        stopPlayVideo();
        LogUtils.INSTANCE.i("jarvanTest hascode is " + hashCode() + "  onPause() 直接暂停播放逻辑");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        LogUtils.INSTANCE.i("jarvanTest hascode is " + hashCode() + "  onResume()");
    }

    public final void rePlayVideo() {
        MediaInfo mediaInfo;
        String video;
        LogUtils.INSTANCE.i("jarvanTest hascode is " + hashCode() + " rePlayVideo 被调用了");
        stopPlayVideo();
        if (this.mSuperPlayerModel == null || (mediaInfo = this.mMediaInfo) == null || (video = mediaInfo.getVideo()) == null) {
            return;
        }
        playVideo(video);
    }

    public final void setAttach(boolean z) {
        this.attach = z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[Catch: NoClassDefFoundError -> 0x00ac, TryCatch #0 {NoClassDefFoundError -> 0x00ac, blocks: (B:22:0x0071, B:24:0x0079, B:26:0x008e, B:27:0x00a1, B:30:0x00a8, B:34:0x00b0, B:36:0x00b8, B:38:0x00cd, B:42:0x00d7, B:41:0x00d4, B:43:0x00da, B:46:0x00e1), top: B:64:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[Catch: NoClassDefFoundError -> 0x00ac, TryCatch #0 {NoClassDefFoundError -> 0x00ac, blocks: (B:22:0x0071, B:24:0x0079, B:26:0x008e, B:27:0x00a1, B:30:0x00a8, B:34:0x00b0, B:36:0x00b8, B:38:0x00cd, B:42:0x00d7, B:41:0x00d4, B:43:0x00da, B:46:0x00e1), top: B:64:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1 A[Catch: NoClassDefFoundError -> 0x00ac, TRY_LEAVE, TryCatch #0 {NoClassDefFoundError -> 0x00ac, blocks: (B:22:0x0071, B:24:0x0079, B:26:0x008e, B:27:0x00a1, B:30:0x00a8, B:34:0x00b0, B:36:0x00b8, B:38:0x00cd, B:42:0x00d7, B:41:0x00d4, B:43:0x00da, B:46:0x00e1), top: B:64:0x0071 }] */
    public final void setData(@NotNull View itemView, @NotNull MediaInfo mediaInfo, boolean createdSfxPlayer) {
        String video;
        View mMediaLive;
        ViewStub mMediaLiveStub;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(mediaInfo, "mediaInfo");
        this.mMediaInfo = mediaInfo;
        setAspectRatio(ImageSizeUtil.getImageOriginalWight(mediaInfo.getPic()) / ImageSizeUtil.getImageOriginalHeight(mediaInfo.getPic()));
        boolean z = getParent() instanceof BottomFeature;
        setImage(mediaInfo.getPic());
        if ((mediaInfo.getType() == 1 || mediaInfo.getType() == 3) && VideoPlayTimesUtil.canPlay(mediaInfo.getId())) {
            MediaInfo mediaInfo2 = this.mMediaInfo;
            if (mediaInfo2 != null && (video = mediaInfo2.getVideo()) != null) {
                boolean z2 = StringsKt__StringsJVMKt.startsWith$default(video, "https://", false, 2, null) && StringsKt__StringsKt.contains$default((CharSequence) video, (CharSequence) ".mp4", false, 2, (Object) null);
                if (z2) {
                    try {
                        if (!(getMSuperPlayerModel() instanceof SuperPlayerModel)) {
                            Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            setMSuperPlayerModel(new SuperPlayerModel(context));
                            if (getMMediaVideo() == null) {
                                VideoPlayerViewWrapper videoPlayerViewWrapper = new VideoPlayerViewWrapper();
                                videoPlayerViewWrapper.viewStubInflate(getMMediaVideoStub());
                                setMMediaVideo(videoPlayerViewWrapper.getView());
                            }
                            View mMediaVideo = getMMediaVideo();
                            if (mMediaVideo != null) {
                                mMediaVideo.setVisibility(0);
                            }
                        } else if (!z2 && !(getMSuperPlayerModel() instanceof SuperLivePlayerModel)) {
                            Context context2 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "context");
                            setMSuperPlayerModel(new SuperLivePlayerModel(context2));
                            if (getMMediaLive() == null) {
                                mMediaLiveStub = getMMediaLiveStub();
                                if (mMediaLiveStub == null) {
                                    mMediaLiveStub.inflate();
                                }
                                setMMediaLiveStub(null);
                            }
                            mMediaLive = getMMediaLive();
                            if (mMediaLive == null) {
                                mMediaLive.setVisibility(0);
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        DataReportUtilKt.reportExceptionEvent(e2);
                    }
                } else if (!z2) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    setMSuperPlayerModel(new SuperLivePlayerModel(context3));
                    if (getMMediaLive() == null) {
                        mMediaLiveStub = getMMediaLiveStub();
                        if (mMediaLiveStub == null) {
                            mMediaLiveStub.inflate();
                        }
                        setMMediaLiveStub(null);
                    }
                    mMediaLive = getMMediaLive();
                    if (mMediaLive == null) {
                        mMediaLive.setVisibility(0);
                    }
                }
            }
            stopPlayVideo();
            setDispalyMuteIcon(mediaInfo.getIs_video_sound() == 1 ? 0 : 8);
        } else {
            View view = this.mMediaLive;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.mMediaVideo;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            setDispalyMuteIcon(8);
        }
        this.itemView = itemView;
        this.createdSfxPlayer = createdSfxPlayer;
    }

    public final void setDispalyMuteIcon(int visibility) {
        this.mMediaVideoMuteBtn.setVisibility(visibility);
        changePendCardViewMargin();
    }

    public final void setMMediaLive(@Nullable View view) {
        this.mMediaLive = view;
    }

    public final void setMMediaLiveStub(@Nullable ViewStub viewStub) {
        this.mMediaLiveStub = viewStub;
    }

    public final void setMMediaVideo(@Nullable View view) {
        this.mMediaVideo = view;
    }

    public final void setMMediaVideoStub(@NotNull ViewStub viewStub) {
        Intrinsics.checkNotNullParameter(viewStub, "<set-?>");
        this.mMediaVideoStub = viewStub;
    }

    public final void setMSuperPlayerModel(@Nullable ISuperPlayerModel iSuperPlayerModel) {
        this.mSuperPlayerModel = iSuperPlayerModel;
    }

    public final void setPendantData(@Nullable AdvertPendantInfo advertPendantInfo, @Nullable String module, @Nullable String moduleCode, int weight) {
        HomeCardPendantView pendantView;
        Unit unit = null;
        if (advertPendantInfo != null && (pendantView = getPendantView()) != null) {
            HomeCardPendantView.setAdvertInfo$default(pendantView, advertPendantInfo, module, moduleCode, null, weight, 8, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            hidePendantView();
        }
    }

    public final void setPendantView(@Nullable HomeCardPendantView homeCardPendantView) {
        this.pendantView = homeCardPendantView;
    }

    public final void setVideoMute(boolean mute) {
        if (mute) {
            ISuperPlayerModel iSuperPlayerModel = this.mSuperPlayerModel;
            if (iSuperPlayerModel != null) {
                iSuperPlayerModel.setMute(true);
            }
            this.mMediaVideoMuteBtn.setLongClickable(false);
            this.mMediaVideoMuteBtn.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.pf_home_product_audio_off));
            ISuperPlayerModel iSuperPlayerModel2 = this.mSuperPlayerModel;
            if (iSuperPlayerModel2 == null) {
                return;
            }
            iSuperPlayerModel2.setRequestAudioFocus(false);
            return;
        }
        MuteScheduler.INSTANCE.getInstances().setCurrentSoundFocus(this);
        ISuperPlayerModel iSuperPlayerModel3 = this.mSuperPlayerModel;
        if (iSuperPlayerModel3 != null) {
            iSuperPlayerModel3.setMute(false);
        }
        this.mMediaVideoMuteBtn.setLongClickable(true);
        this.mMediaVideoMuteBtn.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.pf_home_product_audio_on));
        ISuperPlayerModel iSuperPlayerModel4 = this.mSuperPlayerModel;
        if (iSuperPlayerModel4 != null) {
            iSuperPlayerModel4.setRequestAudioFocus(true);
        }
        getAudioFocusHelper().requestAudioFocus();
    }

    public final void setVideoRePlayListener(@NotNull VideoRePlayOrStopPlayListener videoRePlayListener) {
        Intrinsics.checkNotNullParameter(videoRePlayListener, "videoRePlayListener");
        this.mRePlayListener = videoRePlayListener;
    }

    public final void stopPlayVideo() {
        LogUtils.INSTANCE.i("jarvanTest hascode is " + hashCode() + "  stopPlayVideo()");
        MuteScheduler.INSTANCE.getInstances().equalAndClearSoundFocus(this);
        ISuperPlayerModel iSuperPlayerModel = this.mSuperPlayerModel;
        if (iSuperPlayerModel != null && (iSuperPlayerModel instanceof SuperPlayerModel)) {
            ((SuperPlayerModel) iSuperPlayerModel).setVideoPlayListener(null);
        }
        ISuperPlayerModel iSuperPlayerModel2 = this.mSuperPlayerModel;
        if (iSuperPlayerModel2 != null) {
            iSuperPlayerModel2.setMute(true);
        }
        ISuperPlayerModel iSuperPlayerModel3 = this.mSuperPlayerModel;
        if (iSuperPlayerModel3 != null) {
            iSuperPlayerModel3.stopPlay();
        }
        SfxPlayerSdkHelper sfxPlayerSdkHelper = this.sfxPlayerSdkHelper;
        if (sfxPlayerSdkHelper == null) {
            return;
        }
        sfxPlayerSdkHelper.stopPlay();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultimediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MultimediaView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultimediaView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mMeasureSpec = new AspectRatioMeasure.Spec();
        this.audioFocusHelper = LazyKt__LazyJVMKt.lazy(new Function0<AudioFocusHelper>() { // from class: com.heytap.store.homemodule.widget.multimedia.MultimediaView$audioFocusHelper$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final AudioFocusHelper invoke() {
                return new AudioFocusHelper(context);
            }
        });
        LayoutInflater.from(getContext()).inflate(R.layout.pf_home_layout_multimedia, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.media_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.media_pic)");
        this.mMediaPic = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.media_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.media_video)");
        this.mMediaVideoStub = (ViewStub) viewFindViewById2;
        this.mMediaLiveStub = (ViewStub) findViewById(R.id.media_live);
        this.pendantView = (HomeCardPendantView) findViewById(R.id.card_pendant_layout);
        View viewFindViewById3 = findViewById(R.id.media_video_mute_control);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.media_video_mute_control)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.mMediaVideoMuteBtn = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.k8c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultimediaView.m4997_init_$lambda0(this.i, view);
            }
        });
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getLifecycle().addObserver(this);
        }
    }
}
