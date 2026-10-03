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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/heytap/sports/partner/bean/UserTask;", "", "memberAvatar", "", "memberSsoid", "memberName", "date", "", "goal", "value", "complete", "champion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIII)V", "getChampion", "()I", "getComplete", "getDate", "getGoal", "getMemberAvatar", "()Ljava/lang/String;", "getMemberName", "getMemberSsoid", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserTask {
    public static final int $stable = 0;
    private final int champion;
    private final int complete;
    private final int date;
    private final int goal;

    @NotNull
    private final String memberAvatar;

    @NotNull
    private final String memberName;

    @NotNull
    private final String memberSsoid;
    private final int value;

    public UserTask() {
        this(null, null, null, 0, 0, 0, 0, 0, 255, null);
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
    public final int getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getComplete() {
        return this.complete;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getChampion() {
        return this.champion;
    }

    @NotNull
    public final UserTask copy(@NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int date, int goal, int value, int complete, int champion) {
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        return new UserTask(memberAvatar, memberSsoid, memberName, date, goal, value, complete, champion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTask)) {
            return false;
        }
        UserTask userTask = (UserTask) other;
        return Intrinsics.areEqual(this.memberAvatar, userTask.memberAvatar) && Intrinsics.areEqual(this.memberSsoid, userTask.memberSsoid) && Intrinsics.areEqual(this.memberName, userTask.memberName) && this.date == userTask.date && this.goal == userTask.goal && this.value == userTask.value && this.complete == userTask.complete && this.champion == userTask.champion;
    }

    public final int getChampion() {
        return this.champion;
    }

    public final int getComplete() {
        return this.complete;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getGoal() {
        return this.goal;
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

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((((this.memberAvatar.hashCode() * 31) + this.memberSsoid.hashCode()) * 31) + this.memberName.hashCode()) * 31) + Integer.hashCode(this.date)) * 31) + Integer.hashCode(this.goal)) * 31) + Integer.hashCode(this.value)) * 31) + Integer.hashCode(this.complete)) * 31) + Integer.hashCode(this.champion);
    }

    @NotNull
    public String toString() {
        return "UserTask(memberAvatar=" + this.memberAvatar + ", memberSsoid=" + this.memberSsoid + ", memberName=" + this.memberName + ", date=" + this.date + ", goal=" + this.goal + ", value=" + this.value + ", complete=" + this.complete + ", champion=" + this.champion + ")";
    }

    public UserTask(@NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        this.memberAvatar = memberAvatar;
        this.memberSsoid = memberSsoid;
        this.memberName = memberName;
        this.date = i;
        this.goal = i2;
        this.value = i3;
        this.complete = i4;
        this.champion = i5;
    }

    public /* synthetic */ UserTask(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5);
    }
}
