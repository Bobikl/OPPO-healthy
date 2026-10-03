package com.heytap.health.health_archives.bean;

import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/bean/IndicatorTagBean;", "", "tagText", "", "background", "Landroid/graphics/drawable/Drawable;", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "getBackground", "()Landroid/graphics/drawable/Drawable;", ClickApiEntity.SET_BACKGROUND, "(Landroid/graphics/drawable/Drawable;)V", "getTagText", "()Ljava/lang/String;", "setTagText", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IndicatorTagBean {

    @NotNull
    private Drawable background;

    @NotNull
    private String tagText;

    public IndicatorTagBean(@NotNull String tagText, @NotNull Drawable background) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(background, "background");
        this.tagText = tagText;
        this.background = background;
    }

    public static /* synthetic */ IndicatorTagBean copy$default(IndicatorTagBean indicatorTagBean, String str, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorTagBean.tagText;
        }
        if ((i & 2) != 0) {
            drawable = indicatorTagBean.background;
        }
        return indicatorTagBean.copy(str, drawable);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTagText() {
        return this.tagText;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getBackground() {
        return this.background;
    }

    @NotNull
    public final IndicatorTagBean copy(@NotNull String tagText, @NotNull Drawable background) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(background, "background");
        return new IndicatorTagBean(tagText, background);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorTagBean)) {
            return false;
        }
        IndicatorTagBean indicatorTagBean = (IndicatorTagBean) other;
        return Intrinsics.areEqual(this.tagText, indicatorTagBean.tagText) && Intrinsics.areEqual(this.background, indicatorTagBean.background);
    }

    @NotNull
    public final Drawable getBackground() {
        return this.background;
    }

    @NotNull
    public final String getTagText() {
        return this.tagText;
    }

    public int hashCode() {
        return (this.tagText.hashCode() * 31) + this.background.hashCode();
    }

    public final void setBackground(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "<set-?>");
        this.background = drawable;
    }

    public final void setTagText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagText = str;
    }

    @NotNull
    public String toString() {
        return "IndicatorTagBean(tagText=" + this.tagText + ", background=" + this.background + ")";
    }
}
