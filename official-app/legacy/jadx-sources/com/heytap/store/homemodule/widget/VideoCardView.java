package com.heytap.store.homemodule.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.heytap.store.home.R;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerViewWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0007R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/homemodule/widget/VideoCardView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imgView", "Landroid/widget/ImageView;", "getImgView", "()Landroid/widget/ImageView;", "imgView$delegate", "Lkotlin/Lazy;", "videoView", "Landroid/view/ViewStub;", "getVideoView", "()Landroid/view/ViewStub;", "videoView$delegate", "videoViewWrapper", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerViewWrapper;", "getVideoViewWrapper", "()Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerViewWrapper;", "hidePlayerView", "", "setImgUrl", "url", "", "setImgVisible", "visible", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoCardView extends FrameLayout {

    /* JADX INFO: renamed from: imgView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy imgView;

    /* JADX INFO: renamed from: videoView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy videoView;

    @NotNull
    private final VideoPlayerViewWrapper videoViewWrapper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ImageView getImgView() {
        Object value = this.imgView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imgView>(...)");
        return (ImageView) value;
    }

    @NotNull
    public final ViewStub getVideoView() {
        Object value = this.videoView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-videoView>(...)");
        return (ViewStub) value;
    }

    @NotNull
    public final VideoPlayerViewWrapper getVideoViewWrapper() {
        return this.videoViewWrapper;
    }

    public final void hidePlayerView() {
        getVideoView().setVisibility(4);
        getImgView().setVisibility(0);
    }

    public final void setImgUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ImageLoader.load(url, getImgView());
        setImgVisible(0);
    }

    public final void setImgVisible(int visible) {
        getImgView().setVisibility(visible);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imgView = LazyKt__LazyJVMKt.lazy(new Function0<ImageView>() { // from class: com.heytap.store.homemodule.widget.VideoCardView$imgView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                return (ImageView) this.this$0.findViewById(R.id.card_img_view);
            }
        });
        VideoPlayerViewWrapper videoPlayerViewWrapper = new VideoPlayerViewWrapper();
        this.videoViewWrapper = videoPlayerViewWrapper;
        this.videoView = LazyKt__LazyJVMKt.lazy(new Function0<ViewStub>() { // from class: com.heytap.store.homemodule.widget.VideoCardView$videoView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final ViewStub invoke() {
                return (ViewStub) this.this$0.findViewById(R.id.card_form_video_view);
            }
        });
        LayoutInflater.from(context).inflate(R.layout.pf_home_video_card_view, (ViewGroup) this, true);
        videoPlayerViewWrapper.viewStubInflate(getVideoView());
    }
}
