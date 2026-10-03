package com.heytap.sports.partner.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u008b\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00065"}, d2 = {"Lcom/heytap/sports/partner/bean/TaskConfig;", "", "configId", "", "configType", "", "goal", "startType", "repeatStatus", "bonusStatus", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "bonus", "allocateType", "creatorStatus", "currentStartDate", "currentEndDate", "(JIJIIIIIIIIII)V", "getAllocateType", "()I", "getBonus", "getBonusStatus", "getConfigId", "()J", "getConfigType", "getCreatorStatus", "getCurrentEndDate", "getCurrentStartDate", "getEndDate", "getGoal", "getRepeatStatus", "getStartDate", "getStartType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TaskConfig {
    public static final int $stable = 0;
    private final int allocateType;
    private final int bonus;
    private final int bonusStatus;
    private final long configId;
    private final int configType;
    private final int creatorStatus;
    private final int currentEndDate;
    private final int currentStartDate;
    private final int endDate;
    private final long goal;
    private final int repeatStatus;
    private final int startDate;
    private final int startType;

    public TaskConfig() {
        this(0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getConfigId() {
        return this.configId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getAllocateType() {
        return this.allocateType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getCreatorStatus() {
        return this.creatorStatus;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCurrentStartDate() {
        return this.currentStartDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getCurrentEndDate() {
        return this.currentEndDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConfigType() {
        return this.configType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStartType() {
        return this.startType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRepeatStatus() {
        return this.repeatStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBonusStatus() {
        return this.bonusStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getBonus() {
        return this.bonus;
    }

    @NotNull
    public final TaskConfig copy(long configId, int configType, long goal, int startType, int repeatStatus, int bonusStatus, int startDate, int endDate, int bonus, int allocateType, int creatorStatus, int currentStartDate, int currentEndDate) {
        return new TaskConfig(configId, configType, goal, startType, repeatStatus, bonusStatus, startDate, endDate, bonus, allocateType, creatorStatus, currentStartDate, currentEndDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskConfig)) {
            return false;
        }
        TaskConfig taskConfig = (TaskConfig) other;
        return this.configId == taskConfig.configId && this.configType == taskConfig.configType && this.goal == taskConfig.goal && this.startType == taskConfig.startType && this.repeatStatus == taskConfig.repeatStatus && this.bonusStatus == taskConfig.bonusStatus && this.startDate == taskConfig.startDate && this.endDate == taskConfig.endDate && this.bonus == taskConfig.bonus && this.allocateType == taskConfig.allocateType && this.creatorStatus == taskConfig.creatorStatus && this.currentStartDate == taskConfig.currentStartDate && this.currentEndDate == taskConfig.currentEndDate;
    }

    public final int getAllocateType() {
        return this.allocateType;
    }

    public final int getBonus() {
        return this.bonus;
    }

    public final int getBonusStatus() {
        return this.bonusStatus;
    }

    public final long getConfigId() {
        return this.configId;
    }

    public final int getConfigType() {
        return this.configType;
    }

    public final int getCreatorStatus() {
        return this.creatorStatus;
    }

    public final int getCurrentEndDate() {
        return this.currentEndDate;
    }

    public final int getCurrentStartDate() {
        return this.currentStartDate;
    }

    public final int getEndDate() {
        return this.endDate;
    }

    public final long getGoal() {
        return this.goal;
    }

    public final int getRepeatStatus() {
        return this.repeatStatus;
    }

    public final int getStartDate() {
        return this.startDate;
    }

    public final int getStartType() {
        return this.startType;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Long.hashCode(this.configId) * 31) + Integer.hashCode(this.configType)) * 31) + Long.hashCode(this.goal)) * 31) + Integer.hashCode(this.startType)) * 31) + Integer.hashCode(this.repeatStatus)) * 31) + Integer.hashCode(this.bonusStatus)) * 31) + Integer.hashCode(this.startDate)) * 31) + Integer.hashCode(this.endDate)) * 31) + Integer.hashCode(this.bonus)) * 31) + Integer.hashCode(this.allocateType)) * 31) + Integer.hashCode(this.creatorStatus)) * 31) + Integer.hashCode(this.currentStartDate)) * 31) + Integer.hashCode(this.currentEndDate);
    }

    @NotNull
    public String toString() {
        return "TaskConfig(configId=" + this.configId + ", configType=" + this.configType + ", goal=" + this.goal + ", startType=" + this.startType + ", repeatStatus=" + this.repeatStatus + ", bonusStatus=" + this.bonusStatus + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", bonus=" + this.bonus + ", allocateType=" + this.allocateType + ", creatorStatus=" + this.creatorStatus + ", currentStartDate=" + this.currentStartDate + ", currentEndDate=" + this.currentEndDate + ")";
    }

    public TaskConfig(long j2, int i, long j3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.configId = j2;
        this.configType = i;
        this.goal = j3;
        this.startType = i2;
        this.repeatStatus = i3;
        this.bonusStatus = i4;
        this.startDate = i5;
        this.endDate = i6;
        this.bonus = i7;
        this.allocateType = i8;
        this.creatorStatus = i9;
        this.currentStartDate = i10;
        this.currentEndDate = i11;
    }

    public /* synthetic */ TaskConfig(long j2, int i, long j3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j2, (i12 & 2) != 0 ? 0 : i, (i12 & 4) == 0 ? j3 : 0L, (i12 & 8) != 0 ? 0 : i2, (i12 & 16) != 0 ? 0 : i3, (i12 & 32) != 0 ? 0 : i4, (i12 & 64) != 0 ? 0 : i5, (i12 & 128) != 0 ? 0 : i6, (i12 & 256) != 0 ? 0 : i7, (i12 & 512) != 0 ? 0 : i8, (i12 & 1024) != 0 ? 0 : i9, (i12 & 2048) != 0 ? 0 : i10, (i12 & 4096) == 0 ? i11 : 0);
    }
}
