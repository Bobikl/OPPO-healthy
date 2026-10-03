package com.heytap.store.homemodule.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeDataCheckResult;", "", "hasChange", "", "isRemove", "homeComponent", "Lorg/json/JSONObject;", "failReason", "", "(ZZLorg/json/JSONObject;Ljava/lang/String;)V", "getFailReason", "()Ljava/lang/String;", "getHasChange", "()Z", "getHomeComponent", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeDataCheckResult {

    @NotNull
    private final String failReason;
    private final boolean hasChange;

    @NotNull
    private final JSONObject homeComponent;
    private final boolean isRemove;

    public HomeDataCheckResult(boolean z, boolean z2, @NotNull JSONObject homeComponent, @NotNull String failReason) {
        Intrinsics.checkNotNullParameter(homeComponent, "homeComponent");
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        this.hasChange = z;
        this.isRemove = z2;
        this.homeComponent = homeComponent;
        this.failReason = failReason;
    }

    public static /* synthetic */ HomeDataCheckResult copy$default(HomeDataCheckResult homeDataCheckResult, boolean z, boolean z2, JSONObject jSONObject, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = homeDataCheckResult.hasChange;
        }
        if ((i & 2) != 0) {
            z2 = homeDataCheckResult.isRemove;
        }
        if ((i & 4) != 0) {
            jSONObject = homeDataCheckResult.homeComponent;
        }
        if ((i & 8) != 0) {
            str = homeDataCheckResult.failReason;
        }
        return homeDataCheckResult.copy(z, z2, jSONObject, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasChange() {
        return this.hasChange;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRemove() {
        return this.isRemove;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JSONObject getHomeComponent() {
        return this.homeComponent;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFailReason() {
        return this.failReason;
    }

    @NotNull
    public final HomeDataCheckResult copy(boolean hasChange, boolean isRemove, @NotNull JSONObject homeComponent, @NotNull String failReason) {
        Intrinsics.checkNotNullParameter(homeComponent, "homeComponent");
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        return new HomeDataCheckResult(hasChange, isRemove, homeComponent, failReason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeDataCheckResult)) {
            return false;
        }
        HomeDataCheckResult homeDataCheckResult = (HomeDataCheckResult) other;
        return this.hasChange == homeDataCheckResult.hasChange && this.isRemove == homeDataCheckResult.isRemove && Intrinsics.areEqual(this.homeComponent, homeDataCheckResult.homeComponent) && Intrinsics.areEqual(this.failReason, homeDataCheckResult.failReason);
    }

    @NotNull
    public final String getFailReason() {
        return this.failReason;
    }

    public final boolean getHasChange() {
        return this.hasChange;
    }

    @NotNull
    public final JSONObject getHomeComponent() {
        return this.homeComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        boolean z = this.hasChange;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isRemove;
        return ((((i + (z2 ? 1 : z2)) * 31) + this.homeComponent.hashCode()) * 31) + this.failReason.hashCode();
    }

    public final boolean isRemove() {
        return this.isRemove;
    }

    @NotNull
    public String toString() {
        return "HomeDataCheckResult(hasChange=" + this.hasChange + ", isRemove=" + this.isRemove + ", homeComponent=" + this.homeComponent + ", failReason=" + this.failReason + ')';
    }
}
