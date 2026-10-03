package com.heytap.sports.recommend.service;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.heytap.sports.recommend.bean.AnalyzeParam;
import com.heytap.sports.recommend.bean.AnalyzeResult;
import com.heytap.sports.recommend.bean.HealthStatus;
import com.heytap.sports.recommend.repo.SportRecordRepo;
import com.heytap.sports.recommend.util.RecommendUtil;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.xdf;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/sports/recommend/service/RecommendService;", "", "Lcom/heytap/sports/recommend/bean/HealthStatus;", "healthStatusData", "Lkotlin/Pair;", "Lcom/heytap/sports/recommend/bean/AnalyzeResult;", "", "a", "(Lcom/heytap/sports/recommend/bean/HealthStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/xdf;", "kotlin.jvm.PlatformType", "Lcom/oplus/aiunit/vision/xdf;", "mApi", "<init>", "()V", "recommend_release"}, k = 1, mv = {1, 8, 0})
public final class RecommendService {

    @NotNull
    public static final RecommendService INSTANCE = new RecommendService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final xdf mApi = (xdf) a.h(xdf.class);
    public static final int $stable = 8;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23, types: [T, com.heytap.sports.recommend.bean.AnalyzeResult, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final Object a(@NotNull HealthStatus healthStatus, @NotNull Continuation<? super Pair<AnalyzeResult, Integer>> continuation) {
        RecommendService$requestRecommendSportFromCloud$1 recommendService$requestRecommendSportFromCloud$1;
        Ref.ObjectRef objectRef;
        Throwable th;
        Ref.IntRef intRef;
        HealthStatus healthStatus2;
        Object objM5287constructorimpl;
        int I;
        if (continuation instanceof RecommendService$requestRecommendSportFromCloud$1) {
            recommendService$requestRecommendSportFromCloud$1 = (RecommendService$requestRecommendSportFromCloud$1) continuation;
            int i = recommendService$requestRecommendSportFromCloud$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recommendService$requestRecommendSportFromCloud$1.label = i - Integer.MIN_VALUE;
            } else {
                recommendService$requestRecommendSportFromCloud$1 = new RecommendService$requestRecommendSportFromCloud$1(this, continuation);
            }
        } else {
            recommendService$requestRecommendSportFromCloud$1 = new RecommendService$requestRecommendSportFromCloud$1(this, continuation);
        }
        Object obj = recommendService$requestRecommendSportFromCloud$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = recommendService$requestRecommendSportFromCloud$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AnalyzeResult analyzeResultC = RecommendUtil.INSTANCE.c();
            if (healthStatus.getUpdateTimestamp() != 0) {
                boolean z = false;
                if (analyzeResultC != null && healthStatus.getUpdateTimestamp() == analyzeResultC.getDeviceUpdateTime()) {
                    z = true;
                }
                if (z) {
                    a7b.f("RecommendService", "requestRecommendSportFromCloud() use lastAnalyzeData");
                    return TuplesKt.to(analyzeResultC, Boxing.boxInt(1));
                }
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = 6;
            try {
                Result.Companion companion = Result.INSTANCE;
                AnalyzeParam analyzeParamC = new SportRecordRepo().c(healthStatus);
                a7b.f("RecommendService", "analyzeParam: " + analyzeParamC);
                xdf xdfVar = mApi;
                recommendService$requestRecommendSportFromCloud$1.L$0 = healthStatus;
                recommendService$requestRecommendSportFromCloud$1.L$1 = objectRef2;
                recommendService$requestRecommendSportFromCloud$1.L$2 = intRef2;
                recommendService$requestRecommendSportFromCloud$1.label = 1;
                Object objB = xdfVar.b(analyzeParamC, recommendService$requestRecommendSportFromCloud$1);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                obj = objB;
                healthStatus2 = healthStatus;
                intRef = intRef2;
            } catch (Throwable th2) {
                objectRef = objectRef2;
                th = th2;
                intRef = intRef2;
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) recommendService$requestRecommendSportFromCloud$1.L$2;
            objectRef = (Ref.ObjectRef) recommendService$requestRecommendSportFromCloud$1.L$1;
            healthStatus2 = (HealthStatus) recommendService$requestRecommendSportFromCloud$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.isSuccess()) {
            ?? r8 = (AnalyzeResult) baseResponse.getBody();
            a7b.f("RecommendService", "data: " + ((Object) r8));
            if (r8 != 0) {
                if (healthStatus2.getUpdateTimestamp() > 0) {
                    I = healthStatus2.getUpdateTimestamp();
                } else {
                    LocalDateTime localDateTimeAtStartOfDay = o05.D(System.currentTimeMillis()).atStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "currentTimeMillis().toLocalDate().atStartOfDay()");
                    I = (int) o05.I(localDateTimeAtStartOfDay);
                }
                r8.setDeviceUpdateTime(I);
                r8.setRetTimestamp((int) (System.currentTimeMillis() / ((long) 1000)));
                RecommendUtil.INSTANCE.l(r8);
                objectRef.element = r8;
                intRef.element = 1;
            }
        } else if (baseResponse.getErrorCode() == 10000) {
            intRef.element = 4;
        } else {
            intRef.element = 6;
        }
        objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            a7b.b("RecommendService", "analyze error: " + thM5290exceptionOrNullimpl);
            intRef.element = thM5290exceptionOrNullimpl instanceof UnknownHostException ? true : thM5290exceptionOrNullimpl instanceof ConnectException ? true : thM5290exceptionOrNullimpl instanceof SocketTimeoutException ? true : thM5290exceptionOrNullimpl instanceof IOException ? 5 : 6;
        }
        return TuplesKt.to(objectRef.element, Boxing.boxInt(intRef.element));
    }
}
