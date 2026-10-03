package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.heytap.health.hrv.R$id;
import com.heytap.health.hrv.R$layout;
import com.heytap.health.hrv.R$string;
import com.heytap.health.hrv.hrv.util.HrvDataType;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0018\u0010%\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0018\u0010'\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0018\u0010)\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0018\u0010+\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/wf9;", "Lcom/oplus/aiunit/vision/ap8;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/lg9;", "curHrvDayBean", "s", "Lcom/oplus/aiunit/vision/xf9;", "hrvAnalyzeDataBean", "r", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "healthFrgType", "Lcom/heytap/health/hrv/hrv/util/HrvDataType;", "q", "Lcom/heytap/health/hrv/hrv/util/HrvDataType;", "hrvDataType", "Landroid/view/View;", "rootView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "tvAnalyzeValue", "Landroid/widget/RelativeLayout;", "t", "Landroid/widget/RelativeLayout;", "rvContrast", "u", "tvContrastTitle", "v", "tvContrastValue", "w", "rvTypical", "x", "tvTypicalTitle", "y", "tvTypicalValue", "z", "tvTypicalTip", "<init>", "(Lcom/heytap/health/healthbase/util/HealthFrgType;Lcom/heytap/health/hrv/hrv/util/HrvDataType;)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class wf9 extends ap8 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final HealthFrgType healthFrgType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final HrvDataType hrvDataType;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public View rootView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public TextView tvAnalyzeValue;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvContrast;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public TextView tvContrastTitle;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public TextView tvContrastValue;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvTypical;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public TextView tvTypicalTitle;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public TextView tvTypicalValue;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public TextView tvTypicalTip;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HealthFrgType.values().length];
            try {
                iArr[HealthFrgType.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HealthFrgType.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HealthFrgType.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HealthFrgType.MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wf9(@NotNull HealthFrgType healthFrgType, @NotNull HrvDataType hrvDataType) {
        Intrinsics.checkNotNullParameter(healthFrgType, "healthFrgType");
        Intrinsics.checkNotNullParameter(hrvDataType, "hrvDataType");
        this.healthFrgType = healthFrgType;
        this.hrvDataType = hrvDataType;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_hrv_analysis_view;
    }

    @Override // com.oplus.aiunit.vision.ap8
    public void p(@NotNull Context context, @NotNull View cardView) {
        TextView textView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.rootView);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.view.View");
        this.rootView = viewA;
        View viewA2 = a(cardView, R$id.tvAnalyzeValue);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.TextView");
        this.tvAnalyzeValue = (TextView) viewA2;
        View viewA3 = a(cardView, R$id.rvContrast);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvContrast = (RelativeLayout) viewA3;
        View viewA4 = a(cardView, R$id.tvContrastTitle);
        Intrinsics.checkNotNull(viewA4, "null cannot be cast to non-null type android.widget.TextView");
        this.tvContrastTitle = (TextView) viewA4;
        View viewA5 = a(cardView, R$id.tvContrastValue);
        Intrinsics.checkNotNull(viewA5, "null cannot be cast to non-null type android.widget.TextView");
        this.tvContrastValue = (TextView) viewA5;
        View viewA6 = a(cardView, R$id.rvTypical);
        Intrinsics.checkNotNull(viewA6, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvTypical = (RelativeLayout) viewA6;
        View viewA7 = a(cardView, R$id.tvTypicalTitle);
        Intrinsics.checkNotNull(viewA7, "null cannot be cast to non-null type android.widget.TextView");
        this.tvTypicalTitle = (TextView) viewA7;
        View viewA8 = a(cardView, R$id.tvTypicalValue);
        Intrinsics.checkNotNull(viewA8, "null cannot be cast to non-null type android.widget.TextView");
        this.tvTypicalValue = (TextView) viewA8;
        View viewA9 = a(cardView, R$id.tvTypicalTip);
        Intrinsics.checkNotNull(viewA9, "null cannot be cast to non-null type android.widget.TextView");
        this.tvTypicalTip = (TextView) viewA9;
        int i = a.$EnumSwitchMapping$0[this.healthFrgType.ordinal()];
        if (i == 1) {
            RelativeLayout relativeLayout = this.rvContrast;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
        } else if (i == 2) {
            RelativeLayout relativeLayout2 = this.rvContrast;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            RelativeLayout relativeLayout3 = this.rvTypical;
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(8);
            }
        } else if (i == 3) {
            TextView textView2 = this.tvContrastTitle;
            if (textView2 != null) {
                textView2.setText(context.getString(R$string.health_hrv_analyze_contrast));
            }
        } else if (i == 4 && (textView = this.tvContrastTitle) != null) {
            textView.setText(context.getString(R$string.health_hrv_analyze_contrast2));
        }
        if (this.hrvDataType == HrvDataType.ALL_DAY) {
            TextView textView3 = this.tvTypicalTip;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            RelativeLayout relativeLayout4 = this.rvTypical;
            if (relativeLayout4 == null) {
                return;
            }
            relativeLayout4.setVisibility(8);
        }
    }

    public final void r(@Nullable xf9 hrvAnalyzeDataBean) {
        String str;
        String string;
        String str2;
        String str3 = "--";
        if (hrvAnalyzeDataBean != null) {
            if (hrvAnalyzeDataBean.getCurAvgHrv() > 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string2 = getContext().getString(R$string.health_hrv_charts_value_format);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…_hrv_charts_value_format)");
                str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(hrvAnalyzeDataBean.getCurAvgHrv())}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                if (hrvAnalyzeDataBean.getBeforeAvgHrv() > 0) {
                    int iAbs = hrvAnalyzeDataBean.getBeforeAvgHrv() > 0 ? (int) ((((double) Math.abs(hrvAnalyzeDataBean.getCurAvgHrv() - hrvAnalyzeDataBean.getBeforeAvgHrv())) / ((double) hrvAnalyzeDataBean.getBeforeAvgHrv())) * ((double) 100)) : 100;
                    if (hrvAnalyzeDataBean.getCurAvgHrv() > hrvAnalyzeDataBean.getBeforeAvgHrv()) {
                        String string3 = getContext().getString(R$string.health_hrv_contrast_up_v2);
                        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ealth_hrv_contrast_up_v2)");
                        string = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf(iAbs)}, 1));
                        Intrinsics.checkNotNullExpressionValue(string, "format(...)");
                    } else if (hrvAnalyzeDataBean.getCurAvgHrv() < hrvAnalyzeDataBean.getBeforeAvgHrv()) {
                        String string4 = getContext().getString(R$string.health_hrv_contrast_down_v2);
                        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…lth_hrv_contrast_down_v2)");
                        string = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(iAbs)}, 1));
                        Intrinsics.checkNotNullExpressionValue(string, "format(...)");
                    } else {
                        string = getContext().getString(R$string.health_hrv_contrast_equal);
                        Intrinsics.checkNotNullExpressionValue(string, "{\n                      …al)\n                    }");
                    }
                } else {
                    string = "--";
                }
            } else {
                str2 = "--";
                string = str2;
            }
            if (hrvAnalyzeDataBean.getIntervalLow() > 0 || hrvAnalyzeDataBean.getIntervalHigh() > 0) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string5 = getContext().getString(R$string.health_hrv_charts_marker_content_format);
                Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…ts_marker_content_format)");
                String str4 = String.format(string5, Arrays.copyOf(new Object[]{String.valueOf(hrvAnalyzeDataBean.getIntervalLow()), String.valueOf(hrvAnalyzeDataBean.getIntervalHigh())}, 2));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                str3 = str4;
            }
            str = str3;
            str3 = str2;
        } else {
            str = "--";
            string = str;
        }
        TextView textView = this.tvAnalyzeValue;
        if (textView != null) {
            textView.setText(str3);
        }
        TextView textView2 = this.tvContrastValue;
        if (textView2 != null) {
            textView2.setText(string);
        }
        TextView textView3 = this.tvTypicalValue;
        if (textView3 == null) {
            return;
        }
        textView3.setText(str);
    }

    public final void s(@NotNull SleepHeartRateDayBean curHrvDayBean) {
        String str;
        Intrinsics.checkNotNullParameter(curHrvDayBean, "curHrvDayBean");
        String str2 = "--";
        if (curHrvDayBean.getAvgValue() > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getContext().getString(R$string.health_hrv_charts_value_format);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_hrv_charts_value_format)");
            str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(curHrvDayBean.getAvgValue())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = "--";
        }
        if (curHrvDayBean.getLowThreshold() > 0 || curHrvDayBean.getHighThreshold() > 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = getContext().getString(R$string.health_hrv_charts_marker_content_format);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ts_marker_content_format)");
            str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(curHrvDayBean.getLowThreshold()), String.valueOf(curHrvDayBean.getHighThreshold())}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        TextView textView = this.tvAnalyzeValue;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.tvTypicalValue;
        if (textView2 == null) {
            return;
        }
        textView2.setText(str2);
    }
}
