package com.heytap.health.insight.signs;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/insight/signs/Plot;", "", "code", "", "value", "", "(Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getValue", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Plot {
    public static final int $stable = 8;

    @NotNull
    private final String code;

    @NotNull
    private final List<String> value;

    public Plot(@NotNull String code, @NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(value, "value");
        this.code = code;
        this.value = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Plot copy$default(Plot plot, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plot.code;
        }
        if ((i & 2) != 0) {
            list = plot.value;
        }
        return plot.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final List<String> component2() {
        return this.value;
    }

    @NotNull
    public final Plot copy(@NotNull String code, @NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Plot(code, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Plot)) {
            return false;
        }
        Plot plot = (Plot) other;
        return Intrinsics.areEqual(this.code, plot.code) && Intrinsics.areEqual(this.value, plot.value);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final List<String> getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "Plot(code=" + this.code + ", value=" + this.value + ")";
    }
}
