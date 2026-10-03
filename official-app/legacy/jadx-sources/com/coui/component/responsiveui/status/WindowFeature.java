package com.coui.component.responsiveui.status;

import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/coui/component/responsiveui/status/WindowFeature;", "", "", "toString", "", "Landroidx/window/layout/DisplayFeature;", "component1", "Landroidx/window/layout/FoldingFeature;", "component2", "displayFeatureList", "foldingFeatureList", "copy", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getDisplayFeatureList", "()Ljava/util/List;", "b", "getFoldingFeatureList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WindowFeature {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<DisplayFeature> displayFeatureList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<FoldingFeature> foldingFeatureList;

    /* JADX WARN: Multi-variable type inference failed */
    public WindowFeature() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WindowFeature copy$default(WindowFeature windowFeature, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = windowFeature.displayFeatureList;
        }
        if ((i & 2) != 0) {
            list2 = windowFeature.foldingFeatureList;
        }
        return windowFeature.copy(list, list2);
    }

    @NotNull
    public final List<DisplayFeature> component1() {
        return this.displayFeatureList;
    }

    @NotNull
    public final List<FoldingFeature> component2() {
        return this.foldingFeatureList;
    }

    @NotNull
    public final WindowFeature copy(@NotNull List<? extends DisplayFeature> displayFeatureList, @NotNull List<? extends FoldingFeature> foldingFeatureList) {
        Intrinsics.checkNotNullParameter(displayFeatureList, "displayFeatureList");
        Intrinsics.checkNotNullParameter(foldingFeatureList, "foldingFeatureList");
        return new WindowFeature(displayFeatureList, foldingFeatureList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WindowFeature)) {
            return false;
        }
        WindowFeature windowFeature = (WindowFeature) other;
        return Intrinsics.areEqual(this.displayFeatureList, windowFeature.displayFeatureList) && Intrinsics.areEqual(this.foldingFeatureList, windowFeature.foldingFeatureList);
    }

    @NotNull
    public final List<DisplayFeature> getDisplayFeatureList() {
        return this.displayFeatureList;
    }

    @NotNull
    public final List<FoldingFeature> getFoldingFeatureList() {
        return this.foldingFeatureList;
    }

    public int hashCode() {
        return (this.displayFeatureList.hashCode() * 31) + this.foldingFeatureList.hashCode();
    }

    @NotNull
    public String toString() {
        return "WindowFeature { displayFeature = " + this.displayFeatureList + ", foldingFeature = " + this.foldingFeatureList + " }";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowFeature(@NotNull List<? extends DisplayFeature> displayFeatureList, @NotNull List<? extends FoldingFeature> foldingFeatureList) {
        Intrinsics.checkNotNullParameter(displayFeatureList, "displayFeatureList");
        Intrinsics.checkNotNullParameter(foldingFeatureList, "foldingFeatureList");
        this.displayFeatureList = displayFeatureList;
        this.foldingFeatureList = foldingFeatureList;
    }

    public /* synthetic */ WindowFeature(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
