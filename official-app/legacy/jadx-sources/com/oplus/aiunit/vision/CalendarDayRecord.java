package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.yp2, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/yp2;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", SpeechConstant.KEY_RECORD_ID, "I", "c", "()I", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "d", "sportName", SportSummaryBean.CALORIES, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CalendarDayRecord {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String recordId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int sportMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String sportName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String calories;

    public CalendarDayRecord(@NotNull String recordId, int i, @NotNull String sportName, @NotNull String calories) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(calories, "calories");
        this.recordId = recordId;
        this.sportMode = i;
        this.sportName = sportName;
        this.calories = calories;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCalories() {
        return this.calories;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
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
        if (!(other instanceof CalendarDayRecord)) {
            return false;
        }
        CalendarDayRecord calendarDayRecord = (CalendarDayRecord) other;
        return Intrinsics.areEqual(this.recordId, calendarDayRecord.recordId) && this.sportMode == calendarDayRecord.sportMode && Intrinsics.areEqual(this.sportName, calendarDayRecord.sportName) && Intrinsics.areEqual(this.calories, calendarDayRecord.calories);
    }

    public int hashCode() {
        return (((((this.recordId.hashCode() * 31) + Integer.hashCode(this.sportMode)) * 31) + this.sportName.hashCode()) * 31) + this.calories.hashCode();
    }

    @NotNull
    public String toString() {
        return "CalendarDayRecord(recordId=" + this.recordId + ", sportMode=" + this.sportMode + ", sportName=" + this.sportName + ", calories=" + this.calories + ")";
    }
}
