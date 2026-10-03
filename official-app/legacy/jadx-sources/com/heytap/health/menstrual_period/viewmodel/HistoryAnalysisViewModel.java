package com.heytap.health.menstrual_period.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.menstrual.data.PeriodCloseStatus;
import com.heytap.health.menstrual_period.data.SymptomType;
import com.heytap.health.menstrual_period.datahandler.CycleDataHandler;
import com.heytap.health.menstrual_period.viewhelper.CycleSettingHelper;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.Cycle;
import com.oplus.aiunit.vision.Period;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Triple;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\bZ\u0010[J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005JF\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005\u0018\u00010\n2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\f2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fJ\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J;\u0010\u001a\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0018j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005`\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050/8\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103R \u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00101R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00101R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020<0?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020<0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00101R\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020<0?8\u0006¢\u0006\f\n\u0004\bG\u0010A\u001a\u0004\bH\u0010CR,\u0010L\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050J0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00101RB\u0010O\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0M0\u0018j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0M`\u00190/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00101RE\u0010R\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0M0\u0018j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0M`\u00190?8\u0006¢\u0006\f\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010CR2\u0010V\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020<0S0\u00050/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u00101R5\u0010Y\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020<0S0\u00050?8\u0006¢\u0006\f\n\u0004\bW\u0010A\u001a\u0004\bX\u0010C\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lcom/heytap/health/menstrual_period/viewmodel/HistoryAnalysisViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "startTime", "endTime", "", "Lcom/oplus/aiunit/vision/ii4;", "cycleList", "", "D", "", "Ljava/time/LocalDate;", "Lcom/heytap/health/menstrual_period/data/SymptomType;", "symptomMap", UserInfo.SEX_FEMALE, "date", "type", "", "Q", "symptomType", SecureGcmConstants.MESSAGE_KEY, "S", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "G", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "R", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "j", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "Lcom/heytap/health/menstrual_period/viewmodel/CycleRepository;", MapSchema.FIELD_NAME_KEY, "Lkotlin/Lazy;", "L", "()Lcom/heytap/health/menstrual_period/viewmodel/CycleRepository;", "cycleRepository", "Lcom/heytap/health/menstrual_period/viewmodel/SymptomRepository;", LogFieldKey.LEVEL_KEY, "O", "()Lcom/heytap/health/menstrual_period/viewmodel/SymptomRepository;", "symptomRepository", "Lcom/heytap/health/menstrual_period/datahandler/CycleDataHandler;", LogFieldKey.MESSAGE_KEY, "K", "()Lcom/heytap/health/menstrual_period/datahandler/CycleDataHandler;", "cycleDataHandler", "Landroidx/lifecycle/MutableLiveData;", "n", "Landroidx/lifecycle/MutableLiveData;", "H", "()Landroidx/lifecycle/MutableLiveData;", "allCycles", "o", "_historyCyclesWithCurrent", LogFieldKey.PROCESS_NAME_KEY, "M", "historyCyclesWithCurrent", "q", "historyCycles", "", "r", "_avgPeriodDays", "Landroidx/lifecycle/LiveData;", "s", "Landroidx/lifecycle/LiveData;", "J", "()Landroidx/lifecycle/LiveData;", "avgPeriodDays", "t", "_avgCycleDays", "u", "I", "avgCycleDays", "", "v", "allSymptomLiveData", "", "w", "_symptomDateList", "x", "getSymptomDateList", "symptomDateList", "Lkotlin/Triple;", "Lcom/heytap/health/menstrual_period/data/SymptomType$SymptomValueBase;", "y", "_symptomNumList", "z", "N", "symptomNumList", "<init>", "()V", "Companion", "a", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHistoryAnalysisViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryAnalysisViewModel.kt\ncom/heytap/health/menstrual_period/viewmodel/HistoryAnalysisViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n48#2,4:247\n766#3:251\n857#3:252\n1726#3,3:253\n858#3:256\n1045#3:257\n766#3:258\n857#3:259\n1747#3,3:260\n858#3:263\n1045#3:264\n*S KotlinDebug\n*F\n+ 1 HistoryAnalysisViewModel.kt\ncom/heytap/health/menstrual_period/viewmodel/HistoryAnalysisViewModel\n*L\n29#1:247,4\n84#1:251\n84#1:252\n84#1:253,3\n84#1:256\n85#1:257\n95#1:258\n95#1:259\n95#1:260,3\n95#1:263\n96#1:264\n*E\n"})
public final class HistoryAnalysisViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineExceptionHandler exceptionHandler = new c(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy cycleRepository = LazyKt__LazyJVMKt.lazy(new Function0<CycleRepository>() { // from class: com.heytap.health.menstrual_period.viewmodel.HistoryAnalysisViewModel$cycleRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CycleRepository invoke() {
            return new CycleRepository();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy symptomRepository = LazyKt__LazyJVMKt.lazy(new Function0<SymptomRepository>() { // from class: com.heytap.health.menstrual_period.viewmodel.HistoryAnalysisViewModel$symptomRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SymptomRepository invoke() {
            return new SymptomRepository();
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy cycleDataHandler = LazyKt__LazyJVMKt.lazy(new Function0<CycleDataHandler>() { // from class: com.heytap.health.menstrual_period.viewmodel.HistoryAnalysisViewModel$cycleDataHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CycleDataHandler invoke() {
            return new CycleDataHandler();
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<Cycle>> allCycles = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<Cycle>> _historyCyclesWithCurrent;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<Cycle>> historyCyclesWithCurrent;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<Cycle>> historyCycles;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Integer> _avgPeriodDays;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final LiveData<Integer> avgPeriodDays;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Integer> _avgCycleDays;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final LiveData<Integer> avgCycleDays;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Map<LocalDate, List<SymptomType>>> allSymptomLiveData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<HashMap<LocalDate, List<SymptomType>>> _symptomDateList;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final LiveData<HashMap<LocalDate, List<SymptomType>>> symptomDateList;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<Triple<SymptomType, SymptomType.SymptomValueBase, Integer>>> _symptomNumList;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final LiveData<List<Triple<SymptomType, SymptomType.SymptomValueBase, Integer>>> symptomNumList;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HistoryAnalysisViewModel.kt\ncom/heytap/health/menstrual_period/viewmodel/HistoryAnalysisViewModel\n*L\n1#1,328:1\n85#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Cycle) t).getStartDate()), Long.valueOf(((Cycle) t2).getStartDate()));
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 HistoryAnalysisViewModel.kt\ncom/heytap/health/menstrual_period/viewmodel/HistoryAnalysisViewModel\n*L\n1#1,110:1\n30#2,2:111\n*E\n"})
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            a7b.c("HistoryAnalysisViewMode", "error!", exception);
        }
    }

    public HistoryAnalysisViewModel() {
        MutableLiveData<List<Cycle>> mutableLiveData = new MutableLiveData<>();
        this._historyCyclesWithCurrent = mutableLiveData;
        this.historyCyclesWithCurrent = mutableLiveData;
        this.historyCycles = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this._avgPeriodDays = mutableLiveData2;
        this.avgPeriodDays = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this._avgCycleDays = mutableLiveData3;
        this.avgCycleDays = mutableLiveData3;
        this.allSymptomLiveData = new MutableLiveData<>();
        MutableLiveData<HashMap<LocalDate, List<SymptomType>>> mutableLiveData4 = new MutableLiveData<>();
        this._symptomDateList = mutableLiveData4;
        this.symptomDateList = mutableLiveData4;
        MutableLiveData<List<Triple<SymptomType, SymptomType.SymptomValueBase, Integer>>> mutableLiveData5 = new MutableLiveData<>();
        this._symptomNumList = mutableLiveData5;
        this.symptomNumList = mutableLiveData5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void E(HistoryAnalysisViewModel historyAnalysisViewModel, long j2, long j3, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        historyAnalysisViewModel.D(j2, j3, list);
    }

    public final void D(long startTime, long endTime, @Nullable List<Cycle> cycleList) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e().plus(this.exceptionHandler), null, new HistoryAnalysisViewModel$fetchCycleData$1(cycleList, this, startTime, endTime, null), 2, null);
    }

    public final void F(long startTime, long endTime, @Nullable Map<LocalDate, List<SymptomType>> symptomMap, @Nullable List<Cycle> cycleList) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e().plus(this.exceptionHandler), null, new HistoryAnalysisViewModel$fetchSymptomNumData$1(symptomMap, this, startTime, endTime, cycleList, null), 2, null);
    }

    public final List<Cycle> G(List<Cycle> cycleList) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cycleList) {
            Cycle cycle = (Cycle) obj;
            boolean z2 = false;
            if (cycle.getStartDate() < jCurrentTimeMillis && cycle.getEndDate() < jCurrentTimeMillis) {
                List<Period> listE = cycle.e();
                if (!(listE instanceof Collection) || !listE.isEmpty()) {
                    Iterator<T> it = listE.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        if (!(((Period) it.next()).getCloseStatus() != PeriodCloseStatus.PREDICT)) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        List<Cycle> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new b());
        this.historyCycles.postValue(listSortedWith);
        return listSortedWith;
    }

    @NotNull
    public final MutableLiveData<List<Cycle>> H() {
        return this.allCycles;
    }

    @NotNull
    public final LiveData<Integer> I() {
        return this.avgCycleDays;
    }

    @NotNull
    public final LiveData<Integer> J() {
        return this.avgPeriodDays;
    }

    public final CycleDataHandler K() {
        return (CycleDataHandler) this.cycleDataHandler.getValue();
    }

    public final CycleRepository L() {
        return (CycleRepository) this.cycleRepository.getValue();
    }

    @NotNull
    public final MutableLiveData<List<Cycle>> M() {
        return this.historyCyclesWithCurrent;
    }

    @NotNull
    public final LiveData<List<Triple<SymptomType, SymptomType.SymptomValueBase, Integer>>> N() {
        return this.symptomNumList;
    }

    public final SymptomRepository O() {
        return (SymptomRepository) this.symptomRepository.getValue();
    }

    public final boolean P(@NotNull SymptomType symptomType) {
        Intrinsics.checkNotNullParameter(symptomType, "symptomType");
        return (symptomType.getTypeValue() == SymptomType.Type.Sexual || symptomType.getTypeValue() == SymptomType.Type.SecretionForm || symptomType.getTypeValue() == SymptomType.Type.OvulationTest) ? false : true;
    }

    public final boolean Q(@NotNull LocalDate date, @NotNull SymptomType type, @Nullable List<Cycle> cycleList) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.getTypeValue() != SymptomType.Type.Flow && type.getTypeValue() != SymptomType.Type.Dysmenorrhea) {
            return true;
        }
        List<Cycle> list = cycleList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        long jH = o05.H(date);
        boolean z = false;
        for (Cycle cycle : cycleList) {
            if (jH <= cycle.getEndDate() && cycle.getStartDate() <= jH) {
                for (Period period : cycle.e()) {
                    if (jH <= period.getEndDate() && period.getStartDate() <= jH) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(Continuation<? super HashMap<LocalDate, List<SymptomType>>> continuation) {
        HistoryAnalysisViewModel$query12MonthSymptom$1 historyAnalysisViewModel$query12MonthSymptom$1;
        if (continuation instanceof HistoryAnalysisViewModel$query12MonthSymptom$1) {
            historyAnalysisViewModel$query12MonthSymptom$1 = (HistoryAnalysisViewModel$query12MonthSymptom$1) continuation;
            int i = historyAnalysisViewModel$query12MonthSymptom$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                historyAnalysisViewModel$query12MonthSymptom$1.label = i - Integer.MIN_VALUE;
            } else {
                historyAnalysisViewModel$query12MonthSymptom$1 = new HistoryAnalysisViewModel$query12MonthSymptom$1(this, continuation);
            }
        } else {
            historyAnalysisViewModel$query12MonthSymptom$1 = new HistoryAnalysisViewModel$query12MonthSymptom$1(this, continuation);
        }
        HistoryAnalysisViewModel$query12MonthSymptom$1 historyAnalysisViewModel$query12MonthSymptom$2 = historyAnalysisViewModel$query12MonthSymptom$1;
        Object objK = historyAnalysisViewModel$query12MonthSymptom$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = historyAnalysisViewModel$query12MonthSymptom$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objK);
            LocalDate localDateMinusMonths = LocalDate.now().minusMonths(12L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "now().minusMonths(12)");
            long jX = o05.x(o05.y(localDateMinusMonths));
            long jCurrentTimeMillis = System.currentTimeMillis();
            SymptomRepository symptomRepositoryO = O();
            historyAnalysisViewModel$query12MonthSymptom$2.L$0 = this;
            historyAnalysisViewModel$query12MonthSymptom$2.label = 1;
            objK = symptomRepositoryO.k(jX, jCurrentTimeMillis, historyAnalysisViewModel$query12MonthSymptom$2);
            if (objK == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (HistoryAnalysisViewModel) historyAnalysisViewModel$query12MonthSymptom$2.L$0;
            ResultKt.throwOnFailure(objK);
        }
        HashMap map = (HashMap) objK;
        this.allSymptomLiveData.postValue(map);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(Continuation<? super List<Cycle>> continuation) {
        HistoryAnalysisViewModel$queryAllCycleData$1 historyAnalysisViewModel$queryAllCycleData$1;
        if (continuation instanceof HistoryAnalysisViewModel$queryAllCycleData$1) {
            historyAnalysisViewModel$queryAllCycleData$1 = (HistoryAnalysisViewModel$queryAllCycleData$1) continuation;
            int i = historyAnalysisViewModel$queryAllCycleData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                historyAnalysisViewModel$queryAllCycleData$1.label = i - Integer.MIN_VALUE;
            } else {
                historyAnalysisViewModel$queryAllCycleData$1 = new HistoryAnalysisViewModel$queryAllCycleData$1(this, continuation);
            }
        } else {
            historyAnalysisViewModel$queryAllCycleData$1 = new HistoryAnalysisViewModel$queryAllCycleData$1(this, continuation);
        }
        Object objX = historyAnalysisViewModel$queryAllCycleData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = historyAnalysisViewModel$queryAllCycleData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objX);
            CycleSettingHelper.Companion companion = CycleSettingHelper.INSTANCE;
            int iN = companion.n();
            int iO = companion.o();
            CycleRepository cycleRepositoryL = L();
            historyAnalysisViewModel$queryAllCycleData$1.L$0 = this;
            historyAnalysisViewModel$queryAllCycleData$1.label = 1;
            objX = cycleRepositoryL.x(iN, iO, historyAnalysisViewModel$queryAllCycleData$1);
            if (objX == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (HistoryAnalysisViewModel) historyAnalysisViewModel$queryAllCycleData$1.L$0;
            ResultKt.throwOnFailure(objX);
        }
        List<Cycle> list = (List) objX;
        List<Cycle> listZ = this.K().z(list);
        List<Cycle> listT = this.K().T(list);
        this.allCycles.postValue(listT);
        this._historyCyclesWithCurrent.postValue(listT);
        return listZ;
    }
}
