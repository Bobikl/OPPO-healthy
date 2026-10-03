package com.oplus.deepthinker.sdk.app.userprofile.labels;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/AppPreferenceLabel;", "", "result", "", "", "", "generateTime", "", "(Ljava/util/Map;J)V", "getGenerateTime", "()J", "setGenerateTime", "(J)V", "getResult", "()Ljava/util/Map;", "setResult", "(Ljava/util/Map;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AppPreferenceLabel {
    private long generateTime;

    @NotNull
    private Map<String, Double> result;

    public AppPreferenceLabel() {
        this(null, 0L, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppPreferenceLabel copy$default(AppPreferenceLabel appPreferenceLabel, Map map, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = appPreferenceLabel.result;
        }
        if ((i & 2) != 0) {
            j2 = appPreferenceLabel.generateTime;
        }
        return appPreferenceLabel.copy(map, j2);
    }

    @NotNull
    public final Map<String, Double> component1() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final AppPreferenceLabel copy(@NotNull Map<String, Double> result, long generateTime) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new AppPreferenceLabel(result, generateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppPreferenceLabel)) {
            return false;
        }
        AppPreferenceLabel appPreferenceLabel = (AppPreferenceLabel) other;
        return Intrinsics.areEqual(this.result, appPreferenceLabel.result) && this.generateTime == appPreferenceLabel.generateTime;
    }

    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final Map<String, Double> getResult() {
        return this.result;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + Long.hashCode(this.generateTime);
    }

    public final void setGenerateTime(long j2) {
        this.generateTime = j2;
    }

    public final void setResult(@NotNull Map<String, Double> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.result = map;
    }

    @NotNull
    public String toString() {
        return "AppPreferenceLabel(result=" + this.result + ", generateTime=" + this.generateTime + ')';
    }

    public AppPreferenceLabel(@NotNull Map<String, Double> result, long j2) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.generateTime = j2;
    }

    public /* synthetic */ AppPreferenceLabel(Map map, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 2) != 0 ? 0L : j2);
    }
}
