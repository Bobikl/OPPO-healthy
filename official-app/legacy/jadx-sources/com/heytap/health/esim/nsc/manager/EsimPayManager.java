package com.heytap.health.esim.nsc.manager;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.nsc.dto.UserCombo;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.sae;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJR\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/esim/nsc/manager/EsimPayManager;", "Lcom/heytap/health/esim/nsc/manager/NSCTransaction;", "Landroid/content/Context;", "context", "", "comboThirdId", t04.DEVICE_UNIQUE_ID, "eid", "imei", "", "businessType", "Lkotlin/Result;", "", "f", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lcom/heytap/health/esim/nsc/dto/UserCombo;", "userCombo", "", "a", "(Landroid/content/Context;Lcom/heytap/health/esim/nsc/dto/UserCombo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BUY", "I", "CHANGE", "Lkotlin/Lazy;", b2n.g, "()Lcom/heytap/health/esim/nsc/manager/NSCTransaction;", "worker", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class EsimPayManager extends NSCTransaction {
    public static final int BUY = 0;
    public static final int CHANGE = 1;

    @NotNull
    public static final EsimPayManager INSTANCE = new EsimPayManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy worker = LazyKt__LazyJVMKt.lazy(new Function0<NSCTransaction>() { // from class: com.heytap.health.esim.nsc.manager.EsimPayManager$worker$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final NSCTransaction invoke() {
            return sae.k() ? new OppoNSCTransaction() : new H5NSCTransaction();
        }
    });
    public static final int $stable = 8;

    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object a(@NotNull Context context, @NotNull UserCombo userCombo, @NotNull Continuation<? super Unit> continuation) {
        Object objA = h().a(context, userCombo, continuation);
        return objA == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object d(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull Continuation<? super Result<Boolean>> continuation) {
        EsimPayManager$pay$1 esimPayManager$pay$1;
        if (continuation instanceof EsimPayManager$pay$1) {
            esimPayManager$pay$1 = (EsimPayManager$pay$1) continuation;
            int i2 = esimPayManager$pay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                esimPayManager$pay$1.label = i2 - Integer.MIN_VALUE;
            } else {
                esimPayManager$pay$1 = new EsimPayManager$pay$1(this, continuation);
            }
        } else {
            esimPayManager$pay$1 = new EsimPayManager$pay$1(this, continuation);
        }
        EsimPayManager$pay$1 esimPayManager$pay$2 = esimPayManager$pay$1;
        Object obj = esimPayManager$pay$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = esimPayManager$pay$2.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        NSCTransaction nSCTransactionH = h();
        esimPayManager$pay$2.label = 1;
        Object objD = nSCTransactionH.d(context, str, str2, str3, str4, i, esimPayManager$pay$2);
        return objD == coroutine_suspended ? coroutine_suspended : objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object f(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull Continuation<? super Result<Boolean>> continuation) {
        EsimPayManager$sign$1 esimPayManager$sign$1;
        if (continuation instanceof EsimPayManager$sign$1) {
            esimPayManager$sign$1 = (EsimPayManager$sign$1) continuation;
            int i2 = esimPayManager$sign$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                esimPayManager$sign$1.label = i2 - Integer.MIN_VALUE;
            } else {
                esimPayManager$sign$1 = new EsimPayManager$sign$1(this, continuation);
            }
        } else {
            esimPayManager$sign$1 = new EsimPayManager$sign$1(this, continuation);
        }
        EsimPayManager$sign$1 esimPayManager$sign$2 = esimPayManager$sign$1;
        Object obj = esimPayManager$sign$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = esimPayManager$sign$2.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        NSCTransaction nSCTransactionH = h();
        esimPayManager$sign$2.label = 1;
        Object objF = nSCTransactionH.f(context, str, str2, str3, str4, i, esimPayManager$sign$2);
        return objF == coroutine_suspended ? coroutine_suspended : objF;
    }

    public final NSCTransaction h() {
        return (NSCTransaction) worker.getValue();
    }
}
