package com.health.sleep_breath_rate.day;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.health.sleep_breath_rate.R$id;
import com.health.sleep_breath_rate.R$layout;
import com.health.sleep_breath_rate.SleepBRHistoryActivity;
import com.health.sleep_breath_rate.day.SleepBRDayFragment;
import com.health.sleep_breath_rate.day.card.SleepBRDayPageCard;
import com.health.sleep_breath_rate.day.util.SleepBRDataLoadUtils;
import com.health.sleep_breath_rate.day.viewmodel.SleepBRDayControlModel;
import com.health.sleep_breath_rate.day.viewmodel.SleepBRDayViewModel;
import com.health.sleep_breath_rate.view.CalendarPanelFragment;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.base.view.recyclercard.RecyclerCardController;
import com.heytap.health.base.view.recyclercard.RecyclerCardLayout;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.health_base.R;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.oplus.aiunit.vision.bdh;
import com.oplus.aiunit.vision.ceh;
import com.oplus.aiunit.vision.dq8;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.rch;
import com.oplus.aiunit.vision.sch;
import com.oplus.aiunit.vision.w4l;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 j2\u00020\u0001:\u0001kB\u0007¢\u0006\u0004\bh\u0010iJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000bH\u0002R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010&\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020403j\b\u0012\u0004\u0012\u000204`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010f¨\u0006l"}, d2 = {"Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "p0", "n0", "", "defaultTime", "z0", "(Ljava/lang/Long;)V", "u0", "", "Lcom/oplus/aiunit/vision/dq8;", "r0", "G0", "curTimestamp", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "dialogFragment", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "q0", "timestamp", "A0", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "tvSleepDate", "Landroid/widget/ImageView;", "p", "Landroid/widget/ImageView;", "ivDown", "q", "ivLast", "r", "ivNext", "Landroidx/core/widget/NestedScrollView;", "s", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardLayout;", "t", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardLayout;", "cardLayout", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "u", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "controller", "Ljava/util/ArrayList;", "Lcom/oplus/aiunit/vision/ceh;", "Lkotlin/collections/ArrayList;", "v", "Ljava/util/ArrayList;", "cardList", "Lcom/oplus/aiunit/vision/bdh;", "w", "Lcom/oplus/aiunit/vision/bdh;", "curDayBean", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "x", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "getFamilyConfigBean", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "setFamilyConfigBean", "(Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "familyConfigBean", "y", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "calendarDialogFragment", "Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;", "z", "Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;", "t0", "()Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;", "F0", "(Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;)V", "sleepDayControlModel", "Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayViewModel;", "A", "Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayViewModel;", "sleepBRDayViewModel", "Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils;", "B", "Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils;", "s0", "()Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils;", "B0", "(Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils;)V", "sleepBRDataLoadUtils", "Lcom/health/sleep_breath_rate/day/card/SleepBRDayPageCard;", "C", "Lcom/health/sleep_breath_rate/day/card/SleepBRDayPageCard;", "sleepBRDayPageCard", "Lcom/oplus/aiunit/vision/sch;", "D", "Lcom/oplus/aiunit/vision/sch;", "sleepBRAnalyzeCard", "Lcom/oplus/aiunit/vision/rch;", "E", "Lcom/oplus/aiunit/vision/rch;", "sleepBRAboutCard", "<init>", "()V", "Companion", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRDayFragment.kt\ncom/health/sleep_breath_rate/day/SleepBRDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n1855#2,2:250\n1855#2,2:252\n*S KotlinDebug\n*F\n+ 1 SleepBRDayFragment.kt\ncom/health/sleep_breath_rate/day/SleepBRDayFragment\n*L\n194#1:250,2\n245#1:252,2\n*E\n"})
public final class SleepBRDayFragment extends BaseFragment {
    public SleepBRDayViewModel A;
    public SleepBRDataLoadUtils B;

    @Nullable
    public SleepBRDayPageCard C;

    @Nullable
    public sch D;

    @Nullable
    public rch E;
    public TextView o;
    public ImageView p;
    public ImageView q;
    public ImageView r;
    public NestedScrollView s;
    public RecyclerCardLayout t;
    public RecyclerCardController u;

    @NotNull
    public final ArrayList<ceh> v = new ArrayList<>();

    @Nullable
    public bdh w;

    @Nullable
    public FamilyMoreDataDetailConfigBean x;

    @Nullable
    public COUIBottomSheetDialogFragment y;
    public SleepBRDayControlModel z;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J(\u0010\u000f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"com/health/sleep_breath_rate/day/SleepBRDayFragment$b", "Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils$b;", "", "", "allDataList", "", "currentItem", "", "a", "", "Lcom/oplus/aiunit/vision/bdh;", "dataList", "", "needRefreshView", "curData", "c", "d", "timestamp", "b", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements SleepBRDataLoadUtils.b {
        public b() {
        }

        @Override // com.health.sleep_breath_rate.day.util.SleepBRDataLoadUtils.b
        public void a(@NotNull List<Long> allDataList, int currentItem) {
            Intrinsics.checkNotNullParameter(allDataList, "allDataList");
            SleepBRDayPageCard sleepBRDayPageCard = SleepBRDayFragment.this.C;
            if (sleepBRDayPageCard != null) {
                sleepBRDayPageCard.G(allDataList, currentItem);
            }
        }

        @Override // com.health.sleep_breath_rate.day.util.SleepBRDataLoadUtils.b
        public void b(long timestamp, int currentItem) {
            SleepBRDayPageCard sleepBRDayPageCard = SleepBRDayFragment.this.C;
            if (sleepBRDayPageCard != null) {
                sleepBRDayPageCard.B(timestamp, currentItem);
            }
        }

        @Override // com.health.sleep_breath_rate.day.util.SleepBRDataLoadUtils.b
        public void c(@NotNull List<bdh> dataList, boolean needRefreshView, @Nullable bdh curData) {
            SleepBRDayPageCard sleepBRDayPageCard;
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            if (!needRefreshView || (sleepBRDayPageCard = SleepBRDayFragment.this.C) == null) {
                return;
            }
            sleepBRDayPageCard.D(dataList);
        }

        @Override // com.health.sleep_breath_rate.day.util.SleepBRDataLoadUtils.b
        public void d(@NotNull bdh curData) {
            Intrinsics.checkNotNullParameter(curData, "curData");
            SleepBRDayFragment.this.w = curData;
            SleepBRDayPageCard sleepBRDayPageCard = SleepBRDayFragment.this.C;
            if (sleepBRDayPageCard != null) {
                sleepBRDayPageCard.F(curData);
            }
            sch schVar = SleepBRDayFragment.this.D;
            if (schVar != null) {
                schVar.s(curData);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "function");
            this.i = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    @SensorsDataInstrumented
    public static final void v0(SleepBRDayFragment sleepBRDayFragment, View view) {
        Intrinsics.checkNotNullParameter(sleepBRDayFragment, "this$0");
        SleepBRDayPageCard sleepBRDayPageCard = sleepBRDayFragment.C;
        if (sleepBRDayPageCard != null) {
            sleepBRDayPageCard.H();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void w0(SleepBRDayFragment sleepBRDayFragment, View view) {
        Intrinsics.checkNotNullParameter(sleepBRDayFragment, "this$0");
        SleepBRDayPageCard sleepBRDayPageCard = sleepBRDayFragment.C;
        if (sleepBRDayPageCard != null) {
            sleepBRDayPageCard.C();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void x0(SleepBRDayFragment sleepBRDayFragment, View view) {
        Intrinsics.checkNotNullParameter(sleepBRDayFragment, "this$0");
        sleepBRDayFragment.G0();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void y0(SleepBRDayFragment sleepBRDayFragment, View view) {
        Intrinsics.checkNotNullParameter(sleepBRDayFragment, "this$0");
        sleepBRDayFragment.G0();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public final void A0(long timestamp) {
        TextView textView = this.o;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSleepDate");
            textView = null;
        }
        textView.setText(q15.t(h15.D(timestamp)));
        ImageView imageView2 = this.p;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDown");
            imageView2 = null;
        }
        imageView2.setVisibility(0);
        ImageView imageView3 = this.q;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView3 = null;
        }
        imageView3.setVisibility(t0().getK() ? 8 : 0);
        ImageView imageView4 = this.r;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
        } else {
            imageView = imageView4;
        }
        imageView.setVisibility(t0().getL() ? 8 : 0);
        Iterator<T> it = this.v.iterator();
        while (it.hasNext()) {
            ((ceh) it.next()).r(timestamp);
        }
    }

    public final void B0(@NotNull SleepBRDataLoadUtils sleepBRDataLoadUtils) {
        Intrinsics.checkNotNullParameter(sleepBRDataLoadUtils, "<set-?>");
        this.B = sleepBRDataLoadUtils;
    }

    public final void F0(@NotNull SleepBRDayControlModel sleepBRDayControlModel) {
        Intrinsics.checkNotNullParameter(sleepBRDayControlModel, "<set-?>");
        this.z = sleepBRDayControlModel;
    }

    public final void G0() {
        FragmentActivity activity;
        FragmentManager supportFragmentManager;
        List fragments;
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment;
        bdh bdhVar = this.w;
        if (bdhVar == null || (activity = getActivity()) == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(fragments, "fragments");
        Iterator it = fragments.iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()) instanceof SleepBRDayFragment) {
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = this.y;
                if (cOUIBottomSheetDialogFragment2 != null) {
                    cOUIBottomSheetDialogFragment2.dismiss();
                }
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = new COUIBottomSheetDialogFragment();
                this.y = cOUIBottomSheetDialogFragment3;
                cOUIBottomSheetDialogFragment3.setMainPanelFragment(q0(bdhVar.getA(), this.y));
                FragmentActivity activity2 = getActivity();
                if (activity2 != null && (cOUIBottomSheetDialogFragment = this.y) != null) {
                    cOUIBottomSheetDialogFragment.show(activity2.getSupportFragmentManager(), "calendar Panel fragment");
                }
            }
        }
    }

    public int getLayoutId() {
        return R$layout.health_sleep_br_day_frg;
    }

    public void initData() {
        long longExtra = requireActivity().getIntent().getLongExtra(SleepBRHistoryActivity.CURRENT_DAY_TIME, 0L);
        long longExtra2 = requireActivity().getIntent().getLongExtra(SleepBRHistoryActivity.SLEEP_START_TIME, 0L);
        long longExtra3 = requireActivity().getIntent().getLongExtra(SleepBRHistoryActivity.SLEEP_END_TIME, 0L);
        pr8 pr8Var = pr8.INSTANCE;
        m8b.f("SleepBRDayFragment", pr8Var.q(longExtra, "yyy-MM-dd HH:mm") + "/sleepStartTime:" + pr8Var.q(longExtra2, "yyy-MM-dd HH:mm") + "/sleepEndTime:" + pr8Var.q(longExtra3, "yyy-MM-dd HH:mm"));
        Intent intent = requireActivity().getIntent();
        Long lValueOf = null;
        this.x = (FamilyMoreDataDetailConfigBean) (intent != null ? intent.getSerializableExtra("ARGUMENT_MORE_DATA_DETAIL") : null);
        this.C = new SleepBRDayPageCard(this, this.x);
        Context contextRequireContext = requireContext();
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardLayout");
            recyclerView = null;
        }
        RecyclerCardController recyclerCardController = new RecyclerCardController(contextRequireContext, recyclerView);
        this.u = recyclerCardController;
        recyclerCardController.i(r0());
        if (longExtra > 0) {
            lValueOf = Long.valueOf(longExtra);
        } else if (longExtra3 > 0) {
            lValueOf = Long.valueOf(pr8Var.c(longExtra3));
        }
        z0(lValueOf);
    }

    public void initView(@Nullable View view) {
        View viewW = W(R.id.tv_date);
        Intrinsics.checkNotNullExpressionValue(viewW, "findViewById(com.heytap.…health_base.R.id.tv_date)");
        this.o = (TextView) viewW;
        View viewW2 = W(R.id.iv_down);
        Intrinsics.checkNotNullExpressionValue(viewW2, "findViewById(com.heytap.…health_base.R.id.iv_down)");
        this.p = (ImageView) viewW2;
        View viewW3 = W(R.id.iv_last);
        Intrinsics.checkNotNullExpressionValue(viewW3, "findViewById(com.heytap.…health_base.R.id.iv_last)");
        this.q = (ImageView) viewW3;
        View viewW4 = W(R.id.iv_next);
        Intrinsics.checkNotNullExpressionValue(viewW4, "findViewById(com.heytap.…health_base.R.id.iv_next)");
        this.r = (ImageView) viewW4;
        ImageView imageView = this.q;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView = null;
        }
        imageView.setVisibility(8);
        ImageView imageView3 = this.r;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            imageView3 = null;
        }
        imageView3.setVisibility(8);
        NestedScrollView nestedScrollViewW = W(R$id.scrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollViewW, "findViewById(R.id.scrollView)");
        this.s = nestedScrollViewW;
        RecyclerCardLayout recyclerCardLayoutW = W(R$id.cardLayout);
        Intrinsics.checkNotNullExpressionValue(recyclerCardLayoutW, "findViewById(R.id.cardLayout)");
        this.t = recyclerCardLayoutW;
        w4l.d(this, W(R$id.cl_change_date));
        w4l.d(this, W(R$id.top_line_consumption_history));
        u0();
        ImageView imageView4 = this.q;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView4 = null;
        }
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.fdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepBRDayFragment.v0(this.i, view2);
            }
        });
        ImageView imageView5 = this.r;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            imageView5 = null;
        }
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.gdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepBRDayFragment.w0(this.i, view2);
            }
        });
        TextView textView = this.o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSleepDate");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.hdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepBRDayFragment.x0(this.i, view2);
            }
        });
        ImageView imageView6 = this.p;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDown");
            imageView6 = null;
        }
        imageView6.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.idh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepBRDayFragment.y0(this.i, view2);
            }
        });
        ImageView imageView7 = this.p;
        if (imageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDown");
        } else {
            imageView2 = imageView7;
        }
        imageView2.setVisibility(4);
    }

    public final void n0() {
        SleepBRDayPageCard sleepBRDayPageCard = this.C;
        if (sleepBRDayPageCard != null) {
            sleepBRDayPageCard.z();
        }
    }

    public final void p0() {
        SleepBRDayPageCard sleepBRDayPageCard = this.C;
        if (sleepBRDayPageCard != null) {
            sleepBRDayPageCard.A();
        }
    }

    public final COUIPanelFragment q0(long curTimestamp, final COUIBottomSheetDialogFragment dialogFragment) {
        return new CalendarPanelFragment(LocalDateTime.ofInstant(Instant.ofEpochMilli(curTimestamp), ZoneId.systemDefault()).toLocalDate(), Long.valueOf(t0().getI()), new Function2<LocalDate, Boolean, Unit>() { // from class: com.health.sleep_breath_rate.day.SleepBRDayFragment$getCalendarFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LocalDate) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LocalDate localDate, boolean z) {
                Intrinsics.checkNotNullParameter(localDate, "date");
                pr8 pr8Var = pr8.INSTANCE;
                long jP = pr8Var.p(localDate);
                m8b.f("SleepBRDayFragment", "onClickDateCallBack:" + pr8Var.y(jP, "yyyy/MM/dd HH:mm:ss"));
                this.this$0.s0().f(jP);
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = dialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
            }
        });
    }

    public final List<dq8> r0() {
        this.D = new sch(HealthFrgType.DAY);
        this.E = new rch();
        this.v.clear();
        ArrayList<ceh> arrayList = this.v;
        SleepBRDayPageCard sleepBRDayPageCard = this.C;
        Intrinsics.checkNotNull(sleepBRDayPageCard);
        arrayList.add(sleepBRDayPageCard);
        ArrayList<ceh> arrayList2 = this.v;
        sch schVar = this.D;
        Intrinsics.checkNotNull(schVar);
        arrayList2.add(schVar);
        ArrayList<ceh> arrayList3 = this.v;
        rch rchVar = this.E;
        Intrinsics.checkNotNull(rchVar);
        arrayList3.add(rchVar);
        return this.v;
    }

    @NotNull
    public final SleepBRDataLoadUtils s0() {
        SleepBRDataLoadUtils sleepBRDataLoadUtils = this.B;
        if (sleepBRDataLoadUtils != null) {
            return sleepBRDataLoadUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sleepBRDataLoadUtils");
        return null;
    }

    @NotNull
    public final SleepBRDayControlModel t0() {
        SleepBRDayControlModel sleepBRDayControlModel = this.z;
        if (sleepBRDayControlModel != null) {
            return sleepBRDayControlModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sleepDayControlModel");
        return null;
    }

    public final void u0() {
        CommonScrollTopLineView commonScrollTopLineViewW = W(R$id.top_line_consumption_history);
        Context context = getContext();
        NestedScrollView nestedScrollView = this.s;
        if (nestedScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            nestedScrollView = null;
        }
        commonScrollTopLineViewW.m(context, nestedScrollView);
    }

    public final void z0(Long defaultTime) {
        F0((SleepBRDayControlModel) new ViewModelProvider(this).get(SleepBRDayControlModel.class));
        t0().w().observe(getViewLifecycleOwner(), new c(new Function1<Long, Unit>() { // from class: com.health.sleep_breath_rate.day.SleepBRDayFragment$initViewModel$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Long) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Long l) {
                SleepBRDayFragment sleepBRDayFragment = this.this$0;
                Intrinsics.checkNotNullExpressionValue(l, "it");
                sleepBRDayFragment.A0(l.longValue());
            }
        }));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "this.requireActivity()");
        this.A = new ViewModelProvider(fragmentActivityRequireActivity).get(SleepBRDayViewModel.class);
        SleepBRDayViewModel sleepBRDayViewModel = this.A;
        if (sleepBRDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepBRDayViewModel");
            sleepBRDayViewModel = null;
        }
        B0(new SleepBRDataLoadUtils(this, sleepBRDayViewModel, t0(), new b()));
        s0().j(defaultTime);
    }
}
