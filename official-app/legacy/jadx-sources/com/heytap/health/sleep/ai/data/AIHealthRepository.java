package com.heytap.health.sleep.ai.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.network.core.a;
import com.oplus.aiunit.vision.j0;
import com.oplus.aiunit.vision.v9g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/sleep/ai/data/AIHealthRepository;", "", "Lcom/heytap/health/sleep/ai/data/QuestionsResponse;", "b", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/sleep/ai/data/QuestionsModuleResponse;", "c", "Lcom/oplus/aiunit/vision/j0;", "kotlin.jvm.PlatformType", "Lcom/oplus/aiunit/vision/j0;", "mRetrofit", "", "Ljava/lang/String;", "SP_NAME", "KEY_AI_HOME", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class AIHealthRepository {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final j0 mRetrofit = (j0) a.j(j0.class);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String SP_NAME = "ai_sp";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String KEY_AI_HOME = "key_ai_home";

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Continuation<? super QuestionsResponse> continuation) {
        AIHealthRepository$requestHome$1 aIHealthRepository$requestHome$1;
        Object objM5287constructorimpl;
        if (continuation instanceof AIHealthRepository$requestHome$1) {
            aIHealthRepository$requestHome$1 = (AIHealthRepository$requestHome$1) continuation;
            int i = aIHealthRepository$requestHome$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aIHealthRepository$requestHome$1.label = i - Integer.MIN_VALUE;
            } else {
                aIHealthRepository$requestHome$1 = new AIHealthRepository$requestHome$1(this, continuation);
            }
        } else {
            aIHealthRepository$requestHome$1 = new AIHealthRepository$requestHome$1(this, continuation);
        }
        Object objA = aIHealthRepository$requestHome$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aIHealthRepository$requestHome$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objA);
                Result.Companion companion = Result.INSTANCE;
                j0 j0Var = this.mRetrofit;
                aIHealthRepository$requestHome$1.L$0 = this;
                aIHealthRepository$requestHome$1.label = 1;
                objA = j0Var.a(aIHealthRepository$requestHome$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (AIHealthRepository) aIHealthRepository$requestHome$1.L$0;
                ResultKt.throwOnFailure(objA);
            }
            QuestionsResponse questionsResponse = (QuestionsResponse) ((Response) objA).getBody();
            if (questionsResponse != null) {
                v9g.x(this.SP_NAME).U(this.KEY_AI_HOME, GsonUtil.e(questionsResponse));
            }
            objM5287constructorimpl = Result.m5287constructorimpl(questionsResponse);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5294isSuccessimpl(objM5287constructorimpl)) {
            return (QuestionsResponse) objM5287constructorimpl;
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        return null;
    }

    @Nullable
    public final QuestionsResponse b() {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strD = v9g.x(this.SP_NAME).D(this.KEY_AI_HOME);
            if (!(strD == null || strD.length() == 0)) {
                return (QuestionsResponse) GsonUtil.a(strD, QuestionsResponse.class);
            }
            objM5287constructorimpl = Result.m5287constructorimpl(null);
            if (Result.m5294isSuccessimpl(objM5287constructorimpl)) {
                return (QuestionsResponse) ((Void) objM5287constructorimpl);
            }
            Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull Continuation<? super QuestionsModuleResponse> continuation) {
        AIHealthRepository$requestSleep$1 aIHealthRepository$requestSleep$1;
        Object objM5287constructorimpl;
        if (continuation instanceof AIHealthRepository$requestSleep$1) {
            aIHealthRepository$requestSleep$1 = (AIHealthRepository$requestSleep$1) continuation;
            int i = aIHealthRepository$requestSleep$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aIHealthRepository$requestSleep$1.label = i - Integer.MIN_VALUE;
            } else {
                aIHealthRepository$requestSleep$1 = new AIHealthRepository$requestSleep$1(this, continuation);
            }
        } else {
            aIHealthRepository$requestSleep$1 = new AIHealthRepository$requestSleep$1(this, continuation);
        }
        Object objB = aIHealthRepository$requestSleep$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aIHealthRepository$requestSleep$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objB);
                Result.Companion companion = Result.INSTANCE;
                Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("moduleType", HeytapHealthParams.SLEEP));
                j0 j0Var = this.mRetrofit;
                aIHealthRepository$requestSleep$1.label = 1;
                objB = j0Var.b(mapMapOf, aIHealthRepository$requestSleep$1);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objB);
            }
            objM5287constructorimpl = Result.m5287constructorimpl((QuestionsModuleResponse) ((Response) objB).getBody());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5294isSuccessimpl(objM5287constructorimpl)) {
            return (QuestionsModuleResponse) objM5287constructorimpl;
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        return null;
    }
}
