package com.oplus.aiunit.vision;

import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR)\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/uo;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPkgName", "()Ljava/lang/String;", TraceConstants.KEY_PKG_NAME, "b", "getActivityName", DeepLinkInterpreter.KEY_ACTIVITY_NAME, "", "Lkotlin/Pair;", "Lcom/oplus/aiunit/vision/to;", "c", "Ljava/util/List;", "()Ljava/util/List;", "eventPairList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class uo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String pkgName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String activityName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Pair<to, to>> eventPairList;

    public uo(@NotNull String pkgName, @NotNull String activityName, @NotNull List<Pair<to, to>> eventPairList) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intrinsics.checkNotNullParameter(eventPairList, "eventPairList");
        this.pkgName = pkgName;
        this.activityName = activityName;
        this.eventPairList = eventPairList;
    }

    @NotNull
    public final List<Pair<to, to>> a() {
        return this.eventPairList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) other;
        return Intrinsics.areEqual(this.pkgName, uoVar.pkgName) && Intrinsics.areEqual(this.activityName, uoVar.activityName) && Intrinsics.areEqual(this.eventPairList, uoVar.eventPairList);
    }

    public int hashCode() {
        return (((this.pkgName.hashCode() * 31) + this.activityName.hashCode()) * 31) + this.eventPairList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActivityEventPairInfo{ pkgName='" + ((Object) e3e.f(this.pkgName)) + "', activityName='" + ((Object) e3e.f(this.activityName)) + "', eventPairList=" + this.eventPairList + '}';
    }
}
