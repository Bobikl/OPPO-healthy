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
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/a9h;", "Lcom/oplus/aiunit/vision/kah;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/j9h;", "sleepBRDayDataBean", "s", "Lcom/oplus/aiunit/vision/x9h;", "sleepBRVisibleDataBean", "t", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "healthFrgType", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "tvRangeValue", "u", "tvTypicalValue", "Landroid/widget/RelativeLayout;", "v", "Landroid/widget/RelativeLayout;", "rvTypical", "<init>", "(Lcom/heytap/health/healthbase/util/HealthFrgType;)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class a9h extends kah {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final HealthFrgType healthFrgType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public TextView tvRangeValue;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public TextView tvTypicalValue;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvTypical;

    public a9h(@NotNull HealthFrgType healthFrgType) {
        Intrinsics.checkNotNullParameter(healthFrgType, "healthFrgType");
        this.healthFrgType = healthFrgType;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_sleep_br_analyze_card;
    }

    @Override // com.oplus.aiunit.vision.ap8
    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.tvRangeValue);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.widget.TextView");
        this.tvRangeValue = (TextView) viewA;
        View viewA2 = a(cardView, R$id.tvTypicalValue);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.TextView");
        this.tvTypicalValue = (TextView) viewA2;
        View viewA3 = a(cardView, R$id.rvTypical);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvTypical = (RelativeLayout) viewA3;
    }

    public final void s(@NotNull j9h sleepBRDayDataBean) {
        Intrinsics.checkNotNullParameter(sleepBRDayDataBean, "sleepBRDayDataBean");
        if (sleepBRDayDataBean.getMinValue() == sleepBRDayDataBean.getMaxValue()) {
            TextView textView = this.tvRangeValue;
            if (textView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getContext().getString(R$string.health_sleep_br_charts_marker_range1);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_br_charts_marker_range1)");
                String str = String.format(string, Arrays.copyOf(new Object[]{"--"}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
            }
        } else {
            TextView textView2 = this.tvRangeValue;
            if (textView2 != null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = getContext().getString(R$string.health_sleep_br_charts_marker_range2);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…_br_charts_marker_range2)");
                String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepBRDayDataBean.getMinValue()), String.valueOf(sleepBRDayDataBean.getMaxValue())}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textView2.setText(str2);
            }
        }
        if (sleepBRDayDataBean.getLowThreshold() == sleepBRDayDataBean.getHighThreshold()) {
            TextView textView3 = this.tvTypicalValue;
            if (textView3 == null) {
                return;
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string3 = getContext().getString(R$string.health_sleep_br_charts_marker_range1);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…_br_charts_marker_range1)");
            String str3 = String.format(string3, Arrays.copyOf(new Object[]{"--"}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            textView3.setText(str3);
            return;
        }
        TextView textView4 = this.tvTypicalValue;
        if (textView4 == null) {
            return;
        }
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String string4 = getContext().getString(R$string.health_sleep_br_charts_marker_range2);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…_br_charts_marker_range2)");
        String str4 = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(sleepBRDayDataBean.getLowThreshold()), String.valueOf(sleepBRDayDataBean.getHighThreshold())}, 2));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        textView4.setText(str4);
    }

    public final void t(@NotNull x9h sleepBRVisibleDataBean) {
        Intrinsics.checkNotNullParameter(sleepBRVisibleDataBean, "sleepBRVisibleDataBean");
        if (sleepBRVisibleDataBean.getMinValue() == sleepBRVisibleDataBean.getMaxValue()) {
            TextView textView = this.tvRangeValue;
            if (textView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getContext().getString(R$string.health_sleep_br_charts_marker_range1);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_br_charts_marker_range1)");
                String str = String.format(string, Arrays.copyOf(new Object[]{"--"}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
            }
        } else {
            TextView textView2 = this.tvRangeValue;
            if (textView2 != null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = getContext().getString(R$string.health_sleep_br_charts_marker_range2);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…_br_charts_marker_range2)");
                String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepBRVisibleDataBean.getMinValue()), String.valueOf(sleepBRVisibleDataBean.getMaxValue())}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textView2.setText(str2);
            }
        }
        RelativeLayout relativeLayout = this.rvTypical;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(this.healthFrgType == HealthFrgType.YEAR ? 8 : 0);
        }
        if (sleepBRVisibleDataBean.getIntervalLow() == sleepBRVisibleDataBean.getIntervalHigh()) {
            TextView textView3 = this.tvTypicalValue;
            if (textView3 == null) {
                return;
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string3 = getContext().getString(R$string.health_sleep_br_charts_marker_range1);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…_br_charts_marker_range1)");
            String str3 = String.format(string3, Arrays.copyOf(new Object[]{"--"}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            textView3.setText(str3);
            return;
        }
        TextView textView4 = this.tvTypicalValue;
        if (textView4 == null) {
            return;
        }
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String string4 = getContext().getString(R$string.health_sleep_br_charts_marker_range2);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…_br_charts_marker_range2)");
        String str4 = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(sleepBRVisibleDataBean.getIntervalLow()), String.valueOf(sleepBRVisibleDataBean.getIntervalHigh())}, 2));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        textView4.setText(str4);
    }
}
