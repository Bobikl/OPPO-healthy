package com.oplus.aiunit.vision;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.daily.ui.DailyMonthRowView;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/sr4;", "", "Landroid/view/ViewGroup;", "rootView", "Landroid/view/View;", "a", "monthView", "Ljava/time/LocalDate;", "month", "", "b", "Lcom/oplus/aiunit/vision/nq4;", "Lcom/oplus/aiunit/vision/nq4;", "monthViewAdapter", "<init>", "(Lcom/oplus/aiunit/vision/nq4;)V", "Companion", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class sr4 {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "StepDetailMonthView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final nq4 monthViewAdapter;

    public sr4(@NotNull nq4 monthViewAdapter) {
        Intrinsics.checkNotNullParameter(monthViewAdapter, "monthViewAdapter");
        this.monthViewAdapter = monthViewAdapter;
    }

    @NotNull
    public final View a(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        View viewInflate = LayoutInflater.from(rootView.getContext()).inflate(this.monthViewAdapter.b(), rootView, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        for (int i = 0; i < 6; i++) {
            viewGroup.addView(new DailyMonthRowView(rootView.getContext(), this.monthViewAdapter, rootView), -1, ejg.a(rootView.getContext(), 76.0f));
        }
        View view = new View(rootView.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, rh2.a(46)));
        viewGroup.addView(view);
        return viewGroup;
    }

    public final void b(@NotNull ViewGroup monthView, @NotNull LocalDate month) {
        Intrinsics.checkNotNullParameter(monthView, "monthView");
        Intrinsics.checkNotNullParameter(month, "month");
        this.monthViewAdapter.d(monthView, month);
        LocalDate localDateWith = month.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        int childCount = monthView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (monthView.getChildAt(i) instanceof DailyMonthRowView) {
                View childAt = monthView.getChildAt(i);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.heytap.health.daily.ui.DailyMonthRowView");
                DailyMonthRowView dailyMonthRowView = (DailyMonthRowView) childAt;
                dailyMonthRowView.setVisibility(0);
                if (localDateWith.getMonthValue() == month.getMonthValue() || localDateWith.plusDays(6L).getMonthValue() == month.getMonthValue()) {
                    dailyMonthRowView.e(localDateWith, month);
                    localDateWith = localDateWith.plusDays(7L);
                } else {
                    dailyMonthRowView.setVisibility(8);
                    localDateWith = localDateWith.plusDays(7L);
                }
            }
        }
    }
}
