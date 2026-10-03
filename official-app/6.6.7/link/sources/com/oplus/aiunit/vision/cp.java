package com.oplus.aiunit.vision;

import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR)\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/cp;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPkgName", "()Ljava/lang/String;", TraceConstants.KEY_PKG_NAME, "b", "getActivityName", "activityName", "", "Lkotlin/Pair;", "Lcom/oplus/aiunit/vision/bp;", "c", "Ljava/util/List;", "()Ljava/util/List;", "eventPairList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class cp {

    @NotNull
    public final String a;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String activityName;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final List<Pair<bp, bp>> eventPairList;

    public cp(@NotNull String str, @NotNull String str2, @NotNull List<Pair<bp, bp>> list) {
        Intrinsics.checkNotNullParameter(str, TraceConstants.KEY_PKG_NAME);
        Intrinsics.checkNotNullParameter(str2, "activityName");
        Intrinsics.checkNotNullParameter(list, "eventPairList");
        this.a = str;
        this.activityName = str2;
        this.eventPairList = list;
    }

    @NotNull
    public final List<Pair<bp, bp>> a() {
        return this.eventPairList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof cp)) {
            return false;
        }
        cp cpVar = (cp) other;
        return Intrinsics.areEqual(this.a, cpVar.a) && Intrinsics.areEqual(this.activityName, cpVar.activityName) && Intrinsics.areEqual(this.eventPairList, cpVar.eventPairList);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.activityName.hashCode()) * 31) + this.eventPairList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActivityEventPairInfo{ pkgName='" + ((Object) b5e.f(this.a)) + "', activityName='" + ((Object) b5e.f(this.activityName)) + "', eventPairList=" + this.eventPairList + '}';
    }
}
