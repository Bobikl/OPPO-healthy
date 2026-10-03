package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.health.sleep_breath_rate.R$id;
import com.health.sleep_breath_rate.R$layout;
import com.health.sleep_breath_rate.R$string;
import com.heytap.health.healthbase.util.HealthFrgType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/sch;", "Lcom/oplus/aiunit/vision/ceh;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", "p", "", "e", "Lcom/oplus/aiunit/vision/bdh;", "sleepBRDayDataBean", "s", "Lcom/oplus/aiunit/vision/pdh;", "sleepBRVisibleDataBean", "t", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "healthFrgType", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "tvRangeValue", "u", "tvTypicalValue", "Landroid/widget/RelativeLayout;", "v", "Landroid/widget/RelativeLayout;", "rvTypical", "<init>", "(Lcom/heytap/health/healthbase/util/HealthFrgType;)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class sch extends ceh {
    public static final int $stable = 8;

    @NotNull
    public final HealthFrgType s;

    @Nullable
    public TextView t;

    @Nullable
    public TextView u;

    @Nullable
    public RelativeLayout v;

    public sch(@NotNull HealthFrgType healthFrgType) {
        Intrinsics.checkNotNullParameter(healthFrgType, "healthFrgType");
        this.s = healthFrgType;
    }

    public int e() {
        return R$layout.health_sleep_br_analyze_card;
    }

    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.tvRangeValue);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.widget.TextView");
        this.t = (TextView) viewA;
        View viewA2 = a(cardView, R$id.tvTypicalValue);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.TextView");
        this.u = (TextView) viewA2;
        View viewA3 = a(cardView, R$id.rvTypical);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.v = (RelativeLayout) viewA3;
    }

    public final void s(@NotNull bdh sleepBRDayDataBean) {
        Intrinsics.checkNotNullParameter(sleepBRDayDataBean, "sleepBRDayDataBean");
        if (sleepBRDayDataBean.getB() == sleepBRDayDataBean.getC()) {
            TextView textView = this.t;
            if (textView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = o().getString(R$string.health_sleep_br_charts_marker_range1);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_br_charts_marker_range1)");
                String str = String.format(string, Arrays.copyOf(new Object[]{"--"}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
            }
        } else {
            TextView textView2 = this.t;
            if (textView2 != null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = o().getString(R$string.health_sleep_br_charts_marker_range2);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…_br_charts_marker_range2)");
                String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepBRDayDataBean.getB()), String.valueOf(sleepBRDayDataBean.getC())}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textView2.setText(str2);
            }
        }
        if (sleepBRDayDataBean.getD() == sleepBRDayDataBean.getE()) {
            TextView textView3 = this.u;
            if (textView3 == null) {
                return;
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string3 = o().getString(R$string.health_sleep_br_charts_marker_range1);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…_br_charts_marker_range1)");
            String str3 = String.format(string3, Arrays.copyOf(new Object[]{"--"}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            textView3.setText(str3);
            return;
        }
        TextView textView4 = this.u;
        if (textView4 == null) {
            return;
        }
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String string4 = o().getString(R$string.health_sleep_br_charts_marker_range2);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…_br_charts_marker_range2)");
        String str4 = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(sleepBRDayDataBean.getD()), String.valueOf(sleepBRDayDataBean.getE())}, 2));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        textView4.setText(str4);
    }

    public final void t(@NotNull pdh sleepBRVisibleDataBean) {
        Intrinsics.checkNotNullParameter(sleepBRVisibleDataBean, "sleepBRVisibleDataBean");
        if (sleepBRVisibleDataBean.getB() == sleepBRVisibleDataBean.getC()) {
            TextView textView = this.t;
            if (textView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = o().getString(R$string.health_sleep_br_charts_marker_range1);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_br_charts_marker_range1)");
                String str = String.format(string, Arrays.copyOf(new Object[]{"--"}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
            }
        } else {
            TextView textView2 = this.t;
            if (textView2 != null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = o().getString(R$string.health_sleep_br_charts_marker_range2);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…_br_charts_marker_range2)");
                String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepBRVisibleDataBean.getB()), String.valueOf(sleepBRVisibleDataBean.getC())}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textView2.setText(str2);
            }
        }
        RelativeLayout relativeLayout = this.v;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(this.s == HealthFrgType.YEAR ? 8 : 0);
        }
        if (sleepBRVisibleDataBean.getD() == sleepBRVisibleDataBean.getE()) {
            TextView textView3 = this.u;
            if (textView3 == null) {
                return;
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string3 = o().getString(R$string.health_sleep_br_charts_marker_range1);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…_br_charts_marker_range1)");
            String str3 = String.format(string3, Arrays.copyOf(new Object[]{"--"}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            textView3.setText(str3);
            return;
        }
        TextView textView4 = this.u;
        if (textView4 == null) {
            return;
        }
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String string4 = o().getString(R$string.health_sleep_br_charts_marker_range2);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…_br_charts_marker_range2)");
        String str4 = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(sleepBRVisibleDataBean.getD()), String.valueOf(sleepBRVisibleDataBean.getE())}, 2));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        textView4.setText(str4);
    }
}
