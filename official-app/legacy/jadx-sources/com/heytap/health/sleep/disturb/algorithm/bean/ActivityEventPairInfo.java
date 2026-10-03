package com.heytap.health.sleep.disturb.algorithm.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/sleep/disturb/algorithm/bean/ActivityEventPairInfo;", "", TraceConstants.KEY_PKG_NAME, "", DeepLinkInterpreter.KEY_ACTIVITY_NAME, "eventPairList", "", "Lkotlin/Pair;", "Lcom/heytap/health/sleep/disturb/algorithm/bean/ActivityEventInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActivityName", "()Ljava/lang/String;", "getEventPairList", "()Ljava/util/List;", "getPkgName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ActivityEventPairInfo {
    public static final int $stable = 8;

    @NotNull
    private final String activityName;

    @NotNull
    private final List<Pair<ActivityEventInfo, ActivityEventInfo>> eventPairList;

    @NotNull
    private final String pkgName;

    public ActivityEventPairInfo(@NotNull String pkgName, @NotNull String activityName, @NotNull List<Pair<ActivityEventInfo, ActivityEventInfo>> eventPairList) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intrinsics.checkNotNullParameter(eventPairList, "eventPairList");
        this.pkgName = pkgName;
        this.activityName = activityName;
        this.eventPairList = eventPairList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityEventPairInfo copy$default(ActivityEventPairInfo activityEventPairInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityEventPairInfo.pkgName;
        }
        if ((i & 2) != 0) {
            str2 = activityEventPairInfo.activityName;
        }
        if ((i & 4) != 0) {
            list = activityEventPairInfo.eventPairList;
        }
        return activityEventPairInfo.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkgName() {
        return this.pkgName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    @NotNull
    public final List<Pair<ActivityEventInfo, ActivityEventInfo>> component3() {
        return this.eventPairList;
    }

    @NotNull
    public final ActivityEventPairInfo copy(@NotNull String pkgName, @NotNull String activityName, @NotNull List<Pair<ActivityEventInfo, ActivityEventInfo>> eventPairList) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intrinsics.checkNotNullParameter(eventPairList, "eventPairList");
        return new ActivityEventPairInfo(pkgName, activityName, eventPairList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityEventPairInfo)) {
            return false;
        }
        ActivityEventPairInfo activityEventPairInfo = (ActivityEventPairInfo) other;
        return Intrinsics.areEqual(this.pkgName, activityEventPairInfo.pkgName) && Intrinsics.areEqual(this.activityName, activityEventPairInfo.activityName) && Intrinsics.areEqual(this.eventPairList, activityEventPairInfo.eventPairList);
    }

    @NotNull
    public final String getActivityName() {
        return this.activityName;
    }

    @NotNull
    public final List<Pair<ActivityEventInfo, ActivityEventInfo>> getEventPairList() {
        return this.eventPairList;
    }

    @NotNull
    public final String getPkgName() {
        return this.pkgName;
    }

    public int hashCode() {
        return (((this.pkgName.hashCode() * 31) + this.activityName.hashCode()) * 31) + this.eventPairList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActivityEventPairInfo(pkgName='" + this.pkgName + "', activityName='" + this.activityName + "', eventPairList=" + this.eventPairList + ")";
    }
}
