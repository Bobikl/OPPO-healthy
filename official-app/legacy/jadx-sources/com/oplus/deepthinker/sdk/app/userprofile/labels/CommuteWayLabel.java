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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B=\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J?\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/CommuteWayLabel;", "", "", "", "", "component1", "component2", "", "component3", "home2Company", "company2Home", "generateTime", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getHome2Company", "()Ljava/util/Map;", "setHome2Company", "(Ljava/util/Map;)V", "getCompany2Home", "setCompany2Home", "J", "getGenerateTime", "()J", "setGenerateTime", "(J)V", "<init>", "(Ljava/util/Map;Ljava/util/Map;J)V", "Companion", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class CommuteWayLabel {

    @NotNull
    public static final String BUS_TAG = "bus";

    @NotNull
    public static final String DRIVE_TAG = "drive";

    @NotNull
    public static final String PUBLIC_RIDE_TAG = "public_ride";

    @NotNull
    public static final String SELF_RIDE_TAG = "self_ride";

    @NotNull
    public static final String SUBWAY_TAG = "subway";

    @NotNull
    public static final String TAXI_TAG = "taxi";

    @NotNull
    public static final String UNKNOWN_TAG = "unknown";

    @NotNull
    private Map<String, Double> company2Home;
    private long generateTime;

    @NotNull
    private Map<String, Double> home2Company;

    public CommuteWayLabel() {
        this(null, null, 0L, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommuteWayLabel copy$default(CommuteWayLabel commuteWayLabel, Map map, Map map2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = commuteWayLabel.home2Company;
        }
        if ((i & 2) != 0) {
            map2 = commuteWayLabel.company2Home;
        }
        if ((i & 4) != 0) {
            j2 = commuteWayLabel.generateTime;
        }
        return commuteWayLabel.copy(map, map2, j2);
    }

    @NotNull
    public final Map<String, Double> component1() {
        return this.home2Company;
    }

    @NotNull
    public final Map<String, Double> component2() {
        return this.company2Home;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final CommuteWayLabel copy(@NotNull Map<String, Double> home2Company, @NotNull Map<String, Double> company2Home, long generateTime) {
        Intrinsics.checkNotNullParameter(home2Company, "home2Company");
        Intrinsics.checkNotNullParameter(company2Home, "company2Home");
        return new CommuteWayLabel(home2Company, company2Home, generateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommuteWayLabel)) {
            return false;
        }
        CommuteWayLabel commuteWayLabel = (CommuteWayLabel) other;
        return Intrinsics.areEqual(this.home2Company, commuteWayLabel.home2Company) && Intrinsics.areEqual(this.company2Home, commuteWayLabel.company2Home) && this.generateTime == commuteWayLabel.generateTime;
    }

    @NotNull
    public final Map<String, Double> getCompany2Home() {
        return this.company2Home;
    }

    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final Map<String, Double> getHome2Company() {
        return this.home2Company;
    }

    public int hashCode() {
        return (((this.home2Company.hashCode() * 31) + this.company2Home.hashCode()) * 31) + Long.hashCode(this.generateTime);
    }

    public final void setCompany2Home(@NotNull Map<String, Double> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.company2Home = map;
    }

    public final void setGenerateTime(long j2) {
        this.generateTime = j2;
    }

    public final void setHome2Company(@NotNull Map<String, Double> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.home2Company = map;
    }

    @NotNull
    public String toString() {
        return "CommuteWayLabel(home2Company=" + this.home2Company + ", company2Home=" + this.company2Home + ", generateTime=" + this.generateTime + ')';
    }

    public CommuteWayLabel(@NotNull Map<String, Double> home2Company, @NotNull Map<String, Double> company2Home, long j2) {
        Intrinsics.checkNotNullParameter(home2Company, "home2Company");
        Intrinsics.checkNotNullParameter(company2Home, "company2Home");
        this.home2Company = home2Company;
        this.company2Home = company2Home;
        this.generateTime = j2;
    }

    public /* synthetic */ CommuteWayLabel(Map map, Map map2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map2, (i & 4) != 0 ? 0L : j2);
    }
}
