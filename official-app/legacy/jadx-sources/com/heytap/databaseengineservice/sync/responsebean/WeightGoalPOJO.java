package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u00100\u001a\u00020+H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/WeightGoalPOJO;", "", "()V", "actualEndDate", "", "getActualEndDate", "()J", "setActualEndDate", "(J)V", "createdAt", "getCreatedAt", "setCreatedAt", "effectiveDate", "getEffectiveDate", "setEffectiveDate", "expectedAchieveDate", "getExpectedAchieveDate", "setExpectedAchieveDate", "goalDirection", "", "getGoalDirection", "()I", "setGoalDirection", "(I)V", "initialWeight", "getInitialWeight", "setInitialWeight", "latestWeight", "getLatestWeight", "setLatestWeight", "latestWeightTimestamp", "getLatestWeightTimestamp", "setLatestWeightTimestamp", "modifiedTime", "getModifiedTime", "setModifiedTime", "targetState", "getTargetState", "setTargetState", "targetWeight", "getTargetWeight", "setTargetWeight", "userTagId", "", "getUserTagId", "()Ljava/lang/String;", "setUserTagId", "(Ljava/lang/String;)V", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WeightGoalPOJO {
    private long actualEndDate;
    private long createdAt;
    private long effectiveDate;
    private long expectedAchieveDate;
    private int goalDirection;
    private int initialWeight;
    private int latestWeight;
    private long latestWeightTimestamp;
    private long modifiedTime;
    private int targetState;
    private int targetWeight;

    @NotNull
    private String userTagId = "";

    public final long getActualEndDate() {
        return this.actualEndDate;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getEffectiveDate() {
        return this.effectiveDate;
    }

    public final long getExpectedAchieveDate() {
        return this.expectedAchieveDate;
    }

    public final int getGoalDirection() {
        return this.goalDirection;
    }

    public final int getInitialWeight() {
        return this.initialWeight;
    }

    public final int getLatestWeight() {
        return this.latestWeight;
    }

    public final long getLatestWeightTimestamp() {
        return this.latestWeightTimestamp;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final int getTargetState() {
        return this.targetState;
    }

    public final int getTargetWeight() {
        return this.targetWeight;
    }

    @NotNull
    public final String getUserTagId() {
        return this.userTagId;
    }

    public final void setActualEndDate(long j2) {
        this.actualEndDate = j2;
    }

    public final void setCreatedAt(long j2) {
        this.createdAt = j2;
    }

    public final void setEffectiveDate(long j2) {
        this.effectiveDate = j2;
    }

    public final void setExpectedAchieveDate(long j2) {
        this.expectedAchieveDate = j2;
    }

    public final void setGoalDirection(int i) {
        this.goalDirection = i;
    }

    public final void setInitialWeight(int i) {
        this.initialWeight = i;
    }

    public final void setLatestWeight(int i) {
        this.latestWeight = i;
    }

    public final void setLatestWeightTimestamp(long j2) {
        this.latestWeightTimestamp = j2;
    }

    public final void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public final void setTargetState(int i) {
        this.targetState = i;
    }

    public final void setTargetWeight(int i) {
        this.targetWeight = i;
    }

    public final void setUserTagId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userTagId = str;
    }

    @NotNull
    public String toString() {
        return "WeightGoalPOJO(latestWeightTimestamp=" + this.latestWeightTimestamp + ", actualEndDate=" + this.actualEndDate + ", createdAt=" + this.createdAt + ", modifiedTime=" + this.modifiedTime + ", userTagId='" + this.userTagId + "', targetState=" + this.targetState + ", targetWeight=" + this.targetWeight + ", effectiveDate=" + this.effectiveDate + ", initialWeight=" + this.initialWeight + ", expectedAchieveDate=" + this.expectedAchieveDate + ", goalDirection=" + this.goalDirection + ", latestWeight=" + this.latestWeight + ")";
    }
}
