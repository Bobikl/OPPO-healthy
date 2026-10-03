package com.heytap.sports.record.details.cards;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.heytap.health.base.base.BaseViewSizeControl;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$layout;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.sports.record.details.adapter.ChartUiKey;
import com.heytap.sports.record.details.vm.SportChartDataViewModel;
import com.heytap.sports.record.details.vm.SportRecordViewModel;
import com.oplus.aiunit.vision.DataType;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.i3g;
import com.oplus.aiunit.vision.m3g;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y0l;
import io.protostuff.MapSchema;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\f\u0010\u000b\u001a\u00020\b*\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u000e\u001a\u00020\bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0013\u0010\u0015\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010&8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00108\u001a\u0002058DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\b.\u00107R(\u0010;\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098D@BX\u0084\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lcom/heytap/sports/record/details/cards/SportRecordCard;", "Lcom/heytap/health/base/view/recyclercard/a;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "Landroidx/compose/ui/platform/ComposeView;", "z", "", c8l.KEY_B, "C", "y", "A", "", "Lcom/oplus/aiunit/vision/pz4;", "w", b2n.g, "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/sports/record/details/adapter/ChartUiKey;", "q", "Landroid/content/Context;", "u", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "", "Lkotlinx/coroutines/Job;", LogFieldKey.PROCESS_NAME_KEY, "Ljava/util/Set;", "s", "()Ljava/util/Set;", "jobs", "Lcom/heytap/sports/record/details/vm/SportChartDataViewModel;", "Lcom/heytap/sports/record/details/vm/SportChartDataViewModel;", "x", "()Lcom/heytap/sports/record/details/vm/SportChartDataViewModel;", "setViewModel", "(Lcom/heytap/sports/record/details/vm/SportChartDataViewModel;)V", "viewModel", "Lcom/heytap/sports/record/details/vm/SportRecordViewModel;", "r", "Lcom/heytap/sports/record/details/vm/SportRecordViewModel;", "v", "()Lcom/heytap/sports/record/details/vm/SportRecordViewModel;", "setMSportRecordViewModel", "(Lcom/heytap/sports/record/details/vm/SportRecordViewModel;)V", "mSportRecordViewModel", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/CoroutineScope;", "ioScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "<set-?>", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "t", "()Landroidx/lifecycle/LifecycleCoroutineScope;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportRecordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordCard.kt\ncom/heytap/sports/record/details/cards/SportRecordCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1#2:133\n1855#3,2:134\n*S KotlinDebug\n*F\n+ 1 SportRecordCard.kt\ncom/heytap/sports/record/details/cards/SportRecordCard\n*L\n118#1:134,2\n*E\n"})
public abstract class SportRecordCard extends com.heytap.health.base.view.recyclercard.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public Context mContext;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public SportChartDataViewModel viewModel;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public SportRecordViewModel mSportRecordViewModel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Set<Job> jobs = new LinkedHashSet();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy ioScope = LazyKt__LazyJVMKt.lazy(new Function0<CoroutineScope>() { // from class: com.heytap.sports.record.details.cards.SportRecordCard$ioScope$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.b("RecordCard"));
        }
    });

    public static /* synthetic */ Object p(SportRecordCard sportRecordCard, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public int A() {
        return 0;
    }

    public boolean B() {
        return false;
    }

    public final void C() {
        Context context = this.mContext;
        View viewY = context != null ? y(context) : null;
        if (viewY != null) {
            i3g.b().e(new m3g(RecordDetailsInstructionActivity.KEY_INSTRUCTION_VIEW, viewY));
            x0.d().b("/sports/RecordDetailInstructionActivity").navigation();
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.sports_activity_record_details_compose_common_root;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void h() {
        super.h();
        for (Job job : this.jobs) {
            if (job.isActive()) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @Nullable View cardView) {
        super.l(context, cardView);
        this.mContext = context;
        if (context instanceof FragmentActivity) {
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) context;
            this.viewModel = (SportChartDataViewModel) new ViewModelProvider(viewModelStoreOwner).get(SportChartDataViewModel.class);
            this.mSportRecordViewModel = (SportRecordViewModel) new ViewModelProvider(viewModelStoreOwner).get(SportRecordViewModel.class);
        }
        ComposeView composeView = cardView instanceof ComposeView ? (ComposeView) cardView : null;
        if (composeView != null) {
            z(composeView);
        }
        if (B()) {
            return;
        }
        BaseViewSizeControl baseViewSizeControl = context instanceof BaseViewSizeControl ? (BaseViewSizeControl) context : null;
        if (baseViewSizeControl != null) {
            y0l.d(baseViewSizeControl, cardView);
        }
    }

    @Nullable
    public Object o(@NotNull Continuation<? super Unit> continuation) {
        return p(this, continuation);
    }

    @NotNull
    public List<ChartUiKey> q() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final CoroutineScope r() {
        return (CoroutineScope) this.ioScope.getValue();
    }

    @NotNull
    public final Set<Job> s() {
        return this.jobs;
    }

    @Nullable
    public final LifecycleCoroutineScope t() {
        Object obj = this.mContext;
        if (!(obj instanceof LifecycleOwner)) {
            return null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) obj);
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final SportRecordViewModel getMSportRecordViewModel() {
        return this.mSportRecordViewModel;
    }

    @NotNull
    public List<DataType> w() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final SportChartDataViewModel getViewModel() {
        return this.viewModel;
    }

    @Nullable
    public View y(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iA = A();
        if (iA != 0) {
            return View.inflate(context, iA, null);
        }
        return null;
    }

    public void z(@NotNull ComposeView composeView) {
        Intrinsics.checkNotNullParameter(composeView, "<this>");
    }
}
