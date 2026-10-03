package com.health.health_seedlingcard.model;

import com.oplus.aiunit.vision.bui;
import com.oplus.aiunit.vision.cui;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.zr8;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/health/health_seedlingcard/model/StepSecondaryMode;", "", "", "upkVersionCode", "Lorg/json/JSONObject;", "f", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "jsonStr", "", "queryData", "e", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "a", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "mScope", "Lcom/oplus/aiunit/vision/bui;", "c", "Lkotlin/Lazy;", "()Lcom/oplus/aiunit/vision/bui;", "stepDataRepository", "Lcom/oplus/aiunit/vision/cui;", "d", "()Lcom/oplus/aiunit/vision/cui;", "stepDataTransform", "<init>", "()V", "Companion", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepSecondaryMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepSecondaryMode.kt\ncom/health/health_seedlingcard/model/StepSecondaryMode\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,81:1\n48#2,4:82\n*S KotlinDebug\n*F\n+ 1 StepSecondaryMode.kt\ncom/health/health_seedlingcard/model/StepSecondaryMode\n*L\n21#1:82,4\n*E\n"})
public final class StepSecondaryMode {

    @NotNull
    public final CoroutineExceptionHandler a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final Lazy c;

    @NotNull
    public final Lazy d;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 StepSecondaryMode.kt\ncom/health/health_seedlingcard/model/StepSecondaryMode\n*L\n1#1,110:1\n22#2,3:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            m8b.b("StepSecondaryMode", "catch exception: " + exception.getMessage());
            String strE = m8b.e(exception);
            StringBuilder sb = new StringBuilder();
            sb.append("catch exception: ");
            sb.append(strE);
        }
    }

    public StepSecondaryMode() {
        b bVar = new b(CoroutineExceptionHandler.Key);
        this.a = bVar;
        this.b = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(zr8.INSTANCE.c("StepMode")).plus(bVar));
        this.c = LazyKt.lazy(new Function0<bui>() { // from class: com.health.health_seedlingcard.model.StepSecondaryMode$stepDataRepository$2
            @NotNull
            public final bui invoke() {
                return new bui();
            }
        });
        this.d = LazyKt.lazy(new Function0<cui>() { // from class: com.health.health_seedlingcard.model.StepSecondaryMode$stepDataTransform$2
            @NotNull
            public final cui invoke() {
                return new cui();
            }
        });
    }

    public final bui c() {
        return (bui) this.c.getValue();
    }

    public final cui d() {
        return (cui) this.d.getValue();
    }

    public final void e(long upkVersionCode, @NotNull Function1<? super JSONObject, Unit> queryData) {
        Intrinsics.checkNotNullParameter(queryData, "queryData");
        BuildersKt.launch$default(this.b, zr8.INSTANCE.c("StepMode"), (CoroutineStart) null, new StepSecondaryMode$getStepSecondaryData$1(queryData, this, upkVersionCode, null), 2, (Object) null);
    }

    @NotNull
    public final JSONObject f(long upkVersionCode) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("todaystepstotalSteps", "--");
        jSONObject.put("todaystepspercent", 0);
        if (upkVersionCode >= 1000004) {
            jSONObject.put("url", "assets/images/step.svg");
        }
        return jSONObject;
    }
}
