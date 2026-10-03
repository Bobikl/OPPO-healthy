package com.heytap.health.insight.signs;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.JsonObject;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/insight/signs/Info;", "", "plots", "", "Lcom/heytap/health/insight/signs/Plot;", "dict", "Lcom/google/gson/JsonObject;", "(Ljava/util/List;Lcom/google/gson/JsonObject;)V", "getDict", "()Lcom/google/gson/JsonObject;", "getPlots", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Info {
    public static final int $stable = 8;

    @Nullable
    private final JsonObject dict;

    @NotNull
    private final List<Plot> plots;

    public Info(@NotNull List<Plot> plots, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(plots, "plots");
        this.plots = plots;
        this.dict = jsonObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Info copy$default(Info info, List list, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            list = info.plots;
        }
        if ((i & 2) != 0) {
            jsonObject = info.dict;
        }
        return info.copy(list, jsonObject);
    }

    @NotNull
    public final List<Plot> component1() {
        return this.plots;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getDict() {
        return this.dict;
    }

    @NotNull
    public final Info copy(@NotNull List<Plot> plots, @Nullable JsonObject dict) {
        Intrinsics.checkNotNullParameter(plots, "plots");
        return new Info(plots, dict);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Info)) {
            return false;
        }
        Info info = (Info) other;
        return Intrinsics.areEqual(this.plots, info.plots) && Intrinsics.areEqual(this.dict, info.dict);
    }

    @Nullable
    public final JsonObject getDict() {
        return this.dict;
    }

    @NotNull
    public final List<Plot> getPlots() {
        return this.plots;
    }

    public int hashCode() {
        int iHashCode = this.plots.hashCode() * 31;
        JsonObject jsonObject = this.dict;
        return iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "Info(plots=" + this.plots + ", dict=" + this.dict + ")";
    }
}
