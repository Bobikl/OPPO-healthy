package com.health.sleep_breath_rate.day.viewmodel;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.xch;
import com.oplus.aiunit.vision.ych;
import com.oplus.aiunit.vision.zch;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRCardViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "A", "Lcom/oplus/aiunit/vision/xch;", "y", "Lcom/oplus/aiunit/vision/zch;", "j", "Lcom/oplus/aiunit/vision/zch;", "repository", "Lcom/oplus/aiunit/vision/ych;", "k", "Lkotlin/Lazy;", "B", "()Lcom/oplus/aiunit/vision/ych;", "transform", "Lcom/heytap/health/base/livedata/OLiveData;", "l", "Lcom/heytap/health/base/livedata/OLiveData;", "z", "()Lcom/heytap/health/base/livedata/OLiveData;", "mObservableCardData", "<init>", "()V", "Companion", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRCardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRCardViewModel.kt\ncom/health/sleep_breath_rate/day/viewmodel/SleepBRCardViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,83:1\n48#2,4:84\n*S KotlinDebug\n*F\n+ 1 SleepBRCardViewModel.kt\ncom/health/sleep_breath_rate/day/viewmodel/SleepBRCardViewModel\n*L\n34#1:84,4\n*E\n"})
public final class SleepBRCardViewModel extends BaseViewModel {

    @NotNull
    public final zch j;

    @NotNull
    public final Lazy k = LazyKt.lazy(new Function0<ych>() { // from class: com.health.sleep_breath_rate.day.viewmodel.SleepBRCardViewModel$transform$2
        @NotNull
        public final ych invoke() {
            return new ych();
        }
    });

    @NotNull
    public final OLiveData<xch> l = new OLiveData<>();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SleepBRCardViewModel.kt\ncom/health/sleep_breath_rate/day/viewmodel/SleepBRCardViewModel\n*L\n1#1,110:1\n35#2,3:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ SleepBRCardViewModel i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, SleepBRCardViewModel sleepBRCardViewModel) {
            super(key);
            this.i = sleepBRCardViewModel;
        }

        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            m8b.f("SleepBRCardViewModel", "getSleepBRCardData error:" + exception.getMessage());
            this.i.z().postValue(this.i.y());
        }
    }

    public SleepBRCardViewModel() {
        String str = null;
        this.j = new zch(str, 1, str);
    }

    @SuppressLint({"CheckResult"})
    public final void A() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), new b(CoroutineExceptionHandler.Key, this), (CoroutineStart) null, new SleepBRCardViewModel$getSleepBRCardData$1(this, 1546272000000L, System.currentTimeMillis(), null), 2, (Object) null);
    }

    public final ych B() {
        return (ych) this.k.getValue();
    }

    public final xch y() {
        pr8 pr8Var = pr8.INSTANCE;
        long jC = pr8Var.c(System.currentTimeMillis());
        long jO = pr8Var.o(jC);
        long jN = pr8Var.n(jC);
        xch xchVar = new xch();
        xchVar.e(jC);
        xchVar.d(jO);
        xchVar.c(jN);
        xchVar.g(true);
        xchVar.a().add(new HealthCandleEntry(-1.0f, 0.0f, 0.0f));
        return xchVar;
    }

    @NotNull
    public final OLiveData<xch> z() {
        return this.l;
    }
}
