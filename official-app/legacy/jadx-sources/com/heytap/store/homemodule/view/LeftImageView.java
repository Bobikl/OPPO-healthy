package com.heytap.store.homemodule.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.heytap.store.base.core.view.LoadImageView;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.imageloader.LoadStep;
import com.oplus.aiunit.vision.hc3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/homemodule/view/LeftImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Landroid/widget/ImageView;", "lotieImageView", "Lcom/heytap/store/base/core/view/LoadImageView;", "setImageResource", "", "url", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LeftImageView extends FrameLayout {

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final LoadImageView lotieImageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeftImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        LoadImageView loadImageView = new LoadImageView(context2);
        this.lotieImageView = loadImageView;
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        addView(loadImageView, -1, -1);
        addView(imageView, -1, -1);
    }

    public final void setImageResource(@Nullable String url) {
        if (url == null || url.length() == 0) {
            this.lotieImageView.setVisibility(8);
            this.imageView.setVisibility(8);
        } else if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) hc3.CLASSIC_CONFIG_SUFFIX, false, 2, (Object) null)) {
            this.lotieImageView.setImageResource(url);
            this.lotieImageView.setVisibility(0);
            this.imageView.setVisibility(8);
        } else {
            LoadStep.into$default(ImageLoader.load(url).scaleType(ImageView.ScaleType.CENTER_CROP), this.imageView, null, 2, null);
            this.lotieImageView.setVisibility(8);
            this.imageView.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeftImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        LoadImageView loadImageView = new LoadImageView(context2);
        this.lotieImageView = loadImageView;
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        addView(loadImageView, -1, -1);
        addView(imageView, -1, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeftImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        LoadImageView loadImageView = new LoadImageView(context2);
        this.lotieImageView = loadImageView;
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        addView(loadImageView, -1, -1);
        addView(imageView, -1, -1);
    }
}
