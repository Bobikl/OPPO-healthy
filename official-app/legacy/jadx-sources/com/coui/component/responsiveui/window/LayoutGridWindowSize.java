package com.coui.component.responsiveui.window;

import android.content.Context;
import com.coui.component.responsiveui.unit.Dp;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u000b\u001a\u00020\u001d\u0012\u0006\u0010\f\u001a\u00020\u001d¢\u0006\u0004\b\u0017\u0010\u001eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/coui/component/responsiveui/window/LayoutGridWindowSize;", "", "other", "", "equals", "", "hashCode", "", "toString", "component1", "component2", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "copy", "a", "I", "getWidth", "()I", "setWidth", "(I)V", "b", "getHeight", "setHeight", "<init>", "(II)V", "windowSize", "(Lcom/coui/component/responsiveui/window/LayoutGridWindowSize;)V", "Landroid/content/Context;", "context", "Lcom/coui/component/responsiveui/unit/Dp;", "(Landroid/content/Context;Lcom/coui/component/responsiveui/unit/Dp;Lcom/coui/component/responsiveui/unit/Dp;)V", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LayoutGridWindowSize {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int height;

    public LayoutGridWindowSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ LayoutGridWindowSize copy$default(LayoutGridWindowSize layoutGridWindowSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = layoutGridWindowSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = layoutGridWindowSize.height;
        }
        return layoutGridWindowSize.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final LayoutGridWindowSize copy(int width, int height) {
        return new LayoutGridWindowSize(width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && LayoutGridWindowSize.class == other.getClass()) {
            LayoutGridWindowSize layoutGridWindowSize = (LayoutGridWindowSize) other;
            if (this.width == layoutGridWindowSize.width && this.height == layoutGridWindowSize.height) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @NotNull
    public String toString() {
        return "(width = " + this.width + ", height = " + this.height + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LayoutGridWindowSize(@NotNull LayoutGridWindowSize windowSize) {
        this(windowSize.width, windowSize.height);
        Intrinsics.checkNotNullParameter(windowSize, "windowSize");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LayoutGridWindowSize(@NotNull Context context, @NotNull Dp width, @NotNull Dp height) {
        this((int) width.toPixel(context), (int) height.toPixel(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(width, "width");
        Intrinsics.checkNotNullParameter(height, "height");
    }
}
