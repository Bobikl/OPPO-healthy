package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.tj3, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/tj3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "setSportMode", "(I)V", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "b", "setRecommendDuration", "recommendDuration", "setHrzone", "hrzone", "<init>", "(III)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CoachRecommendData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int sportMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int recommendDuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int hrzone;

    public CoachRecommendData() {
        this(0, 0, 0, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHrzone() {
        return this.hrzone;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRecommendDuration() {
        return this.recommendDuration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachRecommendData)) {
            return false;
        }
        CoachRecommendData coachRecommendData = (CoachRecommendData) other;
        return this.sportMode == coachRecommendData.sportMode && this.recommendDuration == coachRecommendData.recommendDuration && this.hrzone == coachRecommendData.hrzone;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.sportMode) * 31) + Integer.hashCode(this.recommendDuration)) * 31) + Integer.hashCode(this.hrzone);
    }

    @NotNull
    public String toString() {
        return "CoachRecommendData(sportMode=" + this.sportMode + ", recommendDuration=" + this.recommendDuration + ", hrzone=" + this.hrzone + ")";
    }

    public CoachRecommendData(int i, int i2, int i3) {
        this.sportMode = i;
        this.recommendDuration = i2;
        this.hrzone = i3;
    }

    public /* synthetic */ CoachRecommendData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 2 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 1 : i3);
    }
}
