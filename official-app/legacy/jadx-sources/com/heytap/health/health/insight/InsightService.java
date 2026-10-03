package com.heytap.health.health.insight;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.core.widget.charts.CrossAnalysisChart;
import com.heytap.health.core.widget.charts.SignsCombinedChart;
import com.oplus.aiunit.vision.dr9;
import com.oplus.aiunit.vision.er9;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.f8b;
import com.oplus.aiunit.vision.u5h;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\f\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&J'\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH&J!\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00112\u0006\u0010#\u001a\u00020\"H¦@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H&J\b\u0010+\u001a\u00020*H&J\u0019\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\b\u0010.\u001a\u00020\u0002H&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011H&J\u0018\u00103\u001a\u0002022\u0006\u00101\u001a\u0002002\u0006\u0010\u001b\u001a\u00020\u001aH&J\u001c\u00107\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u000105H&J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/heytap/health/health/insight/InsightService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "stillNeedCard", "Lcom/oplus/aiunit/vision/dr9;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "A6", "Lcom/oplus/aiunit/vision/er9;", "b2", "Landroidx/lifecycle/LiveData;", "m0", "o2", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "fa", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "Lcom/oplus/aiunit/vision/u5h;", "eventList", "dateInt", "G1", "(Ljava/util/List;Ljava/lang/Integer;)V", "Lcom/heytap/health/base/base/BaseActivity;", "baseActivity", "z3", "Lcom/heytap/health/health/insight/DevSignsData;", "devSignsData", "Lcom/heytap/health/core/widget/charts/SignsCombinedChart;", "signsChart", "N2", "Lcom/heytap/health/core/widget/charts/CrossAnalysisChart;", "crossChart", "D6", "", "curDayTime", "", "O5", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/f8b;", "logicType", "s8", "", "v0", "Ja", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v8", "p5", "Landroid/content/Context;", "context", "Landroid/view/View;", "E7", "date", "Ljava/lang/Runnable;", "callback", "K0", "W0", "health_release"}, k = 1, mv = {1, 8, 0})
public interface InsightService extends IProvider {
    @NotNull
    dr9<RecyclerView.ViewHolder> A6(int stillNeedCard);

    void D6(@NotNull DevSignsData devSignsData, @NotNull CrossAnalysisChart crossChart);

    @NotNull
    View E7(@NotNull Context context, @NotNull DevSignsData devSignsData);

    void G1(@NotNull List<? extends u5h> eventList, @Nullable Integer dateInt);

    @Nullable
    Object Ja(@NotNull Continuation<? super List<Integer>> continuation);

    void K0(int date, @Nullable Runnable callback);

    void N2(@NotNull DevSignsData devSignsData, @NotNull SignsCombinedChart signsChart);

    @Nullable
    Object O5(long j2, @NotNull Continuation<? super List<Float>> continuation);

    @NotNull
    LiveData<Integer> W0();

    @NotNull
    er9<RecyclerView.ViewHolder> b2();

    void fa(@Nullable Integer startDate, @Nullable Integer endDate);

    @NotNull
    LiveData<?> m0();

    @NotNull
    LiveData<Integer> o2();

    @NotNull
    List<DevSignsData> p5();

    void s8(@NotNull f8b logicType);

    boolean v0();

    int v8();

    void z3(@NotNull BaseActivity baseActivity);
}
