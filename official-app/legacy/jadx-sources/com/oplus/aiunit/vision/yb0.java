package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR)\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/yb0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "packageName", "", "Lkotlin/Pair;", "Lcom/oplus/aiunit/vision/vz6;", "b", "Ljava/util/List;", "()Ljava/util/List;", "appExtraAppUsage", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class yb0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Pair<ExtraAppUsage, ExtraAppUsage>> appExtraAppUsage;

    public yb0(@NotNull String packageName, @NotNull List<Pair<ExtraAppUsage, ExtraAppUsage>> appExtraAppUsage) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appExtraAppUsage, "appExtraAppUsage");
        this.packageName = packageName;
        this.appExtraAppUsage = appExtraAppUsage;
    }

    @NotNull
    public final List<Pair<ExtraAppUsage, ExtraAppUsage>> a() {
        return this.appExtraAppUsage;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof yb0)) {
            return false;
        }
        yb0 yb0Var = (yb0) other;
        return Intrinsics.areEqual(this.packageName, yb0Var.packageName) && Intrinsics.areEqual(this.appExtraAppUsage, yb0Var.appExtraAppUsage);
    }

    public int hashCode() {
        return (this.packageName.hashCode() * 31) + this.appExtraAppUsage.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppOriginDataInfo{packageName='" + ((Object) e3e.f(this.packageName)) + "', appExtraAppUsage=" + this.appExtraAppUsage + '}';
    }
}
