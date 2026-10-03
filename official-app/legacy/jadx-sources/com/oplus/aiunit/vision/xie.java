package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.PhysiqueProgressBarChart;
import com.heytap.sports.R$id;
import com.heytap.sports.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/xie;", "", "Landroid/view/View;", "view", "", "a", "Landroid/content/Context;", "context", "", "Lcom/heytap/health/core/widget/charts/PhysiqueProgressBarChart$b;", "b", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class xie {
    public static final int $stable = 0;

    @NotNull
    public static final xie INSTANCE = new xie();

    public static final PhysiqueProgressBarChart.b c(Context context, String str, String str2, int i) {
        return new PhysiqueProgressBarChart.b(Color.parseColor(str), Color.parseColor(str2), context.getString(i));
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PhysiqueProgressBarChart physiqueProgressBarChart = (PhysiqueProgressBarChart) view.findViewById(R$id.sports_view);
        physiqueProgressBarChart.setMaxProgress(10);
        physiqueProgressBarChart.setProgress(0.0f);
        physiqueProgressBarChart.setShowProgressText(false);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        physiqueProgressBarChart.setData(new PhysiqueProgressBarChart.a(b(context), new String[]{"1.0", "3.0", "5.0", "7.0"}));
    }

    public final List<PhysiqueProgressBarChart.b> b(Context context) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new PhysiqueProgressBarChart.b[]{c(context, "#4DFF5D55", "#4DFF5D55", R$string.sports_record_max_vo2_level_low2), c(context, "#4DFD8227", "#4DFD8227", R$string.sports_record_max_vo2_level_normal), c(context, "#4DFFBB10", "#4DFFBB10", R$string.sports_record_max_vo2_level_good), c(context, "#4D2EC84E", "#4D2EC84E", R$string.sports_record_max_vo2_level_verygood), c(context, "#4D4B93FF", "#4D4B93FF", R$string.sports_record_max_vo2_level_excellence)});
    }
}
