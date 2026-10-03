package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wvl, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/wvl;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/hta;", "a", "Lcom/oplus/aiunit/vision/hta;", "b", "()Lcom/oplus/aiunit/vision/hta;", "title", "", "Lcom/oplus/aiunit/vision/tvl;", "Ljava/util/List;", "()Ljava/util/List;", "items", "<init>", "(Lcom/oplus/aiunit/vision/hta;Ljava/util/List;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WidgetSupportConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final LangDesc title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("items")
    @NotNull
    private final List<WidgetConfigItem> items;

    public WidgetSupportConfig(@NotNull LangDesc title, @NotNull List<WidgetConfigItem> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.items = items;
    }

    @NotNull
    public final List<WidgetConfigItem> a() {
        return this.items;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final LangDesc getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetSupportConfig)) {
            return false;
        }
        WidgetSupportConfig widgetSupportConfig = (WidgetSupportConfig) other;
        return Intrinsics.areEqual(this.title, widgetSupportConfig.title) && Intrinsics.areEqual(this.items, widgetSupportConfig.items);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "WidgetSupportConfig(title=" + this.title + ", items=" + this.items + ")";
    }
}
