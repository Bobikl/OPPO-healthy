package com.heytap.health.health.familymode.request;

import androidx.annotation.Keep;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0013\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\b\u0010)\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n¨\u0006*"}, d2 = {"Lcom/heytap/health/health/familymode/request/FamilySportRecord;", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "(I)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "pace", "getPace", "()I", "setPace", "getSportMode", "setSportMode", "sportName", "", "getSportName", "()Ljava/lang/String;", "setSportName", "(Ljava/lang/String;)V", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "totalCalorie", "getTotalCalorie", "setTotalCalorie", "totalDistance", "getTotalDistance", "setTotalDistance", "totalDuration", "getTotalDuration", "setTotalDuration", "component1", "copy", "equals", "", "other", "hashCode", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FamilySportRecord {
    private long endTimestamp;
    private int pace;
    private int sportMode;

    @NotNull
    private String sportName = "";
    private long startTimestamp;
    private int totalCalorie;
    private long totalDistance;
    private long totalDuration;

    public FamilySportRecord(int i) {
        this.sportMode = i;
    }

    public static /* synthetic */ FamilySportRecord copy$default(FamilySportRecord familySportRecord, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = familySportRecord.sportMode;
        }
        return familySportRecord.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    @NotNull
    public final FamilySportRecord copy(int sportMode) {
        return new FamilySportRecord(sportMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FamilySportRecord) && this.sportMode == ((FamilySportRecord) other).sportMode;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getPace() {
        return this.pace;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    @NotNull
    public final String getSportName() {
        return this.sportName;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getTotalCalorie() {
        return this.totalCalorie;
    }

    public final long getTotalDistance() {
        return this.totalDistance;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return Integer.hashCode(this.sportMode);
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setPace(int i) {
        this.pace = i;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    public final void setSportName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sportName = str;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public final void setTotalCalorie(int i) {
        this.totalCalorie = i;
    }

    public final void setTotalDistance(long j2) {
        this.totalDistance = j2;
    }

    public final void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    @NotNull
    public String toString() {
        return "FamilySportRecord(sportMode=" + this.sportMode + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", totalDuration=" + this.totalDuration + ", totalDistance=" + this.totalDistance + ", pace=" + this.pace + ", totalCalorie=" + this.totalCalorie + ")";
    }
}
