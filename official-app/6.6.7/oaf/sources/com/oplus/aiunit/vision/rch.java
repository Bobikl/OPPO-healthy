package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.health.sleep_breath_rate.R$id;
import com.health.sleep_breath_rate.R$layout;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/rch;", "Lcom/oplus/aiunit/vision/ceh;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", "p", "", "e", "Landroid/widget/TextView;", "s", "Landroid/widget/TextView;", "tvMore", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class rch extends ceh {
    public static final int $stable = 8;

    @Nullable
    public TextView s;

    @SensorsDataInstrumented
    public static final void t(View view) {
        e1.d().b("/sleep/SleepBreathRateDescriptionActivity").navigation();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public int e() {
        return R$layout.health_sleep_br_about_card;
    }

    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.tvMore);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewA;
        this.s = textView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.qch
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rch.t(view);
                }
            });
        }
    }
}
