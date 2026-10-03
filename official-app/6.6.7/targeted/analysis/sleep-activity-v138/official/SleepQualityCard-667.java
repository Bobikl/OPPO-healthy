package com.heytap.health.sleep.week.card;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.R$string;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.week.SleepHistoryWeekFragment;
import com.heytap.health.sleep.week.adapter.SleepQualityAdapter;
import com.heytap.health.sleep.week.card.SleepQualityCard;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.dq8;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.iuh;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pfh;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.w4l;
import com.support.dialog.R$style;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b9\u0010:J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J&\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0002J8\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J0\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J0\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J0\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J0\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002R\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107¨\u0006;"}, d2 = {"Lcom/heytap/health/sleep/week/card/SleepQualityCard;", "Lcom/oplus/aiunit/vision/dq8;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "itemView", "f", "visibility", "z", "Lcom/oplus/aiunit/vision/iuh;", "sleepTimeAverageBean", "w", "position", "A", "Landroid/widget/TextView;", "tvTime", "tvStatus", "tvTip1", "tvTip2", "y", "t", "v", "x", "C", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "getFragment", "()Lcom/heytap/health/base/base/BaseFragment;", "fragment", "Lcom/heytap/health/sleep/week/adapter/SleepQualityAdapter;", "q", "Lcom/heytap/health/sleep/week/adapter/SleepQualityAdapter;", "adapter", "Landroidx/recyclerview/widget/RecyclerView;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "s", "Landroid/widget/TextView;", "tvNoData", "Landroid/view/View;", "vPaddingTop", "Landroidx/fragment/app/FragmentActivity;", "u", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Lcom/oplus/aiunit/vision/iuh;", "I", "paddingTopVisibility", "Landroidx/appcompat/app/AlertDialog;", "Landroidx/appcompat/app/AlertDialog;", "couiBottomSheetDialog", "<init>", "(Lcom/heytap/health/base/base/BaseFragment;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepQualityCard extends dq8 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final BaseFragment fragment;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public SleepQualityAdapter adapter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public RecyclerView recycler;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public TextView tvNoData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public View vPaddingTop;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public FragmentActivity fragmentActivity;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public iuh sleepTimeAverageBean;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int paddingTopVisibility;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public AlertDialog couiBottomSheetDialog;

    public SleepQualityCard(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
        this.fragmentActivity = fragmentActivityRequireActivity;
        this.paddingTopVisibility = 8;
    }

    public static final void B(DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    public static final void u(SleepQualityCard this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m8b.f("SleepQualityCard", "OnItemClick:" + i);
        SleepQualityAdapter sleepQualityAdapter = this$0.adapter;
        iuh item = sleepQualityAdapter != null ? sleepQualityAdapter.getItem(i) : null;
        if (item != null) {
            this$0.A(item, i);
        }
    }

    public final void A(iuh sleepTimeAverageBean, int position) {
        View viewInflate = this.fragmentActivity.getLayoutInflater().inflate(R$layout.health_sleep_day_analyze_dialog, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "fragmentActivity.layoutI…day_analyze_dialog, null)");
        TextView tvTime = (TextView) viewInflate.findViewById(R$id.tv_time);
        TextView tvStatus = (TextView) viewInflate.findViewById(R$id.tv_status);
        TextView tvTip1 = (TextView) viewInflate.findViewById(R$id.tv_tip1);
        TextView tvTip2 = (TextView) viewInflate.findViewById(R$id.tv_tip2);
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(getContext(), R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setView(viewInflate);
        healthAlertDialogBuilder.setNegativeButton(e88.a().getString(R$string.lib_base_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.cqh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SleepQualityCard.B(dialogInterface, i);
            }
        });
        this.couiBottomSheetDialog = healthAlertDialogBuilder.show();
        Intrinsics.checkNotNullExpressionValue(tvTime, "tvTime");
        Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
        Intrinsics.checkNotNullExpressionValue(tvTip1, "tvTip1");
        Intrinsics.checkNotNullExpressionValue(tvTip2, "tvTip2");
        y(sleepTimeAverageBean, position, tvTime, tvStatus, tvTip1, tvTip2);
    }

    public final void C(iuh sleepTimeAverageBean, TextView tvTime, TextView tvStatus, TextView tvTip1, TextView tvTip2) {
        tvTime.setText(s15.d(sleepTimeAverageBean.getTotalWakeSleepAverageTime(), 34.0f, 0, false, 0));
        int iD = pfh.d(sleepTimeAverageBean.getTotalWakeSleepAverageTime());
        String string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_normal);
        Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…ring.health_sleep_normal)");
        if (iD == 1) {
            string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_rather_long);
            Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…health_sleep_rather_long)");
        } else if (iD == 2) {
            string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_over_long);
            Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…g.health_sleep_over_long)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_analyze_tip2);
        Intrinsics.checkNotNullExpressionValue(string2, "fragmentActivity.getStri…ealth_sleep_analyze_tip2)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        tvStatus.setText(str);
        tvTip1.setText(com.heytap.health.sleep.R$string.health_sleep_wake_tip_v2);
        tvTip2.setText(com.heytap.health.sleep.R$string.health_sleep_stage_description_desc32);
        AlertDialog alertDialog = this.couiBottomSheetDialog;
        if (alertDialog != null) {
            alertDialog.setTitle(this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_daily_awake));
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_sleep_history_view_quality_card;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void f(@Nullable Context context, @Nullable View itemView, @Nullable View cardView) {
        super.f(context, itemView, cardView);
        if (cardView != null) {
            BaseFragment baseFragment = this.fragment;
            if (baseFragment instanceof SleepHistoryWeekFragment) {
                w4l.d(baseFragment, cardView);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.dq8
    public void p(@NotNull final Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.tvCardTitle);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewA).setText(com.heytap.health.sleep.R$string.health_sleep_quality);
        View viewA2 = a(cardView, R$id.tvNoData);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.TextView");
        this.tvNoData = (TextView) viewA2;
        View viewA3 = a(cardView, R$id.v_padding_top);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type android.view.View");
        this.vPaddingTop = viewA3;
        View viewA4 = a(cardView, R$id.rvCardList);
        Intrinsics.checkNotNull(viewA4, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewA4;
        this.recycler = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.heytap.health.sleep.week.card.SleepQualityCard$initView$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
        }
        SleepQualityAdapter sleepQualityAdapter = new SleepQualityAdapter(context, new ArrayList());
        this.adapter = sleepQualityAdapter;
        sleepQualityAdapter.setOnItemClickListener(new BaseRecyclerAdapter.a() { // from class: com.oplus.aiunit.vision.bqh
            @Override // com.heytap.health.base.base.BaseRecyclerAdapter.a
            public final void onItemClick(int i) {
                SleepQualityCard.u(this.a, i);
            }
        });
        RecyclerView recyclerView2 = this.recycler;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.adapter);
        }
        View view = this.vPaddingTop;
        if (view != null) {
            view.setVisibility(this.paddingTopVisibility);
        }
        w(this.sleepTimeAverageBean);
    }

    public final void t(iuh sleepTimeAverageBean, TextView tvTime, TextView tvStatus, TextView tvTip1, TextView tvTip2) {
        tvTime.setText(s15.d(sleepTimeAverageBean.getTotalDeepSleepAverageTime(), 34.0f, 0, false, 0));
        int iA = pfh.a(sleepTimeAverageBean.getDeepSleepScale());
        String string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_normal);
        Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…ring.health_sleep_normal)");
        if (iA == -2) {
            string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_over_less);
            Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…g.health_sleep_over_less)");
        } else if (iA == -1) {
            string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_rahter_less);
            Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…health_sleep_rahter_less)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_analyze_tip);
        Intrinsics.checkNotNullExpressionValue(string2, "fragmentActivity.getStri…health_sleep_analyze_tip)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepTimeAverageBean.getDeepSleepScale()), string}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        tvStatus.setText(str);
        tvTip1.setText(com.heytap.health.sleep.R$string.health_sleep_deep_desc_1);
        tvTip2.setText(com.heytap.health.sleep.R$string.health_sleep_deep_tip2);
        AlertDialog alertDialog = this.couiBottomSheetDialog;
        if (alertDialog != null) {
            alertDialog.setTitle(this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_daily_deep));
        }
    }

    public final void v(iuh sleepTimeAverageBean, TextView tvTime, TextView tvStatus, TextView tvTip1, TextView tvTip2) {
        tvTime.setText(s15.d(sleepTimeAverageBean.getTotalLightSleepAverageTime(), 34.0f, 0, false, 0));
        int iB = pfh.b(sleepTimeAverageBean.getTotalRemSleepAverageTime(), sleepTimeAverageBean.getLightSleepScale());
        String string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_normal);
        Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…ring.health_sleep_normal)");
        if (iB == 1) {
            string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_rather_more);
            Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…health_sleep_rather_more)");
        } else if (iB == 2) {
            string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_over_more);
            Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…g.health_sleep_over_more)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_analyze_tip);
        Intrinsics.checkNotNullExpressionValue(string2, "fragmentActivity.getStri…health_sleep_analyze_tip)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(sleepTimeAverageBean.getLightSleepScale()), string}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        tvStatus.setText(str);
        if (sleepTimeAverageBean.getTotalRemSleepAverageTime() > 0) {
            tvTip1.setText(com.heytap.health.sleep.R$string.health_sleep_light_desc_has_rem);
        } else {
            tvTip1.setText(com.heytap.health.sleep.R$string.health_sleep_light_desc_no_rem);
        }
        tvTip2.setText(com.heytap.health.sleep.R$string.health_sleep_lightly_tip2);
        AlertDialog alertDialog = this.couiBottomSheetDialog;
        if (alertDialog != null) {
            alertDialog.setTitle(this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_daily_light));
        }
    }

    public final void w(@Nullable iuh sleepTimeAverageBean) {
        this.sleepTimeAverageBean = sleepTimeAverageBean;
        if (this.tvNoData == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (sleepTimeAverageBean != null) {
            int i = sleepTimeAverageBean.getTotalRemSleepAverageTime() <= 0 ? 2 : 3;
            if (i >= 0) {
                int i2 = 0;
                while (true) {
                    arrayList.add(sleepTimeAverageBean);
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            TextView textView = this.tvNoData;
            if (textView != null) {
                textView.setVisibility(0);
            }
            RecyclerView recyclerView = this.recycler;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        TextView textView2 = this.tvNoData;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.recycler;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        SleepQualityAdapter sleepQualityAdapter = this.adapter;
        if (sleepQualityAdapter != null) {
            sleepQualityAdapter.setNewData(arrayList);
        }
    }

    public final void x(iuh sleepTimeAverageBean, TextView tvTime, TextView tvStatus, TextView tvTip1, TextView tvTip2) {
        tvTime.setText(s15.d(sleepTimeAverageBean.getTotalRemSleepAverageTime(), 34.0f, 0, false, 0));
        int iC = pfh.c(sleepTimeAverageBean.getRemSleepScale());
        String string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_normal);
        Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…ring.health_sleep_normal)");
        if (iC == -1) {
            string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_rahter_less);
            Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…health_sleep_rahter_less)");
        } else if (iC == 1) {
            string = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_rather_more);
            Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…health_sleep_rather_more)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_analyze_tip);
        Intrinsics.checkNotNullExpressionValue(string2, "fragmentActivity.getStri…health_sleep_analyze_tip)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepTimeAverageBean.getRemSleepScale()), string}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        tvStatus.setText(str);
        tvTip1.setText(com.heytap.health.sleep.R$string.health_sleep_rem_tip1);
        tvTip2.setText(com.heytap.health.sleep.R$string.health_sleep_rem_tip2);
        AlertDialog alertDialog = this.couiBottomSheetDialog;
        if (alertDialog != null) {
            alertDialog.setTitle(this.fragmentActivity.getString(com.heytap.health.sleep.R$string.health_sleep_daily_wake));
        }
    }

    public final void y(iuh sleepTimeAverageBean, int position, TextView tvTime, TextView tvStatus, TextView tvTip1, TextView tvTip2) {
        tvStatus.setVisibility(0);
        if (position == 0) {
            t(sleepTimeAverageBean, tvTime, tvStatus, tvTip1, tvTip2);
            return;
        }
        if (position == 1) {
            v(sleepTimeAverageBean, tvTime, tvStatus, tvTip1, tvTip2);
            return;
        }
        if (position != 2) {
            if (position != 3) {
                return;
            }
            C(sleepTimeAverageBean, tvTime, tvStatus, tvTip1, tvTip2);
        } else if (sleepTimeAverageBean.getTotalRemSleepAverageTime() > 0) {
            x(sleepTimeAverageBean, tvTime, tvStatus, tvTip1, tvTip2);
        } else {
            C(sleepTimeAverageBean, tvTime, tvStatus, tvTip1, tvTip2);
        }
    }

    public final void z(int visibility) {
        this.paddingTopVisibility = visibility;
        View view = this.vPaddingTop;
        if (view == null) {
            return;
        }
        view.setVisibility(visibility);
    }
}