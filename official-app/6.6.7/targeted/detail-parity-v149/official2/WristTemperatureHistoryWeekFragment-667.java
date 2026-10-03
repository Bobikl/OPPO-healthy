package com.heytap.health.wrist_temperature.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.wrist_temperature.R$id;
import com.heytap.health.wrist_temperature.R$layout;
import com.heytap.health.wrist_temperature.R$plurals;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryWeekFragment;
import com.heytap.health.wrist_temperature.util.ChartType;
import com.heytap.health.wrist_temperature.view.WristHistoryChartTouchListener;
import com.oplus.aiunit.vision.TimeStampedCandleData;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.e8m;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.xp0;
import com.oplus.aiunit.vision.zh2;
import com.oplus.smartenginehelper.ParserTag;
import com.support.appcompat.R$attr;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ]2\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b[\u0010\\J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0014J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0003J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J(\u0010&\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000b2\u0006\u0010%\u001a\u00020$H\u0002R\u001e\u0010*\u001a\n '*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u0016\u00108\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u0010-R\u0016\u0010:\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010-R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010=R\u0016\u0010J\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010-R\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010R\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010-R\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006_"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryWeekFragment;", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryBaseFragment;", "Landroid/view/View;", "view", "", "initView", "initData", "v1", "Lcom/heytap/health/wrist_temperature/util/ChartType;", "u0", "A2", "", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "dataList", acl.KEY_C2, "Ljava/time/LocalDate;", "r0", "", "startTime", "endTime", "V1", "date", "P1", "time", "M2", "", "num", "h3", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "fragment", "g3", "b3", "Landroid/content/Context;", "context", "", "messageList", "Landroid/view/ViewGroup;", ParserTag.CHILD_LAYOUT, "a3", "kotlin.jvm.PlatformType", "S", "Ljava/time/LocalDate;", "currentDate", "Landroid/widget/TextView;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/widget/TextView;", "N2", "()Landroid/widget/TextView;", "c3", "(Landroid/widget/TextView;)V", "detailCardTitle", "U", "O2", "d3", "noDetailTitle", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "noDetailContent", ExifInterface.LONGITUDE_WEST, "downCountTv", "Landroidx/cardview/widget/CardView;", "X", "Landroidx/cardview/widget/CardView;", "P2", "()Landroidx/cardview/widget/CardView;", "e3", "(Landroidx/cardview/widget/CardView;)V", "wristDetailCard", "Y", "Q2", "f3", "wristStateCard", "Z", "mExplanationLayout", "a0", "mLearnMoreTv", "Landroid/widget/ImageView;", "b0", "Landroid/widget/ImageView;", "mCardViewDismiss", "c0", "mDialogDismiss", "d0", "mInstructionsText", "Landroid/widget/LinearLayout;", "e0", "Landroid/widget/LinearLayout;", "mWristStateLayout", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "f0", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "mDialogFragment", "<init>", "()V", "Companion", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWristTemperatureHistoryWeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WristTemperatureHistoryWeekFragment.kt\ncom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryWeekFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1#2:379\n*E\n"})
public final class WristTemperatureHistoryWeekFragment extends WristTemperatureHistoryBaseFragment {

    @NotNull
    public static final String TAG = "WTWeekFragment";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public LocalDate currentDate = LocalDate.now();

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public TextView detailCardTitle;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public TextView noDetailTitle;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public TextView noDetailContent;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public TextView downCountTv;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public CardView wristDetailCard;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public CardView wristStateCard;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public CardView mExplanationLayout;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public TextView mLearnMoreTv;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ImageView mCardViewDismiss;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ImageView mDialogDismiss;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public TextView mInstructionsText;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public LinearLayout mWristStateLayout;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @Nullable
    public COUIBottomSheetDialogFragment mDialogFragment;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/wrist_temperature/ui/WristTemperatureHistoryWeekFragment$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ohb {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return m6m.INSTANCE.g(entry.getY(), WristTemperatureHistoryWeekFragment.this.getContext()) + WristTemperatureHistoryWeekFragment.this.getString(R$string.health_wrist_temperature_unit);
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object data = entry.getData();
            if (data instanceof TimeStampedData) {
                Object data2 = entry.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
                String strG = lo9.g(((TimeStampedData) data2).getTimestamp(), "yyyMMMdd");
                Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
                return strG;
            }
            if (!(data instanceof TimeStampedCandleData)) {
                return "anything";
            }
            Object data3 = entry.getData();
            Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
            String strG2 = lo9.g(((TimeStampedCandleData) data3).getTimestamp(), "yyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG2, "{\n                      …                        }");
            return strG2;
        }
    }

    public static final String R2(WristTemperatureHistoryWeekFragment this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long unit = (long) (d * this$0.M0().getXAxisTimeUnit().getUnit());
        return lo9.d(unit, System.currentTimeMillis()) ? this$0.getString(com.heytap.health.base.R$string.lib_base_chart_today) : lo9.c(this$0.getContext(), unit);
    }

    public static final void S2(WristTemperatureHistoryWeekFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.startActivity(new Intent(this$0.getActivity(), (Class<?>) WristTemperatureDescriptionActivity.class));
        }
        if (this$0.u5()) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).a(xmk.TAG_POSTION2, 2).b();
    }

    public static final void U2(WristTemperatureHistoryWeekFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fdg.x("wrist_day_explain").W("wrist_day_explain", false);
        if (this$0.u5()) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).a(xmk.TAG_POSTION2, 1).b();
    }

    public static final void V2(WristTemperatureHistoryWeekFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardView cardView = this$0.mExplanationLayout;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mExplanationLayout");
            cardView = null;
        }
        cardView.setVisibility(8);
        fdg.x("wrist_day_bubble").W("wrist_day_bubble", false);
    }

    public static final void W2(WristTemperatureHistoryWeekFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g3(new WristTemperatureUndulationFrag());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void A2() {
        m8b.f(TAG, "mStartTime:" + getMStartTime() + " mEndTime:" + getMEndTime());
        f1().G(O0(), getMStartTime(), getMEndTime());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void C2(@NotNull List<WristTemperatureStat> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        m8b.f(TAG, "week updateChart list:" + dataList);
        M0().setTimeXAxisMinimum(getMStartTime());
        M0().setTimeXAxisMaximum(getMEndTime());
        M0().setVisibleXRange(7.0f, 7.0f);
        e2(dataList);
        M0().setEntryData(p0(dataList));
        M0().moveViewToX(B2(getChartLowestVisibleTime()));
        V1(getChartLowestVisibleTime(), getChartHighestVisibleTime());
    }

    public final WristTemperatureStat M2(long time) {
        int iE = pr8.INSTANCE.e(time);
        int size = N0().size();
        for (int i = 0; i < size; i++) {
            if (iE == N0().get(i).getDate()) {
                return N0().get(i);
            }
        }
        return null;
    }

    @NotNull
    public final TextView N2() {
        TextView textView = this.detailCardTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("detailCardTitle");
        return null;
    }

    @NotNull
    public final TextView O2() {
        TextView textView = this.noDetailTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noDetailTitle");
        return null;
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void P1(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        long jZ0 = z0(J1(h15.F(date)));
        long jY0 = y0(J1(h15.F(date)));
        M0().moveViewToX(B2(jZ0));
        V1(jZ0, jY0);
        R1(jZ0, jY0);
    }

    @NotNull
    public final CardView P2() {
        CardView cardView = this.wristDetailCard;
        if (cardView != null) {
            return cardView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wristDetailCard");
        return null;
    }

    @NotNull
    public final CardView Q2() {
        CardView cardView = this.wristStateCard;
        if (cardView != null) {
            return cardView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wristStateCard");
        return null;
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void V1(long startTime, long endTime) {
        String strG;
        String strG2;
        m8b.f(TAG, "week refreshDate startTime:" + startTime + ",endTime:" + endTime);
        Calendar calendar = Calendar.getInstance();
        int i = 1;
        int i2 = calendar.get(1);
        calendar.setTimeInMillis(startTime);
        int i3 = calendar.get(1);
        calendar.setTimeInMillis(endTime);
        int i4 = calendar.get(1);
        if (i2 == i3 && i2 == i4) {
            strG = lo9.g(startTime, "MMMdd");
            Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(startTime, \"MMMdd\")");
            strG2 = lo9.g(endTime, "MMMdd");
            Intrinsics.checkNotNullExpressionValue(strG2, "localeDateFormat(endTime, \"MMMdd\")");
        } else {
            strG = lo9.g(startTime, "yyyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(startTime, \"yyyyMMMdd\")");
            strG2 = lo9.g(endTime, "yyyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG2, "localeDateFormat(endTime, \"yyyyMMMdd\")");
        }
        this.currentDate = K1(startTime).toLocalDate();
        P0().setText(getResources().getString(R$string.health_wrist_temperature_format_date, strG, strG2));
        if (startTime <= getMStartTime()) {
            Z0().setVisibility(8);
        } else {
            Z0().setVisibility(0);
        }
        if (endTime >= getMEndTime()) {
            Y0().setVisibility(8);
        } else {
            Y0().setVisibility(0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i5 = -1;
        if (startTime <= jCurrentTimeMillis && jCurrentTimeMillis <= endTime) {
            P2().setVisibility(0);
            WristTemperatureStat wristTemperatureStatM2 = M2(System.currentTimeMillis());
            i5 = (wristTemperatureStatM2 == null || wristTemperatureStatM2.getDayBaseLineWristTemperature() == 0) ? 0 : -1;
            int wristStat = getWristStat();
            if (wristStat == 1) {
                m8b.f(TAG, "wristStat is 1");
                i = 0;
            } else if (wristStat != 2) {
                if (wristStat == 3 && getIfShowBubble()) {
                    CardView cardView = this.mExplanationLayout;
                    if (cardView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mExplanationLayout");
                        cardView = null;
                    }
                    cardView.setVisibility(0);
                }
                i = i5;
            }
            i5 = getIfShowCountDown() ? 2 : i;
        }
        h3(i5);
        b3(startTime, endTime);
    }

    public final void a3(Context context, List<String> messageList, ViewGroup layout) {
        if (messageList.isEmpty()) {
            return;
        }
        layout.removeAllViews();
        int size = messageList.size();
        for (int i = 0; i < size; i++) {
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.health_wrist_state_card_item, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R$id.wrist_state_item_tv)).setText(messageList.get(i));
            layout.addView(viewInflate);
        }
    }

    public final void b3(long startTime, long endTime) {
        Q2().setVisibility(0);
        ArrayList arrayList = new ArrayList();
        pr8 pr8Var = pr8.INSTANCE;
        int iE = pr8Var.e(startTime);
        int iE2 = pr8Var.e(endTime);
        int size = N0().size();
        for (int i = 0; i < size; i++) {
            int date = N0().get(i).getDate();
            if ((iE <= date && date <= iE2) && N0().get(i).getDayBaseLineWristTemperature() != 0 && N0().get(i).getSymptoms() != 255 && N0().get(i).getActions() != 255 && (N0().get(i).getSymptoms() != 0 || N0().get(i).getActions() != 0)) {
                arrayList.add(N0().get(i));
            }
        }
        if (arrayList.isEmpty()) {
            Q2().setVisibility(8);
            return;
        }
        LinearLayout linearLayout = this.mWristStateLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWristStateLayout");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            List<String> listB = m6m.INSTANCE.b(((WristTemperatureStat) arrayList.get(i2)).getSymptoms(), ((WristTemperatureStat) arrayList.get(i2)).getActions(), getContext());
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            int i3 = R$layout.health_wrist_state_item;
            LinearLayout linearLayout2 = this.mWristStateLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWristStateLayout");
                linearLayout2 = null;
            }
            View viewInflate = layoutInflaterFrom.inflate(i3, (ViewGroup) linearLayout2, false);
            TextView textView = (TextView) viewInflate.findViewById(R$id.tv_date);
            View viewFindViewById = viewInflate.findViewById(R$id.wrist_state_layout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.wrist_state_layout)");
            textView.setText(lo9.g(pr8.INSTANCE.g(((WristTemperatureStat) arrayList.get(i2)).getDate()), "MMMdd"));
            a3(getContext(), listB, (ViewGroup) viewFindViewById);
            LinearLayout linearLayout3 = this.mWristStateLayout;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWristStateLayout");
                linearLayout3 = null;
            }
            linearLayout3.addView(viewInflate);
        }
    }

    public final void c3(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.detailCardTitle = textView;
    }

    public final void d3(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.noDetailTitle = textView;
    }

    public final void e3(@NotNull CardView cardView) {
        Intrinsics.checkNotNullParameter(cardView, "<set-?>");
        this.wristDetailCard = cardView;
    }

    public final void f3(@NotNull CardView cardView) {
        Intrinsics.checkNotNullParameter(cardView, "<set-?>");
        this.wristStateCard = cardView;
    }

    public final void g3(COUIPanelFragment fragment) {
        FragmentManager supportFragmentManager;
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment;
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = this.mDialogFragment;
        if (cOUIBottomSheetDialogFragment2 != null) {
            cOUIBottomSheetDialogFragment2.dismiss();
        }
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = new COUIBottomSheetDialogFragment();
        this.mDialogFragment = cOUIBottomSheetDialogFragment3;
        cOUIBottomSheetDialogFragment3.setMainPanelFragment(fragment);
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (cOUIBottomSheetDialogFragment = this.mDialogFragment) == null) {
            return;
        }
        cOUIBottomSheetDialogFragment.show(supportFragmentManager, "bottomfragment");
    }

    @SuppressLint({"StringFormatMatches"})
    public final void h3(int num) {
        Resources resources;
        if (num == -1) {
            P2().setVisibility(8);
            return;
        }
        TextView textView = null;
        if (num == 0) {
            O2().setVisibility(8);
            O2().setVisibility(8);
            N2().setText(getString(R$string.health_wrist_temperature_no_details));
            TextView textView2 = this.noDetailContent;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noDetailContent");
            } else {
                textView = textView2;
            }
            textView.setText(getString(R$string.health_wrist_no_data_1));
            return;
        }
        if (num == 1) {
            N2().setText(getString(R$string.health_wrist_temperature_no_details));
            O2().setVisibility(8);
            O2().setVisibility(8);
            TextView textView3 = this.noDetailContent;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noDetailContent");
            } else {
                textView = textView3;
            }
            textView.setText(getString(R$string.health_wrist_no_data_2));
            return;
        }
        if (num != 2) {
            return;
        }
        O2().setVisibility(0);
        TextView textView4 = this.downCountTv;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downCountTv");
            textView4 = null;
        }
        textView4.setVisibility(0);
        N2().setText(getString(R$string.health_wrist_temperature_details));
        TextView textViewO2 = O2();
        Context context = getContext();
        textViewO2.setText((context == null || (resources = context.getResources()) == null) ? null : resources.getQuantityString(R$plurals.health_wrist_base_line_count_down, getCountDown(), Integer.valueOf(getCountDown())));
        TextView textView5 = this.noDetailContent;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noDetailContent");
        } else {
            textView = textView5;
        }
        textView.setText(getString(R$string.health_wrist_no_data_3));
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initData() {
        FamilyMoreDataDetailConfigBean familyDetailConfig;
        String ssoid;
        Integer numA;
        super.initData();
        if (!u5() || (familyDetailConfig = getFamilyDetailConfig()) == null || (ssoid = familyDetailConfig.getSsoid()) == null || (numA = e8m.INSTANCE.a(ssoid)) == null) {
            return;
        }
        b2(numA.intValue());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        super.initView(view);
        Q0().setVisibility(0);
        View viewW = W(R$id.tv_wrist_t_detail_text);
        Intrinsics.checkNotNullExpressionValue(viewW, "findViewById(R.id.tv_wrist_t_detail_text)");
        c3((TextView) viewW);
        View viewW2 = W(R$id.no_data_detail_title);
        Intrinsics.checkNotNullExpressionValue(viewW2, "findViewById(R.id.no_data_detail_title)");
        d3((TextView) viewW2);
        View viewW3 = W(R$id.no_data_detail_content);
        Intrinsics.checkNotNullExpressionValue(viewW3, "findViewById(R.id.no_data_detail_content)");
        this.noDetailContent = (TextView) viewW3;
        View viewW4 = W(R$id.wrist_detail_card);
        Intrinsics.checkNotNullExpressionValue(viewW4, "findViewById(R.id.wrist_detail_card)");
        e3((CardView) viewW4);
        View viewW5 = W(R$id.wrist_state_cardview);
        Intrinsics.checkNotNullExpressionValue(viewW5, "findViewById(R.id.wrist_state_cardview)");
        f3((CardView) viewW5);
        View viewW6 = W(R$id.health_wrist_t_explanation_Layout);
        Intrinsics.checkNotNullExpressionValue(viewW6, "findViewById(R.id.health…ist_t_explanation_Layout)");
        this.mExplanationLayout = (CardView) viewW6;
        View viewW7 = W(R$id.tv_wrist_t_learn_more);
        Intrinsics.checkNotNullExpressionValue(viewW7, "findViewById(R.id.tv_wrist_t_learn_more)");
        this.mLearnMoreTv = (TextView) viewW7;
        View viewW8 = W(R$id.about_wrist_temperature_dismiss);
        Intrinsics.checkNotNullExpressionValue(viewW8, "findViewById(R.id.about_wrist_temperature_dismiss)");
        this.mCardViewDismiss = (ImageView) viewW8;
        View viewW9 = W(R$id.dialog_dismiss);
        Intrinsics.checkNotNullExpressionValue(viewW9, "findViewById(R.id.dialog_dismiss)");
        this.mDialogDismiss = (ImageView) viewW9;
        View viewW10 = W(R$id.health_wrist_t_view_instructions);
        Intrinsics.checkNotNullExpressionValue(viewW10, "findViewById(R.id.health…rist_t_view_instructions)");
        this.mInstructionsText = (TextView) viewW10;
        View viewW11 = W(R$id.wrist_state_viewgroup);
        Intrinsics.checkNotNullExpressionValue(viewW11, "findViewById(R.id.wrist_state_viewgroup)");
        this.mWristStateLayout = (LinearLayout) viewW11;
        View viewW12 = W(R$id.wrist_downcount_content);
        Intrinsics.checkNotNullExpressionValue(viewW12, "findViewById(R.id.wrist_downcount_content)");
        this.downCountTv = (TextView) viewW12;
        TextView textView = this.mLearnMoreTv;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLearnMoreTv");
            textView = null;
        }
        textView.setTextColor(zh2.a(getContext(), R$attr.couiColorPrimary));
        TextView textView3 = this.mLearnMoreTv;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLearnMoreTv");
            textView3 = null;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.t7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryWeekFragment.S2(this.i, view2);
            }
        });
        ImageView imageView = this.mCardViewDismiss;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCardViewDismiss");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.u7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryWeekFragment.U2(this.i, view2);
            }
        });
        ImageView imageView2 = this.mDialogDismiss;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogDismiss");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.v7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryWeekFragment.V2(this.i, view2);
            }
        });
        TextView textView4 = this.mInstructionsText;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInstructionsText");
        } else {
            textView2 = textView4;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.w7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryWeekFragment.W2(this.i, view2);
            }
        });
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    @NotNull
    public LocalDate r0() {
        LocalDate currentDate = this.currentDate;
        Intrinsics.checkNotNullExpressionValue(currentDate, "currentDate");
        return currentDate;
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    @NotNull
    public ChartType u0() {
        return ChartType.WEEK;
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void v1() {
        M0().getXAxis().setLabelCount(7);
        M0().setExtraSpace(0.5f);
        M0().setXAxisTimeUnit(TimeUnit.DAY);
        CommonMarkerView commonMarkerView = new CommonMarkerView(M0().getContext(), new b());
        M0().setMarker(commonMarkerView);
        commonMarkerView.setChartView(M0());
        M0().setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.x7m
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return WristTemperatureHistoryWeekFragment.R2(this.a, i, d);
            }
        });
        s2(new WristHistoryChartTouchListener(this, M0(), M0().getViewPortHandler().getMatrixTouch(), 3.0f, 0, 0, 32, null));
        M0().setOnTouchListener((ChartTouchListener) g1());
    }
}