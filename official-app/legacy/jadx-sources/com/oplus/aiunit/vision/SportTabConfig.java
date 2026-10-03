package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.customer.feedback.sdk.model.RequestData;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.xii, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\t\u0010\u0014R+\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\f¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/xii;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "b", "d", "tabName", "getTabIcon", "tabIcon", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "cardBg", "Lkotlin/Triple;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Triple;", "getStatistics", "()Lkotlin/Triple;", RequestData.TYPE_STATISTICS, "f", "recordTitle", b2n.f, "trackId", b2n.g, "getTrackId2", "trackId2", "<init>", "(IIILjava/lang/Integer;Lkotlin/Triple;Ljava/lang/Integer;II)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportTabConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int sportMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int tabName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int tabIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer cardBg;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Triple<Integer, Integer, Integer> statistics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer recordTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final int trackId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final int trackId2;

    public SportTabConfig(int i, int i2, int i3, @Nullable Integer num, @Nullable Triple<Integer, Integer, Integer> triple, @Nullable Integer num2, int i4, int i5) {
        this.sportMode = i;
        this.tabName = i2;
        this.tabIcon = i3;
        this.cardBg = num;
        this.statistics = triple;
        this.recordTitle = num2;
        this.trackId = i4;
        this.trackId2 = i5;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCardBg() {
        return this.cardBg;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getRecordTitle() {
        return this.recordTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTabName() {
        return this.tabName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTrackId() {
        return this.trackId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportTabConfig)) {
            return false;
        }
        SportTabConfig sportTabConfig = (SportTabConfig) other;
        return this.sportMode == sportTabConfig.sportMode && this.tabName == sportTabConfig.tabName && this.tabIcon == sportTabConfig.tabIcon && Intrinsics.areEqual(this.cardBg, sportTabConfig.cardBg) && Intrinsics.areEqual(this.statistics, sportTabConfig.statistics) && Intrinsics.areEqual(this.recordTitle, sportTabConfig.recordTitle) && this.trackId == sportTabConfig.trackId && this.trackId2 == sportTabConfig.trackId2;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.sportMode) * 31) + Integer.hashCode(this.tabName)) * 31) + Integer.hashCode(this.tabIcon)) * 31;
        Integer num = this.cardBg;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Triple<Integer, Integer, Integer> triple = this.statistics;
        int iHashCode3 = (iHashCode2 + (triple == null ? 0 : triple.hashCode())) * 31;
        Integer num2 = this.recordTitle;
        return ((((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.trackId)) * 31) + Integer.hashCode(this.trackId2);
    }

    @NotNull
    public String toString() {
        return "SportTabConfig(sportMode=" + this.sportMode + ", tabName=" + this.tabName + ", tabIcon=" + this.tabIcon + ", cardBg=" + this.cardBg + ", statistics=" + this.statistics + ", recordTitle=" + this.recordTitle + ", trackId=" + this.trackId + ", trackId2=" + this.trackId2 + ")";
    }

    public /* synthetic */ SportTabConfig(int i, int i2, int i3, Integer num, Triple triple, Integer num2, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i6 & 8) != 0 ? null : num, (i6 & 16) != 0 ? null : triple, (i6 & 32) != 0 ? null : num2, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5);
    }
}
