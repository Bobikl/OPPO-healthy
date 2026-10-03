package com.heytap.health.blood.glucose;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.i18n.WeekStrUtils;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.track.a;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.base.view.recyclercard.RecyclerCardController;
import com.heytap.health.base.view.recyclercard.RecyclerCardLayout;
import com.heytap.health.blood.glucose.BloodGlucoseDayFragment;
import com.heytap.health.blood.glucose.card.BloodGlucoseAddCard;
import com.heytap.health.blood.glucose.card.BloodGlucoseWarningCard;
import com.heytap.health.blood.glucose.view.BloodGlucoseDayViewPager;
import com.heytap.health.blood.glucose.view.CalendarPanelFragment;
import com.heytap.health.blood.glucose.viewmodel.BloodGlucoseChartStyleViewModel;
import com.heytap.health.blood.glucose.viewmodel.BloodGlucoseDayViewModel;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.GluDayBean;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.dq8;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.ek1;
import com.oplus.aiunit.vision.gk1;
import com.oplus.aiunit.vision.ik1;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ok1;
import com.oplus.aiunit.vision.ot8;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.w4l;
import com.oplus.aiunit.vision.wt8;
import com.oplus.aiunit.vision.xmk;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 y2\u00020\u0001:\u0001zB\u0007¢\u0006\u0004\bw\u0010xJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001e\u0010\f\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0014J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0006\u0010\u001b\u001a\u00020\u0002J\u0006\u0010\u001c\u001a\u00020\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010g\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010ZR \u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\u00050n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR \u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0s0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010q¨\u0006{"}, d2 = {"Lcom/heytap/health/blood/glucose/BloodGlucoseDayFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "V0", "K0", "", "Lcom/oplus/aiunit/vision/dq8;", "H0", "Lcom/oplus/aiunit/vision/v88;", "dataList", "", "currentItem", "Y0", "dayBean", "position", "R0", "X0", "", "curTimestamp", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "dialogFragment", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "G0", "getLayoutId", "Landroid/view/View;", "view", "initView", "F0", acl.KEY_B0, "initData", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "tvDate", "Landroid/widget/ImageView;", LogFieldKey.PROCESS_NAME_KEY, "Landroid/widget/ImageView;", "ivDown", "q", "ivLast", "r", "ivNext", "Landroidx/core/widget/NestedScrollView;", "s", "Landroidx/core/widget/NestedScrollView;", "scrollView", "t", "Landroid/view/View;", "mLoadingLayout", "Lcom/heytap/health/blood/glucose/view/BloodGlucoseDayViewPager;", "u", "Lcom/heytap/health/blood/glucose/view/BloodGlucoseDayViewPager;", "viewPage", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardLayout;", "v", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardLayout;", "recyclerCardLayout", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "w", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "controller", "Lcom/heytap/health/blood/glucose/card/BloodGlucoseAddCard;", "x", "Lcom/heytap/health/blood/glucose/card/BloodGlucoseAddCard;", "addCard", "Lcom/oplus/aiunit/vision/gk1;", "y", "Lcom/oplus/aiunit/vision/gk1;", "detailsH5Card", "Lcom/oplus/aiunit/vision/ik1;", "z", "Lcom/oplus/aiunit/vision/ik1;", "dialCard", "Lcom/oplus/aiunit/vision/ek1;", "A", "Lcom/oplus/aiunit/vision/ek1;", "detailsCard", "Lcom/oplus/aiunit/vision/ok1;", acl.KEY_B, "Lcom/oplus/aiunit/vision/ok1;", "levelCard", "Lcom/heytap/health/blood/glucose/card/BloodGlucoseWarningCard;", "C", "Lcom/heytap/health/blood/glucose/card/BloodGlucoseWarningCard;", "warningCard", "Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseDayViewModel;", "D", "Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseDayViewModel;", "viewModel", ExifInterface.LONGITUDE_EAST, "Lcom/oplus/aiunit/vision/v88;", UserInfo.SEX_FEMALE, "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "calendarDialogFragment", "Lcom/oplus/aiunit/vision/wt8;", "G", "Lcom/oplus/aiunit/vision/wt8;", "pageUtils", "Lcom/heytap/health/blood/glucose/BloodGlucoseHistoryActivity;", "H", "Lkotlin/Lazy;", "J0", "()Lcom/heytap/health/blood/glucose/BloodGlucoseHistoryActivity;", "parentActivity", "", "I", "Z", "isScrolling", "J", "lastDayBean", "Landroidx/lifecycle/Observer;", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "K", "Landroidx/lifecycle/Observer;", "lastTimeObservable", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "L", "lastDetailObservable", "<init>", "()V", "Companion", "a", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodGlucoseDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseDayFragment.kt\ncom/heytap/health/blood/glucose/BloodGlucoseDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n1855#2,2:457\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseDayFragment.kt\ncom/heytap/health/blood/glucose/BloodGlucoseDayFragment\n*L\n403#1:457,2\n*E\n"})
public final class BloodGlucoseDayFragment extends BaseFragment {
    public static final int PAGING_COUNT = 5;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public ek1 detailsCard;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public ok1 levelCard;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public BloodGlucoseWarningCard warningCard;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public BloodGlucoseDayViewModel viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public GluDayBean dayBean;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public COUIBottomSheetDialogFragment calendarDialogFragment;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wt8 pageUtils;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean isScrolling;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public GluDayBean lastDayBean;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView tvDate;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ImageView ivDown;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ImageView ivLast;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ImageView ivNext;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public NestedScrollView scrollView;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public View mLoadingLayout;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public BloodGlucoseDayViewPager viewPage;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public RecyclerCardLayout recyclerCardLayout;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public RecyclerCardController controller;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public BloodGlucoseAddCard addCard;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public gk1 detailsH5Card;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public ik1 dialCard;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentActivity = LazyKt__LazyJVMKt.lazy(new Function0<BloodGlucoseHistoryActivity>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$parentActivity$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final BloodGlucoseHistoryActivity invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.heytap.health.blood.glucose.BloodGlucoseHistoryActivity");
            return (BloodGlucoseHistoryActivity) fragmentActivityRequireActivity;
        }
    });

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final Observer<List<BloodSugarStat>> lastTimeObservable = new Observer() { // from class: com.oplus.aiunit.vision.wj1
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            BloodGlucoseDayFragment.Q0(this.i, (List) obj);
        }
    };

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final Observer<List<BloodSugar>> lastDetailObservable = new Observer() { // from class: com.oplus.aiunit.vision.xj1
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            BloodGlucoseDayFragment.P0(this.i, (List) obj);
        }
    };

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public static final void L0(final BloodGlucoseDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager = this$0.viewPage;
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager2 = null;
        if (bloodGlucoseDayViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager = null;
        }
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager3 = this$0.viewPage;
        if (bloodGlucoseDayViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
        } else {
            bloodGlucoseDayViewPager2 = bloodGlucoseDayViewPager3;
        }
        bloodGlucoseDayViewPager.setCurrentItem(bloodGlucoseDayViewPager2.getCurrentItem() - 1, true);
        this$0.J0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$initView$3$1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.b bVarA = a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 1);
                TextView textView = this.this$0.tvDate;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvDate");
                    textView = null;
                }
                bVarA.a("element", textView.getText().toString()).b();
            }
        });
    }

    public static final void M0(final BloodGlucoseDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager = this$0.viewPage;
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager2 = null;
        if (bloodGlucoseDayViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager = null;
        }
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager3 = this$0.viewPage;
        if (bloodGlucoseDayViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
        } else {
            bloodGlucoseDayViewPager2 = bloodGlucoseDayViewPager3;
        }
        bloodGlucoseDayViewPager.setCurrentItem(bloodGlucoseDayViewPager2.getCurrentItem() + 1, true);
        this$0.J0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$initView$4$1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.b bVarA = a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 2);
                TextView textView = this.this$0.tvDate;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvDate");
                    textView = null;
                }
                bVarA.a("element", textView.getText().toString()).b();
            }
        });
    }

    public static final void N0(BloodGlucoseDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X0();
    }

    public static final void O0(BloodGlucoseDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X0();
    }

    public static final void P0(BloodGlucoseDayFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BloodGlucoseAddCard bloodGlucoseAddCard = null;
        if (!(!it.isEmpty())) {
            m8b.f("BGDayFrg", "lastBloodSugar is null");
            BloodGlucoseAddCard bloodGlucoseAddCard2 = this$0.addCard;
            if (bloodGlucoseAddCard2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addCard");
                bloodGlucoseAddCard2 = null;
            }
            bloodGlucoseAddCard2.D(null);
            return;
        }
        BloodSugar bloodSugar = (BloodSugar) it.get(0);
        StringBuilder sb = new StringBuilder();
        sb.append("lastBloodSugar:");
        sb.append(bloodSugar);
        BloodGlucoseAddCard bloodGlucoseAddCard3 = this$0.addCard;
        if (bloodGlucoseAddCard3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addCard");
        } else {
            bloodGlucoseAddCard = bloodGlucoseAddCard3;
        }
        bloodGlucoseAddCard.D((BloodSugar) it.get(0));
    }

    public static final void Q0(BloodGlucoseDayFragment this$0, List it) {
        wt8 wt8Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(!it.isEmpty())) {
            this$0.V0();
            return;
        }
        pr8 pr8Var = pr8.INSTANCE;
        long jG = pr8Var.g(((BloodSugarStat) it.get(0)).getDate());
        int date = ((BloodSugarStat) it.get(it.size() - 1)).getDate();
        long jG2 = pr8Var.g(date);
        m8b.f("BGDayFrg", "fetchLastDataTime firstDataTime:" + jG + " ,lastDataTime:" + jG2 + "}");
        ik1 ik1Var = this$0.dialCard;
        if (ik1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialCard");
            ik1Var = null;
        }
        ik1Var.v(date);
        wt8 wt8Var2 = this$0.pageUtils;
        if (wt8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
            wt8Var2 = null;
        }
        wt8Var2.g(jG);
        Long lD7 = this$0.J0().D7();
        wt8 wt8Var3 = this$0.pageUtils;
        if (wt8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
            wt8Var = null;
        } else {
            wt8Var = wt8Var3;
        }
        if (lD7 != null) {
            jG2 = lD7.longValue();
        }
        wt8Var.f(jG2, 2, 0, false);
    }

    public static final void W0(BloodGlucoseDayFragment this$0, List emptyDayData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emptyDayData, "$emptyDayData");
        this$0.Y0(emptyDayData, 0);
    }

    public final void B0() {
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager = this.viewPage;
        if (bloodGlucoseDayViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager = null;
        }
        bloodGlucoseDayViewPager.d();
    }

    public final void F0() {
        Lifecycle lifecycle;
        FragmentActivity activity = getActivity();
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager = null;
        if (((activity == null || (lifecycle = activity.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) != Lifecycle.State.RESUMED) {
            return;
        }
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager2 = this.viewPage;
        if (bloodGlucoseDayViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
        } else {
            bloodGlucoseDayViewPager = bloodGlucoseDayViewPager2;
        }
        bloodGlucoseDayViewPager.e();
    }

    public final COUIPanelFragment G0(long curTimestamp, final COUIBottomSheetDialogFragment dialogFragment) {
        return new CalendarPanelFragment(LocalDateTime.ofInstant(Instant.ofEpochMilli(curTimestamp), pr8.INSTANCE.d()).toLocalDate(), Long.valueOf(System.currentTimeMillis()), new Function2<LocalDate, Boolean, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$getCalendarFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate, Boolean bool) {
                invoke(localDate, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LocalDate date, final boolean z) {
                Intrinsics.checkNotNullParameter(date, "date");
                final long jP = pr8.INSTANCE.p(date);
                m8b.f("BGDayFrg", "onClickDateCallBack:" + jP);
                wt8 wt8Var = this.this$0.pageUtils;
                if (wt8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                    wt8Var = null;
                }
                wt8Var.f(jP, 5, 0, false);
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = dialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
                this.this$0.J0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$getCalendarFragment$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (z) {
                            a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 1).b();
                        } else {
                            a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 2).a("element", pr8.INSTANCE.y(jP, "yyy-MM-dd")).b();
                        }
                    }
                });
            }
        });
    }

    public final List<dq8> H0() {
        this.addCard = new BloodGlucoseAddCard(J0());
        this.dialCard = new ik1(J0());
        this.detailsH5Card = new gk1(J0());
        this.detailsCard = new ek1(this);
        this.levelCard = new ok1(this);
        this.warningCard = new BloodGlucoseWarningCard(this);
        ArrayList arrayList = new ArrayList();
        BloodGlucoseAddCard bloodGlucoseAddCard = this.addCard;
        BloodGlucoseWarningCard bloodGlucoseWarningCard = null;
        if (bloodGlucoseAddCard == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addCard");
            bloodGlucoseAddCard = null;
        }
        arrayList.add(bloodGlucoseAddCard);
        ik1 ik1Var = this.dialCard;
        if (ik1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialCard");
            ik1Var = null;
        }
        arrayList.add(ik1Var);
        gk1 gk1Var = this.detailsH5Card;
        if (gk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailsH5Card");
            gk1Var = null;
        }
        arrayList.add(gk1Var);
        ek1 ek1Var = this.detailsCard;
        if (ek1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailsCard");
            ek1Var = null;
        }
        arrayList.add(ek1Var);
        ok1 ok1Var = this.levelCard;
        if (ok1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("levelCard");
            ok1Var = null;
        }
        arrayList.add(ok1Var);
        BloodGlucoseWarningCard bloodGlucoseWarningCard2 = this.warningCard;
        if (bloodGlucoseWarningCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("warningCard");
        } else {
            bloodGlucoseWarningCard = bloodGlucoseWarningCard2;
        }
        arrayList.add(bloodGlucoseWarningCard);
        return arrayList;
    }

    public final BloodGlucoseHistoryActivity J0() {
        return (BloodGlucoseHistoryActivity) this.parentActivity.getValue();
    }

    public final void K0() {
        CommonScrollTopLineView commonScrollTopLineView = (CommonScrollTopLineView) W(R$id.top_line_consumption_history);
        Context context = getContext();
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            nestedScrollView = null;
        }
        commonScrollTopLineView.m(context, nestedScrollView);
    }

    public final void R0(GluDayBean dayBean, int position) {
        BloodGlucoseWarningCard bloodGlucoseWarningCard;
        GluDayBean gluDayBean = this.dayBean;
        if (gluDayBean != null) {
            Intrinsics.checkNotNull(gluDayBean);
            if (gluDayBean.getChartStartTime() == dayBean.getChartStartTime()) {
                GluDayBean gluDayBean2 = this.dayBean;
                Intrinsics.checkNotNull(gluDayBean2);
                if (gluDayBean2.getChartEndTime() == dayBean.getChartEndTime()) {
                    String strY = pr8.INSTANCE.y(dayBean.getChartStartTime(), "yyyy/MM/dd HH:mm:ss");
                    StringBuilder sb = new StringBuilder();
                    sb.append("no need refresh:");
                    sb.append(strY);
                    return;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("refreshCardView:");
        sb2.append(position);
        sb2.append(" ,dayBean:");
        sb2.append(dayBean);
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager = this.viewPage;
        wt8 wt8Var = null;
        if (bloodGlucoseDayViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager = null;
        }
        bloodGlucoseDayViewPager.h(position);
        this.dayBean = dayBean;
        ek1 ek1Var = this.detailsCard;
        if (ek1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailsCard");
            ek1Var = null;
        }
        ek1Var.r(dayBean.getAverageValue());
        ok1 ok1Var = this.levelCard;
        if (ok1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("levelCard");
            ok1Var = null;
        }
        ok1Var.t(dayBean);
        BloodGlucoseWarningCard bloodGlucoseWarningCard2 = this.warningCard;
        if (bloodGlucoseWarningCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("warningCard");
            bloodGlucoseWarningCard = null;
        } else {
            bloodGlucoseWarningCard = bloodGlucoseWarningCard2;
        }
        bloodGlucoseWarningCard.t(dayBean.c(), dayBean.getChartStartTime(), dayBean.getChartEndTime() - 1);
        BloodGlucoseWarningCard bloodGlucoseWarningCard3 = this.warningCard;
        if (bloodGlucoseWarningCard3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("warningCard");
            bloodGlucoseWarningCard3 = null;
        }
        BloodSugarStat bloodSugarStat = dayBean.getBloodSugarStat();
        bloodGlucoseWarningCard3.v(bloodSugarStat != null ? bloodSugarStat.getWarningCounts() : 0);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(dayBean.getChartStartTime());
        pr8 pr8Var = pr8.INSTANCE;
        if (LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), pr8Var.d()).getYear()) {
            TextView textView = this.tvDate;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDate");
                textView = null;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s, %s", Arrays.copyOf(new Object[]{pr8Var.y(dayBean.getChartStartTime(), "MMMdd"), WeekStrUtils.c(dayBean.getChartStartTime())}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        } else {
            TextView textView2 = this.tvDate;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDate");
                textView2 = null;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s, %s", Arrays.copyOf(new Object[]{pr8Var.y(dayBean.getChartStartTime(), "yyyMMMd"), WeekStrUtils.c(dayBean.getChartStartTime())}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView2.setText(str2);
        }
        ImageView imageView = this.ivDown;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDown");
            imageView = null;
        }
        imageView.setVisibility(0);
        ImageView imageView2 = this.ivLast;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView2 = null;
        }
        long chartStartTime = dayBean.getChartStartTime();
        wt8 wt8Var2 = this.pageUtils;
        if (wt8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
            wt8Var2 = null;
        }
        imageView2.setVisibility(chartStartTime <= wt8Var2.getBorderStartTime() ? 8 : 0);
        ImageView imageView3 = this.ivNext;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            imageView3 = null;
        }
        int iE = pr8Var.e(dayBean.getChartStartTime());
        wt8 wt8Var3 = this.pageUtils;
        if (wt8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
        } else {
            wt8Var = wt8Var3;
        }
        imageView3.setVisibility(iE >= pr8Var.e(wt8Var.getBorderEndTime()) ? 8 : 0);
    }

    public final void V0() {
        BloodGlucoseDayViewModel bloodGlucoseDayViewModel = this.viewModel;
        wt8 wt8Var = null;
        if (bloodGlucoseDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseDayViewModel = null;
        }
        final List<GluDayBean> listW = bloodGlucoseDayViewModel.w();
        wt8 wt8Var2 = this.pageUtils;
        if (wt8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
        } else {
            wt8Var = wt8Var2;
        }
        wt8Var.g(System.currentTimeMillis());
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.rj1
            @Override // java.lang.Runnable
            public final void run() {
                BloodGlucoseDayFragment.W0(this.i, listW);
            }
        });
    }

    public final void X0() {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        GluDayBean gluDayBean = this.dayBean;
        if (gluDayBean != null) {
            long chartStartTime = gluDayBean.getChartStartTime();
            FragmentActivity activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(fragments, "fragments");
            Iterator<T> it = fragments.iterator();
            while (it.hasNext()) {
                if (((Fragment) it.next()) instanceof BloodGlucoseDayFragment) {
                    COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = this.calendarDialogFragment;
                    if (cOUIBottomSheetDialogFragment != null) {
                        cOUIBottomSheetDialogFragment.dismiss();
                    }
                    COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = new COUIBottomSheetDialogFragment();
                    this.calendarDialogFragment = cOUIBottomSheetDialogFragment2;
                    cOUIBottomSheetDialogFragment2.setMainPanelFragment(G0(chartStartTime, cOUIBottomSheetDialogFragment2));
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = this.calendarDialogFragment;
                        if (cOUIBottomSheetDialogFragment3 != null) {
                            cOUIBottomSheetDialogFragment3.show(activity2.getSupportFragmentManager(), "calendar Panel fragment");
                        }
                        J0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$showCalendarFrag$1$1$1$1
                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                a.x().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, -1).b();
                            }
                        });
                    }
                }
            }
        }
    }

    public final void Y0(List<GluDayBean> dataList, int currentItem) {
        m8b.f("BGDayFrg", "updateChartData:" + currentItem + " ,size:" + dataList.size());
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager = this.viewPage;
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager2 = null;
        if (bloodGlucoseDayViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager = null;
        }
        bloodGlucoseDayViewPager.setData(dataList);
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager3 = this.viewPage;
        if (bloodGlucoseDayViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager3 = null;
        }
        bloodGlucoseDayViewPager3.setCurrentItem(currentItem, false);
        View view = this.mLoadingLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
            view = null;
        }
        view.setVisibility(8);
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager4 = this.viewPage;
        if (bloodGlucoseDayViewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
        } else {
            bloodGlucoseDayViewPager2 = bloodGlucoseDayViewPager4;
        }
        bloodGlucoseDayViewPager2.setVisibility(0);
        if (dataList.size() > currentItem) {
            R0(dataList.get(currentItem), currentItem);
        }
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_blood_glucose_day_frg;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        ((BloodGlucoseChartStyleViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(BloodGlucoseChartStyleViewModel.class)).x().observe(this, new b(new Function1<Boolean, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment.initData.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean isLine) {
                BloodGlucoseDayViewPager bloodGlucoseDayViewPager = BloodGlucoseDayFragment.this.viewPage;
                if (bloodGlucoseDayViewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPage");
                    bloodGlucoseDayViewPager = null;
                }
                Intrinsics.checkNotNullExpressionValue(isLine, "isLine");
                bloodGlucoseDayViewPager.c(isLine.booleanValue());
            }
        }));
        if (System.currentTimeMillis() < 1546272000000L) {
            V0();
            return;
        }
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity()");
        this.viewModel = (BloodGlucoseDayViewModel) new ViewModelProvider(fragmentActivityRequireActivity2).get(BloodGlucoseDayViewModel.class);
        BloodGlucoseDayViewModel bloodGlucoseDayViewModel = null;
        if (J0().u5()) {
            BloodGlucoseDayViewModel bloodGlucoseDayViewModel2 = this.viewModel;
            if (bloodGlucoseDayViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                bloodGlucoseDayViewModel2 = null;
            }
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanP7 = J0().p7();
            bloodGlucoseDayViewModel2.F(familyMoreDataDetailConfigBeanP7 != null ? familyMoreDataDetailConfigBeanP7.getSsoid() : null);
            BloodGlucoseWarningCard bloodGlucoseWarningCard = this.warningCard;
            if (bloodGlucoseWarningCard == null) {
                Intrinsics.throwUninitializedPropertyAccessException("warningCard");
                bloodGlucoseWarningCard = null;
            }
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanP8 = J0().p7();
            bloodGlucoseWarningCard.u(familyMoreDataDetailConfigBeanP8 != null ? familyMoreDataDetailConfigBeanP8.getSsoid() : null);
        } else {
            BloodGlucoseDayViewModel bloodGlucoseDayViewModel3 = this.viewModel;
            if (bloodGlucoseDayViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                bloodGlucoseDayViewModel3 = null;
            }
            bloodGlucoseDayViewModel3.A().observe(getViewLifecycleOwner(), new b(new Function1<String, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment.initData.2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    ik1 ik1Var = BloodGlucoseDayFragment.this.dialCard;
                    if (ik1Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialCard");
                        ik1Var = null;
                    }
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    ik1Var.u(it, BloodGlucoseDayFragment.this.J0().u5());
                }
            }));
            String strM = ot8.m();
            boolean zS = ot8.s(strM);
            BloodGlucoseDayViewModel bloodGlucoseDayViewModel4 = this.viewModel;
            if (bloodGlucoseDayViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                bloodGlucoseDayViewModel4 = null;
            }
            bloodGlucoseDayViewModel4.E(strM, zS);
        }
        BloodGlucoseDayViewModel bloodGlucoseDayViewModel5 = this.viewModel;
        if (bloodGlucoseDayViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseDayViewModel5 = null;
        }
        bloodGlucoseDayViewModel5.z().observe(getViewLifecycleOwner(), this.lastTimeObservable);
        BloodGlucoseDayViewModel bloodGlucoseDayViewModel6 = this.viewModel;
        if (bloodGlucoseDayViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseDayViewModel6 = null;
        }
        bloodGlucoseDayViewModel6.B().observe(getViewLifecycleOwner(), this.lastDetailObservable);
        BloodGlucoseDayViewModel bloodGlucoseDayViewModel7 = this.viewModel;
        if (bloodGlucoseDayViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseDayViewModel7 = null;
        }
        bloodGlucoseDayViewModel7.y().observe(getViewLifecycleOwner(), new b(new Function1<List<? extends GluDayBean>, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment.initData.3
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends GluDayBean> list) {
                invoke2((List<GluDayBean>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<GluDayBean> it) {
                BloodGlucoseDayFragment bloodGlucoseDayFragment = BloodGlucoseDayFragment.this;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                wt8 wt8Var = BloodGlucoseDayFragment.this.pageUtils;
                if (wt8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                    wt8Var = null;
                }
                bloodGlucoseDayFragment.Y0(it, wt8Var.getCurrentItemIndex());
            }
        }));
        BloodGlucoseDayViewModel bloodGlucoseDayViewModel8 = this.viewModel;
        if (bloodGlucoseDayViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            bloodGlucoseDayViewModel8 = null;
        }
        bloodGlucoseDayViewModel8.x(1546272000000L, System.currentTimeMillis());
        BloodGlucoseDayViewModel bloodGlucoseDayViewModel9 = this.viewModel;
        if (bloodGlucoseDayViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            bloodGlucoseDayViewModel = bloodGlucoseDayViewModel9;
        }
        bloodGlucoseDayViewModel.C();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int iHashCode = hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append("frg initView:");
        sb.append(iHashCode);
        View viewFindViewById = view.findViewById(com.heytap.health.health_base.R$id.tv_date);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(com.he…health_base.R.id.tv_date)");
        this.tvDate = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(com.heytap.health.health_base.R$id.iv_down);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(com.he…health_base.R.id.iv_down)");
        this.ivDown = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(com.heytap.health.health_base.R$id.iv_last);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(com.he…health_base.R.id.iv_last)");
        this.ivLast = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(com.heytap.health.health_base.R$id.iv_next);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(com.he…health_base.R.id.iv_next)");
        this.ivNext = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.scrollView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.scrollView)");
        this.scrollView = (NestedScrollView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.rank_loading_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.rank_loading_layout)");
        this.mLoadingLayout = viewFindViewById6;
        int i = R$id.glu_view_page;
        View viewFindViewById7 = view.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.glu_view_page)");
        this.viewPage = (BloodGlucoseDayViewPager) viewFindViewById7;
        int i2 = R$id.recyclerCardLayout;
        View viewFindViewById8 = view.findViewById(i2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.recyclerCardLayout)");
        this.recyclerCardLayout = (RecyclerCardLayout) viewFindViewById8;
        this.pageUtils = new wt8(1546272000000L, pr8.INSTANCE.b(System.currentTimeMillis()));
        w4l.d(this, view.findViewById(R$id.lib_base_view_top_1));
        w4l.d(this, view.findViewById(i));
        w4l.d(this, view.findViewById(i2));
        K0();
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager = this.viewPage;
        wt8 wt8Var = null;
        if (bloodGlucoseDayViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager = null;
        }
        bloodGlucoseDayViewPager.setFocusableInTouchMode(true);
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager2 = this.viewPage;
        if (bloodGlucoseDayViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager2 = null;
        }
        bloodGlucoseDayViewPager2.requestFocus();
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager3 = this.viewPage;
        if (bloodGlucoseDayViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager3 = null;
        }
        bloodGlucoseDayViewPager3.g();
        RecyclerCardLayout recyclerCardLayout = this.recyclerCardLayout;
        if (recyclerCardLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerCardLayout");
            recyclerCardLayout = null;
        }
        recyclerCardLayout.setLayoutManager(new LinearLayoutManager(getContext()) { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment.initView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        Context contextRequireContext = requireContext();
        RecyclerCardLayout recyclerCardLayout2 = this.recyclerCardLayout;
        if (recyclerCardLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerCardLayout");
            recyclerCardLayout2 = null;
        }
        RecyclerCardController recyclerCardController = new RecyclerCardController(contextRequireContext, recyclerCardLayout2);
        this.controller = recyclerCardController;
        recyclerCardController.i(H0());
        RecyclerCardLayout recyclerCardLayout3 = this.recyclerCardLayout;
        if (recyclerCardLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerCardLayout");
            recyclerCardLayout3 = null;
        }
        recyclerCardLayout3.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment.initView.2
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view2, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view2, parent, state);
                outRect.top = (int) jjk.a(e88.a(), 12.0f);
            }
        });
        ImageView imageView = this.ivLast;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.sj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseDayFragment.L0(this.i, view2);
            }
        });
        ImageView imageView2 = this.ivNext;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.tj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseDayFragment.M0(this.i, view2);
            }
        });
        TextView textView = this.tvDate;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDate");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.uj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseDayFragment.N0(this.i, view2);
            }
        });
        ImageView imageView3 = this.ivDown;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDown");
            imageView3 = null;
        }
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseDayFragment.O0(this.i, view2);
            }
        });
        BloodGlucoseDayViewPager bloodGlucoseDayViewPager4 = this.viewPage;
        if (bloodGlucoseDayViewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            bloodGlucoseDayViewPager4 = null;
        }
        bloodGlucoseDayViewPager4.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment.initView.7
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
                if (state == 0) {
                    BloodGlucoseDayFragment.this.isScrolling = false;
                } else {
                    if (state != 1) {
                        return;
                    }
                    BloodGlucoseDayFragment.this.isScrolling = true;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0056  */
            /* JADX WARN: Code duplicated, block: B:17:0x0064  */
            /* JADX WARN: Code duplicated, block: B:20:0x0070  */
            /* JADX WARN: Code duplicated, block: B:22:0x007c  */
            /* JADX WARN: Code duplicated, block: B:26:0x0089  */
            /* JADX WARN: Code duplicated, block: B:28:0x0091  */
            /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                long chartEndTime;
                wt8 wt8Var2;
                long chartStartTime;
                wt8 wt8Var3;
                wt8 wt8Var4;
                wt8 wt8Var5;
                wt8 wt8Var6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onPageSelected:");
                sb2.append(position);
                BloodGlucoseDayViewPager bloodGlucoseDayViewPager5 = BloodGlucoseDayFragment.this.viewPage;
                if (bloodGlucoseDayViewPager5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPage");
                    bloodGlucoseDayViewPager5 = null;
                }
                List<GluDayBean> dataList = bloodGlucoseDayViewPager5.getDataList();
                BloodGlucoseDayViewPager bloodGlucoseDayViewPager6 = BloodGlucoseDayFragment.this.viewPage;
                if (bloodGlucoseDayViewPager6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPage");
                    bloodGlucoseDayViewPager6 = null;
                }
                GluDayBean gluDayBean = dataList.get(bloodGlucoseDayViewPager6.getCurrentItem());
                BloodGlucoseDayFragment.this.R0(gluDayBean, position);
                if (position == 0) {
                    chartEndTime = gluDayBean.getChartEndTime();
                    wt8Var2 = BloodGlucoseDayFragment.this.pageUtils;
                    if (wt8Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                        wt8Var2 = null;
                    }
                    if (chartEndTime < wt8Var2.getBorderEndTime()) {
                        chartStartTime = gluDayBean.getChartStartTime();
                        wt8Var3 = BloodGlucoseDayFragment.this.pageUtils;
                        if (wt8Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                            wt8Var3 = null;
                        }
                        if (chartStartTime == wt8Var3.getBorderStartTime()) {
                            m8b.f("BGDayFrg", "the end");
                        } else {
                            wt8Var4 = BloodGlucoseDayFragment.this.pageUtils;
                            if (wt8Var4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                                wt8Var4 = null;
                            }
                            if (wt8Var4.getLastRequestTime() != gluDayBean.getChartStartTime()) {
                                wt8Var5 = BloodGlucoseDayFragment.this.pageUtils;
                                if (wt8Var5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                                    wt8Var6 = null;
                                } else {
                                    wt8Var6 = wt8Var5;
                                }
                                wt8Var6.f(gluDayBean.getChartStartTime(), 5, 0, true);
                            }
                        }
                    } else {
                        m8b.f("BGDayFrg", "the end");
                    }
                } else {
                    BloodGlucoseDayViewPager bloodGlucoseDayViewPager7 = BloodGlucoseDayFragment.this.viewPage;
                    if (bloodGlucoseDayViewPager7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewPage");
                        bloodGlucoseDayViewPager7 = null;
                    }
                    if (position == bloodGlucoseDayViewPager7.getData().size() - 1) {
                        chartEndTime = gluDayBean.getChartEndTime();
                        wt8Var2 = BloodGlucoseDayFragment.this.pageUtils;
                        if (wt8Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                            wt8Var2 = null;
                        }
                        if (chartEndTime < wt8Var2.getBorderEndTime()) {
                            chartStartTime = gluDayBean.getChartStartTime();
                            wt8Var3 = BloodGlucoseDayFragment.this.pageUtils;
                            if (wt8Var3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                                wt8Var3 = null;
                            }
                            if (chartStartTime == wt8Var3.getBorderStartTime()) {
                                m8b.f("BGDayFrg", "the end");
                            } else {
                                wt8Var4 = BloodGlucoseDayFragment.this.pageUtils;
                                if (wt8Var4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                                    wt8Var4 = null;
                                }
                                if (wt8Var4.getLastRequestTime() != gluDayBean.getChartStartTime()) {
                                    wt8Var5 = BloodGlucoseDayFragment.this.pageUtils;
                                    if (wt8Var5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
                                        wt8Var6 = null;
                                    } else {
                                        wt8Var6 = wt8Var5;
                                    }
                                    wt8Var6.f(gluDayBean.getChartStartTime(), 5, 0, true);
                                }
                            }
                        } else {
                            m8b.f("BGDayFrg", "the end");
                        }
                    }
                }
                if (BloodGlucoseDayFragment.this.isScrolling && BloodGlucoseDayFragment.this.lastDayBean != null) {
                    GluDayBean gluDayBean2 = BloodGlucoseDayFragment.this.lastDayBean;
                    Intrinsics.checkNotNull(gluDayBean2);
                    if (gluDayBean2.getChartStartTime() < gluDayBean.getChartStartTime()) {
                        BloodGlucoseDayFragment.this.J0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$initView$7$onPageSelected$1
                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 2).a("element", "日视图").b();
                            }
                        });
                    } else {
                        GluDayBean gluDayBean3 = BloodGlucoseDayFragment.this.lastDayBean;
                        Intrinsics.checkNotNull(gluDayBean3);
                        if (gluDayBean3.getChartStartTime() > gluDayBean.getChartStartTime()) {
                            BloodGlucoseDayFragment.this.J0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$initView$7$onPageSelected$2
                                @Override // p010kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).a("element", "日视图").b();
                                }
                            });
                        }
                    }
                }
                BloodGlucoseDayFragment.this.lastDayBean = gluDayBean;
                BloodGlucoseDayFragment.this.isScrolling = false;
            }
        });
        getViewLifecycleOwnerLiveData().observe(requireActivity(), new b(new Function1<LifecycleOwner, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment.initView.8
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
                invoke2(lifecycleOwner);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LifecycleOwner lifecycleOwner) {
                final Lifecycle lifecycle;
                if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                    return;
                }
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment$initView$8$1$1

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class a {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Lifecycle.Event.values().length];
                            try {
                                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (a.$EnumSwitchMapping$0[event.ordinal()] == 1) {
                            lifecycle.removeObserver(this);
                        }
                    }
                });
            }
        }));
        wt8 wt8Var2 = this.pageUtils;
        if (wt8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageUtils");
        } else {
            wt8Var = wt8Var2;
        }
        wt8Var.e().observe(getViewLifecycleOwner(), new b(new Function1<wt8.b, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseDayFragment.initView.9
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(wt8.b bVar) {
                invoke2(bVar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(wt8.b bVar) {
                View view2 = BloodGlucoseDayFragment.this.mLoadingLayout;
                BloodGlucoseDayViewModel bloodGlucoseDayViewModel = null;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoadingLayout");
                    view2 = null;
                }
                view2.setVisibility(0);
                BloodGlucoseDayViewPager bloodGlucoseDayViewPager5 = BloodGlucoseDayFragment.this.viewPage;
                if (bloodGlucoseDayViewPager5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPage");
                    bloodGlucoseDayViewPager5 = null;
                }
                bloodGlucoseDayViewPager5.setVisibility(4);
                m8b.f("BGDayFrg", "requestCallback sendStartTimestamp =" + bVar.sendStartTimestamp + " ,sendEndTimestamp =" + bVar.sendEndTimestamp);
                BloodGlucoseDayFragment.this.dayBean = null;
                BloodGlucoseDayViewModel bloodGlucoseDayViewModel2 = BloodGlucoseDayFragment.this.viewModel;
                if (bloodGlucoseDayViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    bloodGlucoseDayViewModel = bloodGlucoseDayViewModel2;
                }
                bloodGlucoseDayViewModel.D(bVar.sendStartTimestamp, bVar.sendEndTimestamp);
            }
        }));
    }
}