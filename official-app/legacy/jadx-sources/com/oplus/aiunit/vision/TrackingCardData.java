package com.oplus.aiunit.vision;

import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.i8k, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/i8k;", "", "", "aid", StatisticsTrackUtil.KEY_CARD_TYPE, "card_state", "a", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", MapSchema.FIELD_NAME_ENTRY, "d", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "business_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TrackingCardData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String aid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String card_type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String card_state;

    public TrackingCardData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ TrackingCardData b(TrackingCardData trackingCardData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackingCardData.aid;
        }
        if ((i & 2) != 0) {
            str2 = trackingCardData.card_type;
        }
        if ((i & 4) != 0) {
            str3 = trackingCardData.card_state;
        }
        return trackingCardData.a(str, str2, str3);
    }

    @NotNull
    public final TrackingCardData a(@NotNull String aid, @NotNull String card_type, @NotNull String card_state) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(card_type, "card_type");
        Intrinsics.checkNotNullParameter(card_state, "card_state");
        return new TrackingCardData(aid, card_type, card_state);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCard_state() {
        return this.card_state;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCard_type() {
        return this.card_type;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingCardData)) {
            return false;
        }
        TrackingCardData trackingCardData = (TrackingCardData) other;
        return Intrinsics.areEqual(this.aid, trackingCardData.aid) && Intrinsics.areEqual(this.card_type, trackingCardData.card_type) && Intrinsics.areEqual(this.card_state, trackingCardData.card_state);
    }

    public int hashCode() {
        return (((this.aid.hashCode() * 31) + this.card_type.hashCode()) * 31) + this.card_state.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrackingCardData(aid=" + this.aid + ", card_type=" + this.card_type + ", card_state=" + this.card_state + ")";
    }

    public TrackingCardData(@NotNull String aid, @NotNull String card_type, @NotNull String card_state) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(card_type, "card_type");
        Intrinsics.checkNotNullParameter(card_state, "card_state");
        this.aid = aid;
        this.card_type = card_type;
        this.card_state = card_state;
    }

    public /* synthetic */ TrackingCardData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
