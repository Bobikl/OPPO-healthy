package com.coui.component.responsiveui.unit;

import android.content.Context;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/coui/component/responsiveui/unit/Dp;", "", "Landroid/content/Context;", "context", "", "toPixel", "other", "", "compareTo", "plus", "minus", "div", "", "equals", "hashCode", "", "toString", "a", UserInfo.SEX_FEMALE, "getValue", "()F", "value", "<init>", "(F)V", "Companion", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
public final class Dp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float value;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/coui/component/responsiveui/unit/Dp$Companion;", "", "()V", "pixel2Dp", "Lcom/coui/component/responsiveui/unit/Dp;", "context", "Landroid/content/Context;", "pixel", "", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Dp pixel2Dp(@NotNull Context context, int pixel) {
            Intrinsics.checkNotNullParameter(context, "context");
            return DpKt.pixel2Dp(pixel, context);
        }
    }

    public Dp(float f) {
        this.value = f;
    }

    public final int compareTo(@NotNull Dp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Float.compare(this.value, other.value);
    }

    @NotNull
    public final Dp div(@NotNull Dp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Dp(this.value / other.value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && Dp.class == other.getClass() && Float.compare(this.value, ((Dp) other).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @NotNull
    public final Dp minus(@NotNull Dp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Dp(this.value - other.value);
    }

    @NotNull
    public final Dp plus(@NotNull Dp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Dp(this.value + other.value);
    }

    public final float toPixel(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.value * context.getResources().getDisplayMetrics().density;
    }

    @NotNull
    public String toString() {
        return this.value + " dp";
    }
}
