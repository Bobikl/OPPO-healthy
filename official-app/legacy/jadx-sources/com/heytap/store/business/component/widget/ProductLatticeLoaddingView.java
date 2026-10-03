package com.heytap.store.business.component.widget;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.imageloader.LoadStep;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oplus.aiunit.vision.hc3;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u000eH\u0002J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0015J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/heytap/store/business/component/widget/ProductLatticeLoaddingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", ParserTag.AUTO_PLAY, "", "drawableId", "draweeView", "Landroid/widget/ImageView;", "url", "", "intoTarget", "", "isJsonImg", "isJson", "loadUrl", "onDestroyView", "removeChildView", "setImageResource", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ProductLatticeLoaddingView extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private LottieAnimationView animationView;
    private boolean autoPlay;
    private int drawableId;

    @Nullable
    private ImageView draweeView;

    @NotNull
    private String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductLatticeLoaddingView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.url = "";
        this.drawableId = -1;
        this.autoPlay = true;
        this._$_findViewCache = new LinkedHashMap();
    }

    public static /* synthetic */ ProductLatticeLoaddingView autoPlay$default(ProductLatticeLoaddingView productLatticeLoaddingView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return productLatticeLoaddingView.autoPlay(z);
    }

    private final ProductLatticeLoaddingView isJsonImg(boolean isJson) {
        if (getChildCount() > 0) {
            removeChildView();
        }
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (isJson) {
            if (this.animationView == null) {
                LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
                this.animationView = lottieAnimationView;
                addView(lottieAnimationView, layoutParams);
            }
            return this;
        }
        if (this.draweeView == null) {
            ImageView imageView = new ImageView(getContext());
            this.draweeView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(this.draweeView, layoutParams);
        }
        return this;
    }

    public static /* synthetic */ ProductLatticeLoaddingView isJsonImg$default(ProductLatticeLoaddingView productLatticeLoaddingView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return productLatticeLoaddingView.isJsonImg(z);
    }

    private final void removeChildView() {
        LottieAnimationView lottieAnimationView = this.animationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.pauseAnimation();
        }
        this.animationView = null;
        this.draweeView = null;
        removeAllViews();
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
    public final ProductLatticeLoaddingView autoPlay(boolean autoPlay) {
        this.autoPlay = autoPlay;
        return this;
    }

    public final void intoTarget() {
        if (this.draweeView == null && this.animationView == null) {
            throw new RuntimeException("SimpleDraweeView or LottieAnimationView  must not be null,You need to call the LoadImageView#isJsonImg() method");
        }
        if (StringsKt__StringsJVMKt.endsWith$default(this.url, hc3.CLASSIC_CONFIG_SUFFIX, false, 2, null)) {
            LottieAnimationView lottieAnimationView = this.animationView;
            if (lottieAnimationView == null) {
                return;
            }
            if (this.autoPlay) {
                lottieAnimationView.setRepeatCount(-1);
            }
            lottieAnimationView.setAnimationFromUrl(this.url);
            lottieAnimationView.enableMergePathsForKitKatAndAbove(true);
            lottieAnimationView.playAnimation();
            return;
        }
        ImageView imageView = this.draweeView;
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.url) && StringsKt__StringsJVMKt.startsWith$default(this.url, "res://", false, 2, null)) {
            Uri parse = Uri.parse(this.url);
            Intrinsics.checkNotNullExpressionValue(parse, "parse");
            LoadStep.into$default(ImageLoader.load(parse), imageView, null, 2, null);
        } else if (this.drawableId != -1) {
            LoadStep.into$default(ImageLoader.load(ContextGetterUtils.INSTANCE.getApp(), this.drawableId), imageView, null, 2, null);
        } else {
            LoadStep.into$default(ImageLoader.load(this.url), imageView, null, 2, null);
        }
    }

    @NotNull
    public final ProductLatticeLoaddingView loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        boolean z = false;
        if (!TextUtils.isEmpty(url) && StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) hc3.CLASSIC_CONFIG_SUFFIX, false, 2, (Object) null)) {
            String strSubstring = url.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) url, hc3.CLASSIC_CONFIG_SUFFIX, 0, false, 6, (Object) null) + 5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.url = strSubstring;
            z = true;
        }
        isJsonImg(z);
        return this;
    }

    public final void onDestroyView() {
        removeChildView();
    }

    public final void setImageResource(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (TextUtils.isEmpty(url)) {
            if (getChildCount() > 0) {
                removeChildView();
                return;
            }
            return;
        }
        this.url = url;
        boolean z = false;
        if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) hc3.CLASSIC_CONFIG_SUFFIX, false, 2, (Object) null)) {
            String strSubstring = url.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) url, hc3.CLASSIC_CONFIG_SUFFIX, 0, false, 6, (Object) null) + 5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.url = strSubstring;
            z = true;
        }
        isJsonImg(z);
        intoTarget();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductLatticeLoaddingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.url = "";
        this.drawableId = -1;
        this.autoPlay = true;
        this._$_findViewCache = new LinkedHashMap();
    }

    @NotNull
    public final ProductLatticeLoaddingView loadUrl(int drawableId) {
        this.drawableId = drawableId;
        isJsonImg(false);
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductLatticeLoaddingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.url = "";
        this.drawableId = -1;
        this.autoPlay = true;
        this._$_findViewCache = new LinkedHashMap();
    }

    public final void setImageResource(int drawableId) {
        this.drawableId = drawableId;
        isJsonImg(false);
        intoTarget();
    }
}
