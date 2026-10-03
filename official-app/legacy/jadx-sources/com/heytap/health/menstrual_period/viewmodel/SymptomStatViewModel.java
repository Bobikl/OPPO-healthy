package com.heytap.health.menstrual_period.viewmodel;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.switchManager.SwitchBean;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.menstrual_period.data.SymptomConfigListData;
import com.heytap.health.menstrual_period.data.SymptomType;
import com.heytap.health.menstrual_period.datahandler.CycleDataHandler;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.hub;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.p6j;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.u61;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b@\u0010AJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J;\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fj\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e`\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R,\u0010.\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0,0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010$R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010$R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020/0&8\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010*R2\u00107\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f050,0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010$R5\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f050,0&8\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010*R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010$R#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0&8\u0006¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b>\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/heytap/health/menstrual_period/viewmodel/SymptomStatViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "L", "", "startTime", "endTime", "Lcom/heytap/health/menstrual_period/data/SymptomType$SymptomValueBase;", "valueBase", ExifInterface.LONGITUDE_EAST, "D", "C", "Ljava/util/HashMap;", "Ljava/time/LocalDate;", "", "Lcom/heytap/health/menstrual_period/data/SymptomType;", "Lkotlin/collections/HashMap;", "K", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "j", "Ljava/lang/String;", "TAG", "Lkotlinx/coroutines/CoroutineExceptionHandler;", MapSchema.FIELD_NAME_KEY, "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "Lcom/heytap/health/menstrual_period/viewmodel/SymptomRepository;", LogFieldKey.LEVEL_KEY, "Lkotlin/Lazy;", "I", "()Lcom/heytap/health/menstrual_period/viewmodel/SymptomRepository;", "symptomRepository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/health/menstrual_period/data/SymptomConfigListData;", LogFieldKey.MESSAGE_KEY, "Landroidx/lifecycle/MutableLiveData;", "_symptomsLiveData", "Landroidx/lifecycle/LiveData;", "n", "Landroidx/lifecycle/LiveData;", "J", "()Landroidx/lifecycle/LiveData;", "symptomsLiveData", "", "o", "allSymptomLiveData", "", LogFieldKey.PROCESS_NAME_KEY, "_symptomNum", "q", "H", "symptomNum", "Lkotlin/Pair;", "r", "_relatedSymptomValueBases", "s", UserInfo.SEX_FEMALE, "relatedSymptomValueBases", "t", "_symptomDate", "u", "G", "symptomDate", "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSymptomStatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymptomStatViewModel.kt\ncom/heytap/health/menstrual_period/viewmodel/SymptomStatViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,177:1\n48#2,4:178\n*S KotlinDebug\n*F\n+ 1 SymptomStatViewModel.kt\ncom/heytap/health/menstrual_period/viewmodel/SymptomStatViewModel\n*L\n30#1:178,4\n*E\n"})
public final class SymptomStatViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG = "SymptomStatViewModel";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final CoroutineExceptionHandler exceptionHandler = new b(CoroutineExceptionHandler.INSTANCE, this);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy symptomRepository = LazyKt__LazyJVMKt.lazy(new Function0<SymptomRepository>() { // from class: com.heytap.health.menstrual_period.viewmodel.SymptomStatViewModel$symptomRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SymptomRepository invoke() {
            return new SymptomRepository();
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<SymptomConfigListData> _symptomsLiveData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LiveData<SymptomConfigListData> symptomsLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Map<LocalDate, List<SymptomType>>> allSymptomLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Integer> _symptomNum;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final LiveData<Integer> symptomNum;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Map<SymptomType.SymptomValueBase, Pair<Integer, SymptomType>>> _relatedSymptomValueBases;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final LiveData<Map<SymptomType.SymptomValueBase, Pair<Integer, SymptomType>>> relatedSymptomValueBases;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<LocalDate>> _symptomDate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final LiveData<List<LocalDate>> symptomDate;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/menstrual_period/viewmodel/SymptomStatViewModel$a", "Lcom/oplus/aiunit/vision/u61;", "Lcom/heytap/health/base/switchManager/SwitchBean;", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "", "errMsg", "b", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends u61<SwitchBean> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@Nullable Throwable e2, @Nullable String errMsg) {
            a7b.c(SymptomStatViewModel.this.TAG, "querySymptoms failed: errMsg=" + errMsg, e2);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable SwitchBean result) {
            SymptomConfigListData symptomConfigListData;
            if (result == null || (symptomConfigListData = (SymptomConfigListData) GsonUtil.a(result.getConfig(), SymptomConfigListData.class)) == null) {
                return;
            }
            hub.l(result.getConfig());
            hub.n(System.currentTimeMillis());
            SymptomStatViewModel.this._symptomsLiveData.postValue(symptomConfigListData);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SymptomStatViewModel.kt\ncom/heytap/health/menstrual_period/viewmodel/SymptomStatViewModel\n*L\n1#1,110:1\n31#2,2:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ SymptomStatViewModel i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Companion companion, SymptomStatViewModel symptomStatViewModel) {
            super(companion);
            this.i = symptomStatViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            a7b.c(this.i.TAG, "error!", exception);
        }
    }

    public SymptomStatViewModel() {
        MutableLiveData<SymptomConfigListData> mutableLiveData = new MutableLiveData<>();
        this._symptomsLiveData = mutableLiveData;
        this.symptomsLiveData = mutableLiveData;
        this.allSymptomLiveData = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this._symptomNum = mutableLiveData2;
        this.symptomNum = mutableLiveData2;
        MutableLiveData<Map<SymptomType.SymptomValueBase, Pair<Integer, SymptomType>>> mutableLiveData3 = new MutableLiveData<>();
        this._relatedSymptomValueBases = mutableLiveData3;
        this.relatedSymptomValueBases = mutableLiveData3;
        MutableLiveData<List<LocalDate>> mutableLiveData4 = new MutableLiveData<>();
        this._symptomDate = mutableLiveData4;
        this.symptomDate = mutableLiveData4;
    }

    public final void C(long startTime, long endTime, @NotNull SymptomType.SymptomValueBase valueBase) {
        Intrinsics.checkNotNullParameter(valueBase, "valueBase");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e().plus(this.exceptionHandler), null, new SymptomStatViewModel$fetchRelatedSymptom$1(this, startTime, endTime, valueBase, null), 2, null);
    }

    public final void D(@NotNull SymptomType.SymptomValueBase valueBase) {
        Intrinsics.checkNotNullParameter(valueBase, "valueBase");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e().plus(this.exceptionHandler), null, new SymptomStatViewModel$fetchSymptomDateList$1(this, valueBase, null), 2, null);
    }

    public final void E(long startTime, long endTime, @NotNull SymptomType.SymptomValueBase valueBase) {
        Intrinsics.checkNotNullParameter(valueBase, "valueBase");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e().plus(this.exceptionHandler), null, new SymptomStatViewModel$fetchSymptomValueBaseNum$1(this, valueBase, startTime, endTime, null), 2, null);
    }

    @NotNull
    public final LiveData<Map<SymptomType.SymptomValueBase, Pair<Integer, SymptomType>>> F() {
        return this.relatedSymptomValueBases;
    }

    @NotNull
    public final LiveData<List<LocalDate>> G() {
        return this.symptomDate;
    }

    @NotNull
    public final LiveData<Integer> H() {
        return this.symptomNum;
    }

    public final SymptomRepository I() {
        return (SymptomRepository) this.symptomRepository.getValue();
    }

    @NotNull
    public final LiveData<SymptomConfigListData> J() {
        return this.symptomsLiveData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K(Continuation<? super HashMap<LocalDate, List<SymptomType>>> continuation) {
        SymptomStatViewModel$queryAllSymptom$1 symptomStatViewModel$queryAllSymptom$1;
        if (continuation instanceof SymptomStatViewModel$queryAllSymptom$1) {
            symptomStatViewModel$queryAllSymptom$1 = (SymptomStatViewModel$queryAllSymptom$1) continuation;
            int i = symptomStatViewModel$queryAllSymptom$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                symptomStatViewModel$queryAllSymptom$1.label = i - Integer.MIN_VALUE;
            } else {
                symptomStatViewModel$queryAllSymptom$1 = new SymptomStatViewModel$queryAllSymptom$1(this, continuation);
            }
        } else {
            symptomStatViewModel$queryAllSymptom$1 = new SymptomStatViewModel$queryAllSymptom$1(this, continuation);
        }
        SymptomStatViewModel$queryAllSymptom$1 symptomStatViewModel$queryAllSymptom$2 = symptomStatViewModel$queryAllSymptom$1;
        Object objK = symptomStatViewModel$queryAllSymptom$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = symptomStatViewModel$queryAllSymptom$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objK);
            LocalDate localDateA = CycleDataHandler.INSTANCE.a();
            Intrinsics.checkNotNullExpressionValue(localDateA, "CycleDataHandler.EARLIEST_DAY");
            long jH = o05.H(localDateA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            SymptomRepository symptomRepositoryI = I();
            symptomStatViewModel$queryAllSymptom$2.L$0 = this;
            symptomStatViewModel$queryAllSymptom$2.label = 1;
            objK = symptomRepositoryI.k(jH, jCurrentTimeMillis, symptomStatViewModel$queryAllSymptom$2);
            if (objK == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (SymptomStatViewModel) symptomStatViewModel$queryAllSymptom$2.L$0;
            ResultKt.throwOnFailure(objK);
        }
        HashMap map = (HashMap) objK;
        this.allSymptomLiveData.postValue(map);
        return map;
    }

    public final void L() {
        String strD = hub.d();
        if (!TextUtils.isEmpty(strD)) {
            SymptomConfigListData symptomConfigListData = (SymptomConfigListData) GsonUtil.a(strD, SymptomConfigListData.class);
            if (System.currentTimeMillis() - hub.g() < 10800) {
                this._symptomsLiveData.postValue(symptomConfigListData);
                return;
            }
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("switchType", 62);
        ((p6j) com.heytap.health.network.core.a.j(p6j.class)).f(map).L0(su8.c()).subscribe(new a());
    }
}
