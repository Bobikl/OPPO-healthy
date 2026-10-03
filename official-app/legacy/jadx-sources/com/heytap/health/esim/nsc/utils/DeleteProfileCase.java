package com.heytap.health.esim.nsc.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.nsc.dto.EsimProfileState;
import com.heytap.health.esim.nsc.dto.NetWorkServiceNetSource;
import com.heytap.health.esim.nsc.repo.DeviceRepo;
import com.heytap.health.esim.nsc.repo.RedteaSp;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.helper.NetDataErrorException;
import com.oplus.aiunit.vision.dkf;
import com.oplus.aiunit.vision.ekf;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.mtj;
import com.oplus.aiunit.vision.ol4;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0086Bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/esim/nsc/utils/DeleteProfileCase;", "", "Lcom/heytap/health/esim/nsc/dto/EsimProfileState;", "state", "", MapSchema.FIELD_NAME_ENTRY, "", "mac", "iccid", "Lkotlin/Function0;", "apiCancellation", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DeleteProfileCase {
    public static final int $stable = 8;
    public final /* synthetic */ RedteaSp a = new RedteaSp();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object d(DeleteProfileCase deleteProfileCase, String str, String str2, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return deleteProfileCase.c(str, str2, function0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Continuation<? super Unit> continuation) {
        DeleteProfileCase$delProfileToRedtea$1 deleteProfileCase$delProfileToRedtea$1;
        if (continuation instanceof DeleteProfileCase$delProfileToRedtea$1) {
            deleteProfileCase$delProfileToRedtea$1 = (DeleteProfileCase$delProfileToRedtea$1) continuation;
            int i = deleteProfileCase$delProfileToRedtea$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteProfileCase$delProfileToRedtea$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteProfileCase$delProfileToRedtea$1 = new DeleteProfileCase$delProfileToRedtea$1(this, continuation);
            }
        } else {
            deleteProfileCase$delProfileToRedtea$1 = new DeleteProfileCase$delProfileToRedtea$1(this, continuation);
        }
        Object objC = deleteProfileCase$delProfileToRedtea$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = deleteProfileCase$delProfileToRedtea$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            NetWorkServiceNetSource netWorkServiceNetSource = NetWorkServiceNetSource.INSTANCE;
            deleteProfileCase$delProfileToRedtea$1.L$0 = this;
            deleteProfileCase$delProfileToRedtea$1.L$1 = str;
            deleteProfileCase$delProfileToRedtea$1.label = 1;
            objC = netWorkServiceNetSource.c(str, deleteProfileCase$delProfileToRedtea$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) deleteProfileCase$delProfileToRedtea$1.L$1;
            this = (DeleteProfileCase) deleteProfileCase$delProfileToRedtea$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        NetResult netResult = (NetResult) objC;
        if (netResult.isSucceed()) {
            this.e(EsimProfileState.None);
            ekf.a(str);
            return Unit.INSTANCE;
        }
        dkf.INSTANCE.a("cancellation error " + netResult.message);
        int i3 = netResult.errorCode;
        String str2 = netResult.message;
        Intrinsics.checkNotNullExpressionValue(str2, "postDelEsim.message");
        throw new NetDataErrorException(i3, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull String str, @Nullable String str2, @Nullable Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        DeleteProfileCase$invoke$1 deleteProfileCase$invoke$1;
        if (continuation instanceof DeleteProfileCase$invoke$1) {
            deleteProfileCase$invoke$1 = (DeleteProfileCase$invoke$1) continuation;
            int i = deleteProfileCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteProfileCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteProfileCase$invoke$1 = new DeleteProfileCase$invoke$1(this, continuation);
            }
        } else {
            deleteProfileCase$invoke$1 = new DeleteProfileCase$invoke$1(this, continuation);
        }
        Object obj = deleteProfileCase$invoke$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = deleteProfileCase$invoke$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    function0 = (Function0) deleteProfileCase$invoke$1.L$2;
                    str2 = (String) deleteProfileCase$invoke$1.L$1;
                    str = (String) deleteProfileCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            deleteProfileCase$invoke$1.L$0 = str;
            deleteProfileCase$invoke$1.L$1 = str2;
            deleteProfileCase$invoke$1.L$2 = function0;
            deleteProfileCase$invoke$1.label = 1;
            if (b(str, deleteProfileCase$invoke$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (function0 != null) {
                function0.invoke();
            }
            ol4 ol4Var = gl4.managerApi;
            if (!Intrinsics.areEqual(ol4Var.getCurrentConnectId(), str)) {
                dkf.INSTANCE.a("DeleteProfileCase -> delete profile , device not connected");
                return Unit.INSTANCE;
            }
            if (ol4Var.isStubModule()) {
                dkf.INSTANCE.a("DeleteProfileCase -> delete profile , device is in stubmode");
                return Unit.INSTANCE;
            }
            if (!mtj.b(str2)) {
                dkf.INSTANCE.a("DeleteProfileCase -> delete profile , device connected send delete profile cmd");
                DeviceRepo deviceRepo = new DeviceRepo();
                Intrinsics.checkNotNull(str2);
                deleteProfileCase$invoke$1.L$0 = null;
                deleteProfileCase$invoke$1.L$1 = null;
                deleteProfileCase$invoke$1.L$2 = null;
                deleteProfileCase$invoke$1.label = 2;
                if (deviceRepo.b(str, str2, deleteProfileCase$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        } catch (Exception e2) {
            dkf.INSTANCE.a("DeleteProfileCase -> delete profile , device connected send delete profile cmd, error -> " + e2.getMessage());
        }
    }

    public void e(@NotNull EsimProfileState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a.s(state);
    }
}
