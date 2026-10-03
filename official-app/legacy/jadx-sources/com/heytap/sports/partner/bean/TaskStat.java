package com.heytap.sports.partner.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/heytap/sports/partner/bean/TaskStat;", "", "memberAvatar", "", "memberSsoid", "memberName", "dayComplete", "", "dayChampion", "overallChampion", "bonus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V", "getBonus", "()I", "getDayChampion", "getDayComplete", "getMemberAvatar", "()Ljava/lang/String;", "getMemberName", "getMemberSsoid", "getOverallChampion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TaskStat {
    public static final int $stable = 0;
    private final int bonus;
    private final int dayChampion;
    private final int dayComplete;

    @NotNull
    private final String memberAvatar;

    @NotNull
    private final String memberName;

    @NotNull
    private final String memberSsoid;
    private final int overallChampion;

    public TaskStat() {
        this(null, null, null, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ TaskStat copy$default(TaskStat taskStat, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = taskStat.memberAvatar;
        }
        if ((i5 & 2) != 0) {
            str2 = taskStat.memberSsoid;
        }
        String str4 = str2;
        if ((i5 & 4) != 0) {
            str3 = taskStat.memberName;
        }
        String str5 = str3;
        if ((i5 & 8) != 0) {
            i = taskStat.dayComplete;
        }
        int i6 = i;
        if ((i5 & 16) != 0) {
            i2 = taskStat.dayChampion;
        }
        int i7 = i2;
        if ((i5 & 32) != 0) {
            i3 = taskStat.overallChampion;
        }
        int i8 = i3;
        if ((i5 & 64) != 0) {
            i4 = taskStat.bonus;
        }
        return taskStat.copy(str, str4, str5, i6, i7, i8, i4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMemberAvatar() {
        return this.memberAvatar;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberSsoid() {
        return this.memberSsoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMemberName() {
        return this.memberName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDayComplete() {
        return this.dayComplete;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDayChampion() {
        return this.dayChampion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOverallChampion() {
        return this.overallChampion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBonus() {
        return this.bonus;
    }

    @NotNull
    public final TaskStat copy(@NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int dayComplete, int dayChampion, int overallChampion, int bonus) {
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        return new TaskStat(memberAvatar, memberSsoid, memberName, dayComplete, dayChampion, overallChampion, bonus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskStat)) {
            return false;
        }
        TaskStat taskStat = (TaskStat) other;
        return Intrinsics.areEqual(this.memberAvatar, taskStat.memberAvatar) && Intrinsics.areEqual(this.memberSsoid, taskStat.memberSsoid) && Intrinsics.areEqual(this.memberName, taskStat.memberName) && this.dayComplete == taskStat.dayComplete && this.dayChampion == taskStat.dayChampion && this.overallChampion == taskStat.overallChampion && this.bonus == taskStat.bonus;
    }

    public final int getBonus() {
        return this.bonus;
    }

    public final int getDayChampion() {
        return this.dayChampion;
    }

    public final int getDayComplete() {
        return this.dayComplete;
    }

    @NotNull
    public final String getMemberAvatar() {
        return this.memberAvatar;
    }

    @NotNull
    public final String getMemberName() {
        return this.memberName;
    }

    @NotNull
    public final String getMemberSsoid() {
        return this.memberSsoid;
    }

    public final int getOverallChampion() {
        return this.overallChampion;
    }

    public int hashCode() {
        return (((((((((((this.memberAvatar.hashCode() * 31) + this.memberSsoid.hashCode()) * 31) + this.memberName.hashCode()) * 31) + Integer.hashCode(this.dayComplete)) * 31) + Integer.hashCode(this.dayChampion)) * 31) + Integer.hashCode(this.overallChampion)) * 31) + Integer.hashCode(this.bonus);
    }

    @NotNull
    public String toString() {
        return "TaskStat(memberAvatar=" + this.memberAvatar + ", memberSsoid=" + this.memberSsoid + ", memberName=" + this.memberName + ", dayComplete=" + this.dayComplete + ", dayChampion=" + this.dayChampion + ", overallChampion=" + this.overallChampion + ", bonus=" + this.bonus + ")";
    }

    public TaskStat(@NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        this.memberAvatar = memberAvatar;
        this.memberSsoid = memberSsoid;
        this.memberName = memberName;
        this.dayComplete = i;
        this.dayChampion = i2;
        this.overallChampion = i3;
        this.bonus = i4;
    }

    public /* synthetic */ TaskStat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4);
    }
}
