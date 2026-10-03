package com.heytap.store.business.component.widget;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.a;
import com.bumptech.glide.load.DecodeFormat;
import com.heytap.store.business.component.R;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerViewWrapper;
import com.oplus.aiunit.vision.ut5;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u001aR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/heytap/store/business/component/widget/VideoCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "itemCorners", "", "(Landroid/content/Context;Landroid/util/AttributeSet;IF)V", "imgView", "Landroid/widget/ImageView;", "getImgView", "()Landroid/widget/ImageView;", "imgView$delegate", "Lkotlin/Lazy;", "videoView", "Landroid/view/View;", "getVideoView", "()Landroid/view/View;", "videoViewWrapper", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerViewWrapper;", "getVideoViewWrapper", "()Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerViewWrapper;", "hidePlayerView", "", "onPause", "setImgUrl", "url", "", "setImgVisible", "visible", "startPlay", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoCardView extends ConstraintLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    /* JADX INFO: renamed from: imgView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy imgView;

    @Nullable
    private final View videoView;

    @NotNull
    private final VideoPlayerViewWrapper videoViewWrapper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoCardView(@NotNull Context context, float f) {
        this(context, null, 0, f, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @NotNull
    public final ImageView getImgView() {
        Object value = this.imgView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imgView>(...)");
        return (ImageView) value;
    }

    @Nullable
    public final View getVideoView() {
        return this.videoView;
    }

    @NotNull
    public final VideoPlayerViewWrapper getVideoViewWrapper() {
        return this.videoViewWrapper;
    }

    public final void hidePlayerView() {
        View view = this.videoView;
        if (view != null) {
            view.setVisibility(4);
        }
        getImgView().setVisibility(0);
    }

    public final void onPause() {
        View view = this.videoView;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    public final void setImgUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        a.v(getContext()).q(url).u(DecodeFormat.PREFER_ARGB_8888).j(ut5.RESOURCE).Q0(getImgView());
        setImgVisible(0);
    }

    public final void setImgVisible(int visible) {
        getImgView().setVisibility(visible);
    }

    public final void startPlay() {
        View view = this.videoView;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, float f) {
        this(context, attributeSet, 0, f, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoCardView(Context context, AttributeSet attributeSet, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i, f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, final float f) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imgView = LazyKt__LazyJVMKt.lazy(new Function0<ImageView>() { // from class: com.heytap.store.business.component.widget.VideoCardView$imgView$2
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
        LayoutInflater.from(context).inflate(R.layout.pf_heytap_business_widget_video_card_view, (ViewGroup) this, true);
        ((ImageView) findViewById(R.id.card_img_view)).setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.store.business.component.widget.VideoCardView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view, @NotNull Outline outline) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), f);
                view.setClipToOutline(true);
            }
        });
        ViewStub stub = (ViewStub) findViewById(R.id.card_form_video_view);
        Intrinsics.checkNotNullExpressionValue(stub, "stub");
        videoPlayerViewWrapper.viewStubInflate(stub);
        View view = videoPlayerViewWrapper.getView();
        this.videoView = view;
        if (view != null) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.store.business.component.widget.VideoCardView.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(@NotNull View view2, @NotNull Outline outline) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    Intrinsics.checkNotNullParameter(outline, "outline");
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f - 3);
                    view2.setClipToOutline(true);
                }
            });
        }
        this._$_findViewCache = new LinkedHashMap();
    }
}
