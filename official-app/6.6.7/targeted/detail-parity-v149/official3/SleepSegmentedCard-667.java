package com.heytap.health.sleep.day.card;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.ui.dialog.HealthBottomSheetDialog;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.adapter.SleepAnalyzeAdapter;
import com.heytap.health.sleep.adapter.SleepFrgAdapter;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.day.SleepHistoryDayFragment;
import com.heytap.health.sleep.day.card.SleepSegmentedCard;
import com.heytap.health.sleep.day.viewmodel.SleepCardStyleViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.bz9;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pch;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.zkh;
import com.support.panel.R$style;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010?\u001a\u00020>\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b@\u0010AJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0018\u0010=\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010.¨\u0006B"}, d2 = {"Lcom/heytap/health/sleep/day/card/SleepSegmentedCard;", "Lcom/heytap/health/sleep/day/card/SleepStyleCard;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/sleep/bean/SleepDayBean;", "curSleepDayBean", "z", "Lcom/oplus/aiunit/vision/zkh;", "sleepFrgBean", SecureGcmConstants.MESSAGE_KEY, "", "Lcom/oplus/aiunit/vision/pch;", ExifInterface.GPS_DIRECTION_TRUE, "Q", "S", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "C", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "getFamilyConfigBean", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "setFamilyConfigBean", "(Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "familyConfigBean", "Landroidx/fragment/app/FragmentActivity;", "D", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", ExifInterface.LONGITUDE_EAST, "Landroid/view/View;", "rootView", "Landroid/widget/TextView;", UserInfo.SEX_FEMALE, "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/ImageView;", "G", "Landroid/widget/ImageView;", "icCaption", "Lcom/heytap/health/sleep/adapter/SleepAnalyzeAdapter;", "H", "Lcom/heytap/health/sleep/adapter/SleepAnalyzeAdapter;", "adapter", "I", "btFragDetail", "Lcom/heytap/health/base/ui/dialog/HealthBottomSheetDialog;", "J", "Lcom/heytap/health/base/ui/dialog/HealthBottomSheetDialog;", "bottomSheetDialog", "Lcom/heytap/health/sleep/adapter/SleepFrgAdapter;", "K", "Lcom/heytap/health/sleep/adapter/SleepFrgAdapter;", "sleepFrgAdapter", "L", "bottomSheetDialog2", "M", "sleepFrgAdapter2", "Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", "fragment", "<init>", "(Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepSegmentedCard extends SleepStyleCard {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public FamilyMoreDataDetailConfigBean familyConfigBean;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public FragmentActivity fragmentActivity;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public View rootView;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public TextView tvTitle;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public ImageView icCaption;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public SleepAnalyzeAdapter adapter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public TextView btFragDetail;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public HealthBottomSheetDialog bottomSheetDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public SleepFrgAdapter sleepFrgAdapter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public HealthBottomSheetDialog bottomSheetDialog2;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    public SleepAnalyzeAdapter sleepFrgAdapter2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSegmentedCard(@NotNull SleepHistoryDayFragment fragment, @Nullable FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean) {
        super(fragment, SleepCardStyleViewModel.SleepCardStyle.SLEEP_ANALYSIS);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.familyConfigBean = familyMoreDataDetailConfigBean;
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
        this.fragmentActivity = fragmentActivityRequireActivity;
    }

    public static final void L(SleepSegmentedCard this$0, zkh sleepFrgBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sleepFrgBean, "sleepFrgBean");
        if (sleepFrgBean.r()) {
            this$0.Q(sleepFrgBean);
        } else {
            this$0.P(sleepFrgBean);
        }
    }

    public static final void M(SleepSegmentedCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public static final void N(SleepSegmentedCard this$0, View view) {
        boolean z;
        List<zkh> sleepFrgBeanList2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepDayBean curSleepDayBean = this$0.getCurSleepDayBean();
        if (curSleepDayBean != null && (sleepFrgBeanList2 = curSleepDayBean.getSleepFrgBeanList2()) != null) {
            z = sleepFrgBeanList2.isEmpty() ^ true;
        }
        if (z) {
            SleepDayBean curSleepDayBean2 = this$0.getCurSleepDayBean();
            Intrinsics.checkNotNull(curSleepDayBean2);
            this$0.P(curSleepDayBean2.getSleepFrgBeanList2().get(0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public static final void O(SleepSegmentedCard this$0, View view) {
        boolean z;
        List<zkh> sleepFrgBeanList2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepDayBean curSleepDayBean = this$0.getCurSleepDayBean();
        if (curSleepDayBean != null && (sleepFrgBeanList2 = curSleepDayBean.getSleepFrgBeanList2()) != null) {
            z = sleepFrgBeanList2.isEmpty() ^ true;
        }
        if (z) {
            SleepDayBean curSleepDayBean2 = this$0.getCurSleepDayBean();
            Intrinsics.checkNotNull(curSleepDayBean2);
            this$0.P(curSleepDayBean2.getSleepFrgBeanList2().get(0));
        }
    }

    public static final void R(DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    public final void P(zkh sleepFrgBean) {
        if (this.bottomSheetDialog == null) {
            View viewInflate = this.fragmentActivity.getLayoutInflater().inflate(R$layout.health_sleep_frg_dialog, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.recyclerView);
            final FragmentActivity fragmentActivity = this.fragmentActivity;
            recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity) { // from class: com.heytap.health.sleep.day.card.SleepSegmentedCard$showBottomDialog$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return true;
                }
            });
            SleepFrgAdapter sleepFrgAdapter = new SleepFrgAdapter(this.fragmentActivity, T(sleepFrgBean));
            this.sleepFrgAdapter = sleepFrgAdapter;
            Intrinsics.checkNotNull(sleepFrgAdapter);
            recyclerView.setAdapter(sleepFrgAdapter);
            HealthBottomSheetDialog healthBottomSheetDialog = new HealthBottomSheetDialog(this.fragmentActivity, R$style.DefaultBottomSheetDialog_MaxHeight);
            this.bottomSheetDialog = healthBottomSheetDialog;
            Intrinsics.checkNotNull(healthBottomSheetDialog);
            healthBottomSheetDialog.setTitle(this.fragmentActivity.getString(R$string.health_sleep_stage));
            HealthBottomSheetDialog healthBottomSheetDialog2 = this.bottomSheetDialog;
            Intrinsics.checkNotNull(healthBottomSheetDialog2);
            healthBottomSheetDialog2.setContentView(viewInflate);
        } else {
            SleepFrgAdapter sleepFrgAdapter2 = this.sleepFrgAdapter;
            if (sleepFrgAdapter2 != null) {
                sleepFrgAdapter2.setNewData(T(sleepFrgBean));
            }
        }
        HealthBottomSheetDialog healthBottomSheetDialog3 = this.bottomSheetDialog;
        if (healthBottomSheetDialog3 != null) {
            healthBottomSheetDialog3.show();
        }
    }

    public final void Q(zkh sleepFrgBean) {
        View viewInflate = this.fragmentActivity.getLayoutInflater().inflate(R$layout.health_sleep_day_analyze_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_time);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_status);
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.tv_tip1);
        TextView textView4 = (TextView) viewInflate.findViewById(R$id.tv_tip2);
        textView.setText(s15.d(sleepFrgBean.n(), 34.0f, 0, false, 0));
        textView2.setText(R$string.health_sleep_nap_ideal_range);
        textView3.setText(R$string.health_sleep_nap_tip1);
        textView4.setText(R$string.health_sleep_nap_tip2);
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(this.fragmentActivity, com.support.dialog.R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(this.fragmentActivity.getString(R$string.health_sleep_nap_time_title_v2));
        healthAlertDialogBuilder.setView(viewInflate);
        healthAlertDialogBuilder.setNegativeButton(e88.a().getString(com.heytap.health.base.R$string.lib_base_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.arh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SleepSegmentedCard.R(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.show();
    }

    public final void S() {
        if (getCurSleepDayBean() == null) {
            m8b.f("SleepSegmentedCard", "curSleepDayBean is null");
            return;
        }
        if (this.bottomSheetDialog2 == null) {
            View viewInflate = this.fragmentActivity.getLayoutInflater().inflate(R$layout.health_sleep_frg_dialog2, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.recyclerView);
            final FragmentActivity fragmentActivity = this.fragmentActivity;
            recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity) { // from class: com.heytap.health.sleep.day.card.SleepSegmentedCard$showSleepFragDialog$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return true;
                }
            });
            FragmentActivity fragmentActivity2 = this.fragmentActivity;
            SleepDayBean curSleepDayBean = getCurSleepDayBean();
            Intrinsics.checkNotNull(curSleepDayBean);
            SleepAnalyzeAdapter sleepAnalyzeAdapter = new SleepAnalyzeAdapter(fragmentActivity2, curSleepDayBean.getSleepFrgBeanList(), null);
            this.sleepFrgAdapter2 = sleepAnalyzeAdapter;
            Intrinsics.checkNotNull(sleepAnalyzeAdapter);
            recyclerView.setAdapter(sleepAnalyzeAdapter);
            HealthBottomSheetDialog healthBottomSheetDialog = new HealthBottomSheetDialog(this.fragmentActivity, R$style.DefaultBottomSheetDialog);
            this.bottomSheetDialog2 = healthBottomSheetDialog;
            Intrinsics.checkNotNull(healthBottomSheetDialog);
            healthBottomSheetDialog.setTitle(this.fragmentActivity.getString(R$string.health_sleep_frag_detail_title));
            HealthBottomSheetDialog healthBottomSheetDialog2 = this.bottomSheetDialog2;
            Intrinsics.checkNotNull(healthBottomSheetDialog2);
            healthBottomSheetDialog2.setContentView(viewInflate);
        } else {
            SleepAnalyzeAdapter sleepAnalyzeAdapter2 = this.sleepFrgAdapter2;
            if (sleepAnalyzeAdapter2 != null) {
                SleepDayBean curSleepDayBean2 = getCurSleepDayBean();
                Intrinsics.checkNotNull(curSleepDayBean2);
                sleepAnalyzeAdapter2.o(curSleepDayBean2.getSleepFrgBeanList(), true);
            }
        }
        HealthBottomSheetDialog healthBottomSheetDialog3 = this.bottomSheetDialog2;
        if (healthBottomSheetDialog3 != null) {
            healthBottomSheetDialog3.show();
        }
    }

    public final List<pch> T(zkh sleepFrgBean) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pch(1, sleepFrgBean));
        arrayList.add(new pch(2, sleepFrgBean));
        if (sleepFrgBean.m() > 0) {
            arrayList.add(new pch(3, sleepFrgBean));
        }
        arrayList.add(new pch(4, sleepFrgBean));
        return arrayList;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_sleep_day_segment_view;
    }

    @Override // com.oplus.aiunit.vision.dq8
    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.tv_title);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.widget.TextView");
        this.tvTitle = (TextView) viewA;
        View viewA2 = a(cardView, R$id.icCaption);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.ImageView");
        this.icCaption = (ImageView) viewA2;
        View viewA3 = a(cardView, R$id.bt_frag_detail);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type android.widget.TextView");
        this.btFragDetail = (TextView) viewA3;
        View viewA4 = a(cardView, R$id.rootView);
        Intrinsics.checkNotNull(viewA4, "null cannot be cast to non-null type android.view.View");
        this.rootView = viewA4;
        View viewA5 = a(cardView, R$id.rv_analyze);
        Intrinsics.checkNotNull(viewA5, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewA5;
        final FragmentActivity fragmentActivity = this.fragmentActivity;
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity) { // from class: com.heytap.health.sleep.day.card.SleepSegmentedCard$initView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        SleepAnalyzeAdapter sleepAnalyzeAdapter = new SleepAnalyzeAdapter(this.fragmentActivity, new ArrayList(), new bz9() { // from class: com.oplus.aiunit.vision.wqh
            @Override // com.oplus.aiunit.vision.bz9
            public final void a(zkh zkhVar) {
                SleepSegmentedCard.L(this.a, zkhVar);
            }
        });
        this.adapter = sleepAnalyzeAdapter;
        recyclerView.setAdapter(sleepAnalyzeAdapter);
        TextView textView = this.btFragDetail;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.xqh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepSegmentedCard.M(this.i, view);
                }
            });
        }
        TextView textView2 = this.tvTitle;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.yqh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepSegmentedCard.N(this.i, view);
                }
            });
        }
        ImageView imageView = this.icCaption;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.zqh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepSegmentedCard.O(this.i, view);
                }
            });
        }
    }

    @Override // com.oplus.aiunit.vision.beh
    public void z(@NotNull SleepDayBean curSleepDayBean) {
        Intrinsics.checkNotNullParameter(curSleepDayBean, "curSleepDayBean");
        super.z(curSleepDayBean);
        if (this.tvTitle == null) {
            return;
        }
        List<zkh> sleepFrgBeanList = curSleepDayBean.getSleepFrgBeanList();
        boolean zR = sleepFrgBeanList.size() == 1 ? sleepFrgBeanList.get(0).r() : false;
        if (!curSleepDayBean.hasRealSleepData() || zR) {
            F(false);
        } else {
            F(true);
            if (!curSleepDayBean.getSleepFrgBeanList2().isEmpty()) {
                TextView textView = this.tvTitle;
                if (textView != null) {
                    textView.setText(this.fragmentActivity.getString(R$string.health_sleep_caption));
                }
                TextView textView2 = this.btFragDetail;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                ImageView imageView = this.icCaption;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                SleepAnalyzeAdapter sleepAnalyzeAdapter = this.adapter;
                Intrinsics.checkNotNull(sleepAnalyzeAdapter);
                sleepAnalyzeAdapter.o(curSleepDayBean.getSleepFrgBeanList2(), false);
            } else {
                TextView textView3 = this.tvTitle;
                if (textView3 != null) {
                    textView3.setText(this.fragmentActivity.getString(R$string.health_sleep_stage));
                }
                TextView textView4 = this.btFragDetail;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                ImageView imageView2 = this.icCaption;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                SleepAnalyzeAdapter sleepAnalyzeAdapter2 = this.adapter;
                Intrinsics.checkNotNull(sleepAnalyzeAdapter2);
                sleepAnalyzeAdapter2.o(curSleepDayBean.getSleepFrgBeanList(), true);
            }
        }
        C();
    }
}