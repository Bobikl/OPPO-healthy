package com.heytap.store.platform.imageloader;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/heytap/store/platform/imageloader/Options;", "", "()V", "failureDrawable", "Landroid/graphics/drawable/Drawable;", "getFailureDrawable", "()Landroid/graphics/drawable/Drawable;", "setFailureDrawable", "(Landroid/graphics/drawable/Drawable;)V", "failureResId", "", "getFailureResId", "()I", "setFailureResId", "(I)V", "placeholderColorResId", "getPlaceholderColorResId", "setPlaceholderColorResId", "placeholderDrawable", "getPlaceholderDrawable", "setPlaceholderDrawable", "placeholderResId", "getPlaceholderResId", "setPlaceholderResId", "resizeOptions", "Lcom/heytap/store/platform/imageloader/ResizeOptions;", "getResizeOptions", "()Lcom/heytap/store/platform/imageloader/ResizeOptions;", "setResizeOptions", "(Lcom/heytap/store/platform/imageloader/ResizeOptions;)V", "roundParams", "Lcom/heytap/store/platform/imageloader/RoundParams;", "getRoundParams", "()Lcom/heytap/store/platform/imageloader/RoundParams;", "setRoundParams", "(Lcom/heytap/store/platform/imageloader/RoundParams;)V", ParserTag.TAG_SCALE_TYPE, "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public class Options {

    @Nullable
    private Drawable failureDrawable;

    @Nullable
    private Drawable placeholderDrawable;

    @Nullable
    private ResizeOptions resizeOptions;

    @Nullable
    private RoundParams roundParams;

    @Nullable
    private ImageView.ScaleType scaleType;
    private int placeholderResId = -1;
    private int placeholderColorResId = -1;
    private int failureResId = -1;

    @Nullable
    public final Drawable getFailureDrawable() {
        return this.failureDrawable;
    }

    public final int getFailureResId() {
        return this.failureResId;
    }

    public final int getPlaceholderColorResId() {
        return this.placeholderColorResId;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderResId() {
        return this.placeholderResId;
    }

    @Nullable
    public final ResizeOptions getResizeOptions() {
        return this.resizeOptions;
    }

    @Nullable
    public final RoundParams getRoundParams() {
        return this.roundParams;
    }

    @Nullable
    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    public final void setFailureDrawable(@Nullable Drawable drawable) {
        this.failureDrawable = drawable;
    }

    public final void setFailureResId(int i) {
        this.failureResId = i;
    }

    public final void setPlaceholderColorResId(int i) {
        this.placeholderColorResId = i;
    }

    public final void setPlaceholderDrawable(@Nullable Drawable drawable) {
        this.placeholderDrawable = drawable;
    }

    public final void setPlaceholderResId(int i) {
        this.placeholderResId = i;
    }

    public final void setResizeOptions(@Nullable ResizeOptions resizeOptions) {
        this.resizeOptions = resizeOptions;
    }

    public final void setRoundParams(@Nullable RoundParams roundParams) {
        this.roundParams = roundParams;
    }

    public final void setScaleType(@Nullable ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }
}
