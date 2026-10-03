package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.sport.model.Coach;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.sj3, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/sj3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "b", "c", "tips", "Lcom/heytap/health/sport/model/Coach;", "Lcom/heytap/health/sport/model/Coach;", "()Lcom/heytap/health/sport/model/Coach;", "coachLocalNotification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/sport/model/Coach;)V", "sport_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CoachInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(h27.FAMILY_KEY_PUSH_FRIEND_AVATAR)
    @NotNull
    private final String avatar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("tips")
    @NotNull
    private final String tips;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("coachLocalNotification")
    @NotNull
    private final Coach coachLocalNotification;

    public CoachInfo() {
        this(null, null, null, 7, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Coach getCoachLocalNotification() {
        return this.coachLocalNotification;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachInfo)) {
            return false;
        }
        CoachInfo coachInfo = (CoachInfo) other;
        return Intrinsics.areEqual(this.avatar, coachInfo.avatar) && Intrinsics.areEqual(this.tips, coachInfo.tips) && Intrinsics.areEqual(this.coachLocalNotification, coachInfo.coachLocalNotification);
    }

    public int hashCode() {
        return (((this.avatar.hashCode() * 31) + this.tips.hashCode()) * 31) + this.coachLocalNotification.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoachInfo(avatar=" + this.avatar + ", tips=" + this.tips + ", coachLocalNotification=" + this.coachLocalNotification + ")";
    }

    public CoachInfo(@NotNull String avatar, @NotNull String tips, @NotNull Coach coachLocalNotification) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(coachLocalNotification, "coachLocalNotification");
        this.avatar = avatar;
        this.tips = tips;
        this.coachLocalNotification = coachLocalNotification;
    }

    public /* synthetic */ CoachInfo(String str, String str2, Coach coach, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Coach(0L, null, null, null, 15, null) : coach);
    }
}
