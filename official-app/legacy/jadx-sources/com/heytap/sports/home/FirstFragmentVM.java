package com.heytap.sports.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.CalendarState;
import com.oplus.aiunit.vision.c8l;
import com.oplus.smartenginehelper.entity.TextEntity;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/heytap/sports/home/FirstFragmentVM;", "Lcom/heytap/health/base/base/BaseViewModel;", "Ljava/time/LocalDate;", "start", TextEntity.ELLIPSIZE_END, "", c8l.KEY_B, "", "currentMonthActiveDates", "", "y", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/sports/home/MainSportRepo;", "j", "Lkotlin/Lazy;", "A", "()Lcom/heytap/sports/home/MainSportRepo;", "mainSportRepo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/oplus/aiunit/vision/er2;", MapSchema.FIELD_NAME_KEY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_calendarState", "Lkotlinx/coroutines/flow/StateFlow;", LogFieldKey.LEVEL_KEY, "Lkotlinx/coroutines/flow/StateFlow;", "z", "()Lkotlinx/coroutines/flow/StateFlow;", "calendarState", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFirstFragmentVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirstFragmentVM.kt\ncom/heytap/sports/home/FirstFragmentVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1855#2,2:134\n1855#2,2:136\n1855#2,2:138\n*S KotlinDebug\n*F\n+ 1 FirstFragmentVM.kt\ncom/heytap/sports/home/FirstFragmentVM\n*L\n81#1:134,2\n90#1:136,2\n114#1:138,2\n*E\n"})
public final class FirstFragmentVM extends BaseViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy mainSportRepo = LazyKt__LazyJVMKt.lazy(new Function0<MainSportRepo>() { // from class: com.heytap.sports.home.FirstFragmentVM$mainSportRepo$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MainSportRepo invoke() {
            return new MainSportRepo();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final MutableStateFlow<CalendarState> _calendarState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StateFlow<CalendarState> calendarState;

    public FirstFragmentVM() {
        MutableStateFlow<CalendarState> MutableStateFlow = StateFlowKt.MutableStateFlow(new CalendarState(0, 0, 0, false, null, null, null, false, null, null, null, null, null, null, 0, 32767, null));
        this._calendarState = MutableStateFlow;
        this.calendarState = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final MainSportRepo A() {
        return (MainSportRepo) this.mainSportRepo.getValue();
    }

    public final void B(@NotNull LocalDate start, @NotNull LocalDate end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new FirstFragmentVM$queryCalendarState$1(this, start, end, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x014f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0159  */
    /* JADX WARN: Code duplicated, block: B:49:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x018a  */
    /* JADX WARN: Code duplicated, block: B:54:0x019e A[LOOP:0: B:52:0x0198->B:54:0x019e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x018a -> B:51:0x0190). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01c2 -> B:57:0x01c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object y(java.util.Set<java.time.LocalDate> r19, p010kotlin.coroutines.Continuation<? super java.lang.Integer> r20) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.sports.home.FirstFragmentVM.y(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final StateFlow<CalendarState> z() {
        return this.calendarState;
    }
}
