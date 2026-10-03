package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/e15;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAppPackage", "()Ljava/lang/String;", "appPackage", "b", "I", "getDay", "()I", "day", "c", "getHour", "hour", "d", "getCount", ParserTag.DATA_SAME_COUNT, "", "e", "J", "getUsedMillis", "()J", "usedMillis", "<init>", "(Ljava/lang/String;IIIJ)V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class e15 {

    @NotNull
    public final String a;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int day;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int hour;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int count;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final long usedMillis;

    public e15(@NotNull String str, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(str, "appPackage");
        this.a = str;
        this.day = i;
        this.hour = i2;
        this.count = i3;
        this.usedMillis = j;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e15)) {
            return false;
        }
        e15 e15Var = (e15) other;
        return Intrinsics.areEqual(this.a, e15Var.a) && this.day == e15Var.day && this.hour == e15Var.hour && this.count == e15Var.count && this.usedMillis == e15Var.usedMillis;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + Integer.hashCode(this.day)) * 31) + Integer.hashCode(this.hour)) * 31) + Integer.hashCode(this.count)) * 31) + Long.hashCode(this.usedMillis);
    }

    @NotNull
    public String toString() {
        return "DateAppUsageInfo{appPackage='" + ((Object) b5e.f(this.a)) + "', day=" + this.day + ", hour=" + this.hour + ", count=" + this.count + ", usedMillis=" + this.usedMillis + '}';
    }
}
