package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\t\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/bnk;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "packageName", "", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "startTime", "d", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class bnk {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Long startTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Long duration;

    public bnk(@Nullable String str, @Nullable Long l2, @Nullable Long l3) {
        this.packageName = str;
        this.startTime = l2;
        this.duration = l3;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    public final void d(@Nullable Long l2) {
        this.duration = l2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof bnk)) {
            return false;
        }
        bnk bnkVar = (bnk) other;
        return Intrinsics.areEqual(this.packageName, bnkVar.packageName) && Intrinsics.areEqual(this.startTime, bnkVar.startTime) && Intrinsics.areEqual(this.duration, bnkVar.duration);
    }

    public int hashCode() {
        String str = this.packageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.startTime;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.duration;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageName;
        Long l2 = this.startTime;
        return "Usage(packageName=" + str + ", startTime=" + l2 + ", :" + mq8.INSTANCE.y(l2 != null ? l2.longValue() : 0L, "yyy-MMM-dd HH:mm:ss") + " ,duration=" + this.duration + ")";
    }
}
