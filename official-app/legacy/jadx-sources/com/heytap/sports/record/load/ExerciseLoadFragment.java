package com.heytap.sports.record.load;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.COUIRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.view.recyclercard.RecyclerCardController;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$id;
import com.heytap.sports.R$layout;
import com.heytap.sports.record.load.cards.CurrentSportRecordCard;
import com.heytap.sports.record.load.cards.ExerciseLoadBaseCard;
import com.heytap.sports.record.load.cards.ExerciseLoadChartCard;
import com.heytap.sports.record.load.cards.ExerciseLoadEvaluateCard;
import com.heytap.sports.record.load.cards.ExerciseLoadSummaryCard;
import com.heytap.sports.record.stat.date.CalendarPanelFragment;
import com.heytap.sports.record.stat.vm.CalendarPanelViewModel;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.fn9;
import com.oplus.aiunit.vision.mw6;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.rw6;
import com.oplus.aiunit.vision.y0l;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bH\u0010IJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R#\u0010,\u001a\n (*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010+R#\u00101\u001a\n (*\u0004\u0018\u00010-0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u00100R#\u00106\u001a\n (*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u00105R#\u00109\u001a\n (*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001e\u001a\u0004\b8\u00105R#\u0010>\u001a\n (*\u0004\u0018\u00010:0:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001e\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u001e\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006L"}, d2 = {"Lcom/heytap/sports/record/load/ExerciseLoadFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "Lcom/heytap/sports/record/stat/vm/CalendarPanelViewModel$b;", "selected", c8l.KEY_B0, "F0", "Lkotlin/Pair;", "", "timeRange", "q0", "r0", "Lcom/heytap/sports/record/load/ExerciseLoadPage;", "o", "Lcom/heytap/sports/record/load/ExerciseLoadPage;", RnConstant.KEY_PAGE, LogFieldKey.PROCESS_NAME_KEY, "J", "mSelectTime", "q", "Ljava/lang/Long;", "mRecordStartTime", "Lcom/heytap/sports/record/load/ExerciseLoadViewModel;", "r", "Lkotlin/Lazy;", c8l.KEY_A0, "()Lcom/heytap/sports/record/load/ExerciseLoadViewModel;", "vm", "Lcom/heytap/sports/record/stat/vm/CalendarPanelViewModel;", "s", "x0", "()Lcom/heytap/sports/record/stat/vm/CalendarPanelViewModel;", "dateVM", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "t", "s0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "dateGroup", "Landroid/widget/TextView;", "u", "w0", "()Landroid/widget/TextView;", "dateTV", "Landroidx/appcompat/widget/AppCompatImageView;", "v", "u0", "()Landroidx/appcompat/widget/AppCompatImageView;", "dateLeftBt", "w", "v0", "dateRightBt", "Landroidx/recyclerview/widget/COUIRecyclerView;", "x", "z0", "()Landroidx/recyclerview/widget/COUIRecyclerView;", "pager", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "y", "y0", "()Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "listController", "", "t0", "()Ljava/lang/String;", "dateKey", "<init>", "()V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExerciseLoadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExerciseLoadFragment.kt\ncom/heytap/sports/record/load/ExerciseLoadFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
public final class ExerciseLoadFragment extends BaseFragment {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Long mRecordStartTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public ExerciseLoadPage page = ExerciseLoadPage.WEEK;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long mSelectTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy vm = LazyKt__LazyJVMKt.lazy(new Function0<ExerciseLoadViewModel>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$vm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ExerciseLoadViewModel invoke() {
            return (ExerciseLoadViewModel) new ViewModelProvider(this.this$0).get(ExerciseLoadViewModel.class);
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy dateVM = LazyKt__LazyJVMKt.lazy(new Function0<CalendarPanelViewModel>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$dateVM$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CalendarPanelViewModel invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            ViewModel viewModel = new ViewModelProvider(fragmentActivityRequireActivity).get(CalendarPanelViewModel.class);
            ExerciseLoadFragment exerciseLoadFragment = this.this$0;
            CalendarPanelViewModel calendarPanelViewModel = (CalendarPanelViewModel) viewModel;
            calendarPanelViewModel.v(exerciseLoadFragment.t0(), new ExerciseLoadFragment$dateVM$2$1$1(exerciseLoadFragment, null));
            return calendarPanelViewModel;
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy dateGroup = LazyKt__LazyJVMKt.lazy(new Function0<ConstraintLayout>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$dateGroup$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) this.this$0.W(R$id.date_group);
        }
    });

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy dateTV = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$dateTV$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final TextView invoke() {
            ImageView imageView = (ImageView) this.this$0.W(R$id.iv_down);
            final ExerciseLoadFragment exerciseLoadFragment = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nw6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    exerciseLoadFragment.F0(view);
                }
            });
            View viewW = this.this$0.W(R$id.date_tv);
            final ExerciseLoadFragment exerciseLoadFragment2 = this.this$0;
            TextView textView = (TextView) viewW;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nw6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    exerciseLoadFragment2.F0(view);
                }
            });
            return textView;
        }
    });

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Lazy dateLeftBt = LazyKt__LazyJVMKt.lazy(new Function0<AppCompatImageView>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$dateLeftBt$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final AppCompatImageView invoke() {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.W(R$id.left_arrow_bt);
            appCompatImageView.setOnClickListener(new mw6(this.this$0));
            return appCompatImageView;
        }
    });

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Lazy dateRightBt = LazyKt__LazyJVMKt.lazy(new Function0<AppCompatImageView>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$dateRightBt$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final AppCompatImageView invoke() {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.W(R$id.right_arrow_bt);
            appCompatImageView.setOnClickListener(new mw6(this.this$0));
            return appCompatImageView;
        }
    });

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Lazy pager = LazyKt__LazyJVMKt.lazy(new Function0<COUIRecyclerView>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$pager$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final COUIRecyclerView invoke() {
            COUIRecyclerView cOUIRecyclerView = (COUIRecyclerView) this.this$0.W(R$id.data_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.this$0.getContext());
            linearLayoutManager.setOrientation(1);
            cOUIRecyclerView.setLayoutManager(linearLayoutManager);
            return cOUIRecyclerView;
        }
    });

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy listController = LazyKt__LazyJVMKt.lazy(new Function0<RecyclerCardController>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$listController$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final RecyclerCardController invoke() {
            return new RecyclerCardController(this.this$0.requireActivity(), this.this$0.z0());
        }
    });

    /* JADX INFO: renamed from: com.heytap.sports.record.load.ExerciseLoadFragment$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/sports/record/load/ExerciseLoadFragment$a;", "", "", "Lcom/heytap/sports/record/load/ExerciseLoadFragment;", "c", "", "Landroid/content/Context;", "context", "Lcom/heytap/sports/record/load/ExerciseLoadPage;", RnConstant.KEY_PAGE, "", "b", "CALENDAR_FRG_TAG", "Ljava/lang/String;", "PAGE_KEY", "TAG", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nExerciseLoadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExerciseLoadFragment.kt\ncom/heytap/sports/record/load/ExerciseLoadFragment$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,252:1\n1549#2:253\n1620#2,3:254\n37#3,2:257\n37#3,2:259\n37#3,2:261\n*S KotlinDebug\n*F\n+ 1 ExerciseLoadFragment.kt\ncom/heytap/sports/record/load/ExerciseLoadFragment$Companion\n*L\n217#1:253\n217#1:254,3\n233#1:257,2\n234#1:259,2\n236#1:261,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(long j2, Context context, ExerciseLoadPage exerciseLoadPage) {
            String dateTime;
            if (exerciseLoadPage == ExerciseLoadPage.YEAR) {
                String strG = fn9.g(j2, "yyyy");
                Intrinsics.checkNotNullExpressionValue(strG, "{\n                ICUFor…is, \"yyyy\")\n            }");
                return strG;
            }
            if (exerciseLoadPage == ExerciseLoadPage.WEEK) {
                Pair<Long, Long> pairB = rw6.b(j2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy,M,d", Locale.getDefault());
                String str = simpleDateFormat.format(pairB.getFirst());
                Intrinsics.checkNotNullExpressionValue(str, "simpleDateFormat.format(pair.first)");
                String str2 = ((String[]) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]))[0];
                String str3 = simpleDateFormat.format(pairB.getSecond());
                Intrinsics.checkNotNullExpressionValue(str3, "simpleDateFormat.format(pair.second)");
                String str4 = ((String[]) StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]))[0];
                String str5 = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
                Intrinsics.checkNotNullExpressionValue(str5, "simpleDateFormat.format(…stem.currentTimeMillis())");
                String str6 = ((String[]) StringsKt__StringsKt.split$default((CharSequence) str5, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]))[0];
                int i = Intrinsics.areEqual(str6, str2) ? 8 : 4;
                int i2 = Intrinsics.areEqual(str6, str4) ? 8 : 4;
                dateTime = DateUtils.formatDateTime(context, pairB.getFirst().longValue(), i) + "-" + DateUtils.formatDateTime(context, pairB.getSecond().longValue(), i2);
            } else {
                dateTime = DateUtils.formatDateTime(context, j2, 36);
            }
            Intrinsics.checkNotNullExpressionValue(dateTime, "{\n                if (pa…          }\n            }");
            return dateTime;
        }

        @NotNull
        public final List<ExerciseLoadFragment> c() {
            List<ExerciseLoadPage> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ExerciseLoadPage[]{ExerciseLoadPage.WEEK, ExerciseLoadPage.MONTH, ExerciseLoadPage.YEAR});
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
            for (ExerciseLoadPage exerciseLoadPage : listListOf) {
                ExerciseLoadFragment exerciseLoadFragment = new ExerciseLoadFragment();
                exerciseLoadFragment.setArguments(new Bundle());
                exerciseLoadFragment.requireArguments().putInt("page_key", exerciseLoadPage.getI());
                arrayList.add(exerciseLoadFragment);
            }
            return arrayList;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExerciseLoadPage.values().length];
            try {
                iArr[ExerciseLoadPage.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExerciseLoadPage.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExerciseLoadPage.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function) {
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

    public final ExerciseLoadViewModel A0() {
        return (ExerciseLoadViewModel) this.vm.getValue();
    }

    public final void B0(CalendarPanelViewModel.DateSelectedData selected) {
        a7b.f("ExerciseLoadFragment", "calendarPanelViewModel click:" + selected + " ?= " + t0());
        if (Intrinsics.areEqual(selected.getKey(), t0())) {
            this.mSelectTime = o05.H(selected.getDate());
            TextView textViewW0 = w0();
            Companion companion = INSTANCE;
            long j2 = this.mSelectTime;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            textViewW0.setText(companion.b(j2, fragmentActivityRequireActivity, this.page));
            Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag("calendar_frg_tag");
            COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = fragmentFindFragmentByTag instanceof COUIBottomSheetDialogFragment ? (COUIBottomSheetDialogFragment) fragmentFindFragmentByTag : null;
            if (cOUIBottomSheetDialogFragment != null) {
                cOUIBottomSheetDialogFragment.dismiss();
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ExerciseLoadFragment$onDateChange$1(this, null), 3, null);
        }
    }

    public final void F0(View view) {
        LocalDate localDateS;
        long jX;
        a7b.f("ExerciseLoadFragment", "showCalendar view=" + ((Object) (view != null ? view.getAccessibilityClassName() : null)));
        LocalDate selectDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.mSelectTime), ZoneId.systemDefault()).toLocalDate();
        Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag("calendar_frg_tag");
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = fragmentFindFragmentByTag instanceof COUIBottomSheetDialogFragment ? (COUIBottomSheetDialogFragment) fragmentFindFragmentByTag : null;
        if (cOUIBottomSheetDialogFragment == null) {
            cOUIBottomSheetDialogFragment = new COUIBottomSheetDialogFragment();
            Intrinsics.checkNotNullExpressionValue(selectDate, "selectDate");
            LocalDateTime localDateTimeF = o05.F(selectDate);
            Long l2 = this.mRecordStartTime;
            a7b.f("ExerciseLoadFragment", "CalendarPanelFragment:" + localDateTimeF + "-" + (l2 != null ? o05.E(l2.longValue()) : null));
            Long l3 = this.mRecordStartTime;
            if (l3 != null) {
                jX = l3.longValue();
            } else {
                LocalDate localDateD = o05.D(System.currentTimeMillis());
                int i = b.$EnumSwitchMapping$0[this.page.ordinal()];
                if (i == 1) {
                    localDateS = o05.s(localDateD);
                } else if (i == 2) {
                    localDateS = o05.y(localDateD);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LocalDate localDateWithMonth = localDateD.withMonth(1);
                    Intrinsics.checkNotNullExpressionValue(localDateWithMonth, "withMonth(1)");
                    localDateS = o05.y(localDateWithMonth);
                }
                Intrinsics.checkNotNullExpressionValue(localDateS, "currentTimeMillis().toLo…      }\n                }");
                jX = o05.x(localDateS);
            }
            cOUIBottomSheetDialogFragment.setMainPanelFragment(new CalendarPanelFragment(0, selectDate, Long.valueOf(jX), true, t0()));
        }
        cOUIBottomSheetDialogFragment.show(getParentFragmentManager(), "calendar_frg_tag");
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.sports_exercise_load_page;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        x0().y().observe(this, new c(new Function1<CalendarPanelViewModel.DateSelectedData, Unit>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment.initData.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CalendarPanelViewModel.DateSelectedData dateSelectedData) {
                invoke2(dateSelectedData);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CalendarPanelViewModel.DateSelectedData it) {
                ExerciseLoadFragment exerciseLoadFragment = ExerciseLoadFragment.this;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                exerciseLoadFragment.B0(it);
            }
        }));
        a7b.f("ExerciseLoadFragment", "initData():" + t0() + " page(" + this.page + ")");
        B0(new CalendarPanelViewModel.DateSelectedData(t0(), o05.D(this.mSelectTime)));
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        Bundle bundleRequireArguments = requireArguments();
        ExerciseLoadPage exerciseLoadPage = ExerciseLoadPage.WEEK;
        this.page = ExerciseLoadPage.INSTANCE.a(bundleRequireArguments.getInt("page_key", exerciseLoadPage.getI()));
        A0().J(this.page);
        A0().A().observe(this, new c(new Function1<Long, Unit>() { // from class: com.heytap.sports.record.load.ExerciseLoadFragment$initView$1$1

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ExerciseLoadPage.values().length];
                    try {
                        iArr[ExerciseLoadPage.WEEK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ExerciseLoadPage.MONTH.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ExerciseLoadPage.YEAR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke2(l2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Long l2) {
                Pair<Long, Long> pairB;
                this.this$0.mRecordStartTime = l2;
                int i = a.$EnumSwitchMapping$0[this.this$0.page.ordinal()];
                if (i == 1) {
                    pairB = rw6.b(this.this$0.mSelectTime);
                } else if (i == 2) {
                    pairB = rw6.a(this.this$0.mSelectTime);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pairB = rw6.c(this.this$0.mSelectTime);
                }
                this.this$0.q0(pairB);
            }
        }));
        y0l.d(this, s0());
        RecyclerCardController recyclerCardControllerY0 = y0();
        ExerciseLoadChartCard exerciseLoadChartCard = new ExerciseLoadChartCard();
        exerciseLoadChartCard.x(this.page);
        recyclerCardControllerY0.g(exerciseLoadChartCard);
        if (this.page == exerciseLoadPage) {
            RecyclerCardController recyclerCardControllerY1 = y0();
            CurrentSportRecordCard currentSportRecordCard = new CurrentSportRecordCard();
            currentSportRecordCard.x(this.page);
            recyclerCardControllerY1.g(currentSportRecordCard);
            RecyclerCardController recyclerCardControllerY2 = y0();
            ExerciseLoadEvaluateCard exerciseLoadEvaluateCard = new ExerciseLoadEvaluateCard();
            exerciseLoadEvaluateCard.x(this.page);
            recyclerCardControllerY2.g(exerciseLoadEvaluateCard);
        } else {
            RecyclerCardController recyclerCardControllerY3 = y0();
            ExerciseLoadSummaryCard exerciseLoadSummaryCard = new ExerciseLoadSummaryCard();
            exerciseLoadSummaryCard.x(this.page);
            recyclerCardControllerY3.g(exerciseLoadSummaryCard);
        }
        RecyclerCardController recyclerCardControllerY4 = y0();
        ExerciseLoadBaseCard exerciseLoadBaseCard = new ExerciseLoadBaseCard();
        exerciseLoadBaseCard.t().setValue(TuplesKt.to(Float.valueOf(0.0f), Float.valueOf(16.0f)));
        recyclerCardControllerY4.g(exerciseLoadBaseCard);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    public final void q0(Pair<Long, Long> timeRange) {
        if (this.mRecordStartTime != null) {
            long jLongValue = timeRange.getFirst().longValue();
            Long l2 = this.mRecordStartTime;
            Intrinsics.checkNotNull(l2);
            if (jLongValue > l2.longValue()) {
                u0().setVisibility(0);
                u0().setEnabled(true);
            } else {
                u0().setVisibility(4);
                u0().setEnabled(false);
            }
        } else {
            u0().setVisibility(4);
            u0().setEnabled(false);
        }
        if (timeRange.getSecond().longValue() < System.currentTimeMillis()) {
            v0().setVisibility(0);
            v0().setEnabled(true);
        } else {
            v0().setVisibility(4);
            v0().setEnabled(false);
        }
    }

    public final void r0(View view) {
        boolean z = false;
        if (view != null && view.getId() == R$id.right_arrow_bt) {
            z = true;
        }
        int i = b.$EnumSwitchMapping$0[this.page.ordinal()];
        if (i == 1) {
            CalendarPanelViewModel calendarPanelViewModelX0 = x0();
            String strT0 = t0();
            LocalDate localDatePlusWeeks = o05.D(this.mSelectTime).plusWeeks(z ? 1L : -1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusWeeks, "mSelectTime.toLocalDate(… (isNextClick) 1 else -1)");
            calendarPanelViewModelX0.w(strT0, localDatePlusWeeks);
            return;
        }
        if (i == 2) {
            CalendarPanelViewModel calendarPanelViewModelX1 = x0();
            String strT1 = t0();
            LocalDate localDatePlusMonths = o05.D(this.mSelectTime).plusMonths(z ? 1L : -1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "mSelectTime.toLocalDate(… (isNextClick) 1 else -1)");
            calendarPanelViewModelX1.w(strT1, localDatePlusMonths);
            return;
        }
        if (i != 3) {
            return;
        }
        CalendarPanelViewModel calendarPanelViewModelX2 = x0();
        String strT2 = t0();
        LocalDate localDatePlusYears = o05.D(this.mSelectTime).plusYears(z ? 1L : -1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "mSelectTime.toLocalDate(… (isNextClick) 1 else -1)");
        calendarPanelViewModelX2.w(strT2, localDatePlusYears);
    }

    public final ConstraintLayout s0() {
        return (ConstraintLayout) this.dateGroup.getValue();
    }

    public final String t0() {
        return "ExerciseLoad" + this.page;
    }

    public final AppCompatImageView u0() {
        return (AppCompatImageView) this.dateLeftBt.getValue();
    }

    public final AppCompatImageView v0() {
        return (AppCompatImageView) this.dateRightBt.getValue();
    }

    public final TextView w0() {
        return (TextView) this.dateTV.getValue();
    }

    public final CalendarPanelViewModel x0() {
        return (CalendarPanelViewModel) this.dateVM.getValue();
    }

    public final RecyclerCardController y0() {
        return (RecyclerCardController) this.listController.getValue();
    }

    public final COUIRecyclerView z0() {
        return (COUIRecyclerView) this.pager.getValue();
    }
}
