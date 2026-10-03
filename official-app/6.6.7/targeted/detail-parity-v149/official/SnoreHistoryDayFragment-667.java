package com.heytap.health.sleep.snore.day;

import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.i18n.WeekStrUtils;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.health.sleep.snore.bean.SnoreDayBean;
import com.heytap.health.sleep.snore.day.SnoreHistoryDayFragment;
import com.heytap.health.sleep.snore.day.view.SnoreDayViewPageView;
import com.heytap.health.sleep.snore.day.viewmodel.SnoreDayControlModel;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.state.Constants;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.cyh;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.xmk;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/heytap/health/sleep/snore/day/SnoreHistoryDayFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "Lcom/heytap/health/sleep/snore/bean/SnoreDayBean;", "curSnoreDayBean", "j0", "f0", "", Constants.LOADING, "k0", "", "o", "Ljava/lang/String;", "TAG", "Landroidx/fragment/app/FragmentActivity;", LogFieldKey.PROCESS_NAME_KEY, "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "", "q", "J", SnoreHistoryActivity.BORDER_START_TIME, "r", SnoreHistoryActivity.BORDER_END_TIME, "s", SnoreHistoryActivity.CUR_DAY_START_TIME, "t", SnoreHistoryActivity.CUR_DAY_END_TIME, "Landroid/widget/TextView;", "u", "Landroid/widget/TextView;", "tvDate", "Landroid/widget/ImageView;", "v", "Landroid/widget/ImageView;", "ivLast", "w", "ivNext", "Landroid/view/ViewGroup;", "x", "Landroid/view/ViewGroup;", "parentViewGroup", "y", "Landroid/view/View;", "mLoadingLayout", "Landroidx/core/widget/NestedScrollView;", "z", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Lcom/oplus/aiunit/vision/cyh;", "A", "Lcom/oplus/aiunit/vision/cyh;", "util", "Lcom/heytap/health/sleep/snore/day/viewmodel/SnoreDayControlModel;", acl.KEY_B, "Lcom/heytap/health/sleep/snore/day/viewmodel/SnoreDayControlModel;", "snoreDayControlModel", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SnoreHistoryDayFragment extends BaseFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public cyh util;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public SnoreDayControlModel snoreDayControlModel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "SnoreHistoryDay";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public FragmentActivity fragmentActivity;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long borderStartTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long borderEndTime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public long curDayStartTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public long curDayEndTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public TextView tvDate;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public ImageView ivLast;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public ImageView ivNext;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public ViewGroup parentViewGroup;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public View mLoadingLayout;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public NestedScrollView scrollView;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public a(Function1 function) {
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

    public static final void g0(SnoreHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 1).b();
        cyh cyhVar = this$0.util;
        Intrinsics.checkNotNull(cyhVar);
        SnoreDayViewPageView snoreDayViewPageViewA = cyhVar.getSnoreDayViewPageView();
        Intrinsics.checkNotNull(snoreDayViewPageViewA);
        snoreDayViewPageViewA.I();
    }

    public static final void h0(SnoreHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 2).b();
        cyh cyhVar = this$0.util;
        Intrinsics.checkNotNull(cyhVar);
        SnoreDayViewPageView snoreDayViewPageViewA = cyhVar.getSnoreDayViewPageView();
        Intrinsics.checkNotNull(snoreDayViewPageViewA);
        snoreDayViewPageViewA.v();
    }

    public final void f0() {
        ((CommonScrollTopLineView) W(R$id.top_line_consumption_history)).m(getContext(), (NestedScrollView) W(R$id.scrollView));
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_sleep_frg_snore_history_day;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        FragmentActivity fragmentActivity = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity);
        this.borderStartTime = fragmentActivity.getIntent().getLongExtra(SnoreHistoryActivity.BORDER_START_TIME, 0L);
        FragmentActivity fragmentActivity2 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity2);
        this.borderEndTime = fragmentActivity2.getIntent().getLongExtra(SnoreHistoryActivity.BORDER_END_TIME, 0L);
        FragmentActivity fragmentActivity3 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity3);
        this.curDayStartTime = fragmentActivity3.getIntent().getLongExtra(SnoreHistoryActivity.CUR_DAY_START_TIME, 0L);
        FragmentActivity fragmentActivity4 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity4);
        this.curDayEndTime = fragmentActivity4.getIntent().getLongExtra(SnoreHistoryActivity.CUR_DAY_END_TIME, 0L);
        CharSequence charSequence = DateFormat.format("yyyy-MM-dd HH:mm:ss", new Date(this.borderStartTime));
        CharSequence charSequence2 = DateFormat.format("yyyy-MM-dd HH:mm:ss", new Date(this.borderEndTime));
        CharSequence charSequence3 = DateFormat.format("yyyy-MM-dd HH:mm:ss", new Date(this.curDayStartTime));
        CharSequence charSequence4 = DateFormat.format("yyyy-MM-dd HH:mm:ss", new Date(this.curDayEndTime));
        StringBuilder sb = new StringBuilder();
        sb.append("initData:");
        sb.append((Object) charSequence);
        sb.append("/");
        sb.append((Object) charSequence2);
        sb.append("/");
        sb.append((Object) charSequence3);
        sb.append("/");
        sb.append((Object) charSequence4);
        cyh cyhVar = this.util;
        Intrinsics.checkNotNull(cyhVar);
        SnoreDayViewPageView snoreDayViewPageViewA = cyhVar.getSnoreDayViewPageView();
        Intrinsics.checkNotNull(snoreDayViewPageViewA);
        snoreDayViewPageViewA.H(this.borderStartTime, this.borderEndTime, this.curDayStartTime, this.curDayEndTime);
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.tvDate = (TextView) view.findViewById(R$id.tvDate);
        this.ivLast = (ImageView) view.findViewById(R$id.ivLast);
        this.ivNext = (ImageView) view.findViewById(R$id.ivNext);
        this.parentViewGroup = (ViewGroup) view.findViewById(R$id.parentViewGroup);
        this.mLoadingLayout = view.findViewById(R$id.rank_loading_layout);
        this.scrollView = (NestedScrollView) view.findViewById(R$id.scrollView);
        ViewGroup viewGroup = this.parentViewGroup;
        Intrinsics.checkNotNull(viewGroup);
        this.util = new cyh(this, viewGroup);
        ImageView imageView = this.ivLast;
        Intrinsics.checkNotNull(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.h1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SnoreHistoryDayFragment.g0(this.i, view2);
            }
        });
        ImageView imageView2 = this.ivNext;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.i1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SnoreHistoryDayFragment.h0(this.i, view2);
            }
        });
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        this.fragmentActivity = fragmentActivityRequireActivity;
        Intrinsics.checkNotNull(fragmentActivityRequireActivity);
        SnoreDayControlModel snoreDayControlModel = (SnoreDayControlModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SnoreDayControlModel.class);
        this.snoreDayControlModel = snoreDayControlModel;
        Intrinsics.checkNotNull(snoreDayControlModel);
        OLiveData<SnoreDayBean> oLiveDataU = snoreDayControlModel.u();
        FragmentActivity fragmentActivity = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity);
        oLiveDataU.observe(fragmentActivity, new a(new Function1<SnoreDayBean, Unit>() { // from class: com.heytap.health.sleep.snore.day.SnoreHistoryDayFragment.initView.3
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SnoreDayBean snoreDayBean) {
                invoke2(snoreDayBean);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SnoreDayBean curSnoreDayBean) {
                Intrinsics.checkNotNullParameter(curSnoreDayBean, "curSnoreDayBean");
                SnoreHistoryDayFragment.this.j0(curSnoreDayBean);
            }
        }));
        SnoreDayControlModel snoreDayControlModel2 = this.snoreDayControlModel;
        Intrinsics.checkNotNull(snoreDayControlModel2);
        OLiveData<Boolean> oLiveDataV = snoreDayControlModel2.v();
        FragmentActivity fragmentActivity2 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity2);
        oLiveDataV.observe(fragmentActivity2, new a(new Function1<Boolean, Unit>() { // from class: com.heytap.health.sleep.snore.day.SnoreHistoryDayFragment.initView.4
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean loading) {
                SnoreHistoryDayFragment snoreHistoryDayFragment = SnoreHistoryDayFragment.this;
                Intrinsics.checkNotNullExpressionValue(loading, "loading");
                snoreHistoryDayFragment.k0(loading.booleanValue());
            }
        }));
        f0();
    }

    public final void j0(@NotNull SnoreDayBean curSnoreDayBean) {
        Intrinsics.checkNotNullParameter(curSnoreDayBean, "curSnoreDayBean");
        if (LocalDateTime.ofInstant(Instant.ofEpochMilli(curSnoreDayBean.getCurDayEndTime()), ZoneId.systemDefault()).getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).getYear()) {
            TextView textView = this.tvDate;
            Intrinsics.checkNotNull(textView);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s, %s", Arrays.copyOf(new Object[]{lo9.g(curSnoreDayBean.getCurDayEndTime(), "MMMdd"), WeekStrUtils.c(curSnoreDayBean.getCurDayEndTime())}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        } else {
            TextView textView2 = this.tvDate;
            Intrinsics.checkNotNull(textView2);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s, %s", Arrays.copyOf(new Object[]{lo9.g(curSnoreDayBean.getCurDayEndTime(), "yyyMMMd"), WeekStrUtils.c(curSnoreDayBean.getCurDayEndTime())}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView2.setText(str2);
        }
        ImageView imageView = this.ivLast;
        Intrinsics.checkNotNull(imageView);
        SnoreDayControlModel snoreDayControlModel = this.snoreDayControlModel;
        Intrinsics.checkNotNull(snoreDayControlModel);
        imageView.setVisibility(snoreDayControlModel.getIsFirstDay() ? 8 : 0);
        ImageView imageView2 = this.ivNext;
        Intrinsics.checkNotNull(imageView2);
        SnoreDayControlModel snoreDayControlModel2 = this.snoreDayControlModel;
        Intrinsics.checkNotNull(snoreDayControlModel2);
        imageView2.setVisibility(snoreDayControlModel2.getIsLastDay() ? 8 : 0);
    }

    public final void k0(boolean loading) {
        View view = this.mLoadingLayout;
        if (view != null) {
            view.setVisibility(loading ? 0 : 8);
        }
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView == null) {
            return;
        }
        nestedScrollView.setVisibility(loading ? 4 : 0);
    }
}