package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.insight.Consumption;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J(\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/hu2;", "Lcom/oplus/aiunit/vision/g11;", "Lcom/oplus/aiunit/vision/dlf;", "monthDateRange", "weekDateRange", "Lcom/oplus/aiunit/vision/iu2;", "monthRangeStat", "weekRangeStat", "Lcom/oplus/aiunit/vision/f8b;", "o", "", "a", "b", "", "toString", "Lcom/oplus/aiunit/vision/iu2;", "q", "()Lcom/oplus/aiunit/vision/iu2;", "setMonthRangeStat", "(Lcom/oplus/aiunit/vision/iu2;)V", "r", "setWeekRangeStat", "c", "Lcom/oplus/aiunit/vision/f8b;", b2n.g, "()Lcom/oplus/aiunit/vision/f8b;", LogFieldKey.MESSAGE_KEY, "(Lcom/oplus/aiunit/vision/f8b;)V", "finalVisibleType", "d", "Lcom/oplus/aiunit/vision/dlf;", "f", "()Lcom/oplus/aiunit/vision/dlf;", LogFieldKey.LEVEL_KEY, "(Lcom/oplus/aiunit/vision/dlf;)V", "finalDateRange", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class hu2 implements g11 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public CalorieDateRangeStat monthRangeStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public CalorieDateRangeStat weekRangeStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public f8b finalVisibleType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public RelativeDateRange finalDateRange;

    @Override // com.oplus.aiunit.vision.g11
    public boolean a() {
        return getFinalVisibleType() == Consumption.CALORIE_REACH_GOAL_MONTH || getFinalVisibleType() == Consumption.CALORIE_TRENT_MONTH;
    }

    @Override // com.oplus.aiunit.vision.g11
    public boolean b() {
        return getFinalVisibleType() == Consumption.CALORIE_REACH_GOAL_WEEK || getFinalVisibleType() == Consumption.CALORIE_TRENT_WEEK;
    }

    @Override // com.oplus.aiunit.vision.g11
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public RelativeDateRange getFinalDateRange() {
        return this.finalDateRange;
    }

    @Override // com.oplus.aiunit.vision.g11
    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public f8b getFinalVisibleType() {
        return this.finalVisibleType;
    }

    @Override // com.oplus.aiunit.vision.g11
    public void l(@Nullable RelativeDateRange relativeDateRange) {
        this.finalDateRange = relativeDateRange;
    }

    @Override // com.oplus.aiunit.vision.g11
    public void m(@Nullable f8b f8bVar) {
        this.finalVisibleType = f8bVar;
    }

    @Nullable
    public final f8b o(@NotNull RelativeDateRange monthDateRange, @NotNull RelativeDateRange weekDateRange, @NotNull CalorieDateRangeStat monthRangeStat, @NotNull CalorieDateRangeStat weekRangeStat) {
        Intrinsics.checkNotNullParameter(monthDateRange, "monthDateRange");
        Intrinsics.checkNotNullParameter(weekDateRange, "weekDateRange");
        Intrinsics.checkNotNullParameter(monthRangeStat, "monthRangeStat");
        Intrinsics.checkNotNullParameter(weekRangeStat, "weekRangeStat");
        this.monthRangeStat = monthRangeStat;
        this.weekRangeStat = weekRangeStat;
        m(n());
        if (!a()) {
            monthDateRange = b() ? weekDateRange : null;
        }
        l(monthDateRange);
        return getFinalVisibleType();
    }

    @NotNull
    public fz7 p() {
        return g11.a.a(this);
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final CalorieDateRangeStat getMonthRangeStat() {
        return this.monthRangeStat;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final CalorieDateRangeStat getWeekRangeStat() {
        return this.weekRangeStat;
    }

    @NotNull
    public String toString() {
        return g11.a.b(this);
    }
}
