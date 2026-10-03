package com.oplus.aiunit.vision;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.daily.ui.DailyView;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H&J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H&¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/nq4;", "", "", "b", "Landroid/view/View;", "monthParentView", "Ljava/time/LocalDate;", "firstDayOfMonth", "", "d", "dayParentView", "Lcom/heytap/health/daily/ui/DailyView;", "a", "dailyView", "actualDay", "c", "<init>", "()V", "daily_release"}, k = 1, mv = {1, 8, 0})
public abstract class nq4 {
    public static final int $stable = 0;

    @NotNull
    public abstract DailyView a(@NotNull View dayParentView);

    public abstract int b();

    public abstract void c(@NotNull DailyView dailyView, @NotNull LocalDate actualDay);

    public abstract void d(@NotNull View monthParentView, @NotNull LocalDate firstDayOfMonth);
}
