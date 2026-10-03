package com.oplus.aiunit.vision;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.snore.day.view.SnoreDayViewPageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/cyh;", "", "Lcom/heytap/health/sleep/snore/day/view/SnoreDayViewPageView;", "a", "Lcom/heytap/health/sleep/snore/day/view/SnoreDayViewPageView;", "()Lcom/heytap/health/sleep/snore/day/view/SnoreDayViewPageView;", "setSnoreDayViewPageView", "(Lcom/heytap/health/sleep/snore/day/view/SnoreDayViewPageView;)V", "snoreDayViewPageView", "Lcom/oplus/aiunit/vision/kxh;", "b", "Lcom/oplus/aiunit/vision/kxh;", "getSnoreAnalyzeView", "()Lcom/oplus/aiunit/vision/kxh;", "setSnoreAnalyzeView", "(Lcom/oplus/aiunit/vision/kxh;)V", "snoreAnalyzeView", "Lcom/oplus/aiunit/vision/mth;", "c", "Lcom/oplus/aiunit/vision/mth;", "getSleepSpo2AnalyzeView", "()Lcom/oplus/aiunit/vision/mth;", "setSleepSpo2AnalyzeView", "(Lcom/oplus/aiunit/vision/mth;)V", "sleepSpo2AnalyzeView", "Lcom/oplus/aiunit/vision/s0i;", "d", "Lcom/oplus/aiunit/vision/s0i;", "getSnoreFrgView", "()Lcom/oplus/aiunit/vision/s0i;", "setSnoreFrgView", "(Lcom/oplus/aiunit/vision/s0i;)V", "snoreFrgView", "Lcom/heytap/health/base/base/BaseFragment;", "fragment", "Landroid/view/ViewGroup;", "parentViewGroup", "<init>", "(Lcom/heytap/health/base/base/BaseFragment;Landroid/view/ViewGroup;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class cyh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public SnoreDayViewPageView snoreDayViewPageView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public kxh snoreAnalyzeView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public mth sleepSpo2AnalyzeView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public s0i snoreFrgView;

    public cyh(@NotNull BaseFragment fragment, @NotNull ViewGroup parentViewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(parentViewGroup, "parentViewGroup");
        this.snoreDayViewPageView = new SnoreDayViewPageView(fragment, parentViewGroup);
        this.snoreAnalyzeView = new kxh(fragment, parentViewGroup);
        this.snoreFrgView = new s0i(fragment, parentViewGroup);
        this.sleepSpo2AnalyzeView = new mth(fragment, parentViewGroup);
        View viewInflate = fragment.getLayoutInflater().inflate(R$layout.health_sleep_snore_day_law_tip, (ViewGroup) null);
        parentViewGroup.removeAllViews();
        SnoreDayViewPageView snoreDayViewPageView = this.snoreDayViewPageView;
        Intrinsics.checkNotNull(snoreDayViewPageView);
        parentViewGroup.addView(snoreDayViewPageView.getChildView());
        kxh kxhVar = this.snoreAnalyzeView;
        Intrinsics.checkNotNull(kxhVar);
        parentViewGroup.addView(kxhVar.getChildView());
        s0i s0iVar = this.snoreFrgView;
        Intrinsics.checkNotNull(s0iVar);
        parentViewGroup.addView(s0iVar.getChildView());
        mth mthVar = this.sleepSpo2AnalyzeView;
        Intrinsics.checkNotNull(mthVar);
        parentViewGroup.addView(mthVar.getChildView());
        parentViewGroup.addView(viewInflate);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SnoreDayViewPageView getSnoreDayViewPageView() {
        return this.snoreDayViewPageView;
    }
}