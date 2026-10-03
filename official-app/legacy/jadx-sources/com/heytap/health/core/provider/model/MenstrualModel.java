package com.heytap.health.core.provider.model;

import com.heytap.health.menstrual.inter.MenstrualService;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/core/provider/model/MenstrualModel;", "", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "status", "", "d", "type", "value", MapSchema.FIELD_NAME_ENTRY, "c", "Lcom/heytap/health/menstrual/inter/MenstrualService;", "a", "Lcom/heytap/health/menstrual/inter/MenstrualService;", "menstrualService", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class MenstrualModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MenstrualService menstrualService;

    public MenstrualModel() {
        Object objNavigation = x0.d().b("/menstrual/MenstrualService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.menstrual.inter.MenstrualService");
        this.menstrualService = (MenstrualService) objNavigation;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull Continuation<? super String> continuation) throws Throwable {
        MenstrualModel$getMenstrualData$1 menstrualModel$getMenstrualData$1;
        if (continuation instanceof MenstrualModel$getMenstrualData$1) {
            menstrualModel$getMenstrualData$1 = (MenstrualModel$getMenstrualData$1) continuation;
            int i = menstrualModel$getMenstrualData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                menstrualModel$getMenstrualData$1.label = i - Integer.MIN_VALUE;
            } else {
                menstrualModel$getMenstrualData$1 = new MenstrualModel$getMenstrualData$1(this, continuation);
            }
        } else {
            menstrualModel$getMenstrualData$1 = new MenstrualModel$getMenstrualData$1(this, continuation);
        }
        Object objWithContext = menstrualModel$getMenstrualData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = menstrualModel$getMenstrualData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("Menstrual");
            MenstrualModel$getMenstrualData$2 menstrualModel$getMenstrualData$2 = new MenstrualModel$getMenstrualData$2(this, null);
            menstrualModel$getMenstrualData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, menstrualModel$getMenstrualData$2, menstrualModel$getMenstrualData$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "suspend fun getMenstrual…lt\")\n        result\n    }");
        return objWithContext;
    }

    public final void c() {
        this.menstrualService.v();
    }

    public final void d(int status) {
        MenstrualService menstrualService = this.menstrualService;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        menstrualService.q2(localDateNow);
    }

    public final void e(int type, int value) {
        this.menstrualService.n9(type, value);
    }
}
