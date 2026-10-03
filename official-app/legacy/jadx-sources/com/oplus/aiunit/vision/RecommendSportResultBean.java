package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.recommend.bean.Data2;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.tff, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/tff;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "sportName", "b", "duration", "c", "getDurationDetail", "durationDetail", "hr", "Lcom/heytap/sports/recommend/bean/Data2;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/sports/recommend/bean/Data2;", "()Lcom/heytap/sports/recommend/bean/Data2;", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/sports/recommend/bean/Data2;)V", "recommend_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RecommendSportResultBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String sportName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String durationDetail;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String hr;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Data2 origin;

    public RecommendSportResultBean(@NotNull String sportName, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Data2 origin) {
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.sportName = sportName;
        this.duration = str;
        this.durationDetail = str2;
        this.hr = str3;
        this.origin = origin;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHr() {
        return this.hr;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Data2 getOrigin() {
        return this.origin;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendSportResultBean)) {
            return false;
        }
        RecommendSportResultBean recommendSportResultBean = (RecommendSportResultBean) other;
        return Intrinsics.areEqual(this.sportName, recommendSportResultBean.sportName) && Intrinsics.areEqual(this.duration, recommendSportResultBean.duration) && Intrinsics.areEqual(this.durationDetail, recommendSportResultBean.durationDetail) && Intrinsics.areEqual(this.hr, recommendSportResultBean.hr) && Intrinsics.areEqual(this.origin, recommendSportResultBean.origin);
    }

    public int hashCode() {
        int iHashCode = this.sportName.hashCode() * 31;
        String str = this.duration;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.durationDetail;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hr;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.origin.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecommendSportResultBean(sportName=" + this.sportName + ", duration=" + this.duration + ", durationDetail=" + this.durationDetail + ", hr=" + this.hr + ", origin=" + this.origin + ")";
    }
}
