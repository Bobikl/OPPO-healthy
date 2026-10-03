package com.oplus.aiunit.vision;

import android.animation.TimeInterpolator;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.f9e, reason: from toString */
/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u001e\u0012\b\b\u0002\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/f9e;", "T", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setDefaultValue", "(Ljava/lang/Object;)V", "defaultValue", "Landroid/animation/TimeInterpolator;", "c", "Landroid/animation/TimeInterpolator;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "setInterpolator", "(Landroid/animation/TimeInterpolator;)V", ParserTag.TAG_INTERPOLATOR, "", "d", "J", "getDuration", "()J", "duration", "e", "getStartDelay", ParserTag.TAG_START_DELAY, "<init>", "(Ljava/lang/String;Ljava/lang/Object;Landroid/animation/TimeInterpolator;JJ)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Param<T> {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public String name;

    /* JADX INFO: renamed from: b, reason: from toString */
    public T defaultValue;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public TimeInterpolator interpolator;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final long duration;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final long startDelay;

    public Param(@NotNull String str, T t, @NotNull TimeInterpolator timeInterpolator, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(timeInterpolator, ParserTag.TAG_INTERPOLATOR);
        this.name = str;
        this.defaultValue = t;
        this.interpolator = timeInterpolator;
        this.duration = j;
        this.startDelay = j2;
    }

    public final T a() {
        return this.defaultValue;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Param)) {
            return false;
        }
        Param param = (Param) other;
        return Intrinsics.areEqual(this.name, param.name) && Intrinsics.areEqual(this.defaultValue, param.defaultValue) && Intrinsics.areEqual(this.interpolator, param.interpolator) && this.duration == param.duration && this.startDelay == param.startDelay;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        T t = this.defaultValue;
        return ((((((iHashCode + (t == null ? 0 : t.hashCode())) * 31) + this.interpolator.hashCode()) * 31) + Long.hashCode(this.duration)) * 31) + Long.hashCode(this.startDelay);
    }

    @NotNull
    public String toString() {
        return "Param(name=" + this.name + ", defaultValue=" + this.defaultValue + ", interpolator=" + this.interpolator + ", duration=" + this.duration + ", startDelay=" + this.startDelay + ")";
    }

    public /* synthetic */ Param(String str, Object obj, TimeInterpolator timeInterpolator, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, timeInterpolator, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2);
    }
}
