package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/l05;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAppPackage", "()Ljava/lang/String;", "appPackage", "b", "I", "getDay", "()I", "day", "c", "getHour", "hour", "d", "getCount", "count", "", MapSchema.FIELD_NAME_ENTRY, "J", "getUsedMillis", "()J", "usedMillis", "<init>", "(Ljava/lang/String;IIIJ)V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class l05 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String appPackage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int day;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int hour;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int count;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long usedMillis;

    public l05(@NotNull String appPackage, int i, int i2, int i3, long j2) {
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        this.appPackage = appPackage;
        this.day = i;
        this.hour = i2;
        this.count = i3;
        this.usedMillis = j2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l05)) {
            return false;
        }
        l05 l05Var = (l05) other;
        return Intrinsics.areEqual(this.appPackage, l05Var.appPackage) && this.day == l05Var.day && this.hour == l05Var.hour && this.count == l05Var.count && this.usedMillis == l05Var.usedMillis;
    }

    public int hashCode() {
        return (((((((this.appPackage.hashCode() * 31) + Integer.hashCode(this.day)) * 31) + Integer.hashCode(this.hour)) * 31) + Integer.hashCode(this.count)) * 31) + Long.hashCode(this.usedMillis);
    }

    @NotNull
    public String toString() {
        return "DateAppUsageInfo{appPackage='" + ((Object) e3e.f(this.appPackage)) + "', day=" + this.day + ", hour=" + this.hour + ", count=" + this.count + ", usedMillis=" + this.usedMillis + '}';
    }
}
