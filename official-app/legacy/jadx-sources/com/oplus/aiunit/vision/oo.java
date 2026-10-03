package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019\"\u0004\b\u0017\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/oo;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "d", "(I)V", "swimType", "Ljava/lang/String;", "getActionName", "()Ljava/lang/String;", "setActionName", "(Ljava/lang/String;)V", "actionName", "", "c", "J", "()J", "(J)V", "duration", "<init>", "(ILjava/lang/String;J)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class oo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int swimType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String actionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long duration;

    public oo() {
        this(0, null, 0L, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSwimType() {
        return this.swimType;
    }

    public final void c(long j2) {
        this.duration = j2;
    }

    public final void d(int i) {
        this.swimType = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof oo)) {
            return false;
        }
        oo ooVar = (oo) other;
        return this.swimType == ooVar.swimType && Intrinsics.areEqual(this.actionName, ooVar.actionName) && this.duration == ooVar.duration;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.swimType) * 31;
        String str = this.actionName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.duration);
    }

    @NotNull
    public String toString() {
        return "ActionData:{swimType:" + this.swimType + ",actionName:" + this.actionName + ",duration:" + this.duration + "}";
    }

    public oo(int i, @Nullable String str, long j2) {
        this.swimType = i;
        this.actionName = str;
        this.duration = j2;
    }

    public /* synthetic */ oo(int i, String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0L : j2);
    }
}
