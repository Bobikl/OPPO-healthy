package com.heytap.health.insight.singledimen.consumption;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.insight.Consumption;
import com.heytap.health.health.insight.ModuleType;
import com.oplus.aiunit.vision.CalorieDateRangeStat;
import com.oplus.aiunit.vision.CalorieStat;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.oba;
import com.oplus.aiunit.vision.r9b;
import com.oplus.aiunit.vision.vu2;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00118V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/insight/singledimen/consumption/CalorieTrendLogic;", "Lcom/oplus/aiunit/vision/vu2;", "Lcom/oplus/aiunit/vision/r9b;", "n", "", "s", "Lcom/oplus/aiunit/vision/wu2;", "rangeStat", "", "u", "v", "Lcom/oplus/aiunit/vision/oba;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Lazy;", "t", "()Lcom/oplus/aiunit/vision/oba;", "insightWord", "", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "setDeviceTitle", "(Ljava/lang/String;)V", "deviceTitle", c7n.f, "setDeviceContent", "deviceContent", "<init>", "()V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCalorieTrendLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalorieTrendLogic.kt\ncom/heytap/health/insight/singledimen/consumption/CalorieTrendLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
public final class CalorieTrendLogic extends vu2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy insightWord = LazyKt__LazyJVMKt.lazy(new Function0<oba>() { // from class: com.heytap.health.insight.singledimen.consumption.CalorieTrendLogic$insightWord$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final oba invoke() {
            return new oba();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String deviceTitle = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String deviceContent = "";
    public static final int $stable = 8;

    @Override // com.oplus.aiunit.vision.u11
    @NotNull
    public String e() {
        String strD;
        return (getFinalVisibleType() == null || (strD = t().d(s())) == null) ? "" : strD;
    }

    @Override // com.oplus.aiunit.vision.u11
    @NotNull
    public String g() {
        String strC;
        if (getFinalVisibleType() == null) {
            return "";
        }
        int iS = s();
        if (a()) {
            strC = t().c(iS, true);
        } else {
            strC = b() ? t().c(iS, false) : "";
        }
        return strC == null ? "" : strC;
    }

    @Override // com.oplus.aiunit.vision.u11
    @Nullable
    public r9b n() {
        ArrayList arrayList = new ArrayList();
        CalorieDateRangeStat monthRangeStat = getMonthRangeStat();
        if (monthRangeStat != null && u(monthRangeStat)) {
            arrayList.add(Consumption.CALORIE_TRENT_MONTH);
        }
        CalorieDateRangeStat weekRangeStat = getWeekRangeStat();
        if (weekRangeStat != null && v(weekRangeStat)) {
            arrayList.add(Consumption.CALORIE_TRENT_WEEK);
        }
        return p().f(ModuleType.CONSUMPTION, arrayList);
    }

    public final int s() {
        int averageCalorie;
        int averageCalorie2;
        if (a() && getMonthRangeStat() != null) {
            CalorieDateRangeStat monthRangeStat = getMonthRangeStat();
            Intrinsics.checkNotNull(monthRangeStat);
            averageCalorie = monthRangeStat.d().getAverageCalorie();
            averageCalorie2 = monthRangeStat.f().getAverageCalorie();
        } else {
            if (!b() || getWeekRangeStat() == null) {
                return 0;
            }
            CalorieDateRangeStat weekRangeStat = getWeekRangeStat();
            Intrinsics.checkNotNull(weekRangeStat);
            averageCalorie = weekRangeStat.d().getAverageCalorie();
            averageCalorie2 = weekRangeStat.f().getAverageCalorie();
        }
        return averageCalorie - averageCalorie2;
    }

    public final oba t() {
        return (oba) this.insightWord.getValue();
    }

    public final boolean u(CalorieDateRangeStat rangeStat) {
        CalorieStat beforeStat = rangeStat.getBeforeStat();
        CalorieStat afterStat = rangeStat.getAfterStat();
        return beforeStat.getTotalValidDays() >= 20 && afterStat.getTotalValidDays() >= 20 && Math.abs(afterStat.getAverageCalorie() - beforeStat.getAverageCalorie()) >= 100;
    }

    public final boolean v(CalorieDateRangeStat rangeStat) {
        CalorieStat beforeStat = rangeStat.getBeforeStat();
        CalorieStat afterStat = rangeStat.getAfterStat();
        return beforeStat.getTotalValidDays() >= 3 && afterStat.getTotalValidDays() >= 3 && Math.abs(afterStat.getAverageCalorie() - beforeStat.getAverageCalorie()) >= 100;
    }
}