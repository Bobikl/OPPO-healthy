package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.qva, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/qva;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "b", "Ljava/lang/String;", "()Ljava/lang/String;", "text", "<init>", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LegendPair {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Drawable drawable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String text;

    public LegendPair(@Nullable Drawable drawable, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.drawable = drawable;
        this.text = text;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegendPair)) {
            return false;
        }
        LegendPair legendPair = (LegendPair) other;
        return Intrinsics.areEqual(this.drawable, legendPair.drawable) && Intrinsics.areEqual(this.text, legendPair.text);
    }

    public int hashCode() {
        Drawable drawable = this.drawable;
        return ((drawable == null ? 0 : drawable.hashCode()) * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "LegendPair(drawable=" + this.drawable + ", text=" + this.text + ")";
    }
}
