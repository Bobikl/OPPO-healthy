package androidx.window.embedding;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001a\u001a\u00020\rH\u0016R\u0013\u0010\n\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/window/embedding/SplitAttributesCalculatorParams;", "", "parentWindowMetrics", "Landroidx/window/layout/WindowMetrics;", "parentConfiguration", "Landroid/content/res/Configuration;", "parentWindowLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "defaultSplitAttributes", "Landroidx/window/embedding/SplitAttributes;", "areDefaultConstraintsSatisfied", "", "splitRuleTag", "", "(Landroidx/window/layout/WindowMetrics;Landroid/content/res/Configuration;Landroidx/window/layout/WindowLayoutInfo;Landroidx/window/embedding/SplitAttributes;ZLjava/lang/String;)V", "()Z", "getDefaultSplitAttributes", "()Landroidx/window/embedding/SplitAttributes;", "getParentConfiguration", "()Landroid/content/res/Configuration;", "getParentWindowLayoutInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "getParentWindowMetrics", "()Landroidx/window/layout/WindowMetrics;", "getSplitRuleTag", "()Ljava/lang/String;", "toString", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SplitAttributesCalculatorParams {
    private final boolean areDefaultConstraintsSatisfied;

    @NotNull
    private final SplitAttributes defaultSplitAttributes;

    /* JADX INFO: renamed from: parentConfiguration, reason: from kotlin metadata and from toString */
    @NotNull
    private final Configuration configuration;

    /* JADX INFO: renamed from: parentWindowLayoutInfo, reason: from kotlin metadata and from toString */
    @NotNull
    private final WindowLayoutInfo windowLayoutInfo;

    @NotNull
    private final WindowMetrics parentWindowMetrics;

    /* JADX INFO: renamed from: splitRuleTag, reason: from kotlin metadata and from toString */
    @Nullable
    private final String tag;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SplitAttributesCalculatorParams(@NotNull WindowMetrics parentWindowMetrics, @NotNull Configuration parentConfiguration, @NotNull WindowLayoutInfo parentWindowLayoutInfo, @NotNull SplitAttributes defaultSplitAttributes, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(parentWindowMetrics, "parentWindowMetrics");
        Intrinsics.checkNotNullParameter(parentConfiguration, "parentConfiguration");
        Intrinsics.checkNotNullParameter(parentWindowLayoutInfo, "parentWindowLayoutInfo");
        Intrinsics.checkNotNullParameter(defaultSplitAttributes, "defaultSplitAttributes");
        this.parentWindowMetrics = parentWindowMetrics;
        this.configuration = parentConfiguration;
        this.windowLayoutInfo = parentWindowLayoutInfo;
        this.defaultSplitAttributes = defaultSplitAttributes;
        this.areDefaultConstraintsSatisfied = z;
        this.tag = str;
    }

    @JvmName(name = "areDefaultConstraintsSatisfied")
    /* JADX INFO: renamed from: areDefaultConstraintsSatisfied, reason: from getter */
    public final boolean getAreDefaultConstraintsSatisfied() {
        return this.areDefaultConstraintsSatisfied;
    }

    @NotNull
    public final SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }

    @NotNull
    /* JADX INFO: renamed from: getParentConfiguration, reason: from getter */
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    @NotNull
    /* JADX INFO: renamed from: getParentWindowLayoutInfo, reason: from getter */
    public final WindowLayoutInfo getWindowLayoutInfo() {
        return this.windowLayoutInfo;
    }

    @NotNull
    public final WindowMetrics getParentWindowMetrics() {
        return this.parentWindowMetrics;
    }

    @Nullable
    /* JADX INFO: renamed from: getSplitRuleTag, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public String toString() {
        return SplitAttributesCalculatorParams.class.getSimpleName() + ":{windowMetrics=" + this.parentWindowMetrics + ", configuration=" + this.configuration + ", windowLayoutInfo=" + this.windowLayoutInfo + ", defaultSplitAttributes=" + this.defaultSplitAttributes + ", areDefaultConstraintsSatisfied=" + this.areDefaultConstraintsSatisfied + ", tag=" + this.tag + '}';
    }
}
